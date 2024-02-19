import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
	public static final int anInt5752 = 50;

	@OriginalMember(owner = "client!lc", name = "E", descriptor = "[Lclient!dj;")
	public static final Class80[] aClass80Array1 = new Class80[anInt5752];

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
	public static int anInt5754 = 0;

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray141 = new int[128][128];

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "[I")
	public static final int[] anIntArray444 = new int[anInt5752];

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "[I")
	public static final int[] anIntArray445 = new int[anInt5752];

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "[I")
	public static final int[] anIntArray446 = new int[anInt5752];

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
	public static void resetCache() {
		Static467.aFloTypeList3.method2349();
		Static540.aFluTypeList6.method2067();
		Static68.aIdkTypeList3.method5044();
		Static354.aLocTypeList4.clearCaches();
		Static690.aNpcTypeList2.method7086();
		ObjTypeList.objTypes.method2476();
		Static25.aSeqTypeList1.method1165();
		Static23.aSpotAnimTypeList1.method2699();
		Static529.aVarBitTypeList1.method3429();
		Static36.aVarPlayerTypeList1.method5784();
		Static628.aVarClanTypeList5.method7783();
		Static648.aVarClanSettingTypeList1.method269();
		Static574.aBasTypeList2.method7114();
		Static720.aMsiTypeList4.method8361();
		Static577.aMelTypeList4.method5586();
		Static272.aQuestTypeList1.method1098();
		Static386.aParamTypeList2.method1160();
		Static324.aSkyBoxTypeList1.method7071();
		Static99.aSkyBoxSphereTypeList1.method2052();
		Static48.aLightTypeList1.method8812();
		Static354.aCursorTypeList1.method5974();
		Static652.aStructTypeList1.method5035();
		Static561.aHitmarkTypeList2.method5182();
		Static314.method4560();
		Static675.method8811();
		Static124.method2215();
		Static327.method4895();
		if (Static2.aModeWhere1 != ModeWhere.LIVE) {
			for (@Pc(92) int local92 = 0; local92 < Static163.aByteArrayArray36.length; local92++) {
				Static163.aByteArrayArray36[local92] = null;
			}
			Static107.anInt2161 = 0;
		}
		Static157.method2560();
		Static584.method7666();
		Static367.method5267();
		Static561.method7436();
		Static422.method5772();
		Static472.aSoftLruHashTable156.clear();
		Static163.aClass19_17.method8012();
		Static269.method3909();
		Static112.method2109();
		client.anims.discardUnpacked();
		client.bases.discardUnpacked();
		client.config.discardUnpacked();
		client.interfaces.discardUnpacked();
		client.synthSounds.discardUnpacked();
		client.maps.discardUnpacked();
		client.midiSongs.discardUnpacked();
		client.models.discardUnpacked();
		client.sprites.discardUnpacked();
		client.textures.discardUnpacked();
		client.binary.discardUnpacked();
		client.midiJingles.discardUnpacked();
		client.clientscripts.discardUnpacked();
		client.fontMetrics.discardUnpacked();
		client.vorbis.discardUnpacked();
		client.midiInstruments.discardUnpacked();
		client.configLoc.discardUnpacked();
		client.configEnum.discardUnpacked();
		client.configNpc.discardUnpacked();
		client.configObj.discardUnpacked();
		client.configSeq.discardUnpacked();
		client.configSpot.discardUnpacked();
		client.configVarbit.discardUnpacked();
		client.worldMapData.discardUnpacked();
		client.quickchat.discardUnpacked();
		client.quickchatGlobal.discardUnpacked();
		client.materials.discardUnpacked();
		client.configParticle.discardUnpacked();
		client.defaults.discardUnpacked();
		client.cutscenes.discardUnpacked();
		client.configBillboard.discardUnpacked();
		client.dlls.discardUnpacked();
		client.shaders.discardUnpacked();
		client.js5Archive36.discardUnpacked();
		Static230.aSoftLruHashTable81.clear();
		Static669.aSoftLruHashTable215.clear();
		Static541.aSoftLruHashTable174.clear();
		Static452.aSoftLruHashTable149.clear();
	}
}
