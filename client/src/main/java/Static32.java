import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bba", name = "q", descriptor = "I")
	public static int anInt772;

	@OriginalMember(owner = "client!bba", name = "bb", descriptor = "I")
	public static int anInt775;

	@OriginalMember(owner = "client!bba", name = "Z", descriptor = "I")
	public static int anInt776;

	@OriginalMember(owner = "client!bba", name = "D", descriptor = "I")
	public static int anInt773 = 0;

	@OriginalMember(owner = "client!bba", name = "I", descriptor = "I")
	public static int anInt774 = 0;

	@OriginalMember(owner = "client!bba", name = "L", descriptor = "I")
	public static int anInt777 = 100;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IBII)Lclient!fk;")
	public static OutboundPacket method878(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) OutboundPacket local11 = null;
		if (arg2 == 0) {
			local11 = OutboundPacket.create(Static500.aClientProt91, Connection.gameConnection.random);
		}
		if (arg2 == 1) {
			local11 = OutboundPacket.create(Static632.aClientProt111, Connection.gameConnection.random);
		}
		local11.buffer.p2_alt3(arg0 + Static691.anInt10367);
		local11.buffer.p2_alt3(Static116.anInt2270 + arg1);
		local11.buffer.p1(Static334.aKeyboard1.method8479(82) ? 1 : 0);
		Static266.aBoolean583 = false;
		Static675.anInt10156 = arg0;
		Static212.anInt3466 = arg1;
		Static444.method5988();
		return local11;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZZ)V")
	public static void method880(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		Static667.method8695(arg1, LocalizedText.LOADING_PLEASE_WAIT.get(Static51.anInt1052), arg0);
	}
}
