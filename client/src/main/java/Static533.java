import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt196 = new ServerProt(114, 4);

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "[I")
	public static final int[] anIntArray628 = new int[1000];

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
	public static void method7119() {
		for (@Pc(8) SecondaryLinkable_Sub4 local8 = (SecondaryLinkable_Sub4) Static350.aSecondaryLinkedList8.head(); local8 != null; local8 = (SecondaryLinkable_Sub4) Static350.aSecondaryLinkedList8.next()) {
			if (local8.anInt1534 > 1) {
				local8.anInt1534 = 0;
				Static717.aSoftLruHashTable232.put(((SecondaryLinkable_Sub16) local8.aSecondaryLinkedList3.sentinel.secondaryPrev).aLong234, local8);
				local8.aSecondaryLinkedList3.clear();
			}
		}
		Static31.anInt767 = 0;
		Static594.anInt8777 = 0;
		Static693.aLinkedList79.clear();
		Static490.aHashTable34.clear();
		Static350.aSecondaryLinkedList8.clear();
		Static400.aBoolean622 = false;
	}
}
