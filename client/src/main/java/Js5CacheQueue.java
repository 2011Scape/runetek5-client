import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Js5CacheQueue implements Runnable {

	@OriginalMember(owner = "client!iba", name = "j", descriptor = "[I")
	public static final int[] anIntArray325 = new int[32];

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "Lclient!jga;")
	private final SecondaryLinkedList aSecondaryLinkedList7 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!iba", name = "n", descriptor = "I")
	public int anInt4243 = 0;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "Z")
	private boolean isShuttingDown = false;

	@OriginalMember(owner = "client!iba", name = "g", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	static {
		@Pc(73) int local73 = 2;
		for (@Pc(75) int local75 = 0; local75 < 32; local75++) {
			anIntArray325[local75] = local73 - 1;
			local73 += local73;
		}
	}

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!vq;)V")
	public Js5CacheQueue(@OriginalArg(0) Signlink arg0) {
		@Pc(20) PrivilegedRequest local20 = arg0.startThread(this, 5);
		while (local20.state == 0) {
			Static638.sleep(10L);
		}
		if (local20.state == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.result;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!af;IZ)Lclient!vp;")
	public Js5CacheRequest method3825(@OriginalArg(0) Cache arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Js5CacheRequest local7 = new Js5CacheRequest();
		local7.anInt10352 = 1;
		@Pc(13) SecondaryLinkedList local13 = this.aSecondaryLinkedList7;
		synchronized (this.aSecondaryLinkedList7) {
			@Pc(21) Js5CacheRequest local21 = (Js5CacheRequest) this.aSecondaryLinkedList7.head();
			while (true) {
				if (local21 == null) {
					break;
				}
				if (local21.secondaryKey == (long) arg1 && local21.aCache4 == arg0 && local21.anInt10352 == 2) {
					local7.incomplete = false;
					local7.aByteArray109 = local21.aByteArray109;
					return local7;
				}
				local21 = (Js5CacheRequest) this.aSecondaryLinkedList7.next();
			}
		}
		local7.aByteArray109 = arg0.method126(arg1);
		local7.urgent = true;
		local7.incomplete = false;
		return local7;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
	public void shutDown() {
		this.isShuttingDown = true;
		synchronized (this.aSecondaryLinkedList7) {
			this.aSecondaryLinkedList7.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException e) {
			e.printStackTrace();
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!vp;)V")
	private void method3827(@OriginalArg(1) Js5CacheRequest arg0) {
		@Pc(6) SecondaryLinkedList local6 = this.aSecondaryLinkedList7;
		synchronized (this.aSecondaryLinkedList7) {
			this.aSecondaryLinkedList7.addTail(arg0);
			this.anInt4243++;
			this.aSecondaryLinkedList7.notifyAll();
		}
	}

	@OriginalMember(owner = "client!iba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.isShuttingDown) {
			@Pc(10) SecondaryLinkedList local10 = this.aSecondaryLinkedList7;
			@Pc(18) Js5CacheRequest local18;
			synchronized (this.aSecondaryLinkedList7) {
				local18 = (Js5CacheRequest) this.aSecondaryLinkedList7.removeTail();
				if (local18 == null) {
					try {
						this.aSecondaryLinkedList7.wait();
					} catch (@Pc(26) InterruptedException local26) {
					}
					continue;
				}
				this.anInt4243--;
			}
			try {
				if (local18.anInt10352 == 2) {
					local18.aCache4.method125(local18.aByteArray109.length, local18.aByteArray109, (int) local18.secondaryKey);
				} else if (local18.anInt10352 == 3) {
					local18.aByteArray109 = local18.aCache4.method126((int) local18.secondaryKey);
				}
			} catch (@Pc(83) Exception local83) {
				Static240.method3496(local83, (String) null);
			}
			local18.incomplete = false;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(B[BILclient!af;)Lclient!vp;")
	public Js5CacheRequest method3829(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Cache arg2) {
		@Pc(7) Js5CacheRequest local7 = new Js5CacheRequest();
		local7.secondaryKey = (long) arg1;
		local7.anInt10352 = 2;
		local7.aByteArray109 = arg0;
		local7.aCache4 = arg2;
		local7.urgent = false;
		this.method3827(local7);
		return local7;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!af;II)Lclient!vp;")
	public Js5CacheRequest method3830(@OriginalArg(0) Cache arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Js5CacheRequest local7 = new Js5CacheRequest();
		local7.aCache4 = arg0;
		local7.urgent = false;
		local7.anInt10352 = 3;
		local7.secondaryKey = (long) arg1;
		this.method3827(local7);
		return local7;
	}
}
