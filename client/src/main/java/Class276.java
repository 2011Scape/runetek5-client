import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oia")
public final class Class276 {

	@OriginalMember(owner = "client!oia", name = "D", descriptor = "Z")
	private boolean aBoolean522;

	@OriginalMember(owner = "client!oia", name = "x", descriptor = "Lclient!rq;")
	private Class93_Sub2 aClass93_Sub2_4;

	@OriginalMember(owner = "client!oia", name = "i", descriptor = "Lclient!ut;")
	private SecondaryLinkable_Sub19 aClass2_Sub2_Sub19_1;

	@OriginalMember(owner = "client!oia", name = "F", descriptor = "Lclient!ut;")
	private SecondaryLinkable_Sub19 aClass2_Sub2_Sub19_2;

	@OriginalMember(owner = "client!oia", name = "C", descriptor = "I")
	private int anInt6944 = 1;

	@OriginalMember(owner = "client!oia", name = "z", descriptor = "I")
	private int anInt6943 = 1;

	@OriginalMember(owner = "client!oia", name = "J", descriptor = "I")
	private int anInt6948 = 0;

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "I")
	private int anInt6942 = 0;

	@OriginalMember(owner = "client!oia", name = "l", descriptor = "Lclient!sia;")
	private final LinkedList aLinkedList39 = new LinkedList();

	@OriginalMember(owner = "client!oia", name = "m", descriptor = "[Lclient!rq;")
	private Class93_Sub2[] aClass93_Sub2Array2 = new Class93_Sub2[2];

	@OriginalMember(owner = "client!oia", name = "K", descriptor = "Z")
	private boolean aBoolean524 = true;

	@OriginalMember(owner = "client!oia", name = "h", descriptor = "Z")
	private boolean aBoolean525 = true;

	@OriginalMember(owner = "client!oia", name = "H", descriptor = "I")
	private int anInt6954 = 0;

	@OriginalMember(owner = "client!oia", name = "w", descriptor = "Z")
	private boolean aBoolean528 = false;

	@OriginalMember(owner = "client!oia", name = "u", descriptor = "Z")
	private boolean aBoolean527 = true;

	@OriginalMember(owner = "client!oia", name = "o", descriptor = "Z")
	private boolean aBoolean526 = true;

	@OriginalMember(owner = "client!oia", name = "s", descriptor = "I")
	private int anInt6955 = -1;

	@OriginalMember(owner = "client!oia", name = "G", descriptor = "Lclient!qha;")
	private final Class19_Sub3 aClass19_Sub3_32;

	@OriginalMember(owner = "client!oia", name = "e", descriptor = "Lclient!wo;")
	private Class406 aClass406_4;

	@OriginalMember(owner = "client!oia", name = "k", descriptor = "Lclient!wo;")
	private Class406 aClass406_5;

	@OriginalMember(owner = "client!oia", name = "E", descriptor = "Lclient!wo;")
	private Class406 aClass406_3;

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Lclient!qha;)V")
	public Class276(@OriginalArg(0) Class19_Sub3 arg0) {
		this.aClass19_Sub3_32 = arg0;
		if (this.aClass19_Sub3_32.aBoolean613 && this.aClass19_Sub3_32.aBoolean595) {
			this.aClass406_5 = this.aClass406_4 = new Class406(this.aClass19_Sub3_32);
			if (this.aClass19_Sub3_32.anInt7986 > 1 && this.aClass19_Sub3_32.aBoolean602 && this.aClass19_Sub3_32.aBoolean617) {
				this.aClass406_5 = this.aClass406_3 = new Class406(this.aClass19_Sub3_32);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(B)Z")
	private boolean method6244() {
		if (this.aBoolean527) {
			if (this.aClass2_Sub2_Sub19_1 != null) {
				this.aClass2_Sub2_Sub19_1.method8609();
				this.aClass2_Sub2_Sub19_1 = null;
			}
			if (this.aClass93_Sub2_4 != null) {
				this.aClass93_Sub2_4.method9442();
				this.aClass93_Sub2_4 = null;
			}
			if (this.aClass406_3 != null) {
				this.aClass2_Sub2_Sub19_1 = new SecondaryLinkable_Sub19(this.aClass19_Sub3_32, 6402, this.anInt6944, this.anInt6943, this.aClass19_Sub3_32.anInt7986);
			}
			if (this.aBoolean528) {
				this.aClass93_Sub2_4 = new Class93_Sub2(this.aClass19_Sub3_32, 34037, 6402, this.anInt6944, this.anInt6943);
			} else if (this.aClass2_Sub2_Sub19_1 == null) {
				this.aClass2_Sub2_Sub19_1 = new SecondaryLinkable_Sub19(this.aClass19_Sub3_32, 6402, this.anInt6944, this.anInt6943);
			}
			this.aBoolean525 = true;
			this.aBoolean524 = true;
			this.aBoolean527 = false;
		}
		if (this.aBoolean526) {
			if (this.aClass2_Sub2_Sub19_2 != null) {
				this.aClass2_Sub2_Sub19_2.method8609();
				this.aClass2_Sub2_Sub19_2 = null;
			}
			if (this.aClass93_Sub2Array2[0] != null) {
				this.aClass93_Sub2Array2[0].method9442();
				this.aClass93_Sub2Array2[0] = null;
			}
			if (this.aClass93_Sub2Array2[1] != null) {
				this.aClass93_Sub2Array2[1].method9442();
				this.aClass93_Sub2Array2[1] = null;
			}
			if (this.aClass406_3 != null) {
				this.aClass2_Sub2_Sub19_2 = new SecondaryLinkable_Sub19(this.aClass19_Sub3_32, this.anInt6955, this.anInt6944, this.anInt6943, this.aClass19_Sub3_32.anInt7986);
			}
			this.aClass93_Sub2Array2[0] = new Class93_Sub2(this.aClass19_Sub3_32, 34037, this.anInt6955, this.anInt6944, this.anInt6943);
			this.aClass93_Sub2Array2[1] = this.anInt6954 <= 1 ? null : new Class93_Sub2(this.aClass19_Sub3_32, 34037, this.anInt6955, this.anInt6944, this.anInt6943);
			this.aBoolean525 = true;
			this.aBoolean524 = true;
			this.aBoolean526 = false;
		}
		if (this.aBoolean524) {
			if (this.aClass406_3 == null) {
				this.aClass19_Sub3_32.method6967(this.aClass406_4);
				this.aClass406_4.method9363(0);
				this.aClass406_4.method9363(1);
				this.aClass406_4.method9363(8);
				this.aClass406_4.method9369(this.aClass93_Sub2Array2[0], 0);
				if (this.anInt6954 > 1) {
					this.aClass406_4.method9369(this.aClass93_Sub2Array2[1], 1);
				}
				if (this.aBoolean528) {
					this.aClass406_4.method9369(this.aClass93_Sub2_4, 8);
				} else {
					this.aClass406_4.method9366(this.aClass2_Sub2_Sub19_1, 8);
				}
				this.aClass19_Sub3_32.method6993(this.aClass406_4);
			} else {
				this.aClass19_Sub3_32.method6967(this.aClass406_4);
				this.aClass406_4.method9363(0);
				this.aClass406_4.method9363(1);
				this.aClass406_4.method9363(8);
				this.aClass406_4.method9369(this.aClass93_Sub2Array2[0], 0);
				if (this.anInt6954 > 1) {
					this.aClass406_4.method9369(this.aClass93_Sub2Array2[1], 1);
				}
				if (this.aBoolean528) {
					this.aClass406_4.method9369(this.aClass93_Sub2_4, 8);
				}
				this.aClass19_Sub3_32.method6993(this.aClass406_4);
				this.aClass19_Sub3_32.method6967(this.aClass406_3);
				this.aClass406_3.method9363(0);
				this.aClass406_3.method9363(8);
				this.aClass406_3.method9366(this.aClass2_Sub2_Sub19_2, 0);
				this.aClass406_3.method9366(this.aClass2_Sub2_Sub19_1, 8);
				this.aClass19_Sub3_32.method6993(this.aClass406_3);
			}
			this.aBoolean524 = false;
			this.aBoolean525 = true;
		}
		if (this.aBoolean525) {
			this.aClass19_Sub3_32.method6967(this.aClass406_5);
			this.aBoolean525 = !this.aClass406_5.method9368();
			this.aClass19_Sub3_32.method6993(this.aClass406_5);
		}
		return !this.aBoolean525;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(B)V")
	public void method6245() {
		if (!this.aBoolean522) {
			return;
		}
		if (this.aClass406_3 != null) {
			this.aClass19_Sub3_32.method7038(this.aClass406_3);
			@Pc(21) short local21 = 16384;
			this.aClass19_Sub3_32.method7036(this.aClass406_4);
			this.aClass406_3.method9374();
			this.aClass406_4.method9371(0);
			if (this.aBoolean528) {
				local21 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt6944, this.anInt6943, 0, 0, this.anInt6944, this.anInt6943, local21, OpenGL.GL_NEAREST);
			this.aClass19_Sub3_32.method6988(this.aClass406_3);
			this.aClass19_Sub3_32.method7004(this.aClass406_4);
		}
		this.aClass19_Sub3_32.method7018();
		this.aClass19_Sub3_32.method7017(0);
		this.aClass19_Sub3_32.method6991(1);
		this.aClass19_Sub3_32.la();
		@Pc(90) int local90 = 0;
		@Pc(99) int local99 = 1;
		@Pc(115) Linkable_Sub31 local115;
		for (@Pc(105) Linkable_Sub31 local105 = (Linkable_Sub31) this.aLinkedList39.head(); local105 != null; local105 = local115) {
			local115 = (Linkable_Sub31) this.aLinkedList39.next();
			@Pc(119) int local119 = local105.method4605();
			for (@Pc(121) int local121 = 0; local121 < local119; local121++) {
				local105.method4611(this.aClass93_Sub2_4, this.aClass93_Sub2Array2[local90], local121);
				if (local115 == null && local119 - 1 == local121) {
					this.aClass19_Sub3_32.method6993(this.aClass406_4);
					this.aClass19_Sub3_32.method7022(0, 0);
					OpenGL.glBegin(OpenGL.GL_QUADS);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6943);
					OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6942, this.anInt6948);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6942, this.anInt6948 + this.anInt6943);
					OpenGL.glTexCoord2f((float) this.anInt6944, 0.0F);
					OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6944 + this.anInt6942, this.anInt6943 + this.anInt6948);
					OpenGL.glTexCoord2f((float) this.anInt6944, (float) this.anInt6943);
					OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6942 + this.anInt6944, this.anInt6948);
					OpenGL.glEnd();
				} else {
					this.aClass406_4.method9371(local99);
					OpenGL.glBegin(OpenGL.GL_QUADS);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6943);
					OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt6943);
					OpenGL.glTexCoord2f((float) this.anInt6944, 0.0F);
					OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6944, this.anInt6943);
					OpenGL.glTexCoord2f((float) this.anInt6944, (float) this.anInt6943);
					OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6944, 0);
					OpenGL.glEnd();
				}
				local105.method4607(local121);
				local90 = local90 + 1 & 0x1;
				local99 = local99 + 1 & 0x1;
			}
		}
		this.aBoolean522 = false;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!jea;B)Z")
	public boolean method6246(@OriginalArg(0) Linkable_Sub31 arg0) {
		if (this.aClass406_5 != null) {
			if (arg0.method4609() || arg0.method4617()) {
				this.aLinkedList39.addTail(arg0);
				this.method6247();
				if (this.method6244()) {
					if (this.anInt6944 != -1 && this.anInt6943 != -1) {
						arg0.method4614(this.anInt6944, this.anInt6943);
					}
					arg0.aBoolean387 = true;
					return true;
				}
			}
			this.method6251(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)V")
	private void method6247() {
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(32) int local32;
		for (@Pc(25) Linkable_Sub31 local25 = (Linkable_Sub31) this.aLinkedList39.head(); local25 != null; local25 = (Linkable_Sub31) this.aLinkedList39.next()) {
			local32 = local25.method4612();
			if (local15 < local32) {
				local15 = local32;
			}
			local17 += local25.method4605();
			local13 |= local25.method4613();
		}
		if (local15 == 2) {
			local32 = 34836;
		} else if (local15 == 1) {
			local32 = 34842;
		} else {
			local32 = 6408;
		}
		if (local32 != this.anInt6955) {
			this.anInt6955 = local32;
			this.aBoolean526 = true;
		}
		@Pc(105) int local105 = this.anInt6954 <= 2 ? this.anInt6954 : 2;
		@Pc(115) int local115 = local17 <= 2 ? local17 : 2;
		this.anInt6954 = local17;
		if (this.aBoolean528 != local13) {
			this.aBoolean527 = true;
			this.aBoolean528 = local13;
		}
		if (local105 != local115) {
			this.aBoolean524 = this.aBoolean526 = true;
		}
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)Z")
	public boolean method6248() {
		return this.aClass406_5 != null;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Z)V")
	public void method6249() {
		this.aClass2_Sub2_Sub19_1 = null;
		this.aClass2_Sub2_Sub19_2 = null;
		this.aClass406_5 = this.aClass406_3 = this.aClass406_4 = null;
		this.aClass93_Sub2Array2 = null;
		this.aClass93_Sub2_4 = null;
		if (!this.aLinkedList39.isEmpty()) {
			for (@Pc(41) Linkable local41 = this.aLinkedList39.head(); local41 != this.aLinkedList39.sentinel; local41 = local41.next) {
				((Linkable_Sub31) local41).method4608();
			}
		}
		this.anInt6944 = this.anInt6943 = 1;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIIII)Z")
	public boolean method6250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass406_5 == null || this.aLinkedList39.isEmpty()) {
			return false;
		}
		if (arg0 != this.anInt6944 || arg2 != this.anInt6943) {
			this.anInt6944 = arg0;
			this.anInt6943 = arg2;
			for (@Pc(43) Linkable local43 = this.aLinkedList39.head(); local43 != this.aLinkedList39.sentinel; local43 = local43.next) {
				((Linkable_Sub31) local43).method4614(this.anInt6944, this.anInt6943);
			}
			this.aBoolean526 = true;
			this.aBoolean527 = true;
			this.aBoolean524 = true;
		}
		if (!this.method6244()) {
			return false;
		}
		this.anInt6948 = arg3;
		this.aBoolean522 = true;
		this.anInt6942 = arg1;
		this.aClass19_Sub3_32.method6967(this.aClass406_5);
		this.aClass406_5.method9371(0);
		this.aClass19_Sub3_32.method7022(this.anInt6943 + this.anInt6948 - this.aClass19_Sub3_32.anInt7956, -this.anInt6942);
		return true;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILclient!jea;)V")
	public void method6251(@OriginalArg(1) Linkable_Sub31 arg0) {
		arg0.aBoolean387 = false;
		arg0.method4608();
		arg0.unlink();
		this.method6247();
	}
}
