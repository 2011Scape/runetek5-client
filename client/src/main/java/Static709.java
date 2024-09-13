import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static709 {

	@OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
	public static int anInt10667;

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
	public static int anInt10669 = 1;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZIILclient!qha;)Lclient!gb;")
	public static Class93_Sub2_Sub1 method9251(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class19_Sub3 arg3) {
		if (arg3.aBoolean597 || Static700.method9150(arg1) && Static700.method9150(arg0)) {
			return new Class93_Sub2_Sub1(arg3, 3553, arg2, arg1, arg0);
		} else if (arg3.aBoolean595) {
			return new Class93_Sub2_Sub1(arg3, 34037, arg2, arg1, arg0);
		} else {
			return new Class93_Sub2_Sub1(arg3, arg2, arg1, arg0, IntUtils.clp2(arg1), IntUtils.clp2(arg0));
		}
	}

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "(I)V")
	public static void method9252() {
		if (Static655.aClass140Array1 == null) {
			Static655.aClass140Array1 = Static198.method2955();
			Static473.aClass140_22 = Static655.aClass140Array1[0];
			Static72.aLong52 = Static588.currentTimeWithDrift();
		}
		if (Static449.aClass364_1 == null) {
			Static229.method3368();
		}
		@Pc(27) Class140 local27 = Static473.aClass140_22;
		@Pc(35) int local35 = client.method3448();
		if (Static473.aClass140_22 == local27) {
			Static579.aString106 = Static473.aClass140_22.aLocalizedText_63.get(Static51.clientLanguageId);
			if (Static473.aClass140_22.aBoolean264) {
				Static376.anInt5919 = Static473.aClass140_22.anInt3271 + local35 * (Static473.aClass140_22.anInt3270 - Static473.aClass140_22.anInt3271) / 100;
			}
			if (Static473.aClass140_22.aBoolean263) {
				Static579.aString106 = Static579.aString106 + Static376.anInt5919 + "%";
			}
		} else if (Static198.aClass140_21 == Static473.aClass140_22) {
			Static449.aClass364_1 = null;
			Static81.method1586(3);
		} else {
			Static579.aString106 = local27.aLocalizedText_64.get(Static51.clientLanguageId);
			if (Static473.aClass140_22.aBoolean263) {
				Static579.aString106 = Static579.aString106 + local27.anInt3270 + "%";
			}
			Static376.anInt5919 = local27.anInt3270;
			if (Static473.aClass140_22.aBoolean264 || local27.aBoolean264) {
				Static72.aLong52 = Static588.currentTimeWithDrift();
			}
		}
		if (Static449.aClass364_1 == null) {
			return;
		}
		Static449.aClass364_1.method8374(Static376.anInt5919, Static579.aString106, Static473.aClass140_22, Static72.aLong52);
		if (Static234.anInterface22Array1 == null) {
			return;
		}
		for (@Pc(157) int local157 = Static214.anInt3500 + 1; local157 < Static234.anInterface22Array1.length; local157++) {
			if (Static234.anInterface22Array1[local157].method8460() >= 100 && Static214.anInt3500 == local157 - 1 && Static283.gameState >= 1 && Static449.aClass364_1.method8376()) {
				try {
					Static234.anInterface22Array1[local157].method8464();
				} catch (@Pc(197) Exception local197) {
					Static234.anInterface22Array1 = null;
					return;
				}
				Static449.aClass364_1.method8373(Static234.anInterface22Array1[local157]);
				Static214.anInt3500++;
				if (Static214.anInt3500 >= Static234.anInterface22Array1.length - 1 && Static234.anInterface22Array1.length > 1) {
					Static214.anInt3500 = Static333.aClass279_1.method6276() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "(I)V")
	public static void method9254() {
		if (Static249.rebootTimer > 1) {
			Static249.rebootTimer--;
			Static321.anInt5111 = Static642.anInt9599;
		}
		if (Connection.gameConnection.aBoolean278) {
			Connection.gameConnection.aBoolean278 = false;
			Static370.method5279();
			return;
		}
		if (!Static400.aBoolean622) {
			Static79.method1578();
		}
		for (@Pc(34) int local34 = 0; local34 < 100 && Static236.method3451(Connection.gameConnection); local34++) {
		}
		if (Static283.gameState != 11) {
			return;
		}
		@Pc(71) OutboundPacket local71;
		@Pc(80) int local80;
		while (Static232.method3400()) {
			local71 = OutboundPacket.create(Static632.aClientProt110, Connection.gameConnection.random);
			local71.buffer.p1(0);
			local80 = local71.buffer.pos;
			Static437.method5915(local71.buffer);
			local71.buffer.psize1(local71.buffer.pos - local80);
			Connection.gameConnection.queue(local71);
		}
		if (Static211.aClass2_Sub12_3 == null) {
			if (Static675.aLong307 <= Static588.currentTimeWithDrift()) {
				Static211.aClass2_Sub12_3 = Static151.aClass226_20.method5245(Static344.aClass229_1.aString60);
			}
		} else if (Static211.aClass2_Sub12_3.anInt1631 != -1) {
			local71 = OutboundPacket.create(Static50.aClientProt90, Connection.gameConnection.random);
			local71.buffer.p2(Static211.aClass2_Sub12_3.anInt1631);
			Connection.gameConnection.queue(local71);
			Static211.aClass2_Sub12_3 = null;
			Static675.aLong307 = Static588.currentTimeWithDrift() + 30000L;
		}
		@Pc(166) Linkable_Sub9 local166 = (Linkable_Sub9) Static226.aLinkedList58.head();
		@Pc(181) int local181;
		@Pc(208) int local208;
		@Pc(226) int local226;
		@Pc(282) int local282;
		@Pc(288) int local288;
		@Pc(300) int local300;
		@Pc(179) OutboundPacket local179;
		if (local166 != null || Static56.aLong38 < Static588.currentTimeWithDrift() - 2000L) {
			local179 = null;
			local181 = 0;
			for (@Pc(186) Linkable_Sub9 local186 = (Linkable_Sub9) Static677.aLinkedList76.head(); local186 != null && (local179 == null || local179.buffer.pos - local181 < 240); local186 = (Linkable_Sub9) Static677.aLinkedList76.next()) {
				local186.unlink();
				local208 = local186.method5333();
				if (local208 < -1) {
					local208 = -1;
				} else if (local208 > 65534) {
					local208 = 65534;
				}
				local226 = local186.method5331();
				if (local226 < -1) {
					local226 = -1;
				} else if (local226 > 65534) {
					local226 = 65534;
				}
				if (Static172.anInt2890 != local226 || local208 != Static634.anInt9516) {
					if (local179 == null) {
						local179 = OutboundPacket.create(Static603.aClientProt109, Connection.gameConnection.random);
						local179.buffer.p1(0);
						local181 = local179.buffer.pos;
					}
					local282 = local226 - Static172.anInt2890;
					Static172.anInt2890 = local226;
					local288 = local208 - Static634.anInt9516;
					Static634.anInt9516 = local208;
					local300 = (int) ((local186.method5334() - Static56.aLong38) / 20L);
					if (local300 < 8 && local282 >= -32 && local282 <= 31 && local288 >= -32 && local288 <= 31) {
						local282 += 32;
						local288 += 32;
						local179.buffer.p2((local300 << 12) + (local282 << 6) + local288);
					} else if (local300 < 32 && local282 >= -128 && local282 <= 127 && local288 >= -128 && local288 <= 127) {
						local179.buffer.p1(local300 + 128);
						local282 += 128;
						local288 += 128;
						local179.buffer.p2(local288 + (local282 << 8));
					} else if (local300 >= 32) {
						local179.buffer.p2(local300 + 57344);
						if (local226 == 1 || local208 == -1) {
							local179.buffer.p4(Integer.MIN_VALUE);
						} else {
							local179.buffer.p4(local226 | local208 << 16);
						}
					} else {
						local179.buffer.p1(local300 + 192);
						if (local226 == 1 || local208 == -1) {
							local179.buffer.p4(Integer.MIN_VALUE);
						} else {
							local179.buffer.p4(local208 << 16 | local226);
						}
					}
					Static56.aLong38 = local186.method5334();
				}
			}
			if (local179 != null) {
				local179.buffer.psize1(local179.buffer.pos - local181);
				Connection.gameConnection.queue(local179);
			}
		}
		@Pc(541) int local541;
		if (local166 != null) {
			@Pc(527) long local527 = (local166.method5334() - Static180.aLong108) / 50L;
			if (local527 > 32767L) {
				local527 = 32767L;
			}
			Static180.aLong108 = local166.method5334();
			local541 = local166.method5333();
			if (local541 < 0) {
				local541 = 0;
			} else if (local541 > 65535) {
				local541 = 65535;
			}
			local208 = local166.method5331();
			if (local208 < 0) {
				local208 = 0;
			} else if (local208 > 65535) {
				local208 = 65535;
			}
			@Pc(581) byte local581 = 0;
			if (local166.method5328() == 2) {
				local581 = 1;
			}
			local282 = (int) local527;
			@Pc(603) OutboundPacket local603 = OutboundPacket.create(ClientProt.OPCODE_84, Connection.gameConnection.random);
			local603.buffer.p2_alt3(local581 << 15 | local282);
			local603.buffer.p4_alt2(local208 | local541 << 16);
			Connection.gameConnection.queue(local603);
		}
		@Pc(660) long local660;
		if (Static216.anInt3530 > 0) {
			local179 = OutboundPacket.create(Static187.aClientProt36, Connection.gameConnection.random);
			local179.buffer.p1(Static216.anInt3530 * 3);
			for (local181 = 0; local181 < Static216.anInt3530; local181++) {
				@Pc(652) Interface27 local652 = Static591.anInterface27Array2[local181];
				local660 = (local652.method2665() - Static351.aLong173) / 50L;
				if (local660 > 65535L) {
					local660 = 65535L;
				}
				Static351.aLong173 = local652.method2665();
				local179.buffer.p1(local652.method2664());
				local179.buffer.p2((int) local660);
			}
			Connection.gameConnection.queue(local179);
		}
		if (Static232.anInt3764 > 0) {
			Static232.anInt3764--;
		}
		if (Static273.aBoolean339 && Static232.anInt3764 <= 0) {
			Static273.aBoolean339 = false;
			Static232.anInt3764 = 20;
			local179 = OutboundPacket.create(Static235.aClientProt47, Connection.gameConnection.random);
			local179.buffer.p2((int) Static479.aFloat123 >> 3);
			local179.buffer.p2((int) Static171.aFloat64 >> 3);
			Connection.gameConnection.queue(local179);
		}
		if (Static91.aBoolean750 != Static50.aBoolean565) {
			Static50.aBoolean565 = Static91.aBoolean750;
			local179 = OutboundPacket.create(Static621.aClientProt113, Connection.gameConnection.random);
			local179.buffer.p1(Static91.aBoolean750 ? 1 : 0);
			Connection.gameConnection.queue(local179);
		}
		if (!Static503.aBoolean578) {
			local179 = OutboundPacket.create(Static600.aClientProt108, Connection.gameConnection.random);
			local179.buffer.p1(0);
			local181 = local179.buffer.pos;
			@Pc(810) Packet local810 = Static400.aClass2_Sub34_28.encode();
			local179.buffer.pdata(local810.data, 0, local810.pos);
			local179.buffer.psize1(local179.buffer.pos - local181);
			Connection.gameConnection.queue(local179);
			Static503.aBoolean578 = true;
		}
		if (Static334.aClass291ArrayArrayArray1 != null) {
			if (Static511.cameraType == 2) {
				Static592.updateLockedCamera();
			} else if (Static511.cameraType == 3) {
				Static583.updateLoginScreenCamera();
			}
		}
		if (Static494.aBoolean563) {
			Static494.aBoolean563 = false;
		} else {
			Static288.aFloat83 /= 2.0F;
		}
		if (Static15.aBoolean17) {
			Static15.aBoolean17 = false;
		} else {
			Static552.aFloat207 /= 2.0F;
		}
		Static630.method8358();
		if (Static283.gameState != 11) {
			return;
		}
		Static159.method2575();
		Static271.method3930();
		Static35.method918();
		Connection.gameConnection.anInt3646++;
		if (Connection.gameConnection.anInt3646 > 750) {
			Static370.method5279();
			return;
		}
		if (Static1.anInt10798 == 0) {
			Static82.method1593();
			Static13.method158();
		} else {
			if (Static1.anInt10798 == 1 && Static360.method5230(Static717.anInt10817)) {
				Static266.method6774();
				Static1.anInt10798 = 2;
			}
			if (Static1.anInt10798 == 2 && Static283.gameState != 12) {
				Static25.aHashTable4.clear();
				Static440.anInt6680 = 0;
				Static607.anInt9251 = Static333.loop;
				Static1.anInt10798 = 3;
				Static457.method6231();
			}
			if (Static1.anInt10798 == 3) {
				local80 = Static333.loop - Static607.anInt9251;
				if (Static401.aClass39Array1.length > Static440.anInt6680) {
					do {
						@Pc(982) Class39 local982 = Static401.aClass39Array1[Static440.anInt6680];
						if (local982.anInt10553 > local80) {
							break;
						}
						local982.method9161();
					} while (Static1.anInt10798 == 3 && ++Static440.anInt6680 < Static401.aClass39Array1.length);
				}
				if (Static1.anInt10798 == 3) {
					for (local181 = 0; local181 < Static219.aClass236Array1.length; local181++) {
						@Pc(1027) Class236 local1027 = Static219.aClass236Array1[local181];
						if (local1027.aBoolean455) {
							@Pc(1034) PathingEntity local1034 = local1027.method5363();
							Static489.method6547(true, local1034);
						}
					}
				}
			}
		}
		Static90.method1733();
		if (!Static288.aBoolean356) {
			Static598.method7827();
			Static288.aBoolean356 = true;
		}
		for (local80 = Static34.aClass304_1.method6872(true); local80 != -1; local80 = Static34.aClass304_1.method6872(false)) {
			Static36.method977(local80, (byte) 108);
			Static142.anIntArray225[Static635.anInt9525++ & 0x1F] = local80;
		}
		for (@Pc(1099) SecondaryLinkable_Sub2 local1099 = Static81.method1587(); local1099 != null; local1099 = Static81.method1587()) {
			local541 = local1099.method203();
			local660 = local1099.method204();
			if (local541 == 1) {
				Static511.anIntArray614[(int) local660] = local1099.anInt197;
				Static624.aBoolean727 |= Static118.aBooleanArray4[(int) local660];
				Static278.anIntArray350[Static52.anInt1065++ & 0x1F] = (int) local660;
			} else if (local541 == 2) {
				Static37.varcstrs[(int) local660] = local1099.aString1;
				Static268.anIntArray332[Static455.anInt6917++ & 0x1F] = (int) local660;
			} else {
				@Pc(1143) Component local1143;
				if (local541 == 3) {
					local1143 = Static145.getComponent((int) local660);
					if (!local1099.aString1.equals(local1143.text)) {
						local1143.text = local1099.aString1;
						Static178.redraw(local1143);
					}
				} else {
					@Pc(1739) int local1739;
					if (local541 == 4) {
						local1143 = Static145.getComponent((int) local660);
						local288 = local1099.anInt197;
						local300 = local1099.anInt195;
						local1739 = local1099.anInt192;
						if (local288 != local1143.modelType || local300 != local1143.modelId || local1739 != local1143.anInt3738) {
							local1143.anInt3738 = local1739;
							local1143.modelType = local288;
							local1143.modelId = local300;
							Static178.redraw(local1143);
						}
					} else if (local541 == 5) {
						local1143 = Static145.getComponent((int) local660);
						if (local1143.modelSeqId != local1099.anInt197) {
							if (local1099.anInt197 == -1) {
								local1143.aClass152_6 = null;
							} else {
								if (local1143.aClass152_6 == null) {
									local1143.aClass152_6 = new Class152_Sub1();
								}
								local1143.aClass152_6.method9113(true, local1099.anInt197);
							}
							local1143.modelSeqId = local1099.anInt197;
							Static178.redraw(local1143);
						}
					} else if (local541 == 6) {
						local282 = local1099.anInt197;
						local288 = local282 >> 10 & 0x1F;
						local300 = local282 >> 5 & 0x1F;
						local1739 = local282 & 0x1F;
						@Pc(1751) int local1751 = (local300 << 11) + (local288 << 19) + (local1739 << 3);
						@Pc(1756) Component local1756 = Static145.getComponent((int) local660);
						if (local1756.color != local1751) {
							local1756.color = local1751;
							Static178.redraw(local1756);
						}
					} else if (local541 == 7) {
						local1143 = Static145.getComponent((int) local660);
						@Pc(1701) boolean local1701 = local1099.anInt197 == 1;
						if (local1701 != local1143.hidden) {
							local1143.hidden = local1701;
							Static178.redraw(local1143);
						}
					} else if (local541 == 8) {
						local1143 = Static145.getComponent((int) local660);
						if (local1099.anInt197 != local1143.modelXAngle || local1099.anInt195 != local1143.modelYAngle || local1143.modelZoom != local1099.anInt192) {
							local1143.modelXAngle = local1099.anInt197;
							local1143.modelYAngle = local1099.anInt195;
							local1143.modelZoom = local1099.anInt192;
							if (local1143.objId != -1) {
								if (local1143.anInt3800 > 0) {
									local1143.modelZoom = local1143.modelZoom * 32 / local1143.anInt3800;
								} else if (local1143.baseWidth > 0) {
									local1143.modelZoom = local1143.modelZoom * 32 / local1143.baseWidth;
								}
							}
							Static178.redraw(local1143);
						}
					} else if (local541 == 9) {
						local1143 = Static145.getComponent((int) local660);
						if (local1099.anInt197 != local1143.objId || local1099.anInt195 != local1143.objCount) {
							local1143.objCount = local1099.anInt195;
							local1143.objId = local1099.anInt197;
							Static178.redraw(local1143);
						}
					} else if (local541 == 10) {
						local1143 = Static145.getComponent((int) local660);
						if (local1099.anInt197 != local1143.modelXOffset || local1143.modelZOffset != local1099.anInt195 || local1099.anInt192 != local1143.modelYOffset) {
							local1143.modelXOffset = local1099.anInt197;
							local1143.modelZOffset = local1099.anInt195;
							local1143.modelYOffset = local1099.anInt192;
							Static178.redraw(local1143);
						}
					} else if (local541 == 11) {
						local1143 = Static145.getComponent((int) local660);
						local1143.xMode = 0;
						local1143.y = local1143.baseY = local1099.anInt195;
						local1143.x = local1143.baseX = local1099.anInt197;
						local1143.yMode = 0;
						Static178.redraw(local1143);
					} else if (local541 == 12) {
						local1143 = Static145.getComponent((int) local660);
						local288 = local1099.anInt197;
						if (local1143 != null && local1143.type == 0) {
							if (local288 > local1143.scrollMaxV - local1143.height) {
								local288 = local1143.scrollMaxV - local1143.height;
							}
							if (local288 < 0) {
								local288 = 0;
							}
							if (local1143.scrollY != local288) {
								local1143.scrollY = local288;
								Static178.redraw(local1143);
							}
						}
					} else if (local541 == 14) {
						local1143 = Static145.getComponent((int) local660);
						local1143.spriteId = local1099.anInt197;
					} else if (local541 == 15) {
						Static212.anInt3466 = local1099.anInt195;
						Static266.aBoolean583 = true;
						Static675.anInt10156 = local1099.anInt197;
					} else if (local541 == 16) {
						local1143 = Static145.getComponent((int) local660);
						local1143.font = local1099.anInt197;
					} else if (local541 == 20) {
						local1143 = Static145.getComponent((int) local660);
						local1143.aBoolean299 = local1099.anInt197 == 1;
					} else if (local541 == 21) {
						local1143 = Static145.getComponent((int) local660);
						local1143.aBoolean295 = local1099.anInt197 == 1;
					} else if (local541 == 17) {
						local1143 = Static145.getComponent((int) local660);
						local1143.anInt3745 = local1099.anInt197;
					} else if (local541 == 18) {
						local1143 = Static145.getComponent((int) local660);
						local288 = (int) (local660 >> 32);
						local1143.method3406((short) local1099.anInt195, local288, (short) local1099.anInt197);
					} else if (local541 == 19) {
						local1143 = Static145.getComponent((int) local660);
						local288 = (int) (local660 >> 32);
						local1143.method3388((short) local1099.anInt197, local288, (short) local1099.anInt195);
					}
				}
			}
		}
		Static35.anInt800++;
		if (Static616.anInt9417 != 0) {
			Static481.anInt7215 += 20;
			if (Static481.anInt7215 >= 400) {
				Static616.anInt9417 = 0;
			}
		}
		if (Static67.aComponent10 != null) {
			Static499.anInt7501++;
			if (Static499.anInt7501 >= 15) {
				Static178.redraw(Static67.aComponent10);
				Static67.aComponent10 = null;
			}
		}
		Static210.aComponent4 = null;
		Static343.aBoolean428 = false;
		Static702.aBoolean797 = false;
		Static327.aComponent7 = null;
		Static65.method1473(-1, -1, (Component) null);
		if (!Static156.aBoolean223) {
			Static442.anInt6699 = -1;
		}
		Static443.method5981();
		Static642.anInt9599++;
		if (Static118.aBoolean199) {
			@Pc(1980) OutboundPacket local1980 = OutboundPacket.create(Static133.aClientProt26, Connection.gameConnection.random);
			local1980.buffer.p4_alt3(Static614.anInt9373 | Static688.anInt10356 << 28 | Static503.anInt7582 << 14);
			Connection.gameConnection.queue(local1980);
			Static118.aBoolean199 = false;
		}
		while (true) {
			@Pc(2006) Linkable_Sub42 local2006;
			@Pc(2026) Component local2026;
			@Pc(2011) Component local2011;
			do {
				local2006 = (Linkable_Sub42) Static618.highPriorityRequests.removeHead();
				if (local2006 == null) {
					while (true) {
						do {
							local2006 = (Linkable_Sub42) Static59.mediumPriorityRequests.removeHead();
							if (local2006 == null) {
								while (true) {
									do {
										local2006 = (Linkable_Sub42) Static521.lowPriorityRequests.removeHead();
										if (local2006 == null) {
											if (Static210.aComponent4 == null) {
												Static460.anInt6964 = 0;
											}
											if (Static109.aComponent3 != null) {
												Static603.method7899();
											}
											if (Static608.staffModLevel > 0 && Static334.aKeyboard1.method8479(82) && Static334.aKeyboard1.method8479(81) && Static611.anInt9341 != 0) {
												local541 = Static556.self.plane - Static611.anInt9341;
												if (local541 < 0) {
													local541 = 0;
												} else if (local541 > 3) {
													local541 = 3;
												}
												Static624.method8331(local541, Static556.self.anIntArray878[0] + Static116.originZ, Static691.originX - -Static556.self.anIntArray879[0]);
											}
											Static320.method4598();
											for (local541 = 0; local541 < 5; local541++) {
												@Pc(2246) int local2246 = Static194.anIntArray268[local541]++;
											}
											if (Static624.aBoolean727 && Static98.aLong71 < Static588.currentTimeWithDrift() - 60000L) {
												Static266.method6777();
											}
											for (@Pc(2281) SecondaryParticleNode_Sub1 local2281 = (SecondaryParticleNode_Sub1) Static168.aParticleLinkedList5.method2790(); local2281 != null; local2281 = (SecondaryParticleNode_Sub1) Static168.aParticleLinkedList5.method2785()) {
												if (Static588.currentTimeWithDrift() / 1000L - 5L > (long) local2281.anInt6433) {
													if (local2281.aShort74 > 0) {
														Static44.method1072(local2281.aString72 + LocalizedText.FRIEND_LOGGED_IN.get(Static51.clientLanguageId), "", 0, "", "", 5);
													}
													if (local2281.aShort74 == 0) {
														Static44.method1072(local2281.aString72 + LocalizedText.FRIEND_LOGGED_OUT.get(Static51.clientLanguageId), "", 0, "", "", 5);
													}
													local2281.method9274();
												}
											}
											if (14590 != 14590) {
												anInt10667 = -107;
											}
											Static392.anInt6143++;
											if (Static392.anInt6143 > 500) {
												Static392.anInt6143 = 0;
												local226 = (int) (Math.random() * 8.0D);
												if ((local226 & 0x2) == 2) {
													Static145.anInt2561 += Static374.anInt5906;
												}
												if ((local226 & 0x1) == 1) {
													Static508.anInt7627 += Static555.anInt8305;
												}
												if ((local226 & 0x4) == 4) {
													Static288.anInt4621 += anInt10669;
												}
											}
											if (Static508.anInt7627 < -50) {
												Static555.anInt8305 = 2;
											}
											if (Static508.anInt7627 > 50) {
												Static555.anInt8305 = -2;
											}
											if (Static145.anInt2561 < -55) {
												Static374.anInt5906 = 2;
											}
											if (Static288.anInt4621 < -40) {
												anInt10669 = 1;
											}
											if (Static145.anInt2561 > 55) {
												Static374.anInt5906 = -2;
											}
											Static439.anInt6675++;
											if (Static288.anInt4621 > 40) {
												anInt10669 = -1;
											}
											if (Static439.anInt6675 > 500) {
												Static439.anInt6675 = 0;
												local226 = (int) (Math.random() * 8.0D);
												if ((local226 & 0x1) == 1) {
													Static29.anInt723 += Static653.anInt9718;
												}
												if ((local226 & 0x2) == 2) {
													Static660.anInt9835 += Static171.anInt2887;
												}
											}
											if (Static29.anInt723 < -60) {
												Static653.anInt9718 = 2;
											}
											if (Static29.anInt723 > 60) {
												Static653.anInt9718 = -2;
											}
											if (Static660.anInt9835 < -20) {
												Static171.anInt2887 = 1;
											}
											Connection.gameConnection.anInt3647++;
											if (Static660.anInt9835 > 10) {
												Static171.anInt2887 = -1;
											}
											if (Connection.gameConnection.anInt3647 > 50) {
												@Pc(2571) OutboundPacket local2571 = OutboundPacket.create(Static415.aClientProt75, Connection.gameConnection.random);
												Connection.gameConnection.queue(local2571);
											}
											if (Static252.aBoolean316) {
												Static143.method3571();
												Static252.aBoolean316 = false;
											}
											try {
												Connection.gameConnection.method3273();
												return;
											} catch (@Pc(2588) IOException local2588) {
												Static370.method5279();
												return;
											}
										}
										local2011 = local2006.aComponent14;
										if (local2011.createdComponentId < 0) {
											break;
										}
										local2026 = Static145.getComponent(local2011.overlayer);
									} while (local2026 == null || local2026.createdComponents == null || local2026.createdComponents.length <= local2011.createdComponentId || local2011 != local2026.createdComponents[local2011.createdComponentId]);
									Static472.method6420(local2006);
								}
							}
							local2011 = local2006.aComponent14;
							if (local2011.createdComponentId < 0) {
								break;
							}
							local2026 = Static145.getComponent(local2011.overlayer);
						} while (local2026 == null || local2026.createdComponents == null || local2011.createdComponentId >= local2026.createdComponents.length || local2026.createdComponents[local2011.createdComponentId] != local2011);
						Static472.method6420(local2006);
					}
				}
				local2011 = local2006.aComponent14;
				if (local2011.createdComponentId < 0) {
					break;
				}
				local2026 = Static145.getComponent(local2011.overlayer);
			} while (local2026 == null || local2026.createdComponents == null || local2026.createdComponents.length <= local2011.createdComponentId || local2026.createdComponents[local2011.createdComponentId] != local2011);
			Static472.method6420(local2006);
		}
	}
}
