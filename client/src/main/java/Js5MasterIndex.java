import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Js5MasterIndex {

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "Lclient!ge;")
	private Packet buffer;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "[Lclient!pm;")
	private Js5CachedResourceProvider[] resourceProviders;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger4;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "Lclient!pla;")
	private final Js5NetQueue netQueue;

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "Lclient!iba;")
	private final Js5CacheQueue cacheQueue;

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger3;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "Lclient!rja;")
	private Js5NetRequest request;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!pla;Lclient!iba;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Js5MasterIndex(@OriginalArg(0) Js5NetQueue arg0, @OriginalArg(1) Js5CacheQueue arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger4 = arg3;
		this.netQueue = arg0;
		this.cacheQueue = arg1;
		this.aBigInteger3 = arg2;

		if (!this.netQueue.isUrgentRequestQueueFull()) {
			this.request = this.netQueue.read(255, 255, true, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)Z")
	public boolean method5800() {
		if (this.buffer != null) {
			return true;
		}
		if (this.request == null) {
			if (this.netQueue.isUrgentRequestQueueFull()) {
				return false;
			}
			this.request = this.netQueue.read(255, 255, true, (byte) 0);
		}
		if (this.request.incomplete) {
			return false;
		}
		@Pc(49) Packet buf = new Packet(this.request.getData());
		buf.pos = 5;
		@Pc(56) int local56 = buf.g1();
		buf.pos += local56 * 72;
		@Pc(72) byte[] local72 = new byte[buf.data.length - buf.pos];
		buf.gdata(local72, 0, local72.length);
		@Pc(102) byte[] local102;
		if (this.aBigInteger3 == null || this.aBigInteger4 == null) {
			local102 = local72;
		} else {
			@Pc(92) BigInteger local92 = new BigInteger(local72);
			@Pc(99) BigInteger local99 = local92.modPow(this.aBigInteger3, this.aBigInteger4);
			local102 = local99.toByteArray();
		}
		if (local102.length != 65) {
			throw new RuntimeException();
		}
		@Pc(131) byte[] local131 = Static607.method8161(buf.data, buf.pos - local72.length - 5, 5);
		for (@Pc(140) int local140 = 0; local140 < 64; local140++) {
			if (local131[local140] != local102[local140 + 1]) {
				throw new RuntimeException();
			}
		}
		this.resourceProviders = new Js5CachedResourceProvider[local56];
		this.buffer = buf;
		return true;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!af;ILclient!af;B)Lclient!pm;")
	public Js5CachedResourceProvider getResourceProvider(@OriginalArg(0) Cache arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Cache arg2) {
		return this.getResourceProviderInternal(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLclient!af;ILclient!af;I)Lclient!pm;")
	private Js5CachedResourceProvider getResourceProviderInternal(@OriginalArg(1) Cache arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Cache arg2) {
		if (this.buffer == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || arg1 >= this.resourceProviders.length) {
			throw new RuntimeException();
		} else if (this.resourceProviders[arg1] == null) {
			this.buffer.pos = arg1 * 72 + 6;
			@Pc(52) int local52 = this.buffer.g4();
			@Pc(57) int local57 = this.buffer.g4();
			@Pc(60) byte[] local60 = new byte[64];
			this.buffer.gdata(local60, 0, 64);
			@Pc(84) Js5CachedResourceProvider local84 = new Js5CachedResourceProvider(arg1, arg0, arg2, this.netQueue, this.cacheQueue, local52, local60, local57, true);
			this.resourceProviders[arg1] = local84;
			return local84;
		} else {
			return this.resourceProviders[arg1];
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public void cycle() {
		if (this.resourceProviders == null) {
			return;
		}

		for (@Pc(12) int i = 0; i < this.resourceProviders.length; i++) {
			if (this.resourceProviders[i] != null) {
				this.resourceProviders[i].processPrefetchQueue();
			}
		}

		for (@Pc(41) int i = 0; i < this.resourceProviders.length; i++) {
			if (this.resourceProviders[i] != null) {
				this.resourceProviders[i].cycle();
			}
		}
	}
}
