// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains encryption settings for a data disk image.
 * 
 */
public final class DataDiskImageEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataDiskImageEncryptionArgs Empty = new DataDiskImageEncryptionArgs();

    /**
     * A relative URI containing the resource ID of the disk encryption set.
     * 
     */
    @Import(name="diskEncryptionSetId")
    private @Nullable Output<String> diskEncryptionSetId;

    public Optional<Output<String>> diskEncryptionSetId() {
        return Optional.ofNullable(this.diskEncryptionSetId);
    }

    /**
     * This property specifies the logical unit number of the data disk. This value is used to identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
     * 
     */
    @Import(name="lun", required=true)
    private Output<Integer> lun;

    public Output<Integer> lun() {
        return this.lun;
    }

    private DataDiskImageEncryptionArgs() {}

    private DataDiskImageEncryptionArgs(DataDiskImageEncryptionArgs $) {
        this.diskEncryptionSetId = $.diskEncryptionSetId;
        this.lun = $.lun;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataDiskImageEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataDiskImageEncryptionArgs $;

        public Builder() {
            $ = new DataDiskImageEncryptionArgs();
        }

        public Builder(DataDiskImageEncryptionArgs defaults) {
            $ = new DataDiskImageEncryptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder diskEncryptionSetId(@Nullable Output<String> diskEncryptionSetId) {
            $.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }

        public Builder diskEncryptionSetId(String diskEncryptionSetId) {
            return diskEncryptionSetId(Output.of(diskEncryptionSetId));
        }

        public Builder lun(Output<Integer> lun) {
            $.lun = lun;
            return this;
        }

        public Builder lun(Integer lun) {
            return lun(Output.of(lun));
        }

        public DataDiskImageEncryptionArgs build() {
            $.lun = Objects.requireNonNull($.lun, "expected parameter 'lun' to be non-null");
            return $;
        }
    }

}
