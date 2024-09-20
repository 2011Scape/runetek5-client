import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static615 {

	@OriginalMember(owner = "client!tha", name = "e", descriptor = "I")
	public static int anInt9389;

	@OriginalMember(owner = "client!tha", name = "g", descriptor = "Z")
	public static final boolean aBoolean719 = false;

	@OriginalMember(owner = "client!tha", name = "f", descriptor = "[I")
	public static final int[] anIntArray719 = new int[13];

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(II)Lclient!pq;")
	public static World getWorld(@OriginalArg(1) int arg0) {
		return Static518.loaded && Static494.minId <= arg0 && Static699.maxId >= arg0 ? Static106.worlds[arg0 - Static494.minId] : null;
	}
}
