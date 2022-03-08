// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DiskSecretResponse {
    /**
     * Bit Locker key of the disk which can be used to unlock the disk to copy data.
     * 
     */
    private final String bitLockerKey;
    /**
     * Serial number of the assigned disk.
     * 
     */
    private final String diskSerialNumber;

    @OutputCustomType.Constructor({"bitLockerKey","diskSerialNumber"})
    private DiskSecretResponse(
        String bitLockerKey,
        String diskSerialNumber) {
        this.bitLockerKey = bitLockerKey;
        this.diskSerialNumber = diskSerialNumber;
    }

    /**
     * Bit Locker key of the disk which can be used to unlock the disk to copy data.
     * 
    */
    public String getBitLockerKey() {
        return this.bitLockerKey;
    }
    /**
     * Serial number of the assigned disk.
     * 
    */
    public String getDiskSerialNumber() {
        return this.diskSerialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskSecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bitLockerKey;
        private String diskSerialNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskSecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitLockerKey = defaults.bitLockerKey;
    	      this.diskSerialNumber = defaults.diskSerialNumber;
        }

        public Builder setBitLockerKey(String bitLockerKey) {
            this.bitLockerKey = Objects.requireNonNull(bitLockerKey);
            return this;
        }

        public Builder setDiskSerialNumber(String diskSerialNumber) {
            this.diskSerialNumber = Objects.requireNonNull(diskSerialNumber);
            return this;
        }
        public DiskSecretResponse build() {
            return new DiskSecretResponse(bitLockerKey, diskSerialNumber);
        }
    }
}
