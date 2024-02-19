import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class HitmarkType {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Lclient!ld;")
	public HitmarkTypeList aHitmarkTypeList1;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	public int anInt7179 = -1;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Ljava/lang/String;")
	private String aString82 = "";

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	private int anInt7183 = -1;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	public int anInt7184 = 0;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
	private int anInt7187 = -1;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
	private int anInt7180 = -1;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
	public int anInt7191 = 0;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
	public int anInt7190 = 16777215;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
	public int anInt7192 = 70;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
	public int anInt7178 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	private int anInt7181 = -1;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
	public int anInt7196 = -1;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
	public int anInt7195 = -1;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!ha;I)Lclient!st;")
	public SoftwareIndexedSprite method6451(@OriginalArg(0) Class19 arg0) {
		if (this.anInt7181 < 0) {
			return null;
		}
		@Pc(22) SoftwareIndexedSprite local22 = (SoftwareIndexedSprite) this.aHitmarkTypeList1.aSoftLruHashTable121.get((long) this.anInt7181);
		if (local22 == null) {
			this.method6455(arg0);
			local22 = (SoftwareIndexedSprite) this.aHitmarkTypeList1.aSoftLruHashTable121.get((long) this.anInt7181);
		}
		return local22;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(ILclient!ha;)Lclient!st;")
	public SoftwareIndexedSprite method6452(@OriginalArg(1) Class19 arg0) {
		if (this.anInt7180 < 0) {
			return null;
		}
		@Pc(29) SoftwareIndexedSprite local29 = (SoftwareIndexedSprite) this.aHitmarkTypeList1.aSoftLruHashTable121.get((long) this.anInt7180);
		if (local29 == null) {
			this.method6455(arg0);
			local29 = (SoftwareIndexedSprite) this.aHitmarkTypeList1.aSoftLruHashTable121.get((long) this.anInt7180);
		}
		return local29;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!ha;B)Lclient!st;")
	public SoftwareIndexedSprite method6453(@OriginalArg(0) Class19 arg0) {
		if (this.anInt7187 < 0) {
			return null;
		}
		@Pc(27) SoftwareIndexedSprite local27 = (SoftwareIndexedSprite) this.aHitmarkTypeList1.aSoftLruHashTable121.get((long) this.anInt7187);
		if (local27 == null) {
			this.method6455(arg0);
			local27 = (SoftwareIndexedSprite) this.aHitmarkTypeList1.aSoftLruHashTable121.get((long) this.anInt7187);
		}
		return local27;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!ha;)Lclient!st;")
	public SoftwareIndexedSprite method6454(@OriginalArg(1) Class19 arg0) {
		if (this.anInt7183 < 0) {
			return null;
		}
		@Pc(20) SoftwareIndexedSprite local20 = (SoftwareIndexedSprite) this.aHitmarkTypeList1.aSoftLruHashTable121.get((long) this.anInt7183);
		if (local20 == null) {
			this.method6455(arg0);
			local20 = (SoftwareIndexedSprite) this.aHitmarkTypeList1.aSoftLruHashTable121.get((long) this.anInt7183);
		}
		return local20;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(ILclient!ha;)V")
	private void method6455(@OriginalArg(1) Class19 arg0) {
		@Pc(7) Js5 local7 = this.aHitmarkTypeList1.aJs576;
		@Pc(34) Class407 local34;
		if (this.anInt7183 >= 0 && this.aHitmarkTypeList1.aSoftLruHashTable121.get((long) this.anInt7183) == null && local7.isFileReady(this.anInt7183)) {
			local34 = Static735.method9379(local7, this.anInt7183);
			this.aHitmarkTypeList1.aSoftLruHashTable121.put((long) this.anInt7183, arg0.method7948(local34, true));
		}
		if (this.anInt7181 >= 0 && this.aHitmarkTypeList1.aSoftLruHashTable121.get((long) this.anInt7181) == null && local7.isFileReady(this.anInt7181)) {
			local34 = Static735.method9379(local7, this.anInt7181);
			this.aHitmarkTypeList1.aSoftLruHashTable121.put((long) this.anInt7181, arg0.method7948(local34, true));
		}
		if (this.anInt7180 >= 0 && this.aHitmarkTypeList1.aSoftLruHashTable121.get((long) this.anInt7180) == null && local7.isFileReady(this.anInt7180)) {
			local34 = Static735.method9379(local7, this.anInt7180);
			this.aHitmarkTypeList1.aSoftLruHashTable121.put((long) this.anInt7180, arg0.method7948(local34, true));
		}
		if (this.anInt7187 >= 0 && this.aHitmarkTypeList1.aSoftLruHashTable121.get((long) this.anInt7187) == null && local7.isFileReady(this.anInt7187)) {
			local34 = Static735.method9379(local7, this.anInt7187);
			this.aHitmarkTypeList1.aSoftLruHashTable121.put((long) this.anInt7187, arg0.method7948(local34, true));
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!ge;BI)V")
	private void decode(@OriginalArg(0) Packet buf, @OriginalArg(2) int opcode) {
		if (opcode == 1) {
			this.anInt7196 = buf.g2();
		} else if (opcode == 2) {
			this.anInt7190 = buf.g3();
		} else if (opcode == 3) {
			this.anInt7183 = buf.g2();
		} else if (opcode == 4) {
			this.anInt7180 = buf.g2();
		} else if (opcode == 5) {
			this.anInt7181 = buf.g2();
		} else if (opcode == 6) {
			this.anInt7187 = buf.g2();
		} else if (opcode == 7) {
			this.anInt7184 = buf.g2s();
		} else if (opcode == 8) {
			this.aString82 = buf.gjstr2();
		} else if (opcode == 9) {
			this.anInt7192 = buf.g2();
		} else if (opcode == 10) {
			this.anInt7191 = buf.g2s();
		} else if (opcode == 11) {
			this.anInt7179 = 0;
		} else if (opcode == 12) {
			this.anInt7195 = buf.g1();
		} else if (opcode == 13) {
			this.anInt7178 = buf.g2s();
		} else if (opcode == 14) {
			this.anInt7179 = buf.g2();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method6457(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = this.aString82;
		while (true) {
			@Pc(14) int local14 = local8.indexOf("%1");
			if (local14 < 0) {
				return local8;
			}
			local8 = local8.substring(0, local14) + Static593.method7780(false, arg0) + local8.substring(local14 + 2);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLclient!ge;)V")
	public void decode(@OriginalArg(1) Packet buf) {
		while (true) {
			@Pc(3) int opcode = buf.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(buf, opcode);
		}
	}
}
