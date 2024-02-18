import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class LruHashTable {

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "[I")
	public static final int[] anIntArray740 = new int[16384];

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "[I")
	public static final int[] anIntArray741 = new int[16384];

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "Lclient!cm;")
	private SecondaryLinkable aClass2_Sub2_57 = new SecondaryLinkable();

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "Lclient!jga;")
	private final SecondaryLinkedList aSecondaryLinkedList15 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
	private int anInt9483;

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
	private final int anInt9484;

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "Lclient!av;")
	private final HashTable aHashTable42;

	static {
		@Pc(63) double local63 = 3.834951969714103E-4D;
		for (@Pc(65) int local65 = 0; local65 < 16384; local65++) {
			anIntArray741[local65] = (int) (Math.sin((double) local65 * local63) * 16384.0D);
			anIntArray740[local65] = (int) (Math.cos(local63 * (double) local65) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(I)V")
	public LruHashTable(@OriginalArg(0) int arg0) {
		this.anInt9483 = arg0;
		this.anInt9484 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aHashTable42 = new HashTable(local19);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLclient!cm;J)V")
	public void method8341(@OriginalArg(1) SecondaryLinkable arg0, @OriginalArg(2) long arg1) {
		if (this.anInt9483 == 0) {
			@Pc(19) SecondaryLinkable local19 = this.aSecondaryLinkedList15.removeTail();
			local19.unlink();
			local19.unlinkSecondary();
			if (this.aClass2_Sub2_57 == local19) {
				local19 = this.aSecondaryLinkedList15.removeTail();
				local19.unlink();
				local19.unlinkSecondary();
			}
		} else {
			this.anInt9483--;
		}
		this.aHashTable42.put(arg1, arg0);
		this.aSecondaryLinkedList15.addTail(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(JZ)Lclient!cm;")
	public SecondaryLinkable method8342(@OriginalArg(0) long arg0) {
		@Pc(16) SecondaryLinkable local16 = (SecondaryLinkable) this.aHashTable42.get(arg0);
		if (local16 != null) {
			this.aSecondaryLinkedList15.addTail(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IJ)V")
	public void method8344(@OriginalArg(1) long arg0) {
		@Pc(18) SecondaryLinkable local18 = (SecondaryLinkable) this.aHashTable42.get(arg0);
		if (local18 != null) {
			local18.unlink();
			local18.unlinkSecondary();
			this.anInt9483++;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	public void method8345() {
		this.aSecondaryLinkedList15.clear();
		this.aHashTable42.clear();
		this.aClass2_Sub2_57 = new SecondaryLinkable();
		this.anInt9483 = this.anInt9484;
	}
}
