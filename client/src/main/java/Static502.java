import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "S")
	public static short aShort97 = 320;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZBLclient!ha;ZI)Lclient!cl;")
	public static Class70 method6719(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (arg3 == -1) {
			return null;
		}
		if (Static552.anIntArray753 != null) {
			for (@Pc(14) int local14 = 0; local14 < Static552.anIntArray753.length; local14++) {
				if (Static552.anIntArray753[local14] == arg3) {
					return Static378.aClass70Array1[local14];
				}
			}
		}
		@Pc(54) Class70 local54 = (Class70) Static627.aSoftLruHashTable200.get((long) ((arg0 ? 1 : 0) | arg3 << 1));
		if (local54 != null) {
			if (arg2 && local54.aClass381_5 == null) {
				@Pc(70) Class381 local70 = Static238.method3468(arg3, Static237.aJs587);
				if (local70 == null) {
					return null;
				}
				local54.aClass381_5 = local70;
			}
			return local54;
		}
		@Pc(84) Class407[] local84 = Static735.method9387(Static555.aJs5106, arg3);
		if (local84 == null) {
			return null;
		}
		@Pc(94) Class381 local94 = Static238.method3468(arg3, Static237.aJs587);
		if (local94 == null) {
			return null;
		}
		if (arg2) {
			local54 = new Class70(arg1.method8010(local94, local84, arg0), local94);
		} else {
			local54 = new Class70(arg1.method8010(local94, local84, arg0));
		}
		Static627.aSoftLruHashTable200.put((long) (arg3 << 1 | (arg0 ? 1 : 0)), local54);
		return local54;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLclient!ge;)Lclient!il;")
	public static Class138_Sub3 method6720(@OriginalArg(1) Packet arg0) {
		@Pc(7) Class138 local7 = Static632.method8359(arg0);
		@Pc(23) int local23 = arg0.g4();
		@Pc(27) int local27 = arg0.g4();
		return new Class138_Sub3(local7.aClass403_10, local7.aClass103_10, local7.anInt4423, local7.anInt4412, local7.anInt4418, local7.anInt4413, local7.anInt4416, local7.anInt4415, local7.anInt4421, local23, local27);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B[B)V")
	public static void method6721(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Packet local10 = new Packet(arg0);
		while (true) {
			@Pc(14) int local14;
			@Pc(55) int local55;
			@Pc(50) int local50;
			label46: do {
				while (true) {
					while (true) {
						local14 = local10.g1();
						if (local14 == 0) {
							return;
						}
						if (local14 == 1) {
							@Pc(137) int[] local137 = Static449.anIntArray546 = new int[6];
							local137[0] = local10.g2();
							local137[1] = local10.g2();
							local137[2] = local10.g2();
							local137[3] = local10.g2();
							local137[4] = local10.g2();
							local137[5] = local10.g2();
						} else {
							if (local14 != 4) {
								continue label46;
							}
							local50 = local10.g1();
							Static406.anIntArray484 = new int[local50];
							for (local55 = 0; local55 < local50; local55++) {
								Static406.anIntArray484[local55] = local10.g2();
								if (Static406.anIntArray484[local55] == 65535) {
									Static406.anIntArray484[local55] = -1;
								}
							}
						}
					}
				}
			} while (local14 != 5);
			local50 = local10.g1();
			Static150.anIntArray233 = new int[local50];
			for (local55 = 0; local55 < local50; local55++) {
				Static150.anIntArray233[local55] = local10.g2();
				if (Static150.anIntArray233[local55] == 65535) {
					Static150.anIntArray233[local55] = -1;
				}
			}
		}
	}
}
