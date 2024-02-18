import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class ParticleNode_Sub9 extends ParticleNode {

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "I")
	public final int anInt8501;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(I)V")
	public ParticleNode_Sub9(@OriginalArg(0) int arg0) {
		this.anInt8501 = arg0;
	}
}
