import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
	public static int anInt4115;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)V")
	public static void method3605() {
		client.config.discardUnpacked = 1;
		if (Static283.gameState == 15) {
			Static187.method2842();
		}
		Static408.method5632();
		Static694.anInt10405 = 0;
		Static393.anInt6147 = 0;
		Static618.anInt9449 = 0;
		Static674.anInt10128 = 0;
		Static373.anInt5903 = 0;
		Connection.lobbyConnection.method3274();
		Static50.aBoolean565 = true;
		Static91.aBoolean750 = true;
		Static230.method3374();
		for (@Pc(8628) int local8628 = 0; local8628 < Static527.aClass254Array1.length; local8628++) {
			Static527.aClass254Array1[local8628] = null;
		}
		Static156.aBoolean223 = false;
		Static368.method5273();
		Static29.anInt723 = (int) (Math.random() * 120.0D) - 60;
		Static288.anInt4621 = (int) (Math.random() * 80.0D) - 40;
		Static145.anInt2561 = (int) (Math.random() * 110.0D) - 55;
		Static660.anInt9835 = (int) (Math.random() * 30.0D) - 20;
		Static508.anInt7627 = (int) (Math.random() * 100.0D) - 50;
		Static171.aFloat64 = (float) ((int) (Math.random() * 160.0D) - 80 & 0x3FFF);
		Static439.method5954();
		for (@Pc(8697) int local8697 = 0; local8697 < 2048; local8697++) {
			Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local8697] = null;
		}
		Static390.anInt6126 = 0;
		Static416.anInt6378 = 0;
		Static18.aHashTable2.clear();
		Static505.aLinkedList77.clear();
		Static346.aHashTable29.clear();
		Static422.aParticleLinkedList9.method2789();
		Static497.aHashTable35.clear();
		Static159.aLinkedList15 = new LinkedList();
		Static227.aLinkedList18 = new LinkedList();
		Static34.aClass304_1.method6867();
		Static457.method6230();
		Static121.anInt2333 = 0;
		Static55.anInt1125 = 0;
		Static12.anInt5741 = 0;
		Static441.anInt6689 = 0;
		Static314.anInt5035 = 0;
		Static674.anInt10088 = 0;
		Static363.anInt6934 = 0;
		Static179.anInt2991 = 0;
		Static709.anInt10667 = 0;
		Static694.anInt10411 = 0;
		for (@Pc(8765) int local8765 = 0; local8765 < Static511.anIntArray614.length; local8765++) {
			if (!Static118.aBooleanArray4[local8765]) {
				Static511.anIntArray614[local8765] = -1;
			}
		}
		if (Static377.anInt5930 != -1) {
			Static347.method5094(Static377.anInt5930);
		}
		for (@Pc(8803) SubInterface local8803 = (SubInterface) Static548.aHashTable40.head(); local8803 != null; local8803 = (SubInterface) Static548.aHashTable40.next()) {
			if (!local8803.isLinked()) {
				local8803 = (SubInterface) Static548.aHashTable40.head();
				if (local8803 == null) {
					break;
				}
			}
			Static449.method6115(false, true, local8803);
		}
		Static377.anInt5930 = -1;
		Static548.aHashTable40 = new HashTable(8);
		Static656.method6692();
		Static390.aComponent9 = null;
		for (@Pc(8849) int local8849 = 0; local8849 < 8; local8849++) {
			Static297.aStringArray24[local8849] = null;
			Static601.aBooleanArray28[local8849] = false;
			Static147.anIntArray227[local8849] = -1;
		}
		Static576.method7614();
		Static426.aBoolean72 = true;
		for (@Pc(8877) int local8877 = 0; local8877 < 100; local8877++) {
			Static364.aBooleanArray18[local8877] = true;
		}
		for (@Pc(8893) int local8893 = 0; local8893 < 6; local8893++) {
			Static105.aClass171Array1[local8893] = new Class171();
		}
		for (@Pc(8911) int local8911 = 0; local8911 < 25; local8911++) {
			Static581.anIntArray688[local8911] = 0;
			Static498.anIntArray604[local8911] = 0;
			Static237.anIntArray518[local8911] = 0;
		}
		Static218.method3187();
		Static273.aBoolean339 = true;
		Static637.aShortArray132 = Static419.aShortArray96 = Static553.aShortArray112 = Static238.aShortArray62 = new short[256];
		Static331.aString52 = LocalizedText.WALK_HERE.get(Static51.clientLanguageId);
		Static400.aClass2_Sub34_28.method5104(Static400.aClass2_Sub34_28.aPreference_Sub4_1.method2143(), Static400.aClass2_Sub34_28.aPreference_Sub4_2);
		Static400.aClass2_Sub34_28.method5104(Static400.aClass2_Sub34_28.aPreference_Sub19_1.method5960(), Static400.aClass2_Sub34_28.aPreference_Sub19_2);
		Static334.anInt5456 = 0;
		Static533.method7119();
		Static371.method5284();
		Static211.aClass2_Sub12_3 = null;
		Static675.aLong307 = 0L;
		client.config.discardUnpacked = 2;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
	public static void method3606() {
		if (!Static15.aBoolean17) {
			Static273.aBoolean339 = true;
			Static15.aBoolean17 = true;
			Static552.aFloat207 += (24.0F - Static552.aFloat207) / 2.0F;
		}
	}
}
