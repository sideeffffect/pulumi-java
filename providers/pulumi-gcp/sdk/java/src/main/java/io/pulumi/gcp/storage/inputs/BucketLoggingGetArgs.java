// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLoggingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLoggingGetArgs Empty = new BucketLoggingGetArgs();

    /**
     * The bucket that will receive log objects.
     * 
     */
    @Import(name="logBucket", required=true)
      private final Output<String> logBucket;

    public Output<String> logBucket() {
        return this.logBucket;
    }

    /**
     * The object prefix for log objects. If it's not provided,
     * by default GCS sets this to this bucket's name.
     * 
     */
    @Import(name="logObjectPrefix")
      private final @Nullable Output<String> logObjectPrefix;

    public Output<String> logObjectPrefix() {
        return this.logObjectPrefix == null ? Codegen.empty() : this.logObjectPrefix;
    }

    public BucketLoggingGetArgs(
        Output<String> logBucket,
        @Nullable Output<String> logObjectPrefix) {
        this.logBucket = Objects.requireNonNull(logBucket, "expected parameter 'logBucket' to be non-null");
        this.logObjectPrefix = logObjectPrefix;
    }

    private BucketLoggingGetArgs() {
        this.logBucket = Codegen.empty();
        this.logObjectPrefix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLoggingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> logBucket;
        private @Nullable Output<String> logObjectPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLoggingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logBucket = defaults.logBucket;
    	      this.logObjectPrefix = defaults.logObjectPrefix;
        }

        public Builder logBucket(Output<String> logBucket) {
            this.logBucket = Objects.requireNonNull(logBucket);
            return this;
        }
        public Builder logBucket(String logBucket) {
            this.logBucket = Output.of(Objects.requireNonNull(logBucket));
            return this;
        }
        public Builder logObjectPrefix(@Nullable Output<String> logObjectPrefix) {
            this.logObjectPrefix = logObjectPrefix;
            return this;
        }
        public Builder logObjectPrefix(@Nullable String logObjectPrefix) {
            this.logObjectPrefix = Codegen.ofNullable(logObjectPrefix);
            return this;
        }        public BucketLoggingGetArgs build() {
            return new BucketLoggingGetArgs(logBucket, logObjectPrefix);
        }
    }
}
