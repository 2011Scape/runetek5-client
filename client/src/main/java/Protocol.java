import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;

public class Protocol {
    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!gw;I)Z")
    public static boolean method4334(@OriginalArg(0) Connection arg0) throws IOException {
        @Pc(8) Class348 local8 = arg0.aClass348_1;
        @Pc(11) PacketBit local11 = arg0.inboundPacket;
        if (local8 == null) {
            return false;
        }
        @Pc(100) int local100;
        if (arg0.packetType == null) {
            if (arg0.aBoolean279) {
                if (!local8.method7932(1)) {
                    return false;
                }
                local8.method7929(arg0.inboundPacket.data, 1, 0);
                arg0.anInt3646 = 0;
                arg0.anInt3644++;
                arg0.aBoolean279 = false;
            }
            local11.pos = 0;
            if (local11.method7413()) {
                if (!local8.method7932(1)) {
                    return false;
                }
                local8.method7929(arg0.inboundPacket.data, 1, 1);
                arg0.anInt3644++;
                arg0.anInt3646 = 0;
            }
            arg0.aBoolean279 = true;
            @Pc(96) ServerProt[] local96 = ServerProt.method7677();
            local100 = local11.method7421();
            if (local100 < 0 || local96.length <= local100) {
                throw new IOException("invo:" + local100 + " ip:" + local11.pos);
            }
            arg0.packetType = local96[local100];
            arg0.anInt3648 = arg0.packetType.size;
        }
        if (arg0.anInt3648 == -1) {
            if (!local8.method7932(1)) {
                return false;
            }
            local8.method7929(local11.data, 1, 0);
            arg0.anInt3648 = local11.data[0] & 0xFF;
            arg0.anInt3644++;
            arg0.anInt3646 = 0;
        }
        if (arg0.anInt3648 == -2) {
            if (!local8.method7932(2)) {
                return false;
            }
            local8.method7929(local11.data, 2, 0);
            local11.pos = 0;
            arg0.anInt3648 = local11.g2();
            arg0.anInt3644 += 2;
            arg0.anInt3646 = 0;
        }
        if (arg0.anInt3648 > 0) {
            if (!local8.method7932(arg0.anInt3648)) {
                return false;
            }
            local11.pos = 0;
            local8.method7929(local11.data, arg0.anInt3648, 0);
            arg0.anInt3644 += arg0.anInt3648;
            arg0.anInt3646 = 0;
        }
        arg0.lastPacketType2 = arg0.lastPacketType;
        arg0.lastPacketType = arg0.aServerProt_92;
        arg0.aServerProt_92 = arg0.packetType;
        @Pc(277) int local277;
        if (Static586.ServerProt215 == arg0.packetType) {
            local277 = local11.g4_alt1();
            Static574.method7573();
            @Pc(287) SubInterface local287 = (SubInterface) Static548.aHashTable40.get((long) local277);
            if (local287 != null) {
                Static449.method6115(false, true, local287);
            }
            if (Static390.aComponent9 != null) {
                Static178.method2729(Static390.aComponent9);
                Static390.aComponent9 = null;
            }
            arg0.packetType = null;
            return true;
        } else if (Static133.ServerProt55 == arg0.packetType) {
            Static605.method7912(ZoneProt.OPCODE_10);
            arg0.packetType = null;
            return true;
        } else if (Static125.ServerProt52 == arg0.packetType) {
            Static605.method7912(ZoneProt.OPCODE_13);
            arg0.packetType = null;
            return true;
        } else if (arg0.packetType == Static660.ServerProt239) {
            local277 = local11.g4_alt2();
            local100 = local11.g1_alt1();
            Static574.method7573();
            Static450.method6127(local100, local277);
            arg0.packetType = null;
            return true;
        } else if (Static347.ServerProt146 == arg0.packetType) {
            Static605.method7912(ZoneProt.OPCODE_3);
            arg0.packetType = null;
            return true;
        } else if (Static632.ServerProt229 == arg0.packetType) {
            Static331.aString52 = arg0.anInt3648 <= 2 ? LocalizedText.WALK_HERE.get(Static51.anInt1052) : local11.gjstr();
            Static331.anInt5439 = arg0.anInt3648 <= 0 ? -1 : local11.g2();
            if (Static331.anInt5439 == 65535) {
                Static331.anInt5439 = -1;
            }
            arg0.packetType = null;
            return true;
        } else if (arg0.packetType == ServerProt.ServerProt188) {
            Static605.method7912(ZoneProt.OPCODE_5);
            arg0.packetType = null;
            return true;
        } else {
            @Pc(446) boolean local446;
            if (arg0.packetType == Static679.ServerProt247) {
                local446 = local11.g1_alt2() == 1;
                local100 = local11.g4_alt3();
                Static574.method7573();
                Static487.method6516(local100, local446);
                arg0.packetType = null;
                return true;
            } else if (Static489.ServerProt185 == arg0.packetType) {
                local277 = local11.g2_alt2();
                local100 = local11.g4_alt1();
                Static574.method7573();
                Static382.method5370(local277, local100);
                arg0.packetType = null;
                return true;
            } else if (Static201.ServerProt206 == arg0.packetType) {
                local277 = local11.g4_alt1();
                local100 = local11.g2_alt2();
                Static574.method7573();
                Static700.method9153(local100, local277);
                arg0.packetType = null;
                return true;
            } else {
                @Pc(526) int local526;
                if (arg0.packetType == Static542.ServerProt199) {
                    local277 = local11.ig2s();
                    local100 = local11.ig2s();
                    local526 = local11.g4_alt3();
                    Static574.method7573();
                    Static555.method7298(local100, local277, local526);
                    arg0.packetType = null;
                    return true;
                } else if (arg0.packetType == Static331.ServerProt139) {
                    Static400.anInt8102 = Static642.anInt9599;
                    local446 = local11.g1() == 1;
                    if (arg0.anInt3648 != 1) {
                        if (local446) {
                            Static128.aClass164_8 = new Class164(local11);
                        } else {
                            Static91.aClass164_9 = new Class164(local11);
                        }
                        arg0.packetType = null;
                        return true;
                    }
                    arg0.packetType = null;
                    if (local446) {
                        Static128.aClass164_8 = null;
                    } else {
                        Static91.aClass164_9 = null;
                    }
                    return true;
                } else {
                    @Pc(629) String local629;
                    @Pc(639) long local639;
                    @Pc(644) long local644;
                    @Pc(649) long local649;
                    @Pc(653) int local653;
                    @Pc(627) String local627;
                    @Pc(657) int local657;
                    @Pc(665) boolean local665;
                    @Pc(667) int local667;
                    if (arg0.packetType == Static441.ServerProt168) {
                        local446 = local11.g1() == 1;
                        local627 = local11.gjstr();
                        local629 = local627;
                        if (local446) {
                            local629 = local11.gjstr();
                        }
                        local639 = local11.g8();
                        local644 = (long) local11.g2();
                        local649 = (long) local11.g3();
                        local653 = local11.g1();
                        local657 = local11.g2();
                        @Pc(663) long local663 = (local644 << 32) + local649;
                        local665 = false;
                        local667 = 0;
                        while (true) {
                            if (local667 >= 100) {
                                if (local653 <= 1 && Static71.method1524(local629)) {
                                    local665 = true;
                                }
                                break;
                            }
                            if (Static511.aLongArray17[local667] == local663) {
                                local665 = true;
                                break;
                            }
                            local667++;
                        }
                        if (!local665 && Static659.anInt9817 == 0) {
                            Static511.aLongArray17[Static97.anInt2001] = local663;
                            Static97.anInt2001 = (Static97.anInt2001 + 1) % 100;
                            @Pc(737) String local737 = Static288.aQuickChatPhraseTypeList2.method2950(local657).method3903(local11);
                            if (local653 == 2) {
                                Static662.method8625("<img=1>" + local629, "<img=1>" + local627, local657, local737, Static99.method1977(local639), 0, local627, 20);
                            } else if (local653 == 1) {
                                Static662.method8625("<img=0>" + local629, "<img=0>" + local627, local657, local737, Static99.method1977(local639), 0, local627, 20);
                            } else {
                                Static662.method8625(local629, local627, local657, local737, Static99.method1977(local639), 0, local627, 20);
                            }
                        }
                        arg0.packetType = null;
                        return true;
                    } else if (arg0.packetType == Static688.ServerProt250) {
                        local446 = local11.g1() == 1;
                        @Pc(854) byte[] local854 = new byte[arg0.anInt3648 - 1];
                        local11.gdata(local854, 0, arg0.anInt3648 - 1);
                        Static113.method2121(local854, local446);
                        arg0.packetType = null;
                        return true;
                    } else {
                        @Pc(892) boolean local892;
                        if (arg0.packetType == Static214.ServerProt85) {
                            local277 = local11.g4();
                            local892 = local11.g1() == 1;
                            if (Static684.aBoolean775 != local892 || Static134.anInt10326 != local277) {
                                Static134.anInt10326 = local277;
                                Static684.aBoolean775 = local892;
                                Static472.method6429(Static232.aClass242_6, -1, -1);
                            }
                            arg0.packetType = null;
                            return true;
                        }
                        @Pc(931) byte local931;
                        if (Static46.ServerProt27 == arg0.packetType) {
                            local277 = local11.g2();
                            local931 = local11.g1b_alt1();
                            Static34.aClass304_1.method6873(local277, local931);
                            arg0.packetType = null;
                            return true;
                        } else if (arg0.packetType == Static283.ServerProt115) {
                            Static34.aClass304_1.method6867();
                            Static635.anInt9525 += 32;
                            arg0.packetType = null;
                            return true;
                        } else {
                            @Pc(1097) int local1097;
                            @Pc(992) int local992;
                            @Pc(996) int local996;
                            @Pc(1004) boolean local1004;
                            @Pc(1002) long local1002;
                            @Pc(988) long local988;
                            @Pc(1021) int local1021;
                            @Pc(1090) String local1090;
                            @Pc(983) long local983;
                            if (Static224.ServerProt89 == arg0.packetType) {
                                local446 = local11.g1() == 1;
                                local627 = local11.gjstr();
                                local983 = (long) local11.g2();
                                local988 = (long) local11.g3();
                                local992 = local11.g1();
                                local996 = local11.g2();
                                local1002 = (local983 << 32) + local988;
                                local1004 = false;
                                @Pc(1013) ClanChannel local1013 = local446 ? Static45.aClass2_Sub47_1 : Static674.aClass2_Sub47_3;
                                if (local1013 == null) {
                                    local1004 = true;
                                } else {
                                    label2238:
                                    {
                                        for (local1021 = 0; local1021 < 100; local1021++) {
                                            if (Static511.aLongArray17[local1021] == local1002) {
                                                local1004 = true;
                                                break label2238;
                                            }
                                        }
                                        if (local992 <= 1 && Static71.method1524(local627)) {
                                            local1004 = true;
                                        }
                                    }
                                }
                                if (!local1004 && Static659.anInt9817 == 0) {
                                    Static511.aLongArray17[Static97.anInt2001] = local1002;
                                    Static97.anInt2001 = (Static97.anInt2001 + 1) % 100;
                                    local1090 = Static288.aQuickChatPhraseTypeList2.method2950(local996).method3903(local11);
                                    local1097 = local446 ? 42 : 45;
                                    if (local992 == 2 || local992 == 3) {
                                        Static662.method8625("<img=1>" + local627, "<img=1>" + local627, local996, local1090, local1013.aString101, 0, local627, local1097);
                                    } else if (local992 == 1) {
                                        Static662.method8625("<img=0>" + local627, "<img=0>" + local627, local996, local1090, local1013.aString101, 0, local627, local1097);
                                    } else {
                                        Static662.method8625(local627, local627, local996, local1090, local1013.aString101, 0, local627, local1097);
                                    }
                                }
                                arg0.packetType = null;
                                return true;
                            } else if (arg0.packetType == Static314.ServerProt132) {
                                for (local277 = 0; local277 < Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3.length; local277++) {
                                    if (Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local277] != null) {
                                        Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local277].anIntArray869 = null;
                                        Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local277].aClass152_11.method9113(true, -1);
                                    }
                                }
                                for (local100 = 0; local100 < Static416.anInt6378; local100++) {
                                    Static592.aClass2_Sub45Array1[local100].aClass8_Sub2_Sub1_Sub2_Sub2_2.anIntArray869 = null;
                                    Static592.aClass2_Sub45Array1[local100].aClass8_Sub2_Sub1_Sub2_Sub2_2.aClass152_11.method9113(true, -1);
                                }
                                arg0.packetType = null;
                                return true;
                            } else if (Static232.ServerProt103 == arg0.packetType) {
                                Static279.anObjectArray35 = new Object[Static628.aVarClanTypeList5.anInt8769];
                                arg0.packetType = null;
                                return true;
                            } else if (Static346.ServerProt145 == arg0.packetType) {
                                Static324.aBoolean388 = local11.g1_alt3() == 1;
                                arg0.packetType = null;
                                return true;
                            } else if (arg0.packetType == Static619.ServerProt34) {
                                Static578.anInt8595 = local11.g1();
                                arg0.packetType = null;
                                return true;
                            } else if (arg0.packetType == Static416.ServerProt165) {
                                local277 = local11.g4_alt2();
                                local100 = local11.g2_alt2();
                                if (local100 == 65535) {
                                    local100 = -1;
                                }
                                Static574.method7573();
                                Static479.method6462(local100, 1, -1, local277);
                                arg0.packetType = null;
                                return true;
                            } else if (arg0.packetType == Static286.ServerProt117) {
                                Static605.method7912(ZoneProt.OPCODE_9);
                                arg0.packetType = null;
                                return true;
                            } else if (Static432.ServerProt10 == arg0.packetType) {
                                Static233.method3409(Static461.aBoolean529);
                                arg0.packetType = null;
                                return false;
                            } else {
                                @Pc(1449) int local1449;
                                @Pc(1409) int local1409;
                                @Pc(1413) int local1413;
                                @Pc(1425) boolean local1425;
                                @Pc(1427) String local1427;
                                @Pc(1750) String local1750;
                                @Pc(1491) boolean local1491;
                                if (arg0.packetType == Static320.ServerProt135) {
                                    while (local11.pos < arg0.anInt3648) {
                                        local446 = local11.g1() == 1;
                                        local627 = local11.gjstr();
                                        local629 = local11.gjstr();
                                        local1409 = local11.g2();
                                        local1413 = local11.g1();
                                        local1425 = local11.g1() == 1;
                                        local1427 = "";
                                        @Pc(1429) boolean local1429 = false;
                                        if (local1409 > 0) {
                                            local1427 = local11.gjstr();
                                            local1429 = local11.g1() == 1;
                                        }
                                        for (local1449 = 0; local1449 < Static327.anInt5392; local1449++) {
                                            if (local446) {
                                                if (local629.equals(Static330.aStringArray25[local1449])) {
                                                    Static330.aStringArray25[local1449] = local627;
                                                    local627 = null;
                                                    Static572.aStringArray42[local1449] = local629;
                                                    break;
                                                }
                                            } else if (local627.equals(Static330.aStringArray25[local1449])) {
                                                if (Static371.anIntArray455[local1449] != local1409) {
                                                    local1491 = true;
                                                    for (@Pc(1496) SecondaryParticleNode_Sub1 local1496 = (SecondaryParticleNode_Sub1) Static168.aParticleLinkedList5.method2790(); local1496 != null; local1496 = (SecondaryParticleNode_Sub1) Static168.aParticleLinkedList5.method2785()) {
                                                        if (local1496.aString72.equals(local627)) {
                                                            if (local1409 != 0 && local1496.aShort74 == 0) {
                                                                local1491 = false;
                                                                local1496.method9274();
                                                            } else if (local1409 == 0 && local1496.aShort74 != 0) {
                                                                local1491 = false;
                                                                local1496.method9274();
                                                            }
                                                        }
                                                    }
                                                    if (local1491) {
                                                        Static168.aParticleLinkedList5.method2787(new SecondaryParticleNode_Sub1(local627, local1409));
                                                    }
                                                    Static371.anIntArray455[local1449] = local1409;
                                                }
                                                Static572.aStringArray42[local1449] = local629;
                                                Static419.aStringArray33[local1449] = local1427;
                                                Static715.anIntArray881[local1449] = local1413;
                                                Static623.aBooleanArray30[local1449] = local1429;
                                                local627 = null;
                                                Static429.aBooleanArray21[local1449] = local1425;
                                                break;
                                            }
                                        }
                                        if (local627 != null && Static327.anInt5392 < 200) {
                                            Static330.aStringArray25[Static327.anInt5392] = local627;
                                            Static572.aStringArray42[Static327.anInt5392] = local629;
                                            Static371.anIntArray455[Static327.anInt5392] = local1409;
                                            Static419.aStringArray33[Static327.anInt5392] = local1427;
                                            Static715.anIntArray881[Static327.anInt5392] = local1413;
                                            Static623.aBooleanArray30[Static327.anInt5392] = local1429;
                                            Static429.aBooleanArray21[Static327.anInt5392] = local1425;
                                            Static327.anInt5392++;
                                        }
                                    }
                                    Static344.anInt5621 = Static642.anInt9599;
                                    Static251.anInt4036 = 2;
                                    local100 = Static327.anInt5392;
                                    while (local100 > 0) {
                                        local446 = true;
                                        local100--;
                                        for (local526 = 0; local526 < local100; local526++) {
                                            @Pc(1665) boolean local1665 = false;
                                            if (Static344.aClass229_1.worldId != Static371.anIntArray455[local526] && Static344.aClass229_1.worldId == Static371.anIntArray455[local526 + 1]) {
                                                local1665 = true;
                                            }
                                            if (!local1665 && Static371.anIntArray455[local526] == 0 && Static371.anIntArray455[local526 + 1] != 0) {
                                                local1665 = true;
                                            }
                                            if (!local1665 && !Static429.aBooleanArray21[local526] && Static429.aBooleanArray21[local526 + 1]) {
                                                local1665 = true;
                                            }
                                            if (local1665) {
                                                local1413 = Static371.anIntArray455[local526];
                                                Static371.anIntArray455[local526] = Static371.anIntArray455[local526 + 1];
                                                Static371.anIntArray455[local526 + 1] = local1413;
                                                local1750 = Static419.aStringArray33[local526];
                                                Static419.aStringArray33[local526] = Static419.aStringArray33[local526 + 1];
                                                Static419.aStringArray33[local526 + 1] = local1750;
                                                local1427 = Static330.aStringArray25[local526];
                                                Static330.aStringArray25[local526] = Static330.aStringArray25[local526 + 1];
                                                Static330.aStringArray25[local526 + 1] = local1427;
                                                @Pc(1786) String local1786 = Static572.aStringArray42[local526];
                                                Static572.aStringArray42[local526] = Static572.aStringArray42[local526 + 1];
                                                Static572.aStringArray42[local526 + 1] = local1786;
                                                local1449 = Static715.anIntArray881[local526];
                                                Static715.anIntArray881[local526] = Static715.anIntArray881[local526 + 1];
                                                Static715.anIntArray881[local526 + 1] = local1449;
                                                local1491 = Static623.aBooleanArray30[local526];
                                                Static623.aBooleanArray30[local526] = Static623.aBooleanArray30[local526 + 1];
                                                Static623.aBooleanArray30[local526 + 1] = local1491;
                                                local1004 = Static429.aBooleanArray21[local526];
                                                Static429.aBooleanArray21[local526] = Static429.aBooleanArray21[local526 + 1];
                                                local446 = false;
                                                Static429.aBooleanArray21[local526 + 1] = local1004;
                                            }
                                        }
                                        if (local446) {
                                            break;
                                        }
                                    }
                                    arg0.packetType = null;
                                    return true;
                                } else if (Static207.ServerProt128 == arg0.packetType) {
                                    local277 = local11.g1_alt3();
                                    local931 = local11.g1b_alt3();
                                    Static574.method7573();
                                    Static711.method9271(local931, local277);
                                    arg0.packetType = null;
                                    return true;
                                } else if (Static205.ServerProt80 == arg0.packetType) {
                                    local277 = local11.g4();
                                    local100 = local11.g2();
                                    Static34.aClass304_1.method6871(local277, local100);
                                    arg0.packetType = null;
                                    return true;
                                } else {
                                    @Pc(1937) String local1937;
                                    if (arg0.packetType == Static87.ServerProt37) {
                                        local1937 = local11.gjstr();
                                        local100 = local11.g2();
                                        local629 = Static288.aQuickChatPhraseTypeList2.method2950(local100).method3903(local11);
                                        Static662.method8625(local1937, local1937, local100, local629, (String) null, 0, local1937, 19);
                                        arg0.packetType = null;
                                        return true;
                                    } else if (arg0.packetType == Static526.ServerProt194) {
                                        local277 = local11.g2();
                                        if (local277 == 65535) {
                                            local277 = -1;
                                        }
                                        local100 = local11.g1();
                                        local526 = local11.g2();
                                        local1409 = local11.g1();
                                        local1413 = local11.g2();
                                        Static186.method2818(local277, local100, local1413, local526, local1409, false);
                                        arg0.packetType = null;
                                        return true;
                                    } else if (Static618.ServerProt226 == arg0.packetType) {
                                        local277 = local11.ig2();
                                        Static574.method7573();
                                        Static695.method9267(local277);
                                        arg0.packetType = null;
                                        return true;
                                    } else if (arg0.packetType == Static286.ServerProt118) {
                                        local277 = local11.g4_alt2();
                                        local100 = local11.g2_alt3();
                                        if (local100 == 65535) {
                                            local100 = -1;
                                        }
                                        Static574.method7573();
                                        Static681.method8920(local277, local100);
                                        arg0.packetType = null;
                                        return true;
                                    } else {
                                        @Pc(2080) boolean local2080;
                                        @Pc(2098) int local2098;
                                        if (arg0.packetType == Static100.ServerProt43) {
                                            local277 = local11.g2();
                                            local100 = local11.g1();
                                            local2080 = (local100 & 0x1) == 1;
                                            Static205.method3089(local277, local2080);
                                            local1409 = local11.g2();
                                            for (local1413 = 0; local1413 < local1409; local1413++) {
                                                local2098 = local11.g1();
                                                if (local2098 == 255) {
                                                    local2098 = local11.g4();
                                                }
                                                local992 = local11.ig2();
                                                Static341.method5034(local2080, local2098, local1413, local992 - 1, local277);
                                            }
                                            Static322.anIntArray889[Static451.anInt6851++ & 0x1F] = local277;
                                            arg0.packetType = null;
                                            return true;
                                        } else if (Static663.ServerProt240 == arg0.packetType) {
                                            local277 = local11.g4();
                                            Static439.aPrivilegedRequest4 = Static446.aSignlink6.method8982(local277);
                                            arg0.packetType = null;
                                            return true;
                                        } else if (Static312.ServerProt131 == arg0.packetType) {
                                            local277 = local11.ig2();
                                            local100 = local11.g4();
                                            Static574.method7573();
                                            Static540.method6537(local100, local277);
                                            arg0.packetType = null;
                                            return true;
                                        } else if (arg0.packetType == Static452.ServerProt173) {
                                            local277 = local11.g4_alt3();
                                            local100 = local11.g2();
                                            local526 = local11.g2_alt3();
                                            local1409 = local11.g2_alt2();
                                            Static574.method7573();
                                            Static479.method6462(local1409 << 16 | local526, 7, local100, local277);
                                            arg0.packetType = null;
                                            return true;
                                        } else if (arg0.packetType == Static655.ServerProt237) {
                                            local277 = local11.g4();
                                            Static574.method7573();
                                            Static479.method6462(Static312.anInt5000, 5, 0, local277);
                                            arg0.packetType = null;
                                            return true;
                                        } else if (Static12.ServerProt147 == arg0.packetType) {
                                            Static233.method3409(false);
                                            arg0.packetType = null;
                                            return false;
                                        } else if (arg0.packetType == Static291.ServerProt123) {
                                            Static466.method6325();
                                            arg0.packetType = null;
                                            return false;
                                        } else if (arg0.packetType == Static526.ServerProt195) {
                                            local277 = local11.g2();
                                            local100 = local11.g1();
                                            local2080 = (local100 & 0x1) == 1;
                                            while (arg0.anInt3648 > local11.pos) {
                                                local1409 = local11.gSamrt1or2();
                                                local1413 = local11.g2();
                                                local2098 = 0;
                                                if (local1413 != 0) {
                                                    local2098 = local11.g1();
                                                    if (local2098 == 255) {
                                                        local2098 = local11.g4();
                                                    }
                                                }
                                                Static341.method5034(local2080, local2098, local1409, local1413 - 1, local277);
                                            }
                                            Static322.anIntArray889[Static451.anInt6851++ & 0x1F] = local277;
                                            arg0.packetType = null;
                                            return true;
                                        } else if (Static383.ServerProt155 == arg0.packetType) {
                                            local1937 = local11.gjstr();
                                            @Pc(2379) Object[] local2379 = new Object[local1937.length() + 1];
                                            for (local526 = local1937.length() - 1; local526 >= 0; local526--) {
                                                if (local1937.charAt(local526) == 's') {
                                                    local2379[local526 + 1] = local11.gjstr();
                                                } else {
                                                    local2379[local526 + 1] = Integer.valueOf(local11.g4());
                                                }
                                            }
                                            local2379[0] = Integer.valueOf(local11.g4());
                                            Static574.method7573();
                                            @Pc(2442) Linkable_Sub42 local2442 = new Linkable_Sub42();
                                            local2442.anObjectArray36 = local2379;
                                            Static472.method6420(local2442);
                                            arg0.packetType = null;
                                            return true;
                                        } else if (arg0.packetType == ServerProt.ServerProt149) {
                                            local277 = local11.ig2();
                                            local100 = local11.g4();
                                            Static574.method7573();
                                            Static647.method8467(local100, local277);
                                            arg0.packetType = null;
                                            return true;
                                        } else if (arg0.packetType == Static491.ServerProt254) {
                                            Static494.anInt7404 = local11.g2s();
                                            arg0.packetType = null;
                                            Static321.anInt5111 = Static642.anInt9599;
                                            return true;
                                        } else if (Static608.ServerProt222 == arg0.packetType) {
                                            local277 = local11.g2_alt3();
                                            local100 = local11.g1_alt3();
                                            Static574.method7573();
                                            if (local100 == 2) {
                                                Static322.method9441();
                                            }
                                            Static377.anInt5930 = local277;
                                            Static122.method2208(local277);
                                            Static640.method8435(false);
                                            Static472.method6414(Static377.anInt5930);
                                            for (local526 = 0; local526 < 100; local526++) {
                                                Static364.aBooleanArray18[local526] = true;
                                            }
                                            arg0.packetType = null;
                                            return true;
                                        } else if (Static641.ServerProt234 == arg0.packetType) {
                                            Static708.method9230(local11.gjstr());
                                            arg0.packetType = null;
                                            return true;
                                        } else if (arg0.packetType == Static40.ServerProt16) {
                                            local277 = local11.g1_alt2();
                                            @Pc(2579) int[] local2579 = new int[4];
                                            for (local526 = 0; local526 < 4; local526++) {
                                                local2579[local526] = local11.g2_alt3();
                                            }
                                            local1409 = local11.g2_alt2();
                                            @Pc(2608) Linkable_Sub45 local2608 = (Linkable_Sub45) Static18.aHashTable2.get((long) local1409);
                                            if (local2608 != null) {
                                                Static651.method8515(local2579, local277, true, local2608.aClass8_Sub2_Sub1_Sub2_Sub2_2);
                                            }
                                            arg0.packetType = null;
                                            return true;
                                        } else if (arg0.packetType == Static72.ServerProt35) {
                                            if (Static620.isInLobby(Static283.gameState)) {
                                                Static249.anInt4008 = (int) ((float) local11.g2() * 2.5F);
                                            } else {
                                                Static249.anInt4008 = local11.g2() * 30;
                                            }
                                            arg0.packetType = null;
                                            Static321.anInt5111 = Static642.anInt9599;
                                            return true;
                                        } else if (ServerProt.ServerProt76 == arg0.packetType) {
                                            Static486.aByte115 = local11.g1b();
                                            arg0.packetType = null;
                                            if (Static486.aByte115 == 0 || Static486.aByte115 == 1) {
                                                Static587.aBoolean663 = true;
                                            }
                                            return true;
                                        } else if (Static40.ServerProt17 == arg0.packetType) {
                                            local277 = local11.g4_alt3();
                                            local100 = local11.g2_alt2();
                                            Static34.aClass304_1.method6873(local100, local277);
                                            arg0.packetType = null;
                                            return true;
                                        } else if (arg0.packetType == Static229.ServerProt101) {
                                            Static39.anInt949 = Static642.anInt9599;
                                            local446 = local11.g1() == 1;
                                            @Pc(2736) ClanChannelDelta local2736 = new ClanChannelDelta(local11);
                                            @Pc(2740) ClanChannel local2740;
                                            if (local446) {
                                                local2740 = Static45.aClass2_Sub47_1;
                                            } else {
                                                local2740 = Static674.aClass2_Sub47_3;
                                            }
                                            local2736.method1581(local2740);
                                            arg0.packetType = null;
                                            return true;
                                        } else if (Static587.ServerProt216 == arg0.packetType) {
                                            local277 = local11.g4_alt2();
                                            local100 = local11.g2();
                                            Static574.method7573();
                                            Static2.method62(local100, local277);
                                            arg0.packetType = null;
                                            return true;
                                        } else if (ServerProt.ServerProt144 == arg0.packetType) {
                                            local277 = local11.g4_alt1();
                                            Static574.method7573();
                                            if (local277 == -1) {
                                                Static693.anInt10383 = -1;
                                                Static692.anInt10376 = -1;
                                            } else {
                                                local100 = local277 >> 14 & 0x3FFF;
                                                local526 = local277 & 0x3FFF;
                                                local100 -= Static691.anInt10367;
                                                if (local100 < 0) {
                                                    local100 = 0;
                                                } else if (Static720.anInt10859 <= local100) {
                                                    local100 = Static720.anInt10859;
                                                }
                                                local526 -= Static116.anInt2270;
                                                Static692.anInt10376 = (local100 << 9) + 256;
                                                if (local526 < 0) {
                                                    local526 = 0;
                                                } else if (local526 >= Static501.anInt7568) {
                                                    local526 = Static501.anInt7568;
                                                }
                                                Static693.anInt10383 = (local526 << 9) + 256;
                                            }
                                            arg0.packetType = null;
                                            return true;
                                        } else if (arg0.packetType == Static491.ServerProt253) {
                                            Static696.method9035();
                                            arg0.packetType = null;
                                            return true;
                                        } else if (Static14.ServerProt5 == arg0.packetType) {
                                            local277 = local11.g2();
                                            local931 = local11.g1b();
                                            if (Static279.anObjectArray35 == null) {
                                                Static279.anObjectArray35 = new Object[Static628.aVarClanTypeList5.anInt8769];
                                            }
                                            Static279.anObjectArray35[local277] = Integer.valueOf(local931);
                                            Static265.anIntArray328[Static710.anInt7554++ & 0x1F] = local277;
                                            arg0.packetType = null;
                                            return true;
                                        } else if (Static40.ServerProt18 == arg0.packetType) {
                                            local277 = local11.g2();
                                            Static607.anInt9251 = -1;
                                            Static717.anInt10817 = local277;
                                            Static1.anInt10798 = 1;
                                            client.cutscenes.isFileReady(Static717.anInt10817);
                                            local100 = local11.g2();
                                            Static322.anIntArrayArray265 = new int[local100][4];
                                            for (local526 = 0; local526 < local100; local526++) {
                                                for (local1409 = 0; local1409 < 4; local1409++) {
                                                    Static322.anIntArrayArray265[local526][local1409] = local11.g4();
                                                }
                                            }
                                            local1409 = local11.g1();
                                            Static518.aPacket_18 = new Packet(local1409);
                                            Static518.aPacket_18.pdata(local11.data, local11.pos, local1409);
                                            local11.pos += local1409;
                                            arg0.packetType = null;
                                            return false;
                                        } else {
                                            @Pc(3044) byte[] local3044;
                                            if (Static692.ServerProt251 == arg0.packetType) {
                                                if (Static316.aFrame8 != null) {
                                                    Static409.method5657(Static400.aClass2_Sub34_28.aPreference_Sub1_1.method1485(), -1, false, -1);
                                                }
                                                local3044 = new byte[arg0.anInt3648];
                                                local11.pdataisaac(local3044, arg0.anInt3648);
                                                local627 = Static350.method5126(0, local3044, arg0.anInt3648);
                                                Static664.method8655(Static400.aClass2_Sub34_28.aPreference_Sub29_1.method7915() == 1, local627, true, Static446.aSignlink6);
                                                arg0.packetType = null;
                                                return true;
                                            } else if (arg0.packetType == Static444.ServerProt169) {
                                                local446 = local11.g1() == 1;
                                                local627 = local11.gjstr();
                                                local629 = local627;
                                                if (local446) {
                                                    local629 = local11.gjstr();
                                                }
                                                local639 = (long) local11.g2();
                                                local644 = (long) local11.g3();
                                                local996 = local11.g1();
                                                local1449 = local11.g2();
                                                @Pc(3134) long local3134 = local644 + (local639 << 32);
                                                @Pc(3136) boolean local3136 = false;
                                                local1021 = 0;
                                                while (true) {
                                                    if (local1021 >= 100) {
                                                        if (local996 <= 1 && Static71.method1524(local629)) {
                                                            local3136 = true;
                                                        }
                                                        break;
                                                    }
                                                    if (local3134 == Static511.aLongArray17[local1021]) {
                                                        local3136 = true;
                                                        break;
                                                    }
                                                    local1021++;
                                                }
                                                if (!local3136 && Static659.anInt9817 == 0) {
                                                    Static511.aLongArray17[Static97.anInt2001] = local3134;
                                                    Static97.anInt2001 = (Static97.anInt2001 + 1) % 100;
                                                    local1090 = Static288.aQuickChatPhraseTypeList2.method2950(local1449).method3903(local11);
                                                    if (local996 == 2) {
                                                        Static662.method8625("<img=1>" + local629, "<img=1>" + local627, local1449, local1090, (String) null, 0, local627, 18);
                                                    } else if (local996 == 1) {
                                                        Static662.method8625("<img=0>" + local629, "<img=0>" + local627, local1449, local1090, (String) null, 0, local627, 18);
                                                    } else {
                                                        Static662.method8625(local629, local627, local1449, local1090, (String) null, 0, local627, 18);
                                                    }
                                                }
                                                arg0.packetType = null;
                                                return true;
                                            } else if (Static176.ServerProt187 == arg0.packetType) {
                                                local277 = local11.g1_alt3();
                                                local100 = local11.g2_alt2();
                                                Static34.aClass304_1.method6871(local277, local100);
                                                arg0.packetType = null;
                                                return true;
                                            } else if (Static636.ServerProt230 == arg0.packetType) {
                                                local277 = local11.g1_alt3();
                                                local100 = local11.g1_alt1();
                                                local526 = local11.g4_alt1();
                                                Static237.anIntArray518[local100] = local526;
                                                Static581.anIntArray688[local100] = local277;
                                                Static498.anIntArray604[local100] = 1;
                                                local1409 = Static245.anIntArray773[local100] - 1;
                                                for (local1413 = 0; local1413 < local1409; local1413++) {
                                                    if (Static293.anIntArray34[local1413] <= local526) {
                                                        Static498.anIntArray604[local100] = local1413 + 2;
                                                    }
                                                }
                                                Static395.anIntArray833[Static366.anInt5858++ & 0x1F] = local100;
                                                arg0.packetType = null;
                                                return true;
                                            } else if (arg0.packetType == Static305.ServerProt129) {
                                                Static726.aClass280_7 = Static189.method2864(local11.g1());
                                                arg0.packetType = null;
                                                return true;
                                            } else if (Static410.ServerProt163 == arg0.packetType) {
                                                local277 = local11.g1_alt3();
                                                local100 = local11.g4();
                                                local526 = local11.ig2();
                                                local1409 = local11.ig2();
                                                Static574.method7573();
                                                Static223.method9094(local277, local1409, local100, local526);
                                                arg0.packetType = null;
                                                return true;
                                            } else {
                                                @Pc(3502) int local3502;
                                                @Pc(3582) String local3582;
                                                if (arg0.packetType == Static266.ServerProt191) {
                                                    local446 = local11.g1() == 1;
                                                    local627 = local11.gjstr();
                                                    local983 = (long) local11.g2();
                                                    local988 = (long) local11.g3();
                                                    local992 = local11.g1();
                                                    local649 = (local983 << 32) + local988;
                                                    local1491 = false;
                                                    @Pc(3494) ClanChannel local3494 = local446 ? Static45.aClass2_Sub47_1 : Static674.aClass2_Sub47_3;
                                                    if (local3494 == null) {
                                                        local1491 = true;
                                                    } else {
                                                        label2266:
                                                        {
                                                            for (local3502 = 0; local3502 < 100; local3502++) {
                                                                if (local649 == Static511.aLongArray17[local3502]) {
                                                                    local1491 = true;
                                                                    break label2266;
                                                                }
                                                            }
                                                            if (local992 <= 1) {
                                                                if (Static389.aBoolean459 && !Static34.aBoolean62 || Static617.aBoolean724) {
                                                                    local1491 = true;
                                                                } else if (Static71.method1524(local627)) {
                                                                    local1491 = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (!local1491 && Static659.anInt9817 == 0) {
                                                        Static511.aLongArray17[Static97.anInt2001] = local649;
                                                        Static97.anInt2001 = (Static97.anInt2001 + 1) % 100;
                                                        local3582 = Static130.method2280(Static15.method189(local11));
                                                        local1021 = local446 ? 41 : 44;
                                                        if (local992 == 2 || local992 == 3) {
                                                            Static662.method8625("<img=1>" + local627, "<img=1>" + local627, -1, local3582, local3494.aString101, 0, local627, local1021);
                                                        } else if (local992 == 1) {
                                                            Static662.method8625("<img=0>" + local627, "<img=0>" + local627, -1, local3582, local3494.aString101, 0, local627, local1021);
                                                        } else {
                                                            Static662.method8625(local627, local627, -1, local3582, local3494.aString101, 0, local627, local1021);
                                                        }
                                                    }
                                                    arg0.packetType = null;
                                                    return true;
                                                } else if (arg0.packetType == Static618.ServerProt227) {
                                                    local277 = local11.g1();
                                                    local100 = local277 >> 5;
                                                    local526 = local277 & 0x1F;
                                                    if (local526 == 0) {
                                                        Static527.aClass254Array1[local100] = null;
                                                        arg0.packetType = null;
                                                        return true;
                                                    }
                                                    @Pc(3721) Class254 local3721 = new Class254();
                                                    local3721.anInt6363 = local526;
                                                    local3721.anInt6367 = local11.g1();
                                                    if (local3721.anInt6367 >= 0 && local3721.anInt6367 < Static28.aSoftwareIndexedSpriteArray1.length) {
                                                        if (local3721.anInt6363 == 1 || local3721.anInt6363 == 10) {
                                                            local3721.anInt6366 = local11.g2();
                                                            local3721.anInt6360 = local11.g2();
                                                            local11.pos += 4;
                                                        } else if (local3721.anInt6363 >= 2 && local3721.anInt6363 <= 6) {
                                                            if (local3721.anInt6363 == 2) {
                                                                local3721.anInt6362 = 256;
                                                                local3721.anInt6369 = 256;
                                                            }
                                                            if (local3721.anInt6363 == 3) {
                                                                local3721.anInt6369 = 0;
                                                                local3721.anInt6362 = 256;
                                                            }
                                                            if (local3721.anInt6363 == 4) {
                                                                local3721.anInt6369 = 512;
                                                                local3721.anInt6362 = 256;
                                                            }
                                                            if (local3721.anInt6363 == 5) {
                                                                local3721.anInt6362 = 0;
                                                                local3721.anInt6369 = 256;
                                                            }
                                                            if (local3721.anInt6363 == 6) {
                                                                local3721.anInt6362 = 512;
                                                                local3721.anInt6369 = 256;
                                                            }
                                                            local3721.anInt6363 = 2;
                                                            local3721.anInt6368 = local11.g1();
                                                            local3721.anInt6369 += local11.g2() - Static691.anInt10367 << 9;
                                                            local3721.anInt6362 += local11.g2() - Static116.anInt2270 << 9;
                                                            local3721.anInt6365 = local11.g1() << 2;
                                                            local3721.anInt6364 = local11.g2();
                                                        }
                                                        local3721.anInt6371 = local11.g2();
                                                        if (local3721.anInt6371 == 65535) {
                                                            local3721.anInt6371 = -1;
                                                        }
                                                        Static527.aClass254Array1[local100] = local3721;
                                                    }
                                                    arg0.packetType = null;
                                                    return true;
                                                } else if (arg0.packetType == Static428.ServerProt167) {
                                                    local277 = local11.g1_alt3();
                                                    Static574.method7573();
                                                    arg0.packetType = null;
                                                    Static150.anInt2632 = local277;
                                                    return true;
                                                } else if (arg0.packetType == Static309.ServerProt130) {
                                                    local11.pos += 28;
                                                    if (local11.checkcrc()) {
                                                        Static83.method1608(local11.pos - 28, local11);
                                                    }
                                                    arg0.packetType = null;
                                                    return true;
                                                } else if (arg0.packetType == Static303.ServerProt126) {
                                                    local277 = local11.ig2();
                                                    if (local277 == 65535) {
                                                        local277 = -1;
                                                    }
                                                    local100 = local11.g4();
                                                    local526 = local11.g4_alt3();
                                                    Static574.method7573();
                                                    Static301.method4394(local526, local100, local277);
                                                    @Pc(4005) ObjType local4005 = ObjTypeList.objTypes.method2486(local277);
                                                    Static231.method3378(local4005.anInt10107, local4005.anInt10098, local526, local4005.anInt10096);
                                                    Static528.method7087(local4005.anInt10094, local526, local4005.anInt10099, local4005.anInt10126);
                                                    arg0.packetType = null;
                                                    return true;
                                                } else if (arg0.packetType == ServerProt.ServerProt83) {
                                                    local277 = local11.g1_alt3();
                                                    local100 = local11.g2();
                                                    Static574.method7573();
                                                    Static515.method6802(true, local100, local277);
                                                    arg0.packetType = null;
                                                    return true;
                                                } else if (arg0.packetType == Static479.ServerProt177) {
                                                    local446 = local11.g1_alt2() == 1;
                                                    Static574.method7573();
                                                    Static501.aBoolean576 = local446;
                                                    arg0.packetType = null;
                                                    return true;
                                                } else if (arg0.packetType == Static557.ServerProt205) {
                                                    local277 = local11.g1();
                                                    if (local11.g1() == 0) {
                                                        Static105.aClass171Array1[local277] = new Class171();
                                                    } else {
                                                        local11.pos--;
                                                        Static105.aClass171Array1[local277] = new Class171(local11);
                                                    }
                                                    Static526.anInt8067 = Static642.anInt9599;
                                                    arg0.packetType = null;
                                                    return true;
                                                } else if (Static334.ServerProt140 == arg0.packetType) {
                                                    local277 = local11.g2_alt3();
                                                    Static574.method7573();
                                                    Static121.method2199(local277);
                                                    arg0.packetType = null;
                                                    return true;
                                                } else if (Static166.ServerProt63 == arg0.packetType) {
                                                    Static605.method7912(ZoneProt.OPCODE_12);
                                                    arg0.packetType = null;
                                                    return true;
                                                } else {
                                                    @Pc(4175) String local4175;
                                                    @Pc(4177) String local4177;
                                                    if (arg0.packetType == ServerProt.MESSAGE_GAME) {
                                                        local277 = local11.gSamrt1or2();
                                                        local100 = local11.g4();
                                                        local526 = local11.g1();
                                                        local4175 = "";
                                                        local4177 = local4175;
                                                        if ((local526 & 0x1) != 0) {
                                                            local4175 = local11.gjstr();
                                                            if ((local526 & 0x2) == 0) {
                                                                local4177 = local4175;
                                                            } else {
                                                                local4177 = local11.gjstr();
                                                            }
                                                        }
                                                        local1750 = local11.gjstr();
                                                        if (local277 == 99) {
                                                            Static79.method1579(local1750);
                                                        } else if (local277 == 98) {
                                                            Static87.method1694(local1750);
                                                        } else if (local4177.equals("") || !Static71.method1524(local4177)) {
                                                            Static44.method1072(local1750, local4175, local100, local4175, local4177, local277);
                                                        } else {
                                                            arg0.packetType = null;
                                                            return true;
                                                        }
                                                        arg0.packetType = null;
                                                        return true;
                                                    } else if (arg0.packetType == ServerProt.ServerProt178) {
                                                        arg0.packetType = null;
                                                        Static279.anObjectArray35 = null;
                                                        return true;
                                                    } else if (Static51.ServerProt30 == arg0.packetType) {
                                                        local277 = local11.g2_alt3();
                                                        local627 = local11.gjstr();
                                                        Static574.method7573();
                                                        Static394.method5544(local277, local627);
                                                        arg0.packetType = null;
                                                        return true;
                                                    } else if (arg0.packetType == Static231.ServerProt102) {
                                                        local277 = local11.g1_alt3();
                                                        local100 = local11.g1_alt1();
                                                        local526 = local11.g2_alt3();
                                                        local1409 = local11.g1_alt3();
                                                        local1413 = local11.g1_alt3();
                                                        Static574.method7573();
                                                        Static572.aBooleanArray29[local100] = true;
                                                        Static331.anIntArray403[local100] = local1409;
                                                        Static140.anIntArray222[local100] = local1413;
                                                        Static362.anIntArray450[local100] = local277;
                                                        Static194.anIntArray268[local100] = local526;
                                                        arg0.packetType = null;
                                                        return true;
                                                    } else if (Static284.ServerProt116 == arg0.packetType) {
                                                        Static605.method7912(ZoneProt.OPCODE_1);
                                                        arg0.packetType = null;
                                                        return true;
                                                    } else if (Static225.ServerProt90 == arg0.packetType) {
                                                        Static436.anInt3849 = local11.g1();
                                                        for (local277 = 0; local277 < Static436.anInt3849; local277++) {
                                                            Static632.aStringArray44[local277] = local11.gjstr();
                                                            Static446.aStringArray35[local277] = local11.gjstr();
                                                            if (Static446.aStringArray35[local277].equals("")) {
                                                                Static446.aStringArray35[local277] = Static632.aStringArray44[local277];
                                                            }
                                                            Static10.aStringArray1[local277] = local11.gjstr();
                                                            Static316.aStringArray41[local277] = local11.gjstr();
                                                            if (Static316.aStringArray41[local277].equals("")) {
                                                                Static316.aStringArray41[local277] = Static10.aStringArray1[local277];
                                                            }
                                                            Static65.aBooleanArray2[local277] = false;
                                                        }
                                                        Static344.anInt5621 = Static642.anInt9599;
                                                        arg0.packetType = null;
                                                        return true;
                                                    } else if (Static570.ServerProt208 == arg0.packetType) {
                                                        Static605.method7912(ZoneProt.OPCODE_2);
                                                        arg0.packetType = null;
                                                        return true;
                                                    } else if (ServerProt.ServerProt113 == arg0.packetType) {
                                                        local277 = local11.g1_alt1();
                                                        local100 = local11.ig2();
                                                        if (local100 == 65535) {
                                                            local100 = -1;
                                                        }
                                                        local629 = local11.gjstr();
                                                        local1409 = local11.g1_alt2();
                                                        if (local1409 >= 1 && local1409 <= 8) {
                                                            if (local629.equalsIgnoreCase("null")) {
                                                                local629 = null;
                                                            }
                                                            Static297.aStringArray24[local1409 - 1] = local629;
                                                            Static147.anIntArray227[local1409 - 1] = local100;
                                                            Static601.aBooleanArray28[local1409 - 1] = local277 == 0;
                                                        }
                                                        arg0.packetType = null;
                                                        return true;
                                                    } else {
                                                        @Pc(4611) ServerActiveProperties local4611;
                                                        @Pc(4597) ServerActiveProperties local4597;
                                                        if (arg0.packetType == Static161.ServerProt62) {
                                                            local277 = local11.g2_alt2();
                                                            if (local277 == 65535) {
                                                                local277 = -1;
                                                            }
                                                            local100 = local11.g4_alt3();
                                                            local526 = local11.g2();
                                                            if (local526 == 65535) {
                                                                local526 = -1;
                                                            }
                                                            local1409 = local11.ig2();
                                                            Static574.method7573();
                                                            for (local1413 = local277; local1413 <= local526; local1413++) {
                                                                local644 = (long) local1413 + ((long) local100 << 32);
                                                                local4597 = (ServerActiveProperties) Static291.aHashTable24.get(local644);
                                                                if (local4597 != null) {
                                                                    local4611 = new ServerActiveProperties(local4597.anInt6909, local1409);
                                                                    local4597.unlink();
                                                                } else if (local1413 == -1) {
                                                                    local4611 = new ServerActiveProperties(Static145.method2412(local100).aClass2_Sub41_2.anInt6909, local1409);
                                                                } else {
                                                                    local4611 = new ServerActiveProperties(0, local1409);
                                                                }
                                                                Static291.aHashTable24.put(local644, local4611);
                                                            }
                                                            arg0.packetType = null;
                                                            return true;
                                                        }
                                                        @Pc(4669) long local4669;
                                                        if (arg0.packetType == Static297.ServerProt125) {
                                                            local277 = local11.g2();
                                                            local4669 = local11.g8();
                                                            if (Static279.anObjectArray35 == null) {
                                                                Static279.anObjectArray35 = new Object[Static628.aVarClanTypeList5.anInt8769];
                                                            }
                                                            Static279.anObjectArray35[local277] = Long.valueOf(local4669);
                                                            Static265.anIntArray328[Static710.anInt7554++ & 0x1F] = local277;
                                                            arg0.packetType = null;
                                                            return true;
                                                        } else if (ServerProt.ServerProt104 == arg0.packetType) {
                                                            local277 = local11.ig2();
                                                            local100 = local11.g2_alt3();
                                                            local526 = local11.g4();
                                                            Static574.method7573();
                                                            Static295.method4347(local526, local277 + (local100 << 16));
                                                            arg0.packetType = null;
                                                            return true;
                                                        } else if (arg0.packetType == Static137.ServerProt56) {
                                                            Static605.method7912(ZoneProt.OPCODE_4);
                                                            arg0.packetType = null;
                                                            return true;
                                                        } else {
                                                            @Pc(4857) boolean local4857;
                                                            if (arg0.packetType == Static605.ServerProt220) {
                                                                local277 = local11.g2_alt2();
                                                                local100 = local11.g4_alt3();
                                                                local526 = local11.g1_alt1();
                                                                local1409 = local11.g1_alt1();
                                                                local1413 = local11.g2();
                                                                local2098 = local11.ig2();
                                                                if (local2098 == 65535) {
                                                                    local2098 = -1;
                                                                }
                                                                local992 = local1409 & 0x7;
                                                                local996 = local1409 >> 3 & 0xF;
                                                                if (local996 == 15) {
                                                                    local996 = -1;
                                                                }
                                                                @Pc(4806) boolean local4806 = (local1409 >> 7 & 0x1) == 1;
                                                                if (local100 >> 30 == 0) {
                                                                    @Pc(4943) int local4943;
                                                                    @Pc(4911) SeqType local4911;
                                                                    @Pc(4888) SpotAnimType local4888;
                                                                    @Pc(4905) SeqType local4905;
                                                                    if (local100 >> 29 != 0) {
                                                                        local653 = local100 & 0xFFFF;
                                                                        @Pc(5032) Linkable_Sub45 local5032 = (Linkable_Sub45) Static18.aHashTable2.get((long) local653);
                                                                        if (local5032 != null) {
                                                                            @Pc(5037) Npc local5037 = local5032.aClass8_Sub2_Sub1_Sub2_Sub2_2;
                                                                            @Pc(5042) Class199 local5042 = local5037.aClass199Array3[local526];
                                                                            if (local2098 == 65535) {
                                                                                local2098 = -1;
                                                                            }
                                                                            local665 = true;
                                                                            local667 = local5042.anInt4930;
                                                                            if (local2098 != -1 && local667 != -1) {
                                                                                if (local667 == local2098) {
                                                                                    local4888 = Static23.aSpotAnimTypeList1.method2694(local2098);
                                                                                    if (local4888.aBoolean448 && local4888.anInt5842 != -1) {
                                                                                        local4905 = Static25.aSeqTypeList1.method1162(local4888.anInt5842);
                                                                                        @Pc(5134) int local5134 = local4905.anInt1646;
                                                                                        if (local5134 == 0 || local5134 == 2) {
                                                                                            local665 = false;
                                                                                        } else if (local5134 == 1) {
                                                                                            local665 = true;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    local4888 = Static23.aSpotAnimTypeList1.method2694(local2098);
                                                                                    @Pc(5078) SpotAnimType local5078 = Static23.aSpotAnimTypeList1.method2694(local667);
                                                                                    if (local4888.anInt5842 != -1 && local5078.anInt5842 != -1) {
                                                                                        local4911 = Static25.aSeqTypeList1.method1162(local4888.anInt5842);
                                                                                        @Pc(5102) SeqType local5102 = Static25.aSeqTypeList1.method1162(local5078.anInt5842);
                                                                                        if (local4911.anInt1649 < local5102.anInt1649) {
                                                                                            local665 = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (local665) {
                                                                                local5042.anInt4928 = local996;
                                                                                local5042.anInt4931 = local1413;
                                                                                local5042.anInt4930 = local2098;
                                                                                if (local2098 == -1) {
                                                                                    local5042.aClass152_7.method9113(true, -1);
                                                                                } else {
                                                                                    local4888 = Static23.aSpotAnimTypeList1.method2694(local2098);
                                                                                    local4943 = local4888.aBoolean448 ? 0 : 2;
                                                                                    if (local4806) {
                                                                                        local4943 = 1;
                                                                                    }
                                                                                    local5042.aClass152_7.method9092(local4888.anInt5842, local277, local4943, false);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (local100 >> 28 != 0) {
                                                                        local653 = local100 & 0xFFFF;
                                                                        @Pc(4839) Player local4839;
                                                                        if (local653 == Static312.anInt5000) {
                                                                            local4839 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2;
                                                                        } else {
                                                                            local4839 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local653];
                                                                        }
                                                                        if (local4839 != null) {
                                                                            @Pc(4850) Class199 local4850 = local4839.aClass199Array3[local526];
                                                                            if (local2098 == 65535) {
                                                                                local2098 = -1;
                                                                            }
                                                                            local4857 = true;
                                                                            local1097 = local4850.anInt4930;
                                                                            @Pc(4883) SpotAnimType local4883;
                                                                            if (local2098 != -1 && local1097 != -1) {
                                                                                if (local2098 == local1097) {
                                                                                    local4883 = Static23.aSpotAnimTypeList1.method2694(local2098);
                                                                                    if (local4883.aBoolean448 && local4883.anInt5842 != -1) {
                                                                                        @Pc(4940) SeqType local4940 = Static25.aSeqTypeList1.method1162(local4883.anInt5842);
                                                                                        local4943 = local4940.anInt1646;
                                                                                        if (local4943 == 0 || local4943 == 2) {
                                                                                            local4857 = false;
                                                                                        } else if (local4943 == 1) {
                                                                                            local4857 = true;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    local4883 = Static23.aSpotAnimTypeList1.method2694(local2098);
                                                                                    local4888 = Static23.aSpotAnimTypeList1.method2694(local1097);
                                                                                    if (local4883.anInt5842 != -1 && local4888.anInt5842 != -1) {
                                                                                        local4905 = Static25.aSeqTypeList1.method1162(local4883.anInt5842);
                                                                                        local4911 = Static25.aSeqTypeList1.method1162(local4888.anInt5842);
                                                                                        if (local4911.anInt1649 > local4905.anInt1649) {
                                                                                            local4857 = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (local4857) {
                                                                                local4850.anInt4928 = local996;
                                                                                local4850.anInt4931 = local1413;
                                                                                local4850.anInt4929 = local992;
                                                                                local4850.anInt4930 = local2098;
                                                                                if (local2098 == -1) {
                                                                                    local4850.aClass152_7.method9113(true, -1);
                                                                                } else {
                                                                                    local4883 = Static23.aSpotAnimTypeList1.method2694(local2098);
                                                                                    @Pc(5006) int local5006 = local4883.aBoolean448 ? 0 : 2;
                                                                                    if (local4806) {
                                                                                        local5006 = 1;
                                                                                    }
                                                                                    local4850.aClass152_7.method9092(local4883.anInt5842, local277, local5006, false);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    local653 = local100 >> 28 & 0x3;
                                                                    local657 = (local100 >> 14 & 0x3FFF) - Static691.anInt10367;
                                                                    local3502 = (local100 & 0x3FFF) - Static116.anInt2270;
                                                                    if (local657 >= 0 && local3502 >= 0 && local657 < Static720.anInt10859 && local3502 < Static501.anInt7568) {
                                                                        if (local2098 == -1) {
                                                                            @Pc(5270) SecondaryLinkable_Sub20 local5270 = (SecondaryLinkable_Sub20) Static346.aHashTable29.get((long) (local657 << 16 | local3502));
                                                                            if (local5270 != null) {
                                                                                local5270.aClass8_Sub2_Sub1_Sub5_1.method6600();
                                                                                local5270.unlink();
                                                                            }
                                                                        } else {
                                                                            local1021 = local657 * 512 + 256;
                                                                            local1097 = local3502 * 512 + 256;
                                                                            local667 = local653;
                                                                            if (local653 < 3 && Static441.method5968(local3502, local657)) {
                                                                                local667 = local653 + 1;
                                                                            }
                                                                            @Pc(5334) Entity_Sub3 local5334 = new Entity_Sub3(local2098, local277, local653, local667, local1021, Static102.method2025(local653, -29754, local1097, local1021) - local1413, local1097, local657, local657, local3502, local3502, local992, local4806);
                                                                            Static346.aHashTable29.put((long) (local3502 | local657 << 16), new SecondaryLinkable_Sub20(local5334));
                                                                        }
                                                                    }
                                                                }
                                                                arg0.packetType = null;
                                                                return true;
                                                            } else if (Static9.ServerProt3 == arg0.packetType) {
                                                                local277 = local11.g4();
                                                                local100 = local11.ig2();
                                                                if (local100 == 65535) {
                                                                    local100 = -1;
                                                                }
                                                                Static574.method7573();
                                                                Static479.method6462(local100, 2, -1, local277);
                                                                arg0.packetType = null;
                                                                return true;
                                                            } else if (Static36.ServerProt15 == arg0.packetType) {
                                                                Static480.method6468(local11, Static446.aSignlink6, arg0.anInt3648);
                                                                arg0.packetType = null;
                                                                return true;
                                                            } else if (Static193.ServerProt74 == arg0.packetType) {
                                                                Static574.method7573();
                                                                Static693.method9012();
                                                                arg0.packetType = null;
                                                                return true;
                                                            } else {
                                                                @Pc(5445) SubInterface local5445;
                                                                if (Static119.ServerProt47 == arg0.packetType) {
                                                                    local277 = local11.g4_alt2();
                                                                    local100 = local11.g4_alt3();
                                                                    Static574.method7573();
                                                                    @Pc(5438) SubInterface local5438 = (SubInterface) Static548.aHashTable40.get((long) local100);
                                                                    local5445 = (SubInterface) Static548.aHashTable40.get((long) local277);
                                                                    if (local5445 != null) {
                                                                        Static449.method6115(false, local5438 == null || local5438.anInt147 != local5445.anInt147, local5445);
                                                                    }
                                                                    if (local5438 != null) {
                                                                        local5438.unlink();
                                                                        Static548.aHashTable40.put((long) local277, local5438);
                                                                    }
                                                                    @Pc(5487) Component local5487 = Static145.method2412(local100);
                                                                    if (local5487 != null) {
                                                                        Static178.method2729(local5487);
                                                                    }
                                                                    local5487 = Static145.method2412(local277);
                                                                    if (local5487 != null) {
                                                                        Static178.method2729(local5487);
                                                                        Static134.method8956(local5487, true);
                                                                    }
                                                                    if (Static377.anInt5930 != -1) {
                                                                        Static145.method2411(1, Static377.anInt5930);
                                                                    }
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else if (arg0.packetType == Static121.ServerProt49) {
                                                                    local277 = local11.g2_alt3();
                                                                    local100 = local11.g4_alt1();
                                                                    local526 = local11.g1();
                                                                    Static574.method7573();
                                                                    local5445 = (SubInterface) Static548.aHashTable40.get((long) local100);
                                                                    if (local5445 != null) {
                                                                        Static449.method6115(false, local5445.anInt147 != local277, local5445);
                                                                    }
                                                                    Static163.method8850(local526, local277, local100, false);
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else if (arg0.packetType == Static563.ServerProt207) {
                                                                    local277 = local11.g1_alt2();
                                                                    local100 = local11.g2_alt3() << 2;
                                                                    local526 = local11.g1_alt3();
                                                                    local1409 = local11.g1();
                                                                    local1413 = local11.g1_alt3();
                                                                    Static574.method7573();
                                                                    Static638.method8397(local1409, local277, local526, local100, local1413);
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else if (Static671.ServerProt246 == arg0.packetType) {
                                                                    Static703.anInt10571 = local11.g1();
                                                                    arg0.packetType = null;
                                                                    Static321.anInt5111 = Static642.anInt9599;
                                                                    return true;
                                                                } else if (arg0.packetType == ServerProt.ServerProt259) {
                                                                    local277 = local11.g2_alt2();
                                                                    local100 = local11.g2_alt3();
                                                                    local526 = local11.g4_alt1();
                                                                    local1409 = local11.g2_alt3();
                                                                    Static574.method7573();
                                                                    Static231.method3378(local1409, local277, local526, local100);
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else if (Static454.ServerProt174 == arg0.packetType) {
                                                                    local1937 = local11.gjstr();
                                                                    local100 = local11.g2_alt2();
                                                                    Static574.method7573();
                                                                    Static394.method5544(local100, local1937);
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else if (arg0.packetType == Static663.ServerProt241) {
                                                                    local446 = local11.g1() == 1;
                                                                    local627 = local11.gjstr();
                                                                    local629 = local627;
                                                                    if (local446) {
                                                                        local629 = local11.gjstr();
                                                                    }
                                                                    local639 = (long) local11.g2();
                                                                    local644 = (long) local11.g3();
                                                                    local996 = local11.g1();
                                                                    local1002 = local644 + (local639 << 32);
                                                                    local1004 = false;
                                                                    local3502 = 0;
                                                                    while (true) {
                                                                        if (local3502 >= 100) {
                                                                            if (local996 <= 1) {
                                                                                if (Static389.aBoolean459 && !Static34.aBoolean62 || Static617.aBoolean724) {
                                                                                    local1004 = true;
                                                                                } else if (Static71.method1524(local629)) {
                                                                                    local1004 = true;
                                                                                }
                                                                            }
                                                                            break;
                                                                        }
                                                                        if (Static511.aLongArray17[local3502] == local1002) {
                                                                            local1004 = true;
                                                                            break;
                                                                        }
                                                                        local3502++;
                                                                    }
                                                                    if (!local1004 && Static659.anInt9817 == 0) {
                                                                        Static511.aLongArray17[Static97.anInt2001] = local1002;
                                                                        Static97.anInt2001 = (Static97.anInt2001 + 1) % 100;
                                                                        local3582 = Static130.method2280(Static15.method189(local11));
                                                                        if (local996 == 2) {
                                                                            Static662.method8625("<img=1>" + local629, "<img=1>" + local627, -1, local3582, (String) null, 0, local627, 7);
                                                                        } else if (local996 == 1) {
                                                                            Static662.method8625("<img=0>" + local629, "<img=0>" + local627, -1, local3582, (String) null, 0, local627, 7);
                                                                        } else {
                                                                            Static662.method8625(local629, local627, -1, local3582, (String) null, 0, local627, 3);
                                                                        }
                                                                    }
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else if (arg0.packetType == Static606.ServerProt221) {
                                                                    local277 = local11.g1_alt3();
                                                                    local100 = local11.ig2();
                                                                    if (local100 == 65535) {
                                                                        local100 = -1;
                                                                    }
                                                                    local526 = local11.g1_alt2();
                                                                    Static63.method1427(local526, local100, local277);
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else if (ServerProt.OPCODE_0 == arg0.packetType) {
                                                                    local277 = local11.g2_alt2();
                                                                    if (local277 == 65535) {
                                                                        local277 = -1;
                                                                    }
                                                                    local100 = local11.g3_alt1();
                                                                    local526 = local11.g1_alt2();
                                                                    Static482.method6481(local526, local277, local100);
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else if (Static272.ServerProt112 == arg0.packetType) {
                                                                    if (Static316.aFrame8 != null) {
                                                                        Static409.method5657(Static400.aClass2_Sub34_28.aPreference_Sub1_1.method1485(), -1, false, -1);
                                                                    }
                                                                    local3044 = new byte[arg0.anInt3648];
                                                                    local11.pdataisaac(local3044, arg0.anInt3648);
                                                                    local627 = Static350.method5126(0, local3044, arg0.anInt3648);
                                                                    local629 = "opensn";
                                                                    if (!Static98.aBoolean191 || Static36.method980(Static446.aSignlink6, local627, local629, 1).anInt6789 == 2) {
                                                                        Static259.method3693(local627, local629, Static446.aSignlink6, Static400.aClass2_Sub34_28.aPreference_Sub29_1.method7915() == 1, true);
                                                                    }
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else if (arg0.packetType == ServerProt.ServerProt175) {
                                                                    local277 = local11.g2();
                                                                    local100 = local11.g2();
                                                                    local526 = local11.g2();
                                                                    Static574.method7573();
                                                                    if (Static453.aComponentArrayArray2[local277] != null) {
                                                                        for (local1409 = local100; local1409 < local526; local1409++) {
                                                                            local1413 = local11.g3();
                                                                            if (Static453.aComponentArrayArray2[local277].length > local1409 && Static453.aComponentArrayArray2[local277][local1409] != null) {
                                                                                Static453.aComponentArrayArray2[local277][local1409].anInt3774 = local1413;
                                                                            }
                                                                        }
                                                                    }
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else if (arg0.packetType == Static266.ServerProt192) {
                                                                    local277 = local11.g4_alt2();
                                                                    local100 = local11.g2();
                                                                    local526 = local11.g4_alt3();
                                                                    Static574.method7573();
                                                                    Static479.method6462(local100, 5, local526, local277);
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else if (arg0.packetType == Static598.ServerProt219) {
                                                                    Static605.method7912(ZoneProt.OPCODE_11);
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else if (Static389.aServerProt_157 == arg0.packetType) {
                                                                    local277 = local11.g2();
                                                                    if (local277 == 65535) {
                                                                        local277 = -1;
                                                                    }
                                                                    local100 = local11.g1();
                                                                    local526 = local11.g2();
                                                                    local1409 = local11.g1();
                                                                    Static186.method2818(local277, local100, 256, local526, local1409, true);
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else if (arg0.packetType == Static40.ServerProt19) {
                                                                    Static574.method7573();
                                                                    Static145.method2409();
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else if (arg0.packetType == Static91.ServerProt236) {
                                                                    Static308.method4482(local11, arg0.anInt3648);
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else if (Static250.ServerProt105 == arg0.packetType) {
                                                                    Static133.anInt2458 = local11.g1();
                                                                    Static87.anInt1806 = local11.g1();
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else if (ServerProt.ServerProt14 == arg0.packetType) {
                                                                    Static626.anInt9476 = local11.g1b() << 3;
                                                                    Static270.anInt4354 = local11.g1b_alt3() << 3;
                                                                    Static87.anInt1810 = local11.g1();
                                                                    for (@Pc(6277) Linkable_Sub17 local6277 = (Linkable_Sub17) Static497.aHashTable35.head(); local6277 != null; local6277 = (Linkable_Sub17) Static497.aHashTable35.next()) {
                                                                        local100 = (int) (local6277.id >> 28 & 0x3L);
                                                                        local526 = (int) (local6277.id & 0x3FFFL);
                                                                        local1409 = local526 - Static691.anInt10367;
                                                                        local1413 = (int) (local6277.id >> 14 & 0x3FFFL);
                                                                        local2098 = local1413 - Static116.anInt2270;
                                                                        if (Static87.anInt1810 == local100 && local1409 >= Static626.anInt9476 && Static626.anInt9476 + 8 > local1409 && local2098 >= Static270.anInt4354 && Static270.anInt4354 + 8 > local2098) {
                                                                            local6277.unlink();
                                                                            if (local1409 >= 0 && local2098 >= 0 && Static720.anInt10859 > local1409 && local2098 < Static501.anInt7568) {
                                                                                Static468.method7641(Static87.anInt1810, local2098, local1409);
                                                                            }
                                                                        }
                                                                    }
                                                                    @Pc(6385) Linkable_Sub25 local6385;
                                                                    for (local6385 = (Linkable_Sub25) Static159.aLinkedList15.head(); local6385 != null; local6385 = (Linkable_Sub25) Static159.aLinkedList15.next()) {
                                                                        if (Static626.anInt9476 <= local6385.anInt4016 && Static626.anInt9476 + 8 > local6385.anInt4016 && local6385.anInt4006 >= Static270.anInt4354 && Static270.anInt4354 + 8 > local6385.anInt4006 && Static87.anInt1810 == local6385.anInt4010) {
                                                                            local6385.aBoolean309 = true;
                                                                        }
                                                                    }
                                                                    for (local6385 = (Linkable_Sub25) Static227.aLinkedList18.head(); local6385 != null; local6385 = (Linkable_Sub25) Static227.aLinkedList18.next()) {
                                                                        if (local6385.anInt4016 >= Static626.anInt9476 && Static626.anInt9476 + 8 > local6385.anInt4016 && local6385.anInt4006 >= Static270.anInt4354 && Static270.anInt4354 + 8 > local6385.anInt4006 && local6385.anInt4010 == Static87.anInt1810) {
                                                                            local6385.aBoolean309 = true;
                                                                        }
                                                                    }
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else if (arg0.packetType == Static533.ServerProt196) {
                                                                    local277 = local11.g4_alt1();
                                                                    Static574.method7573();
                                                                    Static479.method6462(-1, 3, -1, local277);
                                                                    arg0.packetType = null;
                                                                    return true;
                                                                } else {
                                                                    @Pc(6565) boolean local6565;
                                                                    if (Static718.ServerProt258 == arg0.packetType) {
                                                                        local446 = local11.g1() == 1;
                                                                        local627 = local11.gjstr();
                                                                        local629 = local627;
                                                                        if (local446) {
                                                                            local629 = local11.gjstr();
                                                                        }
                                                                        local1409 = local11.g1();
                                                                        local6565 = false;
                                                                        if (local1409 <= 1) {
                                                                            if (Static389.aBoolean459 && !Static34.aBoolean62 || Static617.aBoolean724) {
                                                                                local6565 = true;
                                                                            } else if (local1409 <= 1 && Static71.method1524(local629)) {
                                                                                local6565 = true;
                                                                            }
                                                                        }
                                                                        if (!local6565 && Static659.anInt9817 == 0) {
                                                                            local1750 = Static130.method2280(Static15.method189(local11));
                                                                            if (local1409 == 2) {
                                                                                Static662.method8625("<img=1>" + local629, "<img=1>" + local627, -1, local1750, (String) null, 0, local627, 24);
                                                                            } else if (local1409 == 1) {
                                                                                Static662.method8625("<img=0>" + local629, "<img=0>" + local627, -1, local1750, (String) null, 0, local627, 24);
                                                                            } else {
                                                                                Static662.method8625(local629, local627, -1, local1750, (String) null, 0, local627, 24);
                                                                            }
                                                                        }
                                                                        arg0.packetType = null;
                                                                        return true;
                                                                    } else if (Static629.ServerProt228 == arg0.packetType) {
                                                                        local277 = local11.g2();
                                                                        local627 = local11.gjstr();
                                                                        local2080 = local11.g1() == 1;
                                                                        Static718.aBoolean823 = local2080;
                                                                        Static459.aClass229_2 = Static344.aClass229_1;
                                                                        Static430.method5817(local277, local627);
                                                                        Static81.method1586(15);
                                                                        arg0.packetType = null;
                                                                        return false;
                                                                    } else if (arg0.packetType == ServerProt.ServerProt152) {
                                                                        if (Static377.anInt5930 != -1) {
                                                                            Static145.method2411(0, Static377.anInt5930);
                                                                        }
                                                                        arg0.packetType = null;
                                                                        return true;
                                                                    } else if (arg0.packetType == Static411.ServerProt164) {
                                                                        Static251.anInt4036 = 1;
                                                                        Static344.anInt5621 = Static642.anInt9599;
                                                                        arg0.packetType = null;
                                                                        return true;
                                                                    } else if (arg0.packetType == Static384.ServerProt156) {
                                                                        Static39.anInt949 = Static642.anInt9599;
                                                                        local446 = local11.g1() == 1;
                                                                        if (arg0.anInt3648 != 1) {
                                                                            if (local446) {
                                                                                Static45.aClass2_Sub47_1 = new ClanChannel(local11);
                                                                            } else {
                                                                                Static674.aClass2_Sub47_3 = new ClanChannel(local11);
                                                                            }
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        }
                                                                        if (local446) {
                                                                            Static45.aClass2_Sub47_1 = null;
                                                                        } else {
                                                                            Static674.aClass2_Sub47_3 = null;
                                                                        }
                                                                        arg0.packetType = null;
                                                                        return true;
                                                                    } else if (ServerProt.ServerProt170 == arg0.packetType) {
                                                                        Static626.anInt9476 = local11.g1b_alt2() << 3;
                                                                        Static87.anInt1810 = local11.g1_alt1();
                                                                        Static270.anInt4354 = local11.g1b() << 3;
                                                                        while (local11.pos < arg0.anInt3648) {
                                                                            @Pc(6873) ZoneProt local6873 = ZoneProt.all()[local11.g1()];
                                                                            Static605.method7912(local6873);
                                                                        }
                                                                        arg0.packetType = null;
                                                                        return true;
                                                                    } else if (Static651.ServerProt235 == arg0.packetType) {
                                                                        Static434.method5855();
                                                                        arg0.packetType = null;
                                                                        return false;
                                                                    } else if (arg0.packetType == Static41.ServerProt20) {
                                                                        local277 = local11.g4_alt3();
                                                                        local100 = local277 >> 28 & 0x3;
                                                                        local526 = local277 >> 14 & 0x3FFF;
                                                                        local1409 = local277 & 0x3FFF;
                                                                        local1413 = local11.g2_alt2();
                                                                        if (local1413 == 65535) {
                                                                            local1413 = -1;
                                                                        }
                                                                        local2098 = local11.g1_alt3();
                                                                        local992 = local2098 >> 2;
                                                                        local996 = local2098 & 0x3;
                                                                        local1449 = Static310.anIntArray379[local992];
                                                                        local1409 -= Static116.anInt2270;
                                                                        local526 -= Static691.anInt10367;
                                                                        Static198.method2953(local100, local1409, local992, local1413, local526, local996, local1449);
                                                                        arg0.packetType = null;
                                                                        return true;
                                                                    } else if (Static706.ServerProt255 == arg0.packetType) {
                                                                        local277 = local11.g1();
                                                                        local892 = (local277 & 0x1) == 1;
                                                                        local629 = local11.gjstr();
                                                                        local4175 = local11.gjstr();
                                                                        if (local4175.equals("")) {
                                                                            local4175 = local629;
                                                                        }
                                                                        local4177 = local11.gjstr();
                                                                        local1750 = local11.gjstr();
                                                                        if (local1750.equals("")) {
                                                                            local1750 = local4177;
                                                                        }
                                                                        if (local892) {
                                                                            for (local992 = 0; local992 < Static436.anInt3849; local992++) {
                                                                                if (Static446.aStringArray35[local992].equals(local1750)) {
                                                                                    Static632.aStringArray44[local992] = local629;
                                                                                    Static446.aStringArray35[local992] = local4175;
                                                                                    Static10.aStringArray1[local992] = local4177;
                                                                                    Static316.aStringArray41[local992] = local1750;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            Static632.aStringArray44[Static436.anInt3849] = local629;
                                                                            Static446.aStringArray35[Static436.anInt3849] = local4175;
                                                                            Static10.aStringArray1[Static436.anInt3849] = local4177;
                                                                            Static316.aStringArray41[Static436.anInt3849] = local1750;
                                                                            Static65.aBooleanArray2[Static436.anInt3849] = (local277 & 0x2) == 2;
                                                                            Static436.anInt3849++;
                                                                        }
                                                                        Static344.anInt5621 = Static642.anInt9599;
                                                                        arg0.packetType = null;
                                                                        return true;
                                                                    } else if (Static331.ServerProt138 == arg0.packetType) {
                                                                        local277 = local11.g4_alt2();
                                                                        if (local277 != Static435.anInt6594) {
                                                                            Static435.anInt6594 = local277;
                                                                            Static472.method6429(Static362.aClass242_10, -1, -1);
                                                                        }
                                                                        arg0.packetType = null;
                                                                        return true;
                                                                    } else if (Static550.ServerProt200 == arg0.packetType) {
                                                                        local446 = local11.g1() == 1;
                                                                        local627 = local11.gjstr();
                                                                        local629 = local627;
                                                                        if (local446) {
                                                                            local629 = local11.gjstr();
                                                                        }
                                                                        local1409 = local11.g1();
                                                                        local1413 = local11.g2();
                                                                        local1425 = false;
                                                                        if (local1409 <= 1 && Static71.method1524(local629)) {
                                                                            local1425 = true;
                                                                        }
                                                                        if (!local1425 && Static659.anInt9817 == 0) {
                                                                            local1427 = Static288.aQuickChatPhraseTypeList2.method2950(local1413).method3903(local11);
                                                                            if (local1409 == 2) {
                                                                                Static662.method8625("<img=1>" + local629, "<img=1>" + local627, local1413, local1427, (String) null, 0, local627, 25);
                                                                            } else if (local1409 == 1) {
                                                                                Static662.method8625("<img=0>" + local629, "<img=0>" + local627, local1413, local1427, (String) null, 0, local627, 25);
                                                                            } else {
                                                                                Static662.method8625(local629, local627, local1413, local1427, (String) null, 0, local627, 25);
                                                                            }
                                                                        }
                                                                        arg0.packetType = null;
                                                                        return true;
                                                                    } else if (arg0.packetType == ServerProt.ServerProt119) {
                                                                        local277 = local11.g4();
                                                                        local100 = local11.g4();
                                                                        @Pc(7309) OutboundPacket local7309 = OutboundPacket.create(Static128.aClientProt106, arg0.random);
                                                                        local7309.buffer.p4(local277);
                                                                        local7309.buffer.p4(local100);
                                                                        arg0.queue(local7309);
                                                                        arg0.packetType = null;
                                                                        return true;
                                                                    } else if (arg0.packetType == ServerProt.ServerProt36) {
                                                                        Static605.method7912(ZoneProt.OPCODE_0);
                                                                        arg0.packetType = null;
                                                                        return true;
                                                                    } else {
                                                                        @Pc(7394) Class241 local7394;
                                                                        if (arg0.packetType == Static137.ServerProt57) {
                                                                            local1937 = local11.gjstr();
                                                                            local2080 = local11.g1() == 1;
                                                                            if (local2080) {
                                                                                local627 = local11.gjstr();
                                                                            } else {
                                                                                local627 = local1937;
                                                                            }
                                                                            local1409 = local11.g2();
                                                                            @Pc(7377) byte local7377 = local11.g1b();
                                                                            local1425 = false;
                                                                            if (local7377 == -128) {
                                                                                local1425 = true;
                                                                            }
                                                                            if (local1425) {
                                                                                if (Static706.anInt10633 == 0) {
                                                                                    arg0.packetType = null;
                                                                                    return true;
                                                                                }
                                                                                for (local992 = 0; Static706.anInt10633 > local992 && (!Static87.aClass241Array1[local992].aString66.equals(local627) || local1409 != Static87.aClass241Array1[local992].anInt6148); local992++) {
                                                                                }
                                                                                if (local992 < Static706.anInt10633) {
                                                                                    while (Static706.anInt10633 - 1 > local992) {
                                                                                        Static87.aClass241Array1[local992] = Static87.aClass241Array1[local992 + 1];
                                                                                        local992++;
                                                                                    }
                                                                                    Static706.anInt10633--;
                                                                                    Static87.aClass241Array1[Static706.anInt10633] = null;
                                                                                }
                                                                            } else {
                                                                                local1427 = local11.gjstr();
                                                                                local7394 = new Class241();
                                                                                local7394.aString67 = local1937;
                                                                                local7394.aString66 = local627;
                                                                                local7394.aString68 = Static390.method5492(local7394.aString66);
                                                                                local7394.anInt6148 = local1409;
                                                                                local7394.aString65 = local1427;
                                                                                local7394.aByte99 = local7377;
                                                                                for (local1449 = Static706.anInt10633 - 1; local1449 >= 0; local1449--) {
                                                                                    local653 = Static87.aClass241Array1[local1449].aString68.compareTo(local7394.aString68);
                                                                                    if (local653 == 0) {
                                                                                        Static87.aClass241Array1[local1449].anInt6148 = local1409;
                                                                                        Static87.aClass241Array1[local1449].aByte99 = local7377;
                                                                                        Static87.aClass241Array1[local1449].aString65 = local1427;
                                                                                        if (local627.equals(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9)) {
                                                                                            Static682.aByte142 = local7377;
                                                                                        }
                                                                                        Static352.anInt5754 = Static642.anInt9599;
                                                                                        arg0.packetType = null;
                                                                                        return true;
                                                                                    }
                                                                                    if (local653 < 0) {
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (Static87.aClass241Array1.length <= Static706.anInt10633) {
                                                                                    arg0.packetType = null;
                                                                                    return true;
                                                                                }
                                                                                for (local653 = Static706.anInt10633 - 1; local653 > local1449; local653--) {
                                                                                    Static87.aClass241Array1[local653 + 1] = Static87.aClass241Array1[local653];
                                                                                }
                                                                                if (Static706.anInt10633 == 0) {
                                                                                    Static87.aClass241Array1 = new Class241[100];
                                                                                }
                                                                                Static87.aClass241Array1[local1449 + 1] = local7394;
                                                                                Static706.anInt10633++;
                                                                                if (local627.equals(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9)) {
                                                                                    Static682.aByte142 = local7377;
                                                                                }
                                                                            }
                                                                            Static352.anInt5754 = Static642.anInt9599;
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (arg0.packetType == Static25.ServerProt11) {
                                                                            local277 = local11.g2();
                                                                            local100 = local11.g4();
                                                                            if (Static279.anObjectArray35 == null) {
                                                                                Static279.anObjectArray35 = new Object[Static628.aVarClanTypeList5.anInt8769];
                                                                            }
                                                                            Static279.anObjectArray35[local277] = Integer.valueOf(local100);
                                                                            Static265.anIntArray328[Static710.anInt7554++ & 0x1F] = local277;
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (Static132.ServerProt54 == arg0.packetType) {
                                                                            local277 = local11.g2();
                                                                            @Pc(7724) Player local7724;
                                                                            if (local277 == Static312.anInt5000) {
                                                                                local7724 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2;
                                                                            } else {
                                                                                local7724 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local277];
                                                                            }
                                                                            if (local7724 == null) {
                                                                                arg0.packetType = null;
                                                                                return true;
                                                                            }
                                                                            local526 = local11.g2();
                                                                            local1409 = local11.g1();
                                                                            local6565 = (local526 & 0x8000) != 0;
                                                                            if (local7724.aString9 != null && local7724.aPlayerAppearance1 != null) {
                                                                                local1425 = false;
                                                                                if (local1409 <= 1) {
                                                                                    if (!local6565 && (Static389.aBoolean459 && !Static34.aBoolean62 || Static617.aBoolean724)) {
                                                                                        local1425 = true;
                                                                                    } else if (Static71.method1524(local7724.aString9)) {
                                                                                        local1425 = true;
                                                                                    }
                                                                                }
                                                                                if (!local1425 && Static659.anInt9817 == 0) {
                                                                                    local996 = -1;
                                                                                    if (local6565) {
                                                                                        local526 &= 0x7FFF;
                                                                                        @Pc(7827) Class21 local7827 = Static260.method3828(local11);
                                                                                        local996 = local7827.anInt521;
                                                                                        local1427 = local7827.aClass2_Sub2_Sub12_1.method3903(local11);
                                                                                    } else {
                                                                                        local1427 = Static130.method2280(Static15.method189(local11));
                                                                                    }
                                                                                    local7724.method1413(local526 >> 8, local526 & 0xFF, local1427.trim());
                                                                                    if (local1409 == 1 || local1409 == 2) {
                                                                                        local1449 = local6565 ? 17 : 1;
                                                                                    } else {
                                                                                        local1449 = local6565 ? 17 : 2;
                                                                                    }
                                                                                    if (local1409 == 2) {
                                                                                        Static662.method8625("<img=1>" + local7724.method1422(), "<img=1>" + local7724.method1424(false), local996, local1427, (String) null, 0, local7724.aString8, local1449);
                                                                                    } else if (local1409 == 1) {
                                                                                        Static662.method8625("<img=0>" + local7724.method1422(), "<img=0>" + local7724.method1424(false), local996, local1427, (String) null, 0, local7724.aString8, local1449);
                                                                                    } else {
                                                                                        Static662.method8625(local7724.method1422(), local7724.method1424(false), local996, local1427, (String) null, 0, local7724.aString8, local1449);
                                                                                    }
                                                                                }
                                                                            }
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (arg0.packetType == Static19.ServerProt8) {
                                                                            local277 = local11.g2();
                                                                            if (local277 == 65535) {
                                                                                local277 = -1;
                                                                            }
                                                                            local100 = local11.g1();
                                                                            local526 = local11.g2();
                                                                            local1409 = local11.g1();
                                                                            local1413 = local11.g2();
                                                                            Static161.method2586(local1413, local526, local277, local100, local1409);
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (Static590.ServerProt217 == arg0.packetType) {
                                                                            arg0.packetType = null;
                                                                            return false;
                                                                        } else if (ServerProt.ServerProt60 == arg0.packetType) {
                                                                            local277 = local11.ig2();
                                                                            if (local277 == 65535) {
                                                                                local277 = -1;
                                                                            }
                                                                            local100 = local11.g4_alt3();
                                                                            local526 = local11.g2_alt2();
                                                                            if (local526 == 65535) {
                                                                                local526 = -1;
                                                                            }
                                                                            local1409 = local11.g4_alt1();
                                                                            Static574.method7573();
                                                                            for (local1413 = local277; local1413 <= local526; local1413++) {
                                                                                local644 = (long) local1413 + ((long) local100 << 32);
                                                                                local4597 = (ServerActiveProperties) Static291.aHashTable24.get(local644);
                                                                                if (local4597 != null) {
                                                                                    local4611 = new ServerActiveProperties(local1409, local4597.anInt6904);
                                                                                    local4597.unlink();
                                                                                } else if (local1413 == -1) {
                                                                                    local4611 = new ServerActiveProperties(local1409, Static145.method2412(local100).aClass2_Sub41_2.anInt6904);
                                                                                } else {
                                                                                    local4611 = new ServerActiveProperties(local1409, -1);
                                                                                }
                                                                                Static291.aHashTable24.put(local644, local4611);
                                                                            }
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (arg0.packetType == Static85.ServerProt257) {
                                                                            local277 = local11.g2();
                                                                            local100 = local11.g4();
                                                                            local526 = local11.g2();
                                                                            local1409 = local11.g1_alt3();
                                                                            Static574.method7573();
                                                                            Static167.method2630(local526, local1409, local100, local277);
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (arg0.packetType == Static157.ServerProt61) {
                                                                            Static626.anInt9476 = local11.g1b_alt1() << 3;
                                                                            Static270.anInt4354 = local11.g1b() << 3;
                                                                            Static87.anInt1810 = local11.g1_alt3();
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (ServerProt.ServerProt7 == arg0.packetType) {
                                                                            Static605.method7912(ZoneProt.OPCODE_14);
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (Static207.ServerProt127 == arg0.packetType) {
                                                                            local277 = local11.g2s_alt3();
                                                                            local100 = local11.g4_alt2();
                                                                            Static574.method7573();
                                                                            Static147.method2420(local100, local277);
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (Static707.ServerProt256 == arg0.packetType) {
                                                                            local277 = local11.g2_alt3();
                                                                            local100 = local11.g2_alt2();
                                                                            Static574.method7573();
                                                                            Static471.method6408(local100, local277);
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (Static404.ServerProt161 == arg0.packetType) {
                                                                            Static106.anInt2153 = local11.g3s();
                                                                            Static389.aBoolean459 = local11.g1() == 1;
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (arg0.packetType == Static617.ServerProt224) {
                                                                            local277 = local11.g2_alt3();
                                                                            local931 = local11.g1b_alt3();
                                                                            Static574.method7573();
                                                                            Static540.method6537(local931, local277);
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (arg0.packetType == Static468.ServerProt212) {
                                                                            local1937 = local11.gjstr();
                                                                            local627 = Static130.method2280(Static15.method189(local11));
                                                                            Static44.method1072(local627, local1937, 0, local1937, local1937, 6);
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (arg0.packetType == Static353.ServerProt233) {
                                                                            Static400.anInt8102 = Static642.anInt9599;
                                                                            local446 = local11.g1() == 1;
                                                                            @Pc(8376) ClanSettingsDelta local8376 = new ClanSettingsDelta(local11);
                                                                            @Pc(8380) Class164 local8380;
                                                                            if (local446) {
                                                                                local8380 = Static128.aClass164_8;
                                                                            } else {
                                                                                local8380 = Static91.aClass164_9;
                                                                            }
                                                                            local8376.method587(local8380);
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (arg0.packetType == Static109.ServerProt45) {
                                                                            local277 = local11.g4();
                                                                            local627 = local11.gjstr();
                                                                            Static574.method7573();
                                                                            Static211.method4998(local277, local627);
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (arg0.packetType == Static125.ServerProt53) {
                                                                            local277 = local11.ig2();
                                                                            local100 = local11.g1_alt2();
                                                                            local2080 = (local100 & 0x1) == 1;
                                                                            Static698.method9123(local2080, local277);
                                                                            Static322.anIntArray889[Static451.anInt6851++ & 0x1F] = local277;
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (arg0.packetType == Static464.ServerProt176) {
                                                                            Static605.method7912(ZoneProt.OPCODE_7);
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (arg0.packetType == Static269.ServerProt111) {
                                                                            Static346.method5085();
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (Static670.ServerProt245 == arg0.packetType) {
                                                                            local277 = local11.g1_alt3();
                                                                            local100 = local11.g1_alt2();
                                                                            local526 = local11.g1_alt2();
                                                                            local1409 = local11.g1_alt2();
                                                                            local1413 = local11.g2_alt3() << 2;
                                                                            Static574.method7573();
                                                                            Static319.method4595(local526, true, local1409, local1413, local100, local277);
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (arg0.packetType == Static451.aServerProt_171) {
                                                                            Static352.anInt5754 = Static642.anInt9599;
                                                                            if (arg0.anInt3648 == 0) {
                                                                                arg0.packetType = null;
                                                                                Static706.anInt10633 = 0;
                                                                                Static87.aClass241Array1 = null;
                                                                                Static723.aString129 = null;
                                                                                Static158.aString28 = null;
                                                                                return true;
                                                                            }
                                                                            Static158.aString28 = local11.gjstr();
                                                                            local446 = local11.g1() == 1;
                                                                            if (local446) {
                                                                                local11.gjstr();
                                                                            }
                                                                            local4669 = local11.g8();
                                                                            Static723.aString129 = Static287.method4154(local4669);
                                                                            Static673.aByte140 = local11.g1b();
                                                                            local1409 = local11.g1();
                                                                            if (local1409 == 255) {
                                                                                arg0.packetType = null;
                                                                                return true;
                                                                            }
                                                                            Static706.anInt10633 = local1409;
                                                                            @Pc(8611) Class241[] local8611 = new Class241[100];
                                                                            for (local2098 = 0; local2098 < Static706.anInt10633; local2098++) {
                                                                                local8611[local2098] = new Class241();
                                                                                local8611[local2098].aString67 = local11.gjstr();
                                                                                local446 = local11.g1() == 1;
                                                                                if (local446) {
                                                                                    local8611[local2098].aString66 = local11.gjstr();
                                                                                } else {
                                                                                    local8611[local2098].aString66 = local8611[local2098].aString67;
                                                                                }
                                                                                local8611[local2098].aString68 = Static390.method5492(local8611[local2098].aString66);
                                                                                local8611[local2098].anInt6148 = local11.g2();
                                                                                local8611[local2098].aByte99 = local11.g1b();
                                                                                local8611[local2098].aString65 = local11.gjstr();
                                                                                if (local8611[local2098].aString66.equals(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9)) {
                                                                                    Static682.aByte142 = local8611[local2098].aByte99;
                                                                                }
                                                                            }
                                                                            local1449 = Static706.anInt10633;
                                                                            while (local1449 > 0) {
                                                                                @Pc(8729) boolean local8729 = true;
                                                                                local1449--;
                                                                                for (local653 = 0; local653 < local1449; local653++) {
                                                                                    if (local8611[local653].aString68.compareTo(local8611[local653 + 1].aString68) > 0) {
                                                                                        local7394 = local8611[local653];
                                                                                        local8611[local653] = local8611[local653 + 1];
                                                                                        local8611[local653 + 1] = local7394;
                                                                                        local8729 = false;
                                                                                    }
                                                                                }
                                                                                if (local8729) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                            arg0.packetType = null;
                                                                            Static87.aClass241Array1 = local8611;
                                                                            return true;
                                                                        } else if (Static722.ServerProt260 == arg0.packetType) {
                                                                            Static605.method7912(ZoneProt.OPCODE_6);
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (arg0.packetType == Static215.ServerProt86) {
                                                                            local277 = local11.g1();
                                                                            local100 = local11.g1_alt1();
                                                                            if (local277 == 255) {
                                                                                local100 = -1;
                                                                                local277 = -1;
                                                                            }
                                                                            Static50.method6639(local100, local277);
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (arg0.packetType == Static211.ServerProt143) {
                                                                            Static605.method7912(ZoneProt.OPCODE_8);
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (arg0.packetType == Static390.ServerProt158) {
                                                                            local277 = local11.g2();
                                                                            local627 = local11.gjstr();
                                                                            if (Static279.anObjectArray35 == null) {
                                                                                Static279.anObjectArray35 = new Object[Static628.aVarClanTypeList5.anInt8769];
                                                                            }
                                                                            Static279.anObjectArray35[local277] = local627;
                                                                            Static265.anIntArray328[Static710.anInt7554++ & 0x1F] = local277;
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else if (arg0.packetType == Static616.ServerProt223) {
                                                                            local446 = local11.g1() == 1;
                                                                            local627 = local11.gjstr();
                                                                            local629 = local627;
                                                                            if (local446) {
                                                                                local629 = local11.gjstr();
                                                                            }
                                                                            local639 = local11.g8();
                                                                            local644 = (long) local11.g2();
                                                                            local649 = (long) local11.g3();
                                                                            local653 = local11.g1();
                                                                            @Pc(8945) long local8945 = local649 + (local644 << 32);
                                                                            local4857 = false;
                                                                            local1097 = 0;
                                                                            while (true) {
                                                                                if (local1097 >= 100) {
                                                                                    if (local653 <= 1) {
                                                                                        if (Static389.aBoolean459 && !Static34.aBoolean62 || Static617.aBoolean724) {
                                                                                            local4857 = true;
                                                                                        } else if (Static71.method1524(local629)) {
                                                                                            local4857 = true;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                if (Static511.aLongArray17[local1097] == local8945) {
                                                                                    local4857 = true;
                                                                                    break;
                                                                                }
                                                                                local1097++;
                                                                            }
                                                                            if (!local4857 && Static659.anInt9817 == 0) {
                                                                                Static511.aLongArray17[Static97.anInt2001] = local8945;
                                                                                Static97.anInt2001 = (Static97.anInt2001 + 1) % 100;
                                                                                @Pc(9032) String local9032 = Static130.method2280(Static15.method189(local11));
                                                                                if (local653 == 2 || local653 == 3) {
                                                                                    Static662.method8625("<img=1>" + local629, "<img=1>" + local627, -1, local9032, Static99.method1977(local639), 0, local627, 9);
                                                                                } else if (local653 == 1) {
                                                                                    Static662.method8625("<img=0>" + local629, "<img=0>" + local627, -1, local9032, Static99.method1977(local639), 0, local627, 9);
                                                                                } else {
                                                                                    Static662.method8625(local629, local627, -1, local9032, Static99.method1977(local639), 0, local627, 9);
                                                                                }
                                                                            }
                                                                            arg0.packetType = null;
                                                                            return true;
                                                                        } else {
                                                                            Static240.method3496((Throwable) null, "T1 - " + (arg0.packetType == null ? -1 : arg0.packetType.getOpcode()) + "," + (arg0.lastPacketType == null ? -1 : arg0.lastPacketType.getOpcode()) + "," + (arg0.lastPacketType2 == null ? -1 : arg0.lastPacketType2.getOpcode()) + " - " + arg0.anInt3648);
                                                                            Static233.method3409(false);
                                                                            return true;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
