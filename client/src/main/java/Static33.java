import org.openrs2.deob.annotation.OriginalMember;

public final class Static33 {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	public static int anInt779 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public static void method881() {
		Static1.anInt10798 = 4;
		Static322.anIntArrayArray265 = null;
		Static421.aBoolean480 = false;
		Static518.aPacket_18 = null;
		Static298.method4385();
		Connection.gameConnection.queue(OutboundPacket.create(Static45.aClientProt5, Connection.gameConnection.random));
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)[Lclient!wk;")
	public static Class403[] method882() {
		return new Class403[] { Static555.aClass403_14, Static710.aClass403_13, Static169.aClass403_1 };
	}
}
