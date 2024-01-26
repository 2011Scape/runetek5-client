import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!cb", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
	private int anInt1519;

	@OriginalMember(owner = "client!cb", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "Z")
	private boolean aBoolean134 = false;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	private Class56_Sub1() {
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
	@Override
	protected void method3583() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean134) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(38) Info local38 = new Info(Static64.aClass3 == null ? (Static64.aClass3 = a("javax.sound.sampled.SourceDataLine")) : Static64.aClass3, this.anAudioFormat1, this.anInt1519 << (Static316.aBoolean644 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local38);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "()V")
	@Override
	protected void method3590() {
		@Pc(1) short local1 = 256;
		if (Static316.aBoolean644) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray315[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray17[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray17[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray17, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	@Override
	public void method3588(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(23) Info local23 = new Info(Static64.aClass3 == null ? (Static64.aClass3 = a("javax.sound.sampled.SourceDataLine")) : Static64.aClass3, this.anAudioFormat1, arg0 << (Static316.aBoolean644 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local23);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1519 = arg0;
		} catch (@Pc(39) LineUnavailableException local39) {
			if (Static171.method2670(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local39;
			} else {
				this.method3588(Static440.method5962(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "()V")
	@Override
	protected void method3596() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "()I")
	@Override
	protected int method3587() {
		return this.anInt1519 - (this.aSourceDataLine1.available() >> (Static316.aBoolean644 ? 2 : 1));
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3593(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) javax.sound.sampled.Mixer.Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(28) String local28 = local20.getName();
					if (local28 != null && local28.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean134 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static686.anInt8944, 16, Static316.aBoolean644 ? 2 : 1, true, false);
		this.aByteArray17 = new byte[0x100 << (Static316.aBoolean644 ? 2 : 1)];
	}
}
