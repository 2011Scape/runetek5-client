import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public final class PrivilegedRequest {

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
	public int anInt6787;

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
	public int anInt6788;

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "Ljava/lang/Object;")
	public Object anObject12;

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "Lclient!oba;")
	public PrivilegedRequest aPrivilegedRequest5;

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "Ljava/lang/Object;")
	public volatile Object anObject13;

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
	public int anInt6790;

	@OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
	public volatile int state = 0;
}
