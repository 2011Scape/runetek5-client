import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kka")
public final class VarClientTypeList {

	@OriginalMember(owner = "client!kka", name = "b", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable112 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "Lclient!sb;")
	private final Js5 aJs567;

	@OriginalMember(owner = "client!kka", name = "f", descriptor = "I")
	public final int anInt5473;

	@OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public VarClientTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs567 = arg2;
		this.anInt5473 = this.aJs567.method7608(19);
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(II)Lclient!paa;")
	public VarClientType method4947(@OriginalArg(0) int arg0) {
		@Pc(12) SoftLruHashTable local12 = this.aSoftLruHashTable112;
		@Pc(22) VarClientType local22;
		synchronized (this.aSoftLruHashTable112) {
			local22 = (VarClientType) this.aSoftLruHashTable112.method2156((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(36) Js5 local36 = this.aJs567;
		@Pc(45) byte[] local45;
		synchronized (this.aJs567) {
			local45 = this.aJs567.method7595(arg0, 19);
		}
		local22 = new VarClientType();
		if (local45 != null) {
			local22.method6449(new Packet(local45));
		}
		@Pc(69) SoftLruHashTable local69 = this.aSoftLruHashTable112;
		synchronized (this.aSoftLruHashTable112) {
			this.aSoftLruHashTable112.method2150(local22, (long) arg0);
			return local22;
		}
	}
}
