import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static40 {

	@OriginalMember(owner = "client!bfa", name = "l", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt16 = new ServerProt(74, 11);

	@OriginalMember(owner = "client!bfa", name = "p", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt17 = new ServerProt(39, 6);

	@OriginalMember(owner = "client!bfa", name = "n", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt18 = new ServerProt(132, -2);

	@OriginalMember(owner = "client!bfa", name = "o", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt19 = new ServerProt(15, 0);

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIIIIB)J")
	public static long method1026(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		Static260.aCalendar1.clear();
		Static260.aCalendar1.set(arg1, arg0, arg2, 12, 0, 0);
		return Static260.aCalendar1.getTime().getTime();
	}
}
