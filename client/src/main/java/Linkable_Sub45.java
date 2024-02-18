import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public final class Linkable_Sub45 extends Linkable {

	@OriginalMember(owner = "client!qfa", name = "l", descriptor = "Lclient!wj;")
	public final ParticleNode_Sub2_Sub1_Sub2_Sub2 aClass8_Sub2_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lclient!wj;)V")
	public Linkable_Sub45(@OriginalArg(0) ParticleNode_Sub2_Sub1_Sub2_Sub2 arg0) {
		this.aClass8_Sub2_Sub1_Sub2_Sub2_2 = arg0;
	}
}
