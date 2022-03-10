// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LoadBalancerAccessLogs {
    /**
     * The S3 bucket name to store the logs in.
     * 
     */
    private final String bucket;
    /**
     * The S3 bucket prefix. Logs are stored in the root if not configured.
     * 
     */
    private final @Nullable String bucketPrefix;
    /**
     * Boolean to enable / disable `access_logs`. Default is `true`
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The publishing interval in minutes. Default: 60 minutes.
     * 
     */
    private final @Nullable Integer interval;

    @OutputCustomType.Constructor
    private LoadBalancerAccessLogs(
        @OutputCustomType.Parameter("bucket") String bucket,
        @OutputCustomType.Parameter("bucketPrefix") @Nullable String bucketPrefix,
        @OutputCustomType.Parameter("enabled") @Nullable Boolean enabled,
        @OutputCustomType.Parameter("interval") @Nullable Integer interval) {
        this.bucket = bucket;
        this.bucketPrefix = bucketPrefix;
        this.enabled = enabled;
        this.interval = interval;
    }

    /**
     * The S3 bucket name to store the logs in.
     * 
    */
    public String getBucket() {
        return this.bucket;
    }
    /**
     * The S3 bucket prefix. Logs are stored in the root if not configured.
     * 
    */
    public Optional<String> getBucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }
    /**
     * Boolean to enable / disable `access_logs`. Default is `true`
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The publishing interval in minutes. Default: 60 minutes.
     * 
    */
    public Optional<Integer> getInterval() {
        return Optional.ofNullable(this.interval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerAccessLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String bucketPrefix;
        private @Nullable Boolean enabled;
        private @Nullable Integer interval;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerAccessLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.enabled = defaults.enabled;
    	      this.interval = defaults.interval;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder interval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }
        public LoadBalancerAccessLogs build() {
            return new LoadBalancerAccessLogs(bucket, bucketPrefix, enabled, interval);
        }
    }
}
