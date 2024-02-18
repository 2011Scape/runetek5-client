import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static674 {

	@OriginalMember(owner = "client!vfa", name = "o", descriptor = "I")
	public static int anInt10088;

	@OriginalMember(owner = "client!vfa", name = "X", descriptor = "I")
	public static int anInt10128;

	@OriginalMember(owner = "client!vfa", name = "Gb", descriptor = "Lclient!rfa;")
	public static ClanChannel aClass2_Sub47_3;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)V")
	public static void method8789(@OriginalArg(0) int arg0) {
		if (Static283.anInt4574 == 7 && (Static135.anInt8223 == 0 && Static6.anInt95 == 0)) {
			Static470.anInt7113 = arg0;
			Static81.method1586(9);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(B)V")
	public static void method8806() {
		Static517.method6822(Static400.aClass2_Sub34_28.aClass57_Sub17_1.method5667() == 1);
		Static719.aAudioChannel5 = Static638.method8394(Static446.aSignlink6, 0, 22050, Static434.aCanvas7);
		Static697.method9120(Static48.method1100((MidiPcmStream) null));
		Static559.aAudioChannel3 = Static638.method8394(Static446.aSignlink6, 1, 2048, Static434.aCanvas7);
		Static336.aClass2_Sub6_Sub3_1 = new MixerPcmStream();
		Static559.aAudioChannel3.method3582(Static336.aClass2_Sub6_Sub3_1);
		Static681.aResampler2 = new Resampler(22050, Static686.anInt8944);
		Static550.method7266();
	}
}
