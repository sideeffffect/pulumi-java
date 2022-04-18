// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.azurenative.synapse.inputs.IntegrationRuntimeComputePropertiesResponse;
import com.pulumi.azurenative.synapse.inputs.IntegrationRuntimeSsisPropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed integration runtime, including managed elastic and managed dedicated integration runtimes.
 * 
 */
public final class ManagedIntegrationRuntimeResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedIntegrationRuntimeResponse Empty = new ManagedIntegrationRuntimeResponse();

    /**
     * The compute resource for managed integration runtime.
     * 
     */
    @Import(name="computeProperties")
      private final @Nullable IntegrationRuntimeComputePropertiesResponse computeProperties;

    public Optional<IntegrationRuntimeComputePropertiesResponse> computeProperties() {
        return this.computeProperties == null ? Optional.empty() : Optional.ofNullable(this.computeProperties);
    }

    /**
     * Integration runtime description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * SSIS properties for managed integration runtime.
     * 
     */
    @Import(name="ssisProperties")
      private final @Nullable IntegrationRuntimeSsisPropertiesResponse ssisProperties;

    public Optional<IntegrationRuntimeSsisPropertiesResponse> ssisProperties() {
        return this.ssisProperties == null ? Optional.empty() : Optional.ofNullable(this.ssisProperties);
    }

    /**
     * Integration runtime state, only valid for managed dedicated integration runtime.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    /**
     * The type of integration runtime.
     * Expected value is 'Managed'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public ManagedIntegrationRuntimeResponse(
        @Nullable IntegrationRuntimeComputePropertiesResponse computeProperties,
        @Nullable String description,
        @Nullable IntegrationRuntimeSsisPropertiesResponse ssisProperties,
        String state,
        String type) {
        this.computeProperties = computeProperties;
        this.description = description;
        this.ssisProperties = ssisProperties;
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ManagedIntegrationRuntimeResponse() {
        this.computeProperties = null;
        this.description = null;
        this.ssisProperties = null;
        this.state = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIntegrationRuntimeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IntegrationRuntimeComputePropertiesResponse computeProperties;
        private @Nullable String description;
        private @Nullable IntegrationRuntimeSsisPropertiesResponse ssisProperties;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIntegrationRuntimeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeProperties = defaults.computeProperties;
    	      this.description = defaults.description;
    	      this.ssisProperties = defaults.ssisProperties;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder computeProperties(@Nullable IntegrationRuntimeComputePropertiesResponse computeProperties) {
            this.computeProperties = computeProperties;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder ssisProperties(@Nullable IntegrationRuntimeSsisPropertiesResponse ssisProperties) {
            this.ssisProperties = ssisProperties;
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ManagedIntegrationRuntimeResponse build() {
            return new ManagedIntegrationRuntimeResponse(computeProperties, description, ssisProperties, state, type);
        }
    }
}
