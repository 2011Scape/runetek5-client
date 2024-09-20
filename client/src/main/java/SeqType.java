import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cka")
public final class SeqType {

	@OriginalMember(owner = "client!cka", name = "v", descriptor = "[I")
	public int[] anIntArray154;

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "[I")
	public int[] anIntArray155;

	@OriginalMember(owner = "client!cka", name = "y", descriptor = "[[I")
	public int[][] soundeffect;

	@OriginalMember(owner = "client!cka", name = "z", descriptor = "[I")
	public int[] anIntArray156;

	@OriginalMember(owner = "client!cka", name = "e", descriptor = "[Z")
	public boolean[] framegroup;

	@OriginalMember(owner = "client!cka", name = "k", descriptor = "[I")
	public int[] frameDelay;

	@OriginalMember(owner = "client!cka", name = "t", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!cka", name = "m", descriptor = "[I")
	public int[] frameset;

	@OriginalMember(owner = "client!cka", name = "B", descriptor = "[I")
	public int[] frames;

	@OriginalMember(owner = "client!cka", name = "l", descriptor = "I")
	public int replayoff = -1;

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "Z")
	public boolean rotateNormals = false;

	@OriginalMember(owner = "client!cka", name = "d", descriptor = "I")
	public int exactmove = 2;

	@OriginalMember(owner = "client!cka", name = "w", descriptor = "I")
	public int looptype = -1;

	@OriginalMember(owner = "client!cka", name = "u", descriptor = "I")
	public int replaycount = 99;

	@OriginalMember(owner = "client!cka", name = "f", descriptor = "I")
	public int priority = 5;

	@OriginalMember(owner = "client!cka", name = "j", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!cka", name = "g", descriptor = "Z")
	public boolean tween = false;

	@OriginalMember(owner = "client!cka", name = "h", descriptor = "I")
	public int offhand = -1;

	@OriginalMember(owner = "client!cka", name = "n", descriptor = "I")
	public int mainhand = -1;

	@OriginalMember(owner = "client!cka", name = "C", descriptor = "I")
	public int movetype = -1;

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "(I)V")
	public void postDecode() {
		if (this.movetype == -1) {
			if (this.framegroup == null) {
				this.movetype = 0;
			} else {
				this.movetype = 2;
			}
		}
		if (this.looptype != -1) {
			return;
		}
		if (this.framegroup == null) {
			this.looptype = 0;
		} else {
			this.looptype = 2;
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!ge;I)V")
	public void decode(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.decode(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IBLclient!ge;)V")
	private void decode(@OriginalArg(0) int opcode, @OriginalArg(2) Packet arg1) {
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(44) int local44;
		@Pc(58) int local58;
		if (opcode == 1) {
			local20 = arg1.g2();
			this.frameDelay = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.frameDelay[local26] = arg1.g2();
			}
			this.frames = new int[local20];
			for (local44 = 0; local44 < local20; local44++) {
				this.frames[local44] = arg1.g2();
			}
			for (local58 = 0; local58 < local20; local58++) {
				this.frames[local58] = (arg1.g2() << 16) + this.frames[local58];
			}
		} else if (opcode == 2) {
			this.replayoff = arg1.g2();
		} else if (opcode == 3) {
			this.framegroup = new boolean[256];
			local20 = arg1.g1();
			for (local26 = 0; local26 < local20; local26++) {
				this.framegroup[arg1.g1()] = true;
			}
		} else if (opcode == 5) {
			this.priority = arg1.g1();
		} else if (opcode == 6) {
			this.mainhand = arg1.g2();
		} else if (opcode == 7) {
			this.offhand = arg1.g2();
		} else if (opcode == 8) {
			this.replaycount = arg1.g1();
		} else if (opcode == 9) {
			this.looptype = arg1.g1();
		} else if (opcode == 10) {
			this.movetype = arg1.g1();
		} else if (opcode == 11) {
			this.exactmove = arg1.g1();
		} else if (opcode == 12) {
			local20 = arg1.g1();
			this.frameset = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.frameset[local26] = arg1.g2();
			}
			for (local44 = 0; local44 < local20; local44++) {
				this.frameset[local44] += arg1.g2() << 16;
			}
		} else if (opcode == 13) {
			local20 = arg1.g2();
			this.soundeffect = new int[local20][];
			for (local26 = 0; local26 < local20; local26++) {
				local44 = arg1.g1();
				if (local44 > 0) {
					this.soundeffect[local26] = new int[local44];
					this.soundeffect[local26][0] = arg1.g3();
					for (local58 = 1; local58 < local44; local58++) {
						this.soundeffect[local26][local58] = arg1.g2();
					}
				}
			}
		} else if (opcode == 14) {
			this.rotateNormals = true;
		} else if (opcode == 15) {
			this.tween = true;
		} else if (opcode == 16) {
			// empty
		} else if (opcode == 18) {
			this.aBoolean141 = true;
		} else if (opcode == 19) {
			if (this.anIntArray156 == null) {
				this.anIntArray156 = new int[this.soundeffect.length];
				for (local20 = 0; local20 < this.soundeffect.length; local20++) {
					this.anIntArray156[local20] = 255;
				}
			}
			this.anIntArray156[arg1.g1()] = arg1.g1();
		} else if (opcode == 20) {
			if (this.anIntArray154 == null || this.anIntArray155 == null) {
				this.anIntArray154 = new int[this.soundeffect.length];
				this.anIntArray155 = new int[this.soundeffect.length];
				for (local20 = 0; local20 < this.soundeffect.length; local20++) {
					this.anIntArray154[local20] = 256;
					this.anIntArray155[local20] = 256;
				}
			}
			local20 = arg1.g1();
			this.anIntArray154[local20] = arg1.g2();
			this.anIntArray155[local20] = arg1.g2();
		}
	}
}
