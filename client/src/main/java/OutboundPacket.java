import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class OutboundPacket extends Linkable {

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "Lclient!ss;")
	public ClientProt packetType;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
	public int size;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "Lclient!rka;")
	public PacketBit buffer;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
	public int anInt2989;

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!ss;Lclient!iv;)Lclient!fk;")
	public static OutboundPacket create(@OriginalArg(1) ClientProt arg0, @OriginalArg(2) IsaacRandom arg1) {
		@Pc(6) OutboundPacket local6 = Static119.method2174();
		local6.size = arg0.size;
		local6.packetType = arg0;
		if (local6.size == -1) {
			local6.buffer = new PacketBit(260);
		} else if (local6.size == -2) {
			local6.buffer = new PacketBit(10000);
		} else if (local6.size <= 18) {
			local6.buffer = new PacketBit(20);
		} else if (local6.size <= 98) {
			local6.buffer = new PacketBit(100);
		} else {
			local6.buffer = new PacketBit(260);
		}
		local6.buffer.setRandom(arg1);
		local6.buffer.p1isaac(local6.packetType.getOpcode());
		local6.anInt2989 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
	public void method2768() {
		if (Static76.anInt1604 < Static372.aClass2_Sub19Array1.length) {
			Static372.aClass2_Sub19Array1[Static76.anInt1604++] = this;
		}
	}
}
