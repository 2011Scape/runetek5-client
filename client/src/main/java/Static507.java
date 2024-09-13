import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!pw", name = "C", descriptor = "[Lclient!w;")
	public static Class394[] aClass394Array1;

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "Lclient!ss;")
	public static final ClientProt aClientProt95 = new ClientProt(44, -1);

	@OriginalMember(owner = "client!pw", name = "t", descriptor = "Lclient!it;")
	public static final Class184 aClass184_14 = new Class184(10, 2, 2, 0);

	@OriginalMember(owner = "client!pw", name = "q", descriptor = "[I")
	public static final int[] anIntArray610 = new int[4096];

	@OriginalMember(owner = "client!pw", name = "G", descriptor = "I")
	public static int anInt7618 = 2;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZIIILclient!hda;)V")
	public static void method6743(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		@Pc(6) int local6 = arg3.width;
		@Pc(16) int local16 = arg3.height;
		if (arg3.dynamicWidthValue == 0) {
			arg3.width = arg3.baseWidth;
		} else if (arg3.dynamicWidthValue == 1) {
			arg3.width = arg2 - arg3.baseWidth;
		} else if (arg3.dynamicWidthValue == 2) {
			arg3.width = arg3.baseWidth * arg2 >> 14;
		}
		if (arg3.dynamicHeightValue == 0) {
			arg3.height = arg3.baseHeight;
		} else if (arg3.dynamicHeightValue == 1) {
			arg3.height = arg1 - arg3.baseHeight;
		} else if (arg3.dynamicHeightValue == 2) {
			arg3.height = arg1 * arg3.baseHeight >> 14;
		}
		if (arg3.dynamicWidthValue == 4) {
			arg3.width = arg3.anInt3795 * arg3.height / arg3.anInt3750;
		}
		if (arg3.dynamicHeightValue == 4) {
			arg3.height = arg3.width * arg3.anInt3750 / arg3.anInt3795;
		}
		if (Static103.aBoolean195 && (Static84.getServerActiveProperties(arg3).events != 0 || arg3.type == 0)) {
			if (arg3.height < 5 && arg3.width < 5) {
				arg3.height = 5;
				arg3.width = 5;
			} else {
				if (arg3.width <= 0) {
					arg3.width = 5;
				}
				if (arg3.height <= 0) {
					arg3.height = 5;
				}
			}
		}
		if (Static188.anInt3104 == arg3.clientCode) {
			Static610.aComponent16 = arg3;
		}
		if (arg0 && arg3.onResize != null && (local6 != arg3.width || local16 != arg3.height)) {
			@Pc(225) Linkable_Sub42 local225 = new Linkable_Sub42();
			local225.anObjectArray36 = arg3.onResize;
			local225.aComponent14 = arg3;
			Static521.lowPriorityRequests.addTail(local225);
		}
	}

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "(Z)V")
	public static void method6744() {
		for (@Pc(15) Linkable_Sub5 local15 = (Linkable_Sub5) Static106.aHashTable11.head(); local15 != null; local15 = (Linkable_Sub5) Static106.aHashTable11.next()) {
			if (local15.aBoolean18) {
				local15.aBoolean18 = false;
			} else {
				Static121.method2199(local15.anInt182);
			}
		}
	}
}
