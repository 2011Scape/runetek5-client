import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!bu", name = "O", descriptor = "Lclient!sb;")
	public static Js5 aJs512;

	@OriginalMember(owner = "client!bu", name = "H", descriptor = "I")
	public static int anInt1177 = 1400;

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(III)Z")
	public static boolean method1257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!wj;)V")
	public static void method1259(@OriginalArg(1) ParticleNode_Sub2_Sub1_Sub2_Sub2 arg0) {
		for (@Pc(17) Linkable_Sub51 local17 = (Linkable_Sub51) Static717.aLinkedList81.head(); local17 != null; local17 = (Linkable_Sub51) Static717.aLinkedList81.next()) {
			if (local17.aClass8_Sub2_Sub1_Sub2_Sub2_3 == arg0) {
				if (local17.aClass2_Sub6_Sub2_4 != null) {
					Static336.aClass2_Sub6_Sub3_1.method5883(local17.aClass2_Sub6_Sub2_4);
					local17.aClass2_Sub6_Sub2_4 = null;
				}
				local17.unlink();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "(B)I")
	public static int method1260() {
		return Static448.anInt6796 == 1 ? Static576.anInt8585 : Static281.anInt4566;
	}
}
