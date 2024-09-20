import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!md", name = "K", descriptor = "Z")
	public static boolean aBoolean459 = false;

	@OriginalMember(owner = "client!md", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString64 = null;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(IZ)Z")
	public static boolean method5474(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IBLclient!hda;I)V")
	public static void method5476(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.onUse != null) {
			@Pc(14) Linkable_Sub42 local14 = new Linkable_Sub42();
			local14.aComponent14 = arg1;
			local14.anObjectArray36 = arg1.onUse;
			Static472.method6420(local14);
		}
		Static162.anInt2799 = arg1.objId;
		Static450.anInt6819 = arg1.id;
		Static156.aBoolean223 = true;
		Static610.anInt9329 = arg2;
		Static369.anInt4263 = arg1.anInt3749;
		Static77.anInt1614 = arg1.createdComponentId;
		Static442.anInt6699 = arg1.anInt3819;
		Static717.anInt10822 = arg0;
		Static178.redraw(arg1);
	}
}
