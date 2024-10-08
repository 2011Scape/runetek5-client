import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Linkable_Sub6_Sub5 extends PcmStream {

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Z")
	private boolean aBoolean794;

	@OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
	private int anInt10536;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "Z")
	private boolean aBoolean795;

	@OriginalMember(owner = "client!wc", name = "M", descriptor = "Lclient!sia;")
	private final LinkedList aLinkedList80 = new LinkedList();

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
	private int anInt10535 = 0;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	private int anInt10537 = 256;

	@OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
	private int anInt10534 = 256;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
	private final int anInt10521;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V")
	public Linkable_Sub6_Sub5(@OriginalArg(0) int arg0) {
		this.anInt10521 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)D")
	public synchronized double method9137(@OriginalArg(0) boolean arg0) {
		if (this.anInt10535 < 1) {
			return -1.0D;
		}
		@Pc(16) SecondaryLinkable_Sub8 local16 = (SecondaryLinkable_Sub8) this.aLinkedList80.head();
		if (local16 == null) {
			return -1.0D;
		} else {
			if (arg0) {
				this.method9130(87);
			}
			return local16.aDouble10 - (double) ((float) local16.aShortArrayArray3[0].length / (float) Static686.sampleRate);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "()Lclient!dea;")
	@Override
	public PcmStream method9135() {
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)I")
	public synchronized int method9140() {
		return this.anInt10535;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V")
	public synchronized void method9141() {
		this.aBoolean795 = true;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method9130(@OriginalArg(0) int arg0) {
		if (this.aBoolean794) {
			return;
		}
		while (true) {
			@Pc(14) SecondaryLinkable_Sub8 local14 = this.method9145();
			if (local14 == null) {
				if (this.aBoolean795) {
					this.unlink();
					Static341.aLruHashTable1.clear();
				}
				return;
			}
			if (local14.aShortArrayArray3[0].length - this.anInt10536 > arg0) {
				this.anInt10536 += arg0;
				return;
			}
			arg0 -= local14.aShortArrayArray3[0].length - this.anInt10536;
			this.method9144();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IDI)Lclient!dk;")
	public SecondaryLinkable_Sub8 method9142(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(11) long local11 = (long) (arg0 | this.anInt10521 << 0);
		@Pc(17) SecondaryLinkable_Sub8 local17 = (SecondaryLinkable_Sub8) Static341.aLruHashTable1.get(local11);
		if (local17 == null) {
			local17 = new SecondaryLinkable_Sub8(new short[this.anInt10521][arg0], arg1);
		} else {
			local17.aDouble10 = arg1;
			Static341.aLruHashTable1.remove(local11);
		}
		return local17;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!dk;B)V")
	public synchronized void method9143(@OriginalArg(0) SecondaryLinkable_Sub8 arg0) {
		while (this.anInt10535 >= 100) {
			this.aLinkedList80.removeHead();
			this.anInt10535--;
		}
		this.aLinkedList80.addTail(arg0);
		if (-73 != -73) {
			this.method9137(true);
		}
		this.anInt10535++;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
	private synchronized void method9144() {
		@Pc(7) SecondaryLinkable_Sub8 local7 = this.method9145();
		if (local7 != null) {
			local7.unlink();
			this.anInt10535--;
			this.anInt10536 = 0;
			Static341.aLruHashTable1.method8341(local7.method2133(), local7);
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "()I")
	@Override
	public int method9132() {
		return 1;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "()Lclient!dea;")
	@Override
	public PcmStream method9133() {
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)Lclient!dk;")
	private synchronized SecondaryLinkable_Sub8 method9145() {
		return (SecondaryLinkable_Sub8) this.aLinkedList80.head();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)V")
	public synchronized void method9146(@OriginalArg(1) boolean arg0) {
		this.aBoolean794 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)V")
	public void method9147(@OriginalArg(0) int arg0) {
		this.anInt10537 = arg0;
		this.anInt10534 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method9131(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean794) {
			return;
		}
		if (this.method9145() != null) {
			@Pc(32) int local32 = arg2 + arg1;
			if (Static316.stereo) {
				local32 <<= 0x1;
			}
			@Pc(42) byte local42 = 0;
			if (this.anInt10521 == 2) {
				local42 = 1;
			}
			while (arg1 < local32) {
				@Pc(56) SecondaryLinkable_Sub8 local56 = this.method9145();
				if (local56 == null) {
					return;
				}
				@Pc(62) short[][] local62 = local56.aShortArrayArray3;
				while (local32 > arg1 && this.anInt10536 < local62[0].length) {
					if (Static316.stereo) {
						arg0[arg1++] = local62[0][this.anInt10536] * this.anInt10534;
						arg0[arg1++] = this.anInt10537 * local62[local42][this.anInt10536];
					} else {
						@Pc(70) int local70 = arg1++;
						arg0[local70] += this.anInt10537 * local62[local42][this.anInt10536] + local62[0][this.anInt10536] * this.anInt10534;
					}
					this.anInt10536++;
				}
				if (this.anInt10536 >= local62[0].length) {
					this.method9144();
				}
			}
		} else if (this.aBoolean795) {
			this.unlink();
			Static341.aLruHashTable1.clear();
		}
	}
}
