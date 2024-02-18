import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bja")
public final class Class43 {

	@OriginalMember(owner = "client!bja", name = "b", descriptor = "[Lclient!fla;")
	public static final ParticleLinkedList[] aParticleLinkedListArray1 = new ParticleLinkedList[5];

	static {
		for (@Pc(25) int local25 = 0; local25 < aParticleLinkedListArray1.length; local25++) {
			aParticleLinkedListArray1[local25] = new ParticleLinkedList();
		}
	}
}
