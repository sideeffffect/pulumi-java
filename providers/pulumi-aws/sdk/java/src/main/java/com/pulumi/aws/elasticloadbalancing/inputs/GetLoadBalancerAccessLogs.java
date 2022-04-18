// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancing.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetLoadBalancerAccessLogs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerAccessLogs Empty = new GetLoadBalancerAccessLogs();

    @Import(name="bucket", required=true)
      private final String bucket;

    public String bucket() {
        return this.bucket;
    }

    @Import(name="bucketPrefix", required=true)
      private final String bucketPrefix;

    public String bucketPrefix() {
        return this.bucketPrefix;
    }

    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    @Import(name="interval", required=true)
      private final Integer interval;

    public Integer interval() {
        return this.interval;
    }

    public GetLoadBalancerAccessLogs(
        String bucket,
        String bucketPrefix,
        Boolean enabled,
        Integer interval) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.bucketPrefix = Objects.requireNonNull(bucketPrefix, "expected parameter 'bucketPrefix' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
    }

    private GetLoadBalancerAccessLogs() {
        this.bucket = null;
        this.bucketPrefix = null;
        this.enabled = null;
        this.interval = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerAccessLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String bucketPrefix;
        private Boolean enabled;
        private Integer interval;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerAccessLogs defaults) {
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
        public Builder bucketPrefix(String bucketPrefix) {
            this.bucketPrefix = Objects.requireNonNull(bucketPrefix);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder interval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }        public GetLoadBalancerAccessLogs build() {
            return new GetLoadBalancerAccessLogs(bucket, bucketPrefix, enabled, interval);
        }
    }
}
