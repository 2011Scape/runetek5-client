import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "J")
	public static long aLong70;

	@OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
	public static int anInt1961;

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "Lclient!it;")
	public static final Class184 aClass184_5 = new Class184(8, 0, 4, 1);

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)V")
	public static void method1840() {
		for (@Pc(4) SecondaryLinkable_Sub16 local4 = (SecondaryLinkable_Sub16) Static693.aLinkedList79.head(); local4 != null; local4 = (SecondaryLinkable_Sub16) Static693.aLinkedList79.next()) {
			if (Static466.method6326(local4.anInt7314)) {
				Static679.method8911(local4);
			}
		}
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V")
	public static void method1841() {
		Static524.aConnection3.method3272();
		Static524.aConnection3.packetType = null;
		Static524.aConnection3.inboundPacket.pos = 0;
		Static524.aConnection3.anInt3646 = 0;
		Static524.aConnection3.lastPacketType2 = null;
		Static524.aConnection3.lastPacketType = null;
		Static524.aConnection3.anInt3648 = 0;
		Static249.rebootTimer = 0;
		Static524.aConnection3.aServerProt_92 = null;
		Static533.method7119();
		Static605.method7914();
		for (@Pc(36) int local36 = 0; local36 < 2048; local36++) {
			Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local36] = null;
		}
		Static556.self = null;
		for (@Pc(49) int local49 = 0; local49 < Static416.anInt6378; local49++) {
			@Pc(55) Npc local55 = Static592.aClass2_Sub45Array1[local49].aClass8_Sub2_Sub1_Sub2_Sub2_2;
			if (local55 != null) {
				local55.anInt10722 = -1;
			}
		}
		Static576.method7614();
		Static511.cameraType = 1;
		Static693.anInt10383 = -1;
		Static692.anInt10376 = -1;
		Static81.method1586(11);
		for (@Pc(79) int local79 = 0; local79 < 100; local79++) {
			Static364.aBooleanArray18[local79] = true;
		}
		Static371.method5284();
		Static675.aLong307 = 0L;
		Static211.aClass2_Sub12_3 = null;
	}
}
