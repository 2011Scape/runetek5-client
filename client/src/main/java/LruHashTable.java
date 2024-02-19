import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class LruHashTable {

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "Lclient!cm;")
	private SecondaryLinkable last = new SecondaryLinkable();

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "Lclient!jga;")
	private final SecondaryLinkedList queue = new SecondaryLinkedList();

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
	private int available;

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "Lclient!av;")
	private final HashTable table;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(I)V")
	public LruHashTable(@OriginalArg(0) int capacity) {
		this.available = capacity;
		this.capacity = capacity;
		@Pc(19) int bucketCount;
		for (bucketCount = 1; bucketCount + bucketCount < capacity; bucketCount += bucketCount) {
		}
		this.table = new HashTable(bucketCount);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLclient!cm;J)V")
	public void method8341(@OriginalArg(2) long key, @OriginalArg(1) SecondaryLinkable value) {
		if (this.available == 0) {
			@Pc(19) SecondaryLinkable first = this.queue.removeTail();
			first.unlink();
			first.unlinkSecondary();
			if (this.last == first) {
				SecondaryLinkable second = this.queue.removeTail();
				second.unlink();
				second.unlinkSecondary();
			}
		} else {
			this.available--;
		}
		this.table.put(key, value);
		this.queue.addTail(value);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(JZ)Lclient!cm;")
	public SecondaryLinkable get(@OriginalArg(0) long key) {
		@Pc(16) SecondaryLinkable value = (SecondaryLinkable) this.table.get(key);
		if (value != null) {
			this.queue.addTail(value);
		}
		return value;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IJ)V")
	public void remove(@OriginalArg(1) long key) {
		@Pc(18) SecondaryLinkable value = (SecondaryLinkable) this.table.get(key);
		if (value != null) {
			value.unlink();
			value.unlinkSecondary();
			this.available++;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	public void clear() {
		this.queue.clear();
		this.table.clear();
		this.last = new SecondaryLinkable();
		this.available = this.capacity;
	}
}
