// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.OriginGroupOverrideActionParametersResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OriginGroupOverrideActionResponse {
    /**
     * The name of the action for the delivery rule.
     * Expected value is 'OriginGroupOverride'.
     * 
     */
    private final String name;
    /**
     * Defines the parameters for the action.
     * 
     */
    private final OriginGroupOverrideActionParametersResponse parameters;

    @OutputCustomType.Constructor({"name","parameters"})
    private OriginGroupOverrideActionResponse(
        String name,
        OriginGroupOverrideActionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * The name of the action for the delivery rule.
     * Expected value is 'OriginGroupOverride'.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Defines the parameters for the action.
     * 
    */
    public OriginGroupOverrideActionParametersResponse getParameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginGroupOverrideActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private OriginGroupOverrideActionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginGroupOverrideActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(OriginGroupOverrideActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public OriginGroupOverrideActionResponse build() {
            return new OriginGroupOverrideActionResponse(name, parameters);
        }
    }
}
