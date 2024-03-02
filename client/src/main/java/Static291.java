import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static291 {

	@OriginalMember(owner = "client!je", name = "g", descriptor = "[Lclient!st;")
	public static SoftwareIndexedSprite[] aSoftwareIndexedSpriteArray8;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!av;")
	public static final HashTable aHashTable24 = new HashTable(512);

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)I")
	public static int method4226(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
