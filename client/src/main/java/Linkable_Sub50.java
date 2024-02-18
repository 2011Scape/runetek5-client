import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Linkable_Sub50 extends Linkable {

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "S")
	public short aShort119;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
	private Linkable_Sub50() {
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(S)V")
	public Linkable_Sub50(@OriginalArg(0) short arg0) {
		this.aShort119 = arg0;
	}
}
