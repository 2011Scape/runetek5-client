import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vga")
public final class LightTypeList {

	@OriginalMember(owner = "client!vga", name = "l", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable219 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!vga", name = "k", descriptor = "Lclient!sb;")
	private final Js5 aJs5120;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public LightTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs5120 = arg2;
		this.aJs5120.method7608(31);
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(I)V")
	public void method8812() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable219;
		synchronized (this.aSoftLruHashTable219) {
			this.aSoftLruHashTable219.method2157();
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)V")
	public void method8813() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable219;
		synchronized (this.aSoftLruHashTable219) {
			this.aSoftLruHashTable219.method2147(5);
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IB)Lclient!vt;")
	public LightType method8814(@OriginalArg(0) int arg0) {
		@Pc(13) SoftLruHashTable local13 = this.aSoftLruHashTable219;
		@Pc(23) LightType local23;
		synchronized (this.aSoftLruHashTable219) {
			local23 = (LightType) this.aSoftLruHashTable219.method2156((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(37) Js5 local37 = this.aJs5120;
		@Pc(46) byte[] local46;
		synchronized (this.aJs5120) {
			local46 = this.aJs5120.method7595(arg0, 31);
		}
		local23 = new LightType();
		if (local46 != null) {
			local23.method9006(new Packet(local46));
		}
		@Pc(70) SoftLruHashTable local70 = this.aSoftLruHashTable219;
		synchronized (this.aSoftLruHashTable219) {
			this.aSoftLruHashTable219.method2150(local23, (long) arg0);
			return local23;
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)V")
	public void method8815() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable219;
		synchronized (this.aSoftLruHashTable219) {
			this.aSoftLruHashTable219.method2151();
		}
	}
}
