import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static719 {

	@OriginalMember(owner = "client!wq", name = "V", descriptor = "Lclient!cd;")
	public static AudioChannel aAudioChannel5;

	@OriginalMember(owner = "client!wq", name = "T", descriptor = "I")
	public static int anInt10504;

	@OriginalMember(owner = "client!wq", name = "S", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_45 = new Class155(60);

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!d;Lclient!ha;Z)V")
	public static void method9117(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class19 arg1) {
		if (Static30.aClass2_Sub2_Sub13_3 == null) {
			return;
		}
		if (Static273.anInt4403 < 10) {
			if (!Static30.aJs574.isGroupReady(Static30.aClass2_Sub2_Sub13_3.aString48)) {
				Static273.anInt4403 = client.worldMapData.getPercentageComplete(Static30.aClass2_Sub2_Sub13_3.aString48) / 10;
				return;
			}
			Static700.method9152();
			Static273.anInt4403 = 10;
		}
		if (Static273.anInt4403 == 10) {
			Static30.anInt5655 = Static30.aClass2_Sub2_Sub13_3.anInt4560 >> 6 << 6;
			Static30.anInt5648 = Static30.aClass2_Sub2_Sub13_3.anInt4559 >> 6 << 6;
			Static30.anInt5650 = (Static30.aClass2_Sub2_Sub13_3.anInt4552 >> 6 << 6) - (Static30.anInt5655 - 64);
			Static30.anInt5644 = (Static30.aClass2_Sub2_Sub13_3.anInt4562 >> 6 << 6) + 64 - Static30.anInt5648;
			@Pc(77) int[] local77 = new int[3];
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = -1;
			if (Static30.aClass2_Sub2_Sub13_3.method4088(local77, Static116.originZ + (Static556.self.zFine >> 9), Static556.self.plane, (Static556.self.xFine >> 9) + Static691.originX)) {
				local79 = local77[1] - Static30.anInt5655;
				local81 = local77[2] - Static30.anInt5648;
			}
			if (!Static696.aBoolean784 && local79 >= 0 && Static30.anInt5650 > local79 && local81 >= 0 && local81 < Static30.anInt5644) {
				local81 += (int) (Math.random() * 10.0D) - 5;
				local79 += (int) (Math.random() * 10.0D) - 5;
				Static164.anInt2809 = local79;
				Static615.anInt9389 = local81;
			} else if (Static227.anInt3694 == -1 || Static529.anInt8089 == -1) {
				Static30.aClass2_Sub2_Sub13_3.method4085(Static30.aClass2_Sub2_Sub13_3.anInt4556 >> 14 & 0x3FFF, Static30.aClass2_Sub2_Sub13_3.anInt4556 & 0x3FFF, local77);
				Static615.anInt9389 = local77[2] - Static30.anInt5648;
				Static164.anInt2809 = local77[1] - Static30.anInt5655;
			} else {
				Static30.aClass2_Sub2_Sub13_3.method4085(Static227.anInt3694, Static529.anInt8089, local77);
				if (local77 != null) {
					Static615.anInt9389 = local77[2] - Static30.anInt5648;
					Static164.anInt2809 = local77[1] - Static30.anInt5655;
				}
				Static696.aBoolean784 = false;
				Static529.anInt8089 = -1;
				Static227.anInt3694 = -1;
			}
			if (Static30.aClass2_Sub2_Sub13_3.anInt4564 == 37) {
				Static30.aFloat105 = 3.0F;
				Static30.aFloat106 = 3.0F;
			} else if (Static30.aClass2_Sub2_Sub13_3.anInt4564 == 50) {
				Static30.aFloat105 = 4.0F;
				Static30.aFloat106 = 4.0F;
			} else if (Static30.aClass2_Sub2_Sub13_3.anInt4564 == 75) {
				Static30.aFloat105 = 6.0F;
				Static30.aFloat106 = 6.0F;
			} else if (Static30.aClass2_Sub2_Sub13_3.anInt4564 == 100) {
				Static30.aFloat105 = 8.0F;
				Static30.aFloat106 = 8.0F;
			} else if (Static30.aClass2_Sub2_Sub13_3.anInt4564 == 200) {
				Static30.aFloat105 = 16.0F;
				Static30.aFloat106 = 16.0F;
			} else {
				Static30.aFloat105 = 8.0F;
				Static30.aFloat106 = 8.0F;
			}
			Static30.anInt5643 = (int) Static30.aFloat105 >> 1;
			Static30.aByteArrayArrayArray5 = Static640.method8437(Static30.anInt5643);
			Static387.method5440();
			Static30.method5069();
			Static551.aLinkedList54 = new LinkedList();
			Static30.anInt5641 += (int) (Math.random() * 5.0D) - 2;
			if (Static30.anInt5641 < -8) {
				Static30.anInt5641 = -8;
			}
			Static30.anInt5642 += (int) (Math.random() * 5.0D) - 2;
			if (Static30.anInt5641 > 8) {
				Static30.anInt5641 = 8;
			}
			if (Static30.anInt5642 < -16) {
				Static30.anInt5642 = -16;
			}
			if (Static30.anInt5642 > 16) {
				Static30.anInt5642 = 16;
			}
			Static30.method5067(arg0, Static30.anInt5641 >> 2 << 10, Static30.anInt5642 >> 1);
			Static30.aMelTypeList3.method5583(1024, 256);
			Static30.aMsiTypeList3.method8365(256, 256);
			Static30.aLocTypeList3.initCache(4096);
			Static529.aVarBitTypeList1.method3420(256);
			Static273.anInt4403 = 20;
		} else if (Static273.anInt4403 == 20) {
			Static314.method4568(true);
			Static30.method5080(arg1, Static30.anInt5641, Static30.anInt5642);
			Static273.anInt4403 = 60;
			Static314.method4568(true);
			Static199.method2977();
		} else if (Static273.anInt4403 == 60) {
			if (Static30.aJs574.isGroupNameVaild(Static30.aClass2_Sub2_Sub13_3.aString48 + "_staticelements")) {
				if (!Static30.aJs574.isGroupReady(Static30.aClass2_Sub2_Sub13_3.aString48 + "_staticelements")) {
					return;
				}
				Static30.aClass255_3 = Static284.method4103(Static174.mapMembers, Static30.aJs574, Static30.aClass2_Sub2_Sub13_3.aString48 + "_staticelements");
			} else {
				Static30.aClass255_3 = new Class255(0);
			}
			Static30.method5079();
			Static273.anInt4403 = 70;
			Static314.method4568(true);
			Static199.method2977();
		} else if (Static273.anInt4403 == 70) {
			Static559.aWorldMapFont7 = new WorldMapFont(arg1, 11, true, Static434.canvas);
			Static273.anInt4403 = 73;
			Static314.method4568(true);
			Static199.method2977();
		} else if (Static273.anInt4403 == 73) {
			Static484.aWorldMapFont6 = new WorldMapFont(arg1, 12, true, Static434.canvas);
			Static273.anInt4403 = 76;
			Static314.method4568(true);
			Static199.method2977();
		} else if (Static273.anInt4403 == 76) {
			Static142.aWorldMapFont1 = new WorldMapFont(arg1, 14, true, Static434.canvas);
			Static273.anInt4403 = 79;
			Static314.method4568(true);
			Static199.method2977();
		} else if (Static273.anInt4403 == 79) {
			Static651.aWorldMapFont8 = new WorldMapFont(arg1, 17, true, Static434.canvas);
			Static273.anInt4403 = 82;
			Static314.method4568(true);
			Static199.method2977();
		} else if (Static273.anInt4403 == 82) {
			Static275.aWorldMapFont2 = new WorldMapFont(arg1, 19, true, Static434.canvas);
			Static273.anInt4403 = 85;
			Static314.method4568(true);
			Static199.method2977();
		} else if (Static273.anInt4403 == 85) {
			Static390.aWorldMapFont5 = new WorldMapFont(arg1, 22, true, Static434.canvas);
			Static273.anInt4403 = 88;
			Static314.method4568(true);
			Static199.method2977();
		} else if (Static273.anInt4403 == 88) {
			Static364.aWorldMapFont4 = new WorldMapFont(arg1, 26, true, Static434.canvas);
			Static273.anInt4403 = 91;
			Static314.method4568(true);
			Static199.method2977();
		} else {
			Static359.aWorldMapFont3 = new WorldMapFont(arg1, 30, true, Static434.canvas);
			Static273.anInt4403 = 100;
			Static314.method4568(true);
			Static199.method2977();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(III)I")
	public static int method9118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 != 16939) {
			aAudioChannel5 = null;
		}
		@Pc(18) int local18 = arg2 - 1 & arg0 >> 31;
		return local18 + (arg0 + (arg0 >>> 31)) % arg2;
	}
}
