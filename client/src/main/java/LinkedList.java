import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sia")
public final class LinkedList {

	@OriginalMember(owner = "client!sia", name = "e", descriptor = "Lclient!ie;")
	private Linkable cursor;

	@OriginalMember(owner = "client!sia", name = "x", descriptor = "Lclient!ie;")
	public final Linkable sentinel = new Linkable();

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "()V")
	public LinkedList() {
		this.sentinel.next = this.sentinel;
		this.sentinel.prev = this.sentinel;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lclient!ie;I)V")
	public void addHead(@OriginalArg(0) Linkable node) {
		if (node.prev != null) {
			node.unlink();
		}
		node.next = this.sentinel.next;
		node.prev = this.sentinel;
		node.prev.next = node;
		node.next.prev = node;
	}

	@OriginalMember(owner = "client!sia", name = "e", descriptor = "(I)Lclient!ie;")
	public Linkable head() {
		@Pc(7) Linkable node = this.sentinel.next;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.next;
			return node;
		}
	}

	@OriginalMember(owner = "client!sia", name = "f", descriptor = "(I)V")
	public void clear() {
		while (true) {
			@Pc(7) Linkable node = this.sentinel.next;
			if (this.sentinel == node) {
				this.cursor = null;
				return;
			}
			node.unlink();
		}
	}

	@OriginalMember(owner = "client!sia", name = "c", descriptor = "(I)I")
	public int method7701() {
		@Pc(13) int local13 = 0;
		@Pc(17) Linkable local17 = this.sentinel.next;
		while (local17 != this.sentinel) {
			local17 = local17.next;
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!sia", name = "d", descriptor = "(I)Z")
	public boolean isEmpty() {
		return this.sentinel == this.sentinel.next;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lclient!ie;Lclient!sia;B)V")
	private void method7703(@OriginalArg(0) Linkable arg0, @OriginalArg(1) LinkedList arg1) {
		@Pc(7) Linkable local7 = this.sentinel.prev;
		this.sentinel.prev = arg0.prev;
		arg0.prev.next = this.sentinel;
		if (arg0 != this.sentinel) {
			arg0.prev = arg1.sentinel.prev;
			arg0.prev.next = arg0;
			local7.next = arg1.sentinel;
			arg1.sentinel.prev = local7;
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)Lclient!ie;")
	public Linkable removeHead() {
		@Pc(7) Linkable node = this.sentinel.next;
		if (node == this.sentinel) {
			return null;
		} else {
			node.unlink();
			return node;
		}
	}

	@OriginalMember(owner = "client!sia", name = "h", descriptor = "(I)Lclient!ie;")
	public Linkable next() {
		@Pc(13) Linkable node = this.cursor;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.next;
			return node;
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(ILclient!sia;)V")
	public void method7707(@OriginalArg(1) LinkedList arg0) {
		this.method7703(this.sentinel.next, arg0);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(B)Lclient!ie;")
	public Linkable tail() {
		@Pc(14) Linkable node = this.sentinel.prev;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.prev;
			return node;
		}
	}

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(B)Lclient!ie;")
	public Linkable prev() {
		@Pc(6) Linkable node = this.cursor;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.prev;
			return node;
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(BLclient!ie;)V")
	public void addTail(@OriginalArg(1) Linkable node) {
		if (node.prev != null) {
			node.unlink();
		}
		node.next = this.sentinel;
		node.prev = this.sentinel.prev;
		node.prev.next = node;
		node.next.prev = node;
	}
}
