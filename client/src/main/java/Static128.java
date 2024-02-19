import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Lclient!hi;")
	public static Class164 aClass164_8;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt106 = new ClientProt(6, 8);

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString108 = null;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7754(@OriginalArg(1) String arg0) {
		if (Static87.aClass241Array1 == null) {
			return;
		}
		@Pc(21) Connection local21 = Connection.getActiveConnection();
		@Pc(27) OutboundPacket local27 = OutboundPacket.create(Static436.aClientProt45, local21.random);
		local27.data.p1(Static231.method3379(arg0));
		local27.data.pjstr(arg0);
		local21.queue(local27);
	}
}
