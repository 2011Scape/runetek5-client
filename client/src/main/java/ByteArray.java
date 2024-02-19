import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lla")
public abstract class ByteArray {

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "Z")
    public static boolean directBuffersUnsupported = false;

    @OriginalMember(owner = "client!hla", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
    public static Object wrap(@OriginalArg(0) byte[] src) {
        if (src == null) {
            return null;
        }

        if (src.length > 136 && !directBuffersUnsupported) {
            try {
                @Pc(25) ByteArray array = (ByteArray) Class.forName("DirectByteArray").getDeclaredConstructor().newInstance();
                array.set(src);
                return array;
            } catch (@Pc(32) Throwable ex) {
                directBuffersUnsupported = true;
            }
        }

        return src;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BZLjava/lang/Object;)[B")
    public static byte[] unwrap(@OriginalArg(2) Object arg1, @OriginalArg(1) boolean arg0) {
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            @Pc(14) byte[] local14 = (byte[]) arg1;
            return arg0 ? Static163.method8849(local14) : local14;
        } else if (arg1 instanceof ByteArray) {
            @Pc(29) ByteArray local29 = (ByteArray) arg1;
            return local29.get();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lla", name = "a", descriptor = "(BII)[B")
	public abstract byte[] method3848(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "([BI)V")
	public abstract void set(@OriginalArg(0) byte[] src);

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(B)[B")
	public abstract byte[] get();
}
