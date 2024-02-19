import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public final class ObjectNode extends ObjReferenceNode {

	@OriginalMember(owner = "client!tja", name = "y", descriptor = "Ljava/lang/Object;")
	private final Object value;

	@OriginalMember(owner = "client!tja", name = "<init>", descriptor = "(Lclient!uq;Ljava/lang/Object;I)V")
	public ObjectNode(@OriginalArg(0) Interface24 key, @OriginalArg(1) Object value, @OriginalArg(2) int size) {
		super(key, size);
		this.value = value;
	}

	@OriginalMember(owner = "client!tja", name = "c", descriptor = "(B)Z")
	@Override
	public boolean isSoft() {
		return false;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object get() {
		return this.value;
	}
}
