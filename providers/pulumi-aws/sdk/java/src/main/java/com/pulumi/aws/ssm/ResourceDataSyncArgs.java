// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm;

import com.pulumi.aws.ssm.inputs.ResourceDataSyncS3DestinationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceDataSyncArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceDataSyncArgs Empty = new ResourceDataSyncArgs();

    /**
     * Name for the configuration.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Amazon S3 configuration details for the sync.
     * 
     */
    @Import(name="s3Destination", required=true)
      private final Output<ResourceDataSyncS3DestinationArgs> s3Destination;

    public Output<ResourceDataSyncS3DestinationArgs> s3Destination() {
        return this.s3Destination;
    }

    public ResourceDataSyncArgs(
        @Nullable Output<String> name,
        Output<ResourceDataSyncS3DestinationArgs> s3Destination) {
        this.name = name;
        this.s3Destination = Objects.requireNonNull(s3Destination, "expected parameter 's3Destination' to be non-null");
    }

    private ResourceDataSyncArgs() {
        this.name = Codegen.empty();
        this.s3Destination = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceDataSyncArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private Output<ResourceDataSyncS3DestinationArgs> s3Destination;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceDataSyncArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.s3Destination = defaults.s3Destination;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder s3Destination(Output<ResourceDataSyncS3DestinationArgs> s3Destination) {
            this.s3Destination = Objects.requireNonNull(s3Destination);
            return this;
        }
        public Builder s3Destination(ResourceDataSyncS3DestinationArgs s3Destination) {
            this.s3Destination = Output.of(Objects.requireNonNull(s3Destination));
            return this;
        }        public ResourceDataSyncArgs build() {
            return new ResourceDataSyncArgs(name, s3Destination);
        }
    }
}
