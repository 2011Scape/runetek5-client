import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static408 {

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt162 = new ServerProt(102, -1);

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	public static void method5632() {
		Static295.aClient1.method1634();
		Static524.aClass153_3.method3272();
		Static524.aClass153_3.anInt3646 = 0;
		Static249.anInt4008 = 0;
		Static524.aClass153_3.aServerProt_91 = null;
		Static524.aClass153_3.aServerProt_94 = null;
		Static524.aClass153_3.aServerProt_92 = null;
		Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos = 0;
		Static102.method2022();
		Static251.anInt4036 = 0;
		Static723.aString129 = null;
		Static327.anInt5392 = 0;
		Static91.aClass164_9 = null;
		Static128.aClass164_8 = null;
		Static706.anInt10633 = 0;
		Static87.aClass241Array1 = null;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZLclient!el;)Z")
	public static boolean method5634(@OriginalArg(1) MelType arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean214) {
			return false;
		} else if (!arg0.method2425(Static30.anInterface23_3)) {
			return false;
		} else if (Static268.aHashTable22.get((long) arg0.anInt2590) == null) {
			return Static232.aHashTable18.get((long) arg0.anInt2597) == null;
		} else {
			return false;
		}
	}
}
