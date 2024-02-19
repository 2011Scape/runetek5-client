import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tka")
public final class ModeWhere {

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "Lclient!tka;")
	public static final ModeWhere LIVE = new ModeWhere("LIVE", "", "", 0);

    @OriginalMember(owner = "client!wea", name = "R", descriptor = "Lclient!tka;")
    public static final ModeWhere WTRC = new ModeWhere("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "Lclient!tka;")
	public static final ModeWhere WTQA = new ModeWhere("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "Lclient!tka;")
	public static final ModeWhere WTWIP = new ModeWhere("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!aj", name = "D", descriptor = "Lclient!tka;")
	public static final ModeWhere LOCAL = new ModeWhere("LOCAL", "", "local", 4);

	@OriginalMember(owner = "client!ip", name = "z", descriptor = "Lclient!tka;")
	public static final ModeWhere WTI = new ModeWhere("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!vka", name = "b", descriptor = "Lclient!tka;")
	public static final ModeWhere INTBETA = new ModeWhere("INTBETA", "office", "_intbeta", 6);

	@OriginalMember(owner = "client!tka", name = "f", descriptor = "I")
	public final int id;

	@OriginalMember(owner = "client!tka", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public ModeWhere(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int id) {
		this.id = id;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)[Lclient!tka;")
	public static ModeWhere[] all() {
		return new ModeWhere[] {LIVE, WTRC, WTQA, WTWIP, LOCAL, WTI, INTBETA};
	}

	@OriginalMember(owner = "client!tka", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
