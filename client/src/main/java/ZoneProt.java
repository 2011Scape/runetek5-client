import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class ZoneProt {

	@OriginalMember(owner = "client!oda", name = "v", descriptor = "Lclient!pc;")
	public static final ZoneProt OPCODE_0 = new ZoneProt(0, 4);

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "Lclient!pc;")
	public static final ZoneProt OPCODE_1 = new ZoneProt(1, 8);

	@OriginalMember(owner = "client!lu", name = "I", descriptor = "Lclient!pc;")
	public static final ZoneProt OPCODE_2 = new ZoneProt(2, -1);

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "Lclient!pc;")
	public static final ZoneProt OPCODE_3 = new ZoneProt(3, 4);

	@OriginalMember(owner = "client!kga", name = "G", descriptor = "Lclient!pc;")
	public static final ZoneProt OPCODE_4 = new ZoneProt(4, 3);

	@OriginalMember(owner = "client!rq", name = "H", descriptor = "Lclient!pc;")
	public static final ZoneProt OPCODE_5 = new ZoneProt(5, 3);

	@OriginalMember(owner = "client!cg", name = "W", descriptor = "Lclient!pc;")
	public static final ZoneProt OPCODE_6 = new ZoneProt(6, 16);

	@OriginalMember(owner = "client!gia", name = "t", descriptor = "Lclient!pc;")
	public static final ZoneProt OPCODE_7 = new ZoneProt(7, 2);

	@OriginalMember(owner = "client!wea", name = "P", descriptor = "Lclient!pc;")
	public static final ZoneProt OPCODE_8 = new ZoneProt(8, 7);

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "Lclient!pc;")
	public static final ZoneProt OPCODE_9 = new ZoneProt(9, -1);

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "Lclient!pc;")
	public static final ZoneProt OPCODE_10 = new ZoneProt(10, 19);

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!pc;")
	public static final ZoneProt OPCODE_11 = new ZoneProt(11, 8);

	@OriginalMember(owner = "client!vca", name = "i", descriptor = "Lclient!pc;")
	public static final ZoneProt OPCODE_12 = new ZoneProt(12, 7);

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "Lclient!pc;")
	public static final ZoneProt OPCODE_13 = new ZoneProt(13, 7);

	@OriginalMember(owner = "client!aka", name = "j", descriptor = "Lclient!pc;")
	public static final ZoneProt OPCODE_14 = new ZoneProt(14, 5);

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(II)V")
	public ZoneProt(@OriginalArg(0) int opcode, @OriginalArg(1) int size) {
	}

	@OriginalMember(owner = "client!rka", name = "z", descriptor = "(I)[Lclient!pc;")
	public static ZoneProt[] all() {
		return new ZoneProt[] {OPCODE_0, OPCODE_1, OPCODE_2, OPCODE_3, OPCODE_4, OPCODE_5, OPCODE_6, OPCODE_7, OPCODE_8, OPCODE_9, OPCODE_10, OPCODE_11, OPCODE_12, OPCODE_13, OPCODE_14};
	}

	@OriginalMember(owner = "client!pc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
