import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class StructTypeList {

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable114 = new SoftLruHashTable(256);

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "Lclient!sb;")
	private final Js5 aJs570;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public StructTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs570 = arg2;
		this.aJs570.getGroupCapacity(26);
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(Z)V")
	public void method5035() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable114;
		synchronized (this.aSoftLruHashTable114) {
			this.aSoftLruHashTable114.clear();
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(II)V")
	public void method5037() {
		@Pc(10) SoftLruHashTable local10 = this.aSoftLruHashTable114;
		synchronized (this.aSoftLruHashTable114) {
			this.aSoftLruHashTable114.clean(5);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Lclient!ab;")
	public StructType method5038(@OriginalArg(1) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable114;
		@Pc(16) StructType local16;
		synchronized (this.aSoftLruHashTable114) {
			local16 = (StructType) this.aSoftLruHashTable114.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Js5 local30 = this.aJs570;
		@Pc(39) byte[] local39;
		synchronized (this.aJs570) {
			local39 = this.aJs570.fetchFile(26, arg0);
		}
		local16 = new StructType();
		if (local39 != null) {
			local16.method90(new Packet(local39));
		}
		@Pc(71) SoftLruHashTable local71 = this.aSoftLruHashTable114;
		synchronized (this.aSoftLruHashTable114) {
			this.aSoftLruHashTable114.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V")
	public void method5040() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable114;
		synchronized (this.aSoftLruHashTable114) {
			this.aSoftLruHashTable114.removeSoft();
		}
	}
}
