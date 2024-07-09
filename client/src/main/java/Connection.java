import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Connection {

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "Lclient!gw;")
	public static final Connection lobbyConnection = new Connection();

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "Lclient!gw;")
	public static final Connection gameConnection = new Connection();

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "[Lclient!gw;")
	public static final Connection[] connections = new Connection[] {gameConnection, lobbyConnection};

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "Lclient!vn;")
	public Class348 aClass348_1;

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "Lclient!oba;")
	public PrivilegedRequest aPrivilegedRequest1;

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "Lclient!iv;")
	public IsaacRandom random;

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "I")
	public int outBytes;

	@OriginalMember(owner = "client!gw", name = "z", descriptor = "Lclient!lga;")
	public ServerProt lastPacketType2;

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "Lclient!lga;")
	public ServerProt aServerProt_92;

	@OriginalMember(owner = "client!gw", name = "B", descriptor = "I")
	public int anInt3644;

	@OriginalMember(owner = "client!gw", name = "A", descriptor = "I")
	public int inBytes;

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "Lclient!lga;")
	public ServerProt lastPacketType;

	@OriginalMember(owner = "client!gw", name = "w", descriptor = "I")
	private int anInt3649;

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "Lclient!sia;")
	private final LinkedList aLinkedList17 = new LinkedList();

	@OriginalMember(owner = "client!gw", name = "x", descriptor = "I")
	private int anInt3640 = 0;

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "Lclient!ge;")
	private final Packet aPacket_6 = new Packet(1350);

	@OriginalMember(owner = "client!gw", name = "y", descriptor = "Lclient!rka;")
	public final PacketBit inboundPacket = new PacketBit(15000);

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "Lclient!lga;")
	public ServerProt packetType = null;

	@OriginalMember(owner = "client!gw", name = "u", descriptor = "I")
	public int anInt3648 = 0;

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
	public int anInt3647 = 0;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "Z")
	public boolean aBoolean278 = false;

	@OriginalMember(owner = "client!gw", name = "q", descriptor = "Z")
	public boolean aBoolean279 = true;

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "I")
	public int anInt3646 = 0;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)Lclient!gw;")
	public static Connection getActiveConnection() {
		return Static620.isInLobby(Static283.gameState) ? lobbyConnection : gameConnection;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V")
	public void method3271() {
		if (Static333.anInt5455 % 50 == 0) {
			this.outBytes = this.anInt3649;
			this.inBytes = this.anInt3644;
			this.anInt3649 = 0;
			this.anInt3644 = 0;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
	public void method3272() {
		this.aLinkedList17.clear();
		this.anInt3640 = 0;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)V")
	public void method3273() throws IOException {
		if (this.aClass348_1 == null || this.anInt3640 <= 0) {
			return;
		}
		this.aPacket_6.pos = 0;
		while (true) {
			@Pc(23) OutboundPacket local23 = (OutboundPacket) this.aLinkedList17.head();
			if (local23 == null || local23.anInt2989 > this.aPacket_6.data.length - this.aPacket_6.pos) {
				this.aClass348_1.method7931(this.aPacket_6.data, this.aPacket_6.pos);
				this.anInt3647 = 0;
				this.anInt3649 += this.aPacket_6.pos;
				break;
			}
			this.aPacket_6.pdata(local23.buffer.data, 0, local23.anInt2989);
			this.anInt3640 -= local23.anInt2989;
			local23.unlink();
			local23.buffer.release();
			local23.method2768();
		}
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V")
	public void method3274() {
		if (this.aClass348_1 != null) {
			this.aClass348_1.method7926();
			this.aClass348_1 = null;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILclient!fk;)V")
	public void queue(@OriginalArg(1) OutboundPacket out) {
		this.aLinkedList17.addTail(out);
		out.anInt2989 = out.buffer.pos;
		out.buffer.pos = 0;
		this.anInt3640 += out.anInt2989;
	}
}
