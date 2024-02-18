import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class MelTypeList {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "Lclient!dla;")
	private SoftLruHashTable aSoftLruHashTable134 = new SoftLruHashTable(128);

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "Lclient!dla;")
	public SoftLruHashTable aSoftLruHashTable135 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Lclient!sb;")
	public final Js5 aJs583;

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "Lclient!sb;")
	private final Js5 aJs582;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public MelTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aJs583 = arg3;
		this.aJs582 = arg2;
		this.aJs582.method7608(36);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)V")
	public void method5581() {
		@Pc(12) SoftLruHashTable local12 = this.aSoftLruHashTable134;
		synchronized (this.aSoftLruHashTable134) {
			this.aSoftLruHashTable134.method2147(5);
		}
		local12 = this.aSoftLruHashTable135;
		synchronized (this.aSoftLruHashTable135) {
			this.aSoftLruHashTable135.method2147(5);
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)V")
	public void method5583(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aSoftLruHashTable134 = new SoftLruHashTable(arg0);
		this.aSoftLruHashTable135 = new SoftLruHashTable(arg1);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)Lclient!el;")
	public MelType method5584(@OriginalArg(1) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable134;
		@Pc(16) MelType local16;
		synchronized (this.aSoftLruHashTable134) {
			local16 = (MelType) this.aSoftLruHashTable134.method2156((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Js5 local30 = this.aJs582;
		@Pc(39) byte[] local39;
		synchronized (this.aJs582) {
			local39 = this.aJs582.method7595(arg0, 36);
		}
		local16 = new MelType();
		local16.aMelTypeList2 = this;
		local16.anInt2590 = arg0;
		if (local39 != null) {
			local16.method2423(new Packet(local39));
		}
		local16.method2430();
		@Pc(72) SoftLruHashTable local72 = this.aSoftLruHashTable134;
		synchronized (this.aSoftLruHashTable134) {
			this.aSoftLruHashTable134.method2150(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public void method5585() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable134;
		synchronized (this.aSoftLruHashTable134) {
			this.aSoftLruHashTable134.method2151();
		}
		local6 = this.aSoftLruHashTable135;
		synchronized (this.aSoftLruHashTable135) {
			this.aSoftLruHashTable135.method2151();
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	public void method5586() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable134;
		synchronized (this.aSoftLruHashTable134) {
			this.aSoftLruHashTable134.method2157();
		}
		local6 = this.aSoftLruHashTable135;
		synchronized (this.aSoftLruHashTable135) {
			this.aSoftLruHashTable135.method2157();
		}
	}
}
