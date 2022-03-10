// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetTargetGroupHealthCheck extends io.pulumi.resources.InvokeArgs {

    public static final GetTargetGroupHealthCheck Empty = new GetTargetGroupHealthCheck();

    @InputImport(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    @InputImport(name="healthyThreshold", required=true)
      private final Integer healthyThreshold;

    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    @InputImport(name="interval", required=true)
      private final Integer interval;

    public Integer getInterval() {
        return this.interval;
    }

    @InputImport(name="matcher", required=true)
      private final String matcher;

    public String getMatcher() {
        return this.matcher;
    }

    @InputImport(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    @InputImport(name="port", required=true)
      private final String port;

    public String getPort() {
        return this.port;
    }

    @InputImport(name="protocol", required=true)
      private final String protocol;

    public String getProtocol() {
        return this.protocol;
    }

    @InputImport(name="timeout", required=true)
      private final Integer timeout;

    public Integer getTimeout() {
        return this.timeout;
    }

    @InputImport(name="unhealthyThreshold", required=true)
      private final Integer unhealthyThreshold;

    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public GetTargetGroupHealthCheck(
        Boolean enabled,
        Integer healthyThreshold,
        Integer interval,
        String matcher,
        String path,
        String port,
        String protocol,
        Integer timeout,
        Integer unhealthyThreshold) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.healthyThreshold = Objects.requireNonNull(healthyThreshold, "expected parameter 'healthyThreshold' to be non-null");
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
        this.matcher = Objects.requireNonNull(matcher, "expected parameter 'matcher' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.timeout = Objects.requireNonNull(timeout, "expected parameter 'timeout' to be non-null");
        this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold, "expected parameter 'unhealthyThreshold' to be non-null");
    }

    private GetTargetGroupHealthCheck() {
        this.enabled = null;
        this.healthyThreshold = null;
        this.interval = null;
        this.matcher = null;
        this.path = null;
        this.port = null;
        this.protocol = null;
        this.timeout = null;
        this.unhealthyThreshold = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetGroupHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private Integer healthyThreshold;
        private Integer interval;
        private String matcher;
        private String path;
        private String port;
        private String protocol;
        private Integer timeout;
        private Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetGroupHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.interval = defaults.interval;
    	      this.matcher = defaults.matcher;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }

        public Builder interval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder matcher(String matcher) {
            this.matcher = Objects.requireNonNull(matcher);
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder port(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder timeout(Integer timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }

        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }
        public GetTargetGroupHealthCheck build() {
            return new GetTargetGroupHealthCheck(enabled, healthyThreshold, interval, matcher, path, port, protocol, timeout, unhealthyThreshold);
        }
    }
}
