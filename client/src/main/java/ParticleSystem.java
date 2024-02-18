import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class ParticleSystem extends ParticleNode {

	@OriginalMember(owner = "client!hv", name = "u", descriptor = "J")
	private long aLong132;

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "J")
	private long aLong133;

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
	public int anInt4149;

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "Z")
	public boolean aBoolean324 = false;

	@OriginalMember(owner = "client!hv", name = "s", descriptor = "Z")
	private boolean aBoolean323 = false;

	@OriginalMember(owner = "client!hv", name = "l", descriptor = "I")
	public int anInt4147 = 0;

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "Lclient!fla;")
	private ParticleLinkedList aParticleLinkedList6 = new ParticleLinkedList();

	@OriginalMember(owner = "client!hv", name = "o", descriptor = "I")
	private int anInt4148 = 0;

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "Lclient!sia;")
	public LinkedList aLinkedList22 = new LinkedList();

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "Z")
	private boolean aBoolean326 = false;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "Z")
	public boolean aBoolean325 = false;

	@OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
	private int anInt4150 = 0;

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "Lclient!lk;")
	public final Class230 aClass230_1 = new Class230();

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "[Lclient!pp;")
	public final SecondaryParticleNode_Sub2_Sub1[] aClass8_Sub4_Sub2_Sub1Array1 = new SecondaryParticleNode_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(IZ)V")
	public ParticleSystem(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3657(arg0, arg1);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ha;J[Lclient!rv;[Lclient!mn;Z)V")
	public void method3643(@OriginalArg(0) Class19 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class328[] arg2, @OriginalArg(3) Class249[] arg3) {
		if (!this.aBoolean324) {
			this.method3651(arg0, arg2);
			this.method3648(arg3);
			this.aLong133 = arg1;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "()V")
	public void method3644() {
		this.aBoolean323 = true;
	}

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "()Lclient!lk;")
	public Class230 method3645() {
		return this.aClass230_1;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ha;)V")
	public void method3646(@OriginalArg(0) Class19 arg0) {
		this.aClass230_1.aClass113_1.method2487();
		for (@Pc(10) ParticleNode_Sub8 local10 = (ParticleNode_Sub8) this.aParticleLinkedList6.method2790(); local10 != null; local10 = (ParticleNode_Sub8) this.aParticleLinkedList6.method2785()) {
			local10.method7263(this.aLong132, arg0);
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "([Lclient!mn;Z)V")
	private void method3648(@OriginalArg(0) Class249[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static257.aBooleanArray6[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) SecondaryLinkable_Sub5 local16 = (SecondaryLinkable_Sub5) this.aLinkedList22.head(); local16 != null; local16 = (SecondaryLinkable_Sub5) this.aLinkedList22.next()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass249_1 == arg0[local21] || local16.aClass249_1 == arg0[local21].aClass249_2) {
						Static257.aBooleanArray6[local21] = true;
						local16.method1707();
						continue label71;
					}
				}
			}
			local16.unlink();
			this.anInt4150--;
			if (local16.isSecondaryLinked()) {
				local16.unlinkSecondary();
				Static654.anInt9740--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt4150 != 8; local21++) {
			if (!Static257.aBooleanArray6[local21]) {
				@Pc(96) SecondaryLinkable_Sub5 local96 = null;
				if (arg0[local21].method5590().anInt6982 == 1 && Static654.anInt9740 < 32) {
					local96 = new SecondaryLinkable_Sub5(arg0[local21], this);
					Static519.aSecondaryHashTable1.method3094(local96, (long) arg0[local21].anInt6248);
					Static654.anInt9740++;
				}
				if (local96 == null) {
					local96 = new SecondaryLinkable_Sub5(arg0[local21], this);
				}
				this.aLinkedList22.addTail(local96);
				this.anInt4150++;
				Static257.aBooleanArray6[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(J)V")
	public void method3649(@OriginalArg(0) long arg0) {
		this.aLong133 = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "()Lclient!lk;")
	public Class230 method3650() {
		this.aClass230_1.aClass113_1.method2487();
		for (@Pc(6) int local6 = 0; local6 < this.aClass8_Sub4_Sub2_Sub1Array1.length; local6++) {
			if (this.aClass8_Sub4_Sub2_Sub1Array1[local6] != null && this.aClass8_Sub4_Sub2_Sub1Array1[local6].aClass8_Sub8_1 != null) {
				this.aClass230_1.aClass113_1.method2488(this.aClass8_Sub4_Sub2_Sub1Array1[local6]);
			}
		}
		return this.aClass230_1;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ha;[Lclient!rv;Z)V")
	private void method3651(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class328[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static257.aBooleanArray7[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) ParticleNode_Sub8 local16 = (ParticleNode_Sub8) this.aParticleLinkedList6.method2790(); local16 != null; local16 = (ParticleNode_Sub8) this.aParticleLinkedList6.method2785()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass328_1 == arg1[local21] || local16.aClass328_1 == arg1[local21].aClass328_2) {
						Static257.aBooleanArray7[local21] = true;
						local16.method7264();
						local16.aBoolean630 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt8268 == 0) {
				local16.method9274();
				this.anInt4148--;
			} else {
				local16.aBoolean630 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt4148 != 32; local21++) {
			if (!Static257.aBooleanArray7[local21]) {
				@Pc(104) ParticleNode_Sub8 local104 = new ParticleNode_Sub8(arg0, arg1[local21], this, this.aLong133);
				this.aParticleLinkedList6.method2787(local104);
				this.anInt4148++;
				Static257.aBooleanArray7[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "()V")
	public void method3652() {
		this.aBoolean324 = true;
		for (@Pc(8) SecondaryLinkable_Sub5 local8 = (SecondaryLinkable_Sub5) this.aLinkedList22.head(); local8 != null; local8 = (SecondaryLinkable_Sub5) this.aLinkedList22.next()) {
			if (local8.aParticleEffectorType1.anInt6982 == 1) {
				local8.unlinkSecondary();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass8_Sub4_Sub2_Sub1Array1.length; local27++) {
			if (this.aClass8_Sub4_Sub2_Sub1Array1[local27] != null) {
				this.aClass8_Sub4_Sub2_Sub1Array1[local27].method6697();
				this.aClass8_Sub4_Sub2_Sub1Array1[local27] = null;
			}
		}
		this.anInt4147 = 0;
		this.aParticleLinkedList6 = new ParticleLinkedList();
		this.anInt4148 = 0;
		this.aLinkedList22 = new LinkedList();
		this.anInt4150 = 0;
		this.method9274();
		Static81.aClass8_Sub5Array1[Static349.anInt5693] = this;
		Static349.anInt5693 = Static349.anInt5693 + 1 & Static190.anIntArray265[Static507.anInt7618];
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method3653(@OriginalArg(0) Class19 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong133 == this.aLong132) {
			this.method3655();
		} else {
			this.method3644();
		}
		if (arg1 - this.aLong133 > 750L) {
			this.method3652();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong132);
		@Pc(36) ParticleNode_Sub8 local36;
		if (this.aBoolean326) {
			for (local36 = (ParticleNode_Sub8) this.aParticleLinkedList6.method2790(); local36 != null; local36 = (ParticleNode_Sub8) this.aParticleLinkedList6.method2785()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aParticleEmitterType1.anInt9882; local39++) {
					local36.method7261(1, !this.aBoolean323, arg1, arg0);
				}
			}
			this.aBoolean326 = false;
		}
		for (local36 = (ParticleNode_Sub8) this.aParticleLinkedList6.method2790(); local36 != null; local36 = (ParticleNode_Sub8) this.aParticleLinkedList6.method2785()) {
			local36.method7261(local27, !this.aBoolean323, arg1, arg0);
		}
		this.aLong132 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "()V")
	private void method3655() {
		this.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "()V")
	public void method3656() {
		this.aBoolean326 = true;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)V")
	public void method3657(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static342.aParticleLinkedList7.method2787(this);
		this.aLong133 = (long) arg0;
		this.aLong132 = (long) arg0;
		this.aBoolean326 = true;
		this.aBoolean325 = arg1;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIII)V")
	public void method3658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4149 = arg0;
	}
}
