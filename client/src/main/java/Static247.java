import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!hla", name = "d", descriptor = "I")
	public static int anInt3993;

	@OriginalMember(owner = "client!hla", name = "a", descriptor = "(ILclient!ca;)V")
	public static void method3523(@OriginalArg(1) ParticleNode_Sub2_Sub1_Sub2_Sub1 arg0) {
		@Pc(16) Linkable_Sub51 local16 = (Linkable_Sub51) Static113.aHashTable12.get((long) arg0.anInt10740);
		if (local16 == null) {
			Static89.method1714(arg0.aByte144, arg0, arg0.anIntArray879[0], arg0.anIntArray878[0], (ParticleNode_Sub2_Sub1_Sub2_Sub2) null, (LocType) null, 0);
		} else {
			local16.method8236();
		}
	}

	@OriginalMember(owner = "client!hla", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
	public static Object method3524(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static132.aBoolean208) {
			try {
				@Pc(25) ByteArray local25 = (ByteArray) Class.forName("DirectByteArray").getDeclaredConstructor().newInstance();
				local25.method3849(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static132.aBoolean208 = true;
			}
		}
		return arg0;
	}
}
