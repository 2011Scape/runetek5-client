import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public final class Linkable_Sub12 extends Linkable {

	@OriginalMember(owner = "client!cja", name = "o", descriptor = "I")
	public volatile int anInt1631 = -1;

	@OriginalMember(owner = "client!cja", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString14;

	@OriginalMember(owner = "client!cja", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Linkable_Sub12(@OriginalArg(0) String arg0) {
		this.aString14 = arg0;
	}
}
