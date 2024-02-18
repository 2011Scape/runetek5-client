import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class LocTypeList {

	@OriginalMember(owner = "client!gea", name = "r", descriptor = "I")
	public int anInt3390;

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "Z")
	public boolean aBoolean266 = false;

	@OriginalMember(owner = "client!gea", name = "l", descriptor = "Lclient!dla;")
	private SoftLruHashTable aSoftLruHashTable73 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!gea", name = "f", descriptor = "Lclient!dla;")
	public final SoftLruHashTable aSoftLruHashTable74 = new SoftLruHashTable(500);

	@OriginalMember(owner = "client!gea", name = "k", descriptor = "Lclient!dla;")
	public final SoftLruHashTable aSoftLruHashTable75 = new SoftLruHashTable(30);

	@OriginalMember(owner = "client!gea", name = "q", descriptor = "Lclient!dla;")
	public final SoftLruHashTable aSoftLruHashTable76 = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "Lclient!sb;")
	public final Js5 aJs544;

	@OriginalMember(owner = "client!gea", name = "j", descriptor = "Lclient!ul;")
	private final ModeGame aModeGame2;

	@OriginalMember(owner = "client!gea", name = "h", descriptor = "I")
	private final int anInt3383;

	@OriginalMember(owner = "client!gea", name = "p", descriptor = "Lclient!sb;")
	private final Js5 aJs543;

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "Z")
	public boolean aBoolean267;

	@OriginalMember(owner = "client!gea", name = "i", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray15;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Lclient!ul;IZLclient!sb;Lclient!sb;)V")
	public LocTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Js5 arg3, @OriginalArg(4) Js5 arg4) {
		this.aJs544 = arg4;
		this.aModeGame2 = arg0;
		this.anInt3383 = arg1;
		this.aJs543 = arg3;
		this.aBoolean267 = arg2;
		if (this.aJs543 != null) {
			@Pc(53) int local53 = this.aJs543.method7597() - 1;
			this.aJs543.method7608(local53);
		}
		if (Static673.aModeGame8 == this.aModeGame2) {
			this.aStringArray15 = new String[] { null, null, null, null, null, Static32.aLocalizedText22.method877(this.anInt3383) };
		} else {
			this.aStringArray15 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V")
	public void method3058() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable73;
		synchronized (this.aSoftLruHashTable73) {
			this.aSoftLruHashTable73.method2151();
		}
		local2 = this.aSoftLruHashTable74;
		synchronized (this.aSoftLruHashTable74) {
			this.aSoftLruHashTable74.method2151();
		}
		local2 = this.aSoftLruHashTable75;
		synchronized (this.aSoftLruHashTable75) {
			this.aSoftLruHashTable75.method2151();
		}
		local2 = this.aSoftLruHashTable76;
		synchronized (this.aSoftLruHashTable76) {
			this.aSoftLruHashTable76.method2151();
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZI)V")
	public void method3059(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean267) {
			this.aBoolean267 = arg0;
			this.method3060();
		}
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V")
	public void method3060() {
		@Pc(14) SoftLruHashTable local14 = this.aSoftLruHashTable73;
		synchronized (this.aSoftLruHashTable73) {
			this.aSoftLruHashTable73.method2157();
		}
		local14 = this.aSoftLruHashTable74;
		synchronized (this.aSoftLruHashTable74) {
			this.aSoftLruHashTable74.method2157();
		}
		local14 = this.aSoftLruHashTable75;
		synchronized (this.aSoftLruHashTable75) {
			this.aSoftLruHashTable75.method2157();
		}
		local14 = this.aSoftLruHashTable76;
		synchronized (this.aSoftLruHashTable76) {
			this.aSoftLruHashTable76.method2157();
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IZ)V")
	public void method3061(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean266) {
			this.aBoolean266 = arg0;
			this.method3060();
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)V")
	public void method3062(@OriginalArg(1) int arg0) {
		this.aSoftLruHashTable73 = new SoftLruHashTable(arg0);
	}

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "(II)Lclient!c;")
	public LocType method3063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 29) {
			return null;
		}
		@Pc(12) SoftLruHashTable local12 = this.aSoftLruHashTable73;
		@Pc(22) LocType local22;
		synchronized (this.aSoftLruHashTable73) {
			local22 = (LocType) this.aSoftLruHashTable73.method2156((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(36) Js5 local36 = this.aJs543;
		@Pc(49) byte[] local49;
		synchronized (this.aJs543) {
			local49 = this.aJs543.method7595(Static570.method7551(arg0), Static705.method9197(arg0));
		}
		local22 = new LocType();
		local22.anInt1256 = arg0;
		local22.aLocTypeList2 = this;
		local22.aStringArray6 = (String[]) this.aStringArray15.clone();
		if (local49 != null) {
			local22.method1305(new Packet(local49));
		}
		local22.method1306();
		if (local22.aBoolean97) {
			local22.anInt1242 = 0;
			local22.aBoolean99 = false;
		}
		if (!this.aBoolean267 && local22.aBoolean95) {
			local22.aStringArray6 = null;
			local22.anIntArray112 = null;
		}
		@Pc(115) SoftLruHashTable local115 = this.aSoftLruHashTable73;
		synchronized (this.aSoftLruHashTable73) {
			this.aSoftLruHashTable73.method2150(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(II)V")
	public void method3064() {
		@Pc(11) SoftLruHashTable local11 = this.aSoftLruHashTable73;
		synchronized (this.aSoftLruHashTable73) {
			this.aSoftLruHashTable73.method2147(5);
		}
		local11 = this.aSoftLruHashTable74;
		synchronized (this.aSoftLruHashTable74) {
			this.aSoftLruHashTable74.method2147(5);
		}
		local11 = this.aSoftLruHashTable75;
		synchronized (this.aSoftLruHashTable75) {
			this.aSoftLruHashTable75.method2147(5);
		}
		local11 = this.aSoftLruHashTable76;
		synchronized (this.aSoftLruHashTable76) {
			this.aSoftLruHashTable76.method2147(5);
		}
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(II)V")
	public void method3065(@OriginalArg(0) int arg0) {
		this.anInt3390 = arg0;
		@Pc(9) SoftLruHashTable local9 = this.aSoftLruHashTable74;
		synchronized (this.aSoftLruHashTable74) {
			this.aSoftLruHashTable74.method2157();
		}
		local9 = this.aSoftLruHashTable75;
		synchronized (this.aSoftLruHashTable75) {
			this.aSoftLruHashTable75.method2157();
		}
		local9 = this.aSoftLruHashTable76;
		synchronized (this.aSoftLruHashTable76) {
			this.aSoftLruHashTable76.method2157();
		}
	}
}
