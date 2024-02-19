import org.openrs2.deob.annotation.OriginalMember;

public final class Static564 {

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
	public static int anInt8464;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "[I")
	public static final int[] anIntArray653 = new int[1];

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(B)V")
	public static void method7465() {
		if (Static656.method6691(Static283.gameState)) {
			if (Connection.lobbyConnection.aClass348_1 == null) {
				Static81.method1586(5);
			} else {
				Static81.method1586(7);
			}
		} else if (Static283.gameState == 5 || Static283.gameState == 6) {
			Static81.method1586(3);
		} else if (Static283.gameState == 13) {
			Static81.method1586(3);
		}
	}
}
