import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class236 {

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "Z")
	public boolean aBoolean455 = false;

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "Lclient!wj;")
	private Npc aClass8_Sub2_Sub1_Sub2_Sub2_1 = null;

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "Lclient!ca;")
	private Player aClass8_Sub2_Sub1_Sub2_Sub1_1 = null;

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "I")
	private final int anInt5985;

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "I")
	public final int anInt5980;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!ge;I)V")
	public Class236(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.anInt5985 = arg1;
		@Pc(19) int local19 = arg0.g1();
		if (local19 == 0) {
			this.anInt5980 = arg0.gSmart2or4null();
		} else if (local19 == 1) {
			this.anInt5980 = -1;
		} else {
			this.anInt5980 = -1;
		}
		arg0.gjstr();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IBII)V")
	public void method5360(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass8_Sub2_Sub1_Sub2_Sub2_1 == null) {
			this.aClass8_Sub2_Sub1_Sub2_Sub1_1.plane = this.aClass8_Sub2_Sub1_Sub2_Sub1_1.aByte143 = (byte) arg1;
			this.aClass8_Sub2_Sub1_Sub2_Sub1_1.method1419(arg0, arg2);
		} else {
			this.aClass8_Sub2_Sub1_Sub2_Sub2_1.method9326(true, arg2, arg0, arg1, this.aClass8_Sub2_Sub1_Sub2_Sub2_1.method9302((byte) 44));
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
	public void method5361() {
		this.aClass8_Sub2_Sub1_Sub2_Sub2_1 = null;
		this.aBoolean455 = false;
		this.aClass8_Sub2_Sub1_Sub2_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)Lclient!cg;")
	public PathingEntity method5363() {
		return this.aClass8_Sub2_Sub1_Sub2_Sub2_1 == null ? this.aClass8_Sub2_Sub1_Sub2_Sub1_1 : this.aClass8_Sub2_Sub1_Sub2_Sub2_1;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BIIII)V")
	public void method5364(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!this.aBoolean455) {
			this.aBoolean455 = true;
			if (this.anInt5980 >= 0) {
				this.aClass8_Sub2_Sub1_Sub2_Sub2_1 = new Npc(25);
				this.aClass8_Sub2_Sub1_Sub2_Sub2_1.anInt10751 = Static333.loop;
				this.aClass8_Sub2_Sub1_Sub2_Sub2_1.anInt10740 = this.anInt5985;
				this.aClass8_Sub2_Sub1_Sub2_Sub2_1.method9328(Static690.aNpcTypeList2.method7092(this.anInt5980));
				this.aClass8_Sub2_Sub1_Sub2_Sub2_1.method9310(this.aClass8_Sub2_Sub1_Sub2_Sub2_1.aNpcType1.anInt6713);
				this.aClass8_Sub2_Sub1_Sub2_Sub2_1.anInt10757 = this.aClass8_Sub2_Sub1_Sub2_Sub2_1.aNpcType1.lb << 3;
				this.aClass8_Sub2_Sub1_Sub2_Sub2_1.anInt10739 = Static457.anInt6933++;
			} else {
				this.aClass8_Sub2_Sub1_Sub2_Sub1_1 = new Player(25);
				this.aClass8_Sub2_Sub1_Sub2_Sub1_1.method1420(Static518.aPacket_18);
				this.aClass8_Sub2_Sub1_Sub2_Sub1_1.anInt10751 = Static333.loop;
				this.aClass8_Sub2_Sub1_Sub2_Sub1_1.anInt10739 = Static457.anInt6933++;
				this.aClass8_Sub2_Sub1_Sub2_Sub1_1.anInt10740 = this.anInt5985;
			}
		}
		if (this.anInt5980 < 0) {
			this.aClass8_Sub2_Sub1_Sub2_Sub1_1.plane = this.aClass8_Sub2_Sub1_Sub2_Sub1_1.aByte143 = (byte) arg1;
			this.aClass8_Sub2_Sub1_Sub2_Sub1_1.method1419(arg2, arg3);
			this.aClass8_Sub2_Sub1_Sub2_Sub1_1.method9298(arg0, true);
		} else {
			this.aClass8_Sub2_Sub1_Sub2_Sub2_1.method9326(true, arg3, arg2, arg1, this.aClass8_Sub2_Sub1_Sub2_Sub2_1.method9302((byte) 71));
			this.aClass8_Sub2_Sub1_Sub2_Sub2_1.method9298(arg0, true);
		}
	}
}
