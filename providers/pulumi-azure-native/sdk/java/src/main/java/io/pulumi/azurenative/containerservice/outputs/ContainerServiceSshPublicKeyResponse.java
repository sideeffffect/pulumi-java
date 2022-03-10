// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContainerServiceSshPublicKeyResponse {
    /**
     * Certificate public key used to authenticate with VMs through SSH. The certificate must be in PEM format with or without headers.
     * 
     */
    private final String keyData;

    @OutputCustomType.Constructor
    private ContainerServiceSshPublicKeyResponse(@OutputCustomType.Parameter("keyData") String keyData) {
        this.keyData = keyData;
    }

    /**
     * Certificate public key used to authenticate with VMs through SSH. The certificate must be in PEM format with or without headers.
     * 
    */
    public String getKeyData() {
        return this.keyData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerServiceSshPublicKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyData;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerServiceSshPublicKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyData = defaults.keyData;
        }

        public Builder keyData(String keyData) {
            this.keyData = Objects.requireNonNull(keyData);
            return this;
        }
        public ContainerServiceSshPublicKeyResponse build() {
            return new ContainerServiceSshPublicKeyResponse(keyData);
        }
    }
}
