import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Js5QuickChatCommandDecoder implements QuickChatCommandDecoder {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IJLclient!it;[I)Ljava/lang/String;")
	@Override
	public String method5631(@OriginalArg(1) long arg0, @OriginalArg(2) Class184 arg1, @OriginalArg(3) int[] arg2) {
		if (Static403.aClass184_12 == arg1) {
			@Pc(13) EnumType local13 = Static619.aEnumTypeList2.method8925(arg2[0]);
			return local13.method1229((int) arg0);
		} else if (Static560.aClass184_15 == arg1 || arg1 == Static507.aClass184_14) {
			@Pc(41) ObjType local41 = ObjTypeList.objTypes.method2486((int) arg0);
			return local41.aString118;
		} else if (Static51.aClass184_1 == arg1 || Static642.aClass184_17 == arg1 || Static208.aClass184_6 == arg1) {
			return Static619.aEnumTypeList2.method8925(arg2[0]).method1229((int) arg0);
		} else {
			return null;
		}
	}
}
