import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!eja", name = "g", descriptor = "I")
	public static int anInt2561 = 0;

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(ZLclient!cm;Lclient!cm;)V")
	public static void method2408(@OriginalArg(1) SecondaryLinkable arg0, @OriginalArg(2) SecondaryLinkable arg1) {
		if (arg0.secondaryNext != null) {
			arg0.unlinkSecondary();
		}
		arg0.secondaryNext = arg1.secondaryNext;
		arg0.secondaryPrev = arg1;
		arg0.secondaryNext.secondaryPrev = arg0;
		arg0.secondaryPrev.secondaryNext = arg0;
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(I)V")
	public static void method2409() {
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			Static572.aBooleanArray29[local10] = false;
		}
		Static70.anInt1569 = Static170.anInt2864;
		Static411.anInt6329 = Static110.anInt2186;
		Static225.anInt3641 = Static323.cameraYaw;
		Static197.anInt3260 = -1;
		Static340.anInt5584 = Static598.anInt8832;
		Static693.anInt10383 = -1;
		Static692.anInt10376 = -1;
		Static374.anInt5907 = -1;
		Static212.anInt3468 = Static333.loop;
		Static179.anInt2991 = 0;
		Static314.anInt5035 = 0;
		Static511.cameraType = 5;
		Static302.anInt4854 = Static359.anInt5801;
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(Lclient!cg;Z)V")
	public static void method2410(@OriginalArg(0) PathingEntity arg0) {
		if (arg0.anIntArray872 == null && arg0.anIntArray877 == null) {
			return;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < arg0.anIntArray872.length; local19++) {
			@Pc(25) int local25 = -1;
			if (arg0.anIntArray872 != null) {
				local25 = arg0.anIntArray872[local19];
			}
			if (local25 != -1) {
				local17 = false;
				@Pc(102) int local102;
				@Pc(95) int local95;
				@Pc(72) int local72;
				if ((local25 & -1073741824) == -1073741824) {
					local72 = local25 & 0xFFFFFFF;
					@Pc(148) int local148 = local72 >> 14;
					local102 = arg0.xFine - (local148 - Static691.originX) * 512 - 256;
					@Pc(164) int local164 = local72 & 0x3FFF;
					local95 = arg0.zFine - (local164 - Static116.originZ) * 512 - 256;
				} else if ((local25 & 0x8000) == 0) {
					@Pc(111) Linkable_Sub45 local111 = (Linkable_Sub45) Static18.aHashTable2.get((long) local25);
					if (local111 == null) {
						arg0.method9307(local19, -1);
						continue;
					}
					@Pc(116) Npc local116 = local111.aClass8_Sub2_Sub1_Sub2_Sub2_2;
					local95 = arg0.zFine - local116.zFine;
					local102 = arg0.xFine - local116.xFine;
				} else {
					local72 = local25 & 0x7FFF;
					@Pc(76) Player local76 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local72];
					if (local76 == null) {
						arg0.method9307(local19, -1);
						continue;
					}
					local95 = arg0.zFine - local76.zFine;
					local102 = arg0.xFine - local76.xFine;
				}
				if (local102 != 0 || local95 != 0) {
					arg0.method9307(local19, (int) (Math.atan2((double) local102, (double) local95) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method9307(local19, -1)) {
				local17 = false;
			}
		}
		if (local17) {
			arg0.anIntArray872 = null;
			arg0.anIntArray877 = null;
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(III)V")
	public static void method2411(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static571.load(arg1)) {
			Static84.method1663(Static453.components[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(BI)Lclient!hda;")
	public static Component getComponent(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = arg0 >> 16;
		@Pc(20) int local20 = arg0 & 0xFFFF;
		if (Static453.components[local16] == null || Static453.components[local16][local20] == null) {
			@Pc(38) boolean local38 = Static571.load(local16);
			if (!local38) {
				return null;
			}
		}
		return Static453.components[local16][local20];
	}
}
