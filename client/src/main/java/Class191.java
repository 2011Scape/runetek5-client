import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class191 {

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Lclient!sia;")
	private LinkedList aLinkedList27;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "Lclient!ie;")
	private Linkable aLinkable_149;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class191() {
	}

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!sia;)V")
	public Class191(@OriginalArg(0) LinkedList arg0) {
		this.aLinkedList27 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Lclient!ie;")
	public Linkable method4342() {
		@Pc(12) Linkable local12 = this.aLinkable_149;
		if (this.aLinkedList27.sentinel == local12) {
			this.aLinkable_149 = null;
			return null;
		} else {
			this.aLinkable_149 = local12.next;
			return local12;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Lclient!ie;")
	public Linkable method4343() {
		@Pc(8) Linkable local8 = this.aLinkedList27.sentinel.next;
		if (this.aLinkedList27.sentinel == local8) {
			this.aLinkable_149 = null;
			return null;
		} else {
			this.aLinkable_149 = local8.next;
			return local8;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!sia;I)V")
	public void method4344(@OriginalArg(0) LinkedList arg0) {
		this.aLinkedList27 = arg0;
	}
}
