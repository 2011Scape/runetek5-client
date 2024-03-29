import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public final class ClientProt {

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "Lclient!ss;")
	public static final ClientProt OPLOC1 = new ClientProt(11, 7);

	@OriginalMember(owner = "client!fka", name = "j", descriptor = "Lclient!ss;")
	public static final ClientProt OPLOC2 = new ClientProt(2, 7);

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "Lclient!ss;")
	public static final ClientProt OPLOC3 = new ClientProt(76, 7);

	@OriginalMember(owner = "client!fn", name = "s", descriptor = "Lclient!ss;")
	public static final ClientProt OPLOC4 = new ClientProt(0, 7);

	@OriginalMember(owner = "client!hfa", name = "v", descriptor = "Lclient!ss;")
	public static final ClientProt OPLOC5 = new ClientProt(69, 7);

	@OriginalMember(owner = "client!kp", name = "A", descriptor = "Lclient!ss;")
	public static final ClientProt OPLOC6 = new ClientProt(47, 7);

	@OriginalMember(owner = "client!dia", name = "o", descriptor = "Lclient!ss;")
	public static final ClientProt OPCODE_84 = new ClientProt(84, 6);
	@OriginalMember(owner = "client!ik", name = "J", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt55 = new ClientProt(49, 3);
	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt67 = new ClientProt(23, 1);
	@OriginalMember(owner = "client!nea", name = "d", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt78 = new ClientProt(28, 3);
	@OriginalMember(owner = "client!wk", name = "b", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt125 = new ClientProt(25, 8);
	@OriginalMember(owner = "client!nh", name = "l", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt80 = new ClientProt(41, -1);
	@OriginalMember(owner = "client!mn", name = "i", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt73 = new ClientProt(55, 7);
	@OriginalMember(owner = "client!oia", name = "y", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt87 = new ClientProt(70, -1);
	@OriginalMember(owner = "client!hk", name = "o", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt53 = new ClientProt(1, -1);

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
	private final int opcode;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
	public final int size;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(II)V")
	public ClientProt(@OriginalArg(0) int opcode, @OriginalArg(1) int size) {
		this.opcode = opcode;
		this.size = size;
	}

	@OriginalMember(owner = "client!ss", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)I")
	public int getOpcode() {
		return this.opcode;
	}
}
