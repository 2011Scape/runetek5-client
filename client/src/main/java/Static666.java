import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static666 {

	@OriginalMember(owner = "client!vba", name = "K", descriptor = "J")
	public static long aLong301;

	@OriginalMember(owner = "client!vba", name = "M", descriptor = "Lclient!sb;")
	public static Js5 aJs5118;

	@OriginalMember(owner = "client!vba", name = "H", descriptor = "Z")
	public static boolean aBoolean766 = false;

	@OriginalMember(owner = "client!vba", name = "h", descriptor = "(I)V")
	public static void write(@OriginalArg(0) int arg0) {
		@Pc(5) FileOnDisk local5 = null;
		try {
			@Pc(18) PrivilegedRequest local18 = Static446.aSignlink6.openPreferences("");
			while (local18.state == 0) {
				Static638.sleep(1L);
			}
			if (local18.state == 1) {
				local5 = (FileOnDisk) local18.result;
				@Pc(41) Packet local41 = Static400.aClass2_Sub34_28.encode();
				local5.method2162(local41.data, 0, local41.pos);
			}
		} catch (@Pc(51) Exception local51) {
		}
		try {
			if (local5 != null) {
				local5.close();
			}
		} catch (@Pc(58) Exception local58) {
		}
	}
}
