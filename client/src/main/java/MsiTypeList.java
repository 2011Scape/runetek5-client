import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class MsiTypeList {

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!dla;")
	private SoftLruHashTable aSoftLruHashTable201 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!u", name = "n", descriptor = "Lclient!dla;")
	public SoftLruHashTable aSoftLruHashTable202 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!u", name = "q", descriptor = "Lclient!sb;")
	public final Js5 aJs5116;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!sb;")
	private final Js5 aJs5115;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public MsiTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aJs5116 = arg3;
		this.aJs5115 = arg2;
		this.aJs5115.getGroupCapacity(34);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public void method8360() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable201;
		synchronized (this.aSoftLruHashTable201) {
			this.aSoftLruHashTable201.removeSoft();
		}
		local2 = this.aSoftLruHashTable202;
		synchronized (this.aSoftLruHashTable202) {
			this.aSoftLruHashTable202.removeSoft();
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	public void method8361() {
		@Pc(10) SoftLruHashTable local10 = this.aSoftLruHashTable201;
		synchronized (this.aSoftLruHashTable201) {
			this.aSoftLruHashTable201.clear();
		}
		local10 = this.aSoftLruHashTable202;
		synchronized (this.aSoftLruHashTable202) {
			this.aSoftLruHashTable202.clear();
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)Lclient!ia;")
	public MsiType method8362(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable201;
		@Pc(16) MsiType local16;
		synchronized (this.aSoftLruHashTable201) {
			local16 = (MsiType) this.aSoftLruHashTable201.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Js5 local30 = this.aJs5115;
		@Pc(39) byte[] local39;
		synchronized (this.aJs5115) {
			local39 = this.aJs5115.fetchFile(34, arg0);
		}
		local16 = new MsiType();
		local16.aMsiTypeList2 = this;
		if (local39 != null) {
			local16.method3694(new Packet(local39));
		}
		@Pc(68) SoftLruHashTable local68 = this.aSoftLruHashTable201;
		synchronized (this.aSoftLruHashTable201) {
			this.aSoftLruHashTable201.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
	public void method8365(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aSoftLruHashTable201 = new SoftLruHashTable(arg1);
		this.aSoftLruHashTable202 = new SoftLruHashTable(arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
	public void method8367() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable201;
		synchronized (this.aSoftLruHashTable201) {
			this.aSoftLruHashTable201.clean(5);
		}
		local6 = this.aSoftLruHashTable202;
		synchronized (this.aSoftLruHashTable202) {
			this.aSoftLruHashTable202.clean(5);
		}
	}
}
