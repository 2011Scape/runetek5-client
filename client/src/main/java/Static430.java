import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!nja", name = "O", descriptor = "[I")
	public static int[] anIntArray519;

	@OriginalMember(owner = "client!nja", name = "K", descriptor = "F")
	public static float aFloat120;

	@OriginalMember(owner = "client!nja", name = "N", descriptor = "J")
	public static long aLong209 = 0L;

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(I[[I)V")
	public static void method5815(@OriginalArg(1) int[][] arg0) {
		Static723.anIntArrayArray266 = arg0;
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(IBLjava/lang/String;)Z")
	public static boolean hopWorld(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (Static446.aSignlink6.aBoolean781) {
			Static344.aClass229_1 = new Class229();
			Static344.aClass229_1.worldId = arg0;
			Static344.aClass229_1.aString60 = arg1;
			if (Static2.aModeWhere1 != ModeWhere.LIVE) {
				Static344.aClass229_1.anInt5854 = Static344.aClass229_1.worldId + 40000;
				Static344.aClass229_1.anInt5853 = Static344.aClass229_1.worldId + 50000;
			}
			for (@Pc(45) int local45 = 0; local45 < Static343.sorted.length; local45++) {
				if (Static343.sorted[local45].id == arg0) {
					Static715.anInt10805 = Static343.sorted[local45].flags;
				}
			}
			return true;
		}
		@Pc(73) String local73 = "";
		if (ModeWhere.LIVE != Static2.aModeWhere1) {
			local73 = ":" + (arg0 + 7000);
		}
		@Pc(88) String local88 = "";
		if (Static150.aString26 != null) {
			local88 = "/p=" + Static150.aString26;
		}
		@Pc(152) String local152 = "http://" + arg1 + local73 + "/l=" + Static51.clientLanguageId + "/a=" + Static323.affiliate + local88 + "/j" + (Static98.aBoolean191 ? "1" : "0") + ",o" + (Static464.aBoolean533 ? "1" : "0") + ",a2";
		try {
			Static295.aClient1.getAppletContext().showDocument(new URL(local152), "_self");
			return true;
		} catch (@Pc(164) Exception local164) {
			return false;
		}
	}

	@OriginalMember(owner = "client!nja", name = "d", descriptor = "(B)V")
	public static void method5818() throws Exception_Sub1 {
		if (Static448.anInt6796 == 1) {
			Static74.aClass19_4.method7975(Static2.anInt45, Static312.anInt5001);
		} else {
			Static74.aClass19_4.method7975(0, 0);
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void setRank(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Connection local10 = Connection.getActiveConnection();
		@Pc(16) OutboundPacket local16 = OutboundPacket.create(ClientProt.aClientProt80, local10.random);
		local16.buffer.p1(Static231.method3379(arg0) + 1);
		local16.buffer.pjstr(arg0);
		local16.buffer.p1_alt2(arg1);
		local10.queue(local16);
	}
}
