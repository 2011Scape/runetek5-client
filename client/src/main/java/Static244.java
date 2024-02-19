import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static244 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	public static void method3512() {
		Static12.aSoftwareIndexedSprite26 = null;
		Static643.anInt9604 = -1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BII)I")
	public static int method3513(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
