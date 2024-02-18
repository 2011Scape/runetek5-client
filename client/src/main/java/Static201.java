import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static201 {

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
	public static int anInt8407;

	@OriginalMember(owner = "client!ge", name = "Ab", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt206 = new ServerProt(136, 6);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!ie;Lclient!ie;)V")
	public static void method7368(@OriginalArg(1) Linkable arg0, @OriginalArg(2) Linkable arg1) {
		if (arg1.prev != null) {
			arg1.unlink();
		}
		arg1.next = arg0;
		arg1.prev = arg0.prev;
		arg1.prev.next = arg1;
		arg1.next.prev = arg1;
	}
}
