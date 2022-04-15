// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLoggingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLoggingGetArgs Empty = new BucketLoggingGetArgs();

    /**
     * The name of the bucket that will receive the log objects.
     * 
     */
    @Import(name="targetBucket", required=true)
      private final Output<String> targetBucket;

    public Output<String> targetBucket() {
        return this.targetBucket;
    }

    /**
     * To specify a key prefix for log objects.
     * 
     */
    @Import(name="targetPrefix")
      private final @Nullable Output<String> targetPrefix;

    public Output<String> targetPrefix() {
        return this.targetPrefix == null ? Codegen.empty() : this.targetPrefix;
    }

    public BucketLoggingGetArgs(
        Output<String> targetBucket,
        @Nullable Output<String> targetPrefix) {
        this.targetBucket = Objects.requireNonNull(targetBucket, "expected parameter 'targetBucket' to be non-null");
        this.targetPrefix = targetPrefix;
    }

    private BucketLoggingGetArgs() {
        this.targetBucket = Codegen.empty();
        this.targetPrefix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLoggingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> targetBucket;
        private @Nullable Output<String> targetPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLoggingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetBucket = defaults.targetBucket;
    	      this.targetPrefix = defaults.targetPrefix;
        }

        public Builder targetBucket(Output<String> targetBucket) {
            this.targetBucket = Objects.requireNonNull(targetBucket);
            return this;
        }
        public Builder targetBucket(String targetBucket) {
            this.targetBucket = Output.of(Objects.requireNonNull(targetBucket));
            return this;
        }
        public Builder targetPrefix(@Nullable Output<String> targetPrefix) {
            this.targetPrefix = targetPrefix;
            return this;
        }
        public Builder targetPrefix(@Nullable String targetPrefix) {
            this.targetPrefix = Codegen.ofNullable(targetPrefix);
            return this;
        }        public BucketLoggingGetArgs build() {
            return new BucketLoggingGetArgs(targetBucket, targetPrefix);
        }
    }
}
