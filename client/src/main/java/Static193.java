import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BI)V")
	public static void method2897(@OriginalArg(1) int arg0) {
		for (@Pc(11) Linkable local11 = Static291.aHashTable24.head(); local11 != null; local11 = Static291.aHashTable24.next()) {
			if ((long) arg0 == (local11.id >> 48 & 0xFFFFL)) {
				local11.unlink();
			}
		}
	}
}
