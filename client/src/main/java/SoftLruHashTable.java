import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dla")
public final class SoftLruHashTable {

	@OriginalMember(owner = "client!dla", name = "j", descriptor = "Lclient!jga;")
	private final SecondaryLinkedList aSecondaryLinkedList5;

	@OriginalMember(owner = "client!dla", name = "h", descriptor = "I")
	private int anInt2281;

	@OriginalMember(owner = "client!dla", name = "r", descriptor = "Lclient!av;")
	private final HashTable aHashTable13;

	@OriginalMember(owner = "client!dla", name = "c", descriptor = "I")
	private final int anInt2285;

	@OriginalMember(owner = "client!dla", name = "<init>", descriptor = "(I)V")
	public SoftLruHashTable(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!dla", name = "<init>", descriptor = "(II)V")
	public SoftLruHashTable(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aSecondaryLinkedList5 = new SecondaryLinkedList();
		this.anInt2285 = arg0;
		this.anInt2281 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && local14 < arg1; local14 += local14) {
		}
		this.aHashTable13 = new HashTable(local14);
	}

	@OriginalMember(owner = "client!dla", name = "c", descriptor = "(I)I")
	public int method2144() {
		return this.anInt2281;
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method2145() {
		@Pc(19) ReferenceNode local19 = (ReferenceNode) this.aHashTable13.head();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method9268();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) ReferenceNode local29 = local19;
			local19 = (ReferenceNode) this.aHashTable13.next();
			local29.unlink();
			local29.unlinkSecondary();
			this.anInt2281 += local29.anInt10683;
		}
		return null;
	}

	@OriginalMember(owner = "client!dla", name = "d", descriptor = "(I)I")
	public int method2146() {
		return this.anInt2285;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(II)V")
	public void method2147(@OriginalArg(0) int arg0) {
		if (Static443.aReferenceNodeFactory1 == null) {
			return;
		}
		for (@Pc(15) ReferenceNode local15 = (ReferenceNode) this.aSecondaryLinkedList5.head(); local15 != null; local15 = (ReferenceNode) this.aSecondaryLinkedList5.next()) {
			if (local15.method9270()) {
				if (local15.method9268() == null) {
					local15.unlink();
					local15.unlinkSecondary();
					this.anInt2281 += local15.anInt10683;
				}
			} else if (++local15.secondaryKey > (long) arg0) {
				@Pc(42) ReferenceNode local42 = Static443.aReferenceNodeFactory1.method4433(local15);
				this.aHashTable13.put(local15.id, local42);
				Static409.method5654(local15, local42);
				local15.unlink();
				local15.unlinkSecondary();
			}
		}
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "(B)I")
	public int method2148() {
		@Pc(5) int local5 = 0;
		for (@Pc(11) ReferenceNode local11 = (ReferenceNode) this.aSecondaryLinkedList5.head(); local11 != null; local11 = (ReferenceNode) this.aSecondaryLinkedList5.next()) {
			if (!local11.method9270()) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(ILclient!vw;)V")
	private void method2149(@OriginalArg(1) ReferenceNode arg0) {
		if (arg0 != null) {
			arg0.unlink();
			arg0.unlinkSecondary();
			this.anInt2281 += arg0.anInt10683;
		}
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(Ljava/lang/Object;IJ)V")
	public void method2150(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		this.method2153(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(B)V")
	public void method2151() {
		for (@Pc(14) ReferenceNode local14 = (ReferenceNode) this.aSecondaryLinkedList5.head(); local14 != null; local14 = (ReferenceNode) this.aSecondaryLinkedList5.next()) {
			if (local14.method9270()) {
				local14.unlink();
				local14.unlinkSecondary();
				this.anInt2281 += local14.anInt10683;
			}
		}
	}

	@OriginalMember(owner = "client!dla", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method2152() {
		@Pc(19) ReferenceNode local19 = (ReferenceNode) this.aHashTable13.next();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method9268();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) ReferenceNode local29 = local19;
			local19 = (ReferenceNode) this.aHashTable13.next();
			local29.unlink();
			local29.unlinkSecondary();
			this.anInt2281 += local29.anInt10683;
		}
		return null;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(JLjava/lang/Object;II)V")
	public void method2153(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt2285) {
			throw new IllegalStateException("s>cs");
		}
		this.method2154(arg0);
		this.anInt2281 -= arg2;
		while (this.anInt2281 < 0) {
			@Pc(32) ReferenceNode local32 = (ReferenceNode) this.aSecondaryLinkedList5.removeTail();
			this.method2149(local32);
		}
		@Pc(48) HardReferenceNode local48 = new HardReferenceNode(arg1, arg2);
		this.aHashTable13.put(arg0, local48);
		this.aSecondaryLinkedList5.addTail(local48);
		local48.secondaryKey = 0L;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(JI)V")
	public void method2154(@OriginalArg(0) long arg0) {
		@Pc(15) ReferenceNode local15 = (ReferenceNode) this.aHashTable13.get(arg0);
		this.method2149(local15);
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "(JI)Ljava/lang/Object;")
	public Object method2156(@OriginalArg(0) long arg0) {
		@Pc(12) ReferenceNode local12 = (ReferenceNode) this.aHashTable13.get(arg0);
		if (local12 == null) {
			return null;
		}
		@Pc(26) Object local26 = local12.method9268();
		if (local26 == null) {
			local12.unlink();
			local12.unlinkSecondary();
			this.anInt2281 += local12.anInt10683;
			return null;
		}
		if (local12.method9270()) {
			@Pc(65) HardReferenceNode local65 = new HardReferenceNode(local26, local12.anInt10683);
			this.aHashTable13.put(local12.id, local65);
			this.aSecondaryLinkedList5.addTail(local65);
			local65.secondaryKey = 0L;
			local12.unlink();
			local12.unlinkSecondary();
		} else {
			this.aSecondaryLinkedList5.addTail(local12);
			local12.secondaryKey = 0L;
		}
		return local26;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(Z)V")
	public void method2157() {
		this.aSecondaryLinkedList5.clear();
		this.aHashTable13.clear();
		this.anInt2281 = this.anInt2285;
	}
}
