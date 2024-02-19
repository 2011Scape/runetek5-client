import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class HitmarkTypeList {

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Lclient!dla;")
	public final SoftLruHashTable aSoftLruHashTable121 = new SoftLruHashTable(20);

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable122 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "Lclient!sb;")
	private final Js5 aJs575;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!sb;")
	public final Js5 aJs576;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public HitmarkTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aJs575 = arg2;
		this.aJs576 = arg3;
		this.aJs575.getGroupCapacity(46);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public void method5182() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable122;
		synchronized (this.aSoftLruHashTable122) {
			this.aSoftLruHashTable122.clear();
		}
		local2 = this.aSoftLruHashTable121;
		synchronized (this.aSoftLruHashTable121) {
			this.aSoftLruHashTable121.clear();
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public void method5183() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable122;
		synchronized (this.aSoftLruHashTable122) {
			this.aSoftLruHashTable122.removeSoft();
		}
		local2 = this.aSoftLruHashTable121;
		synchronized (this.aSoftLruHashTable121) {
			this.aSoftLruHashTable121.removeSoft();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
	public void method5184() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable122;
		synchronized (this.aSoftLruHashTable122) {
			this.aSoftLruHashTable122.clean(5);
		}
		local6 = this.aSoftLruHashTable121;
		synchronized (this.aSoftLruHashTable121) {
			this.aSoftLruHashTable121.clean(5);
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)Lclient!pb;")
	public HitmarkType method5186(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable122;
		@Pc(16) HitmarkType local16;
		synchronized (this.aSoftLruHashTable122) {
			local16 = (HitmarkType) this.aSoftLruHashTable122.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Js5 local30 = this.aJs575;
		@Pc(39) byte[] local39;
		synchronized (this.aJs575) {
			local39 = this.aJs575.fetchFile(46, arg0);
		}
		local16 = new HitmarkType();
		local16.aHitmarkTypeList1 = this;
		if (local39 != null) {
			local16.decode(new Packet(local39));
		}
		@Pc(66) SoftLruHashTable local66 = this.aSoftLruHashTable122;
		synchronized (this.aSoftLruHashTable122) {
			this.aSoftLruHashTable122.put((long) arg0, local16);
			return local16;
		}
	}
}
