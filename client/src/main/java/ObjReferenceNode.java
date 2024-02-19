import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public abstract class ObjReferenceNode extends SecondaryLinkable {

	@OriginalMember(owner = "client!pv", name = "u", descriptor = "I")
	public final int size;

	@OriginalMember(owner = "client!pv", name = "x", descriptor = "Lclient!uq;")
	public final Interface24 anInterface24_3;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!uq;I)V")
	protected ObjReferenceNode(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) int arg1) {
		this.size = arg1;
		this.anInterface24_3 = arg0;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object get();

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(B)Z")
	public abstract boolean isSoft();
}
