import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static710 {

	@OriginalMember(owner = "client!wha", name = "e", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt93 = new ClientProt(52, 8);

	@OriginalMember(owner = "client!wha", name = "l", descriptor = "I")
	public static int anInt7554 = 0;

	@OriginalMember(owner = "client!wha", name = "h", descriptor = "Lclient!wk;")
	public static final Class403 aClass403_13 = new Class403();

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(ILclient!hda;Lclient!hda;)V")
	public static void method6710(@OriginalArg(1) Component arg0, @OriginalArg(2) Component arg1) {
		@Pc(15) OutboundPacket local15 = OutboundPacket.create(Static671.aClientProt117, Connection.gameConnection.random);
		local15.buffer.p2(arg1.anInt3760);
		local15.buffer.ip2(arg0.anInt3741);
		local15.buffer.p2_alt2(arg0.anInt3760);
		local15.buffer.p4_alt2(arg0.anInt3812);
		local15.buffer.ip2(arg1.anInt3741);
		local15.buffer.p4_alt3(arg1.anInt3812);
		Connection.gameConnection.queue(local15);
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
	public static void method6711() {
		for (@Pc(10) ParticleNode_Sub1 local10 = (ParticleNode_Sub1) Static149.aParticleLinkedList4.method2783(); local10 != null; local10 = (ParticleNode_Sub1) Static149.aParticleLinkedList4.method2783()) {
			Static703.method9171(local10);
		}
		@Pc(36) int local36;
		@Pc(38) int local38;
		if (Static400.aClass2_Sub34_28.aPreference_Sub19_2.method5960() == 1) {
			local36 = 0;
			local38 = 3;
		} else {
			local38 = Static164.anInt2808;
			local36 = Static164.anInt2808;
		}
		@Pc(56) int local56;
		if (Static1.anInt10798 == 3) {
			for (local56 = local36; local56 <= local38; local56++) {
				Static84.method1654(local56);
			}
			Static84.method1652();
			return;
		}
		Static84.method1655();
		for (local56 = local36; local56 <= local38; local56++) {
			Static84.method1665();
			Static84.method1670(local56);
			Static84.method1654(local56);
		}
		Static84.method1664();
		Static84.method1652();
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(III)Z")
	public static boolean method6713(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
