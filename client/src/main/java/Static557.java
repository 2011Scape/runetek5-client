import org.openrs2.deob.annotation.OriginalMember;

public final class Static557 {

	@OriginalMember(owner = "client!rja", name = "C", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_37 = new Class155(0);

	@OriginalMember(owner = "client!rja", name = "e", descriptor = "(B)V")
	public static void method7331() {
		if (Static719.aAudioChannel5 != null) {
			Static719.aAudioChannel5.method3594();
		}
		if (Static559.aAudioChannel3 != null) {
			Static559.aAudioChannel3.method3594();
		}
	}

	@OriginalMember(owner = "client!rja", name = "d", descriptor = "(I)Lclient!pq;")
	public static World getNextWorld() {
		return Static59.anInt5936 < Static343.sorted.length ? Static343.sorted[Static59.anInt5936++] : null;
	}
}
