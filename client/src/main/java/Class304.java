import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class304 implements VarDomain {

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "Lclient!av;")
	private HashTable aHashTable39 = new HashTable(128);

	@OriginalMember(owner = "client!qga", name = "k", descriptor = "[I")
	private final int[] anIntArray622 = new int[Static36.aVarPlayerTypeList1.anInt6462];

	@OriginalMember(owner = "client!qga", name = "j", descriptor = "[I")
	public final int[] anIntArray621 = new int[Static36.aVarPlayerTypeList1.anInt6462];

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(III)V")
	public void method6866(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray621[arg0] = arg1;
		@Pc(24) LongNode local24 = (LongNode) this.aHashTable39.get((long) arg0);
		if (local24 == null) {
			local24 = new LongNode(Static588.method7715() + 500L);
			this.aHashTable39.put((long) arg0, local24);
		} else {
			local24.value = Static588.method7715() + 500L;
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IB)I")
	@Override
	public int method6864(@OriginalArg(0) int arg0) {
		@Pc(8) VarBitType local8 = Static529.aVarBitTypeList1.method3426(arg0);
		@Pc(11) int local11 = local8.anInt2501;
		@Pc(22) int local22 = local8.anInt2497;
		@Pc(25) int local25 = local8.anInt2499;
		@Pc(32) int local32 = Js5CacheQueue.anIntArray325[local25 - local22];
		return this.anIntArray621[local11] >> local22 & local32;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
	public void method6867() {
		for (@Pc(5) int local5 = 0; local5 < Static36.aVarPlayerTypeList1.anInt6462; local5++) {
			@Pc(11) VarPlayerType local11 = Static36.aVarPlayerTypeList1.method5782(local5);
			if (local11 != null && local11.anInt8301 == 0) {
				this.anIntArray622[local5] = 0;
				this.anIntArray621[local5] = 0;
			}
		}
		this.aHashTable39 = new HashTable(128);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(BII)V")
	public void method6868(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) VarBitType local13 = Static529.aVarBitTypeList1.method3426(arg1);
		@Pc(16) int local16 = local13.anInt2501;
		@Pc(19) int local19 = local13.anInt2497;
		@Pc(22) int local22 = local13.anInt2499;
		@Pc(29) int local29 = Js5CacheQueue.anIntArray325[local22 - local19];
		if (arg0 < 0 || local29 < arg0) {
			arg0 = 0;
		}
		local29 <<= local19;
		this.method6866(local16, ~local29 & this.anIntArray621[local16] | local29 & arg0 << local19);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(II)I")
	@Override
	public int method6865(@OriginalArg(0) int arg0) {
		return this.anIntArray621[arg0];
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(III)V")
	public void method6871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) VarBitType local8 = Static529.aVarBitTypeList1.method3426(arg1);
		@Pc(11) int local11 = local8.anInt2501;
		@Pc(14) int local14 = local8.anInt2497;
		@Pc(17) int local17 = local8.anInt2499;
		@Pc(31) int local31 = Js5CacheQueue.anIntArray325[local17 - local14];
		if (arg0 < 0 || arg0 > local31) {
			arg0 = 0;
		}
		local31 <<= local14;
		this.method6873(local11, arg0 << local14 & local31 | this.anIntArray622[local11] & ~local31);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IZ)I")
	public int method6872(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static588.method7715();
		for (@Pc(23) LongNode local23 = arg0 ? (LongNode) this.aHashTable39.head() : (LongNode) this.aHashTable39.next(); local23 != null; local23 = (LongNode) this.aHashTable39.next()) {
			if ((local23.value & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local23.value & 0x4000000000000000L) != 0L) {
					@Pc(55) int local55 = (int) local23.id;
					this.anIntArray621[local55] = this.anIntArray622[local55];
					local23.unlink();
					return local55;
				}
				local23.unlink();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(BII)V")
	public void method6873(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray622[arg0] = arg1;
		@Pc(24) LongNode local24 = (LongNode) this.aHashTable39.get((long) arg0);
		if (local24 == null) {
			local24 = new LongNode(4611686018427387905L);
			this.aHashTable39.put((long) arg0, local24);
		} else if (local24.value != 4611686018427387905L) {
			local24.value = Static588.method7715() + 500L | 0x4000000000000000L;
		}
	}
}
