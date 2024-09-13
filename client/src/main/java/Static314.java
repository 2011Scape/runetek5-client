import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!jw", name = "v", descriptor = "I")
	public static int anInt5035;

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(B)V")
	public static void method4560() {
		@Pc(5) SoftLruHashTable local5 = Static580.aSoftLruHashTable186;
		synchronized (Static580.aSoftLruHashTable186) {
			Static580.aSoftLruHashTable186.clear();
		}
		local5 = Static54.aSoftLruHashTable25;
		synchronized (Static54.aSoftLruHashTable25) {
			Static54.aSoftLruHashTable25.clear();
		}
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)V")
	public static void topBannerRefresh() {
		if (Static2.aModeWhere1 != ModeWhere.LOCAL) {
			try {
				BrowserControl.call("tbrefresh", Static295.aClient1);
			} catch (@Pc(34) Throwable local34) {
			}
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(BFFFFI[BIIFILclient!tk;I)V")
	public static void method4565(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(6) byte[] arg4, @OriginalArg(8) int arg5, @OriginalArg(9) float arg6, @OriginalArg(11) Class59 arg7) {
		for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
			Static364.method5251(arg0, arg3, local5, arg7, arg4, arg6, arg1, arg5, arg2);
			arg5 += 16384;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Z)V")
	public static void closeAFileOutputStream2() {
		if (Static134.aFileOutputStream2 != null) {
			try {
				Static134.aFileOutputStream2.close();
			} catch (@Pc(10) IOException e) {
				e.printStackTrace();
			}
		}
		Static134.aFileOutputStream2 = null;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ZI)V")
	public static void method4568(@OriginalArg(0) boolean arg0) {
		Static557.method7331();
		if (!Static109.method2070(Static283.gameState)) {
			return;
		}
		@Pc(13) Connection[] local13 = Connection.connections;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(20) Connection local20 = local13[local15];
			local20.anInt3647++;
			if (local20.anInt3647 < 50 && !arg0) {
				return;
			}
			local20.anInt3647 = 0;
			if (!local20.aBoolean278 && local20.aClass348_1 != null) {
				@Pc(59) OutboundPacket local59 = OutboundPacket.create(Static415.aClientProt75, local20.random);
				local20.queue(local59);
				try {
					local20.method3273();
				} catch (@Pc(68) IOException local68) {
					local20.aBoolean278 = true;
				}
			}
		}
		Static557.method7331();
	}
}
