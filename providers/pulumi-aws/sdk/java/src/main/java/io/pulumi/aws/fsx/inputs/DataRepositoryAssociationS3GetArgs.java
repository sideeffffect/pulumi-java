// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.aws.fsx.inputs.DataRepositoryAssociationS3AutoExportPolicyGetArgs;
import io.pulumi.aws.fsx.inputs.DataRepositoryAssociationS3AutoImportPolicyGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataRepositoryAssociationS3GetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataRepositoryAssociationS3GetArgs Empty = new DataRepositoryAssociationS3GetArgs();

    /**
     * Specifies the type of updated objects that will be automatically exported from your file system to the linked S3 bucket. See the `events` configuration block.
     * 
     */
    @Import(name="autoExportPolicy")
      private final @Nullable Output<DataRepositoryAssociationS3AutoExportPolicyGetArgs> autoExportPolicy;

    public Output<DataRepositoryAssociationS3AutoExportPolicyGetArgs> autoExportPolicy() {
        return this.autoExportPolicy == null ? Codegen.empty() : this.autoExportPolicy;
    }

    /**
     * Specifies the type of updated objects that will be automatically imported from the linked S3 bucket to your file system. See the `events` configuration block.
     * 
     */
    @Import(name="autoImportPolicy")
      private final @Nullable Output<DataRepositoryAssociationS3AutoImportPolicyGetArgs> autoImportPolicy;

    public Output<DataRepositoryAssociationS3AutoImportPolicyGetArgs> autoImportPolicy() {
        return this.autoImportPolicy == null ? Codegen.empty() : this.autoImportPolicy;
    }

    public DataRepositoryAssociationS3GetArgs(
        @Nullable Output<DataRepositoryAssociationS3AutoExportPolicyGetArgs> autoExportPolicy,
        @Nullable Output<DataRepositoryAssociationS3AutoImportPolicyGetArgs> autoImportPolicy) {
        this.autoExportPolicy = autoExportPolicy;
        this.autoImportPolicy = autoImportPolicy;
    }

    private DataRepositoryAssociationS3GetArgs() {
        this.autoExportPolicy = Codegen.empty();
        this.autoImportPolicy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataRepositoryAssociationS3GetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DataRepositoryAssociationS3AutoExportPolicyGetArgs> autoExportPolicy;
        private @Nullable Output<DataRepositoryAssociationS3AutoImportPolicyGetArgs> autoImportPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(DataRepositoryAssociationS3GetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoExportPolicy = defaults.autoExportPolicy;
    	      this.autoImportPolicy = defaults.autoImportPolicy;
        }

        public Builder autoExportPolicy(@Nullable Output<DataRepositoryAssociationS3AutoExportPolicyGetArgs> autoExportPolicy) {
            this.autoExportPolicy = autoExportPolicy;
            return this;
        }
        public Builder autoExportPolicy(@Nullable DataRepositoryAssociationS3AutoExportPolicyGetArgs autoExportPolicy) {
            this.autoExportPolicy = Codegen.ofNullable(autoExportPolicy);
            return this;
        }
        public Builder autoImportPolicy(@Nullable Output<DataRepositoryAssociationS3AutoImportPolicyGetArgs> autoImportPolicy) {
            this.autoImportPolicy = autoImportPolicy;
            return this;
        }
        public Builder autoImportPolicy(@Nullable DataRepositoryAssociationS3AutoImportPolicyGetArgs autoImportPolicy) {
            this.autoImportPolicy = Codegen.ofNullable(autoImportPolicy);
            return this;
        }        public DataRepositoryAssociationS3GetArgs build() {
            return new DataRepositoryAssociationS3GetArgs(autoExportPolicy, autoImportPolicy);
        }
    }
}
