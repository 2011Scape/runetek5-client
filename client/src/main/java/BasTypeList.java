import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class BasTypeList {

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable172 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "Lclient!sb;")
	private final Js5 aJs5103;

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "Lclient!vl;")
	public final Class388 aClass388_2;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!vl;)V")
	public BasTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Class388 arg3) {
		this.aJs5103 = arg2;
		this.aJs5103.method7608(32);
		this.aClass388_2 = arg3;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)V")
	public void method7114() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable172;
		synchronized (this.aSoftLruHashTable172) {
			this.aSoftLruHashTable172.method2157();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZ)V")
	public void method7115() {
		@Pc(14) SoftLruHashTable local14 = this.aSoftLruHashTable172;
		synchronized (this.aSoftLruHashTable172) {
			this.aSoftLruHashTable172.method2147(5);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	public void method7117() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable172;
		synchronized (this.aSoftLruHashTable172) {
			this.aSoftLruHashTable172.method2151();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BI)Lclient!pda;")
	public BasType method7118(@OriginalArg(1) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable172;
		@Pc(16) BasType local16;
		synchronized (this.aSoftLruHashTable172) {
			local16 = (BasType) this.aSoftLruHashTable172.method2156((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Js5 local30 = this.aJs5103;
		@Pc(39) byte[] local39;
		synchronized (this.aJs5103) {
			local39 = this.aJs5103.method7595(arg0, 32);
		}
		local16 = new BasType();
		local16.aBasTypeList1 = this;
		if (local39 != null) {
			local16.method6483(new Packet(local39));
		}
		@Pc(66) SoftLruHashTable local66 = this.aSoftLruHashTable172;
		synchronized (this.aSoftLruHashTable172) {
			this.aSoftLruHashTable172.method2150(local16, (long) arg0);
			return local16;
		}
	}
}
