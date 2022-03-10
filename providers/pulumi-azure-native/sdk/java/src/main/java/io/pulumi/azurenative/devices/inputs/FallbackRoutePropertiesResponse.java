// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of the fallback route. IoT Hub uses these properties when it routes messages to the fallback endpoint.
 * 
 */
public final class FallbackRoutePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final FallbackRoutePropertiesResponse Empty = new FallbackRoutePropertiesResponse();

    /**
     * The condition which is evaluated in order to apply the fallback route. If the condition is not provided it will evaluate to true by default. For grammar, See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language
     * 
     */
    @InputImport(name="condition")
      private final @Nullable String condition;

    public Optional<String> getCondition() {
        return this.condition == null ? Optional.empty() : Optional.ofNullable(this.condition);
    }

    /**
     * The list of endpoints to which the messages that satisfy the condition are routed to. Currently only 1 endpoint is allowed.
     * 
     */
    @InputImport(name="endpointNames", required=true)
      private final List<String> endpointNames;

    public List<String> getEndpointNames() {
        return this.endpointNames;
    }

    /**
     * Used to specify whether the fallback route is enabled.
     * 
     */
    @InputImport(name="isEnabled", required=true)
      private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * The name of the route. The name can only include alphanumeric characters, periods, underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The source to which the routing rule is to be applied to. For example, DeviceMessages
     * 
     */
    @InputImport(name="source", required=true)
      private final String source;

    public String getSource() {
        return this.source;
    }

    public FallbackRoutePropertiesResponse(
        @Nullable String condition,
        List<String> endpointNames,
        Boolean isEnabled,
        @Nullable String name,
        String source) {
        this.condition = condition;
        this.endpointNames = Objects.requireNonNull(endpointNames, "expected parameter 'endpointNames' to be non-null");
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.name = name;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private FallbackRoutePropertiesResponse() {
        this.condition = null;
        this.endpointNames = List.of();
        this.isEnabled = null;
        this.name = null;
        this.source = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FallbackRoutePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String condition;
        private List<String> endpointNames;
        private Boolean isEnabled;
        private @Nullable String name;
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(FallbackRoutePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.endpointNames = defaults.endpointNames;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.source = defaults.source;
        }

        public Builder condition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }

        public Builder endpointNames(List<String> endpointNames) {
            this.endpointNames = Objects.requireNonNull(endpointNames);
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public FallbackRoutePropertiesResponse build() {
            return new FallbackRoutePropertiesResponse(condition, endpointNames, isEnabled, name, source);
        }
    }
}
