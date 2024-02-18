import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class SecondaryLinkable_Sub4 extends SecondaryLinkable {

	@OriginalMember(owner = "client!cba", name = "C", descriptor = "I")
	public int anInt1534;

	@OriginalMember(owner = "client!cba", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString10;

	@OriginalMember(owner = "client!cba", name = "A", descriptor = "Lclient!jga;")
	public final SecondaryLinkedList aSecondaryLinkedList3;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public SecondaryLinkable_Sub4(@OriginalArg(0) String arg0) {
		this.aString10 = arg0;
		this.aSecondaryLinkedList3 = new SecondaryLinkedList();
	}

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "(B)I")
	public int method1468() {
		return this.aSecondaryLinkedList3.sentinel.secondaryPrev == this.aSecondaryLinkedList3.sentinel ? -1 : ((SecondaryLinkable_Sub16) this.aSecondaryLinkedList3.sentinel.secondaryPrev).anInt7314;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(ILclient!pg;)Z")
	public boolean method1469(@OriginalArg(1) SecondaryLinkable_Sub16 arg0) {
		@Pc(15) int local15 = this.method1468();
		arg0.unlinkSecondary();
		this.anInt1534--;
		if (this.anInt1534 != 0) {
			return local15 != this.method1468();
		}
		this.unlink();
		this.unlinkSecondary();
		Static31.anInt767--;
		Static717.aClass82_232.method2150(this, arg0.aLong234);
		return false;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILclient!pg;)Z")
	public boolean method1471(@OriginalArg(1) SecondaryLinkable_Sub16 arg0) {
		@Pc(5) boolean local5 = true;
		arg0.unlinkSecondary();
		@Pc(21) SecondaryLinkable_Sub16 local21 = (SecondaryLinkable_Sub16) this.aSecondaryLinkedList3.head();
		while (local21 != null) {
			if (Static546.method7250(arg0.anInt7314, local21.anInt7314)) {
				Static145.method2408(arg0, local21);
				this.anInt1534++;
				if (local5) {
					return false;
				}
				return true;
			}
			local21 = (SecondaryLinkable_Sub16) this.aSecondaryLinkedList3.next();
			local5 = false;
		}
		this.aSecondaryLinkedList3.addTail(arg0);
		this.anInt1534++;
		return local5;
	}
}
