import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class SeqTypeList {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "Lclient!dla;")
	private final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "Lclient!dla;")
	private final SoftLruHashTable animFramesets = new SoftLruHashTable(100);

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "Lclient!sb;")
	private final Js5 archive;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;Lclient!sb;)V")
	public SeqTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3, @OriginalArg(4) Js5 arg4) {
		this.archive = arg2;
		if (this.archive != null) {
			@Pc(26) int local26 = this.archive.capacity() - 1;
			this.archive.getGroupCapacity(local26);
		}
		Static642.method8440(arg4, arg3);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IB)Lclient!cka;")
	public SeqType get(@OriginalArg(0) int arg0) {
		@Pc(6) SoftLruHashTable local6 = this.types;
		@Pc(16) SeqType local16;
		synchronized (this.types) {
			local16 = (SeqType) this.types.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Js5 local30 = this.archive;
		@Pc(43) byte[] local43;
		synchronized (this.archive) {
			local43 = this.archive.fetchFile(Static291.getGroupId(arg0), Static668.getFileId(arg0));
		}
		local16 = new SeqType();
		local16.id = arg0;
		if (local43 != null) {
			local16.decode(new Packet(local43));
		}
		local16.postDecode();
		@Pc(73) SoftLruHashTable local73 = this.types;
		synchronized (this.types) {
			this.types.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V")
	public void clean() {
		@Pc(6) SoftLruHashTable local6 = this.types;
		synchronized (this.types) {
			this.types.clean(5);
		}
		local6 = this.animFramesets;
		synchronized (this.animFramesets) {
			this.animFramesets.clean(5);
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
	public void removeSoft() {
		@Pc(2) SoftLruHashTable local2 = this.types;
		synchronized (this.types) {
			this.types.removeSoft();
		}
		local2 = this.animFramesets;
		synchronized (this.animFramesets) {
			this.animFramesets.removeSoft();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	public void clear() {
		@Pc(7) SoftLruHashTable local7 = this.types;
		synchronized (this.types) {
			this.types.clear();
		}
		local7 = this.animFramesets;
		synchronized (this.animFramesets) {
			this.animFramesets.clear();
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)Lclient!rw;")
	public AnimFrameset getAnimFrameset(@OriginalArg(0) int arg0) {
		@Pc(12) SoftLruHashTable local12 = this.animFramesets;
		synchronized (this.animFramesets) {
			@Pc(22) AnimFrameset local22 = (AnimFrameset) this.animFramesets.get((long) arg0);
			if (local22 == null) {
				local22 = new AnimFrameset(arg0);
				this.animFramesets.put((long) arg0, local22);
			}
			return local22.method7565() ? local22 : null;
		}
	}
}
