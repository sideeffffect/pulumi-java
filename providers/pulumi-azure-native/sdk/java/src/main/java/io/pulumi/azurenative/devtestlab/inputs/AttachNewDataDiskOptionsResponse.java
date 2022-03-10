// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties to attach new disk to the Virtual Machine.
 * 
 */
public final class AttachNewDataDiskOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AttachNewDataDiskOptionsResponse Empty = new AttachNewDataDiskOptionsResponse();

    /**
     * The name of the disk to be attached.
     * 
     */
    @InputImport(name="diskName")
      private final @Nullable String diskName;

    public Optional<String> getDiskName() {
        return this.diskName == null ? Optional.empty() : Optional.ofNullable(this.diskName);
    }

    /**
     * Size of the disk to be attached in Gibibytes.
     * 
     */
    @InputImport(name="diskSizeGiB")
      private final @Nullable Integer diskSizeGiB;

    public Optional<Integer> getDiskSizeGiB() {
        return this.diskSizeGiB == null ? Optional.empty() : Optional.ofNullable(this.diskSizeGiB);
    }

    /**
     * The storage type for the disk (i.e. Standard, Premium).
     * 
     */
    @InputImport(name="diskType")
      private final @Nullable String diskType;

    public Optional<String> getDiskType() {
        return this.diskType == null ? Optional.empty() : Optional.ofNullable(this.diskType);
    }

    public AttachNewDataDiskOptionsResponse(
        @Nullable String diskName,
        @Nullable Integer diskSizeGiB,
        @Nullable String diskType) {
        this.diskName = diskName;
        this.diskSizeGiB = diskSizeGiB;
        this.diskType = diskType;
    }

    private AttachNewDataDiskOptionsResponse() {
        this.diskName = null;
        this.diskSizeGiB = null;
        this.diskType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachNewDataDiskOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String diskName;
        private @Nullable Integer diskSizeGiB;
        private @Nullable String diskType;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachNewDataDiskOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskName = defaults.diskName;
    	      this.diskSizeGiB = defaults.diskSizeGiB;
    	      this.diskType = defaults.diskType;
        }

        public Builder diskName(@Nullable String diskName) {
            this.diskName = diskName;
            return this;
        }

        public Builder diskSizeGiB(@Nullable Integer diskSizeGiB) {
            this.diskSizeGiB = diskSizeGiB;
            return this;
        }

        public Builder diskType(@Nullable String diskType) {
            this.diskType = diskType;
            return this;
        }
        public AttachNewDataDiskOptionsResponse build() {
            return new AttachNewDataDiskOptionsResponse(diskName, diskSizeGiB, diskType);
        }
    }
}
