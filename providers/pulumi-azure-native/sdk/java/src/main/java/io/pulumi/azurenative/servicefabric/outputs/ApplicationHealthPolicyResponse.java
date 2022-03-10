// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.azurenative.servicefabric.outputs.ServiceTypeHealthPolicyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationHealthPolicyResponse {
    /**
     * The health policy used by default to evaluate the health of a service type.
     * 
     */
    private final @Nullable ServiceTypeHealthPolicyResponse defaultServiceTypeHealthPolicy;
    /**
     * The map with service type health policy per service type name. The map is empty by default.
     * 
     */
    private final @Nullable Map<String,ServiceTypeHealthPolicyResponse> serviceTypeHealthPolicies;

    @OutputCustomType.Constructor
    private ApplicationHealthPolicyResponse(
        @OutputCustomType.Parameter("defaultServiceTypeHealthPolicy") @Nullable ServiceTypeHealthPolicyResponse defaultServiceTypeHealthPolicy,
        @OutputCustomType.Parameter("serviceTypeHealthPolicies") @Nullable Map<String,ServiceTypeHealthPolicyResponse> serviceTypeHealthPolicies) {
        this.defaultServiceTypeHealthPolicy = defaultServiceTypeHealthPolicy;
        this.serviceTypeHealthPolicies = serviceTypeHealthPolicies;
    }

    /**
     * The health policy used by default to evaluate the health of a service type.
     * 
    */
    public Optional<ServiceTypeHealthPolicyResponse> getDefaultServiceTypeHealthPolicy() {
        return Optional.ofNullable(this.defaultServiceTypeHealthPolicy);
    }
    /**
     * The map with service type health policy per service type name. The map is empty by default.
     * 
    */
    public Map<String,ServiceTypeHealthPolicyResponse> getServiceTypeHealthPolicies() {
        return this.serviceTypeHealthPolicies == null ? Map.of() : this.serviceTypeHealthPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationHealthPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceTypeHealthPolicyResponse defaultServiceTypeHealthPolicy;
        private @Nullable Map<String,ServiceTypeHealthPolicyResponse> serviceTypeHealthPolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationHealthPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultServiceTypeHealthPolicy = defaults.defaultServiceTypeHealthPolicy;
    	      this.serviceTypeHealthPolicies = defaults.serviceTypeHealthPolicies;
        }

        public Builder defaultServiceTypeHealthPolicy(@Nullable ServiceTypeHealthPolicyResponse defaultServiceTypeHealthPolicy) {
            this.defaultServiceTypeHealthPolicy = defaultServiceTypeHealthPolicy;
            return this;
        }

        public Builder serviceTypeHealthPolicies(@Nullable Map<String,ServiceTypeHealthPolicyResponse> serviceTypeHealthPolicies) {
            this.serviceTypeHealthPolicies = serviceTypeHealthPolicies;
            return this;
        }
        public ApplicationHealthPolicyResponse build() {
            return new ApplicationHealthPolicyResponse(defaultServiceTypeHealthPolicy, serviceTypeHealthPolicies);
        }
    }
}
