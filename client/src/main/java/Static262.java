import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!ica", name = "m", descriptor = "Lclient!sb;")
	public static Js5 aJs556;

	@OriginalMember(owner = "client!ica", name = "n", descriptor = "[I")
	public static final int[] anIntArray326 = new int[13];

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "(Z)V")
	public static void method3839() {
		@Pc(8) PacketBit local8 = Connection.gameConnection.inboundPacket;
		local8.bits();
		@Pc(16) int local16 = local8.gBit(8);
		@Pc(21) int local21;
		if (Static390.anInt6126 > local16) {
			for (local21 = local16; local21 < Static390.anInt6126; local21++) {
				Static118.anIntArray197[Static78.anInt1622++] = Static103.anIntArray187[local21];
			}
		}
		if (local16 > Static390.anInt6126) {
			throw new RuntimeException("gnpov1");
		}
		Static390.anInt6126 = 0;
		for (local21 = 0; local21 < local16; local21++) {
			@Pc(73) int local73 = Static103.anIntArray187[local21];
			@Pc(81) Npc local81 = ((Linkable_Sub45) Static18.aHashTable2.get((long) local73)).aClass8_Sub2_Sub1_Sub2_Sub2_2;
			@Pc(86) int local86 = local8.gBit(1);
			if (local86 == 0) {
				Static103.anIntArray187[Static390.anInt6126++] = local73;
				local81.anInt10751 = Static572.anInt8896;
			} else {
				@Pc(108) int local108 = local8.gBit(2);
				if (local108 == 0) {
					Static103.anIntArray187[Static390.anInt6126++] = local73;
					local81.anInt10751 = Static572.anInt8896;
					Static458.anIntArray553[Static86.anInt1798++] = local73;
				} else {
					@Pc(156) int local156;
					@Pc(166) int local166;
					if (local108 == 1) {
						Static103.anIntArray187[Static390.anInt6126++] = local73;
						local81.anInt10751 = Static572.anInt8896;
						local156 = local8.gBit(3);
						local81.method9325(1, local156);
						local166 = local8.gBit(1);
						if (local166 == 1) {
							Static458.anIntArray553[Static86.anInt1798++] = local73;
						}
					} else if (local108 == 2) {
						Static103.anIntArray187[Static390.anInt6126++] = local73;
						local81.anInt10751 = Static572.anInt8896;
						if (local8.gBit(1) == 1) {
							local156 = local8.gBit(3);
							local81.method9325(2, local156);
							local166 = local8.gBit(3);
							local81.method9325(2, local166);
						} else {
							local156 = local8.gBit(3);
							local81.method9325(0, local156);
						}
						local156 = local8.gBit(1);
						if (local156 == 1) {
							Static458.anIntArray553[Static86.anInt1798++] = local73;
						}
					} else if (local108 == 3) {
						Static118.anIntArray197[Static78.anInt1622++] = local73;
					}
				}
			}
		}
	}
}
