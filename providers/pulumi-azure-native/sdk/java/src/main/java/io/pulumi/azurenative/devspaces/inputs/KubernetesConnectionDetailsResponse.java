// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devspaces.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information used to connect to a Kubernetes cluster
 * 
 */
public final class KubernetesConnectionDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final KubernetesConnectionDetailsResponse Empty = new KubernetesConnectionDetailsResponse();

    /**
     * Gets the Instance type.
     * Expected value is 'Kubernetes'.
     * 
     */
    @InputImport(name="instanceType", required=true)
      private final String instanceType;

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * Gets the kubeconfig for the cluster.
     * 
     */
    @InputImport(name="kubeConfig")
      private final @Nullable String kubeConfig;

    public Optional<String> getKubeConfig() {
        return this.kubeConfig == null ? Optional.empty() : Optional.ofNullable(this.kubeConfig);
    }

    public KubernetesConnectionDetailsResponse(
        String instanceType,
        @Nullable String kubeConfig) {
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.kubeConfig = kubeConfig;
    }

    private KubernetesConnectionDetailsResponse() {
        this.instanceType = null;
        this.kubeConfig = null;
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
