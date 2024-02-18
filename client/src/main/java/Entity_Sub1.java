import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Entity_Sub1 extends Entity implements Interface25 {

	@OriginalMember(owner = "client!jda", name = "U", descriptor = "Lclient!ke;")
	private Class205 aClass205_5;

	@OriginalMember(owner = "client!jda", name = "nb", descriptor = "Z")
	private final boolean aBoolean364;

	@OriginalMember(owner = "client!jda", name = "Q", descriptor = "Z")
	private final boolean aBoolean363;

	@OriginalMember(owner = "client!jda", name = "cb", descriptor = "B")
	private final byte aByte83;

	@OriginalMember(owner = "client!jda", name = "db", descriptor = "S")
	private final short aShort57;

	@OriginalMember(owner = "client!jda", name = "Y", descriptor = "B")
	private final byte aByte84;

	@OriginalMember(owner = "client!jda", name = "pb", descriptor = "Z")
	private boolean aBoolean365;

	@OriginalMember(owner = "client!jda", name = "ib", descriptor = "Z")
	private final boolean aBoolean362;

	@OriginalMember(owner = "client!jda", name = "gb", descriptor = "Lclient!ka;")
	public Model aModel4;

	@OriginalMember(owner = "client!jda", name = "eb", descriptor = "Lclient!r;")
	private SecondaryLinkable_Sub9 aClass2_Sub2_Sub9_3;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZIIIIIIZ)V")
	public Entity_Sub1(@OriginalArg(0) Class19 arg0, @OriginalArg(1) LocType arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.raiseobject == 1, Static194.method2904(arg12, arg13));
		this.aBoolean364 = arg1.active != 0 && !arg7;
		this.aBoolean363 = arg7;
		this.aByte83 = (byte) arg13;
		this.aShort57 = (short) arg1.id;
		this.aByte84 = (byte) arg12;
		super.aByte143 = (byte) arg3;
		this.aBoolean365 = arg14;
		this.aBoolean362 = arg0.method8006() && arg1.hardshadow && !this.aBoolean363 && Static400.aClass2_Sub34_28.aPreference_Sub12_1.method4364() != 0;
		@Pc(83) int local83 = 2048;
		if (this.aBoolean365) {
			local83 |= 0x10000;
		}
		@Pc(98) Class272 local98 = this.method4223(arg0, this.aBoolean362, local83);
		if (local98 != null) {
			this.aModel4 = local98.model;
			this.aClass2_Sub2_Sub9_3 = local98.aClass2_Sub2_Sub9_5;
			if (this.aBoolean365) {
				this.aModel4 = this.aModel4.method7495((byte) 0, local83, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "(I)V")
	@Override
	public void method6856() {
		if (this.aModel4 != null) {
			this.aModel4.method7479();
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6857(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) SecondaryLinkable_Sub9 local16;
		if (this.aClass2_Sub2_Sub9_3 == null && this.aBoolean362) {
			@Pc(27) Class272 local27 = this.method4223(arg0, true, 262144);
			local16 = local27 == null ? null : local27.aClass2_Sub2_Sub9_5;
		} else {
			local16 = this.aClass2_Sub2_Sub9_3;
			this.aClass2_Sub2_Sub9_3 = null;
		}
		if (local16 != null) {
			Static292.method4618(local16, super.aByte143, super.anInt10690, super.anInt10694, (boolean[]) null);
		}
		if (arg1 > -42) {
			this.aModel4 = null;
		}
	}

	@OriginalMember(owner = "client!jda", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6860(@OriginalArg(0) int arg0) {
		if (arg0 != -19717) {
			this.aClass205_5 = null;
		}
		return this.aBoolean362;
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method9283() {
		if (this.aModel4 == null) {
			return true;
		} else {
			return !this.aModel4.r();
		}
	}

	@OriginalMember(owner = "client!jda", name = "k", descriptor = "(I)I")
	@Override
	public int method9286(@OriginalArg(0) int arg0) {
		if (arg0 != 2) {
			this.method9283();
		}
		return this.aModel4 == null ? 0 : this.aModel4.fa();
	}

	@OriginalMember(owner = "client!jda", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method9290(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method9280(61);
		}
		return this.aBoolean365;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BLclient!ha;I)Lclient!ka;")
	private Model method4221(@OriginalArg(1) Class19 arg0, @OriginalArg(2) int arg1) {
		if (this.aModel4 != null && arg0.method7960(this.aModel4.ua(), arg1) == 0) {
			return this.aModel4;
		} else {
			@Pc(34) Class272 local34 = this.method4223(arg0, false, arg1);
			return local34 == null ? null : local34.model;
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)I")
	@Override
	public int method6859(@OriginalArg(0) int arg0) {
		if (arg0 != -32136) {
			Static290.anInt4657 = -2;
		}
		return this.aShort57 & 0xFFFF;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIZLclient!ha;)Z")
	@Override
	public boolean method9279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3) {
		@Pc(9) Model local9 = this.method4221(arg3, 131072);
		if (local9 == null) {
			return arg2 ? false : false;
		} else {
			@Pc(14) Class73 local14 = arg3.method7985();
			local14.method7125(super.anInt10690, super.anInt10691, super.anInt10694);
			return Static504.aBoolean579 ? local9.method7483(arg1, arg0, local14, false, 0, Static582.anInt8627) : local9.method7486(arg1, arg0, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!jda", name = "j", descriptor = "(I)V")
	@Override
	public void method9280(@OriginalArg(0) int arg0) {
		this.aBoolean365 = false;
		if (arg0 != 27811) {
			this.aClass205_5 = null;
		}
		if (this.aModel4 != null) {
			this.aModel4.s(this.aModel4.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)I")
	@Override
	public int method6858() {
		return this.aByte84;
	}

	@OriginalMember(owner = "client!jda", name = "m", descriptor = "(I)I")
	public int method4222() {
		return this.aModel4 == null ? 15 : this.aModel4.na() / 4;
	}

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
	@Override
	public Class205 method9278(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 > -93) {
			return null;
		} else {
			if (this.aClass205_5 == null) {
				this.aClass205_5 = Static317.method4583(super.anInt10691, super.anInt10690, this.method4221(arg0, 0), super.anInt10694);
			}
			return this.aClass205_5;
		}
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6861(@OriginalArg(0) Class19 arg0) {
		@Pc(21) SecondaryLinkable_Sub9 local21;
		if (this.aClass2_Sub2_Sub9_3 == null && this.aBoolean362) {
			@Pc(32) Class272 local32 = this.method4223(arg0, true, 262144);
			local21 = local32 == null ? null : local32.aClass2_Sub2_Sub9_5;
		} else {
			local21 = this.aClass2_Sub2_Sub9_3;
			this.aClass2_Sub2_Sub9_3 = null;
		}
		if (local21 != null) {
			Static630.method8357(local21, super.aByte143, super.anInt10690, super.anInt10694, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "(B)I")
	@Override
	public int method9292(@OriginalArg(0) byte arg0) {
		if (arg0 == -21) {
			return this.aModel4 == null ? 0 : this.aModel4.ma();
		} else {
			return -59;
		}
	}

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9289(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -5) {
			;
		}
	}

	@OriginalMember(owner = "client!jda", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9282(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.aClass2_Sub2_Sub9_3 = null;
		}
		return this.aModel4 == null ? false : this.aModel4.F();
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
	@Override
	public ParticleNode_Sub7 method9276(@OriginalArg(1) Class19 arg0) {
		if (this.aModel4 == null) {
			return null;
		}
		@Pc(20) Class73 local20 = arg0.method7985();
		local20.method7125(super.anInt10690, super.anInt10691, super.anInt10694);
		@Pc(34) ParticleNode_Sub7 local34 = Static642.method8441(this.aBoolean364, 1);
		if (Static504.aBoolean579) {
			this.aModel4.method7484(local20, local34.aClass8_Sub6Array1[0], Static582.anInt8627, 0);
		} else {
			this.aModel4.method7473(local20, local34.aClass8_Sub6Array1[0], 0);
		}
		return local34;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IZLclient!ha;IBILclient!eo;)V")
	@Override
	public void method9285(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) ParticleNode_Sub2 arg6) {
		if (arg6 instanceof ParticleNode_Sub2_Sub3_Sub2) {
			@Pc(38) ParticleNode_Sub2_Sub3_Sub2 local38 = (ParticleNode_Sub2_Sub3_Sub2) arg6;
			if (this.aModel4 != null && local38.aModel5 != null) {
				this.aModel4.method7481(local38.aModel5, arg5, arg0, arg3, arg1);
			}
		} else if (arg6 instanceof Entity_Sub1) {
			@Pc(14) Entity_Sub1 local14 = (Entity_Sub1) arg6;
			if (this.aModel4 != null && local14.aModel4 != null) {
				this.aModel4.method7481(local14.aModel4, arg5, arg0, arg3, arg1);
			}
		}
		if (arg4 <= 101) {
			this.method9278((Class19) null, -1);
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!ha;BZI)Lclient!od;")
	private Class272 method4223(@OriginalArg(0) Class19 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(11) LocType local11 = Static354.aLocTypeList4.get(this.aShort57 & 0xFFFF);
		@Pc(27) Class178 local27;
		@Pc(33) Class178 local33;
		if (this.aBoolean363) {
			local27 = Static693.aClass178Array2[super.aByte143];
			local33 = Static706.aClass178Array3[0];
		} else {
			local27 = Static706.aClass178Array3[super.aByte143];
			if (super.aByte143 >= 3) {
				local33 = null;
			} else {
				local33 = Static706.aClass178Array3[super.aByte143 + 1];
			}
		}
		return local11.method1309(this.aByte84 == 11 ? this.aByte83 + 4 : this.aByte83, super.anInt10694, super.anInt10690, local27, arg1, super.anInt10691, this.aByte84 == 11 ? 10 : this.aByte84, arg0, (Class150) null, arg2, local33);
	}

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)I")
	@Override
	public int method6855(@OriginalArg(0) int arg0) {
		return arg0 == 23796 ? this.aByte83 : -53;
	}
}
