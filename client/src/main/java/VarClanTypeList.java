import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class VarClanTypeList {

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable192 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "Lclient!sb;")
	private final Js5 aJs5111;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
	public final int anInt8769;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public VarClanTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs5111 = arg2;
		if (this.aJs5111 == null) {
			this.anInt8769 = 0;
		} else {
			this.anInt8769 = this.aJs5111.getGroupCapacity(47);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V")
	public void method7783() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable192;
		synchronized (this.aSoftLruHashTable192) {
			this.aSoftLruHashTable192.clear();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)V")
	public void method7784() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable192;
		synchronized (this.aSoftLruHashTable192) {
			this.aSoftLruHashTable192.clean(5);
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(II)Lclient!fc;")
	public VarClanType method7785(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable192;
		@Pc(16) VarClanType local16;
		synchronized (this.aSoftLruHashTable192) {
			local16 = (VarClanType) this.aSoftLruHashTable192.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Js5 local30 = this.aJs5111;
		@Pc(39) byte[] local39;
		synchronized (this.aJs5111) {
			local39 = this.aJs5111.fetchFile(47, arg0);
		}
		local16 = new VarClanType();
		if (local39 != null) {
			local16.method2610(new Packet(local39));
		}
		@Pc(63) SoftLruHashTable local63 = this.aSoftLruHashTable192;
		synchronized (this.aSoftLruHashTable192) {
			this.aSoftLruHashTable192.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public void method7787() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable192;
		synchronized (this.aSoftLruHashTable192) {
			this.aSoftLruHashTable192.removeSoft();
		}
	}
}
