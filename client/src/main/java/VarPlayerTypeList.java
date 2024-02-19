import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class VarPlayerTypeList {

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable138 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Lclient!sb;")
	private final Js5 aJs586;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public final int anInt6462;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public VarPlayerTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs586 = arg2;
		if (this.aJs586 == null) {
			this.anInt6462 = 0;
		} else {
			this.anInt6462 = this.aJs586.getGroupCapacity(16);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
	public void method5781() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable138;
		synchronized (this.aSoftLruHashTable138) {
			this.aSoftLruHashTable138.removeSoft();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Lclient!rha;")
	public VarPlayerType method5782(@OriginalArg(1) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable138;
		@Pc(16) VarPlayerType local16;
		synchronized (this.aSoftLruHashTable138) {
			local16 = (VarPlayerType) this.aSoftLruHashTable138.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Js5 local30 = this.aJs586;
		@Pc(39) byte[] local39;
		synchronized (this.aJs586) {
			local39 = this.aJs586.fetchFile(16, arg0);
		}
		local16 = new VarPlayerType();
		if (local39 != null) {
			local16.method7294(new Packet(local39));
		}
		@Pc(63) SoftLruHashTable local63 = this.aSoftLruHashTable138;
		synchronized (this.aSoftLruHashTable138) {
			this.aSoftLruHashTable138.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	public void method5784() {
		@Pc(13) SoftLruHashTable local13 = this.aSoftLruHashTable138;
		synchronized (this.aSoftLruHashTable138) {
			this.aSoftLruHashTable138.clear();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)V")
	public void method5785() {
		@Pc(11) SoftLruHashTable local11 = this.aSoftLruHashTable138;
		synchronized (this.aSoftLruHashTable138) {
			this.aSoftLruHashTable138.clean(5);
		}
	}
}
