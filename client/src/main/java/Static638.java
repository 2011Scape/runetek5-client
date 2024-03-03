import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)V")
	public static void method8393() {
		@Pc(5) ParticleLinkedList[] local5 = Class43.aParticleLinkedListArray1;
		synchronized (Class43.aParticleLinkedListArray1) {
			for (@Pc(9) int local9 = 0; local9 < Class43.aParticleLinkedListArray1.length; local9++) {
				Class43.aParticleLinkedListArray1[local9] = new ParticleLinkedList();
				Static159.anIntArray245[local9] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!vq;BIILjava/awt/Component;)Lclient!cd;")
	public static AudioChannel method8394(@OriginalArg(0) Signlink arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static686.anInt8944 == 0) {
			throw new IllegalStateException();
		} else if (arg1 >= 2) {
			throw new IllegalArgumentException();
		} else {
			try {
				@Pc(41) AudioChannel local41 = (AudioChannel) Class.forName("JavaAudioChannel").getDeclaredConstructor().newInstance();
				local41.anIntArray315 = new int[(Static316.aBoolean644 ? 2 : 1) * 256];
				local41.anInt4098 = arg2;
				local41.method3593(arg3);
				local41.anInt4097 = (-1024 & arg2) + 1024;
				if (local41.anInt4097 > 16384) {
					local41.anInt4097 = 16384;
				}
				local41.method3588(local41.anInt4097);
				if (Static156.anInt2679 > 0 && Static232.aAudioThread1 == null) {
					Static232.aAudioThread1 = new AudioThread();
					Static232.aAudioThread1.aSignlink2 = arg0;
					arg0.method8991(Static232.aAudioThread1, Static156.anInt2679);
				}
				if (Static232.aAudioThread1 != null) {
					if (Static232.aAudioThread1.aAudioChannelArray1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static232.aAudioThread1.aAudioChannelArray1[arg1] = local41;
				}
				return local41;
			} catch (@Pc(135) Throwable local135) {
				try {
					@Pc(141) SignLinkAudioChannel local141 = new SignLinkAudioChannel(arg0, arg1);
					local141.anIntArray315 = new int[(Static316.aBoolean644 ? 2 : 1) * 256];
					local141.anInt4098 = arg2;
					local141.method3593(arg3);
					local141.anInt4097 = 16384;
					local141.method3588(local141.anInt4097);
					if (Static156.anInt2679 > 0 && Static232.aAudioThread1 == null) {
						Static232.aAudioThread1 = new AudioThread();
						Static232.aAudioThread1.aSignlink2 = arg0;
						arg0.method8991(Static232.aAudioThread1, Static156.anInt2679);
					}
					if (Static232.aAudioThread1 != null) {
						if (Static232.aAudioThread1.aAudioChannelArray1[arg1] != null) {
							throw new IllegalArgumentException();
						}
						Static232.aAudioThread1.aAudioChannelArray1[arg1] = local141;
					}
					return local141;
				} catch (@Pc(211) Throwable local211) {
					return new AudioChannel();
				}
			}
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(JZ)V")
	public static void sleep(@OriginalArg(0) long ms) {
		if (ms <= 0L) {
			return;
		}
		if (ms % 10L == 0L) {
			doSleep(ms - 1L);
			doSleep(1L);
		} else {
			doSleep(ms);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(JB)V")
	public static void doSleep(@OriginalArg(0) long ms) {
		try {
			Thread.sleep(ms);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(Z)Lclient!gh;")
	public static ReferenceNodeFactory method8396() {
		try {
			return (ReferenceNodeFactory) Class.forName("SoftReferenceNodeFactory").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return null;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIII)V")
	public static void method8397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static12.anInt5741 = arg1;
		Static55.anInt1125 = arg3;
		Static314.anInt5035 = arg0;
		Static179.anInt2991 = arg4;
		Static441.anInt6689 = arg2;
		if (Static179.anInt2991 >= 100) {
			@Pc(22) int local22 = Static441.anInt6689 * 512 + 256;
			@Pc(28) int local28 = Static12.anInt5741 * 512 + 256;
			@Pc(36) int local36 = Static102.method2025(Static394.anInt6176, -29754, local28, local22) - Static55.anInt1125;
			@Pc(41) int local41 = local22 - Static170.anInt2864;
			@Pc(46) int local46 = local36 - Static359.anInt5801;
			@Pc(51) int local51 = local28 - Static110.anInt2186;
			@Pc(62) int local62 = (int) Math.sqrt((double) (local51 * local51 + local41 * local41));
			Static598.anInt8832 = (int) (Math.atan2((double) local46, (double) local62) * 2607.5945876176133D) & 0x3FFF;
			Static323.anInt5119 = (int) (-2607.5945876176133D * Math.atan2((double) local41, (double) local51)) & 0x3FFF;
			if (Static598.anInt8832 < 1024) {
				Static598.anInt8832 = 1024;
			}
			Static81.anInt1644 = 0;
			if (Static598.anInt8832 > 3072) {
				Static598.anInt8832 = 3072;
			}
		}
		Static693.anInt10383 = -1;
		Static692.anInt10376 = -1;
		Static511.anInt7645 = 2;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)Lclient!nda;")
	public static ParticleNode_Sub2_Sub5 method8398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class291 local7 = Static334.aClass291ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(15) ParticleNode_Sub2_Sub5 local15 = local7.aClass8_Sub2_Sub5_1;
			local7.aClass8_Sub2_Sub5_1 = null;
			Static109.method2068(local15);
			return local15;
		}
	}
}
