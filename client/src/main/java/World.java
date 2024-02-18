import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class World extends AbstractWorld {

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "Ljava/lang/String;")
	public String aString90;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
	public int anInt7569;

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "Ljava/lang/String;")
	public String aString91;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
	public int anInt7570 = -1;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)Lclient!ci;")
	public Country method6717() {
		return Static511.aCountryArray1[super.anInt7564];
	}
}
