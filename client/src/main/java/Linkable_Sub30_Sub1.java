import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Linkable_Sub30_Sub1 extends Linkable_Sub30 {

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "B")
	private byte aByte79;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	private int anInt4619;

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "Ljava/lang/String;")
	private String aString50 = null;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "J")
	private long aLong149 = -1L;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!rfa;I)V")
	@Override
	public void method7642(@OriginalArg(0) Linkable_Sub47 arg0) {
		@Pc(7) Class34 local7 = new Class34();
		local7.anInt783 = this.anInt4619;
		local7.aByte9 = this.aByte79;
		local7.aString2 = this.aString50;
		arg0.method7273(local7);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ge;I)V")
	@Override
	public void method7647(@OriginalArg(0) Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos--;
			this.aLong149 = arg0.g8();
		}
		this.aString50 = arg0.fastgjstr();
		this.anInt4619 = arg0.g2();
		this.aByte79 = arg0.g1b();
		arg0.g8();
		if (Static459.aBoolean523) {
			System.out.println("memberhash:" + this.aLong149 + " membername:" + this.aString50);
		}
	}
}
