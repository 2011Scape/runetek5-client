import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eha")
public final class IntHashTable {

	@OriginalMember(owner = "client!eha", name = "b", descriptor = "[I")
	private final int[] buckets;

	@OriginalMember(owner = "client!eha", name = "<init>", descriptor = "([I)V")
	public IntHashTable(@OriginalArg(0) int[] keys) {
		@Pc(5) int bucketCount;
		for (bucketCount = 1; bucketCount <= keys.length + (keys.length >> 1); bucketCount <<= 0x1) {
		}
		this.buckets = new int[bucketCount + bucketCount];
		for (@Pc(34) int i = 0; i < bucketCount + bucketCount; i++) {
			this.buckets[i] = -1;
		}
		@Pc(52) int value = 0;
		while (value < keys.length) {
			@Pc(64) int hash;
			for (hash = bucketCount - 1 & keys[value]; this.buckets[hash + hash + 1] != -1; hash = bucketCount - 1 & hash - -1) {
			}
			this.buckets[hash + hash] = keys[value];
			this.buckets[hash + hash + 1] = value++;
		}
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(II)I")
	public int get(@OriginalArg(1) int key) {
		@Pc(11) int mask = (this.buckets.length >> 1) - 1;
		@Pc(15) int hash = mask & key;
		while (true) {
			@Pc(25) int value = this.buckets[hash + hash + 1];
			if (value == -1) {
				return -1;
			}
			if (key == this.buckets[hash + hash]) {
				return value;
			}
			hash = mask & hash + 1;
		}
	}
}
