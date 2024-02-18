import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class147 implements Interface23 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)I")
	@Override
	public int method6865(@OriginalArg(0) int arg0) {
		@Pc(18) IntNode local18 = (IntNode) Static25.aHashTable4.get((long) arg0);
		return local18 == null ? Static34.aClass304_1.method6865(arg0) : local18.value;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)I")
	@Override
	public int method6864(@OriginalArg(0) int arg0) {
		@Pc(14) IntNode local14 = (IntNode) Static25.aHashTable4.get((long) arg0 | 0x100000000L);
		return local14 == null ? Static34.aClass304_1.method6864(arg0) : local14.value;
	}
}
