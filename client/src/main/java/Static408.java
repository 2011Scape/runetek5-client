import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static408 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	public static void method5632() {
		Static295.aClient1.method1634();
		Static524.aConnection3.method3272();
		Static524.aConnection3.anInt3646 = 0;
		Static249.rebootTimer = 0;
		Static524.aConnection3.lastPacketType2 = null;
		Static524.aConnection3.lastPacketType = null;
		Static524.aConnection3.aServerProt_92 = null;
		Static524.aConnection3.inboundPacket.pos = 0;
		Static102.method2022();
		Static251.state = 0;
		Static723.name = null;
		Static327.size = 0;
		Static91.aClass164_9 = null;
		Static128.aClass164_8 = null;
		Static706.size = 0;
		Static87.members = null;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZLclient!el;)Z")
	public static boolean method5634(@OriginalArg(1) MelType arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean214) {
			return false;
		} else if (!arg0.method2425(Static30.aVarDomain3)) {
			return false;
		} else if (Static268.aHashTable22.get((long) arg0.anInt2590) == null) {
			return Static232.aHashTable18.get((long) arg0.anInt2597) == null;
		} else {
			return false;
		}
	}
}
