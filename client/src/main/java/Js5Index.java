import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Js5Index {

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "[I")
	public int[] groupCapacities;

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "[I")
	public int[] groupNameHashes;

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "[Lclient!eha;")
	public IntHashTable[] fileNameHashTable;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "[[I")
	public int[][] fileIds;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
	public int version;

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "[I")
	public int[] groupVersions;

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
	public int size;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "[I")
	public int[] groupSizes;

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
	public int capacity;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "[[B")
	public byte[][] groupDigests;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "[I")
	public int[] groupChecksums;

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "[I")
	public int[] groupIds;

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "Lclient!eha;")
	public IntHashTable groupNameHashTable;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "[[I")
	public int[][] fileNameHashes;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
	public final int checksum;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "[B")
	private byte[] aByteArray86;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "([BI[B)V")
	public Js5Index(@OriginalArg(0) byte[] src, @OriginalArg(1) int checksum, @OriginalArg(2) byte[] arg2) {
		this.checksum = Static591.method7758(src.length, src);
		if (checksum != this.checksum) {
			throw new RuntimeException();
		}

		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}

			this.aByteArray86 = Static607.method8161(src, src.length, 0);
			for (@Pc(45) int i = 0; i < 64; i++) {
				if (arg2[i] != this.aByteArray86[i]) {
					throw new RuntimeException();
				}
			}
		}

		this.decode(src);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([BZ)V")
	private void decode(@OriginalArg(0) byte[] src) {
		@Pc(12) Packet buf = new Packet(Js5Compression.uncompress(src));
		@Pc(16) int version = buf.g1();
		if (version < 5 || version > 7) {
			throw new RuntimeException();
		}

		if (version >= 6) {
			this.version = buf.g4();
		} else {
			this.version = 0;
		}

		@Pc(54) int flags = buf.g1();
		@Pc(63) boolean hasNames = (flags & 0x1) != 0;
		@Pc(75) boolean hasDigests = (flags & 0x2) != 0;

		if (version >= 7) {
			this.size = buf.gSmart2or4();
		} else {
			this.size = buf.g2();
		}

		@Pc(101) int prevFileId = 0;
		@Pc(103) int maxGroupId = -1;
		this.groupIds = new int[this.size];

		if (version >= 7) {
			for (int i = 0; i < this.size; i++) {
				this.groupIds[i] = prevFileId += buf.gSmart2or4();
				if (this.groupIds[i] > maxGroupId) {
					maxGroupId = this.groupIds[i];
				}
			}
		} else {
			for (int i = 0; i < this.size; i++) {
				this.groupIds[i] = prevFileId += buf.g2();
				if (maxGroupId < this.groupIds[i]) {
					maxGroupId = this.groupIds[i];
				}
			}
		}

		this.capacity = maxGroupId + 1;
		this.groupChecksums = new int[this.capacity];

		if (hasDigests) {
			this.groupDigests = new byte[this.capacity][];
		}

		this.groupVersions = new int[this.capacity];
		this.groupCapacities = new int[this.capacity];
		this.groupSizes = new int[this.capacity];
		this.fileIds = new int[this.capacity][];

		if (hasNames) {
			this.groupNameHashes = new int[this.capacity];

			for (int i = 0; i < this.capacity; i++) {
				this.groupNameHashes[i] = -1;
			}

			for (int i = 0; i < this.size; i++) {
				this.groupNameHashes[this.groupIds[i]] = buf.g4();
			}

			this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
		}

		for (int i = 0; i < this.size; i++) {
			this.groupChecksums[this.groupIds[i]] = buf.g4();
		}

		if (hasDigests) {
			for (int i = 0; i < this.size; i++) {
				@Pc(339) byte[] digest = new byte[64];
				buf.gdata(digest, 0, 64);
				this.groupDigests[this.groupIds[i]] = digest;
			}
		}

		for (int i = 0; i < this.size; i++) {
			this.groupVersions[this.groupIds[i]] = buf.g4();
		}

		if (version < 7) {
			for (int i = 0; i < this.size; i++) {
				this.groupSizes[this.groupIds[i]] = buf.g2();
			}

			for (int i = 0; i < this.size; i++) {
				int groupId = this.groupIds[i];
				prevFileId = 0;
				int groupSize = this.groupSizes[groupId];
				int maxFileId = -1;

				this.fileIds[groupId] = new int[groupSize];
				for (int j = 0; j < groupSize; j++) {
					int fileId = this.fileIds[groupId][j] = prevFileId += buf.g2();
					if (maxFileId < fileId) {
						maxFileId = fileId;
					}
				}

				this.groupCapacities[groupId] = maxFileId + 1;
				if (groupSize == maxFileId + 1) {
					this.fileIds[groupId] = null;
				}
			}
		} else {
			for (int i = 0; i < this.size; i++) {
				this.groupSizes[this.groupIds[i]] = buf.gSmart2or4();
			}

			for (int i = 0; i < this.size; i++) {
				int groupId = this.groupIds[i];
				int groupSize = this.groupSizes[groupId];
				prevFileId = 0;
				int maxFileID = -1;

				this.fileIds[groupId] = new int[groupSize];
				for (int j = 0; j < groupSize; j++) {
					int fileId = this.fileIds[groupId][j] = prevFileId += buf.gSmart2or4();
					if (fileId > maxFileID) {
						maxFileID = fileId;
					}
				}

				this.groupCapacities[groupId] = maxFileID + 1;
				if (maxFileID + 1 == groupSize) {
					this.fileIds[groupId] = null;
				}
			}
		}

        if (hasNames) {
            this.fileNameHashTable = new IntHashTable[maxGroupId + 1];
            this.fileNameHashes = new int[maxGroupId + 1][];

            for (int i = 0; i < this.size; i++) {
				int groupId = this.groupIds[i];
				int groupSize = this.groupSizes[groupId];

                this.fileNameHashes[groupId] = new int[this.groupCapacities[groupId]];
                for (int fileId = 0; fileId < this.groupCapacities[groupId]; fileId++) {
                    this.fileNameHashes[groupId][fileId] = -1;
                }

                for (int j = 0; j < groupSize; j++) {
					int fileId;
					if (this.fileIds[groupId] == null) {
                        fileId = j;
                    } else {
                        fileId = this.fileIds[groupId][j];
                    }

                    this.fileNameHashes[groupId][fileId] = buf.g4();
                }

                this.fileNameHashTable[groupId] = new IntHashTable(this.fileNameHashes[groupId]);
            }
        }
    }
}
