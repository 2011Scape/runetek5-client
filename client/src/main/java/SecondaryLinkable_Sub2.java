import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public final class SecondaryLinkable_Sub2 extends SecondaryLinkable {

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!aj", name = "A", descriptor = "I")
	public int anInt192;

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
	public int anInt195;

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
	public int anInt197;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IJ)V")
	public SecondaryLinkable_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		super.id = arg1 | (long) arg0 << 56;
	}

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "(I)J")
	public long method201() {
		return super.secondaryKey & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "(I)V")
	public void method202() {
		super.secondaryKey |= Long.MIN_VALUE;
		if (this.method201() == (long) 0) {
			Static138.aSecondaryLinkedList6.addTail(this);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)I")
	public int method203() {
		return (int) (super.id >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "(I)J")
	public long method204() {
		return super.id & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)V")
	public void method205() {
		super.secondaryKey = Static588.method7715() + 500L | super.secondaryKey & Long.MIN_VALUE;
		Static59.aSecondaryLinkedList9.addTail(this);
	}
}
