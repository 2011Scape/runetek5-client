import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class39_Sub14 extends Class39 {

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
	private final int anInt5872;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
	private final int anInt5880;

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
	private final int anInt5879;

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
	private final int anInt5874;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub14(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt5872 = arg0.g2();
		this.anInt5880 = arg0.g1();
		this.anInt5879 = arg0.g1();
		this.anInt5874 = arg0.g1();
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	@Override
	public void method9161() {
		Static161.play(this.anInt5879, 0, this.anInt5872, this.anInt5874, this.anInt5880);
	}
}
