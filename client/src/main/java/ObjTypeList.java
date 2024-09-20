import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class ObjTypeList {

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Lclient!es;")
	public static ObjTypeList objTypes;
	@OriginalMember(owner = "client!es", name = "p", descriptor = "I")
	public int anInt2673;

	@OriginalMember(owner = "client!es", name = "o", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aSoftLruHashTable57 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!es", name = "b", descriptor = "Lclient!dla;")
	public final SoftLruHashTable aSoftLruHashTable58 = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!es", name = "f", descriptor = "Lclient!aka;")
	public final ObjLruHashTable spriteCache = new ObjLruHashTable(250);

	@OriginalMember(owner = "client!es", name = "j", descriptor = "Lclient!rla;")
	private final Class324 aClass324_1 = new Class324();

	@OriginalMember(owner = "client!es", name = "m", descriptor = "I")
	public final int languageId;

	@OriginalMember(owner = "client!es", name = "w", descriptor = "Lclient!ul;")
	private final ModeGame aModeGame1;

	@OriginalMember(owner = "client!es", name = "l", descriptor = "Lclient!sb;")
	public final Js5 aJs528;

	@OriginalMember(owner = "client!es", name = "q", descriptor = "Lclient!bo;")
	private final ParamTypeList aParamTypeList1;

	@OriginalMember(owner = "client!es", name = "x", descriptor = "Lclient!sb;")
	private final Js5 aJs529;

	@OriginalMember(owner = "client!es", name = "i", descriptor = "Z")
	private boolean aBoolean222;

	@OriginalMember(owner = "client!es", name = "n", descriptor = "I")
	public final int anInt2670;

	@OriginalMember(owner = "client!es", name = "g", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray11;

	@OriginalMember(owner = "client!es", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray10;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!ul;IZLclient!bo;Lclient!sb;Lclient!sb;)V")
	public ObjTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) ParamTypeList arg3, @OriginalArg(4) Js5 arg4, @OriginalArg(5) Js5 arg5) {
		this.languageId = arg1;
		this.aModeGame1 = arg0;
		this.aJs528 = arg5;
		this.aParamTypeList1 = arg3;
		this.aJs529 = arg4;
		this.aBoolean222 = arg2;
		if (this.aJs529 == null) {
			this.anInt2670 = 0;
		} else {
			@Pc(54) int local54 = this.aJs529.capacity() - 1;
			this.anInt2670 = this.aJs529.getGroupCapacity(local54) + local54 * 256;
		}
		if (this.aModeGame1 == ModeGame.GAME_RUNESCAPE) {
			this.aStringArray11 = new String[] { null, null, LocalizedText.TAKE.get(this.languageId), null, null, LocalizedText.EXAMINE.get(this.languageId) };
		} else {
			this.aStringArray11 = new String[] { null, null, LocalizedText.TAKE.get(this.languageId), null, null, null };
		}
		this.aStringArray10 = new String[] { null, null, null, null, LocalizedText.DROP.get(this.languageId) };
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(B)V")
	public void method2476() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable57;
		synchronized (this.aSoftLruHashTable57) {
			this.aSoftLruHashTable57.clear();
		}
		local6 = this.aSoftLruHashTable58;
		synchronized (this.aSoftLruHashTable58) {
			this.aSoftLruHashTable58.clear();
		}
		@Pc(44) ObjLruHashTable local44 = this.spriteCache;
		synchronized (this.spriteCache) {
			this.spriteCache.clear();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILclient!ha;Lclient!ha;Lclient!ju;ZIIZILclient!da;II)Lclient!st;")
	public SoftwareIndexedSprite method2478(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) PlayerAppearance arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class14 arg9, @OriginalArg(10) int arg10) {
		@Pc(24) SoftwareIndexedSprite local24 = this.method2483(arg3, arg2, arg8, arg10, arg0, arg6, arg5);
		if (local24 != null) {
			return local24;
		}
		@Pc(34) ObjType local34 = this.method2486(arg10);
		if (arg6 > 1 && local34.anIntArray799 != null) {
			@Pc(44) int local44 = -1;
			for (@Pc(46) int local46 = 0; local46 < 10; local46++) {
				if (local34.anIntArray798[local46] <= arg6 && local34.anIntArray798[local46] != 0) {
					local44 = local34.anIntArray799[local46];
				}
			}
			if (local44 != -1) {
				local34 = this.method2486(local44);
			}
		}
		@Pc(101) int[] local101 = local34.method8798(arg8, arg2, arg6, arg5, arg7, arg3, arg1, arg9, arg0);
		if (local101 == null) {
			return null;
		}
		@Pc(119) SoftwareIndexedSprite local119;
		if (arg4) {
			local119 = arg1.method7946(36, 36, 32, local101);
		} else {
			local119 = arg2.method7946(36, 36, 32, local101);
		}
		if (!arg4) {
			@Pc(136) Class324 local136 = new Class324();
			local136.anInt8435 = arg8;
			local136.aBoolean641 = arg3 != null;
			local136.anInt8432 = arg2.anInt8962;
			local136.anInt8430 = arg6;
			local136.anInt8434 = arg0;
			local136.anInt8433 = arg10;
			local136.anInt8436 = arg5;
			this.spriteCache.put(local136, local119);
		}
		return local119;
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(II)V")
	public void method2479() {
		@Pc(14) SoftLruHashTable local14 = this.aSoftLruHashTable57;
		synchronized (this.aSoftLruHashTable57) {
			this.aSoftLruHashTable57.clean(5);
		}
		local14 = this.aSoftLruHashTable58;
		synchronized (this.aSoftLruHashTable58) {
			this.aSoftLruHashTable58.clean(5);
		}
		@Pc(48) ObjLruHashTable local48 = this.spriteCache;
		synchronized (this.spriteCache) {
			this.spriteCache.clean(5);
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V")
	public void method2480() {
		@Pc(6) SoftLruHashTable local6 = this.aSoftLruHashTable57;
		synchronized (this.aSoftLruHashTable57) {
			this.aSoftLruHashTable57.removeSoft();
		}
		local6 = this.aSoftLruHashTable58;
		synchronized (this.aSoftLruHashTable58) {
			this.aSoftLruHashTable58.removeSoft();
		}
		@Pc(44) ObjLruHashTable local44 = this.spriteCache;
		synchronized (this.spriteCache) {
			this.spriteCache.removeSoft();
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(II)V")
	public void method2481(@OriginalArg(0) int arg0) {
		this.anInt2673 = arg0;
		@Pc(17) SoftLruHashTable local17 = this.aSoftLruHashTable58;
		synchronized (this.aSoftLruHashTable58) {
			this.aSoftLruHashTable58.clear();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
	public void method2482() {
		@Pc(2) SoftLruHashTable local2 = this.aSoftLruHashTable58;
		synchronized (this.aSoftLruHashTable58) {
			this.aSoftLruHashTable58.clear();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!ju;BLclient!ha;IIIII)Lclient!st;")
	public SoftwareIndexedSprite method2483(@OriginalArg(0) PlayerAppearance arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass324_1.anInt8430 = arg5;
		this.aClass324_1.anInt8432 = arg1.anInt8962;
		this.aClass324_1.anInt8435 = arg2;
		this.aClass324_1.anInt8436 = arg6;
		this.aClass324_1.aBoolean641 = arg0 != null;
		this.aClass324_1.anInt8434 = arg4;
		this.aClass324_1.anInt8433 = arg3;
		return (SoftwareIndexedSprite) this.spriteCache.get(this.aClass324_1);
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V")
	public void method2484() {
		@Pc(6) ObjLruHashTable local6 = this.spriteCache;
		synchronized (this.spriteCache) {
			this.spriteCache.clear();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BZ)V")
	public void method2485(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean222 != arg0) {
			this.aBoolean222 = arg0;
			this.method2476();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)Lclient!vfa;")
	public ObjType method2486(@OriginalArg(0) int arg0) {
		@Pc(14) SoftLruHashTable local14 = this.aSoftLruHashTable57;
		@Pc(26) ObjType local26;
		synchronized (this.aSoftLruHashTable57) {
			local26 = (ObjType) this.aSoftLruHashTable57.get((long) arg0);
		}
		if (local26 != null) {
			return local26;
		}
		@Pc(40) Js5 local40 = this.aJs529;
		@Pc(53) byte[] local53;
		synchronized (this.aJs529) {
			local53 = this.aJs529.fetchFile(Static593.method7781(arg0), Static223.method9100(arg0));
		}
		local26 = new ObjType();
		local26.itemId = arg0;
		local26.aObjTypeList2 = this;
		local26.groundOptions = (String[]) this.aStringArray11.clone();
		local26.inventoryOptions = (String[]) this.aStringArray10.clone();
		if (local53 != null) {
			local26.method8791(new Packet(local53));
		}
		local26.method8807();
		if (local26.anInt10087 != -1) {
			local26.method8793(this.method2486(local26.anInt10087), this.method2486(local26.notedId));
		}
		if (local26.anInt10083 != -1) {
			local26.method8792(this.method2486(local26.anInt10143), this.method2486(local26.anInt10083));
		}
		if (local26.anInt10144 != -1) {
			local26.method8809(this.method2486(local26.anInt10144), this.method2486(local26.anInt10114));
		}
		if (!this.aBoolean222 && local26.aBoolean770) {
			local26.aString118 = LocalizedText.MEMBERS_OBJECT.get(this.languageId);
			local26.groundOptions = this.aStringArray11;
			local26.inventoryOptions = this.aStringArray10;
			local26.anIntArray800 = null;
			local26.anInt10121 = 0;
			local26.aBoolean771 = false;
			if (local26.params != null) {
				@Pc(195) boolean local195 = false;
				for (@Pc(200) Linkable local200 = local26.params.head(); local200 != null; local200 = local26.params.next()) {
					@Pc(209) ParamType local209 = this.aParamTypeList1.method1161((int) local200.id);
					if (local209.aBoolean570) {
						local200.unlink();
					} else {
						local195 = true;
					}
				}
				if (!local195) {
					local26.params = null;
				}
			}
		}
		@Pc(238) SoftLruHashTable local238 = this.aSoftLruHashTable57;
		synchronized (this.aSoftLruHashTable57) {
			this.aSoftLruHashTable57.put((long) arg0, local26);
			return local26;
		}
	}
}
