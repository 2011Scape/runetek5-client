import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class SoftReferenceNodeFactory extends ReferenceNodeFactory {

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
	private SoftReferenceNodeFactory() {
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!vw;I)Lclient!vw;")
	@Override
	public ReferenceNode create(@OriginalArg(0) ReferenceNode arg0) {
		return new SoftReferenceNode(arg0.get(), arg0.size);
	}
}
