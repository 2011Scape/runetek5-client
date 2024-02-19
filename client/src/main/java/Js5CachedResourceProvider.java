import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Js5CachedResourceProvider extends Js5ResourceProvider {

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "[B")
	private byte[] aByteArray88;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "Lclient!pj;")
	private Js5Index aJs5Index1;

	@OriginalMember(owner = "client!pm", name = "M", descriptor = "Z")
	private boolean aBoolean568;

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
	private int anInt7473 = 0;

	@OriginalMember(owner = "client!pm", name = "A", descriptor = "Lclient!av;")
	private final HashTable aHashTable36 = new HashTable(16);

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
	private int anInt7475 = 0;

	@OriginalMember(owner = "client!pm", name = "F", descriptor = "Lclient!sia;")
	private final LinkedList aLinkedList41 = new LinkedList();

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "J")
	private long aLong239 = 0L;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
	private final int anInt7465;

	@OriginalMember(owner = "client!pm", name = "E", descriptor = "Lclient!af;")
	private final Cache aCache3;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "Z")
	private boolean aBoolean567;

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "Lclient!sia;")
	private LinkedList aLinkedList42;

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "Z")
	private final boolean aBoolean569;

	@OriginalMember(owner = "client!pm", name = "K", descriptor = "Lclient!pla;")
	private final Js5NetQueue aJs5NetQueue2;

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
	private final int anInt7463;

	@OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
	private final int anInt7472;

	@OriginalMember(owner = "client!pm", name = "H", descriptor = "Lclient!iba;")
	private final Js5CacheQueue aJs5CacheQueue3;

	@OriginalMember(owner = "client!pm", name = "O", descriptor = "[B")
	private final byte[] aByteArray89;

	@OriginalMember(owner = "client!pm", name = "B", descriptor = "Lclient!af;")
	private final Cache aCache2;

	@OriginalMember(owner = "client!pm", name = "C", descriptor = "Lclient!tw;")
	private Js5Request aClass2_Sub2_Sub17_1;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(ILclient!af;Lclient!af;Lclient!pla;Lclient!iba;I[BIZ)V")
	public Js5CachedResourceProvider(@OriginalArg(0) int arg0, @OriginalArg(1) Cache arg1, @OriginalArg(2) Cache arg2, @OriginalArg(3) Js5NetQueue arg3, @OriginalArg(4) Js5CacheQueue arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt7465 = arg0;
		this.aCache3 = arg1;
		if (this.aCache3 == null) {
			this.aBoolean567 = false;
		} else {
			this.aBoolean567 = true;
			this.aLinkedList42 = new LinkedList();
		}
		this.aBoolean569 = arg8;
		this.aJs5NetQueue2 = arg3;
		this.anInt7463 = arg5;
		this.anInt7472 = arg7;
		this.aJs5CacheQueue3 = arg4;
		this.aByteArray89 = arg6;
		this.aCache2 = arg2;
		if (this.aCache2 != null) {
			this.aClass2_Sub2_Sub17_1 = this.aJs5CacheQueue3.method3825(this.aCache2, this.anInt7465);
		}
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)I")
	public int method6644() {
		if (this.fetchIndex() == null) {
			return this.aClass2_Sub2_Sub17_1 == null ? 0 : this.aClass2_Sub2_Sub17_1.getPercentageComplete();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)I")
	public int method6645() {
		return this.aJs5Index1 == null ? 0 : this.aJs5Index1.size;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
	@Override
	public void prefetchGroup(@OriginalArg(1) int arg0) {
		if (this.aCache3 == null) {
			return;
		}
		for (@Pc(23) Linkable local23 = this.aLinkedList41.head(); local23 != null; local23 = this.aLinkedList41.next()) {
			if (local23.id == (long) arg0) {
				return;
			}
		}
		@Pc(50) Linkable local50 = new Linkable();
		local50.id = (long) arg0;
		this.aLinkedList41.addTail(local50);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)I")
	public int method6647() {
		if (this.aJs5Index1 == null) {
			return 0;
		} else if (this.aBoolean567) {
			@Pc(29) Linkable local29 = this.aLinkedList42.head();
			return local29 == null ? 0 : (int) local29.id;
		} else {
			return this.aJs5Index1.size;
		}
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)V")
	public void cycle() {
		if (this.aLinkedList42 != null) {
			if (this.fetchIndex() == null) {
				return;
			}
			@Pc(33) boolean local33;
			@Pc(38) Linkable local38;
			@Pc(44) int local44;
			@Pc(147) Linkable local147;
			if (this.aBoolean567) {
				local33 = true;
				for (local38 = this.aLinkedList42.head(); local38 != null; local38 = this.aLinkedList42.next()) {
					local44 = (int) local38.id;
					if (this.aByteArray88[local44] == 0) {
						this.method6651(local44, 1);
					}
					if (this.aByteArray88[local44] == 0) {
						local33 = false;
					} else {
						local38.unlink();
					}
				}
				while (this.aJs5Index1.groupSizes.length > this.anInt7475) {
					if (this.aJs5Index1.groupSizes[this.anInt7475] == 0) {
						this.anInt7475++;
					} else {
						if (this.aJs5CacheQueue3.anInt4243 >= 250) {
							local33 = false;
							break;
						}
						if (this.aByteArray88[this.anInt7475] == 0) {
							this.method6651(this.anInt7475, 1);
						}
						if (this.aByteArray88[this.anInt7475] == 0) {
							local147 = new Linkable();
							local147.id = (long) this.anInt7475;
							local33 = false;
							this.aLinkedList42.addTail(local147);
						}
						this.anInt7475++;
					}
				}
				if (local33) {
					this.anInt7475 = 0;
					this.aBoolean567 = false;
				}
			} else if (this.aBoolean568) {
				local33 = true;
				for (local38 = this.aLinkedList42.head(); local38 != null; local38 = this.aLinkedList42.next()) {
					local44 = (int) local38.id;
					if (this.aByteArray88[local44] != 1) {
						this.method6651(local44, 2);
					}
					if (this.aByteArray88[local44] == 1) {
						local38.unlink();
					} else {
						local33 = false;
					}
				}
				while (this.aJs5Index1.groupSizes.length > this.anInt7475) {
					if (this.aJs5Index1.groupSizes[this.anInt7475] == 0) {
						this.anInt7475++;
					} else {
						if (this.aJs5NetQueue2.method6625()) {
							local33 = false;
							break;
						}
						if (this.aByteArray88[this.anInt7475] != 1) {
							this.method6651(this.anInt7475, 2);
						}
						if (this.aByteArray88[this.anInt7475] != 1) {
							local147 = new Linkable();
							local147.id = (long) this.anInt7475;
							this.aLinkedList42.addTail(local147);
							local33 = false;
						}
						this.anInt7475++;
					}
				}
				if (local33) {
					this.anInt7475 = 0;
					this.aBoolean568 = false;
				}
			} else {
				this.aLinkedList42 = null;
			}
		}
		if (!this.aBoolean569 || Static588.method7715() < this.aLong239) {
			return;
		}
		for (@Pc(366) Js5Request local366 = (Js5Request) this.aHashTable36.head(); local366 != null; local366 = (Js5Request) this.aHashTable36.next()) {
			if (!local366.incomplete) {
				if (local366.orphan) {
					if (!local366.urgent) {
						throw new RuntimeException();
					}
					local366.unlink();
				} else {
					local366.orphan = true;
				}
			}
		}
		this.aLong239 = Static588.method7715() + 1000L;
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(B)I")
	public int method6649() {
		return this.anInt7473;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] fetchGroup(@OriginalArg(0) int arg0) {
		@Pc(9) Js5Request local9 = this.method6651(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(26) byte[] local26 = local9.getData();
			local9.unlink();
			return local26;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)Lclient!tw;")
	private Js5Request method6651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) Js5Request local19 = (Js5Request) this.aHashTable36.get((long) arg0);
		if (local19 != null && arg1 == 0 && !local19.urgent && local19.incomplete) {
			local19.unlink();
			local19 = null;
		}
		if (local19 == null) {
			if (arg1 == 0) {
				if (this.aCache3 == null || this.aByteArray88[arg0] == -1) {
					if (this.aJs5NetQueue2.isUrgentRequestQueueFull()) {
						return null;
					}
					local19 = this.aJs5NetQueue2.read(this.anInt7465, arg0, true, (byte) 2);
				} else {
					local19 = this.aJs5CacheQueue3.method3825(this.aCache3, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aCache3 == null) {
					throw new RuntimeException();
				}
				local19 = this.aJs5CacheQueue3.method3830(this.aCache3, arg0);
			} else if (arg1 == 2) {
				if (this.aCache3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray88[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aJs5NetQueue2.method6625()) {
					return null;
				}
				local19 = this.aJs5NetQueue2.read(this.anInt7465, arg0, false, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aHashTable36.put((long) arg0, local19);
		}
		if (local19.incomplete) {
			return null;
		}
		@Pc(194) byte[] local194 = local19.getData();
		@Pc(224) int local224;
		@Pc(254) byte[] local254;
		@Pc(263) byte[] local263;
		@Pc(265) int local265;
		@Pc(383) Js5NetRequest local383;
		if (!(local19 instanceof Js5CacheRequest)) {
			try {
				label157: {
					if (local194 != null && local194.length > 2) {
						Static10.aCRC32_1.reset();
						Static10.aCRC32_1.update(local194, 0, local194.length - 2);
						local224 = (int) Static10.aCRC32_1.getValue();
						if (this.aJs5Index1.groupChecksums[arg0] != local224) {
							throw new RuntimeException();
						}
						if (this.aJs5Index1.groupDigests == null || this.aJs5Index1.groupDigests[arg0] == null) {
							break label157;
						}
						local254 = this.aJs5Index1.groupDigests[arg0];
						local263 = Static607.method8161(local194, local194.length - 2, 0);
						local265 = 0;
						while (true) {
							if (local265 >= 64) {
								break label157;
							}
							if (local254[local265] != local263[local265]) {
								throw new RuntimeException();
							}
							local265++;
						}
					}
					throw new RuntimeException();
				}
				this.aJs5NetQueue2.anInt7453 = 0;
				this.aJs5NetQueue2.anInt7452 = 0;
			} catch (@Pc(498) RuntimeException local498) {
				this.aJs5NetQueue2.method6619();
				local19.unlink();
				if (local19.urgent && !this.aJs5NetQueue2.isUrgentRequestQueueFull()) {
					local383 = this.aJs5NetQueue2.read(this.anInt7465, arg0, true, (byte) 2);
					this.aHashTable36.put((long) arg0, local383);
				}
				return null;
			}
			local194[local194.length - 2] = (byte) (this.aJs5Index1.groupVersions[arg0] >>> 8);
			local194[local194.length - 1] = (byte) this.aJs5Index1.groupVersions[arg0];
			if (this.aCache3 != null) {
				this.aJs5CacheQueue3.method3829(local194, arg0, this.aCache3);
				if (this.aByteArray88[arg0] != 1) {
					this.anInt7473++;
					this.aByteArray88[arg0] = 1;
				}
			}
			if (!local19.urgent) {
				local19.unlink();
			}
			return local19;
		}
		try {
			if (local194 == null || local194.length <= 2) {
				throw new RuntimeException();
			}
			Static10.aCRC32_1.reset();
			Static10.aCRC32_1.update(local194, 0, local194.length - 2);
			local224 = (int) Static10.aCRC32_1.getValue();
			if (local224 != this.aJs5Index1.groupChecksums[arg0]) {
				throw new RuntimeException();
			}
			if (this.aJs5Index1.groupDigests != null && this.aJs5Index1.groupDigests[arg0] != null) {
				local254 = this.aJs5Index1.groupDigests[arg0];
				local263 = Static607.method8161(local194, local194.length - 2, 0);
				for (local265 = 0; local265 < 64; local265++) {
					if (local263[local265] != local254[local265]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(307) int local307 = (local194[local194.length - 1] & 0xFF) + ((local194[local194.length - 2] & 0xFF) << 8);
			if (local307 != (this.aJs5Index1.groupVersions[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray88[arg0] != 1) {
				this.anInt7473++;
				this.aByteArray88[arg0] = 1;
			}
			if (!local19.urgent) {
				local19.unlink();
			}
			return local19;
		} catch (@Pc(355) Exception local355) {
			this.aByteArray88[arg0] = -1;
			local19.unlink();
			if (local19.urgent && !this.aJs5NetQueue2.isUrgentRequestQueueFull()) {
				local383 = this.aJs5NetQueue2.read(this.anInt7465, arg0, true, (byte) 2);
				this.aHashTable36.put((long) arg0, local383);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)I")
	@Override
	public int getPercentageComplete(@OriginalArg(1) int arg0) {
		@Pc(19) Js5Request local19 = (Js5Request) this.aHashTable36.get((long) arg0);
		return local19 == null ? 0 : local19.getPercentageComplete();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
	public void processPrefetchQueue() {
		if (this.aLinkedList42 == null || this.fetchIndex() == null) {
			return;
		}
		for (@Pc(21) Linkable local21 = this.aLinkedList41.head(); local21 != null; local21 = this.aLinkedList41.next()) {
			@Pc(29) int local29 = (int) local21.id;
			if (local29 < 0 || local29 >= this.aJs5Index1.capacity || this.aJs5Index1.groupSizes[local29] == 0) {
				local21.unlink();
			} else {
				if (this.aByteArray88[local29] == 0) {
					this.method6651(local29, 1);
				}
				if (this.aByteArray88[local29] == -1) {
					this.method6651(local29, 2);
				}
				if (this.aByteArray88[local29] == 1) {
					local21.unlink();
				}
			}
		}
		if (false) {
			Static498.method6650((ParticleNode_Sub2[]) null, -92, -16);
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)Lclient!pj;")
	@Override
	public Js5Index fetchIndex() {
		if (this.aJs5Index1 != null) {
			return this.aJs5Index1;
		}
		if (this.aClass2_Sub2_Sub17_1 == null) {
			if (this.aJs5NetQueue2.isUrgentRequestQueueFull()) {
				return null;
			}
			this.aClass2_Sub2_Sub17_1 = this.aJs5NetQueue2.read(255, this.anInt7465, true, (byte) 0);
		}
		if (this.aClass2_Sub2_Sub17_1.incomplete) {
			return null;
		}
		@Pc(53) byte[] local53 = this.aClass2_Sub2_Sub17_1.getData();
		if (this.aClass2_Sub2_Sub17_1 instanceof Js5CacheRequest) {
			try {
				if (local53 == null) {
					throw new RuntimeException();
				}
				this.aJs5Index1 = new Js5Index(local53, this.anInt7463, this.aByteArray89);
				if (this.anInt7472 != this.aJs5Index1.version) {
					throw new RuntimeException();
				}
			} catch (@Pc(162) RuntimeException local162) {
				this.aJs5Index1 = null;
				if (this.aJs5NetQueue2.isUrgentRequestQueueFull()) {
					this.aClass2_Sub2_Sub17_1 = null;
				} else {
					this.aClass2_Sub2_Sub17_1 = this.aJs5NetQueue2.read(255, this.anInt7465, true, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local53 == null) {
					throw new RuntimeException();
				}
				this.aJs5Index1 = new Js5Index(local53, this.anInt7463, this.aByteArray89);
			} catch (@Pc(76) RuntimeException local76) {
				this.aJs5NetQueue2.method6619();
				this.aJs5Index1 = null;
				if (this.aJs5NetQueue2.isUrgentRequestQueueFull()) {
					this.aClass2_Sub2_Sub17_1 = null;
				} else {
					this.aClass2_Sub2_Sub17_1 = this.aJs5NetQueue2.read(255, this.anInt7465, true, (byte) 0);
				}
				return null;
			}
			if (this.aCache2 != null) {
				this.aJs5CacheQueue3.method3829(local53, this.anInt7465, this.aCache2);
			}
		}
		if (this.aCache3 != null) {
			this.aByteArray88 = new byte[this.aJs5Index1.capacity];
			this.anInt7473 = 0;
		}
		this.aClass2_Sub2_Sub17_1 = null;
		return this.aJs5Index1;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)V")
	public void method6654() {
		if (this.aCache3 != null) {
			this.aBoolean568 = true;
			if (this.aLinkedList42 == null) {
				this.aLinkedList42 = new LinkedList();
			}
		}
	}
}
