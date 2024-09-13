import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Component {

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "Lclient!dla;")
	public static final SoftLruHashTable spriteCache = new SoftLruHashTable(3000000, 200);
	@OriginalMember(owner = "client!jt", name = "a", descriptor = "Lclient!dla;")
	public static final SoftLruHashTable modelCache = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!hda", name = "M", descriptor = "[Ljava/lang/Object;")
	public Object[] onRelease;

	@OriginalMember(owner = "client!hda", name = "Jc", descriptor = "[Ljava/lang/String;")
	public String[] ops;

	@OriginalMember(owner = "client!hda", name = "Ub", descriptor = "[Ljava/lang/Object;")
	public Object[] onVarcTransmit;

	@OriginalMember(owner = "client!hda", name = "ed", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!hda", name = "jd", descriptor = "[Ljava/lang/Object;")
	public Object[] onTimer;

	@OriginalMember(owner = "client!hda", name = "ud", descriptor = "[I")
	public int[] anIntArray293;

	@OriginalMember(owner = "client!hda", name = "Zb", descriptor = "[Ljava/lang/Object;")
	public Object[] onMouseOver;

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "[Ljava/lang/Object;")
	public Object[] onDragRelease;

	@OriginalMember(owner = "client!hda", name = "eb", descriptor = "[Ljava/lang/Object;")
	public Object[] onWidgetsOpenClose;

	@OriginalMember(owner = "client!hda", name = "rb", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!hda", name = "Qc", descriptor = "I")
	public int anInt3763;

	@OriginalMember(owner = "client!hda", name = "mc", descriptor = "Lclient!hv;")
	public ParticleSystem aClass8_Sub5_4;

	@OriginalMember(owner = "client!hda", name = "bc", descriptor = "Z")
	public boolean vFlip;

	@OriginalMember(owner = "client!hda", name = "Eb", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!hda", name = "mb", descriptor = "[Ljava/lang/Object;")
	public Object[] onMsg;

	@OriginalMember(owner = "client!hda", name = "gc", descriptor = "[Ljava/lang/Object;")
	public Object[] onInvTransmit;

	@OriginalMember(owner = "client!hda", name = "ic", descriptor = "Z")
	public boolean hFlip;

	@OriginalMember(owner = "client!hda", name = "wc", descriptor = "[Ljava/lang/Object;")
	public Object[] onStockTransmit;

	@OriginalMember(owner = "client!hda", name = "zc", descriptor = "I")
	public int anInt3774;

	@OriginalMember(owner = "client!hda", name = "K", descriptor = "[Ljava/lang/Object;")
	public Object[] anObjectArray10;

	@OriginalMember(owner = "client!hda", name = "m", descriptor = "[Ljava/lang/Object;")
	public Object[] onScroll;

	@OriginalMember(owner = "client!hda", name = "s", descriptor = "Lclient!gu;")
	public Class152 aClass152_6;

	@OriginalMember(owner = "client!hda", name = "hd", descriptor = "[Ljava/lang/Object;")
	public Object[] anObjectArray12;

	@OriginalMember(owner = "client!hda", name = "ec", descriptor = "[Ljava/lang/Object;")
	public Object[] anObjectArray13;

	@OriginalMember(owner = "client!hda", name = "Gc", descriptor = "I")
	public int anInt3782;

	@OriginalMember(owner = "client!hda", name = "hb", descriptor = "I")
	public int anInt3786;

	@OriginalMember(owner = "client!hda", name = "Jb", descriptor = "Ljava/lang/String;")
	public String aString40;

	@OriginalMember(owner = "client!hda", name = "Hc", descriptor = "[Ljava/lang/Object;")
	public Object[] onUse;

	@OriginalMember(owner = "client!hda", name = "W", descriptor = "[Ljava/lang/Object;")
	public Object[] onOptionClick;

	@OriginalMember(owner = "client!hda", name = "o", descriptor = "[Ljava/lang/Object;")
	public Object[] onUseWith;

	@OriginalMember(owner = "client!hda", name = "Nb", descriptor = "[I")
	public int[] anIntArray294;

	@OriginalMember(owner = "client!hda", name = "bd", descriptor = "[Ljava/lang/Object;")
	public Object[] onClickRepeat;

	@OriginalMember(owner = "client!hda", name = "Rb", descriptor = "[Ljava/lang/Object;")
	public Object[] onVarcstrTransmit;

	@OriginalMember(owner = "client!hda", name = "od", descriptor = "[Ljava/lang/Object;")
	public Object[] onResize;

	@OriginalMember(owner = "client!hda", name = "B", descriptor = "[Ljava/lang/Object;")
	public Object[] onDialogAbort;

	@OriginalMember(owner = "client!hda", name = "H", descriptor = "Ljava/lang/String;")
	public String aString42;

	@OriginalMember(owner = "client!hda", name = "rd", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!hda", name = "Yc", descriptor = "[Ljava/lang/Object;")
	public Object[] onStatTransmit;

	@OriginalMember(owner = "client!hda", name = "D", descriptor = "[I")
	public int[] statTriggers;

	@OriginalMember(owner = "client!hda", name = "Oc", descriptor = "[Lclient!hda;")
	public Component[] aComponentArray1;

	@OriginalMember(owner = "client!hda", name = "xd", descriptor = "I")
	public int anInt3796;

	@OriginalMember(owner = "client!hda", name = "fd", descriptor = "[Ljava/lang/Object;")
	public Object[] onKey;

	@OriginalMember(owner = "client!hda", name = "sb", descriptor = "[Ljava/lang/Object;")
	public Object[] anObjectArray23;

	@OriginalMember(owner = "client!hda", name = "v", descriptor = "[Ljava/lang/Object;")
	public Object[] onDrag;

	@OriginalMember(owner = "client!hda", name = "Qb", descriptor = "[Lclient!hda;")
	public Component[] createdComponents;

	@OriginalMember(owner = "client!hda", name = "r", descriptor = "[I")
	public int[] varcstrTriggers;

	@OriginalMember(owner = "client!hda", name = "db", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!hda", name = "Xc", descriptor = "[Ljava/lang/Object;")
	public Object[] onVarpTransmit;

	@OriginalMember(owner = "client!hda", name = "V", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!hda", name = "Bb", descriptor = "[Ljava/lang/Object;")
	public Object[] onMouseLeave;

	@OriginalMember(owner = "client!hda", name = "qd", descriptor = "Lclient!av;")
	private HashTable aHashTable17;

	@OriginalMember(owner = "client!hda", name = "tc", descriptor = "I")
	public int anInt3815;

	@OriginalMember(owner = "client!hda", name = "ac", descriptor = "[Ljava/lang/Object;")
	public Object[] onClanTransmit;

	@OriginalMember(owner = "client!hda", name = "Pb", descriptor = "[I")
	public int[] varcTriggers;

	@OriginalMember(owner = "client!hda", name = "z", descriptor = "[I")
	public int[] inventoryTriggers;

	@OriginalMember(owner = "client!hda", name = "yb", descriptor = "[Ljava/lang/Object;")
	public Object[] onMouseRepeat;

	@OriginalMember(owner = "client!hda", name = "ib", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!hda", name = "Ab", descriptor = "[I")
	public int[] varpTriggers;

	@OriginalMember(owner = "client!hda", name = "P", descriptor = "I")
	public int type;

	@OriginalMember(owner = "client!hda", name = "Dc", descriptor = "[Ljava/lang/Object;")
	public Object[] onFriendTransmit;

	@OriginalMember(owner = "client!hda", name = "x", descriptor = "[Ljava/lang/Object;")
	public Object[] onDragStart;

	@OriginalMember(owner = "client!hda", name = "Fb", descriptor = "[Ljava/lang/Object;")
	public Object[] onMinimapUnlock;

	@OriginalMember(owner = "client!hda", name = "Q", descriptor = "[Ljava/lang/Object;")
	public Object[] onHold;

	@OriginalMember(owner = "client!hda", name = "cc", descriptor = "[Ljava/lang/Object;")
	public Object[] anObjectArray33;

	@OriginalMember(owner = "client!hda", name = "wd", descriptor = "[Ljava/lang/Object;")
	public Object[] onMiscTransmit;

	@OriginalMember(owner = "client!hda", name = "Z", descriptor = "[I")
	public int[] anIntArray301;

	@OriginalMember(owner = "client!hda", name = "Mb", descriptor = "I")
	public int modelId;

	@OriginalMember(owner = "client!hda", name = "L", descriptor = "Z")
	public boolean aBoolean302;

	@OriginalMember(owner = "client!hda", name = "nc", descriptor = "I")
	public int anInt3745 = -1;

	@OriginalMember(owner = "client!hda", name = "U", descriptor = "I")
	public int anInt3755 = 0;

	@OriginalMember(owner = "client!hda", name = "Ob", descriptor = "I")
	public int anInt3749 = -1;

	@OriginalMember(owner = "client!hda", name = "Nc", descriptor = "Z")
	public boolean aBoolean290 = false;

	@OriginalMember(owner = "client!hda", name = "xb", descriptor = "I")
	public int anInt3775 = 0;

	@OriginalMember(owner = "client!hda", name = "ad", descriptor = "Z")
	public boolean modelOrtho = false;

	@OriginalMember(owner = "client!hda", name = "Hb", descriptor = "I")
	public int modelYOffset = 0;

	@OriginalMember(owner = "client!hda", name = "e", descriptor = "I")
	public int lineWidth = 1;

	@OriginalMember(owner = "client!hda", name = "vd", descriptor = "I")
	public int angle2d = 0;

	@OriginalMember(owner = "client!hda", name = "Wb", descriptor = "I")
	public int font = -1;

	@OriginalMember(owner = "client!hda", name = "hc", descriptor = "Z")
	public boolean aBoolean289 = false;

	@OriginalMember(owner = "client!hda", name = "yd", descriptor = "Z")
	public boolean filled = false;

	@OriginalMember(owner = "client!hda", name = "Yb", descriptor = "I")
	public int baseWidth = 0;

	@OriginalMember(owner = "client!hda", name = "J", descriptor = "I")
	public int anInt3788 = 0;

	@OriginalMember(owner = "client!hda", name = "cb", descriptor = "B")
	public byte dynamicWidthValue = 0;

	@OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
	public int x = 0;

	@OriginalMember(owner = "client!hda", name = "t", descriptor = "I")
	public int anInt3783 = -1;

	@OriginalMember(owner = "client!hda", name = "Lb", descriptor = "Ljava/lang/String;")
	public String optionBase = "";

	@OriginalMember(owner = "client!hda", name = "Ed", descriptor = "B")
	public byte dynamicHeightValue = 0;

	@OriginalMember(owner = "client!hda", name = "Mc", descriptor = "I")
	public int anInt3791 = 0;

	@OriginalMember(owner = "client!hda", name = "sc", descriptor = "Z")
	public boolean aBoolean295 = true;

	@OriginalMember(owner = "client!hda", name = "nd", descriptor = "I")
	public int alpha = 0;

	@OriginalMember(owner = "client!hda", name = "l", descriptor = "I")
	public int color = 0;

	@OriginalMember(owner = "client!hda", name = "bb", descriptor = "I")
	public int createdComponentId = -1;

	@OriginalMember(owner = "client!hda", name = "lb", descriptor = "I")
	public int lb = -1;

	@OriginalMember(owner = "client!hda", name = "yc", descriptor = "I")
	public int modelSeqId = -1;

	@OriginalMember(owner = "client!hda", name = "Ib", descriptor = "I")
	public int dragDeadtime = 0;

	@OriginalMember(owner = "client!hda", name = "Tb", descriptor = "I")
	public int shadowColor = 0;

	@OriginalMember(owner = "client!hda", name = "Fc", descriptor = "I")
	public int modelXOffset = 0;

	@OriginalMember(owner = "client!hda", name = "gb", descriptor = "I")
	public int anInt3757 = 2;

	@OriginalMember(owner = "client!hda", name = "I", descriptor = "Z")
	public boolean aBoolean296 = false;

	@OriginalMember(owner = "client!hda", name = "zd", descriptor = "Z")
	public boolean aBoolean297 = false;

	@OriginalMember(owner = "client!hda", name = "Sb", descriptor = "I")
	public int outlineThickness = 0;

	@OriginalMember(owner = "client!hda", name = "td", descriptor = "Ljava/lang/String;")
	public String optionCircumfix = "";

	@OriginalMember(owner = "client!hda", name = "S", descriptor = "I")
	public int anInt3750 = 1;

	@OriginalMember(owner = "client!hda", name = "gd", descriptor = "I")
	public int vpadding = 0;

	@OriginalMember(owner = "client!hda", name = "pb", descriptor = "Z")
	public boolean aBoolean298 = false;

	@OriginalMember(owner = "client!hda", name = "vb", descriptor = "I")
	public int id = -1;

	@OriginalMember(owner = "client!hda", name = "Cb", descriptor = "I")
	public int modelYAngle = 0;

	@OriginalMember(owner = "client!hda", name = "Ac", descriptor = "I")
	public int modelXAngle = 0;

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
	public int objId = -1;

	@OriginalMember(owner = "client!hda", name = "oc", descriptor = "I")
	public int spriteId = -1;

	@OriginalMember(owner = "client!hda", name = "Lc", descriptor = "Z")
	public boolean aBoolean287 = false;

	@OriginalMember(owner = "client!hda", name = "dd", descriptor = "B")
	public byte yMode = 0;

	@OriginalMember(owner = "client!hda", name = "Uc", descriptor = "I")
	public int scrollX = 0;

	@OriginalMember(owner = "client!hda", name = "vc", descriptor = "I")
	public int dragDeadzone = 0;

	@OriginalMember(owner = "client!hda", name = "qb", descriptor = "I")
	public int anInt3803 = 0;

	@OriginalMember(owner = "client!hda", name = "wb", descriptor = "I")
	public int modelZoom = 100;

	@OriginalMember(owner = "client!hda", name = "qc", descriptor = "Z")
	public boolean aBoolean292 = false;

	@OriginalMember(owner = "client!hda", name = "ld", descriptor = "I")
	public int scrollMaxV = 0;

	@OriginalMember(owner = "client!hda", name = "O", descriptor = "Z")
	public boolean shadowed = false;

	@OriginalMember(owner = "client!hda", name = "Cd", descriptor = "I")
	public int valign = 0;

	@OriginalMember(owner = "client!hda", name = "Db", descriptor = "I")
	public int anInt3761 = 0;

	@OriginalMember(owner = "client!hda", name = "h", descriptor = "I")
	public int scrollY = 0;

	@OriginalMember(owner = "client!hda", name = "f", descriptor = "Ljava/lang/String;")
	public String text = "";

	@OriginalMember(owner = "client!hda", name = "Vb", descriptor = "Z")
	public boolean aBoolean299 = true;

	@OriginalMember(owner = "client!hda", name = "ab", descriptor = "I")
	public int y = 0;

	@OriginalMember(owner = "client!hda", name = "g", descriptor = "I")
	public int anInt3795 = 1;

	@OriginalMember(owner = "client!hda", name = "Kc", descriptor = "I")
	public int scrollMaxH = 0;

	@OriginalMember(owner = "client!hda", name = "ub", descriptor = "I")
	public int objCount = 0;

	@OriginalMember(owner = "client!hda", name = "jc", descriptor = "I")
	public int anInt3800 = 0;

	@OriginalMember(owner = "client!hda", name = "md", descriptor = "I")
	public int anInt3776 = -1;

	@OriginalMember(owner = "client!hda", name = "A", descriptor = "I")
	public int width = 0;

	@OriginalMember(owner = "client!hda", name = "Cc", descriptor = "I")
	public int halign = 0;

	@OriginalMember(owner = "client!hda", name = "Vc", descriptor = "I")
	public int height = 0;

	@OriginalMember(owner = "client!hda", name = "y", descriptor = "I")
	public int anInt3805 = 0;

	@OriginalMember(owner = "client!hda", name = "jb", descriptor = "I")
	public int modelType = 1;

	@OriginalMember(owner = "client!hda", name = "w", descriptor = "Lclient!ofa;")
	public ServerActiveProperties aClass2_Sub41_2 = ServerActiveProperties.DEFAULT_SERVER_ACTIVE_PROPERTIES;

	@OriginalMember(owner = "client!hda", name = "Ec", descriptor = "I")
	public int clientCode = 0;

	@OriginalMember(owner = "client!hda", name = "Rc", descriptor = "I")
	public int modelZOffset = 0;

	@OriginalMember(owner = "client!hda", name = "Pc", descriptor = "I")
	public int baseHeight = 0;

	@OriginalMember(owner = "client!hda", name = "nb", descriptor = "I")
	public int anInt3825 = 0;

	@OriginalMember(owner = "client!hda", name = "E", descriptor = "I")
	public int anInt3738 = -1;

	@OriginalMember(owner = "client!hda", name = "zb", descriptor = "I")
	public int overlayer = -1;

	@OriginalMember(owner = "client!hda", name = "R", descriptor = "I")
	public int anInt3801 = 0;

	@OriginalMember(owner = "client!hda", name = "Kb", descriptor = "I")
	public int anInt3813 = -1;

	@OriginalMember(owner = "client!hda", name = "Ad", descriptor = "Lclient!hda;")
	public Component aComponent6 = null;

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "I")
	public int anInt3752 = -1;

	@OriginalMember(owner = "client!hda", name = "lc", descriptor = "Z")
	public boolean aBoolean300 = false;

	@OriginalMember(owner = "client!hda", name = "fc", descriptor = "Z")
	public boolean hidden = false;

	@OriginalMember(owner = "client!hda", name = "xc", descriptor = "I")
	public int baseX = 0;

	@OriginalMember(owner = "client!hda", name = "kb", descriptor = "Z")
	public boolean aBoolean301 = false;

	@OriginalMember(owner = "client!hda", name = "Xb", descriptor = "I")
	public int anInt3824 = -1;

	@OriginalMember(owner = "client!hda", name = "G", descriptor = "I")
	public int anInt3799 = 0;

	@OriginalMember(owner = "client!hda", name = "Wc", descriptor = "I")
	public int dragRenderBehavior = Static351.anInt5719;

	@OriginalMember(owner = "client!hda", name = "N", descriptor = "Z")
	public boolean aBoolean288 = false;

	@OriginalMember(owner = "client!hda", name = "cd", descriptor = "B")
	public byte xMode = 0;

	@OriginalMember(owner = "client!hda", name = "Gb", descriptor = "I")
	public int baseY = 0;

	@OriginalMember(owner = "client!hda", name = "kc", descriptor = "I")
	public int anInt3821 = 0;

	@OriginalMember(owner = "client!hda", name = "T", descriptor = "I")
	public int anInt3819 = -1;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ZLclient!ha;)Lclient!st;")
	public SoftwareIndexedSprite method3383(@OriginalArg(1) Class19 arg0) {
		Static544.aBoolean624 = false;
		@Pc(54) long local54 = ((long) this.shadowColor << 40) + (((this.aBoolean292 ? 1L : 0L) << 35) + (long) this.spriteId - (-((long) this.outlineThickness << 36) + -((this.vFlip ? 1L : 0L) << 38)) + ((this.hFlip ? 1L : 0L) << 39));
		@Pc(60) SoftwareIndexedSprite local60 = (SoftwareIndexedSprite) spriteCache.get(local54);
		if (local60 != null) {
			return local60;
		}
		@Pc(71) Class407 local71 = Static735.method9382(Static262.aJs556, this.spriteId, 0);
		if (local71 == null) {
			Static544.aBoolean624 = true;
			return null;
		}
		if (this.vFlip) {
			local71.method9377();
		}
		if (this.hFlip) {
			local71.method9388();
		}
		if (this.outlineThickness > 0) {
			local71.method9380(this.outlineThickness);
		} else if (this.shadowColor != 0) {
			local71.method9380(1);
		}
		if (this.outlineThickness >= 1) {
			local71.method9385(1);
		}
		if (this.outlineThickness >= 2) {
			local71.method9385(16777215);
		}
		if (this.shadowColor != 0) {
			local71.method9381(this.shadowColor | 0xFF000000);
		}
		local60 = arg0.method7948(local71, true);
		spriteCache.put(local54, local60, local60.method8199() * local60.method8182() * 4);
		return local60;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!ha;Lclient!ka;ILclient!tt;I)V")
	public void method3384(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Model arg1, @OriginalArg(3) Class73 arg2, @OriginalArg(4) int arg3) {
		arg1.method7476(arg2);
		@Pc(9) Class328[] local9 = arg1.method7482();
		@Pc(22) Class249[] local22 = arg1.method7480();
		if ((this.aClass8_Sub5_4 == null || this.aClass8_Sub5_4.aBoolean324) && (local9 != null || local22 != null)) {
			this.aClass8_Sub5_4 = Static257.method3654(arg3, false);
		}
		if (this.aClass8_Sub5_4 != null) {
			this.aClass8_Sub5_4.method3643(arg0, (long) arg3, local9, local22);
		}
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(III)V")
	public void method3385(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aHashTable17 == null) {
			this.aHashTable17 = new HashTable(16);
			this.aHashTable17.put((long) arg0, new IntNode(arg1));
			return;
		}
		@Pc(34) IntNode local34 = (IntNode) this.aHashTable17.get((long) arg0);
		if (local34 == null) {
			this.aHashTable17.put((long) arg0, new IntNode(arg1));
		} else {
			local34.value = arg1;
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ZLclient!ge;)[Ljava/lang/Object;")
	private Object[] method3386(@OriginalArg(1) Packet arg0) {
		@Pc(7) int local7 = arg0.g1();
		if (local7 == 0) {
			return null;
		}
		@Pc(18) Object[] local18 = new Object[local7];
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(25) int local25 = arg0.g1();
			if (local25 == 0) {
				local18[local20] = Integer.valueOf(arg0.g4());
			} else if (local25 == 1) {
				local18[local20] = arg0.gjstr();
			}
		}
		this.aBoolean297 = true;
		return local18;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(SIIS)V")
	public void method3388(@OriginalArg(0) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short arg2) {
		if (arg1 >= 5) {
			return;
		}
		if (this.aShortArray58 == null) {
			this.aShortArray56 = new short[5];
			this.aShortArray58 = new short[5];
		}
		this.aShortArray58[arg1] = arg0;
		this.aShortArray56[arg1] = arg2;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method3389(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aHashTable17 == null) {
			return arg0;
		} else {
			@Pc(17) StringNode local17 = (StringNode) this.aHashTable17.get((long) arg1);
			return local17 == null ? arg0 : local17.value;
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!ge;B)V")
	public void decodeIf3(@OriginalArg(0) Packet arg0) {
		@Pc(7) int local7 = arg0.g1();
		if (local7 == 255) {
			local7 = -1;
		}
		this.type = arg0.g1();
		if ((this.type & 0x80) != 0) {
			this.type &= 0x7F;
			this.aString40 = arg0.gjstr();
		}
		this.clientCode = arg0.g2();
		this.baseX = arg0.g2s();
		this.baseY = arg0.g2s();
		this.baseWidth = arg0.g2();
		this.baseHeight = arg0.g2();
		this.dynamicWidthValue = arg0.g1b();
		this.dynamicHeightValue = arg0.g1b();
		this.yMode = arg0.g1b();
		this.xMode = arg0.g1b();
		this.overlayer = arg0.g2();
		if (this.overlayer == 65535) {
			this.overlayer = -1;
		} else {
			this.overlayer += this.id & 0xFFFF0000;
		}
		@Pc(110) int local110 = arg0.g1();
		this.hidden = (local110 & 0x1) != 0;
		if (local7 >= 0) {
			this.aBoolean300 = (local110 & 0x2) != 0;
		}
		if (this.type == 0) {
			this.scrollMaxH = arg0.g2();
			this.scrollMaxV = arg0.g2();
			if (local7 < 0) {
				this.aBoolean300 = arg0.g1() == 1;
			}
		}
		@Pc(191) int local191;
		if (this.type == 5) {
			this.spriteId = arg0.g4();
			this.angle2d = arg0.g2();
			local191 = arg0.g1();
			this.aBoolean301 = (local191 & 0x1) != 0;
			this.aBoolean292 = (local191 & 0x2) != 0;
			this.alpha = arg0.g1();
			this.outlineThickness = arg0.g1();
			this.shadowColor = arg0.g4();
			this.vFlip = arg0.g1() == 1;
			this.hFlip = arg0.g1() == 1;
			this.color = arg0.g4();
			if (local7 >= 3) {
				this.aBoolean295 = arg0.g1() == 1;
			}
		}
		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = arg0.g2();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}
			local191 = arg0.g1();
			this.modelOrtho = (local191 & 0x4) == 4;
			@Pc(326) boolean local326 = (local191 & 0x1) == 1;
			this.aBoolean302 = (local191 & 0x2) == 2;
			this.aBoolean289 = (local191 & 0x8) == 8;
			if (local326) {
				this.anInt3755 = arg0.g2s();
				this.anInt3799 = arg0.g2s();
				this.modelXAngle = arg0.g2();
				this.modelYAngle = arg0.g2();
				this.modelYOffset = arg0.g2();
				this.modelZoom = arg0.g2();
			} else if (this.aBoolean302) {
				this.anInt3755 = arg0.g2s();
				this.anInt3799 = arg0.g2s();
				this.anInt3821 = arg0.g2s();
				this.modelXAngle = arg0.g2();
				this.modelYAngle = arg0.g2();
				this.modelYOffset = arg0.g2();
				this.modelZoom = arg0.g2s();
			}
			this.modelSeqId = arg0.g2();
			if (this.modelSeqId == 65535) {
				this.modelSeqId = -1;
			}
			if (this.dynamicWidthValue != 0) {
				this.anInt3800 = arg0.g2();
			}
			if (this.dynamicHeightValue != 0) {
				this.anInt3825 = arg0.g2();
			}
		}
		if (this.type == 4) {
			this.font = arg0.g2();
			if (this.font == 65535) {
				this.font = -1;
			}
			if (local7 >= 2) {
				this.aBoolean299 = arg0.g1() == 1;
			}
			this.text = arg0.gjstr();
			this.vpadding = arg0.g1();
			this.halign = arg0.g1();
			this.valign = arg0.g1();
			this.shadowed = arg0.g1() == 1;
			this.color = arg0.g4();
			this.alpha = arg0.g1();
			if (local7 >= 0) {
				this.anInt3788 = arg0.g1();
			}
		}
		if (this.type == 3) {
			this.color = arg0.g4();
			this.filled = arg0.g1() == 1;
			this.alpha = arg0.g1();
		}
		if (this.type == 9) {
			this.lineWidth = arg0.g1();
			this.color = arg0.g4();
			this.aBoolean287 = arg0.g1() == 1;
		}
		local191 = arg0.g3();
		@Pc(628) int local628 = arg0.g1();
		@Pc(653) int local653;
		if (local628 != 0) {
			this.aByteArray37 = new byte[11];
			this.aByteArray36 = new byte[11];
			this.anIntArray293 = new int[11];
			while (local628 != 0) {
				local653 = (local628 >> 4) - 1;
				local628 = arg0.g1() | local628 << 8;
				local628 &= 0xFFF;
				if (local628 == 4095) {
					local628 = -1;
				}
				@Pc(674) byte local674 = arg0.g1b();
				if (local674 != 0) {
					this.aBoolean296 = true;
				}
				@Pc(688) byte local688 = arg0.g1b();
				this.anIntArray293[local653] = local628;
				this.aByteArray37[local653] = local674;
				this.aByteArray36[local653] = local688;
				local628 = arg0.g1();
			}
		}
		this.optionBase = arg0.gjstr();
		local653 = arg0.g1();
		@Pc(722) int local722 = local653 & 0xF;
		@Pc(730) int local730;
		if (local722 > 0) {
			this.ops = new String[local722];
			for (local730 = 0; local730 < local722; local730++) {
				this.ops[local730] = arg0.gjstr();
			}
		}
		@Pc(750) int local750 = local653 >> 4;
		@Pc(767) int local767;
		if (local750 > 0) {
			local730 = arg0.g1();
			this.anIntArray301 = new int[local730 + 1];
			for (local767 = 0; local767 < this.anIntArray301.length; local767++) {
				this.anIntArray301[local767] = -1;
			}
			this.anIntArray301[local730] = arg0.g2();
		}
		if (local750 > 1) {
			local730 = arg0.g1();
			this.anIntArray301[local730] = arg0.g2();
		}
		this.aString42 = arg0.gjstr();
		if (this.aString42.equals("")) {
			this.aString42 = null;
		}
		this.dragDeadzone = arg0.g1();
		this.dragDeadtime = arg0.g1();
		this.dragRenderBehavior = arg0.g1();
		this.optionCircumfix = arg0.gjstr();
		local730 = -1;
		if (Static622.getTargetMask(local191) != 0) {
			local730 = arg0.g2();
			if (local730 == 65535) {
				local730 = -1;
			}
			this.anInt3749 = arg0.g2();
			if (this.anInt3749 == 65535) {
				this.anInt3749 = -1;
			}
			this.anInt3819 = arg0.g2();
			if (this.anInt3819 == 65535) {
				this.anInt3819 = -1;
			}
		}
		if (local7 >= 0) {
			this.anInt3783 = arg0.g2();
			if (this.anInt3783 == 65535) {
				this.anInt3783 = -1;
			}
		}
		this.aClass2_Sub41_2 = new ServerActiveProperties(local191, local730);
		if (local7 >= 0) {
			local767 = arg0.g1();
			@Pc(929) int local929;
			@Pc(933) int local933;
			for (@Pc(924) int local924 = 0; local924 < local767; local924++) {
				local929 = arg0.g3();
				local933 = arg0.g4();
				this.aHashTable17.put((long) local929, new IntNode(local933));
			}
			local929 = arg0.g1();
			for (local933 = 0; local933 < local929; local933++) {
				@Pc(958) int local958 = arg0.g3();
				@Pc(962) String local962 = arg0.gjstr2();
				this.aHashTable17.put((long) local958, new StringNode(local962));
			}
		}
		this.anObjectArray13 = this.method3386(arg0);
		this.onMouseOver = this.method3386(arg0);
		this.onMouseLeave = this.method3386(arg0);
		this.onUseWith = this.method3386(arg0);
		this.onUse = this.method3386(arg0);
		this.onVarpTransmit = this.method3386(arg0);
		this.onInvTransmit = this.method3386(arg0);
		this.onStatTransmit = this.method3386(arg0);
		this.onTimer = this.method3386(arg0);
		this.onOptionClick = this.method3386(arg0);
		if (local7 >= 0) {
			this.anObjectArray10 = this.method3386(arg0);
		}
		this.onMouseRepeat = this.method3386(arg0);
		this.onClickRepeat = this.method3386(arg0);
		this.onDrag = this.method3386(arg0);
		this.onRelease = this.method3386(arg0);
		this.onHold = this.method3386(arg0);
		this.onDragStart = this.method3386(arg0);
		this.onDragRelease = this.method3386(arg0);
		this.onScroll = this.method3386(arg0);
		this.onVarcTransmit = this.method3386(arg0);
		this.onVarcstrTransmit = this.method3386(arg0);
		this.varpTriggers = this.method3398(arg0);
		this.inventoryTriggers = this.method3398(arg0);
		this.statTriggers = this.method3398(arg0);
		this.varcTriggers = this.method3398(arg0);
		this.varcstrTriggers = this.method3398(arg0);
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "(Ljava/lang/String;II)V")
	public void method3391(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.ops == null || arg1 >= this.ops.length) {
			@Pc(14) String[] local14 = new String[arg1 + 1];
			if (this.ops != null) {
				for (@Pc(19) int local19 = 0; local19 < this.ops.length; local19++) {
					local14[local19] = this.ops[local19];
				}
			}
			this.ops = local14;
		}
		this.ops[arg1] = arg0;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!ha;I)Lclient!he;")
	public Class159 method3393(@OriginalArg(0) Class19 arg0) {
		@Pc(15) long local15 = (long) this.createdComponentId & 0xFFFFFFFFL | (long) this.id << 32;
		@Pc(21) Class159 local21 = (Class159) Static449.aSoftLruHashTable146.get(local15);
		if (local21 != null) {
			if (local21.anInt3836 != this.spriteId) {
				local21 = null;
				Static449.aSoftLruHashTable146.remove(local15);
			}
			if (local21 != null) {
				return local21;
			}
		}
		@Pc(53) Class407 local53 = Static735.method9382(Static262.aJs556, this.spriteId, 0);
		if (local53 == null) {
			return null;
		}
		@Pc(77) int local77 = local53.anInt10852 + local53.anInt10847 + local53.anInt10851;
		@Pc(86) int local86 = local53.anInt10850 + local53.anInt10848 + local53.anInt10849;
		@Pc(89) int[] local89 = new int[local86];
		@Pc(92) int[] local92 = new int[local86];
		for (@Pc(94) int local94 = 0; local94 < local53.anInt10850; local94++) {
			@Pc(97) int local97 = 0;
			for (@Pc(99) int local99 = 0; local99 < local53.anInt10847; local99++) {
				if (local53.aByteArray114[local99 + local53.anInt10847 * local94] != 0) {
					local97 = local99;
					break;
				}
			}
			@Pc(121) int local121 = local53.anInt10847;
			for (@Pc(126) int local126 = local53.anInt10847 - 1; local126 >= local97; local126--) {
				if (local53.aByteArray114[local126 + local53.anInt10847 * local94] != 0) {
					local121 = local126 + 1;
					break;
				}
			}
			local89[local53.anInt10848 + local94] = local53.anInt10852 + local97;
			local92[local53.anInt10848 + local94] = local121 - local97;
		}
		@Pc(180) Class1 local180 = arg0.method8004(local77, local86, local89, local92);
		if (local180 == null) {
			return null;
		} else {
			local21 = new Class159(local77, local86, local92, local89, local180, this.spriteId);
			Static449.aSoftLruHashTable146.put(local15, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(Ljava/lang/String;II)V")
	public void method3396(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aHashTable17 == null) {
			this.aHashTable17 = new HashTable(16);
			this.aHashTable17.put((long) arg1, new StringNode(arg0));
			return;
		}
		@Pc(32) StringNode local32 = (StringNode) this.aHashTable17.get((long) arg1);
		if (local32 == null) {
			this.aHashTable17.put((long) arg1, new StringNode(arg0));
		} else {
			local32.value = arg0;
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIZ)V")
	public void method3397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray301 == null || arg0 >= this.anIntArray301.length) {
			@Pc(32) int[] local32 = new int[arg0 + 1];
			if (this.anIntArray301 != null) {
				for (@Pc(37) int local37 = 0; local37 < this.anIntArray301.length; local37++) {
					local32[local37] = this.anIntArray301[local37];
				}
				for (@Pc(55) int local55 = this.anIntArray301.length; local55 < arg0; local55++) {
					local32[local55] = -1;
				}
			}
			this.anIntArray301 = local32;
		}
		this.anIntArray301[arg0] = arg1;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(BLclient!ge;)[I")
	private int[] method3398(@OriginalArg(1) Packet arg0) {
		@Pc(7) int local7 = arg0.g1();
		if (local7 == 0) {
			return null;
		}
		@Pc(15) int[] local15 = new int[local7];
		for (@Pc(23) int local23 = 0; local23 < local7; local23++) {
			local15[local23] = arg0.g4();
		}
		return local15;
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)V")
	public void method3399() {
		this.anObjectArray10 = null;
		this.onDialogAbort = null;
		this.onDragRelease = null;
		this.onRelease = null;
		this.inventoryTriggers = null;
		this.onUse = null;
		this.varcTriggers = null;
		this.onClickRepeat = null;
		this.varpTriggers = null;
		this.onVarcTransmit = null;
		this.onDragStart = null;
		this.onResize = null;
		this.onScroll = null;
		this.varcstrTriggers = null;
		this.onOptionClick = null;
		this.onUseWith = null;
		this.anObjectArray23 = null;
		this.onClanTransmit = null;
		this.onInvTransmit = null;
		this.onMinimapUnlock = null;
		this.onHold = null;
		this.onMouseLeave = null;
		this.onMouseOver = null;
		this.onVarpTransmit = null;
		this.statTriggers = null;
		this.anObjectArray13 = null;
		this.onStockTransmit = null;
		this.onKey = null;
		this.onWidgetsOpenClose = null;
		this.onFriendTransmit = null;
		this.onDrag = null;
		this.onTimer = null;
		this.onMsg = null;
		this.onStatTransmit = null;
		this.onMiscTransmit = null;
		this.onVarcstrTransmit = null;
		this.onMouseRepeat = null;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!ha;Lclient!gu;Lclient!qp;Lclient!kr;BLclient!bp;Lclient!ju;Lclient!uk;Lclient!ql;Lclient!es;ILclient!vk;)Lclient!ka;")
	public Model method3401(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(2) BasTypeList arg2, @OriginalArg(3) IdkTypeList arg3, @OriginalArg(5) SeqTypeList arg4, @OriginalArg(6) PlayerAppearance arg5, @OriginalArg(7) VarDomain arg6, @OriginalArg(8) NpcTypeList arg7, @OriginalArg(9) ObjTypeList arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class386 arg10) {
		Static544.aBoolean624 = false;
		if (this.modelType == 0) {
			return null;
		} else if (this.modelType == 1 && this.modelId == -1) {
			return null;
		} else if (this.modelType == 1) {
			if (arg1 != null) {
				arg9 = arg1.method9101() | 0x800;
			}
			@Pc(53) long local53 = -1L;
			@Pc(55) long[] local55 = ReferenceNode.aLongArray21;
			@Pc(60) int local60;
			if (this.aShortArray57 != null) {
				for (local60 = 0; local60 < this.aShortArray57.length; local60++) {
					local53 = local53 >>> 8 ^ local55[(int) (((long) (this.aShortArray57[local60] >> 8) ^ local53) & 0xFFL)];
					local53 = local53 >>> 8 ^ local55[(int) (((long) this.aShortArray57[local60] ^ local53) & 0xFFL)];
					local53 = local55[(int) (((long) (this.aShortArray55[local60] >> 8) ^ local53) & 0xFFL)] ^ local53 >>> 8;
					local53 = local55[(int) (((long) this.aShortArray55[local60] ^ local53) & 0xFFL)] ^ local53 >>> 8;
				}
				arg9 |= 0x4000;
			}
			if (this.aShortArray58 != null) {
				for (local60 = 0; local60 < this.aShortArray58.length; local60++) {
					local53 = local55[(int) (((long) (this.aShortArray58[local60] >> 8) ^ local53) & 0xFFL)] ^ local53 >>> 8;
					local53 = local55[(int) (((long) this.aShortArray58[local60] ^ local53) & 0xFFL)] ^ local53 >>> 8;
					local53 = local53 >>> 8 ^ local55[(int) (((long) (this.aShortArray56[local60] >> 8) ^ local53) & 0xFFL)];
					local53 = local53 >>> 8 ^ local55[(int) (((long) this.aShortArray56[local60] ^ local53) & 0xFFL)];
				}
				arg9 |= 0x8000;
			}
			@Pc(271) long local271 = local53 & 0x3FFFFFFFFFL | (long) this.modelId << 38 | (long) this.modelType << 54 | (long) arg0.anInt8962 << 59;
			@Pc(277) Model local277 = (Model) modelCache.get(local271);
			if (local277 == null || arg0.method7960(local277.ua(), arg9) != 0) {
				if (local277 != null) {
					arg9 = arg0.method8013(arg9, local277.ua());
				}
				@Pc(307) Class88 local307 = Static121.method2201(this.modelId, Static607.aJs5113);
				if (local307 == null) {
					Static544.aBoolean624 = true;
					return null;
				}
				if (local307.anInt2379 < 13) {
					local307.method2232();
				}
				local277 = arg0.method7952(local307, arg9, Static108.anInt2168, 64, 768);
				@Pc(339) int local339;
				if (this.aShortArray57 != null) {
					for (local339 = 0; local339 < this.aShortArray57.length; local339++) {
						local277.ia(this.aShortArray57[local339], this.aShortArray55[local339]);
					}
				}
				if (this.aShortArray58 != null) {
					for (local339 = 0; local339 < this.aShortArray58.length; local339++) {
						local277.aa(this.aShortArray58[local339], this.aShortArray56[local339]);
					}
				}
				modelCache.put(local271, local277);
			}
			if (arg1 != null) {
				local277 = local277.method7495((byte) 1, arg9, true);
				arg1.method9089(local277, 0);
			}
			local277.s(2048);
			return local277;
		} else {
			@Pc(438) Model local438;
			if (this.modelType == 2) {
				local438 = arg7.method7092(this.modelId).method5992(arg1, arg10, arg0, arg6);
				if (local438 == null) {
					Static544.aBoolean624 = true;
					return null;
				} else {
					return local438;
				}
			} else if (this.modelType == 3) {
				if (arg5 == null) {
					return null;
				}
				local438 = arg5.method4552(arg3, arg4, arg6, arg1, arg8, arg7, arg0);
				if (local438 == null) {
					Static544.aBoolean624 = true;
					return null;
				} else {
					return local438;
				}
			} else if (this.modelType == 4) {
				@Pc(489) ObjType local489 = arg8.method2486(this.modelId);
				@Pc(498) Model local498 = local489.method8805(arg1, 2048, arg5, 10, arg0);
				if (local498 == null) {
					Static544.aBoolean624 = true;
					return null;
				} else {
					return local498;
				}
			} else if (this.modelType == 6) {
				local438 = arg7.method7092(this.modelId).method5993(arg6, arg0, arg2, arg1, 0, (int[]) null, arg10, (Class152) null, 2048, (Class152[]) null);
				if (local438 == null) {
					Static544.aBoolean624 = true;
					return null;
				} else {
					return local438;
				}
			} else if (this.modelType != 7) {
				return null;
			} else if (arg5 == null) {
				return null;
			} else {
				@Pc(558) int local558 = this.modelId >>> 16;
				@Pc(563) int local563 = this.modelId & 0xFFFF;
				@Pc(566) int local566 = this.anInt3738;
				@Pc(578) Model local578 = arg5.method4550(arg1, local558, local566, arg4, arg0, arg3, local563);
				if (local578 == null) {
					Static544.aBoolean624 = true;
					return null;
				} else {
					return local578;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)V")
	public void method3402(@OriginalArg(0) int arg0) {
		if (this.aHashTable17 != null) {
			@Pc(14) Linkable local14 = this.aHashTable17.get((long) arg0);
			if (local14 != null) {
				local14.unlink();
			}
		}
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(ZLclient!ha;)Lclient!da;")
	public Class14 method3403(@OriginalArg(1) Class19 arg0) {
		@Pc(18) Class14 local18 = Static324.method4628(this.aBoolean299, false, this.font, arg0);
		Static544.aBoolean624 = local18 == null;
		return local18;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(III)I")
	public int method3404(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aHashTable17 == null) {
			return arg0;
		} else {
			@Pc(17) IntNode local17 = (IntNode) this.aHashTable17.get((long) arg1);
			return local17 == null ? arg0 : local17.value;
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILclient!dg;Lclient!qk;)Lclient!gm;")
	public Class148 method3405(@OriginalArg(1) SkyBoxSphereTypeList arg0, @OriginalArg(2) SkyBoxTypeList arg1) {
		if (this.anInt3824 == -1) {
			return null;
		}
		@Pc(48) long local48 = (long) this.anInt3824 & 0xFFFFL | ((long) this.anInt3782 & 0xFFFFL) << 16 | ((long) this.anInt3763 & 0xFFFFL) << 48 | 0xFFFFL << 32 & (long) this.anInt3796 << 32;
		@Pc(54) Class148 local54 = (Class148) Static444.aSoftLruHashTable145.get(local48);
		if (local54 == null) {
			local54 = arg1.method7072(arg0, this.anInt3782, this.anInt3824, this.anInt3796, this.anInt3763);
			Static444.aSoftLruHashTable145.put(local48, local54);
		}
		return local54;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ISIS)V")
	public void method3406(@OriginalArg(1) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short arg2) {
		if (arg1 >= 5) {
			return;
		}
		if (this.aShortArray57 == null) {
			this.aShortArray55 = new short[5];
			this.aShortArray57 = new short[5];
		}
		this.aShortArray57[arg1] = arg2;
		this.aShortArray55[arg1] = arg0;
	}
}
