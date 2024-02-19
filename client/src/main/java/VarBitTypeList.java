import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class VarBitTypeList {

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Lclient!dla;")
	private SoftLruHashTable aSoftLruHashTable82 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!sb;")
	private final Js5 aJs553;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public VarBitTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs553 = arg2;
		if (this.aJs553 != null) {
			@Pc(20) int local20 = this.aJs553.capacity() - 1;
			this.aJs553.getGroupCapacity(local20);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
	public void method3420(@OriginalArg(1) int arg0) {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable82;
		synchronized (this.aSoftLruHashTable82) {
			this.aSoftLruHashTable82.clear();
			this.aSoftLruHashTable82 = new SoftLruHashTable(arg0);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public void method3423() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable82;
		synchronized (this.aSoftLruHashTable82) {
			this.aSoftLruHashTable82.removeSoft();
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)Lclient!eea;")
	public VarBitType method3426(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable82;
		@Pc(16) VarBitType local16;
		synchronized (this.aSoftLruHashTable82) {
			local16 = (VarBitType) this.aSoftLruHashTable82.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(40) Js5 local40 = this.aJs553;
		@Pc(53) byte[] local53;
		synchronized (this.aJs553) {
			local53 = this.aJs553.fetchFile(Static516.method6806(arg0), Static322.method9443(arg0));
		}
		local16 = new VarBitType();
		if (local53 != null) {
			local16.method2346(new Packet(local53));
		}
		@Pc(77) SoftLruHashTable local77 = this.aSoftLruHashTable82;
		synchronized (this.aSoftLruHashTable82) {
			this.aSoftLruHashTable82.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
	public void method3428() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable82;
		synchronized (this.aSoftLruHashTable82) {
			this.aSoftLruHashTable82.clean(5);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public void method3429() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable82;
		synchronized (this.aSoftLruHashTable82) {
			this.aSoftLruHashTable82.clear();
		}
	}
}
