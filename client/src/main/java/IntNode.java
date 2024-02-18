import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public final class IntNode extends Linkable {

	@OriginalMember(owner = "client!nca", name = "p", descriptor = "I")
	public int value;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "()V")
	private IntNode() {
	}

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(I)V")
	public IntNode(@OriginalArg(0) int value) {
		this.value = value;
	}
}
