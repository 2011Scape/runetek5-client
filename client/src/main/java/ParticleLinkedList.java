import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fla")
public final class ParticleLinkedList {

	@OriginalMember(owner = "client!fla", name = "f", descriptor = "Lclient!ep;")
	private ParticleNode aParticleNode28;

	@OriginalMember(owner = "client!fla", name = "j", descriptor = "Lclient!ep;")
	private final ParticleNode aParticleNode27 = new ParticleNode();

	@OriginalMember(owner = "client!fla", name = "<init>", descriptor = "()V")
	public ParticleLinkedList() {
		this.aParticleNode27.aParticleNode67 = this.aParticleNode27;
		this.aParticleNode27.aParticleNode68 = this.aParticleNode27;
	}

	@OriginalMember(owner = "client!fla", name = "d", descriptor = "(I)Z")
	public boolean method2782() {
		return this.aParticleNode27 == this.aParticleNode27.aParticleNode68;
	}

	@OriginalMember(owner = "client!fla", name = "e", descriptor = "(I)Lclient!ep;")
	public ParticleNode method2783() {
		@Pc(15) ParticleNode local15 = this.aParticleNode27.aParticleNode68;
		if (local15 == this.aParticleNode27) {
			return null;
		} else {
			local15.method9274();
			return local15;
		}
	}

	@OriginalMember(owner = "client!fla", name = "c", descriptor = "(I)I")
	public int method2784() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) ParticleNode local11 = this.aParticleNode27.aParticleNode68; local11 != this.aParticleNode27; local11 = local11.aParticleNode68) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(I)Lclient!ep;")
	public ParticleNode method2785() {
		@Pc(6) ParticleNode local6 = this.aParticleNode28;
		if (this.aParticleNode27 == local6) {
			this.aParticleNode28 = null;
			return null;
		} else {
			this.aParticleNode28 = local6.aParticleNode68;
			return local6;
		}
	}

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(ZLclient!ep;)V")
	public void method2787(@OriginalArg(1) ParticleNode arg0) {
		if (arg0.aParticleNode67 != null) {
			arg0.method9274();
		}
		arg0.aParticleNode67 = this.aParticleNode27.aParticleNode67;
		arg0.aParticleNode68 = this.aParticleNode27;
		arg0.aParticleNode67.aParticleNode68 = arg0;
		arg0.aParticleNode68.aParticleNode67 = arg0;
	}

	@OriginalMember(owner = "client!fla", name = "b", descriptor = "(I)Lclient!ep;")
	public ParticleNode method2788() {
		@Pc(15) ParticleNode local15 = this.aParticleNode27.aParticleNode67;
		if (local15 == this.aParticleNode27) {
			this.aParticleNode28 = null;
			return null;
		} else {
			this.aParticleNode28 = local15.aParticleNode67;
			return local15;
		}
	}

	@OriginalMember(owner = "client!fla", name = "b", descriptor = "(B)V")
	public void method2789() {
		while (true) {
			@Pc(11) ParticleNode local11 = this.aParticleNode27.aParticleNode68;
			if (local11 == this.aParticleNode27) {
				this.aParticleNode28 = null;
				return;
			}
			local11.method9274();
		}
	}

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(B)Lclient!ep;")
	public ParticleNode method2790() {
		@Pc(15) ParticleNode local15 = this.aParticleNode27.aParticleNode68;
		if (local15 == this.aParticleNode27) {
			this.aParticleNode28 = null;
			return null;
		} else {
			this.aParticleNode28 = local15.aParticleNode68;
			return local15;
		}
	}
}
