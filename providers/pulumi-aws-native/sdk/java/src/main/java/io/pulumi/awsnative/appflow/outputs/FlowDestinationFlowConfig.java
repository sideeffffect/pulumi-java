// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.enums.FlowConnectorType;
import io.pulumi.awsnative.appflow.outputs.FlowDestinationConnectorProperties;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowDestinationFlowConfig {
    /**
     * Name of destination connector profile
     * 
     */
    private final @Nullable String connectorProfileName;
    /**
     * Destination connector type
     * 
     */
    private final FlowConnectorType connectorType;
    /**
     * Destination connector details
     * 
     */
    private final FlowDestinationConnectorProperties destinationConnectorProperties;

    @OutputCustomType.Constructor({"connectorProfileName","connectorType","destinationConnectorProperties"})
    private FlowDestinationFlowConfig(
        @Nullable String connectorProfileName,
        FlowConnectorType connectorType,
        FlowDestinationConnectorProperties destinationConnectorProperties) {
        this.connectorProfileName = connectorProfileName;
        this.connectorType = connectorType;
        this.destinationConnectorProperties = destinationConnectorProperties;
    }

    /**
     * Name of destination connector profile
     * 
    */
    public Optional<String> getConnectorProfileName() {
        return Optional.ofNullable(this.connectorProfileName);
    }
    /**
     * Destination connector type
     * 
    */
    public FlowConnectorType getConnectorType() {
        return this.connectorType;
    }
    /**
     * Destination connector details
     * 
    */
    public FlowDestinationConnectorProperties getDestinationConnectorProperties() {
        return this.destinationConnectorProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDestinationFlowConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String connectorProfileName;
        private FlowConnectorType connectorType;
        private FlowDestinationConnectorProperties destinationConnectorProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDestinationFlowConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorProfileName = defaults.connectorProfileName;
    	      this.connectorType = defaults.connectorType;
    	      this.destinationConnectorProperties = defaults.destinationConnectorProperties;
        }

        public Builder setConnectorProfileName(@Nullable String connectorProfileName) {
            this.connectorProfileName = connectorProfileName;
            return this;
        }

        public Builder setConnectorType(FlowConnectorType connectorType) {
            this.connectorType = Objects.requireNonNull(connectorType);
            return this;
        }

        public Builder setDestinationConnectorProperties(FlowDestinationConnectorProperties destinationConnectorProperties) {
            this.destinationConnectorProperties = Objects.requireNonNull(destinationConnectorProperties);
            return this;
        }
        public FlowDestinationFlowConfig build() {
            return new FlowDestinationFlowConfig(connectorProfileName, connectorType, destinationConnectorProperties);
        }
    }
}
