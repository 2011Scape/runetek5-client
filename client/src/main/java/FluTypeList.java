import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class FluTypeList {

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable47 = new SoftLruHashTable(128);

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "Lclient!sb;")
	private final Js5 aJs518;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public FluTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs518 = arg2;
		this.aJs518.getGroupCapacity(1);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)Lclient!nq;")
	public FluType method2066(@OriginalArg(1) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable47;
		@Pc(18) FluType local18;
		synchronized (this.aSoftLruHashTable47) {
			local18 = (FluType) this.aSoftLruHashTable47.get((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Js5 local32 = this.aJs518;
		@Pc(41) byte[] local41;
		synchronized (this.aJs518) {
			local41 = this.aJs518.fetchFile(1, arg0);
		}
		local18 = new FluType();
		if (local41 != null) {
			local18.decode(new Packet(local41));
		}
		@Pc(67) SoftLruHashTable local67 = this.aSoftLruHashTable47;
		synchronized (this.aSoftLruHashTable47) {
			this.aSoftLruHashTable47.put((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public void method2067() {
		@Pc(17) SoftLruHashTable local17 = this.aSoftLruHashTable47;
		synchronized (this.aSoftLruHashTable47) {
			this.aSoftLruHashTable47.clear();
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
	public void method2072() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable47;
		synchronized (this.aSoftLruHashTable47) {
			this.aSoftLruHashTable47.removeSoft();
		}
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(II)V")
	public void method2073() {
		@Pc(14) SoftLruHashTable local14 = this.aSoftLruHashTable47;
		synchronized (this.aSoftLruHashTable47) {
			this.aSoftLruHashTable47.clean(5);
		}
	}
}
