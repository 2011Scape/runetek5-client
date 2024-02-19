import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!dn", name = "G", descriptor = "Lclient!sb;")
	public static Js5 aJs519;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method2193(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Component local8 = Static15.method186(arg1, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray15 != null) {
			@Pc(19) Linkable_Sub42 local19 = new Linkable_Sub42();
			local19.anObjectArray36 = local8.anObjectArray15;
			local19.anInt7219 = arg3;
			local19.aString84 = arg2;
			local19.aComponent14 = local8;
			Static472.method6420(local19);
		}
		if (Static283.gameState != 11 || !Static84.method1661(local8).method6221(arg3 - 1)) {
			return;
		}
		@Pc(64) OutboundPacket local64;
		if (arg3 == 1) {
			local64 = OutboundPacket.create(Static546.aClientProt98, Connection.gameConnection.random);
			Static277.method4040(arg0, local8.anInt3760, local64, arg1);
			Connection.gameConnection.queue(local64);
		}
		if (arg3 == 2) {
			local64 = OutboundPacket.create(Static323.aClientProt65, Connection.gameConnection.random);
			Static277.method4040(arg0, local8.anInt3760, local64, arg1);
			Connection.gameConnection.queue(local64);
		}
		if (arg3 == 3) {
			local64 = OutboundPacket.create(Static255.aClientProt54, Connection.gameConnection.random);
			Static277.method4040(arg0, local8.anInt3760, local64, arg1);
			Connection.gameConnection.queue(local64);
		}
		@Pc(148) OutboundPacket local148;
		if (arg3 == 4) {
			local148 = OutboundPacket.create(Static710.aClientProt93, Connection.gameConnection.random);
			Static277.method4040(arg0, local8.anInt3760, local148, arg1);
			Connection.gameConnection.queue(local148);
		}
		if (arg3 == 5) {
			local148 = OutboundPacket.create(Static693.aClientProt121, Connection.gameConnection.random);
			Static277.method4040(arg0, local8.anInt3760, local148, arg1);
			Connection.gameConnection.queue(local148);
		}
		if (arg3 == 6) {
			local148 = OutboundPacket.create(Static126.aClientProt23, Connection.gameConnection.random);
			Static277.method4040(arg0, local8.anInt3760, local148, arg1);
			Connection.gameConnection.queue(local148);
		}
		if (arg3 == 7) {
			local148 = OutboundPacket.create(Static358.aClientProt124, Connection.gameConnection.random);
			Static277.method4040(arg0, local8.anInt3760, local148, arg1);
			Connection.gameConnection.queue(local148);
		}
		if (arg3 == 8) {
			local148 = OutboundPacket.create(Static700.aClientProt123, Connection.gameConnection.random);
			Static277.method4040(arg0, local8.anInt3760, local148, arg1);
			Connection.gameConnection.queue(local148);
		}
		if (arg3 == 9) {
			local148 = OutboundPacket.create(Static372.aClientProt69, Connection.gameConnection.random);
			Static277.method4040(arg0, local8.anInt3760, local148, arg1);
			Connection.gameConnection.queue(local148);
		}
		if (arg3 == 10) {
			local148 = OutboundPacket.create(Static713.aClientProt125, Connection.gameConnection.random);
			Static277.method4040(arg0, local8.anInt3760, local148, arg1);
			Connection.gameConnection.queue(local148);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZIJI)Ljava/lang/String;")
	public static String method2198(@OriginalArg(2) long arg0, @OriginalArg(3) int arg1) {
		Static356.method5196(arg0);
		@Pc(10) Calendar local10 = Static260.aCalendar1;
		@Pc(20) int local20 = local10.get(5);
		@Pc(26) int local26 = local10.get(2) + 1;
		@Pc(38) int local38 = local10.get(1);
		@Pc(42) int local42 = local10.get(11);
		@Pc(46) int local46 = local10.get(12);
		return Integer.toString(local20 / 10) + local20 % 10 + "/" + local26 / 10 + local26 % 10 + "/" + local38 % 100 / 10 + local38 % 10 + " " + local42 / 10 + local42 % 10 + ":" + local46 / 10 + local46 % 10;
	}
}
