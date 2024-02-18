import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sba")
public final class Class331 {

	@OriginalMember(owner = "client!sba", name = "i", descriptor = "Lclient!av;")
	private HashTable aHashTable41;

	@OriginalMember(owner = "client!sba", name = "j", descriptor = "Lclient!ie;")
	private Linkable aLinkable_266;

	@OriginalMember(owner = "client!sba", name = "k", descriptor = "I")
	private int anInt8579 = 0;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "()V")
	private Class331() {
	}

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lclient!av;)V")
	public Class331(@OriginalArg(0) HashTable arg0) {
		this.aHashTable41 = arg0;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)Lclient!ie;")
	public Linkable method7610() {
		@Pc(23) Linkable local23;
		if (this.anInt8579 > 0 && this.aHashTable41.buckets[this.anInt8579 - 1] != this.aLinkable_266) {
			local23 = this.aLinkable_266;
			this.aLinkable_266 = local23.next;
			return local23;
		}
		while (this.aHashTable41.bucketCount > this.anInt8579) {
			local23 = this.aHashTable41.buckets[this.anInt8579++].next;
			if (this.aHashTable41.buckets[this.anInt8579 - 1] != local23) {
				this.aLinkable_266 = local23.next;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Z)Lclient!ie;")
	public Linkable method7613() {
		this.anInt8579 = 0;
		return this.method7610();
	}
}
