import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!fha", name = "c", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt31 = new ClientProt(21, 15);

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(IIIIIB)V")
	public static void method2701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(18) int local18 = arg1 + 1;
		Static696.method9037(arg3, arg2, arg4, Static723.anIntArrayArray266[arg1]);
		@Pc(27) int local27 = arg0 - 1;
		Static696.method9037(arg3, arg2, arg4, Static723.anIntArrayArray266[arg0]);
		for (@Pc(32) int local32 = local18; local32 <= local27; local32++) {
			@Pc(38) int[] local38 = Static723.anIntArrayArray266[local32];
			local38[arg4] = local38[arg3] = arg2;
		}
	}
}
