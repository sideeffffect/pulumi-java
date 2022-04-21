// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OpenZfsFileSystemDiskIopsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenZfsFileSystemDiskIopsConfigurationArgs Empty = new OpenZfsFileSystemDiskIopsConfigurationArgs();

    /**
     * - The total number of SSD IOPS provisioned for the file system.
     * 
     */
    @Import(name="iops")
    private @Nullable Output<Integer> iops;

    public Optional<Output<Integer>> iops() {
        return Optional.ofNullable(this.iops);
    }

    /**
     * - Specifies whether the number of IOPS for the file system is using the system. Valid values are `AUTOMATIC` and `USER_PROVISIONED`. Default value is `AUTOMATIC`.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    private OpenZfsFileSystemDiskIopsConfigurationArgs() {}

    private OpenZfsFileSystemDiskIopsConfigurationArgs(OpenZfsFileSystemDiskIopsConfigurationArgs $) {
        this.iops = $.iops;
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenZfsFileSystemDiskIopsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenZfsFileSystemDiskIopsConfigurationArgs $;

        public Builder() {
            $ = new OpenZfsFileSystemDiskIopsConfigurationArgs();
        }

        public Builder(OpenZfsFileSystemDiskIopsConfigurationArgs defaults) {
            $ = new OpenZfsFileSystemDiskIopsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder iops(@Nullable Output<Integer> iops) {
            $.iops = iops;
            return this;
        }

        public Builder iops(Integer iops) {
            return iops(Output.of(iops));
        }

        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public OpenZfsFileSystemDiskIopsConfigurationArgs build() {
            return $;
        }
    }

}
