import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class AudioThread implements Runnable {

	@OriginalMember(owner = "client!faa", name = "g", descriptor = "Lclient!vq;")
	public Signlink aSignlink2;

	@OriginalMember(owner = "client!faa", name = "f", descriptor = "[Lclient!cd;")
	public final AudioChannel[] aAudioChannelArray1 = new AudioChannel[2];

	@OriginalMember(owner = "client!faa", name = "h", descriptor = "Z")
	public volatile boolean allChannelsClosed = false;

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "Z")
	public volatile boolean isRunning = false;

	@OriginalMember(owner = "client!faa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.isRunning = true;
		try {
			while (!this.allChannelsClosed) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(21) AudioChannel local21 = this.aAudioChannelArray1[local12];
					if (local21 != null) {
						local21.method3594();
					}
				}
				Static638.sleep(10L);
				Static61.method1312(this.aSignlink2, (Object) null);
			}
		} catch (@Pc(49) Exception local49) {
			Static240.method3496(local49, (String) null);
		} finally {
			@Pc(59) Object local59 = null;
			this.isRunning = false;
		}
	}
}
