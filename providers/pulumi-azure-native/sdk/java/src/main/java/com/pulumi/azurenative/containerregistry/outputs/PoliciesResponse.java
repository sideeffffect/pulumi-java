// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.azurenative.containerregistry.outputs.QuarantinePolicyResponse;
import com.pulumi.azurenative.containerregistry.outputs.RetentionPolicyResponse;
import com.pulumi.azurenative.containerregistry.outputs.TrustPolicyResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PoliciesResponse {
    /**
     * The quarantine policy for a container registry.
     * 
     */
    private final @Nullable QuarantinePolicyResponse quarantinePolicy;
    /**
     * The retention policy for a container registry.
     * 
     */
    private final @Nullable RetentionPolicyResponse retentionPolicy;
    /**
     * The content trust policy for a container registry.
     * 
     */
    private final @Nullable TrustPolicyResponse trustPolicy;

    @CustomType.Constructor
    private PoliciesResponse(
        @CustomType.Parameter("quarantinePolicy") @Nullable QuarantinePolicyResponse quarantinePolicy,
        @CustomType.Parameter("retentionPolicy") @Nullable RetentionPolicyResponse retentionPolicy,
        @CustomType.Parameter("trustPolicy") @Nullable TrustPolicyResponse trustPolicy) {
        this.quarantinePolicy = quarantinePolicy;
        this.retentionPolicy = retentionPolicy;
        this.trustPolicy = trustPolicy;
    }

    /**
     * The quarantine policy for a container registry.
     * 
    */
    public Optional<QuarantinePolicyResponse> quarantinePolicy() {
        return Optional.ofNullable(this.quarantinePolicy);
    }
    /**
     * The retention policy for a container registry.
     * 
    */
    public Optional<RetentionPolicyResponse> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }
    /**
     * The content trust policy for a container registry.
     * 
    */
    public Optional<TrustPolicyResponse> trustPolicy() {
        return Optional.ofNullable(this.trustPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoliciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable QuarantinePolicyResponse quarantinePolicy;
        private @Nullable RetentionPolicyResponse retentionPolicy;
        private @Nullable TrustPolicyResponse trustPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(PoliciesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quarantinePolicy = defaults.quarantinePolicy;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.trustPolicy = defaults.trustPolicy;
        }

        public Builder quarantinePolicy(@Nullable QuarantinePolicyResponse quarantinePolicy) {
            this.quarantinePolicy = quarantinePolicy;
            return this;
        }
        public Builder retentionPolicy(@Nullable RetentionPolicyResponse retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }
        public Builder trustPolicy(@Nullable TrustPolicyResponse trustPolicy) {
            this.trustPolicy = trustPolicy;
            return this;
        }        public PoliciesResponse build() {
            return new PoliciesResponse(quarantinePolicy, retentionPolicy, trustPolicy);
        }
    }
}
