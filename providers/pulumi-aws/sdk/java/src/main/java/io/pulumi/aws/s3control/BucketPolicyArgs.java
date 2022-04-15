// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class BucketPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketPolicyArgs Empty = new BucketPolicyArgs();

    /**
     * Amazon Resource Name (ARN) of the bucket.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * JSON string of the resource policy.
     * 
     */
    @Import(name="policy", required=true)
      private final Output<String> policy;

    public Output<String> policy() {
        return this.policy;
    }

    public BucketPolicyArgs(
        Output<String> bucket,
        Output<String> policy) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
    }

    private BucketPolicyArgs() {
        this.bucket = Codegen.empty();
        this.policy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private Output<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.policy = defaults.policy;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }
        public Builder policy(Output<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder policy(String policy) {
            this.policy = Output.of(Objects.requireNonNull(policy));
            return this;
        }        public BucketPolicyArgs build() {
            return new BucketPolicyArgs(bucket, policy);
        }
    }
}
