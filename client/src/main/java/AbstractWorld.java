import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public abstract class AbstractWorld {

	@OriginalMember(owner = "client!wha", name = "m", descriptor = "I")
	public int players;

	@OriginalMember(owner = "client!wha", name = "i", descriptor = "I")
	public int flags;

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "I")
	public int country;

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(Z)Z")
	public final boolean isQuickChat() {
		return (this.flags & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "(I)Z")
	public final boolean isPvp() {
		return (this.flags & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)Z")
	public final boolean isMembers() {
		return (this.flags & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(Z)Z")
	public final boolean isLootShare() {
		return (this.flags & 0x8) != 0;
	}
}
