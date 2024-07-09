import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lha")
public final class Class226 implements Runnable {

	@OriginalMember(owner = "client!lha", name = "h", descriptor = "Lclient!sia;")
	private final LinkedList aLinkedList32 = new LinkedList();

	@OriginalMember(owner = "client!lha", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4 = new Thread(this);

	@OriginalMember(owner = "client!lha", name = "<init>", descriptor = "()V")
	public Class226() {
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!lha", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) LinkedList local8 = this.aLinkedList32;
			@Pc(43) Linkable_Sub12 local43;
			synchronized (this.aLinkedList32) {
				@Pc(15) Linkable local15;
				for (local15 = this.aLinkedList32.removeHead(); local15 == null; local15 = this.aLinkedList32.removeHead()) {
					try {
						this.aLinkedList32.wait();
					} catch (@Pc(23) InterruptedException local23) {
					}
				}
				if (!(local15 instanceof Linkable_Sub12)) {
					return;
				}
				local43 = (Linkable_Sub12) local15;
			}
			@Pc(69) int local69;
			try {
				@Pc(54) byte[] local54 = InetAddress.getByName(local43.aString14).getAddress();
				local69 = jagmisc.ping(local54[0], local54[1], local54[2], local54[3], 1000L);
			} catch (@Pc(71) Throwable local71) {
				local69 = 1000;
			}
			local43.anInt1631 = local69;
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(I)V")
	public void method5243() {
		if (this.aThread4 == null) {
			return;
		}
		this.method5244(new Linkable());
		try {
			this.aThread4.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread4 = null;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILclient!ie;)V")
	private void method5244(@OriginalArg(1) Linkable arg0) {
		@Pc(2) LinkedList local2 = this.aLinkedList32;
		synchronized (this.aLinkedList32) {
			this.aLinkedList32.addTail(arg0);
			this.aLinkedList32.notify();
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(BLjava/lang/String;)Lclient!cja;")
	public Linkable_Sub12 method5245(@OriginalArg(1) String arg0) {
		if (this.aThread4 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(32) Linkable_Sub12 local32 = new Linkable_Sub12(arg0);
			this.method5244(local32);
			return local32;
		}
	}
}
