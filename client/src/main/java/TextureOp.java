import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public abstract class TextureOp extends Linkable {

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
	public int anInt10880;

	@OriginalMember(owner = "client!pf", name = "D", descriptor = "Lclient!ug;")
	protected ColorImageCache aColorImageCache41;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "Lclient!ija;")
	protected MonochromeImageCache aMonochromeImageCache41;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "Z")
	public boolean aBoolean824;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "[Lclient!pf;")
	public final TextureOp[] aClass2_Sub1Array42;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IZ)V")
	protected TextureOp(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean824 = arg1;
		this.aClass2_Sub1Array42 = new TextureOp[arg0];
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lclient!pf;")
	public static TextureOp create(@OriginalArg(0) int type) {
		if (type == 0) {
			return new TextureOpMonochromeFill();
		} else if (type == 1) {
			return new TextureOpColorFill();
		} else if (type == 2) {
			return new TextureOpHorizontalGradient();
		} else if (type == 3) {
			return new TextureOpVerticalGradient();
		} else if (type == 4) {
			return new TextureOpBricks();
		} else if (type == 5) {
			return new TextureOpBoxBlur();
		} else if (type == 6) {
			return new TextureOpClamp();
		} else if (type == 7) {
			return new TextureOpCombine();
		} else if (type == 8) {
			return new TextureOpCurve();
		} else if (type == 9) {
			return new TextureOpFlip();
		} else if (type == 10) {
			return new TextureOpColorGradient();
		} else if (type == 11) {
			return new TextureOpColorize();
		} else if (type == 12) {
			return new TextureOpWaveform();
		} else if (type == 13) {
			return new TextureOpNoise();
		} else if (type == 14) {
			return new TextureOpWeave();
		} else if (type == 15) {
			return new TextureOpVoronoiNoise();
		} else if (type == 16) {
			return new TextureOpHerringbone();
		} else if (type == 17) {
			return new TextureOpHslAdjust();
		} else if (type == 18) {
			return new TextureOpTiledSprite();
		} else if (type == 19) {
			return new TextureOpPolarDistortion();
		} else if (type == 20) {
			return new TextureOpTile();
		} else if (type == 21) {
			return new TextureOpInterpolate();
		} else if (type == 22) {
			return new TextureOpInvert();
		} else if (type == 23) {
			return new TextureOpKaleidoscope();
		} else if (type == 24) {
			return new TextureOpMonochrome();
		} else if (type == 25) {
			return new TextureOpBrightness();
		} else if (type == 26) {
			return new TextureOpBinary();
		} else if (type == 27) {
			return new TextureOpSquareWaveform();
		} else if (type == 28) {
			return new TextureOpIrregularBricks();
		} else if (type == 29) {
			return new TextureOpRasterizer();
		} else if (type == 30) {
			return new TextureOpRange();
		} else if (type == 31) {
			return new TextureOpMandelbrot();
		} else if (type == 32) {
			return new TextureOpEmboss();
		} else if (type == 33) {
			return new TextureOpColorEdgeDetector();
		} else if (type == 34) {
			return new TextureOpPerlinNoise();
		} else if (type == 35) {
			return new TextureOpMonochromeEdgeDetector();
		} else if (type == 36) {
			return new TextureOpTexture();
		} else if (type == 37) {
			return new TextureOp37();
		} else if (type == 38) {
			return new TextureOpLineNoise();
		} else if (type == 39) {
			return new TextureOpSprite();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)I")
	public int method9412() {
		return -1;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)[[I")
	protected final int[][] method9413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub1Array42[arg0].aBoolean824) {
			@Pc(36) int[] local36 = this.aClass2_Sub1Array42[arg0].method9411(111, arg1);
			return new int[][] { local36, local36, local36 };
		} else {
			return this.aClass2_Sub1Array42[arg0].method9414(arg1);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)[[I")
	public int[][] method9414(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLclient!ge;I)V")
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			Static485.method9420(true, (float[]) null, 33);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZ)V")
	public void method9418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) int local22 = this.anInt10880 == 255 ? arg0 : this.anInt10880;
		if (this.aBoolean824) {
			this.aMonochromeImageCache41 = new MonochromeImageCache(local22, arg0, arg1);
		} else {
			this.aColorImageCache41 = new ColorImageCache(local22, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)I")
	public int method9419() {
		return -1;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
	public void method9421(@OriginalArg(0) int arg0) {
		if (arg0 != 7) {
			Static485.anIntArray886 = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)[I")
	protected final int[] method9422(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub1Array42[arg1].aBoolean824 ? this.aClass2_Sub1Array42[arg1].method9411(120, arg0) : this.aClass2_Sub1Array42[arg1].method9414(arg0)[0];
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
	public void method9423() {
		if (this.aBoolean824) {
			this.aMonochromeImageCache41.method3934();
			this.aMonochromeImageCache41 = null;
		} else {
			this.aColorImageCache41.method8449();
			this.aColorImageCache41 = null;
		}
	}
}
