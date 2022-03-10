// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.inputs.ContainerServiceSshPublicKeyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * SSH configuration for Linux-based VMs running on Azure.
 * 
 */
public final class ContainerServiceSshConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerServiceSshConfigurationArgs Empty = new ContainerServiceSshConfigurationArgs();

    /**
     * The list of SSH public keys used to authenticate with Linux-based VMs. Only expect one key specified.
     * 
     */
    @InputImport(name="publicKeys", required=true)
      private final Input<List<ContainerServiceSshPublicKeyArgs>> publicKeys;

    public Input<List<ContainerServiceSshPublicKeyArgs>> getPublicKeys() {
        return this.publicKeys;
    }

    public ContainerServiceSshConfigurationArgs(Input<List<ContainerServiceSshPublicKeyArgs>> publicKeys) {
        this.publicKeys = Objects.requireNonNull(publicKeys, "expected parameter 'publicKeys' to be non-null");
    }

    private ContainerServiceSshConfigurationArgs() {
        this.publicKeys = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerServiceSshConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<ContainerServiceSshPublicKeyArgs>> publicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerServiceSshConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeys = defaults.publicKeys;
        }

        public Builder publicKeys(Input<List<ContainerServiceSshPublicKeyArgs>> publicKeys) {
            this.publicKeys = Objects.requireNonNull(publicKeys);
            return this;
        }

        public Builder publicKeys(List<ContainerServiceSshPublicKeyArgs> publicKeys) {
            this.publicKeys = Input.of(Objects.requireNonNull(publicKeys));
            return this;
        }
        public ContainerServiceSshConfigurationArgs build() {
            return new ContainerServiceSshConfigurationArgs(publicKeys);
        }
    }
}
