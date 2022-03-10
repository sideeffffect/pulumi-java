// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReadinessCheckResponse {
    /**
     * A maximum time limit on application initialization, measured from moment the application successfully replies to a healthcheck until it is ready to serve traffic.
     * 
     */
    private final String appStartTimeout;
    /**
     * Interval between health checks.
     * 
     */
    private final String checkInterval;
    /**
     * Number of consecutive failed checks required before removing traffic.
     * 
     */
    private final Integer failureThreshold;
    /**
     * Host header to send when performing a HTTP Readiness check. Example: "myapp.appspot.com"
     * 
     */
    private final String host;
    /**
     * The request path.
     * 
     */
    private final String path;
    /**
     * Number of consecutive successful checks required before receiving traffic.
     * 
     */
    private final Integer successThreshold;
    /**
     * Time before the check is considered failed.
     * 
     */
    private final String timeout;

    @OutputCustomType.Constructor
    private ReadinessCheckResponse(
        @OutputCustomType.Parameter("appStartTimeout") String appStartTimeout,
        @OutputCustomType.Parameter("checkInterval") String checkInterval,
        @OutputCustomType.Parameter("failureThreshold") Integer failureThreshold,
        @OutputCustomType.Parameter("host") String host,
        @OutputCustomType.Parameter("path") String path,
        @OutputCustomType.Parameter("successThreshold") Integer successThreshold,
        @OutputCustomType.Parameter("timeout") String timeout) {
        this.appStartTimeout = appStartTimeout;
        this.checkInterval = checkInterval;
        this.failureThreshold = failureThreshold;
        this.host = host;
        this.path = path;
        this.successThreshold = successThreshold;
        this.timeout = timeout;
    }

    /**
     * A maximum time limit on application initialization, measured from moment the application successfully replies to a healthcheck until it is ready to serve traffic.
     * 
    */
    public String getAppStartTimeout() {
        return this.appStartTimeout;
    }
    /**
     * Interval between health checks.
     * 
    */
    public String getCheckInterval() {
        return this.checkInterval;
    }
    /**
     * Number of consecutive failed checks required before removing traffic.
     * 
    */
    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }
    /**
     * Host header to send when performing a HTTP Readiness check. Example: "myapp.appspot.com"
     * 
    */
    public String getHost() {
        return this.host;
    }
    /**
     * The request path.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * Number of consecutive successful checks required before receiving traffic.
     * 
    */
    public Integer getSuccessThreshold() {
        return this.successThreshold;
    }
    /**
     * Time before the check is considered failed.
     * 
    */
    public String getTimeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReadinessCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appStartTimeout;
        private String checkInterval;
        private Integer failureThreshold;
        private String host;
        private String path;
        private Integer successThreshold;
        private String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ReadinessCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appStartTimeout = defaults.appStartTimeout;
    	      this.checkInterval = defaults.checkInterval;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeout = defaults.timeout;
        }

        public Builder appStartTimeout(String appStartTimeout) {
            this.appStartTimeout = Objects.requireNonNull(appStartTimeout);
            return this;
        }

        public Builder checkInterval(String checkInterval) {
            this.checkInterval = Objects.requireNonNull(checkInterval);
            return this;
        }

        public Builder failureThreshold(Integer failureThreshold) {
            this.failureThreshold = Objects.requireNonNull(failureThreshold);
            return this;
        }

        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder successThreshold(Integer successThreshold) {
            this.successThreshold = Objects.requireNonNull(successThreshold);
            return this;
        }

        public Builder timeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public ReadinessCheckResponse build() {
            return new ReadinessCheckResponse(appStartTimeout, checkInterval, failureThreshold, host, path, successThreshold, timeout);
        }
    }
}
