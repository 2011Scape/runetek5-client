import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
	public static int anInt2797;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt62 = new ServerProt(22, 10);

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt29 = new ClientProt(33, 0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!ca;ILclient!rka;I)V")
	public static void method2585(@OriginalArg(1) Player arg0, @OriginalArg(2) int arg1, @OriginalArg(3) PacketBit arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(15) int local15;
		@Pc(18) int[] local18;
		@Pc(21) int[] local21;
		@Pc(26) int local26;
		@Pc(32) int local32;
		if ((arg3 & 0x8000) != 0) {
			local15 = arg2.g1();
			local18 = new int[local15];
			local21 = new int[local15];
			@Pc(24) int[] local24 = new int[local15];
			for (local26 = 0; local26 < local15; local26++) {
				local32 = arg2.g2();
				if (local32 == 65535) {
					local32 = -1;
				}
				local18[local26] = local32;
				local21[local26] = arg2.g1_alt2();
				local24[local26] = arg2.g2_alt3();
			}
			Static310.method4505(local24, local18, local21, arg0);
		}
		@Pc(77) int local77;
		@Pc(108) int local108;
		if ((arg3 & 0x40) != 0) {
			@Pc(75) int[] local75 = new int[4];
			for (local77 = 0; local77 < 4; local77++) {
				local75[local77] = arg2.ig2();
				if (local75[local77] == 65535) {
					local75[local77] = -1;
				}
			}
			local108 = arg2.g1_alt1();
			Static651.method8515(local75, local108, false, arg0);
		}
		@Pc(141) int local141;
		@Pc(166) boolean local166;
		if ((arg3 & 0x40000) != 0) {
			local15 = arg2.g2_alt3();
			local77 = arg2.g4_alt3();
			if (local15 == 65535) {
				local15 = -1;
			}
			local108 = arg2.g1_alt2();
			local141 = local108 & 0x7;
			local26 = local108 >> 3 & 0xF;
			if (local26 == 15) {
				local26 = -1;
			}
			local166 = (local108 >> 7 & 0x1) == 1;
			arg0.method9309(2, local141, local166, local77, local26, local15);
		}
		if ((arg3 & 0x20000) != 0) {
			arg0.aByte150 = arg2.g1b_alt3();
			arg0.aByte147 = arg2.g1b_alt3();
			arg0.aByte148 = arg2.g1b_alt2();
			arg0.aByte149 = (byte) arg2.g1();
			arg0.anInt10760 = Static333.anInt5455 + arg2.g2_alt3();
			arg0.anInt10752 = Static333.anInt5455 + arg2.g2();
		}
		if ((arg3 & 0x200) != 0) {
			local7 = arg2.g1b_alt2();
		}
		if ((arg3 & 0x2000) != 0) {
			local15 = arg2.g2_alt2();
			arg0.anInt10738 = arg2.g1();
			arg0.anInt10731 = arg2.g1_alt2();
			arg0.aBoolean818 = (local15 & 0x8000) != 0;
			arg0.anInt10737 = local15 & 0x7FFF;
			arg0.anInt10719 = arg0.anInt10738 + arg0.anInt10737 + Static333.anInt5455;
		}
		if ((arg3 & 0x80000) != 0) {
			local15 = arg2.ig2();
			local77 = arg2.g4_alt3();
			if (local15 == 65535) {
				local15 = -1;
			}
			local108 = arg2.g1_alt2();
			local141 = local108 & 0x7;
			local26 = local108 >> 3 & 0xF;
			if (local26 == 15) {
				local26 = -1;
			}
			local166 = (local108 >> 7 & 0x1) == 1;
			arg0.method9309(3, local141, local166, local77, local26, local15);
		}
		if ((arg3 & 0x100000) != 0) {
			arg0.aBoolean125 = arg2.g1_alt2() == 1;
		}
		if ((arg3 & 0x4) != 0) {
			local15 = arg2.g1();
			if (local15 > 0) {
				for (local77 = 0; local77 < local15; local77++) {
					local141 = -1;
					local26 = -1;
					local108 = arg2.gSamrt1or2();
					local32 = -1;
					if (local108 == 32767) {
						local108 = arg2.gSamrt1or2();
						local26 = arg2.gSamrt1or2();
						local141 = arg2.gSamrt1or2();
						local32 = arg2.gSamrt1or2();
					} else if (local108 == 32766) {
						local108 = -1;
					} else {
						local26 = arg2.gSamrt1or2();
					}
					@Pc(436) int local436 = arg2.gSamrt1or2();
					@Pc(440) int local440 = arg2.g1_alt2();
					arg0.method9301(local32, local436, local440, local26, Static333.anInt5455, local141, local108);
				}
			}
		}
		if ((arg3 & 0x10000) != 0) {
			local15 = arg2.g1_alt3();
			local18 = new int[local15];
			local21 = new int[local15];
			for (local141 = 0; local141 < local15; local141++) {
				local26 = arg2.g2_alt2();
				if ((local26 & 0xC000) == 49152) {
					local32 = arg2.g2();
					local18[local141] = local32 | local26 << 16;
				} else {
					local18[local141] = local26;
				}
				local21[local141] = arg2.g2_alt2();
			}
			arg0.method9315(local21, local18);
		}
		if ((arg3 & 0x8) != 0) {
			local15 = arg2.g1_alt3();
			@Pc(540) byte[] local540 = new byte[local15];
			@Pc(545) Packet local545 = new Packet(local540);
			arg2.gdata(local540, 0, local15);
			Static462.aPacketArray1[arg1] = local545;
			arg0.method1420(local545);
		}
		if ((arg3 & 0x4000) != 0) {
			@Pc(574) String local574 = arg2.gjstr();
			if (local574.charAt(0) == '~') {
				local574 = local574.substring(1);
				Static44.method1072(local574, arg0.method1424(false), 0, arg0.aString8, arg0.method1422(), 2);
			} else if (arg0 == Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2) {
				Static44.method1072(local574, arg0.method1424(false), 0, arg0.aString8, arg0.method1422(), 2);
			}
			arg0.method1413(0, 0, local574);
		}
		if ((arg3 & 0x400) != 0) {
			arg0.aBoolean128 = arg2.g1_alt3() == 1;
		}
		if ((arg3 & 0x1) != 0) {
			Static139.aByteArray30[arg1] = arg2.g1b_alt3();
		}
		if ((arg3 & 0x10) != 0) {
			local15 = arg2.g2_alt2();
			if (local15 == 65535) {
				local15 = -1;
			}
			arg0.anInt10722 = local15;
		}
		if ((arg3 & 0x1000) != 0) {
			arg0.anInt10750 = arg2.g1b_alt3();
			arg0.anInt10753 = arg2.g1b();
			arg0.anInt10761 = arg2.g1b_alt1();
			arg0.anInt10758 = arg2.g1b_alt1();
			arg0.anInt10759 = arg2.ig2() + Static333.anInt5455;
			arg0.anInt10755 = arg2.g2_alt3() + Static333.anInt5455;
			arg0.anInt10754 = arg2.g1_alt1();
			if (arg0.aBoolean127) {
				arg0.anInt10764 = 0;
				arg0.anInt10758 += arg0.anInt1448;
				arg0.anInt10750 += arg0.anInt1441;
				arg0.anInt10753 += arg0.anInt1448;
				arg0.anInt10761 += arg0.anInt1441;
			} else {
				arg0.anInt10761 += arg0.anIntArray879[0];
				arg0.anInt10764 = 1;
				arg0.anInt10758 += arg0.anIntArray878[0];
				arg0.anInt10753 += arg0.anIntArray878[0];
				arg0.anInt10750 += arg0.anIntArray879[0];
			}
			arg0.anInt10762 = 0;
		}
		if ((arg3 & 0x20) != 0) {
			arg0.anInt1467 = arg2.g2();
			if (arg0.anInt10764 == 0) {
				arg0.method9305(arg0.anInt1467);
				arg0.anInt1467 = -1;
			}
		}
		if ((arg3 & 0x2) != 0) {
			local15 = arg2.g2();
			local77 = arg2.g4_alt1();
			if (local15 == 65535) {
				local15 = -1;
			}
			local108 = arg2.g1_alt1();
			local141 = local108 & 0x7;
			local26 = local108 >> 3 & 0xF;
			if (local26 == 15) {
				local26 = -1;
			}
			local166 = (local108 >> 7 & 0x1) == 1;
			arg0.method9309(0, local141, local166, local77, local26, local15);
		}
		if ((arg3 & 0x100) != 0) {
			local15 = arg2.g2_alt3();
			if (local15 == 65535) {
				local15 = -1;
			}
			local77 = arg2.g4_alt3();
			local108 = arg2.g1_alt2();
			local141 = local108 & 0x7;
			local26 = local108 >> 3 & 0xF;
			if (local26 == 15) {
				local26 = -1;
			}
			local166 = (local108 >> 7 & 0x1) == 1;
			arg0.method9309(1, local141, local166, local77, local26, local15);
		}
		if (!arg0.aBoolean127) {
			return;
		}
		if (local7 == 127) {
			arg0.method1419(arg0.anInt1441, arg0.anInt1448);
			return;
		}
		@Pc(985) byte local985;
		if (local7 == -1) {
			local985 = Static139.aByteArray30[arg1];
		} else {
			local985 = local7;
		}
		Static702.method9166(arg0, local985);
		arg0.method1425(arg0.anInt1448, arg0.anInt1441, local985);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIII)V")
	public static void method2586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static400.aClass2_Sub34_28.aPreference_Sub25_3.method7208() != 0 && arg3 != 0 && Static33.anInt779 < 50 && arg2 != -1) {
			Static409.aClass104Array1[Static33.anInt779++] = new Class104((byte) 1, arg2, arg3, arg1, arg4, 0, arg0, (ParticleNode_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method2588() {
		@Pc(8) PacketBit local8 = Connection.gameConnection.aClass2_Sub21_Sub2_2;
		while (local8.availableBits(Connection.gameConnection.anInt3648) >= 15) {
			@Pc(22) int local22 = local8.gBit(15);
			if (local22 == 32767) {
				break;
			}
			@Pc(29) boolean local29 = false;
			@Pc(36) Linkable_Sub45 local36 = (Linkable_Sub45) Static18.aHashTable2.get((long) local22);
			@Pc(42) Npc local42;
			if (local36 == null) {
				local42 = new Npc();
				local42.anInt10740 = local22;
				local36 = new Linkable_Sub45(local42);
				Static18.aHashTable2.put((long) local22, local36);
				Static592.aClass2_Sub45Array1[Static416.anInt6378++] = local36;
				local29 = true;
			}
			local42 = local36.aClass8_Sub2_Sub1_Sub2_Sub2_2;
			Static103.anIntArray187[Static390.anInt6126++] = local22;
			local42.anInt10751 = Static572.anInt8896;
			if (local42.aNpcType1 != null && local42.aNpcType1.method5984()) {
				Static58.method1259(local42);
			}
			@Pc(108) int local108 = local8.gBit(3) + 4 << 11 & 0x3A6E;
			@Pc(113) int local113 = local8.gBit(1);
			if (local113 == 1) {
				Static458.anIntArray553[Static86.anInt1798++] = local22;
			}
			@Pc(131) int local131 = local8.gBit(5);
			if (local131 > 15) {
				local131 -= 32;
			}
			@Pc(144) int local144 = local8.gBit(2);
			local42.method9328(Static690.aNpcTypeList2.method7092(local8.gBit(15)));
			@Pc(159) int local159 = local8.gBit(5);
			if (local159 > 15) {
				local159 -= 32;
			}
			@Pc(170) int local170 = local8.gBit(1);
			local42.method9310(local42.aNpcType1.anInt6713);
			local42.anInt10757 = local42.aNpcType1.lb << 3;
			if (local29) {
				local42.method9298(local108, true);
			}
			local42.method9326(local170 == 1, local131 + Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray878[0], local159 + Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray879[0], local144, local42.method9302((byte) 91));
			if (local42.aNpcType1.method5984()) {
				Static89.method1714(local42.aByte144, (Player) null, local42.anIntArray879[0], local42.anIntArray878[0], local42, (LocType) null, 0);
			}
		}
		local8.bytes();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IFFF)I")
	public static int method2589(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(20) float local20 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(30) float local30 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(40) float local40 = arg0 < 0.0F ? -arg0 : arg0;
		if (local30 > local20 && local40 < local30) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local20 < local40 && local30 < local40) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
