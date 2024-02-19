import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vla")
public final class CursorType {

	@OriginalMember(owner = "client!vla", name = "c", descriptor = "I")
	public int anInt10303;

	@OriginalMember(owner = "client!vla", name = "f", descriptor = "I")
	private int anInt10305;

	@OriginalMember(owner = "client!vla", name = "b", descriptor = "Lclient!nv;")
	public CursorTypeList aCursorTypeList2;

	@OriginalMember(owner = "client!vla", name = "d", descriptor = "I")
	public int anInt10308;

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(Lclient!ge;II)V")
	private void method8933(@OriginalArg(0) Packet arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt10305 = arg0.g2();
		} else if (arg1 == 2) {
			this.anInt10303 = arg0.g1();
			this.anInt10308 = arg0.g1();
		}
	}

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(B)Lclient!wp;")
	public synchronized Class407 method8934() {
		@Pc(13) Class407 local13 = (Class407) this.aCursorTypeList2.aSoftLruHashTable143.get((long) this.anInt10305);
		if (local13 != null) {
			return local13;
		}
		local13 = Static735.method9382(this.aCursorTypeList2.aJs588, this.anInt10305, 0);
		if (local13 != null) {
			this.aCursorTypeList2.aSoftLruHashTable143.put((long) this.anInt10305, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method8935(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.g1();
			if (local16 == 0) {
				return;
			}
			this.method8933(arg0, local16);
		}
	}
}
