import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class SkyBoxSphereTypeList {

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable45 = new SoftLruHashTable(16);

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Lclient!sb;")
	private final Js5 aJs517;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public SkyBoxSphereTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs517 = arg2;
		this.aJs517.getGroupCapacity(30);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Lclient!afa;")
	public SkyBoxSphereType method2051(@OriginalArg(1) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable45;
		@Pc(16) SkyBoxSphereType local16;
		synchronized (this.aSoftLruHashTable45) {
			local16 = (SkyBoxSphereType) this.aSoftLruHashTable45.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Js5 local30 = this.aJs517;
		@Pc(39) byte[] local39;
		synchronized (this.aJs517) {
			local39 = this.aJs517.fetchFile(30, arg0);
		}
		local16 = new SkyBoxSphereType();
		if (local39 != null) {
			local16.method131(new Packet(local39));
		}
		@Pc(63) SoftLruHashTable local63 = this.aSoftLruHashTable45;
		synchronized (this.aSoftLruHashTable45) {
			this.aSoftLruHashTable45.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public void method2052() {
		@Pc(14) SoftLruHashTable local14 = this.aSoftLruHashTable45;
		synchronized (this.aSoftLruHashTable45) {
			this.aSoftLruHashTable45.clear();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	public void method2053() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable45;
		synchronized (this.aSoftLruHashTable45) {
			this.aSoftLruHashTable45.removeSoft();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V")
	public void method2055() {
		@Pc(9) SoftLruHashTable local9 = this.aSoftLruHashTable45;
		synchronized (this.aSoftLruHashTable45) {
			this.aSoftLruHashTable45.clean(5);
		}
	}
}
