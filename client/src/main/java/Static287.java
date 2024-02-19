import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method4154(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(39) int local39 = 0;
			@Pc(41) long local41 = arg0;
			while (local41 != 0L) {
				local41 /= 37L;
				local39++;
			}
			@Pc(56) StringBuffer local56 = new StringBuffer(local39);
			while (arg0 != 0L) {
				@Pc(59) long local59 = arg0;
				arg0 /= 37L;
				local56.append(Static333.aCharArray4[(int) (local59 - arg0 * 37L)]);
			}
			return local56.reverse().toString();
		}
	}
}
