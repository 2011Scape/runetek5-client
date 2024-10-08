import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public class Class152 {

	@OriginalMember(owner = "client!gu", name = "L", descriptor = "Lclient!cka;")
	public SeqType aSeqType4;

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
	private int anInt10469;

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
	private int anInt10474;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
	public int anInt10478;

	@OriginalMember(owner = "client!gu", name = "v", descriptor = "I")
	private int anInt10485;

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
	public int anInt10489;

	@OriginalMember(owner = "client!gu", name = "G", descriptor = "Z")
	private boolean aBoolean790 = false;

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
	private int anInt10483 = 0;

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "Z")
	private boolean aBoolean791 = false;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "Lclient!nfa;")
	public final Class257 aClass257_8;

	@OriginalMember(owner = "client!gu", name = "J", descriptor = "Lclient!nfa;")
	private final Class257 aClass257_7;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Z)V")
	protected Class152(@OriginalArg(0) boolean arg0) {
		this.aBoolean790 = arg0;
		this.aClass257_8 = new Class257();
		if (this.aBoolean790) {
			this.aClass257_7 = new Class257();
		} else {
			this.aClass257_7 = null;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!cka;B)V")
	protected void method9086(@OriginalArg(0) int arg0, @OriginalArg(1) SeqType arg1) {
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)I")
	public final int method9087() {
		return this.anInt10469;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!ka;I)V")
	public final void method9089(@OriginalArg(1) Model arg0, @OriginalArg(2) int arg1) {
		if (this.aSeqType4 == null || !this.method9111()) {
			return;
		}
		arg0.method7487(this.aClass257_8.aClass2_Sub2_Sub18_1, this.anInt10478, this.aSeqType4.frameDelay[this.anInt10489], this.aClass257_8.aClass2_Sub2_Sub18_2, this.aClass257_8.anInt6448, this.aClass257_8.anInt6450, arg1, this.aSeqType4.rotateNormals);
		if (this.aBoolean790 && this.aSeqType4.frameset != null && this.aClass257_7.aBoolean481) {
			arg0.method7487(this.aClass257_7.aClass2_Sub2_Sub18_1, this.anInt10478, this.aSeqType4.frameDelay[this.anInt10489], this.aClass257_7.aClass2_Sub2_Sub18_2, this.aClass257_7.anInt6448, this.aClass257_7.anInt6450, arg1, this.aSeqType4.rotateNormals);
			return;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BI)Z")
	public final boolean method9090() {
		@Pc(24) int local24;
		return this.aSeqType4 == null | (local24 = 1 - this.anInt10469) <= 0 ? false : this.aSeqType4.tween | this.anInt10478 + local24 > this.aSeqType4.frameDelay[this.anInt10489];
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)V")
	public final void method9091(@OriginalArg(0) int arg0) {
		this.anInt10469 = arg0;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIBIZ)V")
	public final void method9092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (this.method9114() == arg0) {
			return;
		}
		if (arg0 == -1) {
			this.aSeqType4 = null;
		} else {
			if (this.aSeqType4 == null || arg0 != this.aSeqType4.id) {
				this.aSeqType4 = Static692.aSeqTypeList2.get(arg0);
			} else if (this.aSeqType4.exactmove == 0) {
				return;
			}
			this.anInt10469 = arg1;
			this.anInt10483 = arg2;
			this.anInt10485 = 0;
			if (arg3) {
				this.anInt10489 = (int) ((double) this.aSeqType4.frames.length * Math.random());
				this.anInt10478 = (int) (Math.random() * (double) this.aSeqType4.frameDelay[this.anInt10489]);
			} else {
				this.anInt10478 = 0;
				this.anInt10489 = 0;
			}
			this.anInt10474 = this.anInt10489 + 1;
			if (this.anInt10474 < 0 || this.anInt10474 >= this.aSeqType4.frames.length) {
				this.anInt10474 = -1;
			}
			if (this.anInt10469 == 0) {
				this.method9086(this.anInt10489, this.aSeqType4);
			}
			this.aBoolean791 = false;
		}
		this.method9108();
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(BI)V")
	public final void method9093(@OriginalArg(1) int arg0) {
		this.anInt10489 = 0;
		this.anInt10474 = this.aSeqType4.frames.length <= 1 ? -1 : 1;
		this.anInt10478 = 0;
		this.aBoolean791 = false;
		this.anInt10469 = arg0;
		this.anInt10485 = 0;
		if (this.aSeqType4 != null) {
			this.method9086(this.anInt10489, this.aSeqType4);
			this.method9108();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!gu;)V")
	public final void method9096(@OriginalArg(1) Class152 arg0) {
		this.aSeqType4 = arg0.aSeqType4;
		this.aBoolean790 = arg0.aBoolean790;
		this.aBoolean791 = arg0.aBoolean791;
		this.anInt10469 = arg0.anInt10469;
		this.anInt10485 = arg0.anInt10485;
		this.anInt10474 = arg0.anInt10474;
		this.anInt10489 = arg0.anInt10489;
		this.anInt10478 = arg0.anInt10478;
		this.method9108();
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)V")
	public final void method9098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method9092(arg1, arg0, 0, false);
	}

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)V")
	public final void method9099() {
		this.method9093(0);
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(B)I")
	public final int method9101() {
		if (!this.method9111()) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		if (this.method9111()) {
			local18 = this.aClass257_8.anInt6452 | 0x0;
			if (this.aBoolean790 && this.aSeqType4.frameset != null) {
				local18 |= this.aClass257_7.anInt6452;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "(I)Z")
	public final boolean method9102() {
		return this.aBoolean791;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZII)V")
	public final void method9104(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 838828768) {
			this.method9104(true, 51, 15);
		}
		this.method9092(arg1, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!ka;I)V")
	public final void method9105(@OriginalArg(0) Model arg0) {
		if (this.method9111()) {
			arg0.method7493(this.aClass257_8.anInt6448, this.aClass257_8.aClass2_Sub2_Sub18_1);
			if (this.aBoolean790 && this.aSeqType4.frameset != null && this.aClass257_7.aBoolean481) {
				arg0.method7493(this.aClass257_7.anInt6448, this.aClass257_7.aClass2_Sub2_Sub18_1);
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)Z")
	public final boolean method9106() {
		return this.anInt10469 != 0;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)Lclient!cka;")
	public final SeqType method9107() {
		return this.aSeqType4;
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
	private void method9108() {
		this.aClass257_8.method5774();
		if (this.aBoolean790) {
			this.aClass257_7.method5774();
		}
	}

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)Z")
	public final boolean method9109() {
		return this.aSeqType4 != null;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIZLclient!ka;)V")
	public final void method9110(@OriginalArg(0) int arg0, @OriginalArg(3) Model arg1) {
		if (this.method9111()) {
			arg1.method7496(this.anInt10478, this.aClass257_8.aClass2_Sub2_Sub18_1, this.aClass257_8.aClass2_Sub2_Sub18_2, this.aClass257_8.anInt6448, (int[]) null, this.aSeqType4.frameDelay[this.anInt10489], this.aSeqType4.rotateNormals, this.aClass257_8.anInt6450, arg0);
			if (this.aBoolean790 && this.aSeqType4.frameset != null && this.aClass257_7.aBoolean481) {
				arg1.method7496(this.anInt10478, this.aClass257_7.aClass2_Sub2_Sub18_1, this.aClass257_7.aClass2_Sub2_Sub18_2, this.aClass257_7.anInt6448, (int[]) null, this.aSeqType4.frameDelay[this.anInt10489], this.aSeqType4.rotateNormals, this.aClass257_7.anInt6450, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Z")
	public final boolean method9111() {
		if (this.aSeqType4 == null) {
			return false;
		}
		@Pc(30) boolean local30 = this.aClass257_8.method5769(Static692.aSeqTypeList2, this.aSeqType4, this.anInt10474, this.anInt10489, this.aSeqType4.frames);
		if (local30 && this.aBoolean790 && this.aSeqType4.frameset != null) {
			this.aClass257_7.method5769(Static692.aSeqTypeList2, this.aSeqType4, this.anInt10474, this.anInt10489, this.aSeqType4.frameset);
		}
		return local30;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)Z")
	public final boolean method9112(@OriginalArg(1) int arg0) {
		if (this.aSeqType4 == null || arg0 == 0) {
			return false;
		}
		if (this.anInt10469 > 0) {
			if (this.anInt10469 >= arg0) {
				this.anInt10469 -= arg0;
				return false;
			}
			arg0 -= this.anInt10469;
			this.anInt10469 = 0;
			this.method9086(this.anInt10489, this.aSeqType4);
		}
		arg0 += this.anInt10478;
		@Pc(68) boolean local68 = Static296.tweeningEnabled | this.aSeqType4.tween;
		if (arg0 > 100 && this.aSeqType4.replayoff > 0) {
			@Pc(89) int local89 = this.aSeqType4.frames.length - this.aSeqType4.replayoff;
			while (this.anInt10489 < local89 && arg0 > this.aSeqType4.frameDelay[this.anInt10489]) {
				arg0 -= this.aSeqType4.frameDelay[this.anInt10489];
				this.anInt10489++;
			}
			if (local89 <= this.anInt10489) {
				@Pc(134) int local134 = 0;
				for (@Pc(136) int local136 = local89; local136 < this.aSeqType4.frames.length; local136++) {
					local134 += this.aSeqType4.frameDelay[local136];
				}
				if (this.anInt10483 == 0) {
					this.anInt10485 += arg0 / local134;
				}
				arg0 %= local134;
			}
			this.anInt10474 = this.anInt10489 + 1;
			local68 = true;
			if (this.anInt10474 >= this.aSeqType4.frames.length) {
				this.anInt10474 -= this.aSeqType4.replayoff;
				if (this.anInt10474 < 0 || this.aSeqType4.frames.length <= this.anInt10474) {
					this.anInt10474 = -1;
				}
			}
		}
		while (this.aSeqType4.frameDelay[this.anInt10489] < arg0) {
			arg0 -= this.aSeqType4.frameDelay[this.anInt10489++];
			local68 = true;
			if (this.aSeqType4.frames.length <= this.anInt10489) {
				if (this.aSeqType4.replayoff != -1 && this.anInt10483 != 2) {
					this.anInt10489 -= this.aSeqType4.replayoff;
					if (this.anInt10483 == 0) {
						this.anInt10485++;
					}
				}
				if (this.anInt10485 >= this.aSeqType4.replaycount || this.anInt10489 < 0 || this.anInt10489 >= this.aSeqType4.frames.length) {
					this.aBoolean791 = true;
					break;
				}
			}
			this.method9086(this.anInt10489, this.aSeqType4);
			this.anInt10474 = this.anInt10489 + 1;
			if (this.anInt10474 >= this.aSeqType4.frames.length) {
				this.anInt10474 -= this.aSeqType4.replayoff;
				if (this.anInt10474 < 0 || this.anInt10474 >= this.aSeqType4.frames.length) {
					this.anInt10474 = -1;
				}
			}
		}
		this.anInt10478 = arg0;
		if (local68) {
			this.method9108();
		}
		return local68;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)V")
	public final void method9113(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (!arg0) {
			this.method9104(true, -1, 58);
		}
		this.method9092(arg1, 0, 0, false);
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)I")
	public final int method9114() {
		return this.aSeqType4 == null ? -1 : this.aSeqType4.id;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V")
	public final void method9115() {
		this.anInt10485 = 0;
	}
}
