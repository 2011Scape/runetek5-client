import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Js5TextureProvider implements Interface4 {

	@OriginalMember(owner = "client!qea", name = "k", descriptor = "Lclient!ts;")
	private final LruHashTable aLruHashTable3 = new LruHashTable(256);

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "Lclient!sb;")
	private final Js5 aJs599;

	@OriginalMember(owner = "client!qea", name = "n", descriptor = "Lclient!sb;")
	private final Js5 aJs598;

	@OriginalMember(owner = "client!qea", name = "l", descriptor = "I")
	private final int anInt7709;

	@OriginalMember(owner = "client!qea", name = "f", descriptor = "[Lclient!fa;")
	private final Material[] aMaterialArray1;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lclient!sb;Lclient!sb;Lclient!sb;)V")
	public Js5TextureProvider(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs599 = arg2;
		this.aJs598 = arg1;
		@Pc(24) Packet local24 = new Packet(arg0.method7595(0, 0));
		this.anInt7709 = local24.g2();
		this.aMaterialArray1 = new Material[this.anInt7709];
		for (@Pc(36) int local36 = 0; local36 < this.anInt7709; local36++) {
			if (local24.g1() == 1) {
				this.aMaterialArray1[local36] = new Material();
			}
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt7709; local65++) {
			if (this.aMaterialArray1[local65] != null) {
				this.aMaterialArray1[local65].aBoolean240 = local24.g1() == 0;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < this.anInt7709; local98++) {
			if (this.aMaterialArray1[local98] != null) {
				this.aMaterialArray1[local98].aBoolean233 = local24.g1() == 1;
			}
		}
		for (@Pc(132) int local132 = 0; local132 < this.anInt7709; local132++) {
			if (this.aMaterialArray1[local132] != null) {
				this.aMaterialArray1[local132].aBoolean234 = local24.g1() == 1;
			}
		}
		for (@Pc(168) int local168 = 0; local168 < this.anInt7709; local168++) {
			if (this.aMaterialArray1[local168] != null) {
				this.aMaterialArray1[local168].aByte57 = local24.g1b();
			}
		}
		for (@Pc(200) int local200 = 0; local200 < this.anInt7709; local200++) {
			if (this.aMaterialArray1[local200] != null) {
				this.aMaterialArray1[local200].aByte58 = local24.g1b();
			}
		}
		for (@Pc(228) int local228 = 0; local228 < this.anInt7709; local228++) {
			if (this.aMaterialArray1[local228] != null) {
				this.aMaterialArray1[local228].aByte56 = local24.g1b();
			}
		}
		for (@Pc(256) int local256 = 0; local256 < this.anInt7709; local256++) {
			if (this.aMaterialArray1[local256] != null) {
				this.aMaterialArray1[local256].aByte55 = local24.g1b();
			}
		}
		for (@Pc(288) int local288 = 0; local288 < this.anInt7709; local288++) {
			if (this.aMaterialArray1[local288] != null) {
				this.aMaterialArray1[local288].aShort37 = (short) local24.g2();
			}
		}
		for (@Pc(321) int local321 = 0; local321 < this.anInt7709; local321++) {
			if (this.aMaterialArray1[local321] != null) {
				this.aMaterialArray1[local321].aByte54 = local24.g1b();
			}
		}
		for (@Pc(353) int local353 = 0; local353 < this.anInt7709; local353++) {
			if (this.aMaterialArray1[local353] != null) {
				this.aMaterialArray1[local353].aByte52 = local24.g1b();
			}
		}
		for (@Pc(381) int local381 = 0; local381 < this.anInt7709; local381++) {
			if (this.aMaterialArray1[local381] != null) {
				this.aMaterialArray1[local381].aBoolean239 = local24.g1() == 1;
			}
		}
		for (@Pc(421) int local421 = 0; local421 < this.anInt7709; local421++) {
			if (this.aMaterialArray1[local421] != null) {
				this.aMaterialArray1[local421].aBoolean238 = local24.g1() == 1;
			}
		}
		for (@Pc(455) int local455 = 0; local455 < this.anInt7709; local455++) {
			if (this.aMaterialArray1[local455] != null) {
				this.aMaterialArray1[local455].aByte53 = local24.g1b();
			}
		}
		for (@Pc(483) int local483 = 0; local483 < this.anInt7709; local483++) {
			if (this.aMaterialArray1[local483] != null) {
				this.aMaterialArray1[local483].aBoolean236 = local24.g1() == 1;
			}
		}
		for (@Pc(521) int local521 = 0; local521 < this.anInt7709; local521++) {
			if (this.aMaterialArray1[local521] != null) {
				this.aMaterialArray1[local521].aBoolean235 = local24.g1() == 1;
			}
		}
		for (@Pc(559) int local559 = 0; local559 < this.anInt7709; local559++) {
			if (this.aMaterialArray1[local559] != null) {
				this.aMaterialArray1[local559].aBoolean237 = local24.g1() == 1;
			}
		}
		for (@Pc(595) int local595 = 0; local595 < this.anInt7709; local595++) {
			if (this.aMaterialArray1[local595] != null) {
				this.aMaterialArray1[local595].anInt2790 = local24.g1();
			}
		}
		for (@Pc(627) int local627 = 0; local627 < this.anInt7709; local627++) {
			if (this.aMaterialArray1[local627] != null) {
				this.aMaterialArray1[local627].anInt2791 = local24.g4();
			}
		}
		for (@Pc(655) int local655 = 0; local655 < this.anInt7709; local655++) {
			if (this.aMaterialArray1[local655] != null) {
				this.aMaterialArray1[local655].anInt2796 = local24.g1();
			}
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IB)Lclient!vm;")
	private SecondaryLinkable_Sub21 method6819(@OriginalArg(0) int arg0) {
		@Pc(10) SecondaryLinkable local10 = this.aLruHashTable3.method8342((long) arg0);
		if (local10 != null) {
			return (SecondaryLinkable_Sub21) local10;
		}
		@Pc(30) byte[] local30 = this.aJs598.method7589(arg0);
		if (local30 == null) {
			return null;
		} else {
			@Pc(43) SecondaryLinkable_Sub21 local43 = new SecondaryLinkable_Sub21(new Packet(local30));
			this.aLruHashTable3.method8341(local43, (long) arg0);
			return local43;
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IZIIBF)[I")
	@Override
	public int[] method6818(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float arg4) {
		return this.method6819(arg3).method8951(this.aJs599, (double) arg4, this.aMaterialArray1[arg3].aBoolean238, this, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)I")
	@Override
	public int method6813() {
		return this.anInt7709;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6814(@OriginalArg(1) int arg0) {
		@Pc(8) SecondaryLinkable_Sub21 local8 = this.method6819(arg0);
		return local8 != null && local8.method8947(this.aJs599, this);
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(II)Lclient!fa;")
	@Override
	public Material method6817(@OriginalArg(0) int arg0) {
		return this.aMaterialArray1[arg0];
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIFBIZ)[F")
	@Override
	public float[] method6816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3) {
		return this.method6819(arg1).method8946(arg0, this, this.aJs599, this.aMaterialArray1[arg1].aBoolean238, arg3);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(FIIZZI)[I")
	@Override
	public int[] method6815(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		return this.method6819(arg1).method8948(arg2, (double) arg0, this.aMaterialArray1[arg1].aBoolean238, arg3, this, this.aJs599);
	}
}
