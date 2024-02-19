import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class LocTypeList {

	@OriginalMember(owner = "client!gea", name = "r", descriptor = "I")
	public int anInt3390;

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "Z")
	public boolean lowDetail = false;

	@OriginalMember(owner = "client!gea", name = "l", descriptor = "Lclient!dla;")
	private SoftLruHashTable locCache = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!gea", name = "f", descriptor = "Lclient!dla;")
	public final SoftLruHashTable aSoftLruHashTable74 = new SoftLruHashTable(500);

	@OriginalMember(owner = "client!gea", name = "k", descriptor = "Lclient!dla;")
	public final SoftLruHashTable aSoftLruHashTable75 = new SoftLruHashTable(30);

	@OriginalMember(owner = "client!gea", name = "q", descriptor = "Lclient!dla;")
	public final SoftLruHashTable aSoftLruHashTable76 = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "Lclient!sb;")
	public final Js5 modelArchive;

	@OriginalMember(owner = "client!gea", name = "j", descriptor = "Lclient!ul;")
	private final ModeGame modeGame;

	@OriginalMember(owner = "client!gea", name = "h", descriptor = "I")
	private final int language;

	@OriginalMember(owner = "client!gea", name = "p", descriptor = "Lclient!sb;")
	private final Js5 configLocArchive;

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "Z")
	public boolean members;

	@OriginalMember(owner = "client!gea", name = "i", descriptor = "[Ljava/lang/String;")
	private final String[] ops;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Lclient!ul;IZLclient!sb;Lclient!sb;)V")
	public LocTypeList(@OriginalArg(0) ModeGame modeGame, @OriginalArg(1) int language, @OriginalArg(2) boolean members, @OriginalArg(3) Js5 configLocArchive, @OriginalArg(4) Js5 modelArchive) {
		this.modelArchive = modelArchive;
		this.modeGame = modeGame;
		this.language = language;
		this.configLocArchive = configLocArchive;
		this.members = members;

		if (this.configLocArchive != null) {
			@Pc(53) int max = this.configLocArchive.capacity() - 1;
			this.configLocArchive.getGroupCapacity(max);
		}

		if (ModeGame.GAME_RUNESCAPE == this.modeGame) {
			this.ops = new String[] { null, null, null, null, null, LocalizedText.EXAMINE.get(this.language) };
		} else {
			this.ops = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V")
	public void method3058() {
		@Pc(2) SoftLruHashTable cache = this.locCache;
		synchronized (cache) {
			this.locCache.removeSoft();
		}

		cache = this.aSoftLruHashTable74;
		synchronized (cache) {
			this.aSoftLruHashTable74.removeSoft();
		}

		cache = this.aSoftLruHashTable75;
		synchronized (cache) {
			this.aSoftLruHashTable75.removeSoft();
		}

		cache = this.aSoftLruHashTable76;
		synchronized (cache) {
			this.aSoftLruHashTable76.removeSoft();
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZI)V")
	public void setMembers(@OriginalArg(0) boolean members) {
		if (members != this.members) {
			this.members = members;
			this.clearCaches();
		}
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V")
	public void clearCaches() {
		@Pc(14) SoftLruHashTable cache = this.locCache;
		synchronized (cache) {
			this.locCache.clear();
		}

		cache = this.aSoftLruHashTable74;
		synchronized (cache) {
			this.aSoftLruHashTable74.clear();
		}

		cache = this.aSoftLruHashTable75;
		synchronized (cache) {
			this.aSoftLruHashTable75.clear();
		}

		cache = this.aSoftLruHashTable76;
		synchronized (cache) {
			this.aSoftLruHashTable76.clear();
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IZ)V")
	public void setLowDetail(@OriginalArg(1) boolean lowDetail) {
		if (lowDetail != this.lowDetail) {
			this.lowDetail = lowDetail;
			this.clearCaches();
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)V")
	public void initCache(@OriginalArg(1) int capacity) {
		this.locCache = new SoftLruHashTable(capacity);
	}

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "(II)Lclient!c;")
	public LocType get(@OriginalArg(0) int id) {
		@Pc(12) SoftLruHashTable locCache = this.locCache;

		@Pc(22) LocType type;
		synchronized (locCache) {
			type = (LocType) this.locCache.get(id);
		}

		if (type != null) {
			return type;
		}

		@Pc(36) Js5 configLocArchive = this.configLocArchive;
		@Pc(49) byte[] data;
		synchronized (configLocArchive) {
			data = this.configLocArchive.fetchFile(Static705.method9197(id), Static570.method7551(id));
		}

		type = new LocType();
		type.id = id;
		type.locTypes = this;
		type.ops = this.ops.clone();

		if (data != null) {
			type.decode(new Packet(data));
		}

		type.postDecode();

		if (type.breakroutefinding) {
			type.blockwalk = 0;
			type.blockrange = false;
		}

		if (!this.members && type.members) {
			type.ops = null;
			type.quests = null;
		}

		synchronized (locCache) {
			this.locCache.put(id, type);
			return type;
		}
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(II)V")
	public void cleanCaches() {
		@Pc(11) SoftLruHashTable cache = this.locCache;
		synchronized (cache) {
			this.locCache.clean(5);
		}

		cache = this.aSoftLruHashTable74;
		synchronized (cache) {
			this.aSoftLruHashTable74.clean(5);
		}

		cache = this.aSoftLruHashTable75;
		synchronized (cache) {
			this.aSoftLruHashTable75.clean(5);
		}

		cache = this.aSoftLruHashTable76;
		synchronized (cache) {
			this.aSoftLruHashTable76.clean(5);
		}
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(II)V")
	public void clearCaches(@OriginalArg(0) int arg0) {
		this.anInt3390 = arg0;

		@Pc(9) SoftLruHashTable cache = this.aSoftLruHashTable74;
		synchronized (cache) {
			this.aSoftLruHashTable74.clear();
		}

		cache = this.aSoftLruHashTable75;
		synchronized (cache) {
			this.aSoftLruHashTable75.clear();
		}

		cache = this.aSoftLruHashTable76;
		synchronized (cache) {
			this.aSoftLruHashTable76.clear();
		}
	}
}
