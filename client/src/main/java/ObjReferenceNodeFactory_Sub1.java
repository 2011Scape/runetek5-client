import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class ObjReferenceNodeFactory_Sub1 extends ObjReferenceNodeFactory {

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	private ObjReferenceNodeFactory_Sub1() {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!pv;I)Lclient!pv;")
	@Override
	public ObjReferenceNode method593(@OriginalArg(0) ObjReferenceNode arg0) {
		return new SecondaryLinkable_Sub11_Sub1(arg0.anInterface24_3, arg0.get(), arg0.size);
	}
}
