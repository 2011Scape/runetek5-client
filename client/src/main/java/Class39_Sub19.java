import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rga")
public final class Class39_Sub19 extends Class39 {

	@OriginalMember(owner = "client!rga", name = "h", descriptor = "J")
	private final long aLong257;

	@OriginalMember(owner = "client!rga", name = "i", descriptor = "I")
	private final int anInt8296;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Lclient!ge;Z)V")
	public Class39_Sub19(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
		super(arg0);
		@Pc(6) int local6 = arg0.g2();
		if (arg1) {
			this.aLong257 = (long) local6 | 0x100000000L;
		} else {
			this.aLong257 = (long) local6;
		}
		this.anInt8296 = arg0.g4();
	}

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)V")
	@Override
	public void method9161() {
		@Pc(10) IntNode local10 = (IntNode) Static25.aHashTable4.get(this.aLong257);
		if (local10 == null) {
			Static25.aHashTable4.put(this.aLong257, new IntNode(this.anInt8296));
		} else {
			local10.value = this.anInt8296;
		}
	}
}
