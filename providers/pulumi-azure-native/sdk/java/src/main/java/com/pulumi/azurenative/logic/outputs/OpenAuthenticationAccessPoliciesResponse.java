// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.azurenative.logic.outputs.OpenAuthenticationAccessPolicyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class OpenAuthenticationAccessPoliciesResponse {
    /**
     * Open authentication policies.
     * 
     */
    private final @Nullable Map<String,OpenAuthenticationAccessPolicyResponse> policies;

    @CustomType.Constructor
    private OpenAuthenticationAccessPoliciesResponse(@CustomType.Parameter("policies") @Nullable Map<String,OpenAuthenticationAccessPolicyResponse> policies) {
        this.policies = policies;
    }

    /**
     * Open authentication policies.
     * 
    */
    public Map<String,OpenAuthenticationAccessPolicyResponse> policies() {
        return this.policies == null ? Map.of() : this.policies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenAuthenticationAccessPoliciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,OpenAuthenticationAccessPolicyResponse> policies;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenAuthenticationAccessPoliciesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policies = defaults.policies;
        }

        public Builder policies(@Nullable Map<String,OpenAuthenticationAccessPolicyResponse> policies) {
            this.policies = policies;
            return this;
        }        public OpenAuthenticationAccessPoliciesResponse build() {
            return new OpenAuthenticationAccessPoliciesResponse(policies);
        }
    }
}
