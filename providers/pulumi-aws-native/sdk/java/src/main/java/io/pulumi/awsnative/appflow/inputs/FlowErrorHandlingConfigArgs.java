// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowErrorHandlingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowErrorHandlingConfigArgs Empty = new FlowErrorHandlingConfigArgs();

    @InputImport(name="bucketName")
      private final @Nullable Input<String> bucketName;

    public Input<String> getBucketName() {
        return this.bucketName == null ? Input.empty() : this.bucketName;
    }

    @InputImport(name="bucketPrefix")
      private final @Nullable Input<String> bucketPrefix;

    public Input<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Input.empty() : this.bucketPrefix;
    }

    @InputImport(name="failOnFirstError")
      private final @Nullable Input<Boolean> failOnFirstError;

    public Input<Boolean> getFailOnFirstError() {
        return this.failOnFirstError == null ? Input.empty() : this.failOnFirstError;
    }

    public FlowErrorHandlingConfigArgs(
        @Nullable Input<String> bucketName,
        @Nullable Input<String> bucketPrefix,
        @Nullable Input<Boolean> failOnFirstError) {
        this.bucketName = bucketName;
        this.bucketPrefix = bucketPrefix;
        this.failOnFirstError = failOnFirstError;
    }

    private FlowErrorHandlingConfigArgs() {
        this.bucketName = Input.empty();
        this.bucketPrefix = Input.empty();
        this.failOnFirstError = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowErrorHandlingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucketName;
        private @Nullable Input<String> bucketPrefix;
        private @Nullable Input<Boolean> failOnFirstError;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowErrorHandlingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.failOnFirstError = defaults.failOnFirstError;
        }

        public Builder bucketName(@Nullable Input<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = Input.ofNullable(bucketName);
            return this;
        }

        public Builder bucketPrefix(@Nullable Input<String> bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = Input.ofNullable(bucketPrefix);
            return this;
        }

        public Builder failOnFirstError(@Nullable Input<Boolean> failOnFirstError) {
            this.failOnFirstError = failOnFirstError;
            return this;
        }

        public Builder failOnFirstError(@Nullable Boolean failOnFirstError) {
            this.failOnFirstError = Input.ofNullable(failOnFirstError);
            return this;
        }
        public FlowErrorHandlingConfigArgs build() {
            return new FlowErrorHandlingConfigArgs(bucketName, bucketPrefix, failOnFirstError);
        }
    }
}
