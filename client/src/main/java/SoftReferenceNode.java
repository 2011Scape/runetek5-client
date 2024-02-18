import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class SoftReferenceNode extends ReferenceNode {

	@OriginalMember(owner = "client!wi", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public SoftReferenceNode(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method9268() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9270() {
		return true;
	}
}
