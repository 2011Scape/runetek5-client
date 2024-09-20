import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public final class PrivilegedRequest {

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
	public int intArg1;

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
	public int intArg2;

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "Ljava/lang/Object;")
	public Object objectArg;

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "Lclient!oba;")
	public PrivilegedRequest next;

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "Ljava/lang/Object;")
	public volatile Object result;

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
	public int type;

	@OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
	public volatile int state = 0;
}
