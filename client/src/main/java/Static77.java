import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
	public static int anInt1613;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "Lclient!kda;")
	public static final Class204 aClass204_1 = new Class204(1, 2);

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
	public static int anInt1614 = -1;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)V")
	public static void closeWidget() {
		@Pc(13) OutboundPacket local13 = OutboundPacket.create(Static317.aClientProt62, Connection.gameConnection.random);
		Connection.gameConnection.queue(local13);
		for (@Pc(22) SubInterface local22 = (SubInterface) Static548.openInterfaces.head(); local22 != null; local22 = (SubInterface) Static548.openInterfaces.next()) {
			if (!local22.isLinked()) {
				local22 = (SubInterface) Static548.openInterfaces.head();
				if (local22 == null) {
					break;
				}
			}
			if (local22.anInt146 == 0) {
				Static449.method6115(true, true, local22);
			}
		}
		if (Static390.aComponent9 != null) {
			Static178.redraw(Static390.aComponent9);
			Static390.aComponent9 = null;
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(IZ)V")
	public static void setComponentModelAngleClient(@OriginalArg(0) int arg0) {
		@Pc(9) SecondaryLinkable_Sub2 local9 = Static440.create(8, (long) arg0);
		local9.pushClient();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)Z")
	public static boolean method1559() {
		return Static594.anInt8777 > 0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)Z")
	public static boolean method1560(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
	public static void method1561() {
		@Pc(8) int local8 = Static400.aClass2_Sub34_28.aPreference_Sub4_2.method2143();
		if (local8 == 0) {
			Static328.aByteArrayArrayArray4 = null;
			Static556.method7300(0);
		} else if (local8 == 1) {
			Static170.method2652((byte) 0);
			Static556.method7300(512);
			if (Static280.aByteArrayArrayArray3 != null) {
				Static361.method5240();
			}
		} else {
			Static170.method2652((byte) (Static198.anInt3276 - 4 & 0xFF));
			Static556.method7300(2);
		}
		Static514.anInt7680 = Static394.anInt6176;
	}
}
