import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class SeqTypeList {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable22 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable23 = new SoftLruHashTable(100);

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "Lclient!sb;")
	private final Js5 aJs511;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;Lclient!sb;)V")
	public SeqTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3, @OriginalArg(4) Js5 arg4) {
		this.aJs511 = arg2;
		if (this.aJs511 != null) {
			@Pc(26) int local26 = this.aJs511.capacity() - 1;
			this.aJs511.getGroupCapacity(local26);
		}
		Static642.method8440(arg4, arg3);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IB)Lclient!cka;")
	public SeqType method1162(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable22;
		@Pc(16) SeqType local16;
		synchronized (this.aSoftLruHashTable22) {
			local16 = (SeqType) this.aSoftLruHashTable22.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Js5 local30 = this.aJs511;
		@Pc(43) byte[] local43;
		synchronized (this.aJs511) {
			local43 = this.aJs511.fetchFile(Static291.method4226(arg0), Static668.method8702(arg0));
		}
		local16 = new SeqType();
		local16.anInt1650 = arg0;
		if (local43 != null) {
			local16.method1585(new Packet(local43));
		}
		local16.method1584();
		@Pc(73) SoftLruHashTable local73 = this.aSoftLruHashTable22;
		synchronized (this.aSoftLruHashTable22) {
			this.aSoftLruHashTable22.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V")
	public void method1163() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable22;
		synchronized (this.aSoftLruHashTable22) {
			this.aSoftLruHashTable22.clean(5);
		}
		local6 = this.aSoftLruHashTable23;
		synchronized (this.aSoftLruHashTable23) {
			this.aSoftLruHashTable23.clean(5);
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
	public void method1164() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable22;
		synchronized (this.aSoftLruHashTable22) {
			this.aSoftLruHashTable22.removeSoft();
		}
		local2 = this.aSoftLruHashTable23;
		synchronized (this.aSoftLruHashTable23) {
			this.aSoftLruHashTable23.removeSoft();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	public void method1165() {
		@Pc(7) SoftLruHashTable local7 = this.aSoftLruHashTable22;
		synchronized (this.aSoftLruHashTable22) {
			this.aSoftLruHashTable22.clear();
		}
		local7 = this.aSoftLruHashTable23;
		synchronized (this.aSoftLruHashTable23) {
			this.aSoftLruHashTable23.clear();
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)Lclient!rw;")
	public AnimFrameset method1166(@OriginalArg(0) int arg0) {
		@Pc(12) SoftLruHashTable local12 = this.aSoftLruHashTable23;
		synchronized (this.aSoftLruHashTable23) {
			@Pc(22) AnimFrameset local22 = (AnimFrameset) this.aSoftLruHashTable23.get((long) arg0);
			if (local22 == null) {
				local22 = new AnimFrameset(arg0);
				this.aSoftLruHashTable23.put((long) arg0, local22);
			}
			return local22.method7565() ? local22 : null;
		}
	}
}
