import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Js5Compression {
    @OriginalMember(owner = "client!ska", name = "a", descriptor = "([BB)[B")
    public static byte[] uncompress(@OriginalArg(0) byte[] arg0) {
        @Pc(8) Packet local8 = new Packet(arg0);
        @Pc(18) int local18 = local8.g1();
        @Pc(22) int local22 = local8.g4();
        if (local22 < 0 || Static112.anInt2222 != 0 && Static112.anInt2222 < local22) {
            throw new RuntimeException();
        } else if (local18 == 0) {
            @Pc(98) byte[] local98 = new byte[local22];
            local8.gdata(local98, 0, local22);
            return local98;
        } else {
            @Pc(44) int local44 = local8.g4();
            if (local44 < 0 || Static112.anInt2222 != 0 && local44 > Static112.anInt2222) {
                return new byte[1];
            }
            @Pc(66) byte[] local66 = new byte[local44];
            if (local18 == 1) {
                Static160.method2576(local66, local44, arg0, local22);
            } else {
                @Pc(73) Class300 local73 = Static315.aClass300_1;
                synchronized (Static315.aClass300_1) {
                    Static315.aClass300_1.method6761(local8, local66);
                }
            }
            return local66;
        }
    }
}
