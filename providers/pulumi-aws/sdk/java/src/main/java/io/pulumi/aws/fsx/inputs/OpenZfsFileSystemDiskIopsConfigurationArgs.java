// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OpenZfsFileSystemDiskIopsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenZfsFileSystemDiskIopsConfigurationArgs Empty = new OpenZfsFileSystemDiskIopsConfigurationArgs();

    /**
     * - The total number of SSD IOPS provisioned for the file system.
     * 
     */
    @Import(name="iops")
      private final @Nullable Output<Integer> iops;

    public Output<Integer> iops() {
        return this.iops == null ? Codegen.empty() : this.iops;
    }

    /**
     * - Specifies whether the number of IOPS for the file system is using the system. Valid values are `AUTOMATIC` and `USER_PROVISIONED`. Default value is `AUTOMATIC`.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> mode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    public OpenZfsFileSystemDiskIopsConfigurationArgs(
        @Nullable Output<Integer> iops,
        @Nullable Output<String> mode) {
        this.iops = iops;
        this.mode = mode;
    }

    private OpenZfsFileSystemDiskIopsConfigurationArgs() {
        this.iops = Codegen.empty();
        this.mode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsFileSystemDiskIopsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> iops;
        private @Nullable Output<String> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenZfsFileSystemDiskIopsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iops = defaults.iops;
    	      this.mode = defaults.mode;
        }

        public Builder iops(@Nullable Output<Integer> iops) {
            this.iops = iops;
            return this;
        }
        public Builder iops(@Nullable Integer iops) {
            this.iops = Codegen.ofNullable(iops);
            return this;
        }
        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }        public OpenZfsFileSystemDiskIopsConfigurationArgs build() {
            return new OpenZfsFileSystemDiskIopsConfigurationArgs(iops, mode);
        }
    }
}
