import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public final class ServerProt {

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "Lclient!lga;")
	public static final ServerProt MESSAGE_GAME = new ServerProt(102, -1);
	@OriginalMember(owner = "client!wc", name = "D", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_0 = new ServerProt(0, 6);
	@OriginalMember(owner = "client!ik", name = "u", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt113 = new ServerProt(1, -1);
	@OriginalMember(owner = "client!le", name = "a", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt149 = new ServerProt(2, 6);
	@OriginalMember(owner = "client!es", name = "h", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt60 = new ServerProt(3, 12);
	@OriginalMember(owner = "client!lm", name = "l", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt152 = new ServerProt(4, 0);
	@OriginalMember(owner = "client!aka", name = "g", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt7 = new ServerProt(48, 5);
	@OriginalMember(owner = "client!pd", name = "A", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt178 = new ServerProt(17, 0);
	@OriginalMember(owner = "client!rq", name = "D", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt76 = new ServerProt(100, 1);
	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt119 = new ServerProt(19, 8);
	@OriginalMember(owner = "client!oaa", name = "n", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt170 = new ServerProt(87, -2);
	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt36 = new ServerProt(28, 4);
	@OriginalMember(owner = "client!gha", name = "w", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt83 = new ServerProt(113, 3);
	@OriginalMember(owner = "client!ws", name = "J", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt259 = new ServerProt(122, 10);
	@OriginalMember(owner = "client!kr", name = "m", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt144 = new ServerProt(92, 4);
	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt14 = new ServerProt(26, 3);
	@OriginalMember(owner = "client!oia", name = "d", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt175 = new ServerProt(110, -1);
	@OriginalMember(owner = "client!he", name = "g", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt104 = new ServerProt(115, 8);
	@OriginalMember(owner = "client!pt", name = "p", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt188 = new ServerProt(16, 3);

	@OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
	private final int opcode;

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "I")
	public final int size;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(II)V")
	public ServerProt(@OriginalArg(0) int opcode, @OriginalArg(1) int size) {
		this.opcode = opcode;
		this.size = size;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)[Lclient!lga;")
	public static ServerProt[] method7677() {
		return new ServerProt[] { OPCODE_0, ServerProt113, ServerProt149, ServerProt60, ServerProt152, Static121.ServerProt49, Static269.ServerProt111, Static384.ServerProt156, Static489.ServerProt185, Static303.ServerProt126, Static193.ServerProt74, Static137.ServerProt56, Static451.aServerProt_171, Static671.ServerProt246, Static176.ServerProt187, Static40.ServerProt19, ServerProt188, ServerProt178, Static655.ServerProt237, ServerProt119, Static441.ServerProt168, Static641.ServerProt234, Static161.ServerProt62, Static207.ServerProt127, Static137.ServerProt57, Static590.ServerProt217, ServerProt14, Static314.ServerProt132, ServerProt36, Static670.ServerProt245, Static353.ServerProt233, Static606.ServerProt221, Static286.ServerProt117, Static109.ServerProt45, Static231.ServerProt102, Static207.ServerProt128, Static331.ServerProt138, Static100.ServerProt43, Static232.ServerProt103, Static40.ServerProt17, Static616.ServerProt223, Static166.ServerProt63, Static444.ServerProt169, Static651.ServerProt235, Static452.ServerProt173, Static464.ServerProt176, Static157.ServerProt61, Static347.ServerProt146, ServerProt7, Static479.ServerProt177, Static383.ServerProt155, Static12.ServerProt147, Static25.ServerProt11, Static390.ServerProt158, Static51.ServerProt30, Static215.ServerProt86, Static309.ServerProt130, Static225.ServerProt90, Static416.ServerProt165, Static432.ServerProt10, Static125.ServerProt52, Static557.ServerProt205, Static722.ServerProt260, Static679.ServerProt247, Static14.ServerProt5, Static284.ServerProt116, Static297.ServerProt125, Static608.ServerProt222, Static619.ServerProt34, Static91.ServerProt236, Static36.ServerProt15, Static334.ServerProt140, Static250.ServerProt105, Static586.ServerProt215, Static40.ServerProt16, Static125.ServerProt53, Static85.ServerProt257, Static468.ServerProt212, Static526.ServerProt194, Static229.ServerProt101, Static526.ServerProt195, Static618.ServerProt227, Static587.ServerProt216, Static211.ServerProt143, Static205.ServerProt80, Static320.ServerProt135, Static283.ServerProt115, ServerProt170, Static688.ServerProt250, Static632.ServerProt229, Static133.ServerProt55, Static132.ServerProt54, ServerProt144, Static636.ServerProt230, Static629.ServerProt228, Static286.ServerProt118, Static41.ServerProt20, Static87.ServerProt37, Static9.ServerProt3, Static570.ServerProt208, ServerProt76, Static46.ServerProt27, MESSAGE_GAME, Static491.ServerProt254, Static542.ServerProt199, Static706.ServerProt255, Static19.ServerProt8, Static707.ServerProt256, Static605.ServerProt220, Static266.ServerProt192, ServerProt175, Static617.ServerProt224, Static312.ServerProt131, ServerProt83, Static533.ServerProt196, ServerProt104, Static550.ServerProt200, Static660.ServerProt239, Static331.ServerProt139, Static598.ServerProt219, Static663.ServerProt241, Static389.aServerProt_157, ServerProt259, Static428.ServerProt167, Static346.ServerProt145, Static72.ServerProt35, Static404.ServerProt161, Static563.ServerProt207, Static291.ServerProt123, Static663.ServerProt240, Static410.ServerProt163, Static224.ServerProt89, Static40.ServerProt18, Static718.ServerProt258, Static305.ServerProt129, Static411.ServerProt164, Static201.ServerProt206, Static119.ServerProt47, Static266.ServerProt191, Static692.ServerProt251, Static454.ServerProt174, Static618.ServerProt226, Static491.ServerProt253, Static272.ServerProt112, Static214.ServerProt85};
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
