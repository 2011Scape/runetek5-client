import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static650 {

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "[F")
	public static float[] aFloatArray71;

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "[I")
	public static int[] anIntArray756;

	@OriginalMember(owner = "client!uj", name = "I", descriptor = "[B")
	private static byte[] aByteArray101;

	@OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
	private static int anInt9677;

	@OriginalMember(owner = "client!uj", name = "N", descriptor = "[Lclient!l;")
	public static VorbisResidue[] aVorbisResidueArray1;

	@OriginalMember(owner = "client!uj", name = "G", descriptor = "[I")
	public static int[] anIntArray757;

	@OriginalMember(owner = "client!uj", name = "K", descriptor = "[F")
	public static float[] aFloatArray72;

	@OriginalMember(owner = "client!uj", name = "M", descriptor = "[F")
	public static float[] aFloatArray73;

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "[F")
	public static float[] aFloatArray74;

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
	public static int anInt9681;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray32;

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "[F")
	public static float[] aFloatArray75;

	@OriginalMember(owner = "client!uj", name = "P", descriptor = "[Lclient!bk;")
	public static VorbisFloor[] aVorbisFloorArray1;

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "[Lclient!tr;")
	public static VorbisMapping[] aVorbisMappingArray1;

	@OriginalMember(owner = "client!uj", name = "J", descriptor = "[I")
	public static int[] anIntArray758;

	@OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
	private static int anInt9682;

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "[Lclient!oca;")
	public static VorbisCodebook[] aVorbisCodebookArray1;

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "[F")
	public static float[] aFloatArray76;

	@OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
	public static int anInt9683;

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "[F")
	public static float[] aFloatArray78;

	@OriginalMember(owner = "client!uj", name = "A", descriptor = "Z")
	private static boolean aBoolean746 = false;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!sb;I)Lclient!uj;")
	public static VorbisSound method8498(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1) {
		if (method8505(arg0)) {
			@Pc(14) byte[] local14 = arg0.fetchFile(arg1);
			return local14 == null ? null : new VorbisSound(local14);
		} else {
			arg0.isFileReady(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)I")
	public static int method8500(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt9677) {
			local8 = 8 - anInt9677;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray101[anInt9682] >> anInt9677 & local14) << local3;
			anInt9677 = 0;
			anInt9682++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray101[anInt9682] >> anInt9677 & local8) << local3;
			anInt9677 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "([B)V")
	private static void method8504(@OriginalArg(0) byte[] arg0) {
		method8508(arg0);
		anInt9681 = 0x1 << method8500(4);
		anInt9683 = 0x1 << method8500(4);
		aFloatArray73 = new float[anInt9683];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt9681 : anInt9683;
			local28 = local24 >> 1;
			local32 = local24 >> 2;
			local36 = local24 >> 3;
			@Pc(39) float[] local39 = new float[local28];
			for (local41 = 0; local41 < local32; local41++) {
				local39[local41 * 2] = (float) Math.cos((double) (local41 * 4) * 3.141592653589793D / (double) local24);
				local39[local41 * 2 + 1] = -((float) Math.sin((double) (local41 * 4) * 3.141592653589793D / (double) local24));
			}
			@Pc(84) float[] local84 = new float[local28];
			for (local86 = 0; local86 < local32; local86++) {
				local84[local86 * 2] = (float) Math.cos((double) (local86 * 2 + 1) * 3.141592653589793D / (double) (local24 * 2));
				local84[local86 * 2 + 1] = (float) Math.sin((double) (local86 * 2 + 1) * 3.141592653589793D / (double) (local24 * 2));
			}
			@Pc(136) float[] local136 = new float[local32];
			for (local138 = 0; local138 < local36; local138++) {
				local136[local138 * 2] = (float) Math.cos((double) (local138 * 4 + 2) * 3.141592653589793D / (double) local24);
				local136[local138 * 2 + 1] = -((float) Math.sin((double) (local138 * 4 + 2) * 3.141592653589793D / (double) local24));
			}
			@Pc(185) int[] local185 = new int[local36];
			local191 = Static434.method5853(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static179.method2767(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray74 = local39;
				aFloatArray78 = local84;
				aFloatArray75 = local136;
				anIntArray758 = local185;
			} else {
				aFloatArray72 = local39;
				aFloatArray76 = local84;
				aFloatArray71 = local136;
				anIntArray757 = local185;
			}
		}
		local24 = method8500(8) + 1;
		aVorbisCodebookArray1 = new VorbisCodebook[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aVorbisCodebookArray1[local28] = new VorbisCodebook();
		}
		local32 = method8500(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method8500(16);
		}
		@Pc(269) int local269 = method8500(6) + 1;
		aVorbisFloorArray1 = new VorbisFloor[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aVorbisFloorArray1[local41] = new VorbisFloor();
		}
		@Pc(290) int local290 = method8500(6) + 1;
		aVorbisResidueArray1 = new VorbisResidue[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aVorbisResidueArray1[local86] = new VorbisResidue();
		}
		@Pc(311) int local311 = method8500(6) + 1;
		aVorbisMappingArray1 = new VorbisMapping[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aVorbisMappingArray1[local138] = new VorbisMapping();
		}
		@Pc(332) int local332 = method8500(6) + 1;
		aBooleanArray32 = new boolean[local332];
		anIntArray756 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray32[local191] = method8509() != 0;
			method8500(16);
			method8500(16);
			anIntArray756[local191] = method8500(8);
		}
		aBoolean746 = true;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!sb;)Z")
	private static boolean method8505(@OriginalArg(0) Js5 arg0) {
		if (!aBoolean746) {
			@Pc(7) byte[] local7 = arg0.fetchFile(0, 0);
			if (local7 == null) {
				return false;
			}
			method8504(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!sb;II)Lclient!uj;")
	public static VorbisSound method8506(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method8505(arg0)) {
			@Pc(16) byte[] local16 = arg0.fetchFile(arg1, arg2);
			return local16 == null ? null : new VorbisSound(local16);
		} else {
			arg0.isFileReady(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)F")
	public static float method8507(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([BI)V")
	public static void method8508(@OriginalArg(0) byte[] arg0) {
		aByteArray101 = arg0;
		anInt9682 = 0;
		anInt9677 = 0;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "()I")
	public static int method8509() {
		@Pc(7) int local7 = aByteArray101[anInt9682] >> anInt9677 & 0x1;
		anInt9677++;
		anInt9682 += anInt9677 >> 3;
		anInt9677 &= 0x7;
		return local7;
	}
}
