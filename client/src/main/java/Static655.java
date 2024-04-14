import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static655 {

	@OriginalMember(owner = "client!un", name = "K", descriptor = "[Lclient!gca;")
	public static Class140[] aClass140Array1;

	@OriginalMember(owner = "client!un", name = "t", descriptor = "I")
	public static int anInt9763 = -1;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "I")
	public static int anInt9766 = 0;

	@OriginalMember(owner = "client!un", name = "B", descriptor = "I")
	public static int anInt9767 = 0;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!vq;ILjava/awt/Frame;)V")
	public static void closeFrame(@OriginalArg(0) Signlink signlink, @OriginalArg(2) Frame frame) {
		while (true) {
			@Pc(10) PrivilegedRequest request = signlink.method8989(frame);
			while (request.state == 0) {
				Static638.sleep(10L);
			}
			if (request.state == 1) {
				frame.setVisible(false);
				frame.dispose();
				return;
			}
			Static638.sleep(100L);
		}
	}
}
