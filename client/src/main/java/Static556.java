import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "Lclient!ca;")
	public static Player aClass8_Sub2_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "Lclient!uc;")
	public static Class367 aClass367_2;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLclient!hda;)Lclient!hda;")
	public static Component method7299(@OriginalArg(1) Component arg0) {
		if (arg0.anInt3743 != -1) {
			return Static145.method2412(arg0.anInt3743);
		}
		@Pc(25) int local25 = arg0.anInt3812 >>> 16;
		@Pc(30) Class331 local30 = new Class331(Static548.aHashTable40);
		for (@Pc(35) SubInterface local35 = (SubInterface) local30.method7613(); local35 != null; local35 = (SubInterface) local30.method7610()) {
			if (local35.anInt147 == local25) {
				return Static145.method2412((int) local35.id);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)V")
	public static void method7300(@OriginalArg(0) int arg0) {
		Static682.anIntArray817 = new int[arg0];
		Static153.anIntArray235 = new int[arg0];
		Static9.anIntArray18 = new int[arg0];
		Static482.anIntArray588 = new int[arg0];
		Static457.anIntArray552 = new int[arg0];
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method7301(@OriginalArg(0) Class19 arg0) {
		if (Static594.anInt8777 < 2 && !Static156.aBoolean223 || Static109.aComponent3 != null) {
			return;
		}
		@Pc(63) String local63;
		if (Static156.aBoolean223 && Static594.anInt8777 < 2) {
			local63 = Static153.aString27 + Static32.aLocalizedText32.method877(Static51.anInt1052) + Static128.aString108 + " ->";
		} else if (Static209.aBoolean269 && Static334.aKeyboard1.method8479(81) && Static594.anInt8777 > 2) {
			local63 = Static518.method9293(Static470.aClass2_Sub2_Sub16_10);
		} else {
			@Pc(55) SecondaryLinkable_Sub16 local55 = Static470.aClass2_Sub2_Sub16_10;
			if (local55 == null) {
				return;
			}
			local63 = Static518.method9293(local55);
			@Pc(65) int[] local65 = null;
			if (Static245.method8635(local55.anInt7314)) {
				local65 = Static419.aObjTypeList1.method2486((int) local55.aLong233).anIntArray800;
			} else if (local55.anInt7317 != -1) {
				local65 = Static419.aObjTypeList1.method2486(local55.anInt7317).anIntArray800;
			} else if (Static598.method7825(local55.anInt7314)) {
				@Pc(93) Linkable_Sub45 local93 = (Linkable_Sub45) Static18.aHashTable2.get((long) (int) local55.aLong233);
				if (local93 != null) {
					@Pc(98) Npc local98 = local93.aClass8_Sub2_Sub1_Sub2_Sub2_2;
					@Pc(101) NpcType local101 = local98.aNpcType1;
					if (local101.anIntArray532 != null) {
						local101 = local101.method5985(65535, Static34.aClass304_1);
					}
					if (local101 != null) {
						local65 = local101.anIntArray533;
					}
				}
			} else if (Static523.method3444(local55.anInt7314)) {
				@Pc(131) LocType local131 = Static354.aLocTypeList4.method3063((int) (local55.aLong233 >>> 32 & 0x7FFFFFFFL), 68);
				if (local131.anIntArray113 != null) {
					local131 = local131.method1301(13, Static34.aClass304_1);
				}
				if (local131 != null) {
					local65 = local131.anIntArray112;
				}
			}
			if (local65 != null) {
				local63 = local63 + Static72.method1527(local65);
			}
		}
		if (Static594.anInt8777 > 2) {
			local63 = local63 + "<col=ffffff> / " + (Static594.anInt8777 - 2) + Static32.aLocalizedText25.method877(Static51.anInt1052);
		}
		if (Static605.aComponent15 != null) {
			@Pc(232) Class14 local232 = Static605.aComponent15.method3403(arg0);
			if (local232 == null) {
				local232 = Static180.aClass14_3;
			}
			local232.method8836(Static329.anIntArray163, Static605.aComponent15.anInt3818, Static605.aComponent15.anInt3802, Static460.anIntArray554, Static605.aComponent15.anInt3779, Static605.aComponent15.anInt3746, Static493.aRandom1, local63, Static366.anInt5852, Static605.aComponent15.anInt3798, Static186.aSoftwareIndexedSpriteArray5, Static178.anInt2947, Static157.anInt2777, Static605.aComponent15.anInt3814);
			Static585.method7670(Static329.anIntArray163[2], Static329.anIntArray163[0], Static329.anIntArray163[3], Static329.anIntArray163[1]);
		} else if (Static71.aComponent2 != null && Static392.aModeGame4 == Static673.aModeGame8) {
			@Pc(299) int local299 = Static180.aClass14_3.method8816(Static186.aSoftwareIndexedSpriteArray5, Static178.anInt2947, Static192.anInt3123 + 16, local63, Static460.anIntArray554, Static493.aRandom1, Static725.anInt10936 + 4);
			Static585.method7670(local299 + Static42.aClass381_4.method8744(local63), Static725.anInt10936 - -4, 16, Static192.anInt3123);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)I")
	public static int method7302() {
		return Static449.aClass364_1.method8379();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBZ)Lclient!gfa;")
	public static Linkable_Sub22 method7303(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(19) long local19 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Linkable_Sub22) Static286.aHashTable23.get(local19);
	}
}
