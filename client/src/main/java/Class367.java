import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class367 {

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "F")
	public float aFloat201 = 1.0F;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "F")
	public float aFloat203 = 1.0F;

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "F")
	public float aFloat200 = 0.25F;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
	public int lightY;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!pu;")
	public Class67 aClass67_10;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
	public int lightX;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "F")
	public float light1Diffuse;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Lclient!gm;")
	public Class148 aClass148_5;

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
	public int screenColorRgb;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "F")
	public float light0Diffuse;

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "F")
	public float lightModelAmbient;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
	public int lightZ;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
	public int fogColorRgb;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public int fogDepth;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class367() {
		this.lightY = -60;
		this.aClass67_10 = Static226.aClass67_9;
		this.lightX = -50;
		this.light1Diffuse = 1.2F;
		this.aClass148_5 = Static495.aClass148_4;
		this.screenColorRgb = Static68.defaultLightColorRgb;
		this.light0Diffuse = 0.69921875F;
		this.lightModelAmbient = 1.1523438F;
		this.lightZ = -50;
		this.fogColorRgb = Static563.defaulFogColorRgb;
		this.fogDepth = 0;
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class367(@OriginalArg(0) Packet arg0) {
		this.method8386(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method8384(@OriginalArg(0) Packet arg0) {
		@Pc(17) int local17 = arg0.g2();
		@Pc(21) int local21 = arg0.g2s();
		@Pc(25) int local25 = arg0.g2s();
		@Pc(29) int local29 = arg0.g2s();
		@Pc(33) int local33 = arg0.g2();
		Static436.anInt3852 = local33;
		this.aClass148_5 = Static344.method5047(local25, local17, local21, local29);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ge;Z)V")
	public void method8385(@OriginalArg(0) Packet arg0) {
		this.aFloat201 = (float) (arg0.g1() * 8) / 255.0F;
		this.aFloat200 = (float) (arg0.g1() * 8) / 255.0F;
		this.aFloat203 = (float) (arg0.g1() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Lclient!ge;I)V")
	public void method8386(@OriginalArg(0) Packet arg0) {
		@Pc(7) int local7 = arg0.g1();
		if (Static400.aClass2_Sub34_28.aPreference_Sub24_1.method7082() == 1 && Static425.aClass19_13.method7955() > 0) {
			if ((local7 & 0x1) == 0) {
				this.screenColorRgb = Static68.defaultLightColorRgb;
			} else {
				this.screenColorRgb = arg0.g4();
			}
			if ((local7 & 0x2) == 0) {
				this.lightModelAmbient = 1.1523438F;
			} else {
				this.lightModelAmbient = (float) arg0.g2() / 256.0F;
			}
			if ((local7 & 0x4) == 0) {
				this.light0Diffuse = 0.69921875F;
			} else {
				this.light0Diffuse = (float) arg0.g2() / 256.0F;
			}
			if ((local7 & 0x8) == 0) {
				this.light1Diffuse = 1.2F;
			} else {
				this.light1Diffuse = (float) arg0.g2() / 256.0F;
			}
		} else {
			if ((local7 & 0x1) != 0) {
				arg0.g4();
			}
			if ((local7 & 0x2) != 0) {
				arg0.g2();
			}
			if ((local7 & 0x4) != 0) {
				arg0.g2();
			}
			if ((local7 & 0x8) != 0) {
				arg0.g2();
			}
			this.light1Diffuse = 1.2F;
			this.lightModelAmbient = 1.1523438F;
			this.light0Diffuse = 0.69921875F;
			this.screenColorRgb = Static68.defaultLightColorRgb;
		}
		if ((local7 & 0x10) == 0) {
			this.lightX = -50;
			this.lightZ = -50;
			this.lightY = -60;
		} else {
			this.lightX = arg0.g2s();
			this.lightY = arg0.g2s();
			this.lightZ = arg0.g2s();
		}
		if ((local7 & 0x20) == 0) {
			this.fogColorRgb = Static563.defaulFogColorRgb;
		} else {
			this.fogColorRgb = arg0.g4();
		}
		if ((local7 & 0x40) == 0) {
			this.fogDepth = 0;
		} else {
			this.fogDepth = arg0.g2();
		}
		if ((local7 & 0x80) == 0) {
			this.aClass67_10 = Static226.aClass67_9;
			return;
		}
		@Pc(251) int local251 = arg0.g2();
		@Pc(255) int local255 = arg0.g2();
		@Pc(261) int local261 = arg0.g2();
		@Pc(265) int local265 = arg0.g2();
		@Pc(271) int local271 = arg0.g2();
		@Pc(275) int local275 = arg0.g2();
		this.aClass67_10 = Static373.method5301(local271, local255, local261, local265, local275, local251);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!uc;)Z")
	public boolean method8388(@OriginalArg(1) Class367 arg0) {
		return this.screenColorRgb == arg0.screenColorRgb && arg0.lightModelAmbient == this.lightModelAmbient && this.light0Diffuse == arg0.light0Diffuse && this.light1Diffuse == arg0.light1Diffuse && arg0.aFloat200 == this.aFloat200 && this.aFloat201 == arg0.aFloat201 && this.aFloat203 == arg0.aFloat203 && this.fogColorRgb == arg0.fogColorRgb && arg0.fogDepth == this.fogDepth && arg0.aClass67_10 == this.aClass67_10 && arg0.aClass148_5 == this.aClass148_5;
	}
}
