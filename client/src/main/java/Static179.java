import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
	public static int anInt2991;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
	public static int anInt2984 = 0;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)I")
	public static int method2767(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = 0;
		while (arg0 > 0) {
			local14 = arg1 & 0x1 | local14 << 1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local14;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLclient!tka;)Z")
	public static boolean method2769(@OriginalArg(1) ModeWhere arg0) {
		return ModeWhere.WTRC == arg0 || arg0 == ModeWhere.WTQA || arg0 == ModeWhere.WTWIP || arg0 == ModeWhere.WTI || arg0 == ModeWhere.INTBETA;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIZIII)V")
	public static void method2770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static400.aClass2_Sub34_28.aPreference_Sub25_3.method7208() != 0 && arg0 != 0 && Static33.anInt779 < 50 && arg5 != -1) {
			Static409.aClass104Array1[Static33.anInt779++] = new Class104((byte) 2, arg5, arg0, arg1, arg4, arg2, arg3, (ParticleNode_Sub2) null);
		}
	}
}
