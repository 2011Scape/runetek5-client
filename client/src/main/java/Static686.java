import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static686 {

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
	public static int sampleRate;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "[I")
	public static int[] anIntArray710 = new int[1];

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(JI)V")
	public static void method7930(@OriginalArg(0) long arg0) {
		if (Static334.aClass291ArrayArrayArray1 != null) {
			if (Static511.cameraType == 1 || Static511.cameraType == 5) {
				Static604.method7903(arg0);
			} else if (Static511.cameraType == 4) {
				Static349.method5121(arg0);
			}
		}
		Static147.method2421((long) Static333.loop, Static163.aClass19_17);
		if (Static377.topLevelInterface != -1) {
			Static26.method716(Static377.topLevelInterface);
		}
		for (@Pc(54) int local54 = 0; local54 < Static122.anInt2339; local54++) {
			if (Static364.aBooleanArray18[local54]) {
				Static469.aBooleanArray23[local54] = true;
			}
			Static359.aBooleanArray17[local54] = Static364.aBooleanArray18[local54];
			Static364.aBooleanArray18[local54] = false;
		}
		Static171.anInt2880 = Static333.loop;
		Static449.method6114(-1, -1, (Component) null);
		if (105 <= 103) {
			return;
		}
		if (Static377.topLevelInterface != -1) {
			Static122.anInt2339 = 0;
			Static261.method3833();
		}
		Static163.aClass19_17.la();
		Static676.method8859(Static163.aClass19_17);
		@Pc(116) int local116 = Static679.method8909();
		if (local116 == -1) {
			local116 = Static442.anInt6699;
		}
		if (local116 == -1) {
			local116 = ParticleNode_Sub2_Sub4_Sub1.lb;
		}
		Static115.method2136(local116);
		@Pc(136) int local136 = Static556.self.method9302((byte) 70) << 8;
		Static220.method3198(Static35.anInt800, local136 + Static556.self.zFine, Static556.self.xFine - -local136, Static556.self.plane);
		Static35.anInt800 = 0;
	}
}
