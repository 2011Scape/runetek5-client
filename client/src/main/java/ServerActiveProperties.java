import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public final class ServerActiveProperties extends Linkable {

	@OriginalMember(owner = "client!cu", name = "T", descriptor = "Lclient!ofa;")
	public static final ServerActiveProperties DEFAULT_SERVER_ACTIVE_PROPERTIES = new ServerActiveProperties(0, -1);
	@OriginalMember(owner = "client!ofa", name = "r", descriptor = "I")
	public final int targetParam;

	@OriginalMember(owner = "client!ofa", name = "q", descriptor = "I")
	public final int events;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(II)V")
	public ServerActiveProperties(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.targetParam = arg1;
		this.events = arg0;
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(I)I")
	public int getTargetMask() {
		return Static622.getTargetMask(this.events);
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(B)Z")
	public boolean isUseTarget() {
		return (this.events >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ofa", name = "g", descriptor = "(I)I")
	public int getDragDepth() {
		return this.events >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "(I)Z")
	public boolean isResumePauseButtonEnabled() {
		return (this.events & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)Z")
	public boolean isDragTarget() {
		return (this.events >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BI)Z")
	public boolean isButtonEnabled(@OriginalArg(1) int button) {
		return (this.events >> button + 1 & 0x1) != 0;
	}
}
