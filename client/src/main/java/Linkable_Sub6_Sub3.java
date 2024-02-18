import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Linkable_Sub6_Sub3 extends Linkable_Sub6 {

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "Lclient!sia;")
	private final LinkedList aLinkedList35 = new LinkedList();

	@OriginalMember(owner = "client!nn", name = "o", descriptor = "Lclient!sia;")
	private final LinkedList aLinkedList36 = new LinkedList();

	@OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
	private int anInt6603 = 0;

	@OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
	private int anInt6604 = -1;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "()I")
	@Override
	public int method9132() {
		return 0;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method9131(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt6604 < 0) {
				this.method5885(arg0, arg1, arg2);
				return;
			}
			if (this.anInt6603 + arg2 < this.anInt6604) {
				this.anInt6603 += arg2;
				this.method5885(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt6604 - this.anInt6603;
			this.method5885(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt6603 += local33;
			this.method5887();
			@Pc(60) Linkable_Sub3 local60 = (Linkable_Sub3) this.aLinkedList36.head();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method114(this);
				if (local68 < 0) {
					local60.anInt101 = 0;
					this.method5888(local60);
				} else {
					local60.anInt101 = local68;
					this.method5886(local60.next, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "()I")
	public synchronized int method5881() {
		return this.aLinkedList35.method7701();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!dea;)V")
	public synchronized void method5882(@OriginalArg(0) Linkable_Sub6 arg0) {
		this.aLinkedList35.addHead(arg0);
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(Lclient!dea;)V")
	public synchronized void method5883(@OriginalArg(0) Linkable_Sub6 arg0) {
		arg0.unlink();
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V")
	private void method5884(@OriginalArg(0) int arg0) {
		for (@Pc(5) Linkable_Sub6 local5 = (Linkable_Sub6) this.aLinkedList35.head(); local5 != null; local5 = (Linkable_Sub6) this.aLinkedList35.next()) {
			local5.method9130(arg0);
		}
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "([III)V")
	private void method5885(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Linkable_Sub6 local5 = (Linkable_Sub6) this.aLinkedList35.head(); local5 != null; local5 = (Linkable_Sub6) this.aLinkedList35.next()) {
			local5.method9134(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "()Lclient!dea;")
	@Override
	public Linkable_Sub6 method9135() {
		return (Linkable_Sub6) this.aLinkedList35.next();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!ie;Lclient!ada;)V")
	private void method5886(@OriginalArg(0) Linkable arg0, @OriginalArg(1) Linkable_Sub3 arg1) {
		while (arg0 != this.aLinkedList36.sentinel && ((Linkable_Sub3) arg0).anInt101 <= arg1.anInt101) {
			arg0 = arg0.next;
		}
		Static201.method7368(arg0, arg1);
		this.anInt6604 = ((Linkable_Sub3) this.aLinkedList36.sentinel.next).anInt101;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "()Lclient!dea;")
	@Override
	public Linkable_Sub6 method9133() {
		return (Linkable_Sub6) this.aLinkedList35.head();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method9130(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt6604 < 0) {
				this.method5884(arg0);
				return;
			}
			if (this.anInt6603 + arg0 < this.anInt6604) {
				this.anInt6603 += arg0;
				this.method5884(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt6604 - this.anInt6603;
			this.method5884(local29);
			arg0 -= local29;
			this.anInt6603 += local29;
			this.method5887();
			@Pc(50) Linkable_Sub3 local50 = (Linkable_Sub3) this.aLinkedList36.head();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method114(this);
				if (local58 < 0) {
					local50.anInt101 = 0;
					this.method5888(local50);
				} else {
					local50.anInt101 = local58;
					this.method5886(local50.next, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "()V")
	private void method5887() {
		if (this.anInt6603 <= 0) {
			return;
		}
		for (@Pc(8) Linkable_Sub3 local8 = (Linkable_Sub3) this.aLinkedList36.head(); local8 != null; local8 = (Linkable_Sub3) this.aLinkedList36.next()) {
			local8.anInt101 -= this.anInt6603;
		}
		this.anInt6604 -= this.anInt6603;
		this.anInt6603 = 0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!ada;)V")
	private void method5888(@OriginalArg(0) Linkable_Sub3 arg0) {
		arg0.unlink();
		arg0.method113();
		@Pc(9) Linkable local9 = this.aLinkedList36.sentinel.next;
		if (local9 == this.aLinkedList36.sentinel) {
			this.anInt6604 = -1;
		} else {
			this.anInt6604 = ((Linkable_Sub3) local9).anInt101;
		}
	}
}
