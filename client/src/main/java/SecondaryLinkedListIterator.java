import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class SecondaryLinkedListIterator {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "Lclient!cm;")
	private SecondaryLinkable aClass2_Sub2_48;

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "Lclient!jga;")
	private SecondaryLinkedList aSecondaryLinkedList14;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
	private SecondaryLinkedListIterator() {
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!jga;)V")
	public SecondaryLinkedListIterator(@OriginalArg(0) SecondaryLinkedList arg0) {
		this.aSecondaryLinkedList14 = arg0;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)Lclient!cm;")
	public SecondaryLinkable method6723() {
		@Pc(6) SecondaryLinkable local6 = this.aClass2_Sub2_48;
		if (local6 == this.aSecondaryLinkedList14.sentinel) {
			this.aClass2_Sub2_48 = null;
			return null;
		} else {
			this.aClass2_Sub2_48 = local6.secondaryPrev;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)Lclient!cm;")
	public SecondaryLinkable method6724() {
		@Pc(14) SecondaryLinkable local14 = this.aSecondaryLinkedList14.sentinel.secondaryPrev;
		if (this.aSecondaryLinkedList14.sentinel == local14) {
			this.aClass2_Sub2_48 = null;
			return null;
		} else {
			this.aClass2_Sub2_48 = local14.secondaryPrev;
			return local14;
		}
	}
}
