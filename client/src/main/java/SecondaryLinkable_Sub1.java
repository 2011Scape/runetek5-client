import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class SecondaryLinkable_Sub1 extends SecondaryLinkable {

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "Lclient!av;")
	private HashTable aHashTable1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!ge;I)V")
	private void method88(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(6) int local6 = arg1.g1();
		@Pc(13) int local13;
		if (this.aHashTable1 == null) {
			local13 = Static440.method5962(local6);
			this.aHashTable1 = new HashTable(local13);
		}
		for (local13 = 0; local13 < local6; local13++) {
			@Pc(32) boolean local32 = arg1.g1() == 1;
			@Pc(36) int local36 = arg1.g3();
			@Pc(45) Linkable local45;
			if (local32) {
				local45 = new StringNode(arg1.gjstr());
			} else {
				local45 = new IntNode(arg1.g4());
			}
			this.aHashTable1.put((long) local36, local45);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)I")
	public int method89(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aHashTable1 == null) {
			return arg0;
		} else {
			@Pc(17) IntNode local17 = (IntNode) this.aHashTable1.get((long) arg1);
			return local17 == null ? arg0 : local17.value;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLclient!ge;)V")
	public void method90(@OriginalArg(1) Packet arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.g1();
			if (local7 == 0) {
				return;
			}
			this.method88(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method91(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aHashTable1 == null) {
			return arg1;
		} else {
			@Pc(23) StringNode local23 = (StringNode) this.aHashTable1.get((long) arg0);
			return local23 == null ? arg1 : local23.value;
		}
	}
}
