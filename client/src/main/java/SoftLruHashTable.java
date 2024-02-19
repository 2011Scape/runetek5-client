import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dla")
public final class SoftLruHashTable {

	@OriginalMember(owner = "client!dla", name = "j", descriptor = "Lclient!jga;")
	private final SecondaryLinkedList queue;

	@OriginalMember(owner = "client!dla", name = "h", descriptor = "I")
	private int available;

	@OriginalMember(owner = "client!dla", name = "r", descriptor = "Lclient!av;")
	private final HashTable table;

	@OriginalMember(owner = "client!dla", name = "c", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!dla", name = "<init>", descriptor = "(I)V")
	public SoftLruHashTable(@OriginalArg(0) int capacity) {
		this(capacity, capacity);
	}

	@OriginalMember(owner = "client!dla", name = "<init>", descriptor = "(II)V")
	public SoftLruHashTable(@OriginalArg(0) int capacity, @OriginalArg(1) int initial) {
		this.queue = new SecondaryLinkedList();
		this.capacity = capacity;
		this.available = capacity;
		@Pc(14) int bucketCount;
		for (bucketCount = 1; capacity > bucketCount + bucketCount && bucketCount < initial; bucketCount += bucketCount) {
		}
		this.table = new HashTable(bucketCount);
	}

	@OriginalMember(owner = "client!dla", name = "c", descriptor = "(I)I")
	public int getAvailable() {
		return this.available;
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object clean() {
		@Pc(19) ReferenceNode node = (ReferenceNode) this.table.head();
		while (node != null) {
			@Pc(25) Object value = node.get();
			if (value != null) {
				return value;
			}

			@Pc(29) ReferenceNode reference = node;
			node = (ReferenceNode) this.table.next();
			reference.unlink();
			reference.unlinkSecondary();
			this.available += reference.size;
		}

		return null;
	}

	@OriginalMember(owner = "client!dla", name = "d", descriptor = "(I)I")
	public int getCapacity() {
		return this.capacity;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(II)V")
	public void clean(@OriginalArg(0) int maxAge) {
		if (ReferenceNodeFactory.SOFT_REFERENCE_NODE_FACTORY == null) {
			return;
		}

		for (@Pc(15) ReferenceNode node = (ReferenceNode) this.queue.head(); node != null; node = (ReferenceNode) this.queue.next()) {
			if (node.isSoft()) {
				if (node.get() == null) {
					node.unlink();
					node.unlinkSecondary();
					this.available += node.size;
				}
			} else if (++node.secondaryKey > (long) maxAge) {
				@Pc(42) ReferenceNode softNode = ReferenceNodeFactory.SOFT_REFERENCE_NODE_FACTORY.create(node);
				this.table.put(node.id, softNode);
				SecondaryLinkedList.insertAfter(node, softNode);
				node.unlink();
				node.unlinkSecondary();
			}
		}
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "(B)I")
	public int size() {
		@Pc(5) int size = 0;
		for (@Pc(11) ReferenceNode node = (ReferenceNode) this.queue.head(); node != null; node = (ReferenceNode) this.queue.next()) {
			if (!node.isSoft()) {
				size++;
			}
		}
		return size;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(ILclient!vw;)V")
	private void remove(@OriginalArg(1) ReferenceNode node) {
		if (node != null) {
			node.unlink();
			node.unlinkSecondary();
			this.available += node.size;
		}
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(Ljava/lang/Object;IJ)V")
	public void put(@OriginalArg(2) long key, @OriginalArg(0) Object value) {
		this.put(key, value, 1);
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(B)V")
	public void removeSoft() {
		for (@Pc(14) ReferenceNode node = (ReferenceNode) this.queue.head(); node != null; node = (ReferenceNode) this.queue.next()) {
			if (node.isSoft()) {
				node.unlink();
				node.unlinkSecondary();
				this.available += node.size;
			}
		}
	}

	@OriginalMember(owner = "client!dla", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method2152() {
		@Pc(19) ReferenceNode node = (ReferenceNode) this.table.next();
		while (node != null) {
			@Pc(25) Object value = node.get();
			if (value != null) {
				return value;
			}

			@Pc(29) ReferenceNode refNode = node;
			node = (ReferenceNode) this.table.next();
			refNode.unlink();
			refNode.unlinkSecondary();
			this.available += refNode.size;
		}

		return null;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(JLjava/lang/Object;II)V")
	public void put(@OriginalArg(0) long key, @OriginalArg(1) Object value, @OriginalArg(2) int size) {
		if (size > this.capacity) {
			throw new IllegalStateException("s>cs");
		}

		this.remove(key);
		this.available -= size;
		while (this.available < 0) {
			@Pc(32) ReferenceNode ref = (ReferenceNode) this.queue.removeTail();
			this.remove(ref);
		}

		@Pc(48) HardReferenceNode hardRef = new HardReferenceNode(value, size);
		this.table.put(key, hardRef);
		this.queue.addTail(hardRef);
		hardRef.secondaryKey = 0L;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(JI)V")
	public void remove(@OriginalArg(0) long key) {
		@Pc(15) ReferenceNode node = (ReferenceNode) this.table.get(key);
		this.remove(node);
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "(JI)Ljava/lang/Object;")
	public Object get(@OriginalArg(0) long key) {
		@Pc(12) ReferenceNode node = (ReferenceNode) this.table.get(key);
		if (node == null) {
			return null;
		}

		@Pc(26) Object value = node.get();
		if (value == null) {
			node.unlink();
			node.unlinkSecondary();
			this.available += node.size;
			return null;
		}

		if (node.isSoft()) {
			@Pc(65) HardReferenceNode hardNode = new HardReferenceNode(value, node.size);
			this.table.put(node.id, hardNode);
			this.queue.addTail(hardNode);
			hardNode.secondaryKey = 0L;
			node.unlink();
			node.unlinkSecondary();
		} else {
			this.queue.addTail(node);
			node.secondaryKey = 0L;
		}

		return value;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(Z)V")
	public void clear() {
		this.queue.clear();
		this.table.clear();
		this.available = this.capacity;
	}
}
