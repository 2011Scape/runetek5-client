import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIBII)V")
	public static void method7670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static122.anInt2339; local1++) {
			@Pc(6) Rectangle local6 = TextureOpSquareWaveform.aRectangleArray1[local1];
			if (arg1 < local6.x + local6.width && arg1 + arg0 > local6.x && local6.height + local6.y > arg3 && local6.y < arg2 + arg3) {
				Static364.aBooleanArray18[local1] = true;
			}
		}
		Static682.method8927(arg3, arg3 + arg2, arg1, arg1 + arg0);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIZ[B)[B")
	public static byte[] method7674(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static734.method7694(arg1, arg0, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)[Lclient!lga;")
	public static ServerProt[] method7677() {
		return new ServerProt[] { Static699.ServerProt252, Static273.ServerProt113, Static356.ServerProt149, Static155.ServerProt60, Static370.ServerProt152, Static121.ServerProt49, Static269.ServerProt111, Static384.ServerProt156, Static489.ServerProt185, Static303.ServerProt126, Static193.ServerProt74, Static137.ServerProt56, Static451.aServerProt_171, Static671.ServerProt246, Static176.ServerProt187, Static40.ServerProt19, Static504.ServerProt188, Static481.ServerProt178, Static655.ServerProt237, Static287.ServerProt119, Static441.ServerProt168, Static641.ServerProt234, Static161.ServerProt62, Static207.ServerProt127, Static137.ServerProt57, Static590.ServerProt217, Static31.ServerProt14, Static314.ServerProt132, Static84.ServerProt36, Static670.ServerProt245, Static353.ServerProt233, Static606.ServerProt221, Static286.ServerProt117, Static109.ServerProt45, Static231.ServerProt102, Static207.ServerProt128, Static331.ServerProt138, Static100.ServerProt43, Static232.ServerProt103, Static40.ServerProt17, Static616.ServerProt223, Static166.ServerProt63, Static444.ServerProt169, Static651.ServerProt235, Static452.ServerProt173, Static464.ServerProt176, Static157.ServerProt61, Static347.ServerProt146, Static18.ServerProt7, Static479.ServerProt177, Static383.ServerProt155, Static12.ServerProt147, Static25.ServerProt11, Static390.ServerProt158, Static51.ServerProt30, Static215.ServerProt86, Static309.ServerProt130, Static225.ServerProt90, Static416.ServerProt165, Static432.ServerProt10, Static125.ServerProt52, Static557.ServerProt205, Static722.ServerProt260, Static679.ServerProt247, Static14.ServerProt5, Static284.ServerProt116, Static297.ServerProt125, Static608.ServerProt222, Static619.ServerProt34, Static91.ServerProt236, Static36.ServerProt15, Static334.ServerProt140, Static250.ServerProt105, Static586.ServerProt215, Static40.ServerProt16, Static125.ServerProt53, Static85.ServerProt257, Static468.ServerProt212, Static526.ServerProt194, Static229.ServerProt101, Static526.ServerProt195, Static618.ServerProt227, Static587.ServerProt216, Static211.ServerProt143, Static205.ServerProt80, Static320.ServerProt135, Static283.ServerProt115, Static446.ServerProt170, Static688.ServerProt250, Static632.ServerProt229, Static133.ServerProt55, Static132.ServerProt54, Static344.ServerProt144, Static636.ServerProt230, Static629.ServerProt228, Static286.ServerProt118, Static41.ServerProt20, Static87.ServerProt37, Static9.ServerProt3, Static570.ServerProt208, Static565.ServerProt76, Static46.ServerProt27, ServerProt.MESSAGE_GAME, Static491.ServerProt254, Static542.ServerProt199, Static706.ServerProt255, Static19.ServerProt8, Static707.ServerProt256, Static605.ServerProt220, Static266.ServerProt192, Static459.ServerProt175, Static617.ServerProt224, Static312.ServerProt131, Static208.ServerProt83, Static533.ServerProt196, Static233.ServerProt104, Static550.ServerProt200, Static660.ServerProt239, Static331.ServerProt139, Static598.ServerProt219, Static663.ServerProt241, Static389.aServerProt_157, Static721.ServerProt259, Static428.ServerProt167, Static346.ServerProt145, Static72.ServerProt35, Static404.ServerProt161, Static563.ServerProt207, Static291.ServerProt123, Static663.ServerProt240, Static410.ServerProt163, Static224.ServerProt89, Static40.ServerProt18, Static718.ServerProt258, Static305.ServerProt129, Static411.ServerProt164, Static201.ServerProt206, Static119.ServerProt47, Static266.ServerProt191, Static692.ServerProt251, Static454.ServerProt174, Static618.ServerProt226, Static491.ServerProt253, Static272.ServerProt112, Static214.ServerProt85};
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Z")
	public static boolean method7682(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg3.equals(arg1);
		}
	}
}
