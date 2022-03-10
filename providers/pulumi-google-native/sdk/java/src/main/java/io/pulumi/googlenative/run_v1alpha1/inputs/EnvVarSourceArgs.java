// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v1alpha1.inputs.ConfigMapKeySelectorArgs;
import io.pulumi.googlenative.run_v1alpha1.inputs.SecretKeySelectorArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EnvVarSource represents a source for the value of an EnvVar.
 * 
 */
public final class EnvVarSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvVarSourceArgs Empty = new EnvVarSourceArgs();

    /**
     * (Optional) Not supported by Cloud Run Selects a key of a ConfigMap.
     * 
     */
    @InputImport(name="configMapKeyRef")
      private final @Nullable Input<ConfigMapKeySelectorArgs> configMapKeyRef;

    public Input<ConfigMapKeySelectorArgs> getConfigMapKeyRef() {
        return this.configMapKeyRef == null ? Input.empty() : this.configMapKeyRef;
    }

    /**
     * (Optional) Selects a key (version) of a secret in Secret Manager.
     * 
     */
    @InputImport(name="secretKeyRef")
      private final @Nullable Input<SecretKeySelectorArgs> secretKeyRef;

    public Input<SecretKeySelectorArgs> getSecretKeyRef() {
        return this.secretKeyRef == null ? Input.empty() : this.secretKeyRef;
    }

    public EnvVarSourceArgs(
        @Nullable Input<ConfigMapKeySelectorArgs> configMapKeyRef,
        @Nullable Input<SecretKeySelectorArgs> secretKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
        this.secretKeyRef = secretKeyRef;
    }

    private EnvVarSourceArgs() {
        this.configMapKeyRef = Input.empty();
        this.secretKeyRef = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvVarSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConfigMapKeySelectorArgs> configMapKeyRef;
        private @Nullable Input<SecretKeySelectorArgs> secretKeyRef;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvVarSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapKeyRef = defaults.configMapKeyRef;
    	      this.secretKeyRef = defaults.secretKeyRef;
        }

        public Builder configMapKeyRef(@Nullable Input<ConfigMapKeySelectorArgs> configMapKeyRef) {
            this.configMapKeyRef = configMapKeyRef;
            return this;
        }

        public Builder configMapKeyRef(@Nullable ConfigMapKeySelectorArgs configMapKeyRef) {
            this.configMapKeyRef = Input.ofNullable(configMapKeyRef);
            return this;
        }

        public Builder secretKeyRef(@Nullable Input<SecretKeySelectorArgs> secretKeyRef) {
            this.secretKeyRef = secretKeyRef;
            return this;
        }

        public Builder secretKeyRef(@Nullable SecretKeySelectorArgs secretKeyRef) {
            this.secretKeyRef = Input.ofNullable(secretKeyRef);
            return this;
        }
        public EnvVarSourceArgs build() {
            return new EnvVarSourceArgs(configMapKeyRef, secretKeyRef);
        }
    }
}
