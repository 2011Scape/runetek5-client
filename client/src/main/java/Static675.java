import org.openrs2.deob.annotation.OriginalMember;

public final class Static675 {

	@OriginalMember(owner = "client!vga", name = "f", descriptor = "I")
	public static int anInt10154;

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "I")
	public static int anInt10155;

	@OriginalMember(owner = "client!vga", name = "m", descriptor = "J")
	public static long aLong307;

	@OriginalMember(owner = "client!vga", name = "c", descriptor = "I")
	public static int anInt10157;

	@OriginalMember(owner = "client!vga", name = "i", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt118 = new ClientProt(50, 3);

	@OriginalMember(owner = "client!vga", name = "j", descriptor = "I")
	public static int anInt10156 = -1;

	@OriginalMember(owner = "client!vga", name = "c", descriptor = "(I)V")
	public static void method8811() {
		Component.spriteCache.clear();
		Component.modelCache.clear();
		Static449.aSoftLruHashTable146.clear();
		Static444.aSoftLruHashTable145.clear();
	}
}
