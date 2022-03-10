// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.outputs;

import io.pulumi.aws.signer.outputs.SigningJobDestinationS3;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class SigningJobDestination {
    /**
     * A configuration block describing the S3 Destination object: See S3 Destination below for details.
     * 
     */
    private final SigningJobDestinationS3 s3;

    @OutputCustomType.Constructor
    private SigningJobDestination(@OutputCustomType.Parameter("s3") SigningJobDestinationS3 s3) {
        this.s3 = s3;
    }

    /**
     * A configuration block describing the S3 Destination object: See S3 Destination below for details.
     * 
    */
    public SigningJobDestinationS3 getS3() {
        return this.s3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SigningJobDestinationS3 s3;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3 = defaults.s3;
        }

        public Builder s3(SigningJobDestinationS3 s3) {
            this.s3 = Objects.requireNonNull(s3);
            return this;
        }
        public SigningJobDestination build() {
            return new SigningJobDestination(s3);
        }
    }
}
