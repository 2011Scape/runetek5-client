import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class ClientStream implements Runnable {

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "Lclient!oba;")
	private PrivilegedRequest aPrivilegedRequest3;

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "[B")
	private byte[] aByteArray79;

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "Z")
	private boolean isShuttingDown = false;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
	private int anInt6541 = 0;

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
	private int anInt6540 = 0;

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "Z")
	private boolean aBoolean489 = false;

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "Lclient!vq;")
	private final Signlink aSignlink5;

	@OriginalMember(owner = "client!nk", name = "w", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
	private final int anInt6537;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!vq;I)V")
	public ClientStream(@OriginalArg(0) Socket arg0, @OriginalArg(1) Signlink arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSignlink5 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
		this.anInt6537 = arg2;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public void method5823() throws IOException {
		if (!this.isShuttingDown && this.aBoolean489) {
			this.aBoolean489 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)I")
	public int method5824() throws IOException {
		return this.isShuttingDown ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!nk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(38) int local38;
					@Pc(26) int local26;
					synchronized (this) {
						if (this.anInt6540 == this.anInt6541) {
							if (this.isShuttingDown) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(22) InterruptedException local22) {
							}
						}
						local26 = this.anInt6540;
						if (this.anInt6541 >= this.anInt6540) {
							local38 = this.anInt6541 - this.anInt6540;
						} else {
							local38 = this.anInt6537 - this.anInt6540;
						}
					}
					if (local38 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray79, local26, local38);
					} catch (@Pc(66) IOException local66) {
						this.aBoolean489 = true;
					}
					this.anInt6540 = (this.anInt6540 + local38) % this.anInt6537;
					try {
						if (this.anInt6541 == this.anInt6540) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean489 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream2 != null) {
						this.anInputStream2.close();
					}
					if (this.anOutputStream1 != null) {
						this.anOutputStream1.close();
					}
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(117) IOException local117) {
				}
				this.aByteArray79 = null;
				break;
			}
		} catch (@Pc(122) Exception local122) {
			Static240.method3496(local122, (String) null);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBI[B)V")
	public void method5825(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.isShuttingDown) {
			return;
		}
		while (arg0 > 0) {
			@Pc(22) int local22 = this.anInputStream2.read(arg2, arg1, arg0);
			if (local22 <= 0) {
				throw new EOFException();
			}
			arg1 += local22;
			arg0 -= local22;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
	public void method5826() {
		if (!this.isShuttingDown) {
			this.anInputStream2 = new BrokenInputStream();
			this.anOutputStream1 = new BrokenOutputStream();
		}
	}

	@OriginalMember(owner = "client!nk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.shutDown();
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)I")
	public int method5828() throws IOException {
		return this.isShuttingDown ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II[BB)V")
	public void method5829(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.isShuttingDown) {
			return;
		}
		if (this.aBoolean489) {
			this.aBoolean489 = false;
			throw new IOException();
		}
		if (this.aByteArray79 == null) {
			this.aByteArray79 = new byte[this.anInt6537];
		}
		synchronized (this) {
			for (@Pc(40) int local40 = 0; local40 < arg0; local40++) {
				this.aByteArray79[this.anInt6541] = arg1[local40];
				this.anInt6541 = (this.anInt6541 + 1) % this.anInt6537;
				if ((this.anInt6537 + this.anInt6540 - 100) % this.anInt6537 == this.anInt6541) {
					throw new IOException();
				}
			}
			if (this.aPrivilegedRequest3 == null) {
				this.aPrivilegedRequest3 = this.aSignlink5.startThread(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "(I)V")
	public void shutDown() {
		if (this.isShuttingDown) {
			return;
		}
		synchronized (this) {
			this.isShuttingDown = true;
			this.notifyAll();
		}
		if (this.aPrivilegedRequest3 != null) {
			while (this.aPrivilegedRequest3.state == 0) {
				Static638.sleep(1L);
			}
			if (this.aPrivilegedRequest3.state == 1) {
				try {
					((Thread) this.aPrivilegedRequest3.result).join();
				} catch (@Pc(60) InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		this.aPrivilegedRequest3 = null;
	}
}
