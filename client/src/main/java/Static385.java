import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "D")
	public static double aDouble18 = -1.0D;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IIIIII)V")
	public static void method5420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 > Static273.anInt4395 || Static724.anInt10930 > arg0) {
			return;
		}
		@Pc(31) boolean local31;
		if (Static180.anInt2995 > arg1) {
			arg1 = Static180.anInt2995;
			local31 = false;
		} else if (arg1 > Static111.anInt2219) {
			local31 = false;
			arg1 = Static111.anInt2219;
		} else {
			local31 = true;
		}
		@Pc(70) boolean local70;
		if (arg3 < Static180.anInt2995) {
			arg3 = Static180.anInt2995;
			local70 = false;
		} else if (arg3 > Static111.anInt2219) {
			arg3 = Static111.anInt2219;
			local70 = false;
		} else {
			local70 = true;
		}
		if (arg4 < Static724.anInt10930) {
			arg4 = Static724.anInt10930;
		} else {
			Static696.method9037(arg3, arg2, arg1, Static723.anIntArrayArray266[arg4++]);
		}
		if (Static273.anInt4395 < arg0) {
			arg0 = Static273.anInt4395;
		} else {
			Static696.method9037(arg3, arg2, arg1, Static723.anIntArrayArray266[arg0--]);
		}
		@Pc(140) int local140;
		if (local31 && local70) {
			for (local140 = arg4; local140 <= arg0; local140++) {
				@Pc(190) int[] local190 = Static723.anIntArrayArray266[local140];
				local190[arg1] = local190[arg3] = arg2;
			}
		} else if (local31) {
			for (local140 = arg4; local140 <= arg0; local140++) {
				Static723.anIntArrayArray266[local140][arg1] = arg2;
			}
		} else if (local70) {
			for (local140 = arg4; local140 <= arg0; local140++) {
				Static723.anIntArrayArray266[local140][arg3] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)Z")
	public static boolean method5421() {
		if (Static98.aBoolean191) {
			try {
				if ((Boolean) Static727.method97("showingVideoAd", Static166.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(28) Throwable local28) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!cba;B)V")
	public static void method5424(@OriginalArg(0) SecondaryLinkable_Sub4 arg0) {
		@Pc(5) boolean local5 = false;
		arg0.unlinkSecondary();
		for (@Pc(21) SecondaryLinkable_Sub4 local21 = (SecondaryLinkable_Sub4) Static350.aSecondaryLinkedList8.head(); local21 != null; local21 = (SecondaryLinkable_Sub4) Static350.aSecondaryLinkedList8.next()) {
			if (Static546.method7250(arg0.method1468(), local21.method1468())) {
				local5 = true;
				Static409.method5654(local21, arg0);
				break;
			}
		}
		if (!local5) {
			Static350.aSecondaryLinkedList8.addTail(arg0);
		}
	}
}
