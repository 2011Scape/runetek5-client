import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class VarClanSettingTypeList {

	@OriginalMember(owner = "client!al", name = "b", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable11 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!al", name = "g", descriptor = "Lclient!sb;")
	private final Js5 aJs52;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public VarClanSettingTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs52 = arg2;
		if (this.aJs52 != null) {
			this.aJs52.method7608(54);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Lclient!sla;")
	public VarClanSettingType method263(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable11;
		@Pc(16) VarClanSettingType local16;
		synchronized (this.aSoftLruHashTable11) {
			local16 = (VarClanSettingType) this.aSoftLruHashTable11.method2156((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Js5 local30 = this.aJs52;
		@Pc(39) byte[] local39;
		synchronized (this.aJs52) {
			local39 = this.aJs52.method7595(arg0, 54);
		}
		local16 = new VarClanSettingType();
		if (local39 != null) {
			local16.method7763(new Packet(local39));
		}
		@Pc(63) SoftLruHashTable local63 = this.aSoftLruHashTable11;
		synchronized (this.aSoftLruHashTable11) {
			this.aSoftLruHashTable11.method2150(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
	public void method266() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable11;
		synchronized (this.aSoftLruHashTable11) {
			this.aSoftLruHashTable11.method2151();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)V")
	public void method267() {
		@Pc(11) SoftLruHashTable local11 = this.aSoftLruHashTable11;
		synchronized (this.aSoftLruHashTable11) {
			this.aSoftLruHashTable11.method2147(5);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
	public void method269() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable11;
		synchronized (this.aSoftLruHashTable11) {
			this.aSoftLruHashTable11.method2157();
		}
	}
}
