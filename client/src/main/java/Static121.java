import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
	public static int anInt2333;

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt49 = new ServerProt(5, 7);

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
	public static void method2199(@OriginalArg(0) int arg0) {
		@Pc(17) Linkable_Sub5 local17 = (Linkable_Sub5) Static106.aHashTable11.get((long) arg0);
		if (local17 != null) {
			local17.aClass222_Sub1_1.method9181();
			Static635.method8380(local17.anInt182, local17.aBoolean15);
			local17.unlink();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIILclient!sb;)Lclient!dv;")
	public static Class88 method2201(@OriginalArg(0) int arg0, @OriginalArg(3) Js5 arg1) {
		@Pc(9) byte[] local9 = arg1.fetchFile(arg0, 0);
		return local9 == null ? null : new Class88(local9);
	}
}
