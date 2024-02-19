import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class ParamTypeList {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable21 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "Lclient!sb;")
	private final Js5 aJs510;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public ParamTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs510 = arg2;
		if (this.aJs510 != null) {
			this.aJs510.getGroupCapacity(11);
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	public void method1156() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable21;
		synchronized (this.aSoftLruHashTable21) {
			this.aSoftLruHashTable21.removeSoft();
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)V")
	public void method1158() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable21;
		synchronized (this.aSoftLruHashTable21) {
			this.aSoftLruHashTable21.clean(5);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public void method1160() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable21;
		synchronized (this.aSoftLruHashTable21) {
			this.aSoftLruHashTable21.clear();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Lclient!po;")
	public ParamType method1161(@OriginalArg(0) int arg0) {
		@Pc(13) SoftLruHashTable local13 = this.aSoftLruHashTable21;
		@Pc(23) ParamType local23;
		synchronized (this.aSoftLruHashTable21) {
			local23 = (ParamType) this.aSoftLruHashTable21.get((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(37) Js5 local37 = this.aJs510;
		@Pc(46) byte[] local46;
		synchronized (this.aJs510) {
			local46 = this.aJs510.fetchFile(11, arg0);
		}
		local23 = new ParamType();
		if (local46 != null) {
			local23.method6673(new Packet(local46));
		}
		@Pc(70) SoftLruHashTable local70 = this.aSoftLruHashTable21;
		synchronized (this.aSoftLruHashTable21) {
			this.aSoftLruHashTable21.put((long) arg0, local23);
			return local23;
		}
	}
}
