import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "[I")
	public static final int[] anIntArray15 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
	public static int anInt84 = -1;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "([SBI)[S")
	public static short[] method94(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static734.method7692(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
