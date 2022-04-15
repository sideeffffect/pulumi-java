// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StageRouteSetting {
    /**
     * Whether data trace logging is enabled for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
     * Defaults to `false`. Supported only for WebSocket APIs.
     * 
     */
    private final @Nullable Boolean dataTraceEnabled;
    /**
     * Whether detailed metrics are enabled for the route. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean detailedMetricsEnabled;
    /**
     * The logging level for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
     * Valid values: `ERROR`, `INFO`, `OFF`. Defaults to `OFF`. Supported only for WebSocket APIs. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    private final @Nullable String loggingLevel;
    /**
     * Route key.
     * 
     */
    private final String routeKey;
    /**
     * The throttling burst limit for the route.
     * 
     */
    private final @Nullable Integer throttlingBurstLimit;
    /**
     * The throttling rate limit for the route.
     * 
     */
    private final @Nullable Double throttlingRateLimit;

    @CustomType.Constructor
    private StageRouteSetting(
        @CustomType.Parameter("dataTraceEnabled") @Nullable Boolean dataTraceEnabled,
        @CustomType.Parameter("detailedMetricsEnabled") @Nullable Boolean detailedMetricsEnabled,
        @CustomType.Parameter("loggingLevel") @Nullable String loggingLevel,
        @CustomType.Parameter("routeKey") String routeKey,
        @CustomType.Parameter("throttlingBurstLimit") @Nullable Integer throttlingBurstLimit,
        @CustomType.Parameter("throttlingRateLimit") @Nullable Double throttlingRateLimit) {
        this.dataTraceEnabled = dataTraceEnabled;
        this.detailedMetricsEnabled = detailedMetricsEnabled;
        this.loggingLevel = loggingLevel;
        this.routeKey = routeKey;
        this.throttlingBurstLimit = throttlingBurstLimit;
        this.throttlingRateLimit = throttlingRateLimit;
    }

    /**
     * Whether data trace logging is enabled for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
     * Defaults to `false`. Supported only for WebSocket APIs.
     * 
    */
    public Optional<Boolean> dataTraceEnabled() {
        return Optional.ofNullable(this.dataTraceEnabled);
    }
    /**
     * Whether detailed metrics are enabled for the route. Defaults to `false`.
     * 
    */
    public Optional<Boolean> detailedMetricsEnabled() {
        return Optional.ofNullable(this.detailedMetricsEnabled);
    }
    /**
     * The logging level for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
     * Valid values: `ERROR`, `INFO`, `OFF`. Defaults to `OFF`. Supported only for WebSocket APIs. This provider will only perform drift detection of its value when present in a configuration.
     * 
    */
    public Optional<String> loggingLevel() {
        return Optional.ofNullable(this.loggingLevel);
    }
    /**
     * Route key.
     * 
    */
    public String routeKey() {
        return this.routeKey;
    }
    /**
     * The throttling burst limit for the route.
     * 
    */
    public Optional<Integer> throttlingBurstLimit() {
        return Optional.ofNullable(this.throttlingBurstLimit);
    }
    /**
     * The throttling rate limit for the route.
     * 
    */
    public Optional<Double> throttlingRateLimit() {
        return Optional.ofNullable(this.throttlingRateLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageRouteSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean dataTraceEnabled;
        private @Nullable Boolean detailedMetricsEnabled;
        private @Nullable String loggingLevel;
        private String routeKey;
        private @Nullable Integer throttlingBurstLimit;
        private @Nullable Double throttlingRateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(StageRouteSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataTraceEnabled = defaults.dataTraceEnabled;
    	      this.detailedMetricsEnabled = defaults.detailedMetricsEnabled;
    	      this.loggingLevel = defaults.loggingLevel;
    	      this.routeKey = defaults.routeKey;
    	      this.throttlingBurstLimit = defaults.throttlingBurstLimit;
    	      this.throttlingRateLimit = defaults.throttlingRateLimit;
        }

        public Builder dataTraceEnabled(@Nullable Boolean dataTraceEnabled) {
            this.dataTraceEnabled = dataTraceEnabled;
            return this;
        }
        public Builder detailedMetricsEnabled(@Nullable Boolean detailedMetricsEnabled) {
            this.detailedMetricsEnabled = detailedMetricsEnabled;
            return this;
        }
        public Builder loggingLevel(@Nullable String loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }
        public Builder routeKey(String routeKey) {
            this.routeKey = Objects.requireNonNull(routeKey);
            return this;
        }
        public Builder throttlingBurstLimit(@Nullable Integer throttlingBurstLimit) {
            this.throttlingBurstLimit = throttlingBurstLimit;
            return this;
        }
        public Builder throttlingRateLimit(@Nullable Double throttlingRateLimit) {
            this.throttlingRateLimit = throttlingRateLimit;
            return this;
        }        public StageRouteSetting build() {
            return new StageRouteSetting(dataTraceEnabled, detailedMetricsEnabled, loggingLevel, routeKey, throttlingBurstLimit, throttlingRateLimit);
        }
    }
}
