// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketLoggingConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final BucketLoggingConfiguration Empty = new BucketLoggingConfiguration();

    /**
     * The name of an Amazon S3 bucket where Amazon S3 store server access log files. You can store log files in any bucket that you own. By default, logs are stored in the bucket where the LoggingConfiguration property is defined.
     * 
     */
    @Import(name="destinationBucketName")
      private final @Nullable String destinationBucketName;

    public Optional<String> destinationBucketName() {
        return this.destinationBucketName == null ? Optional.empty() : Optional.ofNullable(this.destinationBucketName);
    }

    @Import(name="logFilePrefix")
      private final @Nullable String logFilePrefix;

    public Optional<String> logFilePrefix() {
        return this.logFilePrefix == null ? Optional.empty() : Optional.ofNullable(this.logFilePrefix);
    }

    public BucketLoggingConfiguration(
        @Nullable String destinationBucketName,
        @Nullable String logFilePrefix) {
        this.destinationBucketName = destinationBucketName;
        this.logFilePrefix = logFilePrefix;
    }

    private BucketLoggingConfiguration() {
        this.destinationBucketName = null;
        this.logFilePrefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLoggingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destinationBucketName;
        private @Nullable String logFilePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLoggingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationBucketName = defaults.destinationBucketName;
    	      this.logFilePrefix = defaults.logFilePrefix;
        }

        public Builder destinationBucketName(@Nullable String destinationBucketName) {
            this.destinationBucketName = destinationBucketName;
            return this;
        }
        public Builder logFilePrefix(@Nullable String logFilePrefix) {
            this.logFilePrefix = logFilePrefix;
            return this;
        }        public BucketLoggingConfiguration build() {
            return new BucketLoggingConfiguration(destinationBucketName, logFilePrefix);
        }
    }
}
