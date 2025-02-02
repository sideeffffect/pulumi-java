// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningcompute.outputs;

import com.pulumi.azurenative.machinelearningcompute.outputs.ServicePrincipalPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterPropertiesResponse {
    /**
     * @return The Azure Service Principal used by Kubernetes
     * 
     */
    private final @Nullable ServicePrincipalPropertiesResponse servicePrincipal;

    @CustomType.Constructor
    private KubernetesClusterPropertiesResponse(@CustomType.Parameter("servicePrincipal") @Nullable ServicePrincipalPropertiesResponse servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    /**
     * @return The Azure Service Principal used by Kubernetes
     * 
     */
    public Optional<ServicePrincipalPropertiesResponse> servicePrincipal() {
        return Optional.ofNullable(this.servicePrincipal);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServicePrincipalPropertiesResponse servicePrincipal;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesClusterPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.servicePrincipal = defaults.servicePrincipal;
        }

        public Builder servicePrincipal(@Nullable ServicePrincipalPropertiesResponse servicePrincipal) {
            this.servicePrincipal = servicePrincipal;
            return this;
        }        public KubernetesClusterPropertiesResponse build() {
            return new KubernetesClusterPropertiesResponse(servicePrincipal);
        }
    }
}
