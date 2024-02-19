import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static697 {

	@OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
	public static int anInt10505 = 0;

	@OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
	public static final int anInt10507 = 1405;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZILclient!bd;)V")
	public static void method9120(@OriginalArg(2) MidiPcmStream arg0) {
		Static719.aAudioChannel5.method3582(arg0);
		Static220.method3201(Static719.aAudioChannel5, client.vorbis, client.synthSounds, client.midiInstruments, arg0);
	}
}
