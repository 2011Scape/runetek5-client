import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class Linkable {

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "J")
	public long id;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "Lclient!ie;")
	public Linkable prev;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Lclient!ie;")
	public Linkable next;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public final void unlink() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.next = null;
			this.prev = null;
		}
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)Z")
	public final boolean isLinked() {
		return this.prev != null;
	}
}
