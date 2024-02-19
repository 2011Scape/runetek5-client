import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Js5 {

	@OriginalMember(owner = "client!pfa", name = "v", descriptor = "Z")
	public static final boolean RAISE_EXCEPTIONS = false;

	@OriginalMember(owner = "client!sb", name = "J", descriptor = "[Ljava/lang/Object;")
	private Object[] packed;

	@OriginalMember(owner = "client!sb", name = "K", descriptor = "[[Ljava/lang/Object;")
	private Object[][] unpacked;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "Lclient!pj;")
	private Js5Index index = null;

	@OriginalMember(owner = "client!sb", name = "H", descriptor = "Lclient!bm;")
	private final Js5ResourceProvider provider;

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "Z")
	private final boolean discardPacked;

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
	public int discardUnpacked;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!bm;ZI)V")
	public Js5(@OriginalArg(0) Js5ResourceProvider provider, @OriginalArg(1) boolean discardPacked, @OriginalArg(2) int discardUnpacked) {
		if (discardUnpacked < 0 || discardUnpacked > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + discardUnpacked + " supplied for discardunpacked");
		}

		this.provider = provider;
		this.discardPacked = discardPacked;
		this.discardUnpacked = discardUnpacked;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZBZ)V")
	public void discardNames(@OriginalArg(0) boolean groups) {
		if (!this.isIndexReady()) {
			return;
		}

		if (groups) {
			this.index.groupNameHashTable = null;
			this.index.groupNameHashes = null;
		}

		this.index.fileNameHashes = null;
		this.index.fileNameHashTable = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)I")
	public int getChecksum() {
		if (!this.isIndexReady()) {
			throw new IllegalStateException("");
		}

		return this.index.checksum;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)Z")
	public boolean method7577(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.isIndexReady()) {
			return false;
		}

		@Pc(13) String local13 = arg0.toLowerCase();
		@Pc(16) String local16 = arg1.toLowerCase();
		@Pc(25) int local25 = this.index.groupNameHashTable.get(StringUtils.hashCode(local13));
		if (local25 < 0) {
			return false;
		} else {
			@Pc(41) int local41 = this.index.fileNameHashTable[local25].get(StringUtils.hashCode(local16));
			return local41 >= 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method7578(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = this.getGroupId("");
		return local14 == -1 ? this.isFileReady(arg0, "") : this.isFileReady("", arg0);
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(II)V")
	private void fetchGroup(@OriginalArg(0) int group) {
		if (this.discardPacked) {
			this.packed[group] = this.provider.fetchGroup(group);
		} else {
			this.packed[group] = ByteArray.wrap(this.provider.fetchGroup(group));
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)I")
	private int getPercentageComplete(@OriginalArg(1) int group) {
		if (this.isGroupValid(group)) {
			return this.packed[group] == null ? this.provider.getPercentageComplete(group) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)Z")
	public boolean isFileReady(@OriginalArg(0) int id) {
		if (!this.isIndexReady()) {
			return false;
		} else if (this.index.groupCapacities.length == 1) {
			return this.isFileReady(0, id);
		} else if (!this.isGroupValid(id)) {
			return false;
		} else if (this.index.groupCapacities[id] == 1) {
			return this.isFileReady(id, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)I")
	public int getPercentageComplete() {
		if (!this.isIndexReady()) {
			return 0;
		}

		@Pc(18) int total = 0;
		@Pc(20) int complete = 0;
		for (@Pc(22) int i = 0; i < this.packed.length; i++) {
			if (this.index.groupSizes[i] > 0) {
				total += 100;
				complete += this.getPercentageComplete(i);
			}
		}

		if (total == 0) {
			return 100;
		} else {
			return complete * 100 / total;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "([IIII)[B")
	public byte[] fetchFile(@OriginalArg(3) int group, @OriginalArg(1) int file, @OriginalArg(0) int[] key) {
		if (!this.isFileValid(group, file)) {
			return null;
		}

		if (this.unpacked[group] == null || this.unpacked[group][file] == null) {
			@Pc(33) boolean success = this.unpackGroup(key, file, group);
			if (!success) {
				this.fetchGroup(group);

				success = this.unpackGroup(key, file, group);
				if (!success) {
					return null;
				}
			}
		}

		@Pc(61) byte[] src = ByteArray.unwrap(this.unpacked[group][file], false);
		if (this.discardUnpacked == 1) {
			this.unpacked[group][file] = null;
			if (this.index.groupCapacities[group] == 1) {
				this.unpacked[group] = null;
			}
		} else if (this.discardUnpacked == 2) {
			this.unpacked[group] = null;
		}

		return src;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIB)Z")
	private boolean isFileValid(@OriginalArg(1) int group, @OriginalArg(0) int file) {
		if (!this.isIndexReady()) {
			return false;
		} else if (group >= 0 && file >= 0 && group < this.index.groupCapacities.length && this.index.groupCapacities[group] > file) {
			return true;
		} else if (RAISE_EXCEPTIONS) {
			throw new IllegalArgumentException(group + "," + file);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[III)Z")
	private boolean unpackGroup(@OriginalArg(1) int[] key, @OriginalArg(2) int arg1, @OriginalArg(3) int group) {
		if (!this.isGroupValid(group)) {
			return false;
		} else if (this.packed[group] == null) {
			return false;
		} else {
			@Pc(32) int fileIds = this.index.groupSizes[group];
			@Pc(38) int[] groupSize = this.index.fileIds[group];
			if (this.unpacked[group] == null) {
				this.unpacked[group] = new Object[this.index.groupCapacities[group]];
			}

			@Pc(60) Object[] unpacked = this.unpacked[group];
			@Pc(62) boolean valid = true;
			for (@Pc(64) int i = 0; i < fileIds; i++) {
				@Pc(71) int fileId;
				if (groupSize == null) {
					fileId = i;
				} else {
					fileId = groupSize[i];
				}
				if (unpacked[fileId] == null) {
					valid = false;
					break;
				}
			}

			if (valid) {
				return true;
			}

			@Pc(138) byte[] compressed;
			if (key == null || key[0] == 0 && key[1] == 0 && key[2] == 0 && key[3] == 0) {
				compressed = ByteArray.unwrap(this.packed[group], false);
			} else {
				compressed = ByteArray.unwrap(this.packed[group], true);
				@Pc(152) Packet buf = new Packet(compressed);
				buf.tinydec(key, buf.data.length);
			}

			@Pc(164) byte[] uncompressed;
			try {
				uncompressed = Js5Compression.uncompress(compressed);
			} catch (@Pc(166) RuntimeException ex) {
				throw TracingException.report(ex, "T3 - " + (key != null) + "," + group + "," + compressed.length + "," + Static591.method7758(compressed.length, compressed) + "," + Static591.method7758(compressed.length - 2, compressed) + "," + this.index.groupChecksums[group] + "," + this.index.checksum);
			}

			if (this.discardPacked) {
				this.packed[group] = null;
			}

			@Pc(243) int local243;
            if (fileIds > 1) {
                @Pc(279) int local279;
                @Pc(292) Packet local292;
                @Pc(300) int local300;
                @Pc(303) int local303;
                @Pc(305) int local305;
                @Pc(363) int local363;
                @Pc(365) int local365;
                @Pc(368) int local368;
                @Pc(370) int local370;
                if (this.discardUnpacked == 2) {
                    local243 = uncompressed.length;
                    local243--;
                    local279 = uncompressed[local243] & 0xFF;
                    local243 -= local279 * fileIds * 4;
                    local292 = new Packet(uncompressed);
                    @Pc(474) int local474 = 0;
                    local292.pos = local243;
                    local300 = 0;
                    for (local303 = 0; local303 < local279; local303++) {
                        local305 = 0;
                        for (local363 = 0; local363 < fileIds; local363++) {
                            local305 += local292.g4();
                            if (groupSize == null) {
                                local365 = local363;
                            } else {
                                local365 = groupSize[local363];
                            }
                            if (arg1 == local365) {
                                local300 = local365;
                                local474 += local305;
                            }
                        }
                    }
                    if (local474 == 0) {
                        return true;
                    }
                    @Pc(539) byte[] local539 = new byte[local474];
                    local292.pos = local243;
                    local474 = 0;
                    local363 = 0;
                    for (local365 = 0; local365 < local279; local365++) {
                        local368 = 0;
                        for (local370 = 0; local370 < fileIds; local370++) {
                            local368 += local292.g4();
                            @Pc(566) int local566;
                            if (groupSize == null) {
                                local566 = local370;
                            } else {
                                local566 = groupSize[local370];
                            }
                            if (local566 == arg1) {
                                Static734.method7694(uncompressed, local363, local539, local474, local368);
                                local474 += local368;
                            }
                            local363 += local368;
                        }
                    }
                    unpacked[local300] = local539;
                } else {
                    local243 = uncompressed.length;
                    local243--;
                    local279 = uncompressed[local243] & 0xFF;
                    local243 -= local279 * fileIds * 4;
                    local292 = new Packet(uncompressed);
                    local292.pos = local243;
                    @Pc(298) int[] local298 = new int[fileIds];
                    for (local300 = 0; local300 < local279; local300++) {
                        local303 = 0;
                        for (local305 = 0; local305 < fileIds; local305++) {
                            local303 += local292.g4();
                            local298[local305] += local303;
                        }
                    }
                    @Pc(336) byte[][] local336 = new byte[fileIds][];
                    for (local305 = 0; local305 < fileIds; local305++) {
                        local336[local305] = new byte[local298[local305]];
                        local298[local305] = 0;
                    }
                    local292.pos = local243;
                    local363 = 0;
                    for (local365 = 0; local365 < local279; local365++) {
                        local368 = 0;
                        for (local370 = 0; local370 < fileIds; local370++) {
                            local368 += local292.g4();
                            Static734.method7694(uncompressed, local363, local336[local370], local298[local370], local368);
                            local298[local370] += local368;
                            local363 += local368;
                        }
                    }
                    for (local368 = 0; local368 < fileIds; local368++) {
                        if (groupSize == null) {
                            local370 = local368;
                        } else {
                            local370 = groupSize[local368];
                        }
                        if (this.discardUnpacked == 0) {
                            unpacked[local370] = ByteArray.wrap(local336[local368]);
                        } else {
                            unpacked[local370] = local336[local368];
                        }
                    }
                }
            } else {
                if (groupSize == null) {
                    local243 = 0;
                } else {
                    local243 = groupSize[0];
                }
                if (this.discardUnpacked == 0) {
                    unpacked[local243] = ByteArray.wrap(uncompressed);
                } else {
                    unpacked[local243] = uncompressed;
                }
            }
            return true;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)Z")
	public boolean isFileReady(@OriginalArg(1) int group, @OriginalArg(0) int file) {
		if (!this.isFileValid(group, file)) {
			return false;
		} else if (this.unpacked[group] != null && this.unpacked[group][file] != null) {
			return true;
		} else if (this.packed[group] == null) {
			this.fetchGroup(group);
			return this.packed[group] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean isGroupNameVaild(@OriginalArg(0) String group) {
		if (this.isIndexReady()) {
			@Pc(21) String lower = group.toLowerCase();
			@Pc(30) int groupId = this.index.groupNameHashTable.get(StringUtils.hashCode(lower));
			return groupId >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)V")
	private void prefetchGroup(@OriginalArg(1) int group) {
		this.provider.prefetchGroup(group);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(BI)[B")
	public byte[] fetchFile(@OriginalArg(1) int id) {
		if (!this.isIndexReady()) {
			return null;
		} else if (this.index.groupCapacities.length == 1) {
			return this.fetchFile(0, id);
		} else if (!this.isGroupValid(id)) {
			return null;
		} else if (this.index.groupCapacities[id] == 1) {
			return this.fetchFile(id, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int getGroupId(@OriginalArg(0) String group) {
		if (this.isIndexReady()) {
			@Pc(19) String lower = group.toLowerCase();
			@Pc(28) int groupId = this.index.groupNameHashTable.get(StringUtils.hashCode(lower));
			return this.isGroupValid(groupId) ? groupId : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)Z")
	public boolean fetchAll() {
		if (!this.isIndexReady()) {
			return false;
		}

		@Pc(24) boolean success = true;
		for (@Pc(26) int i = 0; i < this.index.groupIds.length; i++) {
			@Pc(36) int groupId = this.index.groupIds[i];
			if (this.packed[groupId] == null) {
				this.fetchGroup(groupId);

				if (this.packed[groupId] == null) {
					success = false;
				}
			}
		}

		return success;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
	public void discardUnpacked() {
		if (this.unpacked != null) {
			for (@Pc(4) int i = 0; i < this.unpacked.length; i++) {
				this.unpacked[i] = null;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(BLjava/lang/String;)I")
	public int getPercentageComplete(@OriginalArg(1) String group) {
		if (this.isIndexReady()) {
			@Pc(24) String lwoer = group.toLowerCase();
			@Pc(33) int groupId = this.index.groupNameHashTable.get(StringUtils.hashCode(lwoer));
			return this.getPercentageComplete(groupId);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public void discardPacked() {
		if (this.packed != null) {
			for (@Pc(18) int i = 0; i < this.packed.length; i++) {
				this.packed[i] = null;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZII)[B")
	public byte[] fetchFile(@OriginalArg(2) int group, @OriginalArg(1) int file) {
		return this.fetchFile(group, file, null);
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(BI)Z")
	private boolean isGroupValid(@OriginalArg(1) int group) {
		if (!this.isIndexReady()) {
			return false;
		} else if (group >= 0 && group < this.index.groupCapacities.length && this.index.groupCapacities[group] != 0) {
			return true;
		} else if (RAISE_EXCEPTIONS) {
			throw new IllegalArgumentException(Integer.toString(group));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)I")
	public int capacity() {
		return this.isIndexReady() ? this.index.groupCapacities.length : -1;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean isGroupReady(@OriginalArg(0) String group) {
		if (this.isIndexReady()) {
			@Pc(13) String lower = group.toLowerCase();
			@Pc(22) int groupId = this.index.groupNameHashTable.get(StringUtils.hashCode(lower));
			return this.isGroupReady(groupId);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)I")
	public int getGroupId(@OriginalArg(1) int groupNameHash) {
		if (this.isIndexReady()) {
			@Pc(17) int groupId = this.index.groupNameHashTable.get(groupNameHash);
			return this.isGroupValid(groupId) ? groupId : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] fetchFile(@OriginalArg(0) String group, @OriginalArg(1) String file) {
		if (!this.isIndexReady()) {
			return null;
		}

		@Pc(13) String groupLower = group.toLowerCase();
		@Pc(16) String fileLower = file.toLowerCase();
		@Pc(25) int groupId = this.index.groupNameHashTable.get(StringUtils.hashCode(groupLower));
		if (this.isGroupValid(groupId)) {
			@Pc(53) int fileId = this.index.fileNameHashTable[groupId].get(StringUtils.hashCode(fileLower));
			return this.fetchFile(groupId, fileId);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)Z")
	private boolean isIndexReady() {
		if (this.index == null) {
			this.index = this.provider.fetchIndex();
			if (this.index == null) {
				return false;
			}
			this.unpacked = new Object[this.index.capacity][];
			this.packed = new Object[this.index.capacity];
		}
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(Ljava/lang/String;I)V")
	public void prefetchGroup(@OriginalArg(0) String group) {
		if (this.isIndexReady()) {
			@Pc(12) String groupLower = group.toLowerCase();
			@Pc(29) int groupId = this.index.groupNameHashTable.get(StringUtils.hashCode(groupLower));
			this.prefetchGroup(groupId);
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(II)[I")
	public int[] getFileIds(@OriginalArg(0) int group) {
		if (!this.isGroupValid(group)) {
			return null;
		}
		@Pc(17) int[] fileIds = this.index.fileIds[group];
		if (fileIds == null) {
			fileIds = new int[this.index.groupSizes[group]];
			@Pc(28) int i = 0;
			while (i < fileIds.length) {
				fileIds[i] = i++;
			}
		}
		return fileIds;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)Z")
	private boolean isFileReady(@OriginalArg(1) String group, @OriginalArg(2) String file) {
		if (!this.isIndexReady()) {
			return false;
		}

		@Pc(13) String groupLower = group.toLowerCase();
		@Pc(16) String fileLower = file.toLowerCase();
		@Pc(25) int groupId = this.index.groupNameHashTable.get(StringUtils.hashCode(groupLower));
		if (this.isGroupValid(groupId)) {
			@Pc(44) int fileId = this.index.fileNameHashTable[groupId].get(StringUtils.hashCode(fileLower));
			return this.isFileReady(groupId, fileId);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(BI)V")
	public void discardUnpacked(@OriginalArg(1) int group) {
		if (this.isGroupValid(group) && this.unpacked != null) {
			this.unpacked[group] = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)Z")
	public boolean isGroupReady(@OriginalArg(1) int group) {
		if (!this.isGroupValid(group)) {
			return false;
		} else if (this.packed[group] == null) {
			this.fetchGroup(group);
			return this.packed[group] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
	public int getGroupCapacity(@OriginalArg(1) int group) {
		return this.isGroupValid(group) ? this.index.groupCapacities[group] : 0;
	}
}
