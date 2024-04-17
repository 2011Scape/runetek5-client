import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pla")
public final class Js5NetQueue {

	@OriginalMember(owner = "client!pla", name = "y", descriptor = "Lclient!nk;")
	private ClientStream aClientStream1;

	@OriginalMember(owner = "client!pla", name = "q", descriptor = "I")
	private int anInt7451;

	@OriginalMember(owner = "client!pla", name = "m", descriptor = "J")
	private long aLong238;

	@OriginalMember(owner = "client!pla", name = "B", descriptor = "Lclient!rja;")
	private Js5NetRequest aClass2_Sub2_Sub17_Sub1_2;

	@OriginalMember(owner = "client!pla", name = "C", descriptor = "Lclient!jga;")
	private final SecondaryLinkedList aSecondaryLinkedList10 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!pla", name = "b", descriptor = "Lclient!jga;")
	private final SecondaryLinkedList aSecondaryLinkedList11 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!pla", name = "r", descriptor = "Lclient!jga;")
	private final SecondaryLinkedList aSecondaryLinkedList12 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!pla", name = "j", descriptor = "Lclient!jga;")
	private final SecondaryLinkedList aSecondaryLinkedList13 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!pla", name = "v", descriptor = "Lclient!ge;")
	private final Packet aPacket_13 = new Packet(4);

