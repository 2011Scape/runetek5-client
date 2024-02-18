import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "Z")
	private static boolean aBoolean380 = false;

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "Lclient!sia;")
	private static final LinkedList aLinkedList28 = new LinkedList();

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
	private static int anInt4924 = 0;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!e;)V")
	public static synchronized void method4477(@OriginalArg(1) Interface5 arg0) {
		if (aBoolean380) {
			return;
		}
		if (anInt4924 <= 0) {
			arg0.w(false);
		} else {
			@Pc(15) Linkable_Sub52 local15 = new Linkable_Sub52();
			local15.anInterface5_1 = arg0;
			aLinkedList28.addTail(local15);
		}
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)V")
	public static synchronized void method4478() {
		while (true) {
			@Pc(4) Linkable_Sub52 local4 = (Linkable_Sub52) aLinkedList28.removeHead();
			if (local4 == null) {
				return;
			}
			local4.anInterface5_1.w(true);
			local4.unlink();
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
	public static synchronized void method4479() {
		anInt4924++;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZI)V")
	public static synchronized void method4480() {
		aBoolean380 = true;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public static synchronized void method4481() {
		anInt4924--;
		if (anInt4924 == 0) {
			method4478();
		}
	}
}
