import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class IntUtils {
	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(II)I")
	public static int clp2(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(16) int local16 = local4 | local4 >>> 1;
		@Pc(22) int local22 = local16 | local16 >>> 2;
		@Pc(28) int local28 = local22 | local22 >>> 4;
		@Pc(34) int local34 = local28 | local28 >>> 8;
		@Pc(40) int local40 = local34 | local34 >>> 16;
		return local40 + 1;
	}
}
