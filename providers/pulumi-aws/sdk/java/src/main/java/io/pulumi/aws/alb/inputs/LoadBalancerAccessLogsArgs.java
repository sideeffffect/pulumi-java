// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerAccessLogsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerAccessLogsArgs Empty = new LoadBalancerAccessLogsArgs();

    /**
     * The S3 bucket name to store the logs in.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * Boolean to enable / disable `access_logs`. Defaults to `false`, even when `bucket` is specified.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * The S3 bucket prefix. Logs are stored in the root if not configured.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> prefix() {
        return this.prefix == null ? Codegen.empty() : this.prefix;
    }

    public LoadBalancerAccessLogsArgs(
        Output<String> bucket,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> prefix) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.enabled = enabled;
        this.prefix = prefix;
    }

    private LoadBalancerAccessLogsArgs() {
        this.bucket = Codegen.empty();
        this.enabled = Codegen.empty();
        this.prefix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerAccessLogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerAccessLogsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.enabled = defaults.enabled;
    	      this.prefix = defaults.prefix;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Codegen.ofNullable(prefix);
            return this;
        }        public LoadBalancerAccessLogsArgs build() {
            return new LoadBalancerAccessLogsArgs(bucket, enabled, prefix);
        }
    }
}
