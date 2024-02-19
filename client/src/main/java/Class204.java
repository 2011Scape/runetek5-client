import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public final class Class204 {

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
	public final int size;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(II)V")
	public Class204(@OriginalArg(0) int opcode, @OriginalArg(1) int size) {
		this.size = size;
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)[Lclient!kda;")
	public static Class204[] method5281() {
		return new Class204[] { Static515.aClass204_10, Static77.aClass204_1, Static565.aClass204_9, Static535.aClass204_11, Static166.aClass204_6, Static541.aClass204_12, Static647.aClass204_13, Static189.aClass204_7, Static667.aClass204_15, Static505.aClass204_16 };
	}

	@OriginalMember(owner = "client!kda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
