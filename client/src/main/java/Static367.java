import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "[Lclient!ok;")
	public static final ParticleEffectorType[] aParticleEffectorTypeArray1 = new ParticleEffectorType[16];

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	public static void method5267() {
		@Pc(1) SoftLruHashTable local1 = Static354.SHADOWS;
		synchronized (Static354.SHADOWS) {
			Static354.SHADOWS.clear();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
	public static void method5268() {
		Static129.anInt2409 = -1;
		Static430.aLong209 = 0L;
		Static319.aString51 = "";
	}
}
