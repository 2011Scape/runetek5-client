import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class68 {

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "J")
	private long aLong57;

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "J")
	private long aLong56 = -1L;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "Lclient!sia;")
	private final LinkedList aLinkedList10 = new LinkedList();

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class68(@OriginalArg(0) Packet arg0) {
		this.method1580(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!ge;I)V")
	private void method1580(@OriginalArg(0) Packet arg0) {
		this.aLong57 = arg0.g8();
		this.aLong56 = arg0.g8();
		for (@Pc(21) int local21 = arg0.g1(); local21 != 0; local21 = arg0.g1()) {
			@Pc(44) Linkable_Sub30 local44;
			if (local21 == 1) {
				local44 = new Linkable_Sub30_Sub1();
			} else if (local21 == 4) {
				local44 = new Linkable_Sub30_Sub2();
			} else if (local21 == 3) {
				local44 = new Linkable_Sub30_Sub3();
			} else if (local21 == 2) {
				local44 = new Linkable_Sub30_Sub4();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local44.method7647(arg0);
			this.aLinkedList10.addTail(local44);
		}
		if (17 != 17) {
			Static80.anIntArray153 = null;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!rfa;Z)V")
	public void method1581(@OriginalArg(0) Linkable_Sub47 arg0) {
		if (arg0.id != this.aLong57 || this.aLong56 != arg0.aLong256) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.id + " updateNum:" + arg0.aLong256 + " delta.clanHash:" + this.aLong57 + " updateNum:" + this.aLong56);
		}
		for (@Pc(69) Linkable_Sub30 local69 = (Linkable_Sub30) this.aLinkedList10.head(); local69 != null; local69 = (Linkable_Sub30) this.aLinkedList10.next()) {
			local69.method7642(arg0);
		}
		arg0.aLong256++;
	}
}
