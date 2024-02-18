import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class SynthSound {

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "[Lclient!ng;")
	private final SynthInstrument[] aSynthInstrumentArray1 = new SynthInstrument[10];

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
	private int anInt2381;

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
	private int anInt2382;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!ge;)V")
	public SynthSound(@OriginalArg(0) Packet arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.g1();
			if (local12 != 0) {
				arg0.pos--;
				this.aSynthInstrumentArray1[local7] = new SynthInstrument();
				this.aSynthInstrumentArray1[local7].method5775(arg0);
			}
		}
		this.anInt2381 = arg0.g2();
		this.anInt2382 = arg0.g2();
	}

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
	private SynthSound() {
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "()[B")
	private byte[] method2246() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aSynthInstrumentArray1[local3] != null && this.aSynthInstrumentArray1[local3].anInt6454 + this.aSynthInstrumentArray1[local3].anInt6455 > local1) {
				local1 = this.aSynthInstrumentArray1[local3].anInt6454 + this.aSynthInstrumentArray1[local3].anInt6455;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aSynthInstrumentArray1[local54] != null) {
				@Pc(70) int local70 = this.aSynthInstrumentArray1[local54].anInt6454 * 22050 / 1000;
				@Pc(80) int local80 = this.aSynthInstrumentArray1[local54].anInt6455 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aSynthInstrumentArray1[local54].method5776(local70, this.aSynthInstrumentArray1[local54].anInt6454);
				for (@Pc(94) int local94 = 0; local94 < local70; local94++) {
					@Pc(107) int local107 = local52[local94 + local80] + (local92[local94] >> 8);
					if ((local107 + 128 & 0xFFFFFF00) != 0) {
						local107 = local107 >> 31 ^ 0x7F;
					}
					local52[local94 + local80] = (byte) local107;
				}
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "()Lclient!sq;")
	public PcmSound method2247() {
		@Pc(2) byte[] local2 = this.method2246();
		return new PcmSound(22050, local2, this.anInt2381 * 22050 / 1000, this.anInt2382 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "()I")
	public int method2248() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aSynthInstrumentArray1[local3] != null && this.aSynthInstrumentArray1[local3].anInt6455 / 20 < local1) {
				local1 = this.aSynthInstrumentArray1[local3].anInt6455 / 20;
			}
		}
		if (this.anInt2381 < this.anInt2382 && this.anInt2381 / 20 < local1) {
			local1 = this.anInt2381 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aSynthInstrumentArray1[local55] != null) {
				this.aSynthInstrumentArray1[local55].anInt6455 -= local1 * 20;
			}
		}
		if (this.anInt2381 < this.anInt2382) {
			this.anInt2381 -= local1 * 20;
			this.anInt2382 -= local1 * 20;
		}
		return local1;
	}
}
