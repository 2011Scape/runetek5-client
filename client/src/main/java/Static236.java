import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!hfa", name = "s", descriptor = "I")
	public static int anInt3893;

	@OriginalMember(owner = "client!hfa", name = "w", descriptor = "Lclient!oba;")
	public static PrivilegedRequest aPrivilegedRequest2;

	@OriginalMember(owner = "client!hfa", name = "r", descriptor = "Z")
	public static boolean aBoolean304 = false;

	@OriginalMember(owner = "client!hfa", name = "u", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IZ)V")
	public static void method3450(@OriginalArg(0) int arg0) {
		@Pc(16) SecondaryLinkable_Sub2 local16 = Static440.create(14, (long) arg0);
		local16.pushClient();
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lclient!gw;I)Z")
	public static boolean method3451(@OriginalArg(0) Connection arg0) {
		try {
			return Protocol.method4334(arg0);
		} catch (@Pc(15) IOException local15) {
			if (Static283.gameState == 9) {
				arg0.aClass348_1 = null;
				return false;
			} else {
				Static370.method5279();
				return true;
			}
		} catch (@Pc(29) Exception local29) {
			@Pc(106) String local106 = "T2 - " + (arg0.packetType == null ? -1 : arg0.packetType.getOpcode()) + "," + (arg0.lastPacketType == null ? -1 : arg0.lastPacketType.getOpcode()) + "," + (arg0.lastPacketType2 == null ? -1 : arg0.lastPacketType2.getOpcode()) + " - " + arg0.anInt3648 + "," + (Static691.originX + Static556.self.anIntArray879[0]) + "," + (Static116.originZ + Static556.self.anIntArray878[0]) + " - ";
			for (@Pc(108) int local108 = 0; arg0.anInt3648 > local108 && local108 < 50; local108++) {
				local106 = local106 + arg0.inboundPacket.data[local108] + ",";
			}
			Static240.method3496(local29, local106);
			Static233.method3409(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "(I)V")
	public static void method3453() {
		for (@Pc(16) Linkable_Sub5 local16 = (Linkable_Sub5) Static106.aHashTable11.head(); local16 != null; local16 = (Linkable_Sub5) Static106.aHashTable11.next()) {
			if (local16.aClass222_Sub1_1.method9177()) {
				Static121.method2199(local16.anInt182);
			} else {
				local16.aClass222_Sub1_1.method9193(109);
				try {
					local16.aClass222_Sub1_1.method9179();
				} catch (@Pc(43) Exception local43) {
					Static240.method3496(local43, "TV: " + local16.anInt182);
					Static121.method2199(local16.anInt182);
				}
				if (!local16.aBoolean14 && !local16.aBoolean16) {
					@Pc(73) Linkable_Sub28_Sub1 local73 = local16.aClass222_Sub1_1.method9189();
					if (local73 != null) {
						@Pc(79) Linkable_Sub6_Sub5 local79 = local73.method3960();
						if (local79 != null) {
							local79.method9147(local16.anInt180);
							Static336.aClass2_Sub6_Sub3_1.method5882(local79);
							local16.aBoolean14 = true;
						}
					}
				}
			}
		}
	}
}
