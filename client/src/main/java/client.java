import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;

import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends GameShell {

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "[Lclient!pm;")
	public static final Js5CachedResourceProvider[] js5Providers = new Js5CachedResourceProvider[37];
	@OriginalMember(owner = "client!gha", name = "t", descriptor = "[Lclient!mj;")
	public static final BufferedFile[] cacheIndexes = new BufferedFile[37];
	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "Lclient!mj;")
	public static BufferedFile cacheData;
	@OriginalMember(owner = "client!hba", name = "n", descriptor = "Lclient!nj;")
	public static Js5MasterIndex js5MasterIndex;
	@OriginalMember(owner = "client!ila", name = "i", descriptor = "Lclient!af;")
	public static Cache masterCache;
	@OriginalMember(owner = "client!fia", name = "m", descriptor = "Lclient!sb;")
	public static Js5 loadingSprites;
	@OriginalMember(owner = "client!qe", name = "b", descriptor = "Lclient!sb;")
	public static Js5 loadingScreen;
	@OriginalMember(owner = "client!wb", name = "Y", descriptor = "Lclient!sb;")
	public static Js5 fontMetrics;
	@OriginalMember(owner = "client!po", name = "h", descriptor = "Lclient!pla;")
	public static Js5NetQueue js5NetQueue;
	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!iba;")
	public static Js5CacheQueue js5CacheQueue;
	@OriginalMember(owner = "client!ws", name = "I", descriptor = "Lclient!sb;")
	public static Js5 sprites;
	@OriginalMember(owner = "client!kr", name = "g", descriptor = "Lclient!sb;")
	public static Js5 anims;
	@OriginalMember(owner = "client!eha", name = "c", descriptor = "Lclient!sb;")
	public static Js5 bases;
	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!sb;")
	public static Js5 config;
	@OriginalMember(owner = "client!rha", name = "c", descriptor = "Lclient!sb;")
	public static Js5 interfaces;
	@OriginalMember(owner = "client!iq", name = "a", descriptor = "Lclient!sb;")
	public static Js5 synthSounds;
	@OriginalMember(owner = "client!cu", name = "gb", descriptor = "Lclient!sb;")
	public static Js5 maps;
	@OriginalMember(owner = "client!mj", name = "u", descriptor = "Lclient!sb;")
	public static Js5 midiSongs;
	@OriginalMember(owner = "client!fs", name = "d", descriptor = "Lclient!sb;")
	public static Js5 models;
	@OriginalMember(owner = "client!qq", name = "g", descriptor = "Lclient!sb;")
	public static Js5 textures;
	@OriginalMember(owner = "client!oka", name = "l", descriptor = "Lclient!sb;")
	public static Js5 binary;
	@OriginalMember(owner = "client!kn", name = "g", descriptor = "Lclient!sb;")
	public static Js5 midiJingles;
	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Lclient!sb;")
	public static Js5 clientscripts;
	@OriginalMember(owner = "client!eka", name = "l", descriptor = "Lclient!sb;")
	public static Js5 vorbis;
	@OriginalMember(owner = "client!mn", name = "b", descriptor = "Lclient!sb;")
	public static Js5 midiInstruments;
	@OriginalMember(owner = "client!oia", name = "r", descriptor = "Lclient!sb;")
	public static Js5 configLoc;
	@OriginalMember(owner = "client!ala", name = "b", descriptor = "Lclient!sb;")
	public static Js5 configEnum;
	@OriginalMember(owner = "client!kj", name = "a", descriptor = "Lclient!sb;")
	public static Js5 configNpc;
	@OriginalMember(owner = "client!lv", name = "e", descriptor = "Lclient!sb;")
	public static Js5 configObj;
	@OriginalMember(owner = "client!vca", name = "o", descriptor = "Lclient!sb;")
	public static Js5 configSeq;
	@OriginalMember(owner = "client!ij", name = "l", descriptor = "Lclient!sb;")
	public static Js5 configSpot;
	@OriginalMember(owner = "client!he", name = "k", descriptor = "Lclient!sb;")
	public static Js5 configVarbit;
	@OriginalMember(owner = "client!dn", name = "G", descriptor = "Lclient!sb;")
	public static Js5 worldMapData;
	@OriginalMember(owner = "client!bu", name = "O", descriptor = "Lclient!sb;")
	public static Js5 quickchat;
	@OriginalMember(owner = "client!hk", name = "n", descriptor = "Lclient!sb;")
	public static Js5 quickchatGlobal;
	@OriginalMember(owner = "client!gd", name = "H", descriptor = "Lclient!sb;")
	public static Js5 materials;
	@OriginalMember(owner = "client!co", name = "t", descriptor = "Lclient!sb;")
	public static Js5 configParticle;
	@OriginalMember(owner = "client!kka", name = "c", descriptor = "Lclient!sb;")
	public static Js5 defaults;
    @OriginalMember(owner = "client!ega", name = "p", descriptor = "Lclient!sb;")
    public static Js5 configBillboard;
	@OriginalMember(owner = "client!pt", name = "s", descriptor = "Lclient!sb;")
	public static Js5 cutscenes;
	@OriginalMember(owner = "client!th", name = "n", descriptor = "Lclient!sb;")
	public static Js5 dlls;
	@OriginalMember(owner = "client!ds", name = "k", descriptor = "Lclient!sb;")
	public static Js5 shaders;
	@OriginalMember(owner = "client!wh", name = "K", descriptor = "Lclient!sb;")
	public static Js5 js5Archive36;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static426.method1016("Argument count");
			}
			Static527.aClass229_3 = new Class229();
			Static527.aClass229_3.worldId = Integer.parseInt(arg0[0]);
			Static660.aClass229_4 = new Class229();
			Static660.aClass229_4.worldId = Integer.parseInt(arg0[1]);
			Static2.aModeWhere1 = ModeWhere.LOCAL;
			if (arg0[3].equals("live")) {
				Static598.aClass162_5 = Static523.aClass162_3;
			} else if (arg0[3].equals("rc")) {
				Static598.aClass162_5 = Static519.aClass162_4;
			} else if (arg0[3].equals("wip")) {
				Static598.aClass162_5 = Static225.aClass162_1;
			} else {
				Static426.method1016("modewhat");
			}
			Static51.clientLanguageId = Static541.method7198(arg0[4]);
			if (Static51.clientLanguageId == -1) {
				if (arg0[4].equals("english")) {
					Static51.clientLanguageId = 0;
				} else if (arg0[4].equals("german")) {
					Static51.clientLanguageId = 1;
				} else {
					Static426.method1016("language");
				}
			}
			Static464.aBoolean533 = false;
			Static98.aBoolean191 = false;
			if (arg0[5].equals("game0")) {
				Static392.clientModeGame = ModeGame.GAME_RUNESCAPE;
			} else if (arg0[5].equals("game1")) {
				Static392.clientModeGame = ModeGame.GAME_STELLARDAWN;
			} else if (arg0[5].equals("game2")) {
				Static392.clientModeGame = ModeGame.GAME_3;
			} else if (arg0[5].equals("game3")) {
				Static392.clientModeGame = ModeGame.GAME_4;
			} else {
				Static426.method1016("game");
			}
			Static323.affiliate = 0;
			Static715.anInt10805 = 0;
			Static29.aBoolean61 = false;
			Static508.aBoolean582 = true;
			Static126.playerMember = true;
			Static473.aBoolean539 = false;
			Static389.aString64 = null;
			Static338.anInt5562 = Static392.clientModeGame.id;
			Static150.aString26 = "";
			Static265.aByteArray44 = null;
			Static584.country = 0;
			Static416.aLong208 = 0L;
			@Pc(241) client local241 = new client();
			Static295.aClient1 = local241;
			local241.method1635(Static598.aClass162_5.method3469() + 32, Static392.clientModeGame.name);
			Static353.aFrame10.setLocation(40, 40);
		} catch (@Pc(265) Exception local265) {
			Static240.method3496(local265, (String) null);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZIII)Lclient!sb;")
	public static Js5 createJs5(@OriginalArg(0) boolean discardPacked, @OriginalArg(1) int archive, @OriginalArg(2) int discardUnpacked) {
		@Pc(5) Cache cache = null;
		if (cacheData != null) {
			cache = new Cache(archive, cacheData, cacheIndexes[archive], 1000000);
		}

		js5Providers[archive] = js5MasterIndex.getResourceProvider(cache, archive, masterCache);
		js5Providers[archive].prefetchAll();
		return new Js5(js5Providers[archive], discardPacked, discardUnpacked);
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
			@Pc(77) long local77 = Static588.currentTimeWithDrift();
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
			if (js5MasterIndex == null) {
				js5MasterIndex = new Js5MasterIndex(js5NetQueue, js5CacheQueue, ClientConfig.aBigInteger5, ClientConfig.aBigInteger6);
			}
			if (!js5MasterIndex.method5800()) {
				return 0;
			}
			Static595.method7807((String) null, true, 0);
			Static297.aBoolean368 = !Static589.method7721();
			loadingSprites = createJs5(false, Static297.aBoolean368 ? 34 : 32, 1);
			loadingScreen = createJs5(false, 33, 1);
			fontMetrics = createJs5(false, 13, 1);
		}
		@Pc(184) boolean local184;
		if (Static198.aClass140_3 == Static473.aClass140_22) {
			local184 = loadingScreen.fetchAll();
			local74 = js5Providers[33].method6644();
			local74 += js5Providers[Static297.aBoolean368 ? 34 : 32].method6644();
			local74 += js5Providers[13].method6644();
			local74 += local184 ? 100 : loadingScreen.getPercentageComplete();
			if (local74 != 400) {
				return local74 / 4;
			}
			Static324.loadingSpritesChecksum = loadingSprites.getChecksum();
			Static466.loadingScreenChecksum = loadingScreen.getChecksum();
			Static616.method8284(loadingSprites);
			@Pc(250) int local250 = Static400.aClass2_Sub34_28.aPreference_Sub11_1.method3603();
			Static333.aClass279_1 = new Class279(Static392.clientModeGame, Static51.clientLanguageId, loadingScreen);
			@Pc(262) int[] local262 = Static333.aClass279_1.method6275(local250);
			if (local262.length == 0) {
				local262 = Static333.aClass279_1.method6275(0);
			}
			@Pc(276) Class398 local276 = new Class398(loadingSprites, fontMetrics);
			if (local262.length > 0) {
				Static234.anInterface22Array1 = new Interface22[local262.length];
				for (@Pc(285) int local285 = 0; local285 < Static234.anInterface22Array1.length; local285++) {
					Static234.anInterface22Array1[local285] = new Class354(Static333.aClass279_1.method6277(local262[local285]), local276);
				}
			}
		}
		if (Static198.aClass140_4 == Static473.aClass140_22) {
			Static82.method1592(fontMetrics, loadingSprites, Static52.method1159());
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
			sprites = createJs5(false, 8, 1);
			anims = createJs5(false, 0, 1);
			bases = createJs5(false, 1, 1);
			config = createJs5(false, 2, 1);
			interfaces = createJs5(false, 3, 1);
			synthSounds = createJs5(false, 4, 1);
			maps = createJs5(true, 5, 1);
			midiSongs = createJs5(true, 6, 1);
			models = createJs5(false, 7, 1);
			textures = createJs5(false, 9, 1);
			binary = createJs5(false, 10, 1);
			midiJingles = createJs5(false, 11, 1);
			clientscripts = createJs5(false, 12, 1);
			vorbis = createJs5(false, 14, 1);
			midiInstruments = createJs5(false, 15, 1);
			configLoc = createJs5(false, 16, 1);
			configEnum = createJs5(false, 17, 1);
			configNpc = createJs5(false, 18, 1);
			configObj = createJs5(false, 19, 1);
			configSeq = createJs5(false, 20, 1);
			configSpot = createJs5(false, 21, 1);
			configVarbit = createJs5(false, 22, 1);
			worldMapData = createJs5(true, 23, 1);
			quickchat = createJs5(false, 24, 1);
			quickchatGlobal = createJs5(false, 25, 1);
			materials = createJs5(true, 26, 1);
			configParticle = createJs5(false, 27, 1);
			defaults = createJs5(true, 28, 1);
			configBillboard = createJs5(false, 29, 1);
			cutscenes = createJs5(true, 35, 1);
			dlls = createJs5(true, 30, 1);
			shaders = createJs5(true, 31, 1);
			js5Archive36 = createJs5(true, 36, 2);
		}
		if (Static473.aClass140_22 == Static198.aClass140_9) {
			local12 = 0;
			for (local74 = 0; local74 < 37; local74++) {
				if (js5Providers[local74] != null) {
					local12 += js5Providers[local74].method6644() * Static462.anIntArray556[local74] / 100;
				}
			}
			if (local12 != 100) {
				if (Static669.anInt9996 < 0) {
					Static669.anInt9996 = local12;
				}
				return (local12 - Static669.anInt9996) * 100 / (100 - Static669.anInt9996);
			}
			Static204.method3079(sprites);
			Static82.method1592(fontMetrics, sprites, Static52.method1159());
		}
		if (Static473.aClass140_22 == Static198.aClass140_10) {
			@Pc(746) byte[] local746 = defaults.fetchFile(4);
			if (local746 == null) {
				return 0;
			}
			Static9.method124(local746);
			Static674.method8806();
			Static81.method1586(2);
		}
		if (Static198.aClass140_11 == Static473.aClass140_22) {
			Static529.method7096(dlls, Static446.aSignlink6);
		}
		if (Static198.aClass140_12 == Static473.aClass140_22) {
			local12 = Static460.method6266();
			if (local12 < 100) {
				return local12;
			}
			Static502.method6721(defaults.fetchFile(1));
			Static65.aClass3_1 = new Class3(defaults);
			Static76.aShortArrayArray2 = Static65.aClass3_1.aShortArrayArray1;
			Static339.aShortArrayArrayArray2 = Static65.aClass3_1.aShortArrayArrayArray1;
			Static125.aClass388_1 = new Class388(defaults);
		}
		if (Static198.aClass140_13 == Static473.aClass140_22) {
			if (Static65.aClass3_1.anInt81 != -1 && !models.isFileReady(Static65.aClass3_1.anInt81, 0)) {
				return 99;
			}
			Static56.anInterface4_3 = new Js5TextureProvider(materials, textures, sprites);
			Static386.aParamTypeList2 = new ParamTypeList(Static392.clientModeGame, Static51.clientLanguageId, config);
			Static574.aBasTypeList2 = new BasTypeList(Static392.clientModeGame, Static51.clientLanguageId, config, Static125.aClass388_1);
			Static354.aCursorTypeList1 = new CursorTypeList(Static392.clientModeGame, Static51.clientLanguageId, config, sprites);
			Static619.aEnumTypeList2 = new EnumTypeList(Static392.clientModeGame, Static51.clientLanguageId, configEnum);
			Static467.aFloTypeList3 = new FloTypeList(Static392.clientModeGame, Static51.clientLanguageId, config);
			Static540.aFluTypeList6 = new FluTypeList(Static392.clientModeGame, Static51.clientLanguageId, config);
			Static561.aHitmarkTypeList2 = new HitmarkTypeList(Static392.clientModeGame, Static51.clientLanguageId, config, sprites);
			Static68.aIdkTypeList3 = new IdkTypeList(Static392.clientModeGame, Static51.clientLanguageId, config, models);
			Static503.aInvTypeList1 = new InvTypeList(Static392.clientModeGame, Static51.clientLanguageId, config);
			Static48.aLightTypeList1 = new LightTypeList(Static392.clientModeGame, Static51.clientLanguageId, config);
			Static354.aLocTypeList4 = new LocTypeList(Static392.clientModeGame, Static51.clientLanguageId, true, configLoc, models);
			Static577.aMelTypeList4 = new MelTypeList(Static392.clientModeGame, Static51.clientLanguageId, config, sprites);
			Static720.aMsiTypeList4 = new MsiTypeList(Static392.clientModeGame, Static51.clientLanguageId, config, sprites);
			Static690.aNpcTypeList2 = new NpcTypeList(Static392.clientModeGame, Static51.clientLanguageId, true, configNpc, models);
			ObjTypeList.objTypes = new ObjTypeList(Static392.clientModeGame, Static51.clientLanguageId, true, Static386.aParamTypeList2, configObj, models);
			Static272.aQuestTypeList1 = new QuestTypeList(Static392.clientModeGame, Static51.clientLanguageId, config);
			Static25.aSeqTypeList1 = new SeqTypeList(Static392.clientModeGame, Static51.clientLanguageId, configSeq, anims, bases);
			Static324.aSkyBoxTypeList1 = new SkyBoxTypeList(Static392.clientModeGame, Static51.clientLanguageId, config);
			Static99.aSkyBoxSphereTypeList1 = new SkyBoxSphereTypeList(Static392.clientModeGame, Static51.clientLanguageId, config);
			Static23.aSpotAnimTypeList1 = new SpotAnimTypeList(Static392.clientModeGame, Static51.clientLanguageId, configSpot, models);
			Static652.aStructTypeList1 = new StructTypeList(Static392.clientModeGame, Static51.clientLanguageId, config);
			Static718.aVarClientStrTypeList1 = new VarClientStrTypeList(Static392.clientModeGame, Static51.clientLanguageId, config);
			Static691.aVarClientTypeList1 = new VarClientTypeList(Static392.clientModeGame, Static51.clientLanguageId, config);
			Static529.aVarBitTypeList1 = new VarBitTypeList(Static392.clientModeGame, Static51.clientLanguageId, configVarbit);
			Static36.aVarPlayerTypeList1 = new VarPlayerTypeList(Static392.clientModeGame, Static51.clientLanguageId, config);
			Static628.aVarClanTypeList5 = new VarClanTypeList(Static392.clientModeGame, Static51.clientLanguageId, config);
			Static648.aVarClanSettingTypeList1 = new VarClanSettingTypeList(Static392.clientModeGame, Static51.clientLanguageId, config);
			Static444.method5987(interfaces, fontMetrics, sprites, models);
			Static110.method2081(configBillboard);
			Static68.aQuickChatCatTypeList3 = new QuickChatCatTypeList(Static51.clientLanguageId, quickchat, quickchatGlobal);
			Static288.aQuickChatPhraseTypeList2 = new QuickChatPhraseTypeList(Static51.clientLanguageId, quickchat, quickchatGlobal, new Js5QuickChatCommandDecoder());
			Static412.method5693();
			Static354.aLocTypeList4.setLowDetail(Static400.aClass2_Sub34_28.aPreference_Sub19_2.method5960() == 0);
			Static34.aClass304_1 = new Class304();
			Static296.method4362();
			Static44.method1074(Static25.aSeqTypeList1);
			Static187.method2844(configParticle);
			Static405.method5592(Static56.anInterface4_3, models);
			@Pc(1119) HuffmanCodec local1119 = new HuffmanCodec(binary.fetchFile("huffman", ""));
			Static342.method4462(local1119);
			try {
				jagmisc.init();
			} catch (@Pc(1126) Throwable local1126) {
			}
			Static600.aTimer1 = Static570.method7550();
			Static292.aClass2_Sub43_2 = new Linkable_Sub43(true, Static446.aSignlink6);
		}
		if (Static198.aClass140_15 == Static473.aClass140_22) {
			local12 = Static188.method2860(sprites) + Static372.method5291(true);
			local74 = Static688.method8974() + Static714.method9339();
			if (local12 < local74) {
				return local12 * 100 / local74;
			}
		}
		if (Static198.aClass140_16 == Static473.aClass140_22) {
			Static30.method5065(worldMapData, Static467.aFloTypeList3, Static540.aFluTypeList6, Static354.aLocTypeList4, Static577.aMelTypeList4, Static720.aMsiTypeList4, Static34.aClass304_1);
		}
		if (Static198.aClass140_17 == Static473.aClass140_22) {
			Static37.varcstrs = new String[Static718.aVarClientStrTypeList1.anInt4266];
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
			maps.discardNames(false);
			midiSongs.discardNames(true);
			sprites.discardNames(true);
			fontMetrics.discardNames(true);
			binary.discardNames(true);
			config.discardUnpacked = 2;
			Static666.aBoolean766 = true;
			configEnum.discardUnpacked = 2;
			configLoc.discardUnpacked = 2;
			configNpc.discardUnpacked = 2;
			configObj.discardUnpacked = 2;
			configSeq.discardUnpacked = 2;
			configSpot.discardUnpacked = 2;
		}
		if (Static473.aClass140_22 == Static198.aClass140_18) {
			if (!Static571.load(Static65.aClass3_1.anInt88)) {
				return 0;
			}
			local184 = true;
			for (local74 = 0; local74 < Static453.components[Static65.aClass3_1.anInt88].length; local74++) {
				@Pc(1315) Component local1315 = Static453.components[Static65.aClass3_1.anInt88][local74];
				if (local1315.type == 5 && local1315.spriteId != -1 && !sprites.isFileReady(local1315.spriteId, 0)) {
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
			loadingSprites = null;
			loadingScreen = null;
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
			Static666.write(1);
			if (Static3.aBoolean4) {
				Static32.method880(0, false);
			} else {
				Static32.method880(Static400.aClass2_Sub34_28.aPreference_Sub29_2.method7915(), false);
			}
			Static409.method5657(Static400.aClass2_Sub34_28.aPreference_Sub1_1.method1485(), -1, false, -1);
			Static570.method7549(Static163.aClass19_17);
			Static469.method6358(Static163.aClass19_17);
			Static239.method3472(sprites, Static163.aClass19_17);
			Static331.method4925(Static679.aSoftwareIndexedSpriteArray14);
		}
		return Static694.method9030();
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	@Override
	public synchronized void method1641() {
		if (Static166.anApplet1 != null && Static434.canvas == null && !Static446.aSignlink6.aBoolean779) {
			try {
				@Pc(25) Class local25 = Static166.anApplet1.getClass();
				@Pc(31) Field local31 = local25.getDeclaredField("canvas");
				Static434.canvas = (Canvas) local31.get(Static166.anApplet1);
				local31.set(Static166.anApplet1, (Object) null);
				if (Static434.canvas != null) {
					return;
				}
			} catch (@Pc(45) Exception local45) {
			}
		}
		super.method1641();
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	@Override
	protected void doShutDown() {
		if (Static624.aBoolean727) {
			Static266.method6777();
		}
		Static419.method5757();
		if (Static163.aClass19_17 != null) {
			Static163.aClass19_17.cleanup();
		}
		if (Static316.aFrame8 != null) {
			Static655.closeFrame(Static446.aSignlink6, Static316.aFrame8);
			Static316.aFrame8 = null;
		}
		Connection.gameConnection.close();
		Connection.lobbyConnection.close();
		Static173.closeAudioChannels();
		js5NetQueue.shutDown();
		js5CacheQueue.shutDown();
		if (Static151.aClass226_20 != null) {
			Static151.aClass226_20.shutDown();
			Static151.aClass226_20 = null;
		}
		try {
			cacheData.method5566();
			for (@Pc(66) int local66 = 0; local66 < 37; local66++) {
				cacheIndexes[local66].method5566();
			}
			Static5.aBufferedFile1.method5566();
			Static690.aBufferedFile5.method5566();
			Static314.closeAFileOutputStream2();
		} catch (@Pc(91) Exception e) {
			e.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method1656() {
		if (Static522.anInt7900 < js5NetQueue.anInt7453) {
			Static344.aClass229_1.method5260();
			Static370.anInt5876 = (js5NetQueue.anInt7453 * 50 - 50) * 5;
			if (Static370.anInt5876 > 3000) {
				Static370.anInt5876 = 3000;
			}
			if (js5NetQueue.anInt7453 >= 2 && js5NetQueue.anInt7452 == 6) {
				this.method1638("js5connect_outofdate");
				Static283.gameState = 16;
				return;
			}
			if (js5NetQueue.anInt7453 >= 4 && js5NetQueue.anInt7452 == -1) {
				this.method1638("js5crc");
				Static283.gameState = 16;
				return;
			}
			if (js5NetQueue.anInt7453 >= 4 && Static181.method2778(Static283.gameState)) {
				if (js5NetQueue.anInt7452 == 7 || js5NetQueue.anInt7452 == 9) {
					this.method1638("js5connect_full");
				} else if (js5NetQueue.anInt7452 <= 0) {
					this.method1638("js5io");
				} else if (Static376.aString62 == null) {
					this.method1638("js5connect");
				} else {
					this.method1638("js5proxy_" + Static376.aString62.trim());
				}
				Static283.gameState = 16;
				return;
			}
		}
		Static522.anInt7900 = js5NetQueue.anInt7453;
		if (Static370.anInt5876 > 0) {
			Static370.anInt5876--;
			return;
		}
		try {
			if (Static92.anInt1874 == 0) {
				Static514.aPrivilegedRequest6 = Static344.aClass229_1.method5263(Static446.aSignlink6);
				Static92.anInt1874++;
			}
			if (Static92.anInt1874 == 1) {
				if (Static514.aPrivilegedRequest6.state == 2) {
					if (Static514.aPrivilegedRequest6.result != null) {
						Static376.aString62 = (String) Static514.aPrivilegedRequest6.result;
					}
					this.method1667(1000);
					return;
				}
				if (Static514.aPrivilegedRequest6.state == 1) {
					Static92.anInt1874++;
				}
			}
			if (Static92.anInt1874 == 2) {
				Static672.aClientStream2 = new ClientStream((Socket) Static514.aPrivilegedRequest6.result, Static446.aSignlink6, 25000);
				@Pc(251) Packet local251 = new Packet(5);
				local251.p1(Static572.aLoginProt54.opcode);
				local251.p4(667);
				Static672.aClientStream2.method5829(5, local251.data);
				Static92.anInt1874++;
				Static678.aLong310 = Static588.currentTimeWithDrift();
			}
			if (Static92.anInt1874 == 3) {
				if (Static181.method2778(Static283.gameState) || Static672.aClientStream2.method5828() > 0) {
					@Pc(296) int local296 = Static672.aClientStream2.method5824();
					if (local296 != 0) {
						this.method1667(local296);
						return;
					}
					Static92.anInt1874++;
				} else if (Static588.currentTimeWithDrift() - Static678.aLong310 > 30000L) {
					this.method1667(1001);
					return;
				}
			}
			if (Static92.anInt1874 == 4) {
				@Pc(356) boolean local356 = Static181.method2778(Static283.gameState) || Static41.method1027(Static283.gameState) || Static620.isInLobby(Static283.gameState);
				@Pc(359) Class326[] local359 = Static566.method7467();
				@Pc(367) Packet local367 = new Packet(local359.length * 4);
				Static672.aClientStream2.method5825(local367.data.length, 0, local367.data);
				for (@Pc(378) int local378 = 0; local378 < local359.length; local378++) {
					local359[local378].method7468(local367.g4());
				}
				js5NetQueue.method6627(!local356, Static672.aClientStream2);
				Static92.anInt1874 = 0;
				Static672.aClientStream2 = null;
				Static514.aPrivilegedRequest6 = null;
			}
		} catch (@Pc(417) IOException local417) {
			this.method1667(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method1658() {
		@Pc(46) int local46;
		if (Static283.gameState == 7 && !Static242.method3500() || Static283.gameState == 9 && Static169.anInt2855 == 42) {
			if (Static249.rebootTimer > 1) {
				Static249.rebootTimer--;
				Static321.anInt5111 = Static642.anInt9599;
			}
			if (!Static400.aBoolean622) {
				Static79.method1578();
			}
			for (local46 = 0; local46 < 100 && Static236.method3451(Connection.lobbyConnection); local46++) {
			}
		}
		Static35.anInt800++;
		Static449.method6114(-1, -1, (Component) null);
		Static65.method1473(-1, -1, (Component) null);
		Static443.method5981();
		Static642.anInt9599++;
		for (local46 = 0; local46 < Static416.anInt6378; local46++) {
			@Pc(97) Npc local97 = Static592.aClass2_Sub45Array1[local46].aClass8_Sub2_Sub1_Sub2_Sub2_2;
			if (local97 != null) {
				@Pc(103) byte local103 = local97.aNpcType1.aByte103;
				if ((local103 & 0x1) != 0) {
					@Pc(114) int local114 = local97.method9302((byte) 48);
					@Pc(142) int local142;
					if ((local103 & 0x2) != 0 && local97.anInt10764 == 0 && Math.random() * 1000.0D < 10.0D) {
						local142 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(150) int local150 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local142 != 0 || local150 != 0) {
							@Pc(166) int local166 = local142 + local97.anIntArray879[0];
							if (local166 < 0) {
								local166 = 0;
							} else if (local166 > Static720.anInt10859 - local114 - 1) {
								local166 = Static720.anInt10859 - local114 - 1;
							}
							@Pc(203) int local203 = local150 + local97.anIntArray878[0];
							if (local203 < 0) {
								local203 = 0;
							} else if (local203 > Static501.anInt7568 - local114 - 1) {
								local203 = Static501.anInt7568 - local114 - 1;
							}
							@Pc(258) int local258 = Static521.method6870(local203, local114, true, 0, local97.anIntArray879[0], local114, Static480.anIntArray583, local114, local97.anIntArray878[0], -1, Static577.aClass110Array1[local97.plane], Static70.anIntArray147, local166, 0);
							if (local258 > 0) {
								if (local258 > 9) {
									local258 = 9;
								}
								for (@Pc(274) int local274 = 0; local274 < local258; local274++) {
									local97.anIntArray879[local274] = Static70.anIntArray147[local258 - local274 - 1];
									local97.anIntArray878[local274] = Static480.anIntArray583[local258 - local274 - 1];
									local97.aByteArray111[local274] = 1;
								}
								local97.anInt10764 = local258;
							}
						}
					}
					Static256.method3638(local97, true);
					local142 = Static112.method2104(local97);
					Static145.method2410(local97);
					Static651.method8513(Static521.anInt7756, local142, Static524.anInt8042, local97);
					Static702.method9166(local97, Static521.anInt7756);
					Static50.method6638(local97);
				}
			}
		}
		if ((Static283.gameState == 3 || Static283.gameState == 9 || Static283.gameState == 7) && (!Static242.method3500() || Static283.gameState == 9 && Static169.anInt2855 == 42) && Static6.step == 0) {
			if (Static511.cameraType == 2) {
				Static592.updateLockedCamera();
			} else {
				Static583.updateLoginScreenCamera();
			}
			if (Static170.anInt2864 >> 9 < 14 || Static170.anInt2864 >> 9 >= Static720.anInt10859 - 14 || Static110.anInt2186 >> 9 < 14 || Static110.anInt2186 >> 9 >= Static501.anInt7568 - 14) {
				Static54.method1179();
			}
		}
		while (true) {
			@Pc(453) Linkable_Sub42 local453;
			@Pc(458) Component local458;
			@Pc(470) Component local470;
			do {
				local453 = (Linkable_Sub42) Static618.highPriorityRequests.removeHead();
				if (local453 == null) {
					while (true) {
						do {
							local453 = (Linkable_Sub42) Static59.mediumPriorityRequests.removeHead();
							if (local453 == null) {
								while (true) {
									do {
										local453 = (Linkable_Sub42) Static521.lowPriorityRequests.removeHead();
										if (local453 == null) {
											if (Static109.aComponent3 != null) {
												Static603.method7899();
											}
											if (Static333.loop % 1500 == 0) {
												Static314.topBannerRefresh();
											}
											if (Static283.gameState == 7 && !Static242.method3500() || Static283.gameState == 9 && Static169.anInt2855 == 42) {
												Static320.method4598();
											}
											Static587.method7704();
											if (Static624.aBoolean727 && Static588.currentTimeWithDrift() - 60000L > Static98.aLong71) {
												Static266.method6777();
											}
											for (@Pc(672) SecondaryParticleNode_Sub1 local672 = (SecondaryParticleNode_Sub1) Static168.aParticleLinkedList5.method2790(); local672 != null; local672 = (SecondaryParticleNode_Sub1) Static168.aParticleLinkedList5.method2785()) {
												if ((long) local672.anInt6433 < Static588.currentTimeWithDrift() / 1000L - 5L) {
													if (local672.aShort74 > 0) {
														Static44.method1072(local672.aString72 + LocalizedText.FRIEND_LOGGED_IN.get(Static51.clientLanguageId), "", 0, "", "", 5);
													}
													if (local672.aShort74 == 0) {
														Static44.method1072(local672.aString72 + LocalizedText.FRIEND_LOGGED_OUT.get(Static51.clientLanguageId), "", 0, "", "", 5);
													}
													local672.method9274();
												}
											}
											if (Static283.gameState == 7 && !Static242.method3500() || Static283.gameState == 9 && Static169.anInt2855 == 42) {
												if (Static283.gameState != 9 && Connection.lobbyConnection.aClass348_1 == null) {
													Static233.method3409(false);
													return;
												}
												if (Connection.lobbyConnection != null) {
													Connection.lobbyConnection.anInt3647++;
													if (Connection.lobbyConnection.anInt3647 > 50) {
														@Pc(823) OutboundPacket local823 = OutboundPacket.create(Static415.aClientProt75, Connection.lobbyConnection.random);
														Connection.lobbyConnection.queue(local823);
													}
													try {
														Connection.lobbyConnection.method3273();
														return;
													} catch (@Pc(832) IOException local832) {
														if (Static283.gameState != 9) {
															Static233.method3409(false);
															return;
														}
														Connection.lobbyConnection.close();
														return;
													}
												}
											}
											return;
										}
										local458 = local453.aComponent14;
										if (local458.createdComponentId < 0) {
											break;
										}
										local470 = Static145.getComponent(local458.overlayer);
									} while (local470 == null || local470.createdComponents == null || local470.createdComponents.length <= local458.createdComponentId || local470.createdComponents[local458.createdComponentId] != local458);
									Static472.method6420(local453);
								}
							}
							local458 = local453.aComponent14;
							if (local458.createdComponentId < 0) {
								break;
							}
							local470 = Static145.getComponent(local458.overlayer);
						} while (local470 == null || local470.createdComponents == null || local470.createdComponents.length <= local458.createdComponentId || local458 != local470.createdComponents[local458.createdComponentId]);
						Static472.method6420(local453);
					}
				}
				local458 = local453.aComponent14;
				if (local458.createdComponentId < 0) {
					break;
				}
				local470 = Static145.getComponent(local458.overlayer);
			} while (local470 == null || local470.createdComponents == null || local470.createdComponents.length <= local458.createdComponentId || local458 != local470.createdComponents[local458.createdComponentId]);
			Static472.method6420(local453);
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1659() {
		@Pc(7) boolean local7 = js5NetQueue.method6624();
		if (!local7) {
			this.method1656();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1666() {
		if (Static283.gameState == 16) {
			return;
		}
		@Pc(20) long local20 = Static271.method3929() / 1000000L - Static206.aLong114;
		Static206.aLong114 = Static271.method3929() / 1000000L;
		@Pc(28) boolean local28 = Static576.method7611();
		if (local28 && Static501.aBoolean575 && Static719.aAudioChannel5 != null) {
			Static719.aAudioChannel5.method3592();
		}
		if (Static475.method6445(Static283.gameState)) {
			if (Static297.aLong153 != 0L && Static588.currentTimeWithDrift() > Static297.aLong153) {
				Static409.method5657(Static36.method978(3), Static560.anInt8429, false, Static433.anInt6258);
			} else if (!Static163.aClass19_17.method8001() && Static723.aBoolean827) {
				Static574.method7572();
			}
		}
		@Pc(110) int local110;
		@Pc(114) int local114;
		if (Static316.aFrame8 == null) {
			@Pc(98) Container local98;
			if (Static353.aFrame10 != null) {
				local98 = Static353.aFrame10;
			} else if (Static166.anApplet1 == null) {
				local98 = Static149.aGameShell;
			} else {
				local98 = Static166.anApplet1;
			}
			local110 = local98.getSize().width;
			local114 = local98.getSize().height;
			if (local98 == Static353.aFrame10) {
				@Pc(120) Insets local120 = Static353.aFrame10.getInsets();
				local114 -= local120.bottom + local120.top;
				local110 -= local120.right + local120.left;
			}
			if (Static52.anInt1059 != local110 || local114 != Static54.anInt1084 || Static284.aBoolean355) {
				if (Static163.aClass19_17 == null || Static163.aClass19_17.method7983()) {
					Static712.method9329((byte) 11);
				} else {
					Static52.anInt1059 = local110;
					Static54.anInt1084 = local114;
				}
				Static297.aLong153 = Static588.currentTimeWithDrift() + 500L;
				Static284.aBoolean355 = false;
			}
		}
		if (Static316.aFrame8 != null && !Static91.aBoolean750 && Static475.method6445(Static283.gameState)) {
			Static409.method5657(Static400.aClass2_Sub34_28.aPreference_Sub1_1.method1485(), -1, false, -1);
		}
		@Pc(209) boolean local209 = false;
		if (Static664.aBoolean759) {
			local209 = true;
			Static664.aBoolean759 = false;
		}
		if (local209) {
			Static288.method4182();
		}
		if (Static163.aClass19_17 != null && Static163.aClass19_17.method8001() || Static36.method978(3) != 1) {
			Static469.method6362();
		}
		if (Static181.method2778(Static283.gameState)) {
			Static523.method3447(local209);
		} else if (Static366.method5262(Static283.gameState)) {
			Static24.method680();
		} else if (Static384.method5393(Static283.gameState)) {
			Static24.method680();
		} else if (Static594.method7782(Static283.gameState)) {
			if (Static213.anInt3472 == 1) {
				if (Static593.anInt8763 > Static357.anInt6508) {
					Static357.anInt6508 = Static593.anInt8763;
				}
				local110 = (Static357.anInt6508 - Static593.anInt8763) * 50 / Static357.anInt6508;
				Static694.method9028(Static163.aClass19_17, LocalizedText.LOADING_PLEASE_WAIT.get(Static51.clientLanguageId) + "<br>(" + local110 + "%)", true, Static694.aClass381_13, Static437.aClass14_9);
			} else if (Static213.anInt3472 == 2) {
				if (Static13.anInt150 > Static440.anInt6683) {
					Static440.anInt6683 = Static13.anInt150;
				}
				local110 = (Static440.anInt6683 - Static13.anInt150) * 50 / Static440.anInt6683 + 50;
				Static694.method9028(Static163.aClass19_17, LocalizedText.LOADING_PLEASE_WAIT.get(Static51.clientLanguageId) + "<br>(" + local110 + "%)", true, Static694.aClass381_13, Static437.aClass14_9);
			} else {
				Static694.method9028(Static163.aClass19_17, LocalizedText.LOADING_PLEASE_WAIT.get(Static51.clientLanguageId), true, Static694.aClass381_13, Static437.aClass14_9);
			}
		} else if (Static283.gameState == 11) {
			Static686.method7930(local20);
		} else if (Static283.gameState == 14) {
			Static694.method9028(Static163.aClass19_17, LocalizedText.CONNECTION_LOST.get(Static51.clientLanguageId) + "<br>" + LocalizedText.CONNECTION_REESTABLISH.get(Static51.clientLanguageId), false, Static694.aClass381_13, Static437.aClass14_9);
		} else if (Static283.gameState == 15) {
			Static694.method9028(Static163.aClass19_17, LocalizedText.PLEASE_WAIT.get(Static51.clientLanguageId), false, Static694.aClass381_13, Static437.aClass14_9);
		}
		if (Static18.anInt251 == 3) {
			for (local110 = 0; local110 < Static122.anInt2339; local110++) {
				@Pc(478) Rectangle local478 = TextureOpSquareWaveform.aRectangleArray1[local110];
				if (Static359.aBooleanArray17[local110]) {
					Static163.aClass19_17.method7945(local478.y, -65281, local478.width, local478.height, local478.x);
				} else if (Static469.aBooleanArray23[local110]) {
					Static163.aClass19_17.method7945(local478.y, -65536, local478.width, local478.height, local478.x);
				} else {
					Static163.aClass19_17.method7945(local478.y, -16711936, local478.width, local478.height, local478.x);
				}
			}
		}
		if (Static607.method8163()) {
			Static546.method7251(Static163.aClass19_17);
		}
		if (Static446.aSignlink6.aBoolean779 && Static475.method6445(Static283.gameState) && Static18.anInt251 == 0 && Static36.method978(3) == 1 && !local209) {
			local110 = 0;
			for (local114 = 0; local114 < Static122.anInt2339; local114++) {
				if (Static469.aBooleanArray23[local114]) {
					Static469.aBooleanArray23[local114] = false;
					Static663.aRectangleArray2[local110++] = TextureOpSquareWaveform.aRectangleArray1[local114];
				}
			}
			try {
				if (Static137.aBoolean210) {
					Static700.method9148(local110, Static663.aRectangleArray2);
				} else {
					Static163.aClass19_17.method8005(local110, Static663.aRectangleArray2);
				}
			} catch (@Pc(629) Exception_Sub1 local629) {
			}
		} else if (!Static181.method2778(Static283.gameState)) {
			for (local110 = 0; local110 < Static122.anInt2339; local110++) {
				Static469.aBooleanArray23[local110] = false;
			}
			try {
				if (Static137.aBoolean210) {
					Static430.method5818();
				} else {
					Static163.aClass19_17.method7984();
				}
			} catch (@Pc(666) Exception_Sub1 local666) {
				Static240.method3496(local666, local666.getMessage() + " (Recovered) " + this.method1648());
				Static32.method880(0, false);
			}
		}
		Static507.method6744();
		local110 = Static400.aClass2_Sub34_28.aPreference_Sub21_1.method6360();
		if (local110 == 0) {
			Static638.sleep(15L);
		} else if (local110 == 1) {
			Static638.sleep(10L);
		} else if (local110 == 2) {
			Static638.sleep(5L);
		} else if (local110 == 3) {
			Static638.sleep(2L);
		}
		if (Static666.aBoolean766) {
			Static614.method8245();
		}
		if (Static400.aClass2_Sub34_28.aPreference_Sub10_1.method3519() == 1 && Static283.gameState == 3 && Static377.topLevelInterface != -1) {
			Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aPreference_Sub10_1);
			Static666.write(1);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method1667(@OriginalArg(1) int arg0) {
		Static514.aPrivilegedRequest6 = null;
		js5NetQueue.anInt7452 = arg0;
		Static672.aClientStream2 = null;
		js5NetQueue.anInt7453++;
		Static92.anInt1874 = 0;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	@Override
	protected void method1645() {
		if (Static400.aClass2_Sub34_28.aPreference_Sub29_1.method7915() != 2) {
			this.method1668();
			return;
		}
		try {
			this.method1668();
		} catch (@Pc(21) ThreadDeath local21) {
			throw local21;
		} catch (@Pc(24) Throwable local24) {
			Static240.method3496(local24, local24.getMessage() + " (Recovered) " + this.method1648());
			Static171.aBoolean245 = true;
			Static32.method880(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method1668() {
		if (Static283.gameState == 16) {
			return;
		}
		Static333.loop++;
		if (Static333.loop % 1000 == 1) {
			@Pc(27) GregorianCalendar local27 = new GregorianCalendar();
			Static178.anInt2947 = local27.get(11) * 600 + local27.get(12) * 10 + local27.get(13) / 6;
			Static493.aRandom1.setSeed((long) Static178.anInt2947);
		}
		Connection.gameConnection.method3271();
		Connection.lobbyConnection.method3271();
		this.method1659();
		if (js5MasterIndex != null) {
			js5MasterIndex.cycle();
		}
		Static601.method7865();
		Static236.method3453();
		Static334.aKeyboard1.method8481();
		Static189.aMouse1.method8841();
		if (Static163.aClass19_17 != null) {
			Static163.aClass19_17.method7977((int) Static588.currentTimeWithDrift());
		}
		Static711.method9272();
		Static671.anInt10026 = 0;
		Static216.anInt3530 = 0;
		for (@Pc(94) Interface27 local94 = Static334.aKeyboard1.method8478(); local94 != null; local94 = Static334.aKeyboard1.method8478()) {
			@Pc(102) int local102 = local94.method2668();
			if (local102 == 2 || local102 == 3) {
				@Pc(118) char local118 = local94.method2666();
				if (Static647.method8468() && (local118 == '`' || local118 == '§' || local118 == '²')) {
					if (Static607.method8163()) {
						Static129.method2279();
					} else {
						Static455.method6224();
					}
				} else if (Static671.anInt10026 < 128) {
					Static194.anInterface27Array1[Static671.anInt10026] = local94;
					Static671.anInt10026++;
				}
			} else if (local102 == 0 && Static216.anInt3530 < 75) {
				Static591.anInterface27Array2[Static216.anInt3530] = local94;
				Static216.anInt3530++;
			}
		}
		Static611.anInt9341 = 0;
		for (@Pc(214) Linkable_Sub9 local214 = Static189.aMouse1.method8851(); local214 != null; local214 = Static189.aMouse1.method8851()) {
			@Pc(222) int local222 = local214.method5328();
			if (local222 == -1) {
				Static677.aLinkedList76.addTail(local214);
			} else if (local222 == 6) {
				Static611.anInt9341 += local214.method5332();
			} else if (Static278.method4070(local222)) {
				Static226.aLinkedList58.addTail(local214);
				if (Static226.aLinkedList58.method7701() > 10) {
					Static226.aLinkedList58.removeHead();
				}
			}
		}
		if (Static607.method8163()) {
			Static668.method8703();
		}
		if (Static181.method2778(Static283.gameState)) {
			Static709.method9252();
			Static199.method2977();
		} else if (Static594.method7782(Static283.gameState)) {
			Static489.method6548();
		}
		if (Static41.method1027(Static283.gameState) && !Static594.method7782(Static283.gameState)) {
			this.method1658();
			Static76.method1555();
			Static364.method5253();
		} else if (Static620.isInLobby(Static283.gameState) && !Static594.method7782(Static283.gameState)) {
			this.method1658();
			Static364.method5253();
		} else if (Static283.gameState == 13) {
			Static364.method5253();
		} else if (Static109.method2070(Static283.gameState) && !Static594.method7782(Static283.gameState)) {
			Static709.method9254();
		} else if (Static283.gameState == 14 || Static283.gameState == 15) {
			Static364.method5253();
			if (Static169.anInt2855 != -3 && Static169.anInt2855 != 2 && Static169.anInt2855 != 15) {
				if (Static283.gameState == 15) {
					Static78.anInt1626 = Static169.anInt2855;
					Static673.anInt10079 = Static356.anInt5780;
					Static383.anInt6001 = Static329.anInt1749;
					if (Static718.aBoolean823) {
						Static430.hopWorld(Static459.aClass229_2.worldId, Static459.aClass229_2.aString60);
						Connection.gameConnection.aClass348_1 = null;
						Static81.method1586(14);
					} else {
						Static233.method3409(Static461.aBoolean529);
					}
				} else {
					Static233.method3409(false);
				}
			}
		}
		Static369.method3851(Static163.aClass19_17);
		Static226.aLinkedList58.removeHead();
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method1647() {
		if (Static473.aBoolean539) {
			Static369.anInt4265 = 64;
		}
		@Pc(18) Frame local18 = new Frame("Jagex");
		local18.pack();
		local18.dispose();
		Static712.method9329((byte) 11);
		js5CacheQueue = new Js5CacheQueue(Static446.aSignlink6);
		js5NetQueue = new Js5NetQueue();
		Static545.method7241(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (ModeWhere.LIVE != Static2.aModeWhere1) {
			Static163.aByteArrayArray36 = new byte[50][];
		}
		Static400.aClass2_Sub34_28 = Static720.method9398();
		if (Static2.aModeWhere1 == ModeWhere.LIVE) {
			Static527.aClass229_3.aString60 = this.getCodeBase().getHost();
		} else if (Static179.method2769(Static2.aModeWhere1)) {
			Static527.aClass229_3.aString60 = this.getCodeBase().getHost();
			Static527.aClass229_3.anInt5854 = Static527.aClass229_3.worldId + 40000;
			Static527.aClass229_3.anInt5853 = Static527.aClass229_3.worldId + 50000;
			Static660.aClass229_4.anInt5854 = Static660.aClass229_4.worldId + 40000;
			Static660.aClass229_4.anInt5853 = Static660.aClass229_4.worldId + 50000;
		} else if (ModeWhere.LOCAL == Static2.aModeWhere1) {
			Static527.aClass229_3.aString60 = "127.0.0.1";
			Static527.aClass229_3.anInt5854 = Static527.aClass229_3.worldId + 40000;
			Static660.aClass229_4.aString60 = "127.0.0.1";
			Static527.aClass229_3.anInt5853 = Static527.aClass229_3.worldId + 50000;
			Static660.aClass229_4.anInt5854 = Static660.aClass229_4.worldId + 40000;
			Static660.aClass229_4.anInt5853 = Static660.aClass229_4.worldId + 50000;
		}
		Static344.aClass229_1 = Static527.aClass229_3;
		Static637.aShortArray132 = Static419.aShortArray96 = Static553.aShortArray112 = Static238.aShortArray62 = new short[256];
		if (Static392.clientModeGame == ModeGame.GAME_RUNESCAPE) {
			Static273.aBoolean340 = false;
		}
		try {
			Static175.aClipboard1 = Static295.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(183) Exception local183) {
		}
		Static334.aKeyboard1 = Static681.method8921(Static434.canvas);
		Static189.aMouse1 = Static70.method1513(Static434.canvas);
		try {
			if (Static446.aSignlink6.aFileOnDisk2 != null) {
				cacheData = new BufferedFile(Static446.aSignlink6.aFileOnDisk2, 5200, 0);
				for (@Pc(205) int local205 = 0; local205 < 37; local205++) {
					cacheIndexes[local205] = new BufferedFile(Static446.aSignlink6.aFileOnDiskArray1[local205], 6000, 0);
				}
				Static5.aBufferedFile1 = new BufferedFile(Static446.aSignlink6.aFileOnDisk3, 6000, 0);
				masterCache = new Cache(255, cacheData, Static5.aBufferedFile1, 500000);
				Static690.aBufferedFile5 = new BufferedFile(Static446.aSignlink6.aFileOnDisk4, 24, 0);
				Static446.aSignlink6.aFileOnDisk3 = null;
				Static446.aSignlink6.aFileOnDiskArray1 = null;
				Static446.aSignlink6.aFileOnDisk2 = null;
				Static446.aSignlink6.aFileOnDisk4 = null;
			}
		} catch (@Pc(275) IOException local275) {
			Static5.aBufferedFile1 = null;
			masterCache = null;
			Static690.aBufferedFile5 = null;
			cacheData = null;
		}
		if (ModeWhere.LIVE != Static2.aModeWhere1 && !ClientConfig.DISABLE_DEFAULT_FPSON) {
			Static105.aBoolean196 = true;
		}
		Static484.aString85 = LocalizedText.LOADING_PLEASE_WAIT.get(Static51.clientLanguageId);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1648() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static691.originX + "," + Static116.originZ + "," + Static720.anInt10859 + "," + Static501.anInt7568 + "|";
			if (Static556.self != null) {
				local5 = local5 + "2)" + Static394.anInt6176 + "," + (Static556.self.anIntArray879[0] + Static691.originX) + "," + (Static116.originZ + Static556.self.anIntArray878[0]) + "|";
			}
			local5 = local5 + "3)" + Static400.aClass2_Sub34_28.aPreference_Sub29_1.method7915() + "|4)" + Static400.aClass2_Sub34_28.aPreference_Sub13_2.method4373() + "|5)" + Static36.method978(3) + "|6)" + Static680.anInt10289 + "," + Static380.anInt5979 + "|";
			local5 = local5 + "7)" + Static400.aClass2_Sub34_28.aPreference_Sub24_1.method7082() + "|";
			local5 = local5 + "8)" + Static400.aClass2_Sub34_28.aPreference_Sub12_1.method4364() + "|";
			local5 = local5 + "9)" + Static400.aClass2_Sub34_28.aPreference_Sub26_1.method7463() + "|";
			local5 = local5 + "10)" + Static400.aClass2_Sub34_28.aPreference_Sub30_1.method8356() + "|";
			local5 = local5 + "11)" + Static400.aClass2_Sub34_28.aPreference_Sub20_1.method6108() + "|";
			local5 = local5 + "12)" + Static400.aClass2_Sub34_28.aPreference_Sub19_2.method5960() + "|";
			local5 = local5 + "13)" + Static369.anInt4265 + "|";
			local5 = local5 + "14)" + Static283.gameState;
			if (Static292.aClass2_Sub43_2 != null) {
				local5 = local5 + "|15)" + Static292.aClass2_Sub43_2.anInt7610;
			}
			try {
				if (Static400.aClass2_Sub34_28.aPreference_Sub29_1.method7915() == 2) {
					@Pc(273) Class local273 = Class.forName("java.lang.ClassLoader");
					@Pc(279) Field local279 = local273.getDeclaredField("nativeLibraries");
					@Pc(284) Class local284 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(296) Method local296 = local284.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local296.invoke(local279, Boolean.TRUE);
					@Pc(322) Vector local322 = (Vector) local279.get((Static84.aClass5 == null ? (Static84.aClass5 = Class.forName("client")) : Static84.aClass5).getClassLoader());
					for (@Pc(324) int local324 = 0; local324 < local322.size(); local324++) {
						try {
							@Pc(329) Object local329 = local322.elementAt(local324);
							@Pc(336) Field local336 = local329.getClass().getDeclaredField("name");
							local296.invoke(local336, Boolean.TRUE);
							try {
								@Pc(351) String local351 = (String) local336.get(local329);
								if (local351 != null && local351.indexOf("sw3d.dll") != -1) {
									@Pc(369) Field local369 = local329.getClass().getDeclaredField("handle");
									local296.invoke(local369, Boolean.TRUE);
									local5 = local5 + "|16)" + Long.toHexString(local369.getLong(local329));
									local296.invoke(local369, Boolean.FALSE);
								}
							} catch (@Pc(407) Throwable local407) {
							}
							local296.invoke(local336, Boolean.FALSE);
						} catch (@Pc(419) Throwable local419) {
						}
					}
				}
			} catch (@Pc(431) Throwable local431) {
			}
			local5 = local5 + "]";
		} catch (@Pc(442) Throwable local442) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1643()) {
			return;
		}
		Static527.aClass229_3 = new Class229();
		Static527.aClass229_3.worldId = Integer.parseInt(this.getParameter("worldid"));
		Static660.aClass229_4 = new Class229();
		Static660.aClass229_4.worldId = Integer.parseInt(this.getParameter("lobbyid"));
		Static660.aClass229_4.aString60 = this.getParameter("lobbyaddress");
		Static2.aModeWhere1 = Static463.method6279(Integer.parseInt(this.getParameter("modewhere")));
		if (ModeWhere.LOCAL == Static2.aModeWhere1) {
			Static2.aModeWhere1 = ModeWhere.WTWIP;
		} else if (!Static179.method2769(Static2.aModeWhere1) && ModeWhere.LIVE != Static2.aModeWhere1) {
			Static2.aModeWhere1 = ModeWhere.LIVE;
		}
		Static598.aClass162_5 = Static624.method8329(Integer.parseInt(this.getParameter("modewhat")));
		if (Static225.aClass162_1 != Static598.aClass162_5 && Static598.aClass162_5 != Static519.aClass162_4 && Static523.aClass162_3 != Static598.aClass162_5) {
			Static598.aClass162_5 = Static523.aClass162_3;
		}
		try {
			Static51.clientLanguageId = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(110) Exception local110) {
			Static51.clientLanguageId = 0;
		}
		@Pc(118) String local118 = this.getParameter("objecttag");
		if (local118 != null && local118.equals("1")) {
			Static464.aBoolean533 = true;
		} else {
			Static464.aBoolean533 = false;
		}
		@Pc(142) String local142 = this.getParameter("js");
		if (local142 != null && local142.equals("1")) {
			Static98.aBoolean191 = true;
		} else {
			Static98.aBoolean191 = false;
		}
		@Pc(166) String local166 = this.getParameter("advert");
		if (local166 != null && local166.equals("1")) {
			Static305.aBoolean372 = true;
		} else {
			Static305.aBoolean372 = false;
		}
		@Pc(190) String local190 = this.getParameter("game");
		if (local190 != null) {
			if (local190.equals("0")) {
				Static392.clientModeGame = ModeGame.GAME_RUNESCAPE;
			} else if (local190.equals("1")) {
				Static392.clientModeGame = ModeGame.GAME_STELLARDAWN;
			} else if (local190.equals("2")) {
				Static392.clientModeGame = ModeGame.GAME_3;
			} else if (local190.equals("3")) {
				Static392.clientModeGame = ModeGame.GAME_4;
			}
		}
		try {
			Static323.affiliate = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(247) Exception local247) {
			Static323.affiliate = 0;
		}
		Static360.aString59 = this.getParameter("quiturl");
		Static150.aString26 = this.getParameter("settings");
		if (Static150.aString26 == null) {
			Static150.aString26 = "";
		}
		Static477.aBoolean543 = "1".equals(this.getParameter("under"));
		@Pc(281) String local281 = this.getParameter("country");
		if (local281 != null) {
			try {
				Static584.country = Integer.parseInt(local281);
			} catch (@Pc(288) Exception local288) {
				Static584.country = 0;
			}
		}
		Static338.anInt5562 = Integer.parseInt(this.getParameter("colourid"));
		if (Static338.anInt5562 < 0 || Static718.aColorArray3.length <= Static338.anInt5562) {
			Static338.anInt5562 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static508.aBoolean582 = true;
			Static126.playerMember = true;
		}
		@Pc(336) String local336 = this.getParameter("frombilling");
		if (local336 != null && local336.equals("true")) {
			Static29.aBoolean61 = true;
		}
		@Pc(356) String local356 = this.getParameter("sskey");
		if (local356 != null) {
			Static265.aByteArray44 = Static107.method2054(Static713.method9333(local356));
			if (Static265.aByteArray44.length < 16) {
				Static265.aByteArray44 = null;
			}
		}
		@Pc(382) String local382 = this.getParameter("force64mb");
		if (local382 != null && local382.equals("true")) {
			Static473.aBoolean539 = true;
		}
		@Pc(402) String local402 = this.getParameter("worldflags");
		if (local402 != null) {
			try {
				Static715.anInt10805 = Integer.parseInt(local402);
			} catch (@Pc(409) Exception local409) {
			}
		}
		@Pc(416) String local416 = this.getParameter("userFlow");
		if (local416 != null) {
			try {
				Static416.aLong208 = Long.parseLong(local416);
			} catch (@Pc(424) NumberFormatException local424) {
			}
		}
		Static389.aString64 = this.getParameter("additionalInfo");
		if (Static389.aString64 != null && Static389.aString64.length() > 50) {
			Static389.aString64 = null;
		}
		if (ModeGame.GAME_RUNESCAPE == Static392.clientModeGame) {
			Static302.anInt4851 = 765;
			Static479.anInt7201 = 503;
		} else if (Static392.clientModeGame == ModeGame.GAME_STELLARDAWN) {
			Static479.anInt7201 = 480;
			Static302.anInt4851 = 640;
		}
		@Pc(473) String local473 = this.getParameter("hc");
		if (local473 != null && local473.equals("1")) {
			Static416.aBoolean473 = true;
		}
		Static295.aClient1 = this;
		this.method1640(Static302.anInt4851, Static598.aClass162_5.method3469() + 32, Static392.clientModeGame.name, Static479.anInt7201);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1650() {
		if (Static400.aClass2_Sub34_28.aPreference_Sub29_1.method7915() != 2) {
			this.method1666();
			return;
		}
		try {
			this.method1666();
		} catch (@Pc(21) ThreadDeath local21) {
			throw local21;
		} catch (@Pc(24) Throwable local24) {
			Static240.method3496(local24, local24.getMessage() + " (Recovered) " + this.method1648());
			Static171.aBoolean245 = true;
			Static32.method880(0, false);
		}
	}
}
