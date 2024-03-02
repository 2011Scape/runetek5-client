import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!ska", name = "H", descriptor = "[I")
	public static int[] anIntArray695 = new int[6];

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "([Lclient!eo;II)V")
	public static void method7745(@OriginalArg(0) ParticleNode_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) ParticleNode_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10697;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10697 < local27 + (local29 & 0x1)) {
				@Pc(44) ParticleNode_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method7745(arg0, arg1, local10 - 1);
		method7745(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!ska", name = "c", descriptor = "(III)Z")
	public static boolean method7746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x22) != 0;
	}
}
