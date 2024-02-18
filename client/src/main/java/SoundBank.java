import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class SoundBank {

	@OriginalMember(owner = "client!fca", name = "k", descriptor = "Lclient!av;")
	private final HashTable aHashTable15 = new HashTable(256);

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "Lclient!av;")
	private final HashTable aHashTable16 = new HashTable(256);

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "Lclient!sb;")
	private final Js5 aJs531;

	@OriginalMember(owner = "client!fca", name = "i", descriptor = "Lclient!sb;")
	private final Js5 aJs532;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!sb;Lclient!sb;)V")
	public SoundBank(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		this.aJs531 = arg1;
		this.aJs532 = arg0;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(III[I)Lclient!sq;")
	private PcmSound method2612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 >>> 12 | (arg1 & 0x10000FFF) << 4);
		@Pc(27) int local27 = local15 | arg1 << 16;
		@Pc(30) long local30 = (long) local27;
		@Pc(37) PcmSound local37 = (PcmSound) this.aHashTable16.get(local30);
		if (local37 != null) {
			return local37;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(62) SynthSound local62 = Static729.method2245(this.aJs532, arg1, arg0);
			if (local62 == null) {
				return null;
			}
			local37 = local62.method2247();
			this.aHashTable16.put(local30, local37);
			if (arg2 != null) {
				arg2[0] -= local37.aByteArray98.length;
			}
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "([IIIB)Lclient!sq;")
	private PcmSound method2613(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | (arg1 & 0xB0000FFF) << 4) ^ arg2;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) PcmSound local33 = (PcmSound) this.aHashTable16.get(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(59) VorbisSound local59 = (VorbisSound) this.aHashTable15.get(local26);
			if (local59 == null) {
				local59 = Static650.method8506(this.aJs531, arg1, arg2);
				if (local59 == null) {
					return null;
				}
				this.aHashTable15.put(local26, local59);
			}
			local33 = local59.method8502(arg0);
			if (local33 == null) {
				return null;
			} else {
				local59.unlink();
				this.aHashTable16.put(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Z[II)Lclient!sq;")
	public PcmSound method2614(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aJs532.method7597() == 1) {
			return this.method2612(arg1, 0, arg0);
		} else if (this.aJs532.method7608(arg1) == 1) {
			return this.method2612(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "([IBI)Lclient!sq;")
	public PcmSound method2615(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aJs531.method7597() == 1) {
			return this.method2613(arg0, 0, arg1);
		} else if (this.aJs531.method7608(arg1) == 1) {
			return this.method2613(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
