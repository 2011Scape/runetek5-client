import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public final class ClanSettingsDeltaType8 extends ClanSettingsDeltaType {

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
	private int anInt7632;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
	private int anInt7637;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!hi;I)V")
	@Override
	public void method8617(@OriginalArg(0) Class164 arg0) {
		arg0.method3498(this.anInt7632, this.anInt7637);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!ge;)V")
	@Override
	public void method8615(@OriginalArg(1) Packet arg0) {
		this.anInt7637 = arg0.g4();
		this.anInt7632 = arg0.g4();
	}
}
