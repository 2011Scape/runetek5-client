import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)V")
	public static void method5981() {
		if (Static377.topLevelInterface == -1) {
			return;
		}
		@Pc(13) int local13 = Static189.aMouse1.method8853();
		@Pc(22) int local22 = Static189.aMouse1.method8854();
		@Pc(27) Linkable_Sub9 local27 = (Linkable_Sub9) Static226.aLinkedList58.head();
		if (local27 != null) {
			local13 = local27.method5331();
			local22 = local27.method5333();
		}
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		if (Static137.aBoolean210) {
			local44 = Static130.method2283();
			local46 = Static422.method5771();
		}
		Static431.method5822(local46 + Static380.anInt5979, local46, local46, local22, local22 + local46, local44 + Static680.anInt10289, local44, Static377.topLevelInterface, local13, local44 + local13, local44);
		if (Static210.aComponent4 != null) {
			Static509.method6759(local13 + local44, local22 - -local46);
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!hda;II)Ljava/lang/String;")
	public static String method5982(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1) {
		if (!Static84.getServerActiveProperties(arg0).isButtonEnabled(arg1) && arg0.onOptionClick == null) {
			return null;
		} else if (arg0.ops == null || arg1 >= arg0.ops.length || arg0.ops[arg1] == null || arg0.ops[arg1].trim().length() == 0) {
			return Static103.aBoolean195 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.ops[arg1];
		}
	}
}
