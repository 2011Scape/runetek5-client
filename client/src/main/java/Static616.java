import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static616 {

	@OriginalMember(owner = "client!tia", name = "R", descriptor = "I")
	public static int anInt9417 = 0;

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V")
	public static void method8283(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static470.anInt7113 = -1;
		if (ClientConfig.ENABLE_LOBBY) {
			Static524.aConnection3 = Connection.gameConnection;
			Static299.anInt4825 = 2;
		} else {
			Static524.aConnection3 = Connection.lobbyConnection;
			Static299.anInt4825 = 1;
		}
		Static238.method3471(false, arg1, false, arg0);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(BLclient!sb;)V")
	public static void method8284(@OriginalArg(1) Js5 arg0) {
		Static662.anInt9845 = arg0.getGroupId("p11_full");
		Static539.anInt8173 = arg0.getGroupId("p12_full");
		Static634.anInt9519 = arg0.getGroupId("b12_full");
	}
}
