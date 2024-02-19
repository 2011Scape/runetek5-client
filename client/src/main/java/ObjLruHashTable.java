import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aka")
public final class ObjLruHashTable {

	@OriginalMember(owner = "client!aka", name = "c", descriptor = "Lclient!jga;")
	private final SecondaryLinkedList queue = new SecondaryLinkedList();

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!aka", name = "i", descriptor = "I")
	private int available;

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "Lclient!av;")
	private final HashTable table;

	@OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(I)V")
	public ObjLruHashTable(@OriginalArg(0) int capacity) {
		this.capacity = capacity;
		this.available = capacity;
		@Pc(16) int bucketCount;
		for (bucketCount = 1; capacity > bucketCount + bucketCount; bucketCount += bucketCount) {
		}
		this.table = new HashTable(bucketCount);
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ILclient!uq;)V")
	private void remove(@OriginalArg(1) Interface24 search) {
		@Pc(9) long key = search.getKey();
		for (@Pc(22) ObjReferenceNode node = (ObjReferenceNode) this.table.get(key); node != null; node = (ObjReferenceNode) this.table.nextWithKey()) {
			if (node.anInterface24_3.method7432(search)) {
				this.remove(node);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(Z)V")
	public void clear() {
		this.queue.clear();
		this.table.clear();
		this.available = this.capacity;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(B)V")
	public void removeSoft() {
		for (@Pc(5) ObjReferenceNode node = (ObjReferenceNode) this.queue.head(); node != null; node = (ObjReferenceNode) this.queue.next()) {
			if (node.isSoft()) {
				node.unlink();
				node.unlinkSecondary();
				this.available += node.size;
			}
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ZLclient!pv;)V")
	private void remove(@OriginalArg(1) ObjReferenceNode node) {
		if (node != null) {
			node.unlink();
			node.unlinkSecondary();
			this.available += node.size;
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ZI)V")
	public void clean(int maxAge) {
		if (ObjReferenceNodeFactory.OBJ_REFERENCE_NODE_FACTORY == null) {
			return;
		}

		for (@Pc(11) ObjReferenceNode node = (ObjReferenceNode) this.queue.head(); node != null; node = (ObjReferenceNode) this.queue.next()) {
			if (node.isSoft()) {
				if (node.get() == null) {
					node.unlink();
					node.unlinkSecondary();
					this.available += node.size;
				}
			} else if (++node.secondaryKey > (long) maxAge) {
				@Pc(38) ObjReferenceNode objNode = ObjReferenceNodeFactory.OBJ_REFERENCE_NODE_FACTORY.method593(node);
				this.table.put(node.id, objNode);
				SecondaryLinkedList.insertAfter(node, objNode);
				node.unlink();
				node.unlinkSecondary();
			}
		}
	}

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "(I)I")
	public int getCapacity() {
		return this.capacity;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(I)I")
	public int getAvailable() {
		return this.available;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ZILjava/lang/Object;Lclient!uq;)V")
	private void put(@OriginalArg(3) Interface24 search, @OriginalArg(2) Object value, int size) {
		if (this.capacity < 1) {
			throw new IllegalStateException("s>cs");
		}

		this.remove(search);
		this.available--;
		while (this.available < 0) {
			@Pc(42) ObjReferenceNode ref = (ObjReferenceNode) this.queue.removeTail();
			this.remove(ref);
		}

		@Pc(59) ObjectNode node = new ObjectNode(search, value, size);
		this.table.put(search.getKey(), node);
		this.queue.addTail(node);
		node.secondaryKey = 0L;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(Lclient!uq;B)Ljava/lang/Object;")
	public Object get(@OriginalArg(0) Interface24 search) {
		@Pc(18) long local18 = search.getKey();
		for (@Pc(25) ObjReferenceNode local25 = (ObjReferenceNode) this.table.get(local18); local25 != null; local25 = (ObjReferenceNode) this.table.nextWithKey()) {
            if (!local25.anInterface24_3.method7432(search)) {
                continue;
            }

            @Pc(39) Object local39 = local25.get();
            if (local39 == null) {
                local25.unlink();
                local25.unlinkSecondary();
                this.available += local25.size;
				continue;
            }

			if (local25.isSoft()) {
				@Pc(84) ObjectNode local84 = new ObjectNode(search, local39, local25.size);
				this.table.put(local25.id, local84);
				this.queue.addTail(local84);
				local84.secondaryKey = 0L;
				local25.unlink();
				local25.unlinkSecondary();
			} else {
				this.queue.addTail(local25);
				local25.secondaryKey = 0L;
			}

			return local39;
        }

		return null;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(Ljava/lang/Object;ILclient!uq;)V")
	public void put(@OriginalArg(2) Interface24 search, @OriginalArg(0) Object value) {
		this.put(search, value, 1);
	}
}
