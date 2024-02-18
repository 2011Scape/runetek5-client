import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public final class Preference_Sub30 extends Preference {

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Preference_Sub30(@OriginalArg(0) Preferences arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Preference_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) Preferences arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)Z")
	public boolean method8355() {
		if (super.aClass2_Sub34_34.method5105() == ModeGame.GAME_RUNESCAPE) {
			return !super.aClass2_Sub34_34.method5111();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
	@Override
	public void method8350() {
		if (super.aClass2_Sub34_34.method5105() != ModeGame.GAME_RUNESCAPE) {
			super.anInt9489 = 1;
		} else if (super.aClass2_Sub34_34.method5111()) {
			super.anInt9489 = 0;
		}
		if (super.anInt9489 != 0 && super.anInt9489 != 1) {
			super.anInt9489 = this.method8354();
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)I")
	public int method8356() {
		return super.anInt9489;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8353(@OriginalArg(1) int arg0) {
		super.anInt9489 = arg0;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IB)I")
	@Override
	public int method8352(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub34_34.method5105() != ModeGame.GAME_RUNESCAPE) {
			return 3;
		} else if (super.aClass2_Sub34_34.method5111()) {
			return 3;
		} else if (arg0 == 0 || super.aClass2_Sub34_34.aPreference_Sub23_1.method7054() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)I")
	@Override
	protected int method8354() {
		return 1;
	}
}
