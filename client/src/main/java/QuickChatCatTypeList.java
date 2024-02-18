import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class QuickChatCatTypeList {

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable79 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "Lclient!sb;")
	private final Js5 aJs551;

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "Lclient!sb;")
	private final Js5 aJs550;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(ILclient!sb;Lclient!sb;)V")
	public QuickChatCatTypeList(@OriginalArg(0) int arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs551 = arg2;
		this.aJs550 = arg1;
		if (this.aJs550 != null) {
			this.aJs550.method7608(0);
		}
		if (this.aJs551 != null) {
			this.aJs551.method7608(0);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BI)Lclient!bq;")
	public QuickChatCatType method3234(@OriginalArg(1) int arg0) {
		@Pc(11) QuickChatCatType local11 = (QuickChatCatType) this.aSoftLruHashTable79.method2156((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(28) byte[] local28;
		if (arg0 < 32768) {
			local28 = this.aJs550.method7595(arg0, 0);
		} else {
			local28 = this.aJs551.method7595(arg0 & 0x7FFF, 0);
		}
		local11 = new QuickChatCatType();
		if (local28 != null) {
			local11.method1180(new Packet(local28));
		}
		if (arg0 >= 32768) {
			local11.method1186();
		}
		this.aSoftLruHashTable79.method2150(local11, (long) arg0);
		return local11;
	}
}
