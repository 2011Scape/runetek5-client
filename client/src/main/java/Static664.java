import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static664 {

	@OriginalMember(owner = "client!vaa", name = "gb", descriptor = "Z")
	public static volatile boolean aBoolean759 = true;

	@OriginalMember(owner = "client!vaa", name = "v", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt115 = new ClientProt(40, 11);

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!fk;)[I")
	public static int[] method8652(@OriginalArg(1) OutboundPacket arg0) {
		@Pc(8) Packet local8 = new Packet(518);
		@Pc(11) int[] local11 = new int[4];
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			local11[local13] = (int) (Math.random() * 9.9999999E7D);
		}
		local8.p1(10);
		local8.p4(local11[0]);
		local8.p4(local11[1]);
		local8.p4(local11[2]);
		local8.p4(local11[3]);
		for (@Pc(70) int local70 = 0; local70 < 10; local70++) {
			local8.p4((int) (Math.random() * 9.9999999E7D));
		}
		local8.p2((int) (Math.random() * 9.9999999E7D));
		local8.rsaenc(ClientConfig.aBigInteger2, ClientConfig.aBigInteger1);
		arg0.aPacketBit_1.pdata(local8.data, 0, local8.pos);
		return local11;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZLjava/lang/String;ZLclient!vq;)V")
	public static void method8655(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Signlink arg3) {
		Static259.method3693(arg1, "openjs", arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(Z)V")
	public static void method8657() {
		if (Static689.aString123.toLowerCase().indexOf("microsoft") != -1) {
			Static471.anIntArray577[191] = 73;
			Static471.anIntArray577[186] = 57;
			Static471.anIntArray577[219] = 42;
			Static471.anIntArray577[223] = 28;
			Static471.anIntArray577[192] = 58;
			Static471.anIntArray577[189] = 26;
			Static471.anIntArray577[222] = 59;
			Static471.anIntArray577[188] = 71;
			Static471.anIntArray577[187] = 27;
			Static471.anIntArray577[220] = 74;
			Static471.anIntArray577[221] = 43;
			Static471.anIntArray577[190] = 72;
			return;
		}
		Static471.anIntArray577[92] = 74;
		Static471.anIntArray577[47] = 73;
		Static471.anIntArray577[46] = 72;
		Static471.anIntArray577[44] = 71;
		Static471.anIntArray577[45] = 26;
		if (Static689.aMethod2 == null) {
			Static471.anIntArray577[192] = 58;
			Static471.anIntArray577[222] = 59;
		} else {
			Static471.anIntArray577[222] = 58;
			Static471.anIntArray577[192] = 28;
			Static471.anIntArray577[520] = 59;
		}
		Static471.anIntArray577[93] = 43;
		Static471.anIntArray577[91] = 42;
		Static471.anIntArray577[59] = 57;
		Static471.anIntArray577[61] = 27;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method8658(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < Static327.anInt5392; local10++) {
			if (arg0.equalsIgnoreCase(Static330.aStringArray25[local10])) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V")
	public static void method8659() {
		Static467.aFloTypeList3.method2351();
		Static540.aFluTypeList6.method2072();
		Static68.aIdkTypeList3.method5041();
		Static354.aLocTypeList4.method3058();
		Static690.aNpcTypeList2.method7089();
		ObjTypeList.objTypes.method2480();
		Static25.aSeqTypeList1.method1164();
		Static23.aSpotAnimTypeList1.method2697();
		Static529.aVarBitTypeList1.method3423();
		Static36.aVarPlayerTypeList1.method5781();
		Static628.aVarClanTypeList5.method7787();
		Static648.aVarClanSettingTypeList1.method266();
		Static574.aBasTypeList2.method7117();
		Static720.aMsiTypeList4.method8360();
		Static577.aMelTypeList4.method5585();
		Static272.aQuestTypeList1.method1093();
		Static386.aParamTypeList2.method1156();
		Static324.aSkyBoxTypeList1.method7069();
		Static99.aSkyBoxSphereTypeList1.method2053();
		Static48.aLightTypeList1.method8815();
		Static354.aCursorTypeList1.method5972();
		Static652.aStructTypeList1.method5040();
		Static561.aHitmarkTypeList2.method5183();
		Static424.method5779();
		Static570.method7553();
		Static553.method7290();
		Static149.method2450();
		Static126.method2229();
		Static230.aSoftLruHashTable81.removeSoft();
		Static669.aSoftLruHashTable215.removeSoft();
		Static541.aSoftLruHashTable174.removeSoft();
		Static452.aSoftLruHashTable149.removeSoft();
		Static472.aSoftLruHashTable156.removeSoft();
	}
}
