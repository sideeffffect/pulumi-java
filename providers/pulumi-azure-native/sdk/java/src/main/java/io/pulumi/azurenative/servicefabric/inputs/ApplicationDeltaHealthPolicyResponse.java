// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.inputs.ServiceTypeDeltaHealthPolicyResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a delta health policy used to evaluate the health of an application or one of its child entities when upgrading the cluster.
 * 
 */
public final class ApplicationDeltaHealthPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationDeltaHealthPolicyResponse Empty = new ApplicationDeltaHealthPolicyResponse();

    /**
     * The delta health policy used by default to evaluate the health of a service type when upgrading the cluster.
     * 
     */
    @InputImport(name="defaultServiceTypeDeltaHealthPolicy")
      private final @Nullable ServiceTypeDeltaHealthPolicyResponse defaultServiceTypeDeltaHealthPolicy;

    public Optional<ServiceTypeDeltaHealthPolicyResponse> getDefaultServiceTypeDeltaHealthPolicy() {
        return this.defaultServiceTypeDeltaHealthPolicy == null ? Optional.empty() : Optional.ofNullable(this.defaultServiceTypeDeltaHealthPolicy);
    }

    /**
     * The map with service type delta health policy per service type name. The map is empty by default.
     * 
     */
    @InputImport(name="serviceTypeDeltaHealthPolicies")
      private final @Nullable Map<String,ServiceTypeDeltaHealthPolicyResponse> serviceTypeDeltaHealthPolicies;

    public Map<String,ServiceTypeDeltaHealthPolicyResponse> getServiceTypeDeltaHealthPolicies() {
        return this.serviceTypeDeltaHealthPolicies == null ? Map.of() : this.serviceTypeDeltaHealthPolicies;
    }

    public ApplicationDeltaHealthPolicyResponse(
        @Nullable ServiceTypeDeltaHealthPolicyResponse defaultServiceTypeDeltaHealthPolicy,
        @Nullable Map<String,ServiceTypeDeltaHealthPolicyResponse> serviceTypeDeltaHealthPolicies) {
        this.defaultServiceTypeDeltaHealthPolicy = defaultServiceTypeDeltaHealthPolicy;
        this.serviceTypeDeltaHealthPolicies = serviceTypeDeltaHealthPolicies;
    }

    private ApplicationDeltaHealthPolicyResponse() {
        this.defaultServiceTypeDeltaHealthPolicy = null;
        this.serviceTypeDeltaHealthPolicies = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationDeltaHealthPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceTypeDeltaHealthPolicyResponse defaultServiceTypeDeltaHealthPolicy;
        private @Nullable Map<String,ServiceTypeDeltaHealthPolicyResponse> serviceTypeDeltaHealthPolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationDeltaHealthPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultServiceTypeDeltaHealthPolicy = defaults.defaultServiceTypeDeltaHealthPolicy;
    	      this.serviceTypeDeltaHealthPolicies = defaults.serviceTypeDeltaHealthPolicies;
        }

        public Builder defaultServiceTypeDeltaHealthPolicy(@Nullable ServiceTypeDeltaHealthPolicyResponse defaultServiceTypeDeltaHealthPolicy) {
            this.defaultServiceTypeDeltaHealthPolicy = defaultServiceTypeDeltaHealthPolicy;
            return this;
        }

        public Builder serviceTypeDeltaHealthPolicies(@Nullable Map<String,ServiceTypeDeltaHealthPolicyResponse> serviceTypeDeltaHealthPolicies) {
            this.serviceTypeDeltaHealthPolicies = serviceTypeDeltaHealthPolicies;
            return this;
        }
        public ApplicationDeltaHealthPolicyResponse build() {
            return new ApplicationDeltaHealthPolicyResponse(defaultServiceTypeDeltaHealthPolicy, serviceTypeDeltaHealthPolicies);
        }
    }
}
