import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class StringNode extends Linkable {

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "Ljava/lang/String;")
	public String value;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	private StringNode() {
	}

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public StringNode(@OriginalArg(0) String value) {
		this.value = value;
	}
}
