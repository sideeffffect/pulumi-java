// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class HealthCheckResponse {
    /**
     * Interval between health checks.
     * 
     */
    private final String checkInterval;
    /**
     * Whether to explicitly disable health checks for this instance.
     * 
     */
    private final Boolean disableHealthCheck;
    /**
     * Number of consecutive successful health checks required before receiving traffic.
     * 
     */
    private final Integer healthyThreshold;
    /**
     * Host header to send when performing an HTTP health check. Example: "myapp.appspot.com"
     * 
     */
    private final String host;
    /**
     * Number of consecutive failed health checks required before an instance is restarted.
     * 
     */
    private final Integer restartThreshold;
    /**
     * Time before the health check is considered failed.
     * 
     */
    private final String timeout;
    /**
     * Number of consecutive failed health checks required before removing traffic.
     * 
     */
    private final Integer unhealthyThreshold;

    @OutputCustomType.Constructor({"checkInterval","disableHealthCheck","healthyThreshold","host","restartThreshold","timeout","unhealthyThreshold"})
    private HealthCheckResponse(
        String checkInterval,
        Boolean disableHealthCheck,
        Integer healthyThreshold,
        String host,
        Integer restartThreshold,
        String timeout,
        Integer unhealthyThreshold) {
        this.checkInterval = checkInterval;
        this.disableHealthCheck = disableHealthCheck;
        this.healthyThreshold = healthyThreshold;
        this.host = host;
        this.restartThreshold = restartThreshold;
        this.timeout = timeout;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * Interval between health checks.
     * 
    */
    public String getCheckInterval() {
        return this.checkInterval;
    }
    /**
     * Whether to explicitly disable health checks for this instance.
     * 
    */
    public Boolean getDisableHealthCheck() {
        return this.disableHealthCheck;
    }
    /**
     * Number of consecutive successful health checks required before receiving traffic.
     * 
    */
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }
    /**
     * Host header to send when performing an HTTP health check. Example: "myapp.appspot.com"
     * 
    */
    public String getHost() {
        return this.host;
    }
    /**
     * Number of consecutive failed health checks required before an instance is restarted.
     * 
    */
    public Integer getRestartThreshold() {
        return this.restartThreshold;
    }
    /**
     * Time before the health check is considered failed.
     * 
    */
    public String getTimeout() {
        return this.timeout;
    }
    /**
     * Number of consecutive failed health checks required before removing traffic.
     * 
    */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String checkInterval;
        private Boolean disableHealthCheck;
        private Integer healthyThreshold;
        private String host;
        private Integer restartThreshold;
        private String timeout;
        private Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkInterval = defaults.checkInterval;
    	      this.disableHealthCheck = defaults.disableHealthCheck;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.host = defaults.host;
    	      this.restartThreshold = defaults.restartThreshold;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder setCheckInterval(String checkInterval) {
            this.checkInterval = Objects.requireNonNull(checkInterval);
            return this;
        }

        public Builder setDisableHealthCheck(Boolean disableHealthCheck) {
            this.disableHealthCheck = Objects.requireNonNull(disableHealthCheck);
            return this;
        }

        public Builder setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setRestartThreshold(Integer restartThreshold) {
            this.restartThreshold = Objects.requireNonNull(restartThreshold);
            return this;
        }

        public Builder setTimeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }

        public Builder setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }
        public HealthCheckResponse build() {
            return new HealthCheckResponse(checkInterval, disableHealthCheck, healthyThreshold, host, restartThreshold, timeout, unhealthyThreshold);
        }
    }
}
