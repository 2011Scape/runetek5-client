import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Linkable_Sub14_Sub5 extends Linkable_Sub14 {

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "B")
	private byte aByte72;

	@OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
	private int anInt4361 = -1;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!hi;I)V")
	@Override
	public void method8617(@OriginalArg(0) Class164 arg0) {
		arg0.method3489(this.aByte72, this.anInt4361);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!ge;)V")
	@Override
	public void method8615(@OriginalArg(1) Packet arg0) {
		this.anInt4361 = arg0.g2();
		this.aByte72 = arg0.g1b();
	}
}
