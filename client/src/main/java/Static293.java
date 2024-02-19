import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!av", name = "m", descriptor = "[I")
	public static final int[] anIntArray34 = new int[120];

	// $FF: synthetic field
	@OriginalMember(owner = "client!jfa", name = "Mb", descriptor = "Ljava/lang/Class;")
	private static Class aClass10;

	static {
		@Pc(85) int local85 = 0;
		for (@Pc(87) int local87 = 0; local87 < 120; local87++) {
			@Pc(92) int local92 = local87 + 1;
			@Pc(105) int local105 = (int) (Math.pow(2.0D, (double) local92 / 7.0D) * 300.0D + (double) local92);
			local85 += local105;
			anIntArray34[local87] = local85 / 4;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!hma;)V")
	public static void method4332(@OriginalArg(1) Linkable_Sub25 arg0) {
		if (Static334.aClass291ArrayArrayArray1 == null) {
			return;
		}
		@Pc(9) Interface25 local9 = null;
		if (arg0.anInt4011 == 0) {
			local9 = (Interface25) Static302.method4414(arg0.anInt4010, arg0.anInt4016, arg0.anInt4006);
		}
		if (arg0.anInt4011 == 1) {
			local9 = (Interface25) Static114.method2134(arg0.anInt4010, arg0.anInt4016, arg0.anInt4006);
		}
		if (arg0.anInt4011 == 2) {
			local9 = (Interface25) Static578.method7623(arg0.anInt4010, arg0.anInt4016, arg0.anInt4006, aClass10 == null ? (aClass10 = getClass("Interface25")) : aClass10);
		}
		if (arg0.anInt4011 == 3) {
			local9 = (Interface25) Static687.method8959(arg0.anInt4010, arg0.anInt4016, arg0.anInt4006);
		}
		if (local9 == null) {
			arg0.anInt4009 = 0;
			arg0.anInt4002 = -1;
			arg0.anInt4015 = 0;
		} else {
			arg0.anInt4002 = local9.method6859(-32136);
			arg0.anInt4009 = local9.method6858();
			arg0.anInt4015 = local9.method6855(23796);
		}
	}

	static Class getClass(String name) {
		Class instance;
		try {
			instance = Class.forName(name);
		} catch (ClassNotFoundException ex) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(ex);
		}
		return instance;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III)Z")
	public static boolean method4333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static139.method2358(arg0, arg1) | (arg0 & 0x2000) != 0 | Static401.method5575(arg0, arg1)) & Static279.method4074(arg1, arg0);
	}

}
