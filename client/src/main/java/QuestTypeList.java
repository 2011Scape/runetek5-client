import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bka")
public final class QuestTypeList {

	@OriginalMember(owner = "client!bka", name = "d", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable17 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!bka", name = "h", descriptor = "Lclient!sb;")
	private final Js5 aJs59;

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public QuestTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aJs59 = arg2;
		if (this.aJs59 != null) {
			this.aJs59.getGroupCapacity(35);
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(B)V")
	public void method1093() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable17;
		synchronized (this.aSoftLruHashTable17) {
			this.aSoftLruHashTable17.removeSoft();
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IB)Lclient!la;")
	public QuestType method1094(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable17;
		@Pc(16) QuestType local16;
		synchronized (this.aSoftLruHashTable17) {
			local16 = (QuestType) this.aSoftLruHashTable17.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Js5 local30 = this.aJs59;
		@Pc(39) byte[] local39;
		synchronized (this.aJs59) {
			local39 = this.aJs59.fetchFile(35, arg0);
		}
		local16 = new QuestType();
		if (local39 != null) {
			local16.method5127(new Packet(local39));
		}
		local16.method5123();
		@Pc(66) SoftLruHashTable local66 = this.aSoftLruHashTable17;
		synchronized (this.aSoftLruHashTable17) {
			this.aSoftLruHashTable17.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(II)V")
	public void method1096() {
		@Pc(11) SoftLruHashTable local11 = this.aSoftLruHashTable17;
		synchronized (this.aSoftLruHashTable17) {
			this.aSoftLruHashTable17.clean(5);
		}
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(I)V")
	public void method1098() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable17;
		synchronized (this.aSoftLruHashTable17) {
			this.aSoftLruHashTable17.clear();
		}
	}
}
