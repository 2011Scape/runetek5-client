import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!lma", name = "a", descriptor = "[I")
	public static final int[] anIntArray455 = new int[200];

	@OriginalMember(owner = "client!lma", name = "b", descriptor = "(I)V")
	public static void method5284() {
		@Pc(22) OutboundPacket local22 = OutboundPacket.create(Static587.aClientProt105, Connection.gameConnection.random);
		local22.data.p1(Static36.method978(3));
		local22.data.p2(Static680.anInt10289);
		local22.data.p2(Static380.anInt5979);
		local22.data.p1(Static400.aClass2_Sub34_28.aPreference_Sub13_1.method4373());
		Connection.gameConnection.queue(local22);
	}
}
