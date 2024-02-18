import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class SecondaryLinkable extends Linkable {

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "Lclient!cm;")
	public SecondaryLinkable secondaryPrev;

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "Lclient!cm;")
	public SecondaryLinkable secondaryNext;

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "J")
	public long secondaryKey;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
	public final void unlinkSecondary() {
		if (this.secondaryNext != null) {
			this.secondaryNext.secondaryPrev = this.secondaryPrev;
			this.secondaryPrev.secondaryNext = this.secondaryNext;
			this.secondaryPrev = null;
			this.secondaryNext = null;
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Z")
	public final boolean isSecondaryLinked() {
		return this.secondaryNext != null;
	}
}
