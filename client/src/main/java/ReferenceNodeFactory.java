import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class ReferenceNodeFactory {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!vw;I)Lclient!vw;")
	public abstract ReferenceNode method4433(@OriginalArg(0) ReferenceNode arg0);
}
