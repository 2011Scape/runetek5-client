import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public final class ServerProt {

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "Lclient!lga;")
	public static final ServerProt MESSAGE_GAME = new ServerProt(102, -1);

	@OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
	private final int opcode;

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "I")
	public final int size;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(II)V")
	public ServerProt(@OriginalArg(0) int opcode, @OriginalArg(1) int size) {
		this.opcode = opcode;
		this.size = size;
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)I")
	public int getOpcode() {
		return this.opcode;
	}

	@OriginalMember(owner = "client!lga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
