// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.run_v1alpha1.outputs.ConfigMapKeySelectorResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.SecretKeySelectorResponse;
import java.util.Objects;

@OutputCustomType
public final class EnvVarSourceResponse {
    /**
     * (Optional) Not supported by Cloud Run Selects a key of a ConfigMap.
     * 
     */
    private final ConfigMapKeySelectorResponse configMapKeyRef;
    /**
     * (Optional) Selects a key (version) of a secret in Secret Manager.
     * 
     */
    private final SecretKeySelectorResponse secretKeyRef;

    @OutputCustomType.Constructor({"configMapKeyRef","secretKeyRef"})
    private EnvVarSourceResponse(
        ConfigMapKeySelectorResponse configMapKeyRef,
        SecretKeySelectorResponse secretKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
        this.secretKeyRef = secretKeyRef;
    }

    /**
     * (Optional) Not supported by Cloud Run Selects a key of a ConfigMap.
     * 
    */
    public ConfigMapKeySelectorResponse getConfigMapKeyRef() {
        return this.configMapKeyRef;
    }
    /**
     * (Optional) Selects a key (version) of a secret in Secret Manager.
     * 
    */
    public SecretKeySelectorResponse getSecretKeyRef() {
        return this.secretKeyRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvVarSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigMapKeySelectorResponse configMapKeyRef;
        private SecretKeySelectorResponse secretKeyRef;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvVarSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapKeyRef = defaults.configMapKeyRef;
    	      this.secretKeyRef = defaults.secretKeyRef;
        }

        public Builder setConfigMapKeyRef(ConfigMapKeySelectorResponse configMapKeyRef) {
            this.configMapKeyRef = Objects.requireNonNull(configMapKeyRef);
            return this;
        }

        public Builder setSecretKeyRef(SecretKeySelectorResponse secretKeyRef) {
            this.secretKeyRef = Objects.requireNonNull(secretKeyRef);
            return this;
        }
        public EnvVarSourceResponse build() {
            return new EnvVarSourceResponse(configMapKeyRef, secretKeyRef);
        }
    }
}
