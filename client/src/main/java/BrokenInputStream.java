import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public final class BrokenInputStream extends InputStream {

	@OriginalMember(owner = "client!saa", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static638.sleep(30000L);
		return -1;
	}
}
