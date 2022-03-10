// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Contains all the secrets of a Disk.
 * 
 */
public final class DiskSecretResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiskSecretResponse Empty = new DiskSecretResponse();

    /**
     * Bit Locker key of the disk which can be used to unlock the disk to copy data.
     * 
     */
    @InputImport(name="bitLockerKey", required=true)
      private final String bitLockerKey;

    public String getBitLockerKey() {
        return this.bitLockerKey;
    }

    /**
     * Serial number of the assigned disk.
     * 
     */
    @InputImport(name="diskSerialNumber", required=true)
      private final String diskSerialNumber;

    public String getDiskSerialNumber() {
        return this.diskSerialNumber;
    }

    public DiskSecretResponse(
        String bitLockerKey,
        String diskSerialNumber) {
        this.bitLockerKey = Objects.requireNonNull(bitLockerKey, "expected parameter 'bitLockerKey' to be non-null");
        this.diskSerialNumber = Objects.requireNonNull(diskSerialNumber, "expected parameter 'diskSerialNumber' to be non-null");
    }

    private DiskSecretResponse() {
        this.bitLockerKey = null;
        this.diskSerialNumber = null;
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

        public Builder bitLockerKey(String bitLockerKey) {
            this.bitLockerKey = Objects.requireNonNull(bitLockerKey);
            return this;
        }

        public Builder diskSerialNumber(String diskSerialNumber) {
            this.diskSerialNumber = Objects.requireNonNull(diskSerialNumber);
            return this;
        }
        public DiskSecretResponse build() {
            return new DiskSecretResponse(bitLockerKey, diskSerialNumber);
        }
    }
}
