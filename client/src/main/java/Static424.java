import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
	public static int anInt6459 = 0;

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt79 = new ClientProt(14, 3);

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V")
	public static void method5779() {
		@Pc(1) SoftLruHashTable local1 = Static580.aSoftLruHashTable186;
		synchronized (Static580.aSoftLruHashTable186) {
			Static580.aSoftLruHashTable186.removeSoft();
		}
		local1 = Static54.aSoftLruHashTable25;
		synchronized (Static54.aSoftLruHashTable25) {
			Static54.aSoftLruHashTable25.removeSoft();
		}
	}
}
