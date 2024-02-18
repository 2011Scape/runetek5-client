import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aha", name = "l", descriptor = "I")
	public static int anInt148;

	@OriginalMember(owner = "client!aha", name = "k", descriptor = "Lclient!st;")
	public static SoftwareIndexedSprite aSoftwareIndexedSprite4;

	@OriginalMember(owner = "client!aha", name = "p", descriptor = "I")
	public static int anInt150 = 0;

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(I)V")
	public static void method158() {
		for (@Pc(7) int local7 = 0; local7 < Static390.anInt6126; local7++) {
			@Pc(13) int local13 = Static103.anIntArray187[local7];
			@Pc(20) Linkable_Sub45 local20 = (Linkable_Sub45) Static18.aHashTable2.get((long) local13);
			if (local20 != null) {
				@Pc(25) Npc local25 = local20.aClass8_Sub2_Sub1_Sub2_Sub2_2;
				Static489.method6547(false, local25);
			}
		}
	}
}
