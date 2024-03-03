import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cha", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!cha", name = "h", descriptor = "I")
	public static int anInt1601 = 0;

	@OriginalMember(owner = "client!cha", name = "d", descriptor = "I")
	public static int anInt1604 = 0;

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(BLclient!ca;)V")
	public static void method1552(@OriginalArg(1) Player arg0) {
		@Pc(19) Linkable_Sub51 local19 = (Linkable_Sub51) Static113.aHashTable12.get((long) arg0.anInt10740);
		if (local19 == null) {
			return;
		}
		if (local19.aClass2_Sub6_Sub2_4 != null) {
			Static336.aClass2_Sub6_Sub3_1.method5883(local19.aClass2_Sub6_Sub2_4);
			local19.aClass2_Sub6_Sub2_4 = null;
		}
		local19.unlink();
	}

	@OriginalMember(owner = "client!cha", name = "b", descriptor = "(B)V")
	public static void method1555() {
		if (Static6.anInt95 == 0) {
			return;
		}
		try {
			if (++Static654.anInt9739 > 2000) {
				Connection.lobbyConnection.close();
				if (Static720.anInt10865 >= 2) {
					Static6.anInt95 = 0;
					Static580.anInt8621 = -5;
					return;
				}
				Static660.aClass229_4.method5260();
				Static6.anInt95 = 1;
				Static654.anInt9739 = 0;
				Static720.anInt10865++;
			}
			if (Static6.anInt95 == 1) {
				Connection.lobbyConnection.aPrivilegedRequest1 = Static660.aClass229_4.method5263(Static446.aSignlink6);
				Static6.anInt95 = 2;
			}
			if (Static6.anInt95 == 2) {
				if (Connection.lobbyConnection.aPrivilegedRequest1.state == 2) {
					throw new IOException();
				}
				if (Connection.lobbyConnection.aPrivilegedRequest1.state != 1) {
					return;
				}
				Connection.lobbyConnection.aClass348_1 = Static99.method1975((Socket) Connection.lobbyConnection.aPrivilegedRequest1.anObject13);
				Connection.lobbyConnection.aPrivilegedRequest1 = null;
				Connection.lobbyConnection.method3273();
				Static6.anInt95 = 4;
			}
			if (Static6.anInt95 == 4 && Connection.lobbyConnection.aClass348_1.method7932(1)) {
				Connection.lobbyConnection.aClass348_1.method7929(Connection.lobbyConnection.inboundPacket.data, 1, 0);
				@Pc(139) int local139 = Connection.lobbyConnection.inboundPacket.data[0] & 0xFF;
				Static6.anInt95 = 0;
				Static580.anInt8621 = local139;
				Connection.lobbyConnection.close();
			}
		} catch (@Pc(148) IOException local148) {
			Connection.lobbyConnection.close();
			if (Static720.anInt10865 < 2) {
				Static660.aClass229_4.method5260();
				Static720.anInt10865++;
				Static654.anInt9739 = 0;
				Static6.anInt95 = 1;
			} else {
				Static6.anInt95 = 0;
				Static580.anInt8621 = -4;
			}
		}
	}
}
