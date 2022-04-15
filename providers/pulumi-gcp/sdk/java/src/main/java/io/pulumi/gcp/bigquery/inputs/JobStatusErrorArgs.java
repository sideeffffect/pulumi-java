// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobStatusErrorArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobStatusErrorArgs Empty = new JobStatusErrorArgs();

    /**
     * The geographic location of the job. The default value is US.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> message() {
        return this.message == null ? Codegen.empty() : this.message;
    }

    @Import(name="reason")
      private final @Nullable Output<String> reason;

    public Output<String> reason() {
        return this.reason == null ? Codegen.empty() : this.reason;
    }

    public JobStatusErrorArgs(
        @Nullable Output<String> location,
        @Nullable Output<String> message,
        @Nullable Output<String> reason) {
        this.location = location;
        this.message = message;
        this.reason = reason;
    }

    private JobStatusErrorArgs() {
        this.location = Codegen.empty();
        this.message = Codegen.empty();
        this.reason = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusErrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private @Nullable Output<String> message;
        private @Nullable Output<String> reason;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusErrorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = Codegen.ofNullable(message);
            return this;
        }
        public Builder reason(@Nullable Output<String> reason) {
            this.reason = reason;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = Codegen.ofNullable(reason);
            return this;
        }        public JobStatusErrorArgs build() {
            return new JobStatusErrorArgs(location, message, reason);
        }
    }
}
