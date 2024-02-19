import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class QuickChatPhraseTypeList {

	@OriginalMember(owner = "client!gba", name = "j", descriptor = "I")
	public int anInt3261 = 0;

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "I")
	public int anInt3264 = 0;

	@OriginalMember(owner = "client!gba", name = "e", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable70 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!gba", name = "f", descriptor = "Lclient!raa;")
	private QuickChatCommandDecoder anQuickChatCommandDecoder1 = null;

	@OriginalMember(owner = "client!gba", name = "i", descriptor = "Lclient!sb;")
	private final Js5 aJs540;

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "Lclient!sb;")
	private final Js5 aJs541;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(ILclient!sb;Lclient!sb;Lclient!raa;)V")
	public QuickChatPhraseTypeList(@OriginalArg(0) int arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) QuickChatCommandDecoder arg3) {
		this.anQuickChatCommandDecoder1 = arg3;
		this.aJs540 = arg1;
		this.aJs541 = arg2;
		if (this.aJs540 != null) {
			this.anInt3264 = this.aJs540.getGroupCapacity(1);
		}
		if (this.aJs541 != null) {
			this.anInt3261 = this.aJs541.getGroupCapacity(1);
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!it;J[II)Ljava/lang/String;")
	public String method2948(@OriginalArg(0) Class184 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int[] arg2) {
		if (this.anQuickChatCommandDecoder1 != null) {
			@Pc(22) String local22 = this.anQuickChatCommandDecoder1.method5631(arg1, arg0, arg2);
			if (local22 != null) {
				return local22;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZ)Lclient!ih;")
	public QuickChatPhraseType method2950(@OriginalArg(0) int arg0) {
		@Pc(11) QuickChatPhraseType local11 = (QuickChatPhraseType) this.aSoftLruHashTable70.get((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(28) byte[] local28;
		if (arg0 >= 32768) {
			local28 = this.aJs541.fetchFile(1, arg0 & 0x7FFF);
		} else {
			local28 = this.aJs540.fetchFile(1, arg0);
		}
		local11 = new QuickChatPhraseType();
		local11.aQuickChatPhraseTypeList1 = this;
		if (local28 != null) {
			local11.method3899(new Packet(local28));
		}
		if (arg0 >= 32768) {
			local11.method3902();
		}
		this.aSoftLruHashTable70.put((long) arg0, local11);
		return local11;
	}
}
