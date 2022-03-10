// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.VaultPropertiesEncryptionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the vault.
 * 
 */
public final class VaultPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final VaultPropertiesArgs Empty = new VaultPropertiesArgs();

    /**
     * Customer Managed Key details of the resource.
     * 
     */
    @InputImport(name="encryption")
      private final @Nullable Input<VaultPropertiesEncryptionArgs> encryption;

    public Input<VaultPropertiesEncryptionArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    public VaultPropertiesArgs(@Nullable Input<VaultPropertiesEncryptionArgs> encryption) {
        this.encryption = encryption;
    }

    private VaultPropertiesArgs() {
        this.encryption = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VaultPropertiesEncryptionArgs> encryption;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
        }

        public Builder encryption(@Nullable Input<VaultPropertiesEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder encryption(@Nullable VaultPropertiesEncryptionArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }
        public VaultPropertiesArgs build() {
            return new VaultPropertiesArgs(encryption);
        }
    }
}
