import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class LocType {

	@OriginalMember(owner = "client!c", name = "sb", descriptor = "[B")
	public byte[] shapes;

	@OriginalMember(owner = "client!c", name = "Wb", descriptor = "B")
	private byte hue;

	@OriginalMember(owner = "client!c", name = "Bb", descriptor = "[Ljava/lang/String;")
	public String[] ops;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	public int[] quests;

	@OriginalMember(owner = "client!c", name = "H", descriptor = "[I")
	public int[] multiloc;

	@OriginalMember(owner = "client!c", name = "ub", descriptor = "[S")
	public short[] retex_s;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "[B")
	private byte[] recol_dpalette;

	@OriginalMember(owner = "client!c", name = "kb", descriptor = "Lclient!av;")
	private HashTable params;

	@OriginalMember(owner = "client!c", name = "mb", descriptor = "[S")
	public short[] recol_s;

	@OriginalMember(owner = "client!c", name = "S", descriptor = "Lclient!gea;")
	public LocTypeList locTypes;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!c", name = "I", descriptor = "[[I")
	public int[][] models;

	@OriginalMember(owner = "client!c", name = "Tb", descriptor = "[I")
	public int[] bgsounds;

	@OriginalMember(owner = "client!c", name = "ob", descriptor = "[S")
	private short[] retex_d;

	@OriginalMember(owner = "client!c", name = "Vb", descriptor = "B")
	private byte saturation;

	@OriginalMember(owner = "client!c", name = "Db", descriptor = "[S")
	private short[] recol_d;

	@OriginalMember(owner = "client!c", name = "D", descriptor = "B")
	private byte luminance;

	@OriginalMember(owner = "client!c", name = "Rb", descriptor = "Z")
	public boolean aBoolean88 = false;

	@OriginalMember(owner = "client!c", name = "B", descriptor = "Z")
	public boolean hardshadow = true;

	@OriginalMember(owner = "client!c", name = "db", descriptor = "I")
	private int resizey = 128;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "I")
	private int postoffsety = 0;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "B")
	private byte weight = 0;

	@OriginalMember(owner = "client!c", name = "O", descriptor = "I")
	public int decorheight = 0;

	@OriginalMember(owner = "client!c", name = "Gb", descriptor = "I")
	public int bgsoundmax = 0;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "I")
	public int length = 1;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "I")
	public int cursor1op = -1;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	public int bgsounddistance = 0;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "I")
	private int postoffsetx = 0;

	@OriginalMember(owner = "client!c", name = "K", descriptor = "I")
	private int resizex = 128;

	@OriginalMember(owner = "client!c", name = "qb", descriptor = "Ljava/lang/String;")
	public String name = "null";

	@OriginalMember(owner = "client!c", name = "G", descriptor = "I")
	private int offsetz = 0;

	@OriginalMember(owner = "client!c", name = "ib", descriptor = "Z")
	public boolean members = false;

	@OriginalMember(owner = "client!c", name = "lb", descriptor = "I")
	public int raiseobject = -1;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "I")
	public int mel = -1;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "I")
	public int occlude = -1;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "I")
	public int bgsoundradius = 0;

	@OriginalMember(owner = "client!c", name = "z", descriptor = "I")
	public int bgsound = -1;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	private int multivarbit = -1;

	@OriginalMember(owner = "client!c", name = "Nb", descriptor = "Z")
	public boolean breakroutefinding = false;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "Z")
	public boolean mapsceneflipy = false;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private int resizez = 128;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "I")
	private int postoffsetz = 0;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public int bgsoundvol = 255;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "I")
	public int mapsceneangle = 0;

	@OriginalMember(owner = "client!c", name = "Cb", descriptor = "[I")
	private int[] anims = null;

	@OriginalMember(owner = "client!c", name = "nb", descriptor = "I")
	private int hillskewAmount = -1;

	@OriginalMember(owner = "client!c", name = "Sb", descriptor = "I")
	public int bgsoundmin = 0;

	@OriginalMember(owner = "client!c", name = "L", descriptor = "I")
	public int cursor1 = -1;

	@OriginalMember(owner = "client!c", name = "yb", descriptor = "I")
	public int occludewidth = 960;

	@OriginalMember(owner = "client!c", name = "W", descriptor = "Z")
	public boolean randseq = true;

	@OriginalMember(owner = "client!c", name = "U", descriptor = "I")
	public int wallwidth = 64;

	@OriginalMember(owner = "client!c", name = "vb", descriptor = "[I")
	private int[] animWeights = null;

	@OriginalMember(owner = "client!c", name = "X", descriptor = "B")
	private byte hillskewType = 0;

	@OriginalMember(owner = "client!c", name = "jb", descriptor = "I")
	public int bgsoundratemax = 256;

	@OriginalMember(owner = "client!c", name = "tb", descriptor = "I")
	public int cursor2op = -1;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	private int offsetx = 0;

	@OriginalMember(owner = "client!c", name = "Y", descriptor = "I")
	private int ambient = 0;

	@OriginalMember(owner = "client!c", name = "M", descriptor = "I")
	public int blockwalk = 2;

	@OriginalMember(owner = "client!c", name = "bb", descriptor = "Z")
	public boolean aBoolean92 = false;

	@OriginalMember(owner = "client!c", name = "N", descriptor = "Z")
	public boolean hasAnimation = false;

	@OriginalMember(owner = "client!c", name = "Eb", descriptor = "I")
	private int offsety = 0;

	@OriginalMember(owner = "client!c", name = "E", descriptor = "I")
	public int forceapproach = 0;

	@OriginalMember(owner = "client!c", name = "fb", descriptor = "I")
	public int bgsoundratemin = 256;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "I")
	private int contrast = 0;

	@OriginalMember(owner = "client!c", name = "gb", descriptor = "Z")
	public boolean forcedecor = false;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "Z")
	public boolean shouldRender = false;

	@OriginalMember(owner = "client!c", name = "P", descriptor = "Z")
	public boolean blockrange = true;

	@OriginalMember(owner = "client!c", name = "Mb", descriptor = "Z")
	public boolean aBoolean91 = false;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	public boolean sharelight = false;

	@OriginalMember(owner = "client!c", name = "Ub", descriptor = "I")
	public int width = 1;

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
	public int occludeheight = 0;

	@OriginalMember(owner = "client!c", name = "xb", descriptor = "I")
	public int mapscene = -1;

	@OriginalMember(owner = "client!c", name = "pb", descriptor = "I")
	private int multivarp = -1;

	@OriginalMember(owner = "client!c", name = "Ab", descriptor = "I")
	public int cursor2 = -1;

	@OriginalMember(owner = "client!c", name = "Z", descriptor = "Z")
	public boolean shadow = true;

	@OriginalMember(owner = "client!c", name = "zb", descriptor = "Z")
	public boolean mapscenerotates = false;

	@OriginalMember(owner = "client!c", name = "Jb", descriptor = "Z")
	public boolean mirror = false;

	@OriginalMember(owner = "client!c", name = "Ib", descriptor = "I")
	public int active = -1;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Z")
	public boolean hasAnims() {
		return this.anims != null && this.anims.length > 1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ge;II)V")
	private void decode(@OriginalArg(0) Packet buf, @OriginalArg(1) int opcode) {
		if (opcode == 1 || opcode == 5) {
			if (opcode == 5 && this.locTypes.lowDetail) {
				this.skipModels(buf);
			}

			int shapeCount = buf.g1();
			this.shapes = new byte[shapeCount];
			this.models = new int[shapeCount][];
			for (int i = 0; i < shapeCount; i++) {
				this.shapes[i] = buf.g1b();

				int modelCount = buf.g1();
				this.models[i] = new int[modelCount];

				for (int j = 0; j < modelCount; j++) {
					this.models[i][j] = buf.g2();
				}
			}

			if (opcode == 5 && !this.locTypes.lowDetail) {
				this.skipModels(buf);
			}
		} else if (opcode == 2) {
			this.name = buf.gjstr();
		} else if (opcode == 14) {
			this.width = buf.g1();
		} else if (opcode == 15) {
			this.length = buf.g1();
		} else if (opcode == 17) {
			this.blockrange = false;
			this.blockwalk = 0;
		} else if (opcode == 18) {
			this.blockrange = false;
		} else if (opcode == 19) {
			this.active = buf.g1();
		} else if (opcode == 21) {
			// hillskew=yes
			this.hillskewType = 1;
		} else if (opcode == 22) {
			this.sharelight = true;
		} else if (opcode == 23) {
			this.occlude = 1;
		} else if (opcode == 24) {
			int seq = buf.g2();
			if (seq != 65535) {
				this.anims = new int[] { seq };
			}
		} else if (opcode == 27) {
			this.blockwalk = 1;
		} else if (opcode == 28) {
			this.wallwidth = buf.g1() << 2;
		} else if (opcode == 29) {
			this.ambient = buf.g1b();
		} else if (opcode == 39) {
			this.contrast = buf.g1b() * 5;
		} else if (opcode >= 30 && opcode < 35) {
			this.ops[opcode - 30] = buf.gjstr();
		} else if (opcode == 40) {
			int count = buf.g1();
			this.recol_s = new short[count];
			this.recol_d = new short[count];
			for (int i = 0; i < count; i++) {
				this.recol_d[i] = (short) buf.g2();
				this.recol_s[i] = (short) buf.g2();
			}
		} else if (opcode == 41) {
			int count = buf.g1();
			this.retex_s = new short[count];
			this.retex_d = new short[count];
			for (int i = 0; i < count; i++) {
				this.retex_d[i] = (short) buf.g2();
				this.retex_s[i] = (short) buf.g2();
			}
		} else if (opcode == 42) {
			int count = buf.g1();
			this.recol_dpalette = new byte[count];
			for (int i = 0; i < count; i++) {
				this.recol_dpalette[i] = buf.g1b();
			}
		} else if (opcode == 62) {
			this.mirror = true;
		} else if (opcode == 64) {
			this.shadow = false;
		} else if (opcode == 65) {
			this.resizex = buf.g2();
		} else if (opcode == 66) {
			this.resizey = buf.g2();
		} else if (opcode == 67) {
			this.resizez = buf.g2();
		} else if (opcode == 69) {
			this.forceapproach = buf.g1();
		} else if (opcode == 70) {
			this.offsetx = buf.g2s() << 2;
		} else if (opcode == 71) {
			this.offsety = buf.g2s() << 2;
		} else if (opcode == 72) {
			this.offsetz = buf.g2s() << 2;
		} else if (opcode == 73) {
			this.forcedecor = true;
		} else if (opcode == 74) {
			this.breakroutefinding = true;
		} else if (opcode == 75) {
			this.raiseobject = buf.g1();
		} else if (opcode == 77 || opcode == 92) {
			this.multivarbit = buf.g2();
			if (this.multivarbit == 65535) {
				this.multivarbit = -1;
			}

			this.multivarp = buf.g2();
			if (this.multivarp == 65535) {
				this.multivarp = -1;
			}

			int defaultValue = -1;
			if (opcode == 92) {
				defaultValue = buf.g2();
				if (defaultValue == 65535) {
					defaultValue = -1;
				}
			}

			int count = buf.g1();
			this.multiloc = new int[count + 2];
			for (int i = 0; i <= count; i++) {
				this.multiloc[i] = buf.g2();
				if (this.multiloc[i] == 65535) {
					this.multiloc[i] = -1;
				}
			}

			this.multiloc[count + 1] = defaultValue;
		} else if (opcode == 78) {
			this.bgsound = buf.g2();
			this.bgsoundradius = buf.g1();
		} else if (opcode == 79) {
			this.bgsoundmin = buf.g2();
			this.bgsoundmax = buf.g2();
			this.bgsoundradius = buf.g1();

			int count = buf.g1();
			this.bgsounds = new int[count];
			for (int i = 0; i < count; i++) {
				this.bgsounds[i] = buf.g2();
			}
		} else if (opcode == 81) {
			// treeskew
			this.hillskewType = 2;
			this.hillskewAmount = buf.g1() * 256;
		} else if (opcode == 82) {
			this.shouldRender = true;
		} else if (opcode == 88) {
			this.hardshadow = false;
		} else if (opcode == 89) {
			this.randseq = false;
		} else if (opcode == 91) {
			this.members = true;
		} else if (opcode == 93) {
			// rotateskew
			this.hillskewType = 3;
			this.hillskewAmount = buf.g2();
		} else if (opcode == 94) {
			// ceilingskew
			this.hillskewType = 4;
		} else if (opcode == 95) {
			// skewtofit
			this.hillskewType = 5;
			this.hillskewAmount = buf.g2s();
		} else if (opcode == 97) {
			this.mapscenerotates = true;
		} else if (opcode == 98) {
			// todo: real name
			this.hasAnimation = true;
		} else if (opcode == 99) {
			this.cursor1op = buf.g1();
			this.cursor1 = buf.g2();
		} else if (opcode == 100) {
			this.cursor2op = buf.g1();
			this.cursor2 = buf.g2();
		} else if (opcode == 101) {
			this.mapsceneangle = buf.g1();
		} else if (opcode == 102) {
			this.mapscene = buf.g2();
		} else if (opcode == 103) {
			this.occlude = 0;
		} else if (opcode == 104) {
			this.bgsoundvol = buf.g1();
		} else if (opcode == 105) {
			this.mapsceneflipy = true;
		} else if (opcode == 106) {
			int count = buf.g1();
			int totalWeight = 0;

			this.anims = new int[count];
			this.animWeights = new int[count];
			for (int i = 0; i < count; i++) {
				this.anims[i] = buf.g2();
				if (this.anims[i] == 65535) {
					this.anims[i] = -1;
				}

				totalWeight += this.animWeights[i] = buf.g1();
			}

			for (int i = 0; i < count; i++) {
				this.animWeights[i] = this.animWeights[i] * 65535 / totalWeight;
			}
		} else if (opcode == 107) {
			this.mel = buf.g2();
		} else if (opcode >= 150 && opcode < 155) {
			this.ops[opcode - 150] = buf.gjstr();
			if (!this.locTypes.members) {
				this.ops[opcode - 150] = null;
			}
		} else if (opcode == 160) {
			int count = buf.g1();
			this.quests = new int[count];
			for (int i = 0; i < count; i++) {
				this.quests[i] = buf.g2();
			}
		} else if (opcode == 162) {
			// rotateskew
			this.hillskewType = 3;
			this.hillskewAmount = buf.g4();
		} else if (opcode == 163) {
			// tint
			this.hue = buf.g1b();
			this.saturation = buf.g1b();
			this.luminance = buf.g1b();
			this.weight = buf.g1b();
		} else if (opcode == 164) {
			this.postoffsetx = buf.g2s();
		} else if (opcode == 165) {
			this.postoffsety = buf.g2s();
		} else if (opcode == 166) {
			this.postoffsetz = buf.g2s();
		} else if (opcode == 167) {
			this.decorheight = buf.g2();
		} else if (opcode == 168) {
			// todo: identify
			this.aBoolean88 = true;
		} else if (opcode == 169) {
			// todo: identify
			this.aBoolean92 = true;
		} else if (opcode == 170) {
			this.occludewidth = buf.gSamrt1or2();
		} else if (opcode == 171) {
			this.occludeheight = buf.gSamrt1or2();
		} else if (opcode == 173) {
			this.bgsoundratemin = buf.g2();
			this.bgsoundratemax = buf.g2();
		} else if (opcode == 177) {
			// todo: identify
			this.aBoolean91 = true;
		} else if (opcode == 178) {
			this.bgsounddistance = buf.g1();
		} else if (opcode == 249) {
			int count = buf.g1();

			if (this.params == null) {
				int buckets = IntUtils.clp2(count);
				this.params = new HashTable(buckets);
			}

			for (int i = 0; i < count; i++) {
				@Pc(872) boolean isString = buf.g1() == 1;
				int id = buf.g3();

				@Pc(885) Linkable node;
				if (isString) {
					node = new StringNode(buf.gjstr());
				} else {
					node = new IntNode(buf.g4());
				}

				this.params.put(id, node);
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;IZ)Ljava/lang/String;")
	public String getParam(@OriginalArg(0) String defaultValue, @OriginalArg(1) int id) {
		if (this.params == null) {
			return defaultValue;
		} else {
			@Pc(25) StringNode node = (StringNode) this.params.get(id);
			return node == null ? defaultValue : node.value;
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)Z")
	public boolean hasAnim(@OriginalArg(0) int anim) {
		if (this.anims != null && anim != -1) {
			for (@Pc(21) int i = 0; i < this.anims.length; i++) {
				if (anim == this.anims[i]) {
					return true;
				}
			}
		}

		return false;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)Z")
	public boolean hasAnim() {
		return this.anims != null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!uk;)Lclient!c;")
	public LocType getMultiLoc(@OriginalArg(1) VarDomain domain) {
		@Pc(5) int value = -1;
		if (this.multivarbit != -1) {
			value = domain.method6864(this.multivarbit);
		} else if (this.multivarp != -1) {
			value = domain.method6865(this.multivarp);
		}

		if (value < 0 || this.multiloc.length - 1 <= value || this.multiloc[value] == -1) {
			@Pc(74) int id = this.multiloc[this.multiloc.length - 1];
			return id == -1 ? null : this.locTypes.get(id);
		} else {
			return this.locTypes.get(this.multiloc[value]);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)Z")
	public boolean method1302() {
		if (this.models == null) {
			return true;
		}

		@Pc(11) boolean success = true;
		@Pc(15) Js5 modelArchive = this.locTypes.modelArchive;
		synchronized (modelArchive) {
			for (@Pc(19) int shape = 0; shape < this.models.length; shape++) {
				for (@Pc(22) int model = 0; model < this.models[shape].length; model++) {
					success &= this.locTypes.modelArchive.isFileReady(this.models[shape][model], 0);
				}
			}

			return success;
		}
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Z")
	public boolean hasBgSound() {
		if (this.multiloc == null) {
			return this.bgsound != -1 || this.bgsounds != null;
		}

		for (@Pc(35) int i = 0; i < this.multiloc.length; i++) {
			if (this.multiloc[i] != -1) {
				@Pc(52) LocType type = this.locTypes.get(this.multiloc[i]);
				if (type.bgsound != -1 || type.bgsounds != null) {
					return true;
				}
			}
		}

		return false;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)Z")
	public boolean method1304(@OriginalArg(0) int shape) {
		if (this.models == null) {
			return true;
		}

		@Pc(13) Js5 modelArchive = this.locTypes.modelArchive;
		synchronized (modelArchive) {
			for (@Pc(26) int i = 0; i < this.shapes.length; i++) {
				if (shape == this.shapes[i]) {
					for (@Pc(35) int j = 0; j < this.models[i].length; j++) {
						if (!this.locTypes.modelArchive.isFileReady(this.models[i][j], 0)) {
							return false;
						}
					}

					return true;
				}
			}

			return true;
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(BLclient!ge;)V")
	public void decode(@OriginalArg(1) Packet buf) {
		while (true) {
			@Pc(3) int opcode = buf.g1();
			if (opcode == 0) {
				return;
			}

			this.decode(buf, opcode);
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public void postDecode() {
		if (this.active == -1) {
			this.active = 0;

			if (this.shapes != null && this.shapes.length == 1 && this.shapes[0] == 10) {
				this.active = 1;
			}

			for (@Pc(43) int i = 0; i < 5; i++) {
				if (this.ops[i] != null) {
					this.active = 1;
					break;
				}
			}
		}

		if (this.raiseobject == -1) {
			this.raiseobject = this.blockwalk == 0 ? 0 : 1;
		}

		if (this.hasAnim() || this.hasAnimation || this.multiloc != null) {
			this.aBoolean91 = true;
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(I)I")
	public int method1307() {
		if (this.anims != null) {
			if (this.anims.length <= 1) {
				return this.anims[0];
			}

			@Pc(34) int chance = (int) (Math.random() * 65535.0D);
			for (@Pc(36) int i = 0; i < this.anims.length; i++) {
				if (chance <= this.animWeights[i]) {
					return this.anims[i];
				}

				chance -= this.animWeights[i];
			}
		}

		return -1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILclient!s;ZBIILclient!ha;Lclient!gp;ILclient!s;)Lclient!od;")
	public Class272 method1309(@OriginalArg(0) int angle, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class178 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int shape, @OriginalArg(8) Class19 arg7, @OriginalArg(9) Class150 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class178 arg10) {
		if (Static449.method6117(shape)) {
			shape = 4;
		}

		@Pc(21) long local21 = angle + ((long) this.id << 10) + ((long) shape << 3);
		local21 |= (long) arg7.anInt8962 << 29;
		if (arg8 != null) {
			local21 |= arg8.aLong119 << 32;
		}

		@Pc(40) int local40 = arg9;
		if (this.hillskewType == 3) {
			local40 = arg9 | 0x7;
		} else {
			if (this.hillskewType != 0 || this.postoffsety != 0) {
				local40 = arg9 | 0x2;
			}
			if (this.postoffsetx != 0) {
				local40 |= 0x1;
			}
			if (this.postoffsetz != 0) {
				local40 |= 0x4;
			}
		}

		if (arg4) {
			local40 |= 0x40000;
		}

		@Pc(96) SoftLruHashTable cache = this.locTypes.aSoftLruHashTable75;
		@Pc(106) Class272 local106;
		synchronized (cache) {
			local106 = (Class272) this.locTypes.aSoftLruHashTable75.get(local21);
		}

		@Pc(120) Model local120 = local106 == null ? null : local106.model;
		@Pc(122) SecondaryLinkable_Sub9 local122 = null;
		if (local120 != null && arg7.method7960(local120.ua(), local40) == 0) {
			local120 = local106.model;
			local122 = local106.aClass2_Sub2_Sub9_5;
			if (arg4 && local122 == null) {
				local122 = local106.aClass2_Sub2_Sub9_5 = local120.ba(null);
			}
		} else {
			if (local120 != null) {
				local40 = arg7.method8013(local40, local120.ua());
			}
			@Pc(144) int local144 = local40;
			if (shape == 10 && angle > 3) {
				local144 = local40 | 0x5;
			}
			local120 = this.getModel(arg7, local144, arg8, angle, shape);
			if (local120 == null) {
				return null;
			}
			if (shape == 10 && angle > 3) {
				local120.a(2048);
			}
			if (arg4) {
				local122 = local120.ba(null);
			}
			local120.s(local40);
			local106 = new Class272();
			local106.aClass2_Sub2_Sub9_5 = local122;
			local106.model = local120;
			@Pc(210) SoftLruHashTable local210 = this.locTypes.aSoftLruHashTable75;
			synchronized (this.locTypes.aSoftLruHashTable75) {
				this.locTypes.aSoftLruHashTable75.put(local21, local106);
			}
		}

		@Pc(271) boolean local271 = this.hillskewType != 0 && (arg3 != null || arg10 != null);
		@Pc(292) boolean local292 = this.postoffsetx != 0 || this.postoffsety != 0 || this.postoffsetz != 0;
		if (local271 || local292) {
			local120 = local120.method7495((byte) 0, local40, true);
			if (local271) {
				local120.p(this.hillskewType, this.hillskewAmount, arg3, arg10, arg2, arg5, arg1);
			}
			if (local292) {
				local120.H(this.postoffsetx, this.postoffsety, this.postoffsetz);
			}
			local120.s(arg9);
		} else {
			local120 = local120.method7495((byte) 0, arg9, true);
		}

		Static270.aClass272_1.model = local120;
		Static270.aClass272_1.aClass2_Sub2_Sub9_5 = local122;
		return Static270.aClass272_1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIILclient!s;Lclient!gu;ILclient!ha;Lclient!s;Lclient!gp;II)Lclient!ka;")
	public Model getModel(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class178 arg4, @OriginalArg(5) Class152 arg5, @OriginalArg(7) Class19 arg6, @OriginalArg(8) Class178 arg7, @OriginalArg(9) Class150 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (Static449.method6117(arg2)) {
			arg2 = 4;
		}

		@Pc(22) long local22 = ((long) this.id << 10) + (((long) arg2 << 3) + arg0);
		@Pc(24) int local24 = arg9;
		local22 |= (long) arg6.anInt8962 << 29;
		if (arg8 != null) {
			local22 |= arg8.aLong119 << 32;
		}

		if (arg5 != null) {
			arg9 |= arg5.method9101();
		}

		if (this.hillskewType == 3) {
			arg9 |= 0x7;
		} else {
			if (this.hillskewType != 0 || this.postoffsety != 0) {
				arg9 |= 0x2;
			}
			if (this.postoffsetx != 0) {
				arg9 |= 0x1;
			}
			if (this.postoffsetz != 0) {
				arg9 |= 0x4;
			}
		}

		if (arg2 == 10 && arg0 > 3) {
			arg9 |= 0x5;
		}

		@Pc(116) SoftLruHashTable local116 = this.locTypes.aSoftLruHashTable76;
		@Pc(126) Model local126;
		synchronized (this.locTypes.aSoftLruHashTable76) {
			local126 = (Model) this.locTypes.aSoftLruHashTable76.get(local22);
		}

		if (local126 == null || arg6.method7960(local126.ua(), arg9) != 0) {
			if (local126 != null) {
				arg9 = arg6.method8013(arg9, local126.ua());
			}
			local126 = this.getModel(arg6, arg9, arg8, arg0, arg2);
			if (local126 == null) {
				return null;
			}
			local116 = this.locTypes.aSoftLruHashTable76;
			synchronized (this.locTypes.aSoftLruHashTable76) {
				this.locTypes.aSoftLruHashTable76.put(local22, local126);
			}
		}

		@Pc(190) boolean local190 = false;
		if (arg5 != null) {
			local126 = local126.method7495((byte) 1, arg9, true);
			local190 = true;
			arg5.method9089(local126, arg0 & 0x3);
		}

		if (arg2 == 10 && arg0 > 3) {
			if (!local190) {
				local126 = local126.method7495((byte) 3, arg9, true);
				local190 = true;
			}
			local126.a(2048);
		}

		if (this.hillskewType != 0) {
			if (!local190) {
				local190 = true;
				local126 = local126.method7495((byte) 3, arg9, true);
			}
			local126.p(this.hillskewType, this.hillskewAmount, arg7, arg4, arg3, arg10, arg1);
		}

		if (this.postoffsetx != 0 || this.postoffsety != 0 || this.postoffsetz != 0) {
			if (!local190) {
				local126 = local126.method7495((byte) 3, arg9, true);
				local190 = true;
			}
			local126.H(this.postoffsetx, this.postoffsety, this.postoffsetz);
		}

		if (local190) {
			local126.s(local24);
		}

		return local126;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ha;ILclient!gp;BII)Lclient!ka;")
	private Model getModel(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int key, @OriginalArg(2) Class150 arg2, @OriginalArg(4) int angle, @OriginalArg(5) int shape) {
		@Pc(8) int ambient = this.ambient + 64;
		@Pc(13) int contrast = this.contrast + 850;
		@Pc(15) int local15 = key;

		@Pc(35) boolean flipped = this.mirror || shape == 2 && angle > 3;
		if (flipped) {
			key |= 0x10;
		}

		if (angle == 0) {
			if (this.resizex != 128 || this.offsetx != 0) {
				key |= 0x1;
			}
			if (this.resizez != 128 || this.offsetz != 0) {
				key |= 0x4;
			}
		} else {
			key |= 0xD;
		}

		if (this.resizey != 128 || this.offsety != 0) {
			key |= 0x2;
		}

		if (this.recol_d != null) {
			key |= 0x4000;
		}

		if (this.retex_d != null) {
			key |= 0x8000;
		}

		if (this.weight != 0) {
			key |= 0x80000;
		}

		@Pc(123) Model local123 = null;
		if (this.shapes == null) {
			return null;
		}

		@Pc(131) int shapeIndex = -1;
		for (@Pc(139) int i = 0; i < this.shapes.length; i++) {
			if (this.shapes[i] == shape) {
				shapeIndex = i;
				break;
			}
		}

		if (shapeIndex == -1) {
			return null;
		}

		@Pc(179) int[] local179 = arg2 == null || arg2.anIntArray286 == null ? this.models[shapeIndex] : arg2.anIntArray286;
		@Pc(182) int local182 = local179.length;

		@Pc(193) int local193;
		if (local182 > 0) {
			@Pc(191) long local191 = arg0.anInt8962;
			for (local193 = 0; local193 < local182; local193++) {
				local191 = local191 * 67783L + (long) local179[local193];
			}

			@Pc(211) SoftLruHashTable local211 = this.locTypes.aSoftLruHashTable74;
			synchronized (this.locTypes.aSoftLruHashTable74) {
				local123 = (Model) this.locTypes.aSoftLruHashTable74.get(local191);
			}

			if (local123 != null) {
				if (local123.WA() != ambient) {
					key |= 0x1000;
				}

				if (contrast != local123.da()) {
					key |= 0x2000;
				}
			}

			if (local123 == null || arg0.method7960(local123.ua(), key) != 0) {
				@Pc(265) int local265 = key | 0x1F01F;
				if (local123 != null) {
					local265 = arg0.method8013(local265, local123.ua());
				}

				@Pc(275) Class88 local275 = null;
				@Pc(277) Class88[] local277 = Static600.aClass88Array1;
				synchronized (Static600.aClass88Array1) {
					@Pc(281) int local281 = 0;
					while (true) {
						if (local281 >= local182) {
							if (local182 > 1) {
								local275 = new Class88(Static600.aClass88Array1, local182);
							}
							break;
						}
						@Pc(286) Js5 local286 = this.locTypes.modelArchive;
						synchronized (this.locTypes.modelArchive) {
							local275 = Static121.method2201(local179[local281] & 0xFFFF, this.locTypes.modelArchive);
						}
						if (local275 == null) {
							return null;
						}
						if (local275.anInt2379 < 13) {
							local275.method2232();
						}
						if (local182 > 1) {
							Static600.aClass88Array1[local281] = local275;
						}
						local281++;
					}
				}

				local123 = arg0.method7952(local275, local265, this.locTypes.anInt3390, ambient, contrast);
				@Pc(372) SoftLruHashTable local372 = this.locTypes.aSoftLruHashTable74;
				synchronized (this.locTypes.aSoftLruHashTable74) {
					this.locTypes.aSoftLruHashTable74.put(local191, local123);
				}
			}
		}

		if (local123 == null) {
			return null;
		}

		@Pc(398) Model model = local123.method7495((byte) 0, key, true);
		if (ambient != local123.WA()) {
			model.C(ambient);
		}

		if (local123.da() != contrast) {
			model.LA(contrast);
		}

		if (flipped) {
			model.v();
		}

		if (shape == 4 && angle > 3) {
			model.k(2048);
			model.H(180, 0, -180);
		}

		@Pc(448) int local448 = angle & 0x3;
		if (local448 == 1) {
			model.k(4096);
		} else if (local448 == 2) {
			model.k(8192);
		} else if (local448 == 3) {
			model.k(12288);
		}

		@Pc(490) short[] local490;
		if (this.recol_d != null) {
			if (arg2 == null || arg2.recol_s == null) {
				local490 = this.recol_s;
			} else {
				local490 = arg2.recol_s;
			}

			for (local193 = 0; local193 < this.recol_d.length; local193++) {
				if (this.recol_dpalette == null || this.recol_dpalette.length <= local193) {
					model.ia(this.recol_d[local193], local490[local193]);
				} else {
					model.ia(this.recol_d[local193], Static419.aShortArray96[this.recol_dpalette[local193] & 0xFF]);
				}
			}
		}

		if (this.retex_d != null) {
			if (arg2 == null || arg2.retex_s == null) {
				local490 = this.retex_s;
			} else {
				local490 = arg2.retex_s;
			}

			for (local193 = 0; local193 < this.retex_d.length; local193++) {
				model.aa(this.retex_d[local193], local490[local193]);
			}
		}

		if (this.weight != 0) {
			model.a(this.hue, this.saturation, this.luminance, this.weight & 0xFF);
		}

		if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
			model.O(this.resizex, this.resizey, this.resizez);
		}

		if (this.offsetx != 0 || this.offsety != 0 || this.offsetz != 0) {
			model.H(this.offsetx, this.offsety, this.offsetz);
		}

		model.s(local15);
		return model;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLclient!ge;)V")
	private void skipModels(@OriginalArg(1) Packet buf) {
		@Pc(12) int shapeCount = buf.g1();
		for (@Pc(14) int i = 0; i < shapeCount; i++) {
			buf.pos++;

			@Pc(25) int modelCount = buf.g1();
			buf.pos += modelCount * 2;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	public int getParam(@OriginalArg(0) int defaultValue, @OriginalArg(2) int id) {
		if (this.params == null) {
			return defaultValue;
		} else {
			@Pc(17) IntNode node = (IntNode) this.params.get(id);
			return node == null ? defaultValue : node.value;
		}
	}
}
