import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class57_Sub4 extends Preference {

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub4(@OriginalArg(0) Preferences arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) Preferences arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8353(@OriginalArg(1) int arg0) {
		super.anInt9489 = arg0;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
	@Override
	public void method8350() {
		if (super.aClass2_Sub34_34.aClass57_Sub3_1.method2118() && super.anInt9489 == 2) {
			super.anInt9489 = 1;
		}
		if (super.anInt9489 < 0 || super.anInt9489 > 2) {
			super.anInt9489 = this.method8354();
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)I")
	@Override
	protected int method8354() {
		return 2;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)I")
	public int method2143() {
		return super.anInt9489;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)I")
	@Override
	public int method8352(@OriginalArg(0) int arg0) {
		return 1;
	}
}
