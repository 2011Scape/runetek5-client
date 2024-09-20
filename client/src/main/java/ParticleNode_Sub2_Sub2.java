import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public abstract class ParticleNode_Sub2_Sub2 extends ParticleNode_Sub2 {

	@OriginalMember(owner = "client!eia", name = "z", descriptor = "S")
	public short aShort46;

	@OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(IIIIII)V")
	protected ParticleNode_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.plane = (byte) arg3;
		super.anInt10691 = arg1;
		super.zFine = arg2;
		this.aShort46 = (short) arg5;
		super.aByte143 = (byte) arg4;
		super.xFine = arg0;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(BLclient!ha;)Z")
	@Override
	public final boolean method9284(@OriginalArg(0) byte arg0, @OriginalArg(1) Class19 arg1) {
		if (arg0 != 59) {
			this.aShort46 = -95;
		}
		return Static588.method7714(super.zFine >> Static52.anInt1066, super.aByte143, super.xFine >> Static52.anInt1066);
	}

	@OriginalMember(owner = "client!eia", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method9275() {
		return Static258.aBooleanArrayArray3[Static35.anInt813 + (super.xFine >> Static52.anInt1066) - Static403.anInt6246][Static35.anInt813 + (super.zFine >> Static52.anInt1066) - Static550.anInt8271];
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "([Lclient!lca;I)I")
	@Override
	public final int method9288(@OriginalArg(0) Linkable_Sub7[] arg0) {
		return this.method9277(arg0, super.zFine >> Static52.anInt1066, super.xFine >> Static52.anInt1066);
	}
}
