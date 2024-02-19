import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!rka", name = "Ub", descriptor = "Lclient!rt;")
	public static WorldMapFont aWorldMapFont7;

	@OriginalMember(owner = "client!rka", name = "Qb", descriptor = "Lclient!cd;")
	public static AudioChannel aAudioChannel3;

	@OriginalMember(owner = "client!rka", name = "Ob", descriptor = "I")
	public static int anInt8410 = 0;

	@OriginalMember(owner = "client!rka", name = "b", descriptor = "(ZI)V")
	public static void method7414() {
		@Pc(5) SoftLruHashTable local5 = Static580.aSoftLruHashTable186;
		synchronized (Static580.aSoftLruHashTable186) {
			Static580.aSoftLruHashTable186.clean(5);
		}
		local5 = Static54.aSoftLruHashTable25;
		synchronized (Static54.aSoftLruHashTable25) {
			Static54.aSoftLruHashTable25.clean(5);
		}
	}

}
