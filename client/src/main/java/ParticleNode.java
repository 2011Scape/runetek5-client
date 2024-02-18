import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class ParticleNode {

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!ep;")
	public ParticleNode aParticleNode67;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Lclient!ep;")
	public ParticleNode aParticleNode68;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V")
	public final void method9274() {
		if (this.aParticleNode67 != null) {
			this.aParticleNode67.aParticleNode68 = this.aParticleNode68;
			this.aParticleNode68.aParticleNode67 = this.aParticleNode67;
			this.aParticleNode68 = null;
			this.aParticleNode67 = null;
		}
	}
}
