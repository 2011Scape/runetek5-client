import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Lclient!pg;")
	public static SecondaryLinkable_Sub16 aClass2_Sub2_Sub16_13;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "I")
	public static int anInt10171 = 0;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)V")
	public static void method8819(@OriginalArg(1) int arg0) {
		@Pc(18) SecondaryLinkable_Sub2 local18 = Static440.create(4, (long) arg0);
		local18.pushClient();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIB)V")
	public static void method8835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static111.anInt2219 = arg1;
		Static273.anInt4395 = arg0;
		Static180.anInt2995 = 0;
		Static724.anInt10930 = 0;
	}
}
