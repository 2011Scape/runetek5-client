import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "Lclient!gm;")
	public static Class148 aClass148_3;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
	public static int anInt6929;

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt85 = new ClientProt(30, -1);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)V")
	public static void method6228(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static377.topLevelInterface != -1) {
				Static347.method5094(Static377.topLevelInterface);
			}
			for (@Pc(21) SubInterface local21 = (SubInterface) Static548.openInterfaces.head(); local21 != null; local21 = (SubInterface) Static548.openInterfaces.next()) {
				if (!local21.isLinked()) {
					local21 = (SubInterface) Static548.openInterfaces.head();
					if (local21 == null) {
						break;
					}
				}
				Static449.method6115(false, true, local21);
			}
			Static377.topLevelInterface = -1;
			Static548.openInterfaces = new HashTable(8);
			Static656.method6692();
			Static377.topLevelInterface = Static65.aClass3_1.anInt88;
			Static640.method8435(false);
			Static469.method6362();
			Static472.method6414(Static377.topLevelInterface);
		}
		Static300.method4389();
		Static461.aBoolean529 = false;
		Static242.method3502();
		Static442.anInt6699 = -1;
		Static115.method2136(ParticleNode_Sub2_Sub4_Sub1.lb);
		Static556.self = new Player();
		Static556.self.zFine = Static501.anInt7568 * 512 / 2;
		Static556.self.xFine = Static720.anInt10859 * 512 / 2;
		Static556.self.anIntArray879[0] = Static720.anInt10859 / 2;
		Static110.anInt2186 = 0;
		Static170.anInt2864 = 0;
		Static556.self.anIntArray878[0] = Static501.anInt7568 / 2;
		if (Static511.cameraType == 2) {
			Static110.anInt2186 = Static709.anInt10667 << 9;
			Static170.anInt2864 = Static121.anInt2333 << 9;
		} else {
			Static583.updateLoginScreenCamera();
		}
		Static218.method3187();
	}
}
