import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public final class Class57_Sub26 extends Class57 {

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Linkable_Sub34 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub26(@OriginalArg(0) Linkable_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IB)I")
	@Override
	public int method8352(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub34_34.method5111()) {
			return 3;
		} else if (arg0 == 0 || super.aClass2_Sub34_34.aClass57_Sub23_1.method7054() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)I")
	public int method7463() {
		return super.anInt9489;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)Z")
	public boolean method7464() {
		return !super.aClass2_Sub34_34.method5111();
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)I")
	@Override
	protected int method8354() {
		return 1;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
	@Override
	public void method8350() {
		if (super.aClass2_Sub34_34.method5111()) {
			super.anInt9489 = 0;
		}
		if (super.anInt9489 < 0 && super.anInt9489 > 2) {
			super.anInt9489 = this.method8354();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8353(@OriginalArg(1) int arg0) {
		super.anInt9489 = arg0;
	}
}
