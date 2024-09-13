import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gga")
public final class SecondaryHashTable {

	@OriginalMember(owner = "client!gga", name = "h", descriptor = "Lclient!cm;")
	private SecondaryLinkable aClass2_Sub2_31;

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "J")
	private long aLong115;

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "[Lclient!cm;")
	private final SecondaryLinkable[] buckets;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "I")
	private final int size;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(I)V")
	public SecondaryHashTable(@OriginalArg(0) int arg0) {
		this.buckets = new SecondaryLinkable[arg0];
		this.size = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) SecondaryLinkable local20 = this.buckets[local10] = new SecondaryLinkable();
			local20.secondaryNext = local20;
			local20.secondaryPrev = local20;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(BLclient!cm;J)V")
	public void method3094(@OriginalArg(1) SecondaryLinkable arg0, @OriginalArg(2) long arg1) {
		if (arg0.secondaryNext != null) {
			arg0.unlinkSecondary();
		}
		@Pc(28) SecondaryLinkable local28 = this.buckets[(int) ((long) (this.size - 1) & arg1)];
		arg0.secondaryPrev = local28;
		arg0.secondaryNext = local28.secondaryNext;
		arg0.secondaryNext.secondaryPrev = arg0;
		arg0.secondaryPrev.secondaryNext = arg0;
		arg0.secondaryKey = arg1;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(JI)Lclient!cm;")
	public SecondaryLinkable method3095(@OriginalArg(0) long arg0) {
		this.aLong115 = arg0;
		@Pc(20) SecondaryLinkable local20 = this.buckets[(int) (arg0 & (long) (this.size - 1))];
		for (this.aClass2_Sub2_31 = local20.secondaryPrev; this.aClass2_Sub2_31 != local20; this.aClass2_Sub2_31 = this.aClass2_Sub2_31.secondaryPrev) {
			if (arg0 == this.aClass2_Sub2_31.secondaryKey) {
				@Pc(41) SecondaryLinkable local41 = this.aClass2_Sub2_31;
				this.aClass2_Sub2_31 = this.aClass2_Sub2_31.secondaryPrev;
				return local41;
			}
		}
		this.aClass2_Sub2_31 = null;
		return null;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)Lclient!cm;")
	public SecondaryLinkable method3096() {
		if (this.aClass2_Sub2_31 == null) {
			return null;
		}
		@Pc(24) SecondaryLinkable local24 = this.buckets[(int) (this.aLong115 & (long) (this.size - 1))];
		while (this.aClass2_Sub2_31 != local24) {
			if (this.aLong115 == this.aClass2_Sub2_31.secondaryKey) {
				@Pc(38) SecondaryLinkable local38 = this.aClass2_Sub2_31;
				this.aClass2_Sub2_31 = this.aClass2_Sub2_31.secondaryPrev;
				return local38;
			}
			this.aClass2_Sub2_31 = this.aClass2_Sub2_31.secondaryPrev;
		}
		this.aClass2_Sub2_31 = null;
		return null;
	}
}
