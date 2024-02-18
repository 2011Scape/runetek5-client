import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class SpotAnimTypeList {

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
	public int anInt2921;

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable61 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "Lclient!dla;")
	public final SoftLruHashTable aSoftLruHashTable62 = new SoftLruHashTable(60);

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "Lclient!sb;")
	public final Js5 aJs534;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Lclient!sb;")
	private final Js5 aJs533;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public SpotAnimTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aJs534 = arg3;
		this.aJs533 = arg2;
		@Pc(26) int local26 = this.aJs533.method7597() - 1;
		this.aJs533.method7608(local26);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)Lclient!lia;")
	public SpotAnimType method2694(@OriginalArg(1) int arg0) {
		@Pc(14) SoftLruHashTable local14 = this.aSoftLruHashTable61;
		@Pc(24) SpotAnimType local24;
		synchronized (this.aSoftLruHashTable61) {
			local24 = (SpotAnimType) this.aSoftLruHashTable61.method2156((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(38) Js5 local38 = this.aJs533;
		@Pc(51) byte[] local51;
		synchronized (this.aJs533) {
			local51 = this.aJs533.method7595(Static560.method7429(arg0), Static359.method5224(arg0));
		}
		local24 = new SpotAnimType();
		local24.anInt5833 = arg0;
		local24.aSpotAnimTypeList2 = this;
		if (local51 != null) {
			local24.method5246(new Packet(local51));
		}
		@Pc(81) SoftLruHashTable local81 = this.aSoftLruHashTable61;
		synchronized (this.aSoftLruHashTable61) {
			this.aSoftLruHashTable61.method2150(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)V")
	public void method2695(@OriginalArg(1) int arg0) {
		this.anInt2921 = arg0;
		@Pc(9) SoftLruHashTable local9 = this.aSoftLruHashTable62;
		synchronized (this.aSoftLruHashTable62) {
			this.aSoftLruHashTable62.method2157();
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
	public void method2697() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable61;
		synchronized (this.aSoftLruHashTable61) {
			this.aSoftLruHashTable61.method2151();
		}
		local6 = this.aSoftLruHashTable62;
		synchronized (this.aSoftLruHashTable62) {
			this.aSoftLruHashTable62.method2151();
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V")
	public void method2698() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable61;
		synchronized (this.aSoftLruHashTable61) {
			this.aSoftLruHashTable61.method2147(5);
		}
		@Pc(30) SoftLruHashTable local30 = this.aSoftLruHashTable62;
		synchronized (this.aSoftLruHashTable62) {
			this.aSoftLruHashTable62.method2147(5);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	public void method2699() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable61;
		synchronized (this.aSoftLruHashTable61) {
			this.aSoftLruHashTable61.method2157();
		}
		local6 = this.aSoftLruHashTable62;
		synchronized (this.aSoftLruHashTable62) {
			this.aSoftLruHashTable62.method2157();
		}
	}
}
