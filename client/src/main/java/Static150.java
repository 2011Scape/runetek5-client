import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static150 {

	@OriginalMember(owner = "client!en", name = "h", descriptor = "I")
	public static int anInt2634;

	@OriginalMember(owner = "client!en", name = "d", descriptor = "[I")
	public static int[] anIntArray233;

	@OriginalMember(owner = "client!en", name = "m", descriptor = "I")
	public static int anInt2631 = 0;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "I")
	public static int anInt2632 = 0;

	@OriginalMember(owner = "client!en", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString26 = null;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	public static void method2455() {
		Static173.closeAudioChannels();
		Static517.method6822(Static400.aClass2_Sub34_28.aPreference_Sub17_1.method5667() == 1);
		Static719.aAudioChannel5 = Static638.create(Static446.aSignlink6, 0, 22050, Static434.canvas);
		Static697.method9120(Static48.method1100((MidiPcmStream) null));
		Static559.aAudioChannel3 = Static638.create(Static446.aSignlink6, 1, 2048, Static434.canvas);
		Static559.aAudioChannel3.method3582(Static336.aClass2_Sub6_Sub3_1);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BLclient!ge;)Lclient!hba;")
	public static Class154_Sub1 method2456(@OriginalArg(1) Packet arg0) {
		return new Class154_Sub1(arg0.g2s(), arg0.g2s(), arg0.g2s(), arg0.g2s(), arg0.g3(), arg0.g3(), arg0.g1());
	}
}
