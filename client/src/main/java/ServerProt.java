import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public final class ServerProt {

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "Lclient!lga;")
	public static final ServerProt MESSAGE_GAME = new ServerProt(102, -1);
	@OriginalMember(owner = "client!wc", name = "D", descriptor = "Lclient!lga;")
	public static final ServerProt REBUILD_LOGIN_OR_MUSIC_EFFECT = new ServerProt(0, 6);
	@OriginalMember(owner = "client!ik", name = "u", descriptor = "Lclient!lga;")
	public static final ServerProt SET_OP_PLAYER = new ServerProt(1, -1);
	@OriginalMember(owner = "client!le", name = "a", descriptor = "Lclient!lga;")
	public static final ServerProt IF_SET_SPRITE = new ServerProt(2, 6);
	@OriginalMember(owner = "client!es", name = "h", descriptor = "Lclient!lga;")
	public static final ServerProt IF_SET_EVENTS = new ServerProt(3, 12);
	@OriginalMember(owner = "client!lm", name = "l", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_4 = new ServerProt(4, 0);
	@OriginalMember(owner = "client!aka", name = "g", descriptor = "Lclient!lga;")
	public static final ServerProt ADD_OBJ = new ServerProt(48, 5);
	@OriginalMember(owner = "client!pd", name = "A", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_17 = new ServerProt(17, 0);
	@OriginalMember(owner = "client!rq", name = "D", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_100 = new ServerProt(100, 1);
	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_19 = new ServerProt(19, 8);
	@OriginalMember(owner = "client!oaa", name = "n", descriptor = "Lclient!lga;")
	public static final ServerProt UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerProt(87, -2);
	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!lga;")
	public static final ServerProt LOC_ADD_CHANGE = new ServerProt(28, 4);
	@OriginalMember(owner = "client!gha", name = "w", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_113 = new ServerProt(113, 3);
	@OriginalMember(owner = "client!ws", name = "J", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_122 = new ServerProt(122, 10);
	@OriginalMember(owner = "client!kr", name = "m", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_92 = new ServerProt(92, 4);
	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!lga;")
	public static final ServerProt UPDATE_ZONE_FULL_FOLLOWS = new ServerProt(26, 3);
	@OriginalMember(owner = "client!oia", name = "d", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_110 = new ServerProt(110, -1);
	@OriginalMember(owner = "client!he", name = "g", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_115 = new ServerProt(115, 8);
	@OriginalMember(owner = "client!pt", name = "p", descriptor = "Lclient!lga;")
	public static final ServerProt OBJ_DEL = new ServerProt(16, 3);
	@OriginalMember(owner = "client!dp", name = "c", descriptor = "Lclient!lga;")
	public static final ServerProt IF_OPEN_SUB = new ServerProt(5, 7);
	@OriginalMember(owner = "client!iha", name = "f", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_6 = new ServerProt(6, -2);
	@OriginalMember(owner = "client!maa", name = "u", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_7 = new ServerProt(7, -2);
	@OriginalMember(owner = "client!ph", name = "I", descriptor = "Lclient!lga;")
	public static final ServerProt IF_SET_SCROLL_VERTICAL = new ServerProt(8, 6);
	@OriginalMember(owner = "client!jka", name = "l", descriptor = "Lclient!lga;")
	public static final ServerProt IF_SET_OBJECT = new ServerProt(9, 10);
	@OriginalMember(owner = "client!fw", name = "D", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_10 = new ServerProt(10, 0);
	@OriginalMember(owner = "client!ef", name = "c", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_11 = new ServerProt(11, 3);
	@OriginalMember(owner = "client!ve", name = "r", descriptor = "Lclient!lga;")
	public static final ServerProt UPDATE_RUN_ENERGY = new ServerProt(13, 1);
	@OriginalMember(owner = "client!fi", name = "j", descriptor = "Lclient!lga;")
	public static final ServerProt VARBIT_SMALL = new ServerProt(14, 3);
	@OriginalMember(owner = "client!bfa", name = "o", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_15 = new ServerProt(15, 0);
	@OriginalMember(owner = "client!un", name = "I", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_18 = new ServerProt(18, 4);
	@OriginalMember(owner = "client!nu", name = "c", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_20 = new ServerProt(20, -1);
	@OriginalMember(owner = "client!ue", name = "e", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_21 = new ServerProt(21, -1);
	@OriginalMember(owner = "client!fa", name = "n", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_22 = new ServerProt(22, 10);
	@OriginalMember(owner = "client!gh", name = "d", descriptor = "Lclient!lga;")
	public static final ServerProt IF_SET_ANIM = new ServerProt(23, 6);
	@OriginalMember(owner = "client!ef", name = "l", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_24 = new ServerProt(24, -1);
	@OriginalMember(owner = "client!ska", name = "P", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_25 = new ServerProt(25, 0);
	@OriginalMember(owner = "client!jw", name = "D", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_27 = new ServerProt(27, 0);
	@OriginalMember(owner = "client!vda", name = "Q", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_29 = new ServerProt(29, 6);
	@OriginalMember(owner = "client!lca", name = "A", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_30 = new ServerProt(30, -2);
	@OriginalMember(owner = "client!tc", name = "f", descriptor = "Lclient!lga;")
	public static final ServerProt MIDI_SONG = new ServerProt(31, 4);
	@OriginalMember(owner = "client!iw", name = "e", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_32 = new ServerProt(32, -1);
	@OriginalMember(owner = "client!dh", name = "j", descriptor = "Lclient!lga;")
	public static final ServerProt IF_SET_TEXT = new ServerProt(33, -2);
	@OriginalMember(owner = "client!hd", name = "m", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_34 = new ServerProt(34, 6);
	@OriginalMember(owner = "client!gh", name = "c", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_35 = new ServerProt(35, 2);
	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_36 = new ServerProt(36, 4);
	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!lga;")
	public static final ServerProt UPDATE_INV_FULL = new ServerProt(37, -2);
	@OriginalMember(owner = "client!hda", name = "i", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_38 = new ServerProt(38, 0);
	@OriginalMember(owner = "client!bfa", name = "p", descriptor = "Lclient!lga;")
	public static final ServerProt VARP_LARGE = new ServerProt(39, 6);
	@OriginalMember(owner = "client!tia", name = "L", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_40 = new ServerProt(40, -1);
	@OriginalMember(owner = "client!fca", name = "b", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_41 = new ServerProt(41, 7);
	@OriginalMember(owner = "client!o", name = "O", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_42 = new ServerProt(42, -1);
	@OriginalMember(owner = "client!uja", name = "h", descriptor = "Lclient!lga;")
	public static final ServerProt REBUILD_NORMAL = new ServerProt(43, -2);
	@OriginalMember(owner = "client!oea", name = "y", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_44 = new ServerProt(44, 10);
	@OriginalMember(owner = "client!ol", name = "J", descriptor = "Lclient!lga;")
	public static final ServerProt LOC_DEL = new ServerProt(45, 2);
	@OriginalMember(owner = "client!eu", name = "bb", descriptor = "Lclient!lga;")
	public static final ServerProt UPDATE_ZONE_PARTIAL_FOLLOWS = new ServerProt(46, 3);
	@OriginalMember(owner = "client!ku", name = "n", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_47 = new ServerProt(47, 4);
	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_49 = new ServerProt(49, 1);
	@OriginalMember(owner = "client!ma", name = "f", descriptor = "Lclient!lga;")
	public static final ServerProt RUN_CLIENT_SCRIPT = new ServerProt(50, -2);
	@OriginalMember(owner = "client!ah", name = "d", descriptor = "Lclient!lga;")
	public static final ServerProt LOGOUT_FULL = new ServerProt(51, 0);
	@OriginalMember(owner = "client!as", name = "e", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_52 = new ServerProt(52, 6);
	@OriginalMember(owner = "client!mda", name = "z", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_53 = new ServerProt(53, -1);
	@OriginalMember(owner = "client!bma", name = "e", descriptor = "Lclient!lga;")
	public static final ServerProt VARC_STRING = new ServerProt(54, -1);
	@OriginalMember(owner = "client!gm", name = "f", descriptor = "Lclient!lga;")
	public static final ServerProt SET_MAP_FLAG = new ServerProt(55, 2);
	@OriginalMember(owner = "client!jq", name = "b", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_56 = new ServerProt(56, 28);
	@OriginalMember(owner = "client!gw", name = "c", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_57 = new ServerProt(57, -2);
	@OriginalMember(owner = "client!nca", name = "s", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_58 = new ServerProt(58, 6);
	@OriginalMember(owner = "client!nka", name = "c", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_59 = new ServerProt(59, 0);
	@OriginalMember(owner = "client!dt", name = "c", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_60 = new ServerProt(60, 7);
	@OriginalMember(owner = "client!rja", name = "G", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_61 = new ServerProt(61, 20);
	@OriginalMember(owner = "client!wt", name = "l", descriptor = "Lclient!lga;")
	public static final ServerProt MAP_PROJ_ANIM = new ServerProt(62, 16);
	@OriginalMember(owner = "client!vj", name = "l", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_63 = new ServerProt(63, 5);
	@OriginalMember(owner = "client!ai", name = "K", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_64 = new ServerProt(64, 3);
	@OriginalMember(owner = "client!iu", name = "c", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_65 = new ServerProt(65, 6);
	@OriginalMember(owner = "client!jha", name = "g", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_66 = new ServerProt(66, 10);
	@OriginalMember(owner = "client!td", name = "l", descriptor = "Lclient!lga;")
	public static final ServerProt IF_OPEN_TOP = new ServerProt(67, 3);
	@OriginalMember(owner = "client!tk", name = "b", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_68 = new ServerProt(68, 1);
	@OriginalMember(owner = "client!cr", name = "n", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_69 = new ServerProt(69, -2);
	@OriginalMember(owner = "client!bda", name = "D", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_70 = new ServerProt(70, -2);
	@OriginalMember(owner = "client!kja", name = "c", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_71 = new ServerProt(71, 2);
	@OriginalMember(owner = "client!hn", name = "m", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_72 = new ServerProt(72, 2);
	@OriginalMember(owner = "client!sha", name = "l", descriptor = "Lclient!lga;")
	public static final ServerProt IF_CLOSE_SUB = new ServerProt(73, 4);
	@OriginalMember(owner = "client!bfa", name = "l", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_74 = new ServerProt(74, 11);
	@OriginalMember(owner = "client!dt", name = "b", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_75 = new ServerProt(75, 3);
	@OriginalMember(owner = "client!cm", name = "p", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_76 = new ServerProt(76, 9);
	@OriginalMember(owner = "client!op", name = "r", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_77 = new ServerProt(77, -2);
	@OriginalMember(owner = "client!qk", name = "b", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_78 = new ServerProt(78, 8);
	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_79 = new ServerProt(79, -2);
	@OriginalMember(owner = "client!qk", name = "h", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_80 = new ServerProt(80, -2);
	@OriginalMember(owner = "client!tja", name = "z", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_81 = new ServerProt(81, 12);
	@OriginalMember(owner = "client!sia", name = "w", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_82 = new ServerProt(82, 6);
	@OriginalMember(owner = "client!gj", name = "l", descriptor = "Lclient!lga;")
	public static final ServerProt OBJ_COUNT = new ServerProt(83, 7);
	@OriginalMember(owner = "client!gg", name = "i", descriptor = "Lclient!lga;")
	public static final ServerProt VARBIT_LARGE = new ServerProt(84, 6);
	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_85 = new ServerProt(85, -2);
	@OriginalMember(owner = "client!it", name = "d", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_86 = new ServerProt(86, 0);
	@OriginalMember(owner = "client!vp", name = "B", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_88 = new ServerProt(88, -2);
	@OriginalMember(owner = "client!u", name = "p", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_89 = new ServerProt(89, -1);
	@OriginalMember(owner = "client!ed", name = "h", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_90 = new ServerProt(90, 17);
	@OriginalMember(owner = "client!ec", name = "A", descriptor = "Lclient!lga;")
	public static final ServerProt PUBLIC_CHAT = new ServerProt(91, -1);
	@OriginalMember(owner = "client!uba", name = "c", descriptor = "Lclient!lga;")
	public static final ServerProt UPDATE_STAT = new ServerProt(93, 6);
	@OriginalMember(owner = "client!tu", name = "j", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_94 = new ServerProt(94, -1);
	@OriginalMember(owner = "client!iw", name = "f", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_95 = new ServerProt(95, 6);
	@OriginalMember(owner = "client!gla", name = "y", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_144 = new ServerProt(144, 5);
	@OriginalMember(owner = "client!ija", name = "i", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_143 = new ServerProt(143, -2);
	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_142 = new ServerProt(142, 0);
	@OriginalMember(owner = "client!tja", name = "I", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_141 = new ServerProt(141, 2);
	@OriginalMember(owner = "client!ofa", name = "s", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_140 = new ServerProt(140, -2);
	@OriginalMember(owner = "client!vt", name = "g", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_139 = new ServerProt(139, -2);
	@OriginalMember(owner = "client!ifa", name = "g", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_138 = new ServerProt(138, -1);
	@OriginalMember(owner = "client!dma", name = "k", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_137 = new ServerProt(137, 8);
	@OriginalMember(owner = "client!ge", name = "Ab", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_136 = new ServerProt(136, 6);
	@OriginalMember(owner = "client!mv", name = "h", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_135 = new ServerProt(135, 0);
	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_134 = new ServerProt(134, 1);
	@OriginalMember(owner = "client!wo", name = "E", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_133 = new ServerProt(133, -1);
	@OriginalMember(owner = "client!bfa", name = "n", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_132 = new ServerProt(132, -2);
	@OriginalMember(owner = "client!gv", name = "h", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_131 = new ServerProt(131, -1);
	@OriginalMember(owner = "client!mu", name = "b", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_130 = new ServerProt(130, 9);
	@OriginalMember(owner = "client!va", name = "D", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_129 = new ServerProt(129, 4);
	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_128 = new ServerProt(128, -2);
	@OriginalMember(owner = "client!ro", name = "g", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_127 = new ServerProt(127, 6);
	@OriginalMember(owner = "client!mm", name = "a", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_126 = new ServerProt(126, 4);
	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Lclient!lga;")
	public static final ServerProt UPDATE_REBOOT_TIMER = new ServerProt(125, 2);
	@OriginalMember(owner = "client!kt", name = "S", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_124 = new ServerProt(124, 1);
	@OriginalMember(owner = "client!nia", name = "o", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_123 = new ServerProt(123, 1);
	@OriginalMember(owner = "client!va", name = "A", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_120 = new ServerProt(120, -2);
	@OriginalMember(owner = "client!ss", name = "e", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_119 = new ServerProt(119, 6);
	@OriginalMember(owner = "client!ki", name = "g", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_118 = new ServerProt(118, -2);
	@OriginalMember(owner = "client!uu", name = "m", descriptor = "Lclient!lga;")
	public static final ServerProt IF_SET_HIDE = new ServerProt(117, 5);
	@OriginalMember(owner = "client!rf", name = "t", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_116 = new ServerProt(116, -1);
	@OriginalMember(owner = "client!qp", name = "d", descriptor = "Lclient!lga;")
	public static final ServerProt IF_SET_PLAYER_HEAD = new ServerProt(114, 4);
	@OriginalMember(owner = "client!jt", name = "h", descriptor = "Lclient!lga;")
	public static final ServerProt VARC_LARGE = new ServerProt(112, 6);
	@OriginalMember(owner = "client!tj", name = "D", descriptor = "Lclient!lga;")
	public static final ServerProt VARC_SMALL = new ServerProt(111, 3);
	@OriginalMember(owner = "client!ifa", name = "i", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_109 = new ServerProt(109, 10);
	@OriginalMember(owner = "client!tba", name = "h", descriptor = "Lclient!lga;")
	public static final ServerProt MAP_ANIM = new ServerProt(108, 12);
	@OriginalMember(owner = "client!wg", name = "b", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_107 = new ServerProt(107, 4);
	@OriginalMember(owner = "client!al", name = "d", descriptor = "Lclient!lga;")
	public static final ServerProt SYNTH_SOUND = new ServerProt(106, 8);
	@OriginalMember(owner = "client!wfa", name = "Q", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_105 = new ServerProt(105, -1);
	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_104 = new ServerProt(104, 8);
	@OriginalMember(owner = "client!pi", name = "e", descriptor = "Lclient!lga;")
	public static final ServerProt UPDATE_RUN_WEIGHT = new ServerProt(103, 2);
	@OriginalMember(owner = "client!bja", name = "e", descriptor = "Lclient!lga;")
	public static final ServerProt VARP_SMALL = new ServerProt(101, 3);
	@OriginalMember(owner = "client!rv", name = "p", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_99 = new ServerProt(99, -1);
	@OriginalMember(owner = "client!af", name = "n", descriptor = "Lclient!lga;")
	public static final ServerProt IF_SET_NPC_HEAD = new ServerProt(98, 6);
	@OriginalMember(owner = "client!cn", name = "d", descriptor = "Lclient!lga;")
	public static final ServerProt OPCODE_97 = new ServerProt(97, -1);
	@OriginalMember(owner = "client!bg", name = "d", descriptor = "Lclient!lga;")
	public static final ServerProt LOC_ANIM = new ServerProt(96, 7);


	@OriginalMember(owner = "client!oe", name = "ib", descriptor = "Lclient!lga;")
	public static ServerProt OPCODE_12 = new ServerProt(12, -2);
	@OriginalMember(owner = "client!md", name = "F", descriptor = "Lclient!lga;")
	public static ServerProt SYNTH_SOUND_REPEAT = new ServerProt(121, 6);
	@OriginalMember(owner = "client!lga", name = "b", descriptor = "I")
	public final int size;
	@OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
	private final int opcode;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(II)V")
	public ServerProt(@OriginalArg(0) int opcode, @OriginalArg(1) int size) {
		this.opcode = opcode;
		this.size = size;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)[Lclient!lga;")
	public static ServerProt[] all() {
		return new ServerProt[] {REBUILD_LOGIN_OR_MUSIC_EFFECT, SET_OP_PLAYER, IF_SET_SPRITE, IF_SET_EVENTS, OPCODE_4, IF_OPEN_SUB, OPCODE_6, OPCODE_7, IF_SET_SCROLL_VERTICAL, IF_SET_OBJECT, OPCODE_10, OPCODE_11, OPCODE_12, UPDATE_RUN_ENERGY, VARBIT_SMALL, OPCODE_15, OBJ_DEL, OPCODE_17, OPCODE_18, OPCODE_19, OPCODE_20, OPCODE_21, OPCODE_22, IF_SET_ANIM, OPCODE_24, OPCODE_25, UPDATE_ZONE_FULL_FOLLOWS, OPCODE_27, LOC_ADD_CHANGE, OPCODE_29, OPCODE_30, MIDI_SONG, OPCODE_32, IF_SET_TEXT, OPCODE_34, OPCODE_35, OPCODE_36, UPDATE_INV_FULL, OPCODE_38, VARP_LARGE, OPCODE_40, OPCODE_41, OPCODE_42, REBUILD_NORMAL, OPCODE_44, LOC_DEL, UPDATE_ZONE_PARTIAL_FOLLOWS, OPCODE_47, ADD_OBJ, OPCODE_49, RUN_CLIENT_SCRIPT, LOGOUT_FULL, OPCODE_52, OPCODE_53, VARC_STRING, SET_MAP_FLAG, OPCODE_56, OPCODE_57, OPCODE_58, OPCODE_59, OPCODE_60, OPCODE_61, MAP_PROJ_ANIM, OPCODE_63, OPCODE_64, OPCODE_65, OPCODE_66, IF_OPEN_TOP, OPCODE_68, OPCODE_69, OPCODE_70, OPCODE_71, OPCODE_72, IF_CLOSE_SUB, OPCODE_74, OPCODE_75, OPCODE_76, OPCODE_77, OPCODE_78, OPCODE_79, OPCODE_80, OPCODE_81, OPCODE_82, OBJ_COUNT, VARBIT_LARGE, OPCODE_85, OPCODE_86, UPDATE_ZONE_PARTIAL_ENCLOSED, OPCODE_88, OPCODE_89, OPCODE_90, PUBLIC_CHAT, OPCODE_92, UPDATE_STAT, OPCODE_94, OPCODE_95, LOC_ANIM, OPCODE_97, IF_SET_NPC_HEAD, OPCODE_99, OPCODE_100, VARP_SMALL, MESSAGE_GAME, UPDATE_RUN_WEIGHT, OPCODE_104, OPCODE_105, SYNTH_SOUND, OPCODE_107, MAP_ANIM, OPCODE_109, OPCODE_110, VARC_SMALL, VARC_LARGE, OPCODE_113, IF_SET_PLAYER_HEAD, OPCODE_115, OPCODE_116, IF_SET_HIDE, OPCODE_118, OPCODE_119, OPCODE_120, SYNTH_SOUND_REPEAT, OPCODE_122, OPCODE_123, OPCODE_124, UPDATE_REBOOT_TIMER, OPCODE_126, OPCODE_127, OPCODE_128, OPCODE_129, OPCODE_130, OPCODE_131, OPCODE_132, OPCODE_133, OPCODE_134, OPCODE_135, OPCODE_136, OPCODE_137, OPCODE_138, OPCODE_139, OPCODE_140, OPCODE_141, OPCODE_142, OPCODE_143, OPCODE_144};
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)I")
	public int getOpcode() {
		return this.opcode;
	}

	@OriginalMember(owner = "client!lga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
