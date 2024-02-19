import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nka")
public abstract class ObjReferenceNodeFactory {

	@OriginalMember(owner = "client!qda", name = "p", descriptor = "Lclient!nka;")
	public static final ObjReferenceNodeFactory OBJ_REFERENCE_NODE_FACTORY = Static433.method5595();

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(Lclient!pv;I)Lclient!pv;")
	public abstract ObjReferenceNode method593(@OriginalArg(0) ObjReferenceNode arg0);
}
