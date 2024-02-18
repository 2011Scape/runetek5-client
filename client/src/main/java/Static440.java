import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
	public static int anInt6680 = 0;

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
	public static int anInt6683 = 1;

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "[I")
	public static final int[] anIntArray529 = new int[2];

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIJ)Lclient!aj;")
	public static SecondaryLinkable_Sub2 method5963(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(21) SecondaryLinkable_Sub2 local21 = (SecondaryLinkable_Sub2) Static658.aHashTable43.get(arg1 | (long) arg0 << 56);
		if (local21 == null) {
			local21 = new SecondaryLinkable_Sub2(arg0, arg1);
			Static658.aHashTable43.put(local21.id, local21);
		}
		return local21;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!dea;)V")
	public static void method5964(@OriginalArg(1) PcmStream arg0) {
		if (arg0.aClass2_Sub49_6 != null) {
			arg0.aClass2_Sub49_6.anInt8817 = 0;
		}
		arg0.aBoolean793 = false;
		for (@Pc(25) PcmStream local25 = arg0.method9133(); local25 != null; local25 = arg0.method9135()) {
			method5964(local25);
		}
	}
}
