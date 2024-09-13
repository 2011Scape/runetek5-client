import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class ReferenceNodeFactory {

    @OriginalMember(owner = "client!nw", name = "k", descriptor = "Lclient!gh;")
    public static final ReferenceNodeFactory SOFT_REFERENCE_NODE_FACTORY = Static638.createSoftReferenceNodeFactory();

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!vw;I)Lclient!vw;")
	public abstract ReferenceNode create(@OriginalArg(0) ReferenceNode arg0);
}
