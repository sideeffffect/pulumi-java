// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.CacheExpirationActionParametersResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DeliveryRuleCacheExpirationActionResponse {
    /**
     * The name of the action for the delivery rule.
     * Expected value is 'CacheExpiration'.
     * 
     */
    private final String name;
    /**
     * Defines the parameters for the action.
     * 
     */
    private final CacheExpirationActionParametersResponse parameters;

    @OutputCustomType.Constructor({"name","parameters"})
    private DeliveryRuleCacheExpirationActionResponse(
        String name,
        CacheExpirationActionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * The name of the action for the delivery rule.
     * Expected value is 'CacheExpiration'.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Defines the parameters for the action.
     * 
    */
    public CacheExpirationActionParametersResponse getParameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleCacheExpirationActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private CacheExpirationActionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleCacheExpirationActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(CacheExpirationActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public DeliveryRuleCacheExpirationActionResponse build() {
            return new DeliveryRuleCacheExpirationActionResponse(name, parameters);
        }
    }
}
