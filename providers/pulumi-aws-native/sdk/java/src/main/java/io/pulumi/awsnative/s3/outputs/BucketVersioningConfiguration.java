// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.enums.BucketVersioningConfigurationStatus;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class BucketVersioningConfiguration {
    /**
     * The versioning state of the bucket.
     * 
     */
    private final BucketVersioningConfigurationStatus status;

    @OutputCustomType.Constructor({"status"})
    private BucketVersioningConfiguration(BucketVersioningConfigurationStatus status) {
        this.status = status;
    }

    /**
     * The versioning state of the bucket.
     * 
    */
    public BucketVersioningConfigurationStatus getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketVersioningConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketVersioningConfigurationStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketVersioningConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder setStatus(BucketVersioningConfigurationStatus status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public BucketVersioningConfiguration build() {
            return new BucketVersioningConfiguration(status);
        }
    }
}
