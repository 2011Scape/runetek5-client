import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class FloTypeList {

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable55 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
	public int anInt2509 = 0;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Lclient!sb;")
	private final Js5 aJs523;

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
	public final int anInt2506;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public FloTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs523 = arg2;
		this.anInt2506 = this.aJs523.getGroupCapacity(4);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	public void method2349() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable55;
		synchronized (this.aSoftLruHashTable55) {
			this.aSoftLruHashTable55.clear();
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	public void method2351() {
		@Pc(9) SoftLruHashTable local9 = this.aSoftLruHashTable55;
		synchronized (this.aSoftLruHashTable55) {
			this.aSoftLruHashTable55.removeSoft();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)Lclient!re;")
	public FloType method2352(@OriginalArg(0) int arg0) {
		@Pc(15) SoftLruHashTable local15 = this.aSoftLruHashTable55;
		@Pc(25) FloType local25;
		synchronized (this.aSoftLruHashTable55) {
			local25 = (FloType) this.aSoftLruHashTable55.get((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(39) Js5 local39 = this.aJs523;
		@Pc(48) byte[] local48;
		synchronized (this.aJs523) {
			local48 = this.aJs523.fetchFile(4, arg0);
		}
		local25 = new FloType();
		local25.aFloTypeList5 = this;
		local25.anInt8253 = arg0;
		if (local48 != null) {
			local25.method7256(new Packet(local48));
		}
		local25.method7254();
		@Pc(81) SoftLruHashTable local81 = this.aSoftLruHashTable55;
		synchronized (this.aSoftLruHashTable55) {
			this.aSoftLruHashTable55.put((long) arg0, local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
	public void method2355() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable55;
		synchronized (this.aSoftLruHashTable55) {
			this.aSoftLruHashTable55.clean(5);
		}
	}
}
