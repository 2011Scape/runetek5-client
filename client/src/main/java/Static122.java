import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
	public static int anInt2339 = 0;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)Lclient!fu;")
	public static MapElement method2207() {
		if (Static30.aLinkedList31 == null || Static444.aClass191_1 == null) {
			return null;
		}
		Static444.aClass191_1.method4344(Static30.aLinkedList31);
		@Pc(23) MapElement local23 = (MapElement) Static444.aClass191_1.method4343();
		if (local23 == null) {
			return null;
		} else {
			@Pc(42) MelType local42 = Static30.aMelTypeList3.method5584(local23.anInt3131);
			return local42 != null && local42.aBoolean217 && local42.method2425(Static30.anInterface23_3) ? local23 : Static364.method5248();
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)V")
	public static void method2208(@OriginalArg(0) int arg0) {
		if (!Static571.method7566(arg0)) {
			return;
		}
		@Pc(13) Component[] local13 = Static453.aComponentArrayArray2[arg0];
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(20) Component local20 = local13[local15];
			if (local20 != null && local20.aClass152_6 != null) {
				local20.aClass152_6.method9099();
			}
		}
	}
}
