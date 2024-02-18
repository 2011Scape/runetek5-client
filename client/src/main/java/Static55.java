import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!br", name = "B", descriptor = "I")
	public static int anInt1125;

	@OriginalMember(owner = "client!br", name = "z", descriptor = "I")
	public static int anInt1124 = 0;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IILclient!pg;I)V")
	public static void method1217(@OriginalArg(0) int arg0, @OriginalArg(2) SecondaryLinkable_Sub16 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || arg1 == Static693.aLinkedList79.sentinel) {
			return;
		}
		@Pc(16) int local16 = arg1.anInt7316;
		@Pc(19) int local19 = arg1.anInt7313;
		@Pc(22) int local22 = arg1.anInt7314;
		@Pc(26) int local26 = (int) arg1.aLong233;
		if (local22 >= 2000) {
			local22 -= 2000;
		}
		@Pc(35) long local35 = arg1.aLong233;
		if (local22 == 44) {
			@Pc(44) Player local44 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local26];
			if (local44 != null) {
				Static481.anInt7215 = 0;
				Static676.anInt10206 = arg2;
				Static616.anInt9417 = 2;
				Static305.anInt4882 = arg0;
				@Pc(64) OutboundPacket local64 = Static293.method4335(Static664.aClientProt115, Static405.aClass153_2.aIsaacRandom_1);
				local64.aPacketBit_1.ip2(local26);
				local64.aPacketBit_1.p4_alt1(Static450.anInt6819);
				local64.aPacketBit_1.p2(Static162.anInt2799);
				local64.aPacketBit_1.p1_alt3(Static334.aKeyboard1.method8479(82) ? 1 : 0);
				local64.aPacketBit_1.p2_alt3(Static77.anInt1614);
				Static405.aClass153_2.method3275(local64);
				Static147.method2419(0, local44.anIntArray878[0], local44.method9302((byte) 99), true, local44.anIntArray879[0], 0, -2, local44.method9302((byte) 110));
			}
		}
		@Pc(147) OutboundPacket local147;
		if (local22 == 4) {
			Static616.anInt9417 = 2;
			Static305.anInt4882 = arg0;
			Static481.anInt7215 = 0;
			Static676.anInt10206 = arg2;
			local147 = Static293.method4335(Static664.aClientProt115, Static405.aClass153_2.aIsaacRandom_1);
			local147.aPacketBit_1.ip2(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10740);
			local147.aPacketBit_1.p4_alt1(Static450.anInt6819);
			local147.aPacketBit_1.p2(Static162.anInt2799);
			local147.aPacketBit_1.p1_alt3(Static334.aKeyboard1.method8479(82) ? 1 : 0);
			local147.aPacketBit_1.p2_alt3(Static77.anInt1614);
			Static405.aClass153_2.method3275(local147);
		}
		if (local22 == 12) {
			@Pc(197) Component local197 = Static15.method186(local16, local19);
			if (local197 != null) {
				Static470.method6384();
				@Pc(206) ServerActiveProperties local206 = Static84.method1661(local197);
				Static389.method5476(local206.method6216(), local197, local206.anInt6904);
				Static153.aString27 = Static380.method5359(local197);
				Static128.aString108 = local197.aString41 + "<col=ffffff>";
				if (Static153.aString27 == null) {
					Static153.aString27 = "Null";
				}
			}
			return;
		}
		if (local22 == 58) {
			if (Static608.anInt9290 > 0 && Static334.aKeyboard1.method8479(82) && Static334.aKeyboard1.method8479(81)) {
				Static624.method8331(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144, Static116.anInt2270 + local19, Static691.anInt10367 + local16);
			} else {
				local147 = Static32.method878(local16, local19, local26);
				if (local26 == 1) {
					local147.aPacketBit_1.p1(-1);
					local147.aPacketBit_1.p1(-1);
					local147.aPacketBit_1.p2((int) Static171.aFloat64);
					local147.aPacketBit_1.p1(57);
					local147.aPacketBit_1.p1(Static29.anInt723);
					local147.aPacketBit_1.p1(Static660.anInt9835);
					local147.aPacketBit_1.p1(89);
					local147.aPacketBit_1.p2(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690);
					local147.aPacketBit_1.p2(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694);
					local147.aPacketBit_1.p1(63);
				} else {
					Static305.anInt4882 = arg0;
					Static616.anInt9417 = 1;
					Static481.anInt7215 = 0;
					Static676.anInt10206 = arg2;
				}
				Static405.aClass153_2.method3275(local147);
				Static147.method2419(0, local19, 1, true, local16, 0, -4, 1);
			}
		}
		if (local22 == 10 && Static390.aComponent9 == null) {
			Static479.method6461(local16, local19);
			Static390.aComponent9 = Static15.method186(local16, local19);
			Static178.method2729(Static390.aComponent9);
		}
		@Pc(389) ClientProt local389 = null;
		if (local22 == 2) {
			local389 = Static424.aClientProt79;
		} else if (local22 == 22) {
			local389 = Static53.aClientProt7;
		} else if (local22 == 52) {
			local389 = Static412.aClientProt74;
		} else if (local22 == 30) {
			local389 = Static587.aClientProt104;
		} else if (local22 == 53) {
			local389 = Static675.aClientProt118;
		} else if (local22 == 9) {
			local389 = Static173.aClientProt30;
		} else if (local22 == 51) {
			local389 = Static273.aClientProt55;
		} else if (local22 == 15) {
			local389 = Static494.aClientProt89;
		} else if (local22 == 48) {
			local389 = Static571.aClientProt103;
		} else if (local22 == 16) {
			local389 = Static470.aClientProt88;
		}
		@Pc(494) OutboundPacket local494;
		if (local389 != null) {
			@Pc(474) Player local474 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local26];
			if (local474 != null) {
				Static481.anInt7215 = 0;
				Static305.anInt4882 = arg0;
				Static616.anInt9417 = 2;
				Static676.anInt10206 = arg2;
				local494 = Static293.method4335(local389, Static405.aClass153_2.aIsaacRandom_1);
				local494.aPacketBit_1.p1(Static334.aKeyboard1.method8479(82) ? 1 : 0);
				local494.aPacketBit_1.p2(local26);
				Static405.aClass153_2.method3275(local494);
				Static147.method2419(0, local474.anIntArray878[0], local474.method9302((byte) 125), true, local474.anIntArray879[0], 0, -2, local474.method9302((byte) 60));
			}
		}
		@Pc(548) ClientProt local548 = null;
		if (local22 == 25) {
			local548 = Static235.aClientProt48;
		} else if (local22 == 5) {
			local548 = Static405.aClientProt73;
		} else if (local22 == 50) {
			local548 = Static631.aClientProt120;
		} else if (local22 == 6) {
			local548 = Static555.aClientProt99;
		} else if (local22 == 45) {
			local548 = Static87.aClientProt17;
		} else if (local22 == 1007) {
			local548 = Static214.aClientProt39;
		}
		if (local548 != null) {
			Static305.anInt4882 = arg0;
			Static481.anInt7215 = 0;
			Static616.anInt9417 = 2;
			Static676.anInt10206 = arg2;
			local494 = Static293.method4335(local548, Static405.aClass153_2.aIsaacRandom_1);
			local494.aPacketBit_1.p2_alt2(local26);
			local494.aPacketBit_1.p1(Static334.aKeyboard1.method8479(82) ? 1 : 0);
			local494.aPacketBit_1.p2(local19 + Static116.anInt2270);
			local494.aPacketBit_1.ip2(Static691.anInt10367 + local16);
			Static405.aClass153_2.method3275(local494);
			Static414.method5697(local19, local16);
		}
		if (local22 == 11) {
			if (Static608.anInt9290 > 0 && Static334.aKeyboard1.method8479(82) && Static334.aKeyboard1.method8479(81)) {
				Static624.method8331(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144, Static116.anInt2270 + local19, Static691.anInt10367 + local16);
			} else {
				Static481.anInt7215 = 0;
				Static676.anInt10206 = arg2;
				Static616.anInt9417 = 1;
				Static305.anInt4882 = arg0;
				local494 = Static293.method4335(Static512.aClientProt96, Static405.aClass153_2.aIsaacRandom_1);
				local494.aPacketBit_1.p2_alt3(local19 + Static116.anInt2270);
				local494.aPacketBit_1.ip2(Static691.anInt10367 + local16);
				Static405.aClass153_2.method3275(local494);
			}
		}
		if (local22 == 18) {
			@Pc(741) Component local741 = Static15.method186(local16, local19);
			if (local741 != null) {
				Static312.method4542(local741);
			}
		}
		@Pc(750) ClientProt local750 = null;
		if (local22 == 49) {
			local750 = Static297.aClientProt59;
		} else if (local22 == 59) {
			local750 = Static546.aClientProt97;
		} else if (local22 == 47) {
			local750 = Static131.aClientProt25;
		} else if (local22 == 57) {
			local750 = Static305.aClientProt60;
		} else if (local22 == 3) {
			local750 = Static420.aClientProt78;
		} else if (local22 == 1011) {
			local750 = Static591.aClientProt107;
		}
		if (local750 != null) {
			@Pc(806) Linkable_Sub45 local806 = (Linkable_Sub45) Static18.aHashTable2.get((long) local26);
			if (local806 != null) {
				Static676.anInt10206 = arg2;
				@Pc(813) Npc local813 = local806.aClass8_Sub2_Sub1_Sub2_Sub2_2;
				Static616.anInt9417 = 2;
				Static305.anInt4882 = arg0;
				Static481.anInt7215 = 0;
				@Pc(831) OutboundPacket local831 = Static293.method4335(local750, Static405.aClass153_2.aIsaacRandom_1);
				local831.aPacketBit_1.p1_alt1(Static334.aKeyboard1.method8479(82) ? 1 : 0);
				local831.aPacketBit_1.p2_alt2(local26);
				Static405.aClass153_2.method3275(local831);
				Static147.method2419(0, local813.anIntArray878[0], local813.method9302((byte) 76), true, local813.anIntArray879[0], 0, -2, local813.method9302((byte) 103));
			}
		}
		@Pc(878) ClientProt local878 = null;
		if (local22 == 19) {
			local878 = Static57.aClientProt10;
		} else if (local22 == 13) {
			local878 = Static180.aClientProt33;
		} else if (local22 == 46) {
			local878 = Static402.aClientProt72;
		} else if (local22 == 8) {
			local878 = Static185.aClientProt35;
		} else if (local22 == 1010) {
			local878 = Static236.aClientProt50;
		} else if (local22 == 1008) {
			local878 = Static342.aClientProt61;
		}
		@Pc(949) OutboundPacket local949;
		if (local878 != null) {
			Static305.anInt4882 = arg0;
			Static616.anInt9417 = 2;
			Static481.anInt7215 = 0;
			Static676.anInt10206 = arg2;
			local949 = Static293.method4335(local878, Static405.aClass153_2.aIsaacRandom_1);
			local949.aPacketBit_1.p1_alt1(Static334.aKeyboard1.method8479(82) ? 1 : 0);
			local949.aPacketBit_1.p2_alt2(Static691.anInt10367 + local16);
			local949.aPacketBit_1.p2_alt3((int) (local35 >>> 32) & Integer.MAX_VALUE);
			local949.aPacketBit_1.ip2(local19 + Static116.anInt2270);
			Static405.aClass153_2.method3275(local949);
			Static38.method1001(local16, local35, local19);
		}
		if (local22 == 1003 || local22 == 1001 || local22 == 1006 || local22 == 1009 || local22 == 1004) {
			Static578.method7624(local16, local26, local22);
		}
		if (local22 == 21) {
			Static676.anInt10206 = arg2;
			Static616.anInt9417 = 1;
			Static305.anInt4882 = arg0;
			Static481.anInt7215 = 0;
			local949 = Static293.method4335(Static181.aClientProt34, Static405.aClass153_2.aIsaacRandom_1);
			local949.aPacketBit_1.p2_alt2(Static691.anInt10367 + local16);
			local949.aPacketBit_1.ip2(Static162.anInt2799);
			local949.aPacketBit_1.p4_alt2(Static450.anInt6819);
			local949.aPacketBit_1.p2_alt2(Static116.anInt2270 + local19);
			local949.aPacketBit_1.p2(Static77.anInt1614);
			Static405.aClass153_2.method3275(local949);
			Static147.method2419(0, local19, 1, true, local16, 0, -4, 1);
		}
		if (local22 == 17) {
			Static616.anInt9417 = 2;
			Static481.anInt7215 = 0;
			Static305.anInt4882 = arg0;
			Static676.anInt10206 = arg2;
			local949 = Static293.method4335(Static175.aClientProt31, Static405.aClass153_2.aIsaacRandom_1);
			local949.aPacketBit_1.p2(local16 + Static691.anInt10367);
			local949.aPacketBit_1.p2(Static116.anInt2270 + local19);
			local949.aPacketBit_1.p2_alt3(Static162.anInt2799);
			local949.aPacketBit_1.p4_alt3(Static450.anInt6819);
			local949.aPacketBit_1.ip2(Static77.anInt1614);
			local949.aPacketBit_1.p1(Static334.aKeyboard1.method8479(82) ? 1 : 0);
			local949.aPacketBit_1.ip2(local26);
			Static405.aClass153_2.method3275(local949);
			Static414.method5697(local19, local16);
		}
		if (local22 == 23) {
			@Pc(1200) Linkable_Sub45 local1200 = (Linkable_Sub45) Static18.aHashTable2.get((long) local26);
			if (local1200 != null) {
				@Pc(1205) Npc local1205 = local1200.aClass8_Sub2_Sub1_Sub2_Sub2_2;
				Static481.anInt7215 = 0;
				Static616.anInt9417 = 2;
				Static676.anInt10206 = arg2;
				Static305.anInt4882 = arg0;
				@Pc(1223) OutboundPacket local1223 = Static293.method4335(Static503.aClientProt94, Static405.aClass153_2.aIsaacRandom_1);
				local1223.aPacketBit_1.p2_alt3(Static77.anInt1614);
				local1223.aPacketBit_1.ip2(Static162.anInt2799);
				local1223.aPacketBit_1.ip2(local26);
				local1223.aPacketBit_1.p4_alt3(Static450.anInt6819);
				local1223.aPacketBit_1.p1(Static334.aKeyboard1.method8479(82) ? 1 : 0);
				Static405.aClass153_2.method3275(local1223);
				Static147.method2419(0, local1205.anIntArray878[0], local1205.method9302((byte) 44), true, local1205.anIntArray879[0], 0, -2, local1205.method9302((byte) 50));
			}
		}
		if (local22 == 20 || local22 == 1002) {
			Static120.method2193(local19, local16, arg1.aString86, local26);
		}
		if (local22 == 60) {
			Static676.anInt10206 = arg2;
			Static481.anInt7215 = 0;
			Static305.anInt4882 = arg0;
			Static616.anInt9417 = 2;
			local949 = Static293.method4335(Static419.aClientProt77, Static405.aClass153_2.aIsaacRandom_1);
			local949.aPacketBit_1.p1_alt2(Static334.aKeyboard1.method8479(82) ? 1 : 0);
			local949.aPacketBit_1.ip2(Static116.anInt2270 + local19);
			local949.aPacketBit_1.ip2(Static77.anInt1614);
			local949.aPacketBit_1.p4_alt1(Static450.anInt6819);
			local949.aPacketBit_1.p2_alt3(Static162.anInt2799);
			local949.aPacketBit_1.ip2(local16 + Static691.anInt10367);
			local949.aPacketBit_1.p2_alt2(Integer.MAX_VALUE & (int) (local35 >>> 32));
			Static405.aClass153_2.method3275(local949);
			Static38.method1001(local16, local35, local19);
		}
		if (Static156.aBoolean223) {
			Static470.method6384();
		}
		if (Static67.aComponent10 != null && Static499.anInt7501 == 0) {
			Static178.method2729(Static67.aComponent10);
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(II)Z")
	public static boolean method1218(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
