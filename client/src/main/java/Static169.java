import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static169 {

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!wk;")
	public static final Class403 aClass403_1 = new Class403();

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
	public static int anInt2850 = 500;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
	public static int anInt2853 = -1;

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
	public static int anInt2855 = -2;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!rka;)V")
	public static void method2647(@OriginalArg(1) PacketBit arg0) {
		arg0.p4(client.anims.getChecksum());
		arg0.p4(client.bases.getChecksum());
		arg0.p4(client.config.getChecksum());
		arg0.p4(client.interfaces.getChecksum());
		arg0.p4(client.synthSounds.getChecksum());
		arg0.p4(client.maps.getChecksum());
		arg0.p4(client.midiSongs.getChecksum());
		arg0.p4(client.models.getChecksum());
		arg0.p4(client.sprites.getChecksum());
		arg0.p4(client.textures.getChecksum());
		arg0.p4(client.binary.getChecksum());
		arg0.p4(client.midiJingles.getChecksum());
		arg0.p4(client.clientscripts.getChecksum());
		arg0.p4(client.fontMetrics.getChecksum());
		arg0.p4(client.vorbis.getChecksum());
		arg0.p4(client.midiInstruments.getChecksum());
		arg0.p4(client.configLoc.getChecksum());
		arg0.p4(client.configEnum.getChecksum());
		arg0.p4(client.configNpc.getChecksum());
		arg0.p4(client.configObj.getChecksum());
		arg0.p4(client.configSeq.getChecksum());
		arg0.p4(client.configSpot.getChecksum());
		arg0.p4(client.configVarbit.getChecksum());
		arg0.p4(client.worldMapData.getChecksum());
		arg0.p4(client.quickchat.getChecksum());
		arg0.p4(client.quickchatGlobal.getChecksum());
		arg0.p4(client.materials.getChecksum());
		arg0.p4(client.configParticle.getChecksum());
		arg0.p4(client.defaults.getChecksum());
		arg0.p4(client.configBillboard.getChecksum());
		arg0.p4(client.dlls.getChecksum());
		arg0.p4(client.shaders.getChecksum());
		arg0.p4(client.cutscenes.getChecksum());
		arg0.p4(Static190.method2865());
		arg0.p4(Static140.method2366());
		arg0.p4(client.js5Archive36.getChecksum());
	}
}
