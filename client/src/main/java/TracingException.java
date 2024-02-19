import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class TracingException extends RuntimeException {

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "Ljava/lang/Throwable;")
	public final Throwable aThrowable1;

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "Ljava/lang/String;")
	public String aString32;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	public TracingException(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable1 = arg0;
		this.aString32 = arg1;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!fl;")
	public static TracingException report(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) TracingException local12;
		if (arg0 instanceof TracingException) {
			local12 = (TracingException) arg0;
			local12.aString32 = local12.aString32 + ' ' + arg1;
		} else {
			local12 = new TracingException(arg0, arg1);
		}
		return local12;
	}
}
