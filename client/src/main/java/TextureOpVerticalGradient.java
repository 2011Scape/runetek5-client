import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class TextureOpVerticalGradient extends TextureOp {

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
	public TextureOpVerticalGradient() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int[] local9 = super.aMonochromeImageCache41.method3935(arg1);
		if (arg0 <= 107) {
			Static537.anIntArray633 = null;
		}
		if (super.aMonochromeImageCache41.aBoolean338) {
			Static734.method7690(local9, 0, Static608.anInt9289, Static273.anIntArray341[arg1]);
		}
		return local9;
	}
}
