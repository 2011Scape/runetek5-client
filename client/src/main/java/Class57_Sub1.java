import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class57_Sub1 extends Preference {

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Preferences arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub1(@OriginalArg(0) Preferences arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)I")
	@Override
	public int method8352(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	@Override
	protected int method8354() {
		return super.aClass2_Sub34_34.method5108().method5198() ? 3 : 2;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)I")
	public int method1485() {
		return super.anInt9489;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	@Override
	public void method8350() {
		if (super.anInt9489 < 1 || super.anInt9489 > 3) {
			super.anInt9489 = this.method8354();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8353(@OriginalArg(1) int arg0) {
		super.anInt9489 = arg0;
	}
}
