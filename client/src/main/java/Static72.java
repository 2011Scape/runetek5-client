import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "J")
	public static long aLong52;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Lclient!lga;")
	public static final ServerProt ServerProt35 = new ServerProt(125, 2);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method1527(@OriginalArg(1) int[] arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(9) int local9 = Static331.anInt5440;
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(19) QuestType local19 = Static272.aQuestTypeList1.method1094(arg0[local11]);
			if (local19.anInt5704 != -1) {
				@Pc(34) SoftwareIndexedSprite local34 = (SoftwareIndexedSprite) Static452.aSoftLruHashTable149.get((long) local19.anInt5704);
				if (local34 == null) {
					@Pc(42) Class407 local42 = Static735.method9382(client.sprites, local19.anInt5704, 0);
					if (local42 != null) {
						local34 = Static163.aClass19_17.method7948(local42, true);
						Static452.aSoftLruHashTable149.put((long) local19.anInt5704, local34);
					}
				}
				if (local34 != null) {
					Static186.aSoftwareIndexedSpriteArray5[local9] = local34;
					local7.append(" <img=").append(local9).append(">");
					local9++;
				}
			}
		}
		return local7.toString();
	}
}
