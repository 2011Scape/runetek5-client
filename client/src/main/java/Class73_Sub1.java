import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class73_Sub1 extends Class73 {

	@OriginalMember(owner = "client!cw", name = "U", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!cw", name = "Y", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!cw", name = "H", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!cw", name = "P", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!cw", name = "L", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!cw", name = "W", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!cw", name = "R", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!cw", name = "x", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!cw", name = "B", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!cw", name = "D", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "()V")
	public Class73_Sub1() {
		this.method7133();
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(FIFF)V")
	public void method1877(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat46 = arg2;
		this.aFloat43 = arg0;
		this.aFloat44 = this.aFloat45 = this.aFloat40 = this.aFloat36 = this.aFloat38 = this.aFloat41 = (float) 0;
		this.aFloat37 = arg1;
		this.aFloat39 = this.aFloat42 = this.aFloat47 = 1.0F;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat46);
		@Pc(13) int local13 = (int) ((float) arg2 - this.aFloat43);
		@Pc(20) int local20 = (int) ((float) arg1 - this.aFloat37);
		arg3[2] = (int) (this.aFloat47 * (float) local13 + this.aFloat41 * (float) local20 + this.aFloat38 * (float) local6);
		arg3[0] = (int) ((float) local6 * this.aFloat39 + (float) local20 * this.aFloat44 + (float) local13 * this.aFloat45);
		arg3[1] = (int) ((float) local6 * this.aFloat40 + (float) local20 * this.aFloat42 + (float) local13 * this.aFloat36);
	}

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "(I)V")
	@Override
	public void method7131(@OriginalArg(0) int arg0) {
		this.aFloat42 = 1.0F;
		this.aFloat39 = this.aFloat47 = Mouse.aFloatArray80[arg0 & 0x3FFF];
		this.aFloat38 = Mouse.aFloatArray79[arg0 & 0x3FFF];
		this.aFloat45 = -this.aFloat38;
		this.aFloat40 = this.aFloat46 = this.aFloat44 = this.aFloat41 = this.aFloat37 = this.aFloat36 = this.aFloat43 = 0.0F;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILclient!tt;)V")
	public void method1878(@OriginalArg(1) Class73 arg0) {
		@Pc(6) Class73_Sub1 local6 = (Class73_Sub1) arg0;
		@Pc(9) float local9 = this.aFloat39;
		@Pc(12) float local12 = this.aFloat44;
		@Pc(15) float local15 = this.aFloat40;
		@Pc(18) float local18 = this.aFloat42;
		@Pc(21) float local21 = this.aFloat38;
		@Pc(24) float local24 = this.aFloat41;
		@Pc(27) float local27 = this.aFloat46;
		this.aFloat44 = local6.aFloat41 * this.aFloat45 + local9 * local6.aFloat44 + local12 * local6.aFloat42;
		@Pc(47) float local47 = this.aFloat37;
		this.aFloat39 = local6.aFloat38 * this.aFloat45 + local6.aFloat39 * local9 + local6.aFloat40 * local12;
		this.aFloat42 = local6.aFloat41 * this.aFloat36 + local6.aFloat42 * local18 + local6.aFloat44 * local15;
		this.aFloat45 = local9 * local6.aFloat45 + local12 * local6.aFloat36 + local6.aFloat47 * this.aFloat45;
		this.aFloat40 = this.aFloat36 * local6.aFloat38 + local6.aFloat39 * local15 + local18 * local6.aFloat40;
		this.aFloat36 = local6.aFloat36 * local18 + local15 * local6.aFloat45 + this.aFloat36 * local6.aFloat47;
		this.aFloat38 = local6.aFloat40 * local24 + local6.aFloat39 * local21 + this.aFloat47 * local6.aFloat38;
		this.aFloat41 = local24 * local6.aFloat42 + local6.aFloat44 * local21 + this.aFloat47 * local6.aFloat41;
		this.aFloat47 = local24 * local6.aFloat36 + local21 * local6.aFloat45 + local6.aFloat47 * this.aFloat47;
		this.aFloat46 = local6.aFloat46 + local47 * local6.aFloat40 + local27 * local6.aFloat39 + local6.aFloat38 * this.aFloat43;
		this.aFloat37 = local6.aFloat37 + local27 * local6.aFloat44 + local6.aFloat42 * local47 + local6.aFloat41 * this.aFloat43;
		this.aFloat43 = local6.aFloat43 + local6.aFloat45 * local27 + local6.aFloat36 * local47 + this.aFloat43 * local6.aFloat47;
	}

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)V")
	@Override
	public void method7130(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Mouse.aFloatArray80[arg0 & 0x3FFF];
		@Pc(15) float local15 = Mouse.aFloatArray79[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat44;
		@Pc(21) float local21 = this.aFloat42;
		@Pc(24) float local24 = this.aFloat41;
		this.aFloat44 = local9 * local18 - this.aFloat45 * local15;
		@Pc(38) float local38 = this.aFloat37;
		this.aFloat45 = local15 * local18 + this.aFloat45 * local9;
		this.aFloat42 = local21 * local9 - this.aFloat36 * local15;
		this.aFloat36 = local15 * local21 + local9 * this.aFloat36;
		this.aFloat41 = local24 * local9 - this.aFloat47 * local15;
		this.aFloat37 = local38 * local9 - local15 * this.aFloat43;
		this.aFloat47 = local9 * this.aFloat47 + local24 * local15;
		this.aFloat43 = this.aFloat43 * local9 + local38 * local15;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(FFBF[FF)V")
	public void method1879(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) float arg4) {
		arg3[2] = arg4 * this.aFloat45 + arg1 * this.aFloat36 + this.aFloat47 * arg2;
		arg3[1] = arg2 * this.aFloat41 + arg4 * this.aFloat44 + this.aFloat42 * arg1;
		arg3[0] = arg1 * this.aFloat40 + this.aFloat39 * arg4 + this.aFloat38 * arg2;
		@Pc(107) float local107;
		@Pc(99) float local99;
		@Pc(115) float local115;
		@Pc(91) float local91;
		if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local91 = -arg0 / arg4;
			local99 = local91 * this.aFloat44 + this.aFloat37;
			local115 = this.aFloat45 * local91 + this.aFloat43;
			local107 = local91 * this.aFloat39 + this.aFloat46;
		} else if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local91 = -arg0 / arg1;
			local99 = this.aFloat42 * local91 + this.aFloat37;
			local107 = this.aFloat40 * local91 + this.aFloat46;
			local115 = this.aFloat43 + local91 * this.aFloat36;
		} else {
			local91 = -arg0 / arg2;
			local107 = this.aFloat38 * local91 + this.aFloat46;
			local99 = this.aFloat41 * local91 + this.aFloat37;
			local115 = this.aFloat43 + local91 * this.aFloat47;
		}
		arg3[3] = -(arg3[0] * local107 + local99 * arg3[1] + local115 * arg3[2]);
	}

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "(I)V")
	@Override
	public void method7132(@OriginalArg(0) int arg0) {
		this.aFloat47 = 1.0F;
		this.aFloat39 = this.aFloat42 = Mouse.aFloatArray80[arg0 & 0x3FFF];
		this.aFloat44 = Mouse.aFloatArray79[arg0 & 0x3FFF];
		this.aFloat40 = -this.aFloat44;
		this.aFloat38 = this.aFloat46 = this.aFloat41 = this.aFloat37 = this.aFloat45 = this.aFloat36 = this.aFloat43 = 0.0F;
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(Lclient!tt;B)V")
	public void method1880(@OriginalArg(0) Class73 arg0) {
		@Pc(6) Class73_Sub1 local6 = (Class73_Sub1) arg0;
		this.aFloat40 = local6.aFloat44;
		this.aFloat39 = local6.aFloat39;
		this.aFloat38 = local6.aFloat45;
		this.aFloat42 = local6.aFloat42;
		this.aFloat41 = local6.aFloat36;
		this.aFloat45 = local6.aFloat38;
		this.aFloat44 = local6.aFloat40;
		this.aFloat46 = -(local6.aFloat37 * this.aFloat40 + local6.aFloat46 * this.aFloat39 + local6.aFloat43 * this.aFloat38);
		this.aFloat36 = local6.aFloat41;
		this.aFloat47 = local6.aFloat47;
		this.aFloat37 = -(this.aFloat42 * local6.aFloat37 + this.aFloat44 * local6.aFloat46 + local6.aFloat43 * this.aFloat41);
		this.aFloat43 = -(this.aFloat47 * local6.aFloat43 + this.aFloat45 * local6.aFloat46 + this.aFloat36 * local6.aFloat37);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I[F)[F")
	public float[] method1881(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloat39;
		arg0[15] = 1.0F;
		arg0[2] = 0.0F;
		arg0[8] = this.aFloat46;
		arg0[4] = this.aFloat40;
		arg0[9] = this.aFloat37;
		arg0[10] = this.aFloat43;
		arg0[11] = 0.0F;
		arg0[13] = 0.0F;
		arg0[7] = 0.0F;
		arg0[1] = this.aFloat44;
		arg0[3] = 0.0F;
		arg0[14] = 0.0F;
		arg0[6] = 0.0F;
		arg0[5] = this.aFloat42;
		arg0[12] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(FFBF)V")
	public void method1882(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat37 += arg1;
		this.aFloat46 += arg2;
		this.aFloat43 += arg0;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IFFF)F")
	public float method1883(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat37 + arg1 * this.aFloat44 + arg2 * this.aFloat42 + arg0 * this.aFloat41;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
	@Override
	public void method7136(@OriginalArg(0) int arg0) {
		this.aFloat39 = 1.0F;
		this.aFloat42 = this.aFloat47 = Mouse.aFloatArray80[arg0 & 0x3FFF];
		this.aFloat36 = Mouse.aFloatArray79[arg0 & 0x3FFF];
		this.aFloat40 = this.aFloat38 = this.aFloat46 = this.aFloat44 = this.aFloat37 = this.aFloat45 = this.aFloat43 = 0.0F;
		this.aFloat41 = -this.aFloat36;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(FBFF)V")
	public void method1884(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat39 = arg2;
		this.aFloat47 = arg0;
		this.aFloat43 = 0.0F;
		this.aFloat41 = 0.0F;
		this.aFloat38 = 0.0F;
		this.aFloat40 = 0.0F;
		this.aFloat36 = 0.0F;
		this.aFloat37 = 0.0F;
		this.aFloat42 = arg1;
		this.aFloat46 = 0.0F;
		this.aFloat44 = 0.0F;
		this.aFloat45 = 0.0F;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(FFFZ)F")
	public float method1885(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat46 + arg1 * this.aFloat38 + arg0 * this.aFloat40 + this.aFloat39 * arg2;
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(III)V")
	@Override
	public void method7134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat43 += (float) arg2;
		this.aFloat37 += (float) arg1;
		this.aFloat46 += (float) arg0;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!tt;B)V")
	public void method1886(@OriginalArg(0) Class73 arg0) {
		@Pc(15) Class73_Sub1 local15 = (Class73_Sub1) arg0;
		this.aFloat42 = local15.aFloat42;
		this.aFloat41 = local15.aFloat41;
		this.aFloat36 = local15.aFloat36;
		this.aFloat38 = local15.aFloat38;
		this.aFloat46 = 0.0F;
		this.aFloat47 = local15.aFloat47;
		this.aFloat40 = local15.aFloat40;
		this.aFloat44 = local15.aFloat44;
		this.aFloat43 = 0.0F;
		this.aFloat45 = local15.aFloat45;
		this.aFloat37 = 0.0F;
		this.aFloat39 = local15.aFloat39;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(FBFFFFFFFF)V")
	public void method1887(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat37 = 0.0F;
		this.aFloat44 = arg1;
		this.aFloat42 = arg8;
		this.aFloat45 = arg7;
		this.aFloat36 = arg4;
		this.aFloat43 = 0.0F;
		this.aFloat47 = arg2;
		this.aFloat46 = 0.0F;
		this.aFloat39 = arg3;
		this.aFloat41 = arg6;
		this.aFloat40 = arg0;
		this.aFloat38 = arg5;
	}

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat47 * (float) arg2 + this.aFloat36 * (float) arg1 + this.aFloat45 * (float) arg0 + this.aFloat43);
		arg3[0] = (int) ((float) arg2 * this.aFloat38 + (float) arg1 * this.aFloat40 + this.aFloat39 * (float) arg0 + this.aFloat46);
		arg3[1] = (int) (this.aFloat42 * (float) arg1 + (float) arg0 * this.aFloat44 + (float) arg2 * this.aFloat41 + this.aFloat37);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B[F)[F")
	public float[] method1888(@OriginalArg(1) float[] arg0) {
		arg0[7] = this.aFloat37;
		arg0[14] = 0.0F;
		arg0[8] = this.aFloat45;
		arg0[1] = this.aFloat40;
		arg0[15] = 1.0F;
		arg0[10] = this.aFloat47;
		arg0[4] = this.aFloat44;
		arg0[2] = this.aFloat38;
		arg0[11] = this.aFloat43;
		arg0[3] = this.aFloat46;
		arg0[9] = this.aFloat36;
		arg0[0] = this.aFloat39;
		arg0[5] = this.aFloat42;
		arg0[6] = this.aFloat41;
		arg0[13] = 0.0F;
		arg0[12] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(FFFZ)F")
	public float method1889(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat47 * arg0 + this.aFloat36 * arg1 + arg2 * this.aFloat45 + this.aFloat43;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Mouse.aFloatArray80[arg3 & 0x3FFF];
		@Pc(15) float local15 = Mouse.aFloatArray79[arg3 & 0x3FFF];
		@Pc(21) float local21 = Mouse.aFloatArray80[arg4 & 0x3FFF];
		@Pc(27) float local27 = Mouse.aFloatArray79[arg4 & 0x3FFF];
		@Pc(33) float local33 = Mouse.aFloatArray80[arg5 & 0x3FFF];
		@Pc(39) float local39 = Mouse.aFloatArray79[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat38 = local33 * -local27 + local47 * local21;
		this.aFloat40 = local39 * local9;
		this.aFloat44 = local43 * local27 + local39 * -local21;
		this.aFloat45 = local27 * local9;
		this.aFloat36 = -local15;
		this.aFloat39 = local33 * local21 + local47 * local27;
		this.aFloat41 = local27 * local39 + local43 * local21;
		this.aFloat47 = local21 * local9;
		this.aFloat42 = local33 * local9;
		this.aFloat46 = -((float) arg2 * this.aFloat38) - this.aFloat40 * (float) arg1 + (float) -arg0 * this.aFloat39;
		this.aFloat37 = -((float) arg1 * this.aFloat42) + (float) -arg0 * this.aFloat44 - this.aFloat41 * (float) arg2;
		this.aFloat43 = -((float) arg2 * this.aFloat47) - this.aFloat36 * (float) arg1 + (float) -arg0 * this.aFloat45;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!tt;Lclient!tt;)V")
	public void method1890(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class73 arg1) {
		@Pc(6) Class73_Sub1 local6 = (Class73_Sub1) arg0;
		@Pc(9) Class73_Sub1 local9 = (Class73_Sub1) arg1;
		this.aFloat39 = local9.aFloat45 * local6.aFloat38 + local9.aFloat39 * local6.aFloat39 + local6.aFloat40 * local9.aFloat44;
		this.aFloat44 = local9.aFloat44 * local6.aFloat42 + local9.aFloat39 * local6.aFloat44 + local9.aFloat45 * local6.aFloat41;
		this.aFloat45 = local9.aFloat39 * local6.aFloat45 + local6.aFloat36 * local9.aFloat44 + local9.aFloat45 * local6.aFloat47;
		this.aFloat40 = local6.aFloat39 * local9.aFloat40 + local6.aFloat40 * local9.aFloat42 + local9.aFloat36 * local6.aFloat38;
		this.aFloat42 = local6.aFloat42 * local9.aFloat42 + local9.aFloat40 * local6.aFloat44 + local6.aFloat41 * local9.aFloat36;
		this.aFloat36 = local9.aFloat40 * local6.aFloat45 + local9.aFloat42 * local6.aFloat36 + local6.aFloat47 * local9.aFloat36;
		this.aFloat38 = local6.aFloat38 * local9.aFloat47 + local6.aFloat40 * local9.aFloat41 + local6.aFloat39 * local9.aFloat38;
		this.aFloat41 = local6.aFloat41 * local9.aFloat47 + local6.aFloat42 * local9.aFloat41 + local9.aFloat38 * local6.aFloat44;
		this.aFloat47 = local6.aFloat47 * local9.aFloat47 + local6.aFloat45 * local9.aFloat38 + local6.aFloat36 * local9.aFloat41;
		this.aFloat46 = local6.aFloat38 * local9.aFloat43 + local6.aFloat40 * local9.aFloat37 + local6.aFloat39 * local9.aFloat46 + local6.aFloat46;
		this.aFloat37 = local6.aFloat37 + local9.aFloat43 * local6.aFloat41 + local9.aFloat46 * local6.aFloat44 + local6.aFloat42 * local9.aFloat37;
		this.aFloat43 = local6.aFloat43 + local6.aFloat47 * local9.aFloat43 + local9.aFloat37 * local6.aFloat36 + local9.aFloat46 * local6.aFloat45;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "()V")
	@Override
	public void method7133() {
		this.aFloat39 = this.aFloat42 = this.aFloat47 = 1.0F;
		this.aFloat44 = this.aFloat45 = this.aFloat40 = this.aFloat36 = this.aFloat38 = this.aFloat41 = this.aFloat46 = this.aFloat37 = this.aFloat43 = 0.0F;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Z[F)[F")
	public float[] method1891(@OriginalArg(1) float[] arg0) {
		arg0[10] = this.aFloat47;
		arg0[5] = this.aFloat42;
		arg0[1] = this.aFloat44;
		arg0[6] = this.aFloat36;
		arg0[13] = this.aFloat37;
		arg0[8] = this.aFloat38;
		arg0[9] = this.aFloat41;
		arg0[12] = this.aFloat46;
		arg0[4] = this.aFloat40;
		arg0[0] = this.aFloat39;
		arg0[14] = this.aFloat43;
		arg0[11] = 0.0F;
		arg0[2] = this.aFloat45;
		arg0[7] = 0.0F;
		arg0[3] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V")
	@Override
	public void method7139(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Mouse.aFloatArray80[arg0 & 0x3FFF];
		@Pc(15) float local15 = Mouse.aFloatArray79[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat39;
		@Pc(21) float local21 = this.aFloat40;
		@Pc(24) float local24 = this.aFloat38;
		this.aFloat39 = local18 * local9 - this.aFloat44 * local15;
		@Pc(37) float local37 = this.aFloat46;
		this.aFloat44 = local9 * this.aFloat44 + local18 * local15;
		this.aFloat40 = local21 * local9 - local15 * this.aFloat42;
		this.aFloat38 = local24 * local9 - local15 * this.aFloat41;
		this.aFloat42 = local15 * local21 + this.aFloat42 * local9;
		this.aFloat41 = local24 * local15 + this.aFloat41 * local9;
		this.aFloat46 = local37 * local9 - local15 * this.aFloat37;
		this.aFloat37 = this.aFloat37 * local9 + local15 * local37;
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(I[F)[F")
	public float[] method1892(@OriginalArg(1) float[] arg0) {
		arg0[15] = 0.0F;
		arg0[2] = this.aFloat38;
		arg0[4] = this.aFloat44;
		arg0[13] = 0.0F;
		arg0[0] = this.aFloat39;
		arg0[7] = 0.0F;
		arg0[12] = 0.0F;
		arg0[5] = this.aFloat42;
		arg0[14] = 0.0F;
		arg0[6] = this.aFloat41;
		arg0[11] = 0.0F;
		arg0[9] = this.aFloat36;
		arg0[8] = this.aFloat45;
		arg0[10] = this.aFloat47;
		arg0[1] = this.aFloat40;
		arg0[3] = (float) 0;
		return arg0;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(FIIIFFI)V")
	public void method1893(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat39 = (float) (arg2 * 2);
			this.aFloat44 = this.aFloat45 = this.aFloat40 = this.aFloat36 = this.aFloat38 = this.aFloat41 = 0.0F;
			this.aFloat46 = arg4 - (float) arg2;
			this.aFloat47 = 1.0F;
			this.aFloat37 = arg3 - (float) arg1;
			this.aFloat43 = arg0;
			this.aFloat42 = (float) (arg1 * 2);
			return;
		}
		@Pc(59) float local59 = Mouse.aFloatArray80[arg5 & 0x3FFF];
		@Pc(65) float local65 = Mouse.aFloatArray79[arg5 & 0x3FFF];
		this.aFloat37 = arg3 + (-0.5F * local65 - local59 * 0.5F) * (float) (arg1 * 2);
		this.aFloat40 = -2.0F * local65 * (float) arg1;
		this.aFloat43 = arg0;
		this.aFloat46 = (float) (arg2 * 2) * (local65 * 0.5F - local59 * 0.5F) + arg4;
		this.aFloat39 = (float) arg2 * local59 * 2.0F;
		this.aFloat45 = this.aFloat36 = this.aFloat38 = this.aFloat41 = 0.0F;
		this.aFloat44 = (float) arg2 * local65 * 2.0F;
		this.aFloat47 = 1.0F;
		this.aFloat42 = (float) arg1 * local59 * 2.0F;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)V")
	@Override
	public void method7125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat37 = (float) arg1;
		this.aFloat46 = (float) arg0;
		this.aFloat39 = this.aFloat42 = this.aFloat47 = 1.0F;
		this.aFloat44 = this.aFloat45 = this.aFloat40 = this.aFloat36 = this.aFloat38 = this.aFloat41 = 0.0F;
		this.aFloat43 = (float) arg2;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "([I)V")
	@Override
	public void method7126(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat46;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat37;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat43;
		arg0[0] = (int) (local12 * this.aFloat39 + local20 * this.aFloat44 + this.aFloat45 * local29);
		arg0[2] = (int) (local12 * this.aFloat38 + this.aFloat41 * local20 + local29 * this.aFloat47);
		arg0[1] = (int) (local29 * this.aFloat36 + local12 * this.aFloat40 + this.aFloat42 * local20);
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "()Lclient!tt;")
	@Override
	public Class73 method7129() {
		@Pc(7) Class73_Sub1 local7 = new Class73_Sub1();
		local7.aFloat39 = this.aFloat39;
		local7.aFloat46 = this.aFloat46;
		local7.aFloat40 = this.aFloat40;
		local7.aFloat37 = this.aFloat37;
		local7.aFloat47 = this.aFloat47;
		local7.aFloat44 = this.aFloat44;
		local7.aFloat45 = this.aFloat45;
		local7.aFloat38 = this.aFloat38;
		local7.aFloat36 = this.aFloat36;
		local7.aFloat43 = this.aFloat43;
		local7.aFloat42 = this.aFloat42;
		local7.aFloat41 = this.aFloat41;
		return local7;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V")
	public void method1895() {
		this.aFloat43 = -this.aFloat43;
		this.aFloat45 = -this.aFloat45;
		this.aFloat42 = -this.aFloat42;
		this.aFloat41 = -this.aFloat41;
		this.aFloat36 = -this.aFloat36;
		this.aFloat47 = -this.aFloat47;
		this.aFloat44 = -this.aFloat44;
		this.aFloat37 = -this.aFloat37;
	}

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "(I)V")
	@Override
	public void method7127(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Mouse.aFloatArray80[arg0 & 0x3FFF];
		@Pc(15) float local15 = Mouse.aFloatArray79[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat39;
		@Pc(21) float local21 = this.aFloat40;
		@Pc(24) float local24 = this.aFloat38;
		this.aFloat39 = local15 * this.aFloat45 + local18 * local9;
		@Pc(37) float local37 = this.aFloat46;
		this.aFloat40 = local21 * local9 + this.aFloat36 * local15;
		this.aFloat45 = local9 * this.aFloat45 - local15 * local18;
		this.aFloat36 = local9 * this.aFloat36 - local15 * local21;
		this.aFloat38 = local9 * local24 + local15 * this.aFloat47;
		this.aFloat47 = local9 * this.aFloat47 - local15 * local24;
		this.aFloat46 = local37 * local9 + this.aFloat43 * local15;
		this.aFloat43 = this.aFloat43 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat38 * (float) arg2 + (float) arg1 * this.aFloat40 + (float) arg0 * this.aFloat39);
		arg3[1] = (int) ((float) arg1 * this.aFloat42 + this.aFloat44 * (float) arg0 + (float) arg2 * this.aFloat41);
		arg3[2] = (int) ((float) arg1 * this.aFloat36 + this.aFloat45 * (float) arg0 + this.aFloat47 * (float) arg2);
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(FBFF)V")
	public void method1896(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat38 *= arg1;
		this.aFloat45 *= arg2;
		this.aFloat36 *= arg2;
		this.aFloat41 *= arg0;
		this.aFloat39 *= arg1;
		this.aFloat46 *= arg1;
		this.aFloat44 *= arg0;
		this.aFloat43 *= arg2;
		this.aFloat37 *= arg0;
		this.aFloat40 *= arg1;
		this.aFloat47 *= arg2;
		this.aFloat42 *= arg0;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!tt;)V")
	@Override
	public void method7128(@OriginalArg(0) Class73 arg0) {
		@Pc(6) Class73_Sub1 local6 = (Class73_Sub1) arg0;
		this.aFloat45 = local6.aFloat45;
		this.aFloat44 = local6.aFloat44;
		this.aFloat40 = local6.aFloat40;
		this.aFloat42 = local6.aFloat42;
		this.aFloat36 = local6.aFloat36;
		this.aFloat41 = local6.aFloat41;
		this.aFloat38 = local6.aFloat38;
		this.aFloat43 = local6.aFloat43;
		this.aFloat37 = local6.aFloat37;
		this.aFloat39 = local6.aFloat39;
		this.aFloat46 = local6.aFloat46;
		this.aFloat47 = local6.aFloat47;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(F[FFFB)V")
	public void method1897(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		arg1[2] = arg3 * this.aFloat47 + this.aFloat36 * arg2 + arg0 * this.aFloat45;
		arg1[0] = this.aFloat38 * arg3 + this.aFloat39 * arg0 + arg2 * this.aFloat40;
		arg1[1] = this.aFloat41 * arg3 + this.aFloat42 * arg2 + this.aFloat44 * arg0;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "([FZ)[F")
	public float[] method1898(@OriginalArg(0) float[] arg0) {
		arg0[4] = this.aFloat44;
		arg0[3] = this.aFloat46;
		arg0[6] = this.aFloat41;
		arg0[2] = this.aFloat38;
		arg0[5] = this.aFloat42;
		arg0[1] = this.aFloat40;
		arg0[7] = this.aFloat37;
		arg0[0] = this.aFloat39;
		return arg0;
	}
}
