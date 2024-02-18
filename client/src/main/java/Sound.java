import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public abstract class Sound extends Linkable {

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
	public int anInt8817;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	protected Sound() {
	}
}
