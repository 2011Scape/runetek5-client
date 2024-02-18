import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "Lclient!iia;")
	public static final Linkable_Sub27 aClass2_Sub27_1 = new Linkable_Sub27(0, 0);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BIIII)V")
	public static void method7087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) SecondaryLinkable_Sub2 local9 = Static440.method5963(10, (long) arg1);
		local9.method202();
		local9.anInt195 = arg2;
		local9.anInt197 = arg3;
		local9.anInt192 = arg0;
	}
}
