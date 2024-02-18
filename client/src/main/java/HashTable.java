import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class HashTable {

	@OriginalMember(owner = "client!av", name = "c", descriptor = "Lclient!ie;")
	private Linkable searchCursor;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "J")
	private long searchKey;

	@OriginalMember(owner = "client!av", name = "d", descriptor = "Lclient!ie;")
	private Linkable iteratorCursor;

	@OriginalMember(owner = "client!av", name = "h", descriptor = "I")
	private int iteratorBucket = 0;

	@OriginalMember(owner = "client!av", name = "q", descriptor = "I")
	public final int bucketCount;

	@OriginalMember(owner = "client!av", name = "e", descriptor = "[Lclient!ie;")
	public final Linkable[] buckets;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(I)V")
	public HashTable(@OriginalArg(0) int capacity) {
		this.bucketCount = capacity;
		this.buckets = new Linkable[capacity];
		for (@Pc(13) int i = 0; i < capacity; i++) {
			@Pc(23) Linkable node = this.buckets[i] = new Linkable();
			node.next = node;
			node.prev = node;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(JLclient!ie;I)V")
	public void put(@OriginalArg(0) long key, @OriginalArg(1) Linkable node) {
		if (node.prev != null) {
			node.unlink();
		}
		@Pc(28) Linkable sentinel = this.buckets[(int) (key & (long) (this.bucketCount - 1))];
		node.next = sentinel;
		node.prev = sentinel.prev;
		node.prev.next = node;
		node.next.prev = node;
		node.id = key;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(Z)Lclient!ie;")
	public Linkable head() {
		this.iteratorBucket = 0;
		return this.next();
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(Z)V")
	public void clear() {
		for (@Pc(6) int i = 0; i < this.bucketCount; i++) {
			@Pc(12) Linkable sentinel = this.buckets[i];
			while (true) {
				@Pc(15) Linkable node = sentinel.next;
				if (node == sentinel) {
					break;
				}
				node.unlink();
			}
		}
		this.searchCursor = null;
		this.iteratorCursor = null;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IJ)Lclient!ie;")
	public Linkable get(@OriginalArg(1) long key) {
		this.searchKey = key;
		@Pc(25) Linkable sentinel = this.buckets[(int) (key & (long) (this.bucketCount - 1))];
		for (this.searchCursor = sentinel.next; this.searchCursor != sentinel; this.searchCursor = this.searchCursor.next) {
			if (key == this.searchCursor.id) {
				@Pc(43) Linkable node = this.searchCursor;
				this.searchCursor = this.searchCursor.next;
				return node;
			}
		}
		this.searchCursor = null;
		return null;
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(B)I")
	public int size() {
		@Pc(5) int size = 0;
		for (@Pc(13) int i = 0; i < this.bucketCount; i++) {
			@Pc(19) Linkable sentinel = this.buckets[i];
			@Pc(22) Linkable node = sentinel.next;
			while (node != sentinel) {
				node = node.next;
				size++;
			}
		}
		return size;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)Lclient!ie;")
	public Linkable next() {
		@Pc(32) Linkable node;
		if (this.iteratorBucket > 0 && this.iteratorCursor != this.buckets[this.iteratorBucket - 1]) {
			node = this.iteratorCursor;
			this.iteratorCursor = node.next;
			return node;
		}
		while (this.bucketCount > this.iteratorBucket) {
			node = this.buckets[this.iteratorBucket++].next;
			if (this.buckets[this.iteratorBucket - 1] != node) {
				this.iteratorCursor = node.next;
				return node;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)I")
	public int getBucketCount() {
		return this.bucketCount;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B[Lclient!ie;)I")
	public int toArray(@OriginalArg(1) Linkable[] array) {
		@Pc(5) int size = 0;
		for (@Pc(16) int i = 0; i < this.bucketCount; i++) {
			@Pc(22) Linkable sentinel = this.buckets[i];
			for (@Pc(25) Linkable node = sentinel.next; node != sentinel; node = node.next) {
				array[size++] = node;
			}
		}
		return size;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)Lclient!ie;")
	public Linkable nextWithKey() {
		if (this.searchCursor == null) {
			return null;
		}
		@Pc(28) Linkable sentinel = this.buckets[(int) ((long) (this.bucketCount - 1) & this.searchKey)];
		while (this.searchCursor != sentinel) {
			if (this.searchCursor.id == this.searchKey) {
				@Pc(43) Linkable node = this.searchCursor;
				this.searchCursor = this.searchCursor.next;
				return node;
			}
			this.searchCursor = this.searchCursor.next;
		}
		this.searchCursor = null;
		return null;
	}
}
