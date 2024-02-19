import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class IdkTypeList {

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable115 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "Lclient!sb;")
	public final Js5 aJs572;

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "Lclient!sb;")
	private final Js5 aJs571;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public IdkTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aJs572 = arg3;
		this.aJs571 = arg2;
		this.aJs571.getGroupCapacity(3);
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)V")
	public void method5041() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable115;
		synchronized (this.aSoftLruHashTable115) {
			this.aSoftLruHashTable115.removeSoft();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IB)Lclient!pka;")
	public IdkType method5042(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable115;
		@Pc(24) IdkType local24;
		synchronized (this.aSoftLruHashTable115) {
			local24 = (IdkType) this.aSoftLruHashTable115.get((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(38) Js5 local38 = this.aJs571;
		@Pc(47) byte[] local47;
		synchronized (this.aJs571) {
			local47 = this.aJs571.fetchFile(3, arg0);
		}
		local24 = new IdkType();
		local24.aIdkTypeList4 = this;
		if (local47 != null) {
			local24.decode(new Packet(local47));
		}
		@Pc(74) SoftLruHashTable local74 = this.aSoftLruHashTable115;
		synchronized (this.aSoftLruHashTable115) {
			this.aSoftLruHashTable115.put((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	public void method5044() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable115;
		synchronized (this.aSoftLruHashTable115) {
			this.aSoftLruHashTable115.clear();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)V")
	public void method5045() {
		@Pc(7) SoftLruHashTable local7 = this.aSoftLruHashTable115;
		synchronized (this.aSoftLruHashTable115) {
			this.aSoftLruHashTable115.clean(5);
		}
	}
}
