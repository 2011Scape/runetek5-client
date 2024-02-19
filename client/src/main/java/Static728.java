import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static728 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!sb;II)Lclient!bn;")
	public static MidiSong method1153(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.fetchFile(arg1, arg2);
		return local5 == null ? null : new MidiSong(new Packet(local5));
	}
}
