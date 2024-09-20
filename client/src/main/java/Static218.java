import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
	public static void method3187() {
		Static584.aBoolean658 = true;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V")
	public static void method3188(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (arg1.length() > 320 || !Static470.method6387()) {
			return;
		}
		Connection.lobbyConnection.close();
		Static367.method5268();
		Static59.aString63 = arg0;
		Static449.aString75 = arg1;
		Static81.method1586(5);
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	public static void method3189() {
		@Pc(7) FileOnDisk local7 = null;
		try {
			@Pc(13) PrivilegedRequest local13 = Static446.aSignlink6.openPreferences("2");
			while (local13.state == 0) {
				Static638.sleep(1L);
			}
			if (local13.state == 1) {
				local7 = (FileOnDisk) local13.result;
				@Pc(41) byte[] local41 = new byte[(int) local7.method2161()];
				@Pc(57) int local57;
				for (@Pc(43) int local43 = 0; local43 < local41.length; local43 += local57) {
					local57 = local7.method2163(local41.length - local43, local41, local43);
					if (local57 == -1) {
						throw new IOException("EOF");
					}
				}
				Static618.method8317(new Packet(local41));
			}
		} catch (@Pc(88) Exception local88) {
		}
		try {
			if (local7 != null) {
				local7.close();
			}
		} catch (@Pc(100) Exception local100) {
		}
	}
}
