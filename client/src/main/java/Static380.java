import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static380 {

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
	public static int anInt5979;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!hda;B)Ljava/lang/String;")
	public static String method5359(@OriginalArg(0) Component arg0) {
		if (Static84.getServerActiveProperties(arg0).getTargetMask() == 0) {
			return null;
		} else if (arg0.optionCircumfix == null || arg0.optionCircumfix.trim().length() == 0) {
			return Static103.aBoolean195 ? "Hidden-use" : null;
		} else {
			return arg0.optionCircumfix;
		}
	}
}
