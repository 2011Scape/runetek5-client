import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
	public static int anInt3882;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
	public static int anInt3888;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "Lclient!hh;")
	public static final Class162 aClass162_3 = new Class162("LIVE", 0);

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
	public static int anInt3885 = -1;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z")
	public static boolean method3444(@OriginalArg(0) int arg0) {
		if (arg0 == 19 || arg0 == 13 || arg0 == 46 || arg0 == 8 || arg0 == 1010 || arg0 == 1008) {
			return true;
		} else {
			return arg0 == 60;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!ge;Ljava/lang/String;)I")
	public static int method3446(@OriginalArg(1) Packet arg0, @OriginalArg(2) String arg1) {
		@Pc(12) int local12 = arg0.pos;
		@Pc(16) byte[] local16 = Static469.method6361(arg1);
		arg0.pSmart1or2(local16.length);
		arg0.pos += Static636.aHuffmanCodec1.method4440(arg0.pos, 0, local16.length, arg0.data, local16);
		return arg0.pos - local12;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)V")
	public static void method3447(@OriginalArg(0) boolean arg0) {
		if (Static449.aClass364_1 == null) {
			Static229.method3368();
		}
		if (arg0) {
			Static449.aClass364_1.method8371();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)I")
	public static int method3448() {
		@Pc(12) int local12;
		if (Static400.aClass2_Sub34_28.aPreference_Sub10_1.method3519() == 0) {
			for (local12 = 0; local12 < Static671.anInt10026; local12++) {
				if (Static194.anInterface27Array1[local12].method2666() == 's' || Static194.anInterface27Array1[local12].method2666() == 'S') {
					Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aPreference_Sub10_1);
					Static416.aBoolean472 = true;
					break;
				}
			}
		}
		@Pc(74) int local74;
		if (Static198.aClass140_1 == Static473.aClass140_22) {
			@Pc(65) Runtime local65 = Runtime.getRuntime();
			local74 = (int) ((local65.totalMemory() - local65.freeMemory()) / 1024L);
			@Pc(77) long local77 = Static588.method7715();
			if (Static6.aLong8 == 0L) {
				Static6.aLong8 = local77;
			}
			if (local74 > 16384 && local77 - Static6.aLong8 < 5000L) {
				if (local77 - Static549.aLong282 > 1000L) {
					System.gc();
					Static549.aLong282 = local77;
				}
				return 0;
			}
		}
		if (Static198.aClass140_2 == Static473.aClass140_22) {
			if (Static228.aJs5MasterIndex1 == null) {
				Static228.aJs5MasterIndex1 = new Js5MasterIndex(Static500.aJs5NetQueue3, Static66.aJs5CacheQueue1, ClientConfig.aBigInteger5, ClientConfig.aBigInteger6);
			}
			if (!Static228.aJs5MasterIndex1.method5800()) {
				return 0;
			}
			Static595.method7807((String) null, true, 0);
			Static297.aBoolean368 = !Static589.method7721();
			Static177.aJs535 = Static109.method2069(false, Static297.aBoolean368 ? 34 : 32, 1);
			Static516.aJs597 = Static109.method2069(false, 33, 1);
			Static697.aJs5123 = Static109.method2069(false, 13, 1);
		}
		@Pc(184) boolean local184;
		if (Static198.aClass140_3 == Static473.aClass140_22) {
			local184 = Static516.aJs597.method7591();
			local74 = Static226.aJs5CachedResourceProviderArray8[33].method6644();
			local74 += Static226.aJs5CachedResourceProviderArray8[Static297.aBoolean368 ? 34 : 32].method6644();
			local74 += Static226.aJs5CachedResourceProviderArray8[13].method6644();
			local74 += local184 ? 100 : Static516.aJs597.method7582();
			if (local74 != 400) {
				return local74 / 4;
			}
			Static324.anInt5129 = Static177.aJs535.method7576();
			Static466.anInt7042 = Static516.aJs597.method7576();
			Static616.method8284(Static177.aJs535);
			@Pc(250) int local250 = Static400.aClass2_Sub34_28.aPreference_Sub11_1.method3603();
			Static333.aClass279_1 = new Class279(Static392.aModeGame4, Static51.anInt1052, Static516.aJs597);
			@Pc(262) int[] local262 = Static333.aClass279_1.method6275(local250);
			if (local262.length == 0) {
				local262 = Static333.aClass279_1.method6275(0);
			}
			@Pc(276) Class398 local276 = new Class398(Static177.aJs535, Static697.aJs5123);
			if (local262.length > 0) {
				Static234.anInterface22Array1 = new Interface22[local262.length];
				for (@Pc(285) int local285 = 0; local285 < Static234.anInterface22Array1.length; local285++) {
					Static234.anInterface22Array1[local285] = new Class354(Static333.aClass279_1.method6277(local262[local285]), local276);
				}
			}
		}
		if (Static198.aClass140_4 == Static473.aClass140_22) {
			Static82.method1592(Static697.aJs5123, Static177.aJs535, Static52.method1159());
		}
		if (Static198.aClass140_5 == Static473.aClass140_22) {
			local12 = Static359.method5226();
			local74 = Static714.method9339();
			if (local74 > local12) {
				return local12 * 100 / local74;
			}
		}
		if (Static198.aClass140_6 == Static473.aClass140_22) {
			if (Static234.anInterface22Array1 != null && Static234.anInterface22Array1.length > 0) {
				if (Static234.anInterface22Array1[0].method8460() < 100) {
					return 0;
				}
				if (Static234.anInterface22Array1.length > 1 && Static333.aClass279_1.method6276() && Static234.anInterface22Array1[1].method8460() < 100) {
					return 0;
				}
			}
			Static570.method7549(Static163.aClass19_17);
			Static469.method6358(Static163.aClass19_17);
			Static81.method1586(1);
		}
		if (Static198.aClass140_7 == Static473.aClass140_22) {
			for (local12 = 0; local12 < 4; local12++) {
				Static577.aClass110Array1[local12] = Static125.method2219(Static720.anInt10859, Static501.anInt7568);
			}
		}
		if (Static473.aClass140_22 == Static198.aClass140_8) {
			Static721.aJs5128 = Static109.method2069(false, 8, 1);
			Static344.aJs573 = Static109.method2069(false, 0, 1);
			Static142.aJs525 = Static109.method2069(false, 1, 1);
			Static6.aJs51 = Static109.method2069(false, 2, 1);
			Static554.aJs5105 = Static109.method2069(false, 3, 1);
			Static281.aJs560 = Static109.method2069(false, 4, 1);
			Static93.aJs516 = Static109.method2069(true, 5, 1);
			Static398.aJs581 = Static109.method2069(true, 6, 1);
			Static190.aJs538 = Static109.method2069(false, 7, 1);
			Static534.aJs5104 = Static109.method2069(false, 9, 1);
			Static463.aJs593 = Static109.method2069(false, 10, 1);
			Static340.aJs569 = Static109.method2069(false, 11, 1);
			Static31.aJs56 = Static109.method2069(false, 12, 1);
			Static147.aJs526 = Static109.method2069(false, 14, 1);
			Static405.aJs584 = Static109.method2069(false, 15, 1);
			Static459.aJs591 = Static109.method2069(false, 16, 1);
			Static20.aJs53 = Static109.method2069(false, 17, 1);
			Static333.aJs566 = Static109.method2069(false, 18, 1);
			Static380.aJs579 = Static109.method2069(false, 19, 1);
			Static668.aJs5119 = Static109.method2069(false, 20, 1);
			Static271.aJs559 = Static109.method2069(false, 21, 1);
			Static233.aJs552 = Static109.method2069(false, 22, 1);
			Static120.aJs519 = Static109.method2069(true, 23, 1);
			Static58.aJs512 = Static109.method2069(false, 24, 1);
			Static244.aJs555 = Static109.method2069(false, 25, 1);
			Static199.aJs542 = Static109.method2069(true, 26, 1);
			Static88.aJs514 = Static109.method2069(false, 27, 1);
			Static336.aJs568 = Static109.method2069(true, 28, 1);
			Static140.aJs524 = Static109.method2069(false, 29, 1);
			Static504.aJs595 = Static109.method2069(true, 35, 1);
			Static614.aJs5114 = Static109.method2069(true, 30, 1);
			Static124.aJs520 = Static109.method2069(true, 31, 1);
			Static709.aJs5127 = Static109.method2069(true, 36, 2);
		}
		if (Static473.aClass140_22 == Static198.aClass140_9) {
			local12 = 0;
			for (local74 = 0; local74 < 37; local74++) {
				if (Static226.aJs5CachedResourceProviderArray8[local74] != null) {
					local12 += Static226.aJs5CachedResourceProviderArray8[local74].method6644() * Static462.anIntArray556[local74] / 100;
				}
			}
			if (local12 != 100) {
				if (Static669.anInt9996 < 0) {
					Static669.anInt9996 = local12;
				}
				return (local12 - Static669.anInt9996) * 100 / (100 - Static669.anInt9996);
			}
			Static204.method3079(Static721.aJs5128);
			Static82.method1592(Static697.aJs5123, Static721.aJs5128, Static52.method1159());
		}
		if (Static473.aClass140_22 == Static198.aClass140_10) {
			@Pc(746) byte[] local746 = Static336.aJs568.method7589(4);
			if (local746 == null) {
				return 0;
			}
			Static9.method124(local746);
			Static674.method8806();
			Static81.method1586(2);
		}
		if (Static198.aClass140_11 == Static473.aClass140_22) {
			Static529.method7096(Static614.aJs5114, Static446.aSignlink6);
		}
		if (Static198.aClass140_12 == Static473.aClass140_22) {
			local12 = Static460.method6266();
			if (local12 < 100) {
				return local12;
			}
			Static502.method6721(Static336.aJs568.method7589(1));
			Static65.aClass3_1 = new Class3(Static336.aJs568);
			Static76.aShortArrayArray2 = Static65.aClass3_1.aShortArrayArray1;
			Static339.aShortArrayArrayArray2 = Static65.aClass3_1.aShortArrayArrayArray1;
			Static125.aClass388_1 = new Class388(Static336.aJs568);
		}
		if (Static198.aClass140_13 == Static473.aClass140_22) {
			if (Static65.aClass3_1.anInt81 != -1 && !Static190.aJs538.method7586(0, Static65.aClass3_1.anInt81)) {
				return 99;
			}
			Static56.anInterface4_3 = new Js5TextureProvider(Static199.aJs542, Static534.aJs5104, Static721.aJs5128);
			Static386.aParamTypeList2 = new ParamTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51);
			Static574.aBasTypeList2 = new BasTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51, Static125.aClass388_1);
			Static354.aCursorTypeList1 = new CursorTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51, Static721.aJs5128);
			Static619.aEnumTypeList2 = new EnumTypeList(Static392.aModeGame4, Static51.anInt1052, Static20.aJs53);
			Static467.aFloTypeList3 = new FloTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51);
			Static540.aFluTypeList6 = new FluTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51);
			Static561.aHitmarkTypeList2 = new HitmarkTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51, Static721.aJs5128);
			Static68.aIdkTypeList3 = new IdkTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51, Static190.aJs538);
			Static503.aInvTypeList1 = new InvTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51);
			Static48.aLightTypeList1 = new LightTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51);
			Static354.aLocTypeList4 = new LocTypeList(Static392.aModeGame4, Static51.anInt1052, true, Static459.aJs591, Static190.aJs538);
			Static577.aMelTypeList4 = new MelTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51, Static721.aJs5128);
			Static720.aMsiTypeList4 = new MsiTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51, Static721.aJs5128);
			Static690.aNpcTypeList2 = new NpcTypeList(Static392.aModeGame4, Static51.anInt1052, true, Static333.aJs566, Static190.aJs538);
			Static419.aObjTypeList1 = new ObjTypeList(Static392.aModeGame4, Static51.anInt1052, true, Static386.aParamTypeList2, Static380.aJs579, Static190.aJs538);
			Static272.aQuestTypeList1 = new QuestTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51);
			Static25.aSeqTypeList1 = new SeqTypeList(Static392.aModeGame4, Static51.anInt1052, Static668.aJs5119, Static344.aJs573, Static142.aJs525);
			Static324.aSkyBoxTypeList1 = new SkyBoxTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51);
			Static99.aSkyBoxSphereTypeList1 = new SkyBoxSphereTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51);
			Static23.aSpotAnimTypeList1 = new SpotAnimTypeList(Static392.aModeGame4, Static51.anInt1052, Static271.aJs559, Static190.aJs538);
			Static652.aStructTypeList1 = new StructTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51);
			Static718.aVarClientStrTypeList1 = new VarClientStrTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51);
			Static691.aVarClientTypeList1 = new VarClientTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51);
			Static529.aVarBitTypeList1 = new VarBitTypeList(Static392.aModeGame4, Static51.anInt1052, Static233.aJs552);
			Static36.aVarPlayerTypeList1 = new VarPlayerTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51);
			Static628.aVarClanTypeList5 = new VarClanTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51);
			Static648.aVarClanSettingTypeList1 = new VarClanSettingTypeList(Static392.aModeGame4, Static51.anInt1052, Static6.aJs51);
			Static444.method5987(Static554.aJs5105, Static697.aJs5123, Static721.aJs5128, Static190.aJs538);
			Static110.method2081(Static140.aJs524);
			Static68.aQuickChatCatTypeList3 = new QuickChatCatTypeList(Static51.anInt1052, Static58.aJs512, Static244.aJs555);
			Static288.aQuickChatPhraseTypeList2 = new QuickChatPhraseTypeList(Static51.anInt1052, Static58.aJs512, Static244.aJs555, new Js5QuickChatCommandDecoder());
			Static412.method5693();
			Static354.aLocTypeList4.setLowDetail(Static400.aClass2_Sub34_28.aPreference_Sub19_2.method5960() == 0);
			Static34.aClass304_1 = new Class304();
			Static296.method4362();
			Static44.method1074(Static25.aSeqTypeList1);
			Static187.method2844(Static88.aJs514);
			Static405.method5592(Static56.anInterface4_3, Static190.aJs538);
			@Pc(1119) HuffmanCodec local1119 = new HuffmanCodec(Static463.aJs593.method7600("huffman", ""));
			Static342.method4462(local1119);
			try {
				jagmisc.init();
			} catch (@Pc(1126) Throwable local1126) {
			}
			Static600.aTimer1 = Static570.method7550();
			Static292.aClass2_Sub43_2 = new Linkable_Sub43(true, Static446.aSignlink6);
		}
		if (Static198.aClass140_15 == Static473.aClass140_22) {
			local12 = Static188.method2860(Static721.aJs5128) + Static372.method5291(true);
			local74 = Static688.method8974() + Static714.method9339();
			if (local12 < local74) {
				return local12 * 100 / local74;
			}
		}
		if (Static198.aClass140_16 == Static473.aClass140_22) {
			Static30.method5065(Static120.aJs519, Static467.aFloTypeList3, Static540.aFluTypeList6, Static354.aLocTypeList4, Static577.aMelTypeList4, Static720.aMsiTypeList4, Static34.aClass304_1);
		}
		if (Static198.aClass140_17 == Static473.aClass140_22) {
			Static37.aStringArray4 = new String[Static718.aVarClientStrTypeList1.anInt4266];
			Static511.anIntArray614 = new int[Static691.aVarClientTypeList1.anInt5473];
			Static118.aBooleanArray4 = new boolean[Static691.aVarClientTypeList1.anInt5473];
			for (local12 = 0; local12 < Static691.aVarClientTypeList1.anInt5473; local12++) {
				if (Static691.aVarClientTypeList1.method4947(local12).anInt7174 == 0) {
					Static118.aBooleanArray4[local12] = true;
					Static319.anInt5078++;
				}
				Static511.anIntArray614[local12] = -1;
			}
			Static218.method3189();
			Static93.aJs516.method7575(false);
			Static398.aJs581.method7575(true);
			Static721.aJs5128.method7575(true);
			Static697.aJs5123.method7575(true);
			Static463.aJs593.method7575(true);
			Static6.aJs51.anInt8555 = 2;
			Static666.aBoolean766 = true;
			Static20.aJs53.anInt8555 = 2;
			Static459.aJs591.anInt8555 = 2;
			Static333.aJs566.anInt8555 = 2;
			Static380.aJs579.anInt8555 = 2;
			Static668.aJs5119.anInt8555 = 2;
			Static271.aJs559.anInt8555 = 2;
		}
		if (Static473.aClass140_22 == Static198.aClass140_18) {
			if (!Static571.method7566(Static65.aClass3_1.anInt88)) {
				return 0;
			}
			local184 = true;
			for (local74 = 0; local74 < Static453.aComponentArrayArray2[Static65.aClass3_1.anInt88].length; local74++) {
				@Pc(1315) Component local1315 = Static453.aComponentArrayArray2[Static65.aClass3_1.anInt88][local74];
				if (local1315.anInt3820 == 5 && local1315.anInt3810 != -1 && !Static721.aJs5128.method7586(0, local1315.anInt3810)) {
					local184 = false;
				}
			}
			if (!local184) {
				return 0;
			}
		}
		if (Static198.aClass140_19 == Static473.aClass140_22) {
			Static456.method6228(true);
		}
		if (Static198.aClass140_20 == Static473.aClass140_22) {
			Static449.aClass364_1.method8372();
			try {
				Static242.aThread1.join();
			} catch (@Pc(1370) InterruptedException local1370) {
				return 0;
			}
			Static234.anInterface22Array1 = null;
			Static449.aClass364_1 = null;
			Static177.aJs535 = null;
			Static516.aJs597 = null;
			Static242.aThread1 = null;
			Static333.aClass279_1 = null;
			Static9.method123();
			Static3.aBoolean4 = Static400.aClass2_Sub34_28.aPreference_Sub10_1.method3519() == 1;
			Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aPreference_Sub10_1);
			if (Static3.aBoolean4) {
				Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aPreference_Sub29_2);
			} else if (Static400.aClass2_Sub34_28.aPreference_Sub29_2.aBoolean674 && Static292.aClass2_Sub43_2.anInt7610 < 512 && Static292.aClass2_Sub43_2.anInt7610 != 0) {
				Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aPreference_Sub29_2);
			}
			Static666.method8693(1);
			if (Static3.aBoolean4) {
				Static32.method880(0, false);
			} else {
				Static32.method880(Static400.aClass2_Sub34_28.aPreference_Sub29_2.method7915(), false);
			}
			Static409.method5657(Static400.aClass2_Sub34_28.aPreference_Sub1_1.method1485(), -1, false, -1);
			Static570.method7549(Static163.aClass19_17);
			Static469.method6358(Static163.aClass19_17);
			Static239.method3472(Static721.aJs5128, Static163.aClass19_17);
			Static331.method4925(Static679.aSoftwareIndexedSpriteArray14);
		}
		return Static694.method9030();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZLclient!hda;)V")
	public static void method3449(@OriginalArg(1) Component arg0) {
		if (Static376.anInt5921 != arg0.anInt3806) {
			return;
		}
		if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9 == null) {
			arg0.anInt3831 = 0;
			arg0.anInt3738 = 0;
			return;
		}
		arg0.anInt3807 = 150;
		arg0.anInt3811 = (int) (Math.sin((double) Static333.anInt5455 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt3823 = 5;
		arg0.anInt3831 = Static312.anInt5000;
		arg0.anInt3738 = Static214.method3157(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9);
		@Pc(55) Class152 local55 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass152_10;
		if (local55 == null) {
			arg0.aClass152_6 = null;
			return;
		}
		if (arg0.aClass152_6 == null) {
			arg0.aClass152_6 = new Class152_Sub1();
		}
		arg0.anInt3789 = local55.method9114();
		arg0.aClass152_6.method9096(local55);
	}
}
