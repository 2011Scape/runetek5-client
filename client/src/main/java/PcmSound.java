import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public final class PcmSound extends Sound {

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "Z")
	public boolean aBoolean668;

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
	public int anInt8818;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "[B")
	public byte[] aByteArray98;

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
	public int anInt8819;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
	public int anInt8820;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(I[BII)V")
	public PcmSound(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8818 = arg0;
		this.aByteArray98 = arg1;
		this.anInt8819 = arg2;
		this.anInt8820 = arg3;
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(I[BIIZ)V")
	public PcmSound(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8818 = arg0;
		this.aByteArray98 = arg1;
		this.anInt8819 = arg2;
		this.anInt8820 = arg3;
		this.aBoolean668 = arg4;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!lg;)Lclient!sq;")
	public PcmSound method7821(@OriginalArg(0) Resampler arg0) {
		this.aByteArray98 = arg0.method5235(this.aByteArray98);
		this.anInt8818 = arg0.scaleRate(this.anInt8818);
		if (this.anInt8819 == this.anInt8820) {
			this.anInt8819 = this.anInt8820 = arg0.scalePosition(this.anInt8819);
		} else {
			this.anInt8819 = arg0.scalePosition(this.anInt8819);
			this.anInt8820 = arg0.scalePosition(this.anInt8820);
			if (this.anInt8819 == this.anInt8820) {
				this.anInt8819--;
			}
		}
		return this;
	}
}
