import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Linkable_Sub55 extends Linkable {

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "[B")
	public final byte[] aByteArray105;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([B)V")
	public Linkable_Sub55(@OriginalArg(0) byte[] arg0) {
		this.aByteArray105 = arg0;
	}
}
