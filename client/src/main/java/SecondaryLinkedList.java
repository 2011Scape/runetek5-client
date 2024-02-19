import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class SecondaryLinkedList {

	@OriginalMember(owner = "client!jga", name = "f", descriptor = "Lclient!cm;")
	private SecondaryLinkable cursor;

	@OriginalMember(owner = "client!jga", name = "h", descriptor = "Lclient!cm;")
	public final SecondaryLinkable sentinel = new SecondaryLinkable();

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "()V")
	public SecondaryLinkedList() {
		this.sentinel.secondaryPrev = this.sentinel;
		this.sentinel.secondaryNext = this.sentinel;
	}

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILclient!cm;Lclient!cm;)V")
    public static void insertAfter(@OriginalArg(1) SecondaryLinkable arg0, @OriginalArg(2) SecondaryLinkable arg1) {
        if (arg1.secondaryNext != null) {
            arg1.unlinkSecondary();
        }
        arg1.secondaryPrev = arg0.secondaryPrev;
        arg1.secondaryNext = arg0;
        arg1.secondaryNext.secondaryPrev = arg1;
        arg1.secondaryPrev.secondaryNext = arg1;
    }

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)Lclient!cm;")
	public SecondaryLinkable removeTail() {
		@Pc(7) SecondaryLinkable node = this.sentinel.secondaryPrev;
		if (this.sentinel == node) {
			return null;
		} else {
			node.unlinkSecondary();
			return node;
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZLclient!cm;)V")
	public void addTail(@OriginalArg(1) SecondaryLinkable node) {
		if (node.secondaryNext != null) {
			node.unlinkSecondary();
		}
		node.secondaryPrev = this.sentinel;
		node.secondaryNext = this.sentinel.secondaryNext;
		node.secondaryNext.secondaryPrev = node;
		node.secondaryPrev.secondaryNext = node;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)I")
	public int size() {
		@Pc(5) int size = 0;
		@Pc(17) SecondaryLinkable node = this.sentinel.secondaryPrev;
		while (this.sentinel != node) {
			node = node.secondaryPrev;
			size++;
		}
		return size;
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)Lclient!cm;")
	public SecondaryLinkable next() {
		@Pc(11) SecondaryLinkable node = this.cursor;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.secondaryPrev;
			return node;
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z)V")
	public void clear() {
		while (true) {
			@Pc(3) SecondaryLinkable node = this.sentinel.secondaryPrev;
			if (node == this.sentinel) {
				this.cursor = null;
				return;
			}
			node.unlinkSecondary();
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)Lclient!cm;")
	public SecondaryLinkable head() {
		@Pc(18) SecondaryLinkable node = this.sentinel.secondaryPrev;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.secondaryPrev;
			return node;
		}
	}
}
