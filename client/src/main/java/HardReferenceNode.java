import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class HardReferenceNode extends ReferenceNode {

	@OriginalMember(owner = "client!mh", name = "z", descriptor = "Ljava/lang/Object;")
	private final Object anObject11;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public HardReferenceNode(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject11 = arg0;
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object get() {
		return this.anObject11;
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)Z")
	@Override
	public boolean isSoft() {
		return false;
	}
}
