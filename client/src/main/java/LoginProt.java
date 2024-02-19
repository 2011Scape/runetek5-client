import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public final class LoginProt {

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "I")
	public final int opcode;

	@OriginalMember(owner = "client!hja", name = "<init>", descriptor = "(II)V")
	public LoginProt(@OriginalArg(0) int opcode, @OriginalArg(1) int size) {
		this.opcode = opcode;
	}

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(I)[Lclient!hja;")
    public static LoginProt[] method3604() {
        return new LoginProt[] { Static572.aLoginProt53, Static572.aLoginProt54, Static572.aLoginProt55, Static572.aLoginProt56, Static572.aLoginProt57, Static572.aLoginProt58, Static572.aLoginProt59, Static572.aLoginProt60, Static572.aLoginProt61, Static572.aLoginProt62, Static572.aLoginProt63, Static572.aLoginProt64, Static572.aLoginProt65};
    }

    @OriginalMember(owner = "client!hja", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
