import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vka")
public final class EnumTypeList {

	@OriginalMember(owner = "client!vka", name = "j", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable223 = new SoftLruHashTable(128);

	@OriginalMember(owner = "client!vka", name = "d", descriptor = "Lclient!sb;")
	private final Js5 aJs5122;

	@OriginalMember(owner = "client!vka", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public EnumTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs5122 = arg2;
		if (this.aJs5122 != null) {
			@Pc(20) int local20 = this.aJs5122.capacity() - 1;
			this.aJs5122.getGroupCapacity(local20);
		}
	}

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(II)Lclient!bt;")
	public EnumType get(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable223;
		@Pc(16) EnumType local16;
		synchronized (this.aSoftLruHashTable223) {
			local16 = (EnumType) this.aSoftLruHashTable223.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(40) byte[] local40 = this.aJs5122.fetchFile(Static188.method2857(arg0), Static61.method1313(arg0));
		local16 = new EnumType();
		if (local40 != null) {
			local16.method1222(new Packet(local40));
		}
		@Pc(66) SoftLruHashTable local66 = this.aSoftLruHashTable223;
		synchronized (this.aSoftLruHashTable223) {
			this.aSoftLruHashTable223.put((long) arg0, local16);
			return local16;
		}
	}
}
