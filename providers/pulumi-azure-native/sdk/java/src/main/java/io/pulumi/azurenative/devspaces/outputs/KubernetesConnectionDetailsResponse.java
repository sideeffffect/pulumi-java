// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devspaces.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KubernetesConnectionDetailsResponse {
    /**
     * Gets the Instance type.
     * Expected value is 'Kubernetes'.
     * 
     */
    private final String instanceType;
    /**
     * Gets the kubeconfig for the cluster.
     * 
     */
    private final @Nullable String kubeConfig;

    @OutputCustomType.Constructor
    private KubernetesConnectionDetailsResponse(
        @OutputCustomType.Parameter("instanceType") String instanceType,
        @OutputCustomType.Parameter("kubeConfig") @Nullable String kubeConfig) {
        this.instanceType = instanceType;
        this.kubeConfig = kubeConfig;
    }

    /**
     * Gets the Instance type.
     * Expected value is 'Kubernetes'.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * Gets the kubeconfig for the cluster.
     * 
    */
    public Optional<String> getKubeConfig() {
        return Optional.ofNullable(this.kubeConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesConnectionDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceType;
        private @Nullable String kubeConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesConnectionDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.kubeConfig = defaults.kubeConfig;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder kubeConfig(@Nullable String kubeConfig) {
            this.kubeConfig = kubeConfig;
            return this;
        }
        public KubernetesConnectionDetailsResponse build() {
            return new KubernetesConnectionDetailsResponse(instanceType, kubeConfig);
        }
    }
}
