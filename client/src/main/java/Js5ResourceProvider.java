import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public abstract class Js5ResourceProvider {

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	protected Js5ResourceProvider() {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V")
	public abstract void prefetchGroup(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)I")
	public abstract int getPercentageComplete(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)[B")
	public abstract byte[] fetchGroup(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)Lclient!pj;")
	public abstract Js5Index fetchIndex();
}
