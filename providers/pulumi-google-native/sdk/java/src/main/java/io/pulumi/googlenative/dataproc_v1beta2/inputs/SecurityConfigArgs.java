// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.KerberosConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Security related configuration, including encryption, Kerberos, etc.
 * 
 */
public final class SecurityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityConfigArgs Empty = new SecurityConfigArgs();

    /**
     * Optional. Kerberos related configuration.
     * 
     */
    @InputImport(name="kerberosConfig")
      private final @Nullable Input<KerberosConfigArgs> kerberosConfig;

    public Input<KerberosConfigArgs> getKerberosConfig() {
        return this.kerberosConfig == null ? Input.empty() : this.kerberosConfig;
    }

    public SecurityConfigArgs(@Nullable Input<KerberosConfigArgs> kerberosConfig) {
        this.kerberosConfig = kerberosConfig;
    }

    private SecurityConfigArgs() {
        this.kerberosConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<KerberosConfigArgs> kerberosConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kerberosConfig = defaults.kerberosConfig;
        }

        public Builder kerberosConfig(@Nullable Input<KerberosConfigArgs> kerberosConfig) {
            this.kerberosConfig = kerberosConfig;
            return this;
        }

        public Builder kerberosConfig(@Nullable KerberosConfigArgs kerberosConfig) {
            this.kerberosConfig = Input.ofNullable(kerberosConfig);
            return this;
        }
        public SecurityConfigArgs build() {
            return new SecurityConfigArgs(kerberosConfig);
        }
    }
}