	@OriginalMember(owner = "client!pla", name = "w", descriptor = "I")
	public volatile int anInt7453 = 0;

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "I")
	public volatile int anInt7452 = 0;

	@OriginalMember(owner = "client!pla", name = "s", descriptor = "B")
	private byte aByte120 = 0;

	@OriginalMember(owner = "client!pla", name = "x", descriptor = "Lclient!ge;")
	private final Packet aPacket_14 = new Packet(8);

	@OriginalMember(owner = "client!pla", name = "b", descriptor = "(B)V")
	public void method6619() {
		try {
			this.aClientStream1.shutDown();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClientStream1 = null;
		this.anInt7452 = -1;
		this.aByte120 = (byte) (int) (Math.random() * 255.0D + 1.0D);
		this.anInt7453++;
	}

	@OriginalMember(owner = "client!pla", name = "c", descriptor = "(B)V")
	private void method6620() {
		if (this.aClientStream1 == null) {
			return;
		}
		try {
			this.aPacket_13.pos = 0;
			this.aPacket_13.p1(6);
			this.aPacket_13.p3(3);
			this.aClientStream1.method5829(4, this.aPacket_13.data);
		} catch (@Pc(33) IOException local33) {
			try {
				this.aClientStream1.shutDown();
			} catch (@Pc(39) Exception local39) {
			}
			this.anInt7453++;
			this.anInt7452 = -2;
			this.aClientStream1 = null;
		}
	}

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(Z)V")
	public void shutDown() {
		if (this.aClientStream1 != null) {
			this.aClientStream1.shutDown();
		}
	}

	@OriginalMember(owner = "client!pla", name = "e", descriptor = "(I)I")
	public int method6622() {
		return this.aSecondaryLinkedList10.size() + this.aSecondaryLinkedList11.size();
	}

	@OriginalMember(owner = "client!pla", name = "d", descriptor = "(B)Z")
	public boolean method6624() {
		@Pc(14) int local14;
		if (this.aClientStream1 != null) {
			@Pc(7) long local7 = Static588.currentTimeWithDrift();
			local14 = (int) (local7 - this.aLong238);
			this.aLong238 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt7451 += local14;
			if (this.anInt7451 > 30000) {
				try {
					this.aClientStream1.shutDown();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClientStream1 = null;
			}
		}
		if (this.aClientStream1 == null) {
			return this.method6622() == 0 && this.method6632() == 0;
		}
		try {
			this.aClientStream1.method5823();
			for (@Pc(84) Js5NetRequest local84 = (Js5NetRequest) this.aSecondaryLinkedList10.head(); local84 != null; local84 = (Js5NetRequest) this.aSecondaryLinkedList10.next()) {
				this.aPacket_13.pos = 0;
				this.aPacket_13.p1(1);
				this.aPacket_13.p3((int) local84.secondaryKey);
				this.aClientStream1.method5829(4, this.aPacket_13.data);
				this.aSecondaryLinkedList11.addTail(local84);
			}
			for (@Pc(142) Js5NetRequest local142 = (Js5NetRequest) this.aSecondaryLinkedList12.head(); local142 != null; local142 = (Js5NetRequest) this.aSecondaryLinkedList12.next()) {
				this.aPacket_13.pos = 0;
				this.aPacket_13.p1(0);
				this.aPacket_13.p3((int) local142.secondaryKey);
				this.aClientStream1.method5829(4, this.aPacket_13.data);
				this.aSecondaryLinkedList13.addTail(local142);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(199) int local199 = this.aClientStream1.method5828();
				if (local199 < 0) {
					throw new IOException();
				}
				if (local199 == 0) {
					break;
				}
				this.anInt7451 = 0;
				@Pc(212) byte local212 = 0;
				if (this.aClass2_Sub2_Sub17_Sub1_2 == null) {
					local212 = 8;
				} else if (this.aClass2_Sub2_Sub17_Sub1_2.anInt8331 == 0) {
					local212 = 1;
				}
				@Pc(236) int local236;
				@Pc(260) int local260;
				@Pc(328) int local328;
				if (local212 > 0) {
					local236 = local212 - this.aPacket_14.pos;
					if (local199 < local236) {
						local236 = local199;
					}
					this.aClientStream1.method5825(local236, this.aPacket_14.pos, this.aPacket_14.data);
					if (this.aByte120 != 0) {
						for (local260 = 0; local260 < local236; local260++) {
							this.aPacket_14.data[this.aPacket_14.pos + local260] = (byte) (this.aPacket_14.data[this.aPacket_14.pos + local260] ^ this.aByte120);
						}
					}
					this.aPacket_14.pos += local236;
					if (local212 <= this.aPacket_14.pos) {
						if (this.aClass2_Sub2_Sub17_Sub1_2 == null) {
							this.aPacket_14.pos = 0;
							local260 = this.aPacket_14.g1();
							local328 = this.aPacket_14.g2();
							@Pc(333) int local333 = this.aPacket_14.g1();
							@Pc(338) int local338 = this.aPacket_14.g4();
							@Pc(342) int local342 = local333 & 0x7F;
							@Pc(354) boolean local354 = (local333 & 0x80) != 0;
							@Pc(361) long local361 = (long) (local328 + (local260 << 16));
							@Pc(371) Js5NetRequest local371;
							if (local354) {
								for (local371 = (Js5NetRequest) this.aSecondaryLinkedList13.head(); local371 != null && local371.secondaryKey != local361; local371 = (Js5NetRequest) this.aSecondaryLinkedList13.next()) {
								}
							} else {
								for (local371 = (Js5NetRequest) this.aSecondaryLinkedList11.head(); local371 != null && local371.secondaryKey != local361; local371 = (Js5NetRequest) this.aSecondaryLinkedList11.next()) {
								}
							}
							if (local371 == null) {
								throw new IOException();
							}
							this.aClass2_Sub2_Sub17_Sub1_2 = local371;
							@Pc(454) int local454 = local342 == 0 ? 5 : 9;
							this.aClass2_Sub2_Sub17_Sub1_2.aPacket_15 = new Packet(local454 + local338 + this.aClass2_Sub2_Sub17_Sub1_2.aByte129);
							this.aClass2_Sub2_Sub17_Sub1_2.aPacket_15.p1(local342);
							this.aClass2_Sub2_Sub17_Sub1_2.aPacket_15.p4(local338);
							this.aClass2_Sub2_Sub17_Sub1_2.anInt8331 = 8;
							this.aPacket_14.pos = 0;
						} else if (this.aClass2_Sub2_Sub17_Sub1_2.anInt8331 != 0) {
							throw new IOException();
						} else if (this.aPacket_14.data[0] == -1) {
							this.aPacket_14.pos = 0;
							this.aClass2_Sub2_Sub17_Sub1_2.anInt8331 = 1;
						} else {
							this.aClass2_Sub2_Sub17_Sub1_2 = null;
						}
					}
				} else {
					local236 = this.aClass2_Sub2_Sub17_Sub1_2.aPacket_15.data.length - this.aClass2_Sub2_Sub17_Sub1_2.aByte129;
					local260 = 512 - this.aClass2_Sub2_Sub17_Sub1_2.anInt8331;
					if (local260 > local236 - this.aClass2_Sub2_Sub17_Sub1_2.aPacket_15.pos) {
						local260 = local236 - this.aClass2_Sub2_Sub17_Sub1_2.aPacket_15.pos;
					}
					if (local260 > local199) {
						local260 = local199;
					}
					this.aClientStream1.method5825(local260, this.aClass2_Sub2_Sub17_Sub1_2.aPacket_15.pos, this.aClass2_Sub2_Sub17_Sub1_2.aPacket_15.data);
					if (this.aByte120 != 0) {
						for (local328 = 0; local328 < local260; local328++) {
							this.aClass2_Sub2_Sub17_Sub1_2.aPacket_15.data[this.aClass2_Sub2_Sub17_Sub1_2.aPacket_15.pos + local328] = (byte) (this.aClass2_Sub2_Sub17_Sub1_2.aPacket_15.data[this.aClass2_Sub2_Sub17_Sub1_2.aPacket_15.pos + local328] ^ this.aByte120);
						}
					}
					this.aClass2_Sub2_Sub17_Sub1_2.aPacket_15.pos += local260;
					this.aClass2_Sub2_Sub17_Sub1_2.anInt8331 += local260;
					if (local236 == this.aClass2_Sub2_Sub17_Sub1_2.aPacket_15.pos) {
						this.aClass2_Sub2_Sub17_Sub1_2.unlinkSecondary();
						this.aClass2_Sub2_Sub17_Sub1_2.incomplete = false;
						this.aClass2_Sub2_Sub17_Sub1_2 = null;
					} else if (this.aClass2_Sub2_Sub17_Sub1_2.anInt8331 == 512) {
						this.aClass2_Sub2_Sub17_Sub1_2.anInt8331 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(694) IOException local694) {
			try {
				this.aClientStream1.shutDown();
			} catch (@Pc(702) Exception local702) {
			}
			this.aClientStream1 = null;
			this.anInt7453++;
			this.anInt7452 = -2;
			return this.method6622() == 0 && this.method6632() == 0;
		}
	}

	@OriginalMember(owner = "client!pla", name = "b", descriptor = "(I)Z")
	public boolean method6625() {
		return this.method6632() >= 20;
	}

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(ZI)V")
	public void method6626(@OriginalArg(0) boolean arg0) {
		if (this.aClientStream1 == null) {
			return;
		}
		try {
			this.aPacket_13.pos = 0;
			this.aPacket_13.p1(arg0 ? 2 : 3);
			this.aPacket_13.p3(0);
			this.aClientStream1.method5829(4, this.aPacket_13.data);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClientStream1.shutDown();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClientStream1 = null;
			this.anInt7452 = -2;
			this.anInt7453++;
		}
	}

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(ZILclient!nk;)V")
	public void method6627(@OriginalArg(0) boolean arg0, @OriginalArg(2) ClientStream arg1) {
		if (this.aClientStream1 != null) {
			try {
				this.aClientStream1.shutDown();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClientStream1 = null;
		}
		this.aClientStream1 = arg1;
		this.method6620();
		this.method6626(arg0);
		this.aClass2_Sub2_Sub17_Sub1_2 = null;
		this.aPacket_14.pos = 0;
		while (true) {
			@Pc(48) Js5NetRequest local48 = (Js5NetRequest) this.aSecondaryLinkedList11.removeTail();
			if (local48 == null) {
				while (true) {
					local48 = (Js5NetRequest) this.aSecondaryLinkedList13.removeTail();
					if (local48 == null) {
						if (this.aByte120 != 0) {
							try {
								this.aPacket_13.pos = 0;
								this.aPacket_13.p1(4);
								this.aPacket_13.p1(this.aByte120);
								this.aPacket_13.p2(0);
								this.aClientStream1.method5829(4, this.aPacket_13.data);
							} catch (@Pc(117) IOException local117) {
								try {
									this.aClientStream1.shutDown();
								} catch (@Pc(123) Exception local123) {
								}
								this.anInt7453++;
								this.aClientStream1 = null;
								this.anInt7452 = -2;
							}
						}
						this.anInt7451 = 0;
						this.aLong238 = Static588.currentTimeWithDrift();
						return;
					}
					this.aSecondaryLinkedList12.addTail(local48);
				}
			}
			this.aSecondaryLinkedList10.addTail(local48);
		}
	}

	@OriginalMember(owner = "client!pla", name = "c", descriptor = "(I)V")
	public void method6628() {
		if (this.aClientStream1 == null) {
			return;
		}
		try {
			this.aPacket_13.pos = 0;
			this.aPacket_13.p1(7);
			this.aPacket_13.p3(0);
			this.aClientStream1.method5829(4, this.aPacket_13.data);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClientStream1.shutDown();
			} catch (@Pc(48) Exception local48) {
			}
			this.aClientStream1 = null;
			this.anInt7452 = -2;
			this.anInt7453++;
		}
	}

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(I)Z")
	public boolean isUrgentRequestQueueFull() {
		return this.method6622() >= 20;
	}

	@OriginalMember(owner = "client!pla", name = "d", descriptor = "(I)V")
	public void method6631() {
		if (this.aClientStream1 != null) {
			this.aClientStream1.method5826();
		}
	}

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(B)I")
	private int method6632() {
		return this.aSecondaryLinkedList12.size() + this.aSecondaryLinkedList13.size();
	}

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(IIBZB)Lclient!rja;")
	public Js5NetRequest read(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte arg3) {
		@Pc(19) long local19 = (long) ((arg0 << 16) + arg1);
		@Pc(23) Js5NetRequest local23 = new Js5NetRequest();
		local23.urgent = arg2;
		local23.aByte129 = arg3;
		local23.secondaryKey = local19;
		if (arg2) {
			if (this.method6622() >= 20) {
				throw new RuntimeException();
			}
			this.aSecondaryLinkedList10.addTail(local23);
		} else if (this.method6632() < 20) {
			this.aSecondaryLinkedList12.addTail(local23);
		} else {
			throw new RuntimeException();
		}
		return local23;
	}
}
