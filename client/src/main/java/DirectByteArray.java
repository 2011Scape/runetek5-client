import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class DirectByteArray extends ByteArray {

	@OriginalMember(owner = "client!id", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer buffer;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	private DirectByteArray() {
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([BI)V")
	@Override
	public void set(@OriginalArg(0) byte[] src) {
		this.buffer = ByteBuffer.allocateDirect(src.length);
		this.buffer.position(0);
		this.buffer.put(src);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BII)[B")
	@Override
	public byte[] method3848(@OriginalArg(2) int pos) {
		@Pc(2) byte[] src = new byte[32768];
		this.buffer.position(pos);
		this.buffer.get(src, 0, 32768);
		return src;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] get() {
		@Pc(4) byte[] src = new byte[this.buffer.capacity()];
		this.buffer.position(0);
		this.buffer.get(src);
		return src;
	}
}
