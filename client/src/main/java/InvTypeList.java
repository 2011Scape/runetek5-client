import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class InvTypeList {

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable188 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "Lclient!sb;")
	private final Js5 aJs5107;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public InvTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs5107 = arg2;
		this.aJs5107.getGroupCapacity(5);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(II)Lclient!dba;")
	public InvType method7657(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable188;
		@Pc(16) InvType local16;
		synchronized (this.aSoftLruHashTable188) {
			local16 = (InvType) this.aSoftLruHashTable188.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Js5 local30 = this.aJs5107;
		@Pc(39) byte[] local39;
		synchronized (this.aJs5107) {
			local39 = this.aJs5107.fetchFile(5, arg0);
		}
		local16 = new InvType();
		if (local39 != null) {
			local16.decode(new Packet(local39));
		}
		@Pc(63) SoftLruHashTable local63 = this.aSoftLruHashTable188;
		synchronized (this.aSoftLruHashTable188) {
			this.aSoftLruHashTable188.put((long) arg0, local16);
			return local16;
		}
	}
}
