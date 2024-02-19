import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class SkyBoxTypeList {

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable168 = new SoftLruHashTable(16);

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "Lclient!sb;")
	private final Js5 aJs5100;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public SkyBoxTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs5100 = arg2;
		this.aJs5100.getGroupCapacity(29);
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)V")
	public void method7068() {
		@Pc(13) SoftLruHashTable local13 = this.aSoftLruHashTable168;
		synchronized (this.aSoftLruHashTable168) {
			this.aSoftLruHashTable168.clean(5);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	public void method7069() {
		@Pc(10) SoftLruHashTable local10 = this.aSoftLruHashTable168;
		synchronized (this.aSoftLruHashTable168) {
			this.aSoftLruHashTable168.removeSoft();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Lclient!ema;")
	private SkyBoxType method7070(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable168;
		@Pc(22) SkyBoxType local22;
		synchronized (this.aSoftLruHashTable168) {
			local22 = (SkyBoxType) this.aSoftLruHashTable168.get((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(36) Js5 local36 = this.aJs5100;
		@Pc(45) byte[] local45;
		synchronized (this.aJs5100) {
			local45 = this.aJs5100.fetchFile(29, arg0);
		}
		local22 = new SkyBoxType();
		if (local45 != null) {
			local22.method2447(new Packet(local45));
		}
		@Pc(69) SoftLruHashTable local69 = this.aSoftLruHashTable168;
		synchronized (this.aSoftLruHashTable168) {
			this.aSoftLruHashTable168.put((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	public void method7071() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable168;
		synchronized (this.aSoftLruHashTable168) {
			this.aSoftLruHashTable168.clear();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!dg;IIIIZ)Lclient!gm;")
	public Class148 method7072(@OriginalArg(0) SkyBoxSphereTypeList arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(13) Class216[] local13 = null;
		@Pc(18) SkyBoxType local18 = this.method7070(arg2);
		if (local18.anIntArray232 != null) {
			local13 = new Class216[local18.anIntArray232.length];
			for (@Pc(28) int local28 = 0; local28 < local13.length; local28++) {
				@Pc(37) SkyBoxSphereType local37 = arg0.method2051(local18.anIntArray232[local28]);
				local13[local28] = new Class216(local37.anInt129, local37.anInt124, local37.anInt125, local37.anInt130, local37.anInt132, local37.anInt123, local37.anInt131, local37.aBoolean10, local37.anInt128, local37.anInt133, local37.anInt126);
			}
		}
		return new Class148(local18.anInt2629, local13, local18.anInt2624, arg4, arg3, arg1, local18.anInt2625, local18.anInt2621);
	}
}
