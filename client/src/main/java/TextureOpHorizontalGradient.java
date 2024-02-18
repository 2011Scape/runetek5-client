import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public final class TextureOpHorizontalGradient extends TextureOp {

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "()V")
	public TextureOpHorizontalGradient() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 <= 107) {
			this.method9411(49, -21);
		}
		return Static54.anIntArray92;
	}
}
