import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!o", name = "rb", descriptor = "I")
	public static int anInt6751;

	@OriginalMember(owner = "client!o", name = "x", descriptor = "Lclient!dla;")
	public static final SoftLruHashTable aSoftLruHashTable145 = new SoftLruHashTable(4);

	@OriginalMember(owner = "client!o", name = "jb", descriptor = "Lclient!jg;")
	public static final Class191 aClass191_1 = new Class191();

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!sb;Lclient!sb;Lclient!sb;BLclient!sb;)V")
	public static void method5987(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(4) Js5 arg3) {
		Static262.aJs556 = arg2;
		Static666.aJs5118 = arg0;
		Static607.aJs5113 = arg3;
		Static453.components = new Component[Static666.aJs5118.capacity()][];
		Static132.aBooleanArray5 = new boolean[Static666.aJs5118.capacity()];
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public static void method5988() {
		@Pc(13) SecondaryLinkable_Sub2 local13 = Static440.create(15, 0L);
		local13.pushClient();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Lclient!vaa;")
	public static ParticleEmitterType method5994(@OriginalArg(1) int arg0) {
		@Pc(10) ParticleEmitterType local10 = (ParticleEmitterType) Static289.aSoftLruHashTable100.get((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static409.aJs585.fetchFile(0, arg0);
		local10 = new ParticleEmitterType();
		if (local21 != null) {
			local10.method8656(new Packet(local21));
		}
		local10.method8654();
		Static289.aSoftLruHashTable100.put((long) arg0, local10);
		return local10;
	}
}
