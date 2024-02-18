import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!as", name = "d", descriptor = "Lclient!bp;")
	public static SeqTypeList aSeqTypeList1;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "I")
	public static int anInt598;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt11 = new ServerProt(52, 6);

	@OriginalMember(owner = "client!as", name = "c", descriptor = "Lclient!av;")
	public static final HashTable aHashTable4 = new HashTable(32);

	@OriginalMember(owner = "client!as", name = "b", descriptor = "S")
	public static short aShort1 = 1;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZZ)V")
	public static void method688(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static377.anInt5930 != -1) {
				Static347.method5094(Static377.anInt5930);
			}
			for (@Pc(16) SubInterface local16 = (SubInterface) Static548.aHashTable40.head(); local16 != null; local16 = (SubInterface) Static548.aHashTable40.next()) {
				if (!local16.isLinked()) {
					local16 = (SubInterface) Static548.aHashTable40.head();
					if (local16 == null) {
						break;
					}
				}
				Static449.method6115(false, true, local16);
			}
			Static377.anInt5930 = -1;
			Static548.aHashTable40 = new HashTable(8);
			Static656.method6692();
			Static377.anInt5930 = Static65.aClass3_1.anInt82;
			Static640.method8435(false);
			Static469.method6362();
			Static472.method6414(Static377.anInt5930);
		}
		Static461.aBoolean529 = true;
	}
}
