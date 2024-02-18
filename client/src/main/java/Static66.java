import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!iba;")
	public static Js5CacheQueue aJs5CacheQueue1;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Lclient!ok;")
	public static ParticleEffectorType method1487(@OriginalArg(1) int arg0) {
		@Pc(10) ParticleEffectorType local10 = (ParticleEffectorType) Static713.aSoftLruHashTable231.method2156((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static309.aJs562.method7595(arg0, 1);
		local10 = new ParticleEffectorType();
		local10.anInt6980 = arg0;
		if (local21 != null) {
			local10.method6274(new Packet(local21));
		}
		local10.method6273();
		if (local10.anInt6982 == 2 && Static503.aHashTable38.get((long) arg0) == null) {
			Static503.aHashTable38.put((long) arg0, new IntNode(Static370.anInt5881));
			Static367.aParticleEffectorTypeArray1[Static370.anInt5881++] = local10;
		}
		Static713.aSoftLruHashTable231.method2150(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method1488() {
		if (Static135.anInt8223 == 10) {
			Static135.anInt8223 = 11;
		}
	}
}
