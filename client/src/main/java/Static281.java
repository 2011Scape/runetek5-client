import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
	public static int anInt4566;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!pea;)V")
	public static void method4092(@OriginalArg(1) ParticleNode_Sub7 arg0) {
		arg0.aClass8_Sub2_18 = null;
		@Pc(10) int local10 = arg0.aClass8_Sub6Array1.length;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			arg0.aClass8_Sub6Array1[local12].aBoolean352 = false;
		}
		@Pc(25) ParticleLinkedList[] local25 = Class43.aParticleLinkedListArray1;
		synchronized (Class43.aParticleLinkedListArray1) {
			if (local10 < Class43.aParticleLinkedListArray1.length && Static159.anIntArray245[local10] < 200) {
				Class43.aParticleLinkedListArray1[local10].method2787(arg0);
				@Pc(48) int local48 = Static159.anIntArray245[local10]++;
			}
		}
	}
}
