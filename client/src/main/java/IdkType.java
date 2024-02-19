import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pka")
public final class IdkType {

	@OriginalMember(owner = "client!pka", name = "f", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!pka", name = "i", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!pka", name = "j", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!pka", name = "n", descriptor = "[I")
	private int[] anIntArray602;

	@OriginalMember(owner = "client!pka", name = "e", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "Lclient!kr;")
	public IdkTypeList aIdkTypeList4;

	@OriginalMember(owner = "client!pka", name = "c", descriptor = "[I")
	private final int[] anIntArray603 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(BILclient!ge;)V")
	private void deccode(@OriginalArg(2) Packet buf, @OriginalArg(1) int opcode) {
		if (opcode == 1) {
			buf.g1();
			return;
		}
		@Pc(59) int local59;
		@Pc(69) int local69;
		if (opcode == 2) {
			local59 = buf.g1();
			this.anIntArray602 = new int[local59];
			for (local69 = 0; local69 < local59; local69++) {
				this.anIntArray602[local69] = buf.g2();
			}
		} else if (opcode != 3) {
			if (opcode == 40) {
				local59 = buf.g1();
				this.aShortArray108 = new short[local59];
				this.aShortArray105 = new short[local59];
				for (local69 = 0; local69 < local59; local69++) {
					this.aShortArray105[local69] = (short) buf.g2();
					this.aShortArray108[local69] = (short) buf.g2();
				}
			} else if (opcode == 41) {
				local59 = buf.g1();
				this.aShortArray106 = new short[local59];
				this.aShortArray107 = new short[local59];
				for (local69 = 0; local69 < local59; local69++) {
					this.aShortArray107[local69] = (short) buf.g2();
					this.aShortArray106[local69] = (short) buf.g2();
				}
			} else if (opcode >= 60 && opcode < 70) {
				this.anIntArray603[opcode - 60] = buf.g2();
			}
		}
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(Lclient!ge;B)V")
	public void decode(@OriginalArg(0) Packet buf) {
		while (true) {
			@Pc(9) int opcode = buf.g1();
			if (opcode == 0) {
				return;
			}
			this.deccode(buf, opcode);
		}
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(B)Lclient!dv;")
	public Class88 method6614() {
		@Pc(8) Class88[] local8 = new Class88[5];
		@Pc(10) int local10 = 0;
		@Pc(22) Js5 local22 = this.aIdkTypeList4.aJs572;
		@Pc(26) int local26;
		synchronized (this.aIdkTypeList4.aJs572) {
			local26 = 0;
			while (true) {
				if (local26 >= 5) {
					break;
				}
				if (this.anIntArray603[local26] != -1) {
					local8[local10++] = Static121.method2201(this.anIntArray603[local26], this.aIdkTypeList4.aJs572);
				}
				local26++;
			}
		}
		for (@Pc(66) int local66 = 0; local66 < 5; local66++) {
			if (local8[local66] != null && local8[local66].anInt2379 < 13) {
				local8[local66].method2232();
			}
		}
		@Pc(102) Class88 local102 = new Class88(local8, local10);
		if (this.aShortArray105 != null) {
			for (local26 = 0; local26 < this.aShortArray105.length; local26++) {
				local102.method2240(this.aShortArray105[local26], this.aShortArray108[local26]);
			}
		}
		if (this.aShortArray107 != null) {
			for (local26 = 0; local26 < this.aShortArray107.length; local26++) {
				local102.method2238(this.aShortArray107[local26], this.aShortArray106[local26]);
			}
		}
		return local102;
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(Z)Z")
	public boolean method6615() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Js5 local11 = this.aIdkTypeList4.aJs572;
		synchronized (this.aIdkTypeList4.aJs572) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray603[local15] != -1 && !this.aIdkTypeList4.aJs572.isFileReady(this.anIntArray603[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(I)Z")
	public boolean method6616() {
		if (this.anIntArray602 == null) {
			return true;
		}
		@Pc(11) boolean local11 = true;
		@Pc(15) Js5 local15 = this.aIdkTypeList4.aJs572;
		synchronized (this.aIdkTypeList4.aJs572) {
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray602.length; local19++) {
				if (!this.aIdkTypeList4.aJs572.isFileReady(this.anIntArray602[local19], 0)) {
					local11 = false;
				}
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!pka", name = "b", descriptor = "(I)Lclient!dv;")
	public Class88 method6618() {
		if (this.anIntArray602 == null) {
			return null;
		}
		@Pc(14) Class88[] local14 = new Class88[this.anIntArray602.length];
		@Pc(18) Js5 local18 = this.aIdkTypeList4.aJs572;
		@Pc(22) int local22;
		synchronized (this.aIdkTypeList4.aJs572) {
			local22 = 0;
			while (true) {
				if (local22 >= this.anIntArray602.length) {
					break;
				}
				local14[local22] = Static121.method2201(this.anIntArray602[local22], this.aIdkTypeList4.aJs572);
				local22++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray602.length; local56++) {
			if (local14[local56].anInt2379 < 13) {
				local14[local56].method2232();
			}
		}
		@Pc(93) Class88 local93;
		if (local14.length == 1) {
			local93 = local14[0];
		} else {
			local93 = new Class88(local14, local14.length);
		}
		if (local93 == null) {
			return null;
		}
		if (this.aShortArray105 != null) {
			for (local22 = 0; local22 < this.aShortArray105.length; local22++) {
				local93.method2240(this.aShortArray105[local22], this.aShortArray108[local22]);
			}
		}
		if (this.aShortArray107 != null) {
			for (local22 = 0; local22 < this.aShortArray107.length; local22++) {
				local93.method2238(this.aShortArray107[local22], this.aShortArray106[local22]);
			}
		}
		return local93;
	}
}
