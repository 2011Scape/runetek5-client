import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class CursorTypeList {

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable142 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "Lclient!dla;")
	public final SoftLruHashTable aSoftLruHashTable143 = new SoftLruHashTable(2);

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "Lclient!sb;")
	public final Js5 aJs588;

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "Lclient!sb;")
	private final Js5 aJs589;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public CursorTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aJs588 = arg3;
		this.aJs589 = arg2;
		this.aJs589.getGroupCapacity(33);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)V")
	public void method5970() {
		@Pc(11) SoftLruHashTable local11 = this.aSoftLruHashTable142;
		synchronized (this.aSoftLruHashTable142) {
			this.aSoftLruHashTable142.clean(5);
		}
		local11 = this.aSoftLruHashTable143;
		synchronized (this.aSoftLruHashTable143) {
			this.aSoftLruHashTable143.clean(5);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
	public void method5972() {
		@Pc(9) SoftLruHashTable local9 = this.aSoftLruHashTable142;
		synchronized (this.aSoftLruHashTable142) {
			this.aSoftLruHashTable142.removeSoft();
		}
		local9 = this.aSoftLruHashTable143;
		synchronized (this.aSoftLruHashTable143) {
			this.aSoftLruHashTable143.removeSoft();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)Lclient!vla;")
	public CursorType method5973(@OriginalArg(1) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable142;
		@Pc(18) CursorType local18;
		synchronized (this.aSoftLruHashTable142) {
			local18 = (CursorType) this.aSoftLruHashTable142.get((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Js5 local32 = this.aJs589;
		@Pc(41) byte[] local41;
		synchronized (this.aJs589) {
			local41 = this.aJs589.fetchFile(33, arg0);
		}
		local18 = new CursorType();
		local18.aCursorTypeList2 = this;
		if (local41 != null) {
			local18.method8935(new Packet(local41));
		}
		@Pc(70) SoftLruHashTable local70 = this.aSoftLruHashTable142;
		synchronized (this.aSoftLruHashTable142) {
			this.aSoftLruHashTable142.put((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)V")
	public void method5974() {
		@Pc(7) SoftLruHashTable local7 = this.aSoftLruHashTable142;
		synchronized (this.aSoftLruHashTable142) {
			this.aSoftLruHashTable142.clear();
		}
		local7 = this.aSoftLruHashTable143;
		synchronized (this.aSoftLruHashTable143) {
			this.aSoftLruHashTable143.clear();
		}
	}
}
