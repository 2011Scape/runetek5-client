import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[5];

	@OriginalMember(owner = "client!s", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[200];

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!hja;")
	public static final LoginProt aLoginProt53 = new LoginProt(14, 0);

	@OriginalMember(owner = "client!s", name = "y", descriptor = "Lclient!hja;")
	public static final LoginProt aLoginProt54 = new LoginProt(15, 4);

	@OriginalMember(owner = "client!s", name = "u", descriptor = "Lclient!hja;")
	public static final LoginProt aLoginProt55 = new LoginProt(16, -2);

	@OriginalMember(owner = "client!s", name = "z", descriptor = "Lclient!hja;")
	public static final LoginProt aLoginProt56 = new LoginProt(17, 0);

	@OriginalMember(owner = "client!s", name = "r", descriptor = "Lclient!hja;")
	public static final LoginProt aLoginProt57 = new LoginProt(19, -2);

	@OriginalMember(owner = "client!s", name = "q", descriptor = "Lclient!hja;")
	public static final LoginProt aLoginProt58 = new LoginProt(22, -2);

	@OriginalMember(owner = "client!s", name = "v", descriptor = "Lclient!hja;")
	public static final LoginProt aLoginProt59 = new LoginProt(23, 4);

	@OriginalMember(owner = "client!s", name = "p", descriptor = "Lclient!hja;")
	public static final LoginProt aLoginProt60 = new LoginProt(24, -1);

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!hja;")
	public static final LoginProt aLoginProt61 = new LoginProt(26, 0);

	@OriginalMember(owner = "client!s", name = "m", descriptor = "Lclient!hja;")
	public static final LoginProt aLoginProt62 = new LoginProt(27, 0);

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!hja;")
	public static final LoginProt aLoginProt63 = new LoginProt(28, -2);

	@OriginalMember(owner = "client!s", name = "l", descriptor = "Lclient!hja;")
	public static final LoginProt aLoginProt64 = new LoginProt(29, -2);

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!hja;")
	public static final LoginProt aLoginProt65 = new LoginProt(30, -2);

	@OriginalMember(owner = "client!s", name = "o", descriptor = "I")
	public static int anInt8896 = 0;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)I")
	public static int method7867(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = 255 - arg2;
		@Pc(33) int local33 = ((arg0 & 0xFF00) * arg2 & 0xFF0000 | (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) >>> 8;
		return local33 + ((local15 * (arg1 & 0xFF00) & 0xFF0000 | (arg1 & 0xFF00FF) * local15 & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
	public static void method7876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = Static42.aClass381_4.method8744(LocalizedText.CHOOSE_OPTION.get(Static51.anInt1052));
		@Pc(68) int local68;
		@Pc(27) int local27;
		if (Static236.aBoolean304) {
			for (@Pc(18) SecondaryLinkable_Sub4 local18 = (SecondaryLinkable_Sub4) Static350.aSecondaryLinkedList8.head(); local18 != null; local18 = (SecondaryLinkable_Sub4) Static350.aSecondaryLinkedList8.next()) {
				if (local18.anInt1534 == 1) {
					local27 = Static249.method3536((SecondaryLinkable_Sub16) local18.aSecondaryLinkedList3.sentinel.secondaryPrev);
				} else {
					local27 = Static192.method2875(local18);
				}
				if (local27 > local11) {
					local11 = local27;
				}
			}
			local11 += 8;
			Static407.anInt6288 = (Static60.aBoolean87 ? 26 : 22) + Static31.anInt767 * 16;
			local68 = Static31.anInt767 * 16 + 21;
		} else {
			for (@Pc(74) SecondaryLinkable_Sub16 local74 = (SecondaryLinkable_Sub16) Static693.aLinkedList79.head(); local74 != null; local74 = (SecondaryLinkable_Sub16) Static693.aLinkedList79.next()) {
				local27 = Static249.method3536(local74);
				if (local11 < local27) {
					local11 = local27;
				}
			}
			local11 += 8;
			Static407.anInt6288 = (Static60.aBoolean87 ? 26 : 22) + Static594.anInt8777 * 16;
			local68 = Static594.anInt8777 * 16 + 21;
		}
		@Pc(118) int local118 = arg1 - local11 / 2;
		if (Static680.anInt10289 < local11 + local118) {
			local118 = Static680.anInt10289 - local11;
		}
		if (local118 < 0) {
			local118 = 0;
		}
		@Pc(146) int local146 = arg0;
		if (arg0 + local68 > Static380.anInt5979) {
			local146 = Static380.anInt5979 - local68;
		}
		if (local146 < 0) {
			local146 = 0;
		}
		Static71.anInt1576 = local118;
		Static400.aBoolean622 = true;
		Static84.anInt1775 = local146;
		Static682.anInt10295 = local11;
	}
}
