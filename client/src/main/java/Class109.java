import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class109 implements Interface13 {

	@OriginalMember(owner = "client!en", name = "b", descriptor = "Lclient!st;")
	private SoftwareIndexedSprite aSoftwareIndexedSprite9;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "Lclient!sb;")
	private final Js5 aJs527;

	@OriginalMember(owner = "client!en", name = "g", descriptor = "Lclient!jt;")
	private final Class200 aClass200_1;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!sb;Lclient!jt;)V")
	public Class109(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Class200 arg1) {
		this.aJs527 = arg0;
		this.aClass200_1 = arg1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7749() {
		@Pc(11) int local11 = Static302.anInt4851 >= Static680.anInt10289 ? Static302.anInt4851 : Static680.anInt10289;
		@Pc(19) int local19 = Static380.anInt5979 <= Static479.anInt7201 ? Static479.anInt7201 : Static380.anInt5979;
		@Pc(23) int local23 = this.aSoftwareIndexedSprite9.method8203();
		@Pc(27) int local27 = this.aSoftwareIndexedSprite9.method8192();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = local11;
		@Pc(37) int local37 = local11 * local27 / local23;
		@Pc(44) int local44 = (local19 - local37) / 2;
		if (local19 < local37) {
			local31 = local23 * local19 / local27;
			local37 = local19;
			local44 = 0;
			local29 = (local11 - local31) / 2;
		}
		this.aSoftwareIndexedSprite9.method8206(local29, local44, local31, local37);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	@Override
	public void method7748() {
		this.aSoftwareIndexedSprite9 = Static652.method8533(this.aClass200_1.anInt4996, this.aJs527);
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7747() {
		return this.aJs527.isFileReady(this.aClass200_1.anInt4996);
	}
}
