import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
	public static final int anInt2222 = 0;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "Z")
	public static boolean aBoolean197 = false;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!cg;)I")
	public static int method2104(@OriginalArg(1) PathingEntity arg0) {
		if (arg0.anInt10757 == 0) {
			return 0;
		}
		@Pc(74) int local74;
		@Pc(67) int local67;
		if (arg0.anInt10722 != -1) {
			@Pc(24) PathingEntity local24 = null;
			if (arg0.anInt10722 < 32768) {
				@Pc(54) Linkable_Sub45 local54 = (Linkable_Sub45) Static18.aHashTable2.get((long) arg0.anInt10722);
				if (local54 != null) {
					local24 = local54.aClass8_Sub2_Sub1_Sub2_Sub2_2;
				}
			} else if (arg0.anInt10722 >= 32768) {
				local24 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[arg0.anInt10722 - 32768];
			}
			if (local24 != null) {
				local67 = arg0.xFine - local24.xFine;
				local74 = arg0.zFine - local24.zFine;
				if (local67 != 0 || local74 != 0) {
					arg0.method9305((int) (Math.atan2((double) local67, (double) local74) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Player) {
			@Pc(104) Player local104 = (Player) arg0;
			if (local104.anInt1467 != -1 && (local104.anInt10764 == 0 || local104.anInt10763 > 0)) {
				local104.method9305(local104.anInt1467);
				local104.anInt1467 = -1;
			}
		} else if (arg0 instanceof Npc) {
			@Pc(138) Npc local138 = (Npc) arg0;
			if (local138.anInt10774 != -1 && (local138.anInt10764 == 0 || local138.anInt10763 > 0)) {
				local67 = local138.xFine - (local138.anInt10774 - Static691.originX - Static691.originX) * 256;
				local74 = local138.zFine - (local138.anInt10767 - Static116.originZ - Static116.originZ) * 256;
				if (local67 != 0 || local74 != 0) {
					local138.method9305((int) (Math.atan2((double) local67, (double) local74) * 2607.5945876176133D) & 0x3FFF);
				}
				local138.anInt10774 = -1;
			}
		}
		return arg0.method9303();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLclient!ge;)Lclient!jt;")
	public static Class200 method2106(@OriginalArg(1) Packet arg0) {
		@Pc(7) int local7 = arg0.g2();
		return new Class200(local7);
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)V")
	public static void method2109() {
		if (Static158.aClass19_5 != null) {
			Static158.aClass19_5.cleanup();
			Static629.aClass14_11 = null;
			Static158.aClass19_5 = null;
		}
	}
}
