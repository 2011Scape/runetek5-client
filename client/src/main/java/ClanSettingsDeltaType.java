import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class ClanSettingsDeltaType extends Linkable {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!ge;)V")
	public abstract void method8615(@OriginalArg(1) Packet arg0);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!hi;I)V")
	public abstract void method8617(@OriginalArg(0) Class164 arg0);
}
