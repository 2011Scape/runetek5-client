import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!dja", name = "d", descriptor = "I")
	public static int anInt2238;

	@OriginalMember(owner = "client!dja", name = "g", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt22 = new ClientProt(17, -1);

	@OriginalMember(owner = "client!dja", name = "h", descriptor = "Lclient!av;")
	public static final HashTable aHashTable12 = new HashTable(16);

	@OriginalMember(owner = "client!dja", name = "n", descriptor = "Z")
	public static boolean showcolmap = false;

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "(II)V")
	public static void method2119(@OriginalArg(1) int arg0) {
		Static524.aConnection3 = Connection.gameConnection;
		Static299.anInt4825 = 2;
		Static470.anInt7113 = arg0;
		Static238.method3471(Static319.aString51.equals(""), Static319.aString51, true, "");
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "([BBZ)V")
	public static void method2121(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static339.aPacket_9 == null) {
			Static339.aPacket_9 = new Packet(20000);
		}
		Static339.aPacket_9.pdata(arg0, 0, arg0.length);
		if (!arg1) {
			return;
		}
		Static681.method8919(Static339.aPacket_9.data);
		Static343.sorted = new World[Static476.size];
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = Static494.minId; local33 <= Static699.maxId; local33++) {
			@Pc(38) World local38 = Static615.getWorld(local33);
			if (local38 != null) {
				Static343.sorted[local31++] = local38;
			}
		}
		Static149.aBoolean221 = false;
		Static363.aLong219 = Static588.currentTimeWithDrift();
		Static339.aPacket_9 = null;
	}
}
