import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!qea", name = "h", descriptor = "Lclient!st;")
	public static Class23 aClass23_32;

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "Lclient!dfa;")
	public static final Class77 aClass77_5 = new Class77();

	@OriginalMember(owner = "client!qea", name = "e", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_36 = new Class155(15);

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!sb;III)Lclient!ip;")
	public static Class2_Sub2_Sub13 method6820(@OriginalArg(0) Class330 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Packet local14 = new Packet(arg0.method7595(arg2, arg1));
		@Pc(50) Class2_Sub2_Sub13 local50 = new Class2_Sub2_Sub13(arg2, local14.gjstr(), local14.gjstr(), local14.g4(), local14.g4(), local14.g1() == 1, local14.g1(), local14.g1());
		@Pc(54) int local54 = local14.g1();
		for (@Pc(56) int local56 = 0; local56 < local54; local56++) {
			local50.aClass339_26.method7711(new Class2_Sub56(local14.g1(), local14.g2(), local14.g2(), local14.g2(), local14.g2(), local14.g2(), local14.g2(), local14.g2(), local14.g2()));
		}
		local50.method4090();
		return local50;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(ZIII)V")
	public static void method6822(@OriginalArg(0) boolean arg0) {
		if (22050 > 48000) {
			throw new IllegalArgumentException();
		}
		Static156.anInt2679 = 2;
		Static686.anInt8944 = 22050;
		Static316.aBoolean644 = arg0;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method6823(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(6) int local6 = arg0 ? 1 : 0;
		Static546.anInt8244 = 0;
		Static645.anInt9611 = 0;
		Static675.anInt10155++;
		@Pc(22) Class8_Sub2 local22;
		if ((arg5 & 0x2) == 0) {
			for (local22 = Static576.aClass8_Sub2Array9[local6]; local22 != null; local22 = local22.aClass8_Sub2_25) {
				if (!Static208.method3107(local22, arg0, arg1, arg2, arg3)) {
					method6824(local22);
					if (local22.anInt10697 != -1) {
						Static48.aClass8_Sub2Array3[Static546.anInt8244++] = local22;
					}
				}
			}
		}
		@Pc(157) int local157;
		if ((arg5 & 0x1) == 0) {
			for (local22 = Static398.aClass8_Sub2Array7[local6]; local22 != null; local22 = local22.aClass8_Sub2_25) {
				if (!Static208.method3107(local22, arg0, arg1, arg2, arg3)) {
					method6824(local22);
					if (local22.anInt10697 != -1) {
						Static395.aClass8_Sub2Array11[Static645.anInt9611++] = local22;
					}
				}
			}
			for (@Pc(98) Class8_Sub2 local98 = Static468.aClass8_Sub2Array10[local6]; local98 != null; local98 = local98.aClass8_Sub2_25) {
				if (!Static208.method3107(local98, arg0, arg1, arg2, arg3)) {
					if (local98.method9282(0)) {
						method6824(local98);
						if (local98.anInt10697 != -1) {
							Static395.aClass8_Sub2Array11[Static645.anInt9611++] = local98;
						}
					} else {
						method6824(local98);
						if (local98.anInt10697 != -1) {
							Static48.aClass8_Sub2Array3[Static546.anInt8244++] = local98;
						}
					}
				}
			}
			if (!arg0) {
				for (local157 = 0; local157 < Static125.anInt2352; local157++) {
					if (!Static208.method3107(Static679.aClass8_Sub2_Sub1Array1[local157], arg0, arg1, arg2, arg3)) {
						method6824(Static679.aClass8_Sub2_Sub1Array1[local157]);
						if (Static679.aClass8_Sub2_Sub1Array1[local157].anInt10697 != -1) {
							if (Static679.aClass8_Sub2_Sub1Array1[local157].method9282(0)) {
								Static395.aClass8_Sub2Array11[Static645.anInt9611++] = Static679.aClass8_Sub2_Sub1Array1[local157];
							} else {
								Static48.aClass8_Sub2Array3[Static546.anInt8244++] = Static679.aClass8_Sub2_Sub1Array1[local157];
							}
						}
					}
				}
			}
		}
		@Pc(225) int local225;
		if (Static546.anInt8244 > 0) {
			Static590.method7745(Static48.aClass8_Sub2Array3, 0, Static546.anInt8244 - 1);
			for (local225 = 0; local225 < Static546.anInt8244; local225++) {
				Static632.method8368(Static48.aClass8_Sub2Array3[local225], arg6);
			}
		}
		if (Static442.aBoolean500) {
			Static665.aClass19_15.method8009(0, (Class2_Sub7[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local225 = Static296.anInt4792; local225 < Static299.anInt4824; local225++) {
				@Pc(304) boolean[][] local304;
				@Pc(316) int local316;
				@Pc(323) int local323;
				@Pc(325) int local325;
				@Pc(263) int local263;
				if (local225 < arg2 || arg1 == null) {
					local263 = Static258.aBooleanArrayArray3.length;
					if (Static441.anInt6691 + Static258.aBooleanArrayArray3.length > Static619.anInt1566) {
						local263 -= Static441.anInt6691 + Static258.aBooleanArrayArray3.length - Static619.anInt1566;
					}
					local157 = Static258.aBooleanArrayArray3[0].length;
					if (Static220.anInt3562 + Static258.aBooleanArrayArray3[0].length > Static662.anInt9843) {
						local157 -= Static220.anInt3562 + Static258.aBooleanArrayArray3[0].length - Static662.anInt9843;
					}
					local304 = Static142.aBooleanArrayArray1;
					if (Static581.aBoolean657) {
						if (Static661.aBoolean457) {
							local304 = Static433.aBooleanArrayArrayArray5[local225];
						}
						for (local316 = Static231.anInt3734; local316 < local263; local316++) {
							local323 = local316 + Static441.anInt6691 - Static231.anInt3734;
							for (local325 = Static13.anInt148; local325 < local157; local325++) {
								if (Static258.aBooleanArrayArray3[local316][local325] && !Static588.method7714(local325 + Static220.anInt3562 - Static13.anInt148, local225, local323)) {
									local304[local316][local325] = true;
								} else {
									local304[local316][local325] = false;
								}
							}
						}
					}
					if (Static661.aBoolean457) {
						if (arg4 >= 0) {
							Static246.aClass178Array1[local225].method7877(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static246.aClass178Array1[local225].method7870(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local316 = 0; local316 < Static32.anInt772; local316++) {
							Static684.aClass302Array1[local316].method6805(new Class8_Sub9(local225 + 1));
						}
					} else if (arg4 >= 0) {
						Static246.aClass178Array1[local225].method7877(Static403.anInt6246, Static550.anInt8271, Static35.anInt813, Static142.aBooleanArrayArray1, true, arg4, arg5);
					} else {
						Static246.aClass178Array1[local225].method7870(Static403.anInt6246, Static550.anInt8271, Static35.anInt813, Static142.aBooleanArrayArray1, true, arg5);
					}
				} else {
					local263 = Static258.aBooleanArrayArray3.length;
					if (Static441.anInt6691 + Static258.aBooleanArrayArray3.length > Static619.anInt1566) {
						local263 -= Static441.anInt6691 + Static258.aBooleanArrayArray3.length - Static619.anInt1566;
					}
					local157 = Static258.aBooleanArrayArray3[0].length;
					if (Static220.anInt3562 + Static258.aBooleanArrayArray3[0].length > Static662.anInt9843) {
						local157 -= Static220.anInt3562 + Static258.aBooleanArrayArray3[0].length - Static662.anInt9843;
					}
					local304 = Static142.aBooleanArrayArray1;
					if (Static581.aBoolean657) {
						if (Static661.aBoolean457) {
							local304 = Static433.aBooleanArrayArrayArray5[local225];
						}
						for (local316 = Static231.anInt3734; local316 < local263; local316++) {
							local323 = local316 + Static441.anInt6691 - Static231.anInt3734;
							for (local325 = Static13.anInt148; local325 < local157; local325++) {
								local304[local316][local325] = false;
								if (Static258.aBooleanArrayArray3[local316][local325]) {
									@Pc(344) int local344 = local325 + Static220.anInt3562 - Static13.anInt148;
									for (@Pc(346) int local346 = local225; local346 >= 0; local346--) {
										if (Static334.aClass291ArrayArrayArray1[local346][local323][local344] != null && Static334.aClass291ArrayArrayArray1[local346][local323][local344].aByte116 == local225) {
											if ((local346 < arg2 || arg1[local346][local323][local344] != arg3) && !Static588.method7714(local344, local225, local323)) {
												local304[local316][local325] = true;
												break;
											}
											local304[local316][local325] = false;
											break;
										}
									}
								}
							}
						}
					}
					if (Static661.aBoolean457) {
						if (arg4 >= 0) {
							Static246.aClass178Array1[local225].method7877(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static246.aClass178Array1[local225].method7870(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local316 = 0; local316 < Static32.anInt772; local316++) {
							Static684.aClass302Array1[local316].method6805(new Class8_Sub9(local225 + 1));
						}
					} else if (arg4 >= 0) {
						Static246.aClass178Array1[local225].method7877(Static403.anInt6246, Static550.anInt8271, Static35.anInt813, Static142.aBooleanArrayArray1, false, arg4, arg5);
					} else {
						Static246.aClass178Array1[local225].method7870(Static403.anInt6246, Static550.anInt8271, Static35.anInt813, Static142.aBooleanArrayArray1, false, arg5);
					}
				}
			}
		}
		if (Static645.anInt9611 > 0) {
			Static498.method6650(Static395.aClass8_Sub2Array11, 0, Static645.anInt9611 - 1);
			for (local225 = 0; local225 < Static645.anInt9611; local225++) {
				Static632.method8368(Static395.aClass8_Sub2Array11[local225], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!eo;)V")
	private static void method6824(@OriginalArg(0) Class8_Sub2 arg0) {
		Static665.aClass19_15.H(arg0.anInt10690, arg0.anInt10691 + (arg0.method9286(2) >> 1), arg0.anInt10694, Static486.anIntArray591);
		arg0.anInt10692 = Static486.anIntArray591[0];
		arg0.anInt10698 = Static486.anIntArray591[1];
		arg0.anInt10697 = Static486.anIntArray591[2];
	}
}
