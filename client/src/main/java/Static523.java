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
