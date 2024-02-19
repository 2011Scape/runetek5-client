import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class NpcTypeList {

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
	public int anInt8088;

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable169 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "Lclient!dla;")
	public final SoftLruHashTable aSoftLruHashTable170 = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "Lclient!dla;")
	public final SoftLruHashTable aSoftLruHashTable171 = new SoftLruHashTable(5);

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "Lclient!sb;")
	public final Js5 aJs5102;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "Lclient!sb;")
	private final Js5 aJs5101;

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "Z")
	public boolean aBoolean621;

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
	private final int anInt8086;

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "Lclient!ul;")
	public final ModeGame aModeGame6;

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray39;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!ul;IZLclient!sb;Lclient!sb;)V")
	public NpcTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Js5 arg3, @OriginalArg(4) Js5 arg4) {
		this.aJs5102 = arg4;
		this.aJs5101 = arg3;
		this.aBoolean621 = arg2;
		this.anInt8086 = arg1;
		this.aModeGame6 = arg0;
		if (this.aJs5101 != null) {
			@Pc(44) int local44 = this.aJs5101.capacity() - 1;
			this.aJs5101.getGroupCapacity(local44);
		}
		if (ModeGame.GAME_RUNESCAPE == this.aModeGame6) {
			this.aStringArray39 = new String[] { null, null, null, null, null, LocalizedText.EXAMINE.get(this.anInt8086) };
		} else {
			this.aStringArray39 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
	public void method7085() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable169;
		synchronized (this.aSoftLruHashTable169) {
			this.aSoftLruHashTable169.clean(5);
		}
		local2 = this.aSoftLruHashTable170;
		synchronized (this.aSoftLruHashTable170) {
			this.aSoftLruHashTable170.clean(5);
		}
		local2 = this.aSoftLruHashTable171;
		synchronized (this.aSoftLruHashTable171) {
			this.aSoftLruHashTable171.clean(5);
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V")
	public void method7086() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable169;
		synchronized (this.aSoftLruHashTable169) {
			this.aSoftLruHashTable169.clear();
		}
		local2 = this.aSoftLruHashTable170;
		synchronized (this.aSoftLruHashTable170) {
			this.aSoftLruHashTable170.clear();
		}
		local2 = this.aSoftLruHashTable171;
		synchronized (this.aSoftLruHashTable171) {
			this.aSoftLruHashTable171.clear();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public void method7089() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable169;
		synchronized (this.aSoftLruHashTable169) {
			this.aSoftLruHashTable169.removeSoft();
		}
		local2 = this.aSoftLruHashTable170;
		synchronized (this.aSoftLruHashTable170) {
			this.aSoftLruHashTable170.removeSoft();
		}
		local2 = this.aSoftLruHashTable171;
		synchronized (this.aSoftLruHashTable171) {
			this.aSoftLruHashTable171.removeSoft();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BZ)V")
	public void method7090(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean621) {
			this.aBoolean621 = arg0;
			this.method7086();
		}
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V")
	public void method7091() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable170;
		synchronized (this.aSoftLruHashTable170) {
			this.aSoftLruHashTable170.clear();
		}
		local2 = this.aSoftLruHashTable171;
		synchronized (this.aSoftLruHashTable171) {
			this.aSoftLruHashTable171.clear();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)Lclient!o;")
	public NpcType method7092(@OriginalArg(0) int arg0) {
		@Pc(14) SoftLruHashTable local14 = this.aSoftLruHashTable169;
		@Pc(24) NpcType local24;
		synchronized (this.aSoftLruHashTable169) {
			local24 = (NpcType) this.aSoftLruHashTable169.get((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(38) Js5 local38 = this.aJs5101;
		@Pc(51) byte[] local51;
		synchronized (this.aJs5101) {
			local51 = this.aJs5101.fetchFile(Static713.method9336(arg0), Static612.method8237(arg0));
		}
		local24 = new NpcType();
		local24.aNpcTypeList1 = this;
		local24.anInt6744 = arg0;
		local24.aStringArray34 = (String[]) this.aStringArray39.clone();
		if (local51 != null) {
			local24.method5986(new Packet(local51));
		}
		local24.method5983();
		@Pc(90) SoftLruHashTable local90 = this.aSoftLruHashTable169;
		synchronized (this.aSoftLruHashTable169) {
			this.aSoftLruHashTable169.put((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZI)V")
	public void method7093(@OriginalArg(1) int arg0) {
		this.anInt8088 = arg0;
		@Pc(9) SoftLruHashTable local9 = this.aSoftLruHashTable170;
		synchronized (this.aSoftLruHashTable170) {
			this.aSoftLruHashTable170.clear();
		}
		local9 = this.aSoftLruHashTable171;
		synchronized (this.aSoftLruHashTable171) {
			this.aSoftLruHashTable171.clear();
		}
	}
}
