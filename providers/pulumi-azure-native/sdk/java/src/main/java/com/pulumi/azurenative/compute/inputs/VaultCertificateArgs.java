// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a single certificate reference in a Key Vault, and where the certificate should reside on the VM.
 * 
 */
public final class VaultCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final VaultCertificateArgs Empty = new VaultCertificateArgs();

    /**
     * For Windows VMs, specifies the certificate store on the Virtual Machine to which the certificate should be added. The specified certificate store is implicitly in the LocalMachine account. <br><br>For Linux VMs, the certificate file is placed under the /var/lib/waagent directory, with the file name &lt;UppercaseThumbprint&gt;.crt for the X509 certificate file and &lt;UppercaseThumbprint&gt;.prv for private key. Both of these files are .pem formatted.
     * 
     */
    @Import(name="certificateStore")
      private final @Nullable Output<String> certificateStore;

    public Output<String> certificateStore() {
        return this.certificateStore == null ? Codegen.empty() : this.certificateStore;
    }

    /**
     * This is the URL of a certificate that has been uploaded to Key Vault as a secret. For adding a secret to the Key Vault, see [Add a key or secret to the key vault](https://docs.microsoft.com/azure/key-vault/key-vault-get-started/#add). In this case, your certificate needs to be It is the Base64 encoding of the following JSON Object which is encoded in UTF-8: <br><br> {<br> "data":"<Base64-encoded-certificate>",<br> "dataType":"pfx",<br> "password":"<pfx-file-password>"<br>} <br> To install certificates on a virtual machine it is recommended to use the [Azure Key Vault virtual machine extension for Linux](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-linux) or the [Azure Key Vault virtual machine extension for Windows](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-windows).
     * 
     */
    @Import(name="certificateUrl")
      private final @Nullable Output<String> certificateUrl;

    public Output<String> certificateUrl() {
        return this.certificateUrl == null ? Codegen.empty() : this.certificateUrl;
    }

    public VaultCertificateArgs(
        @Nullable Output<String> certificateStore,
        @Nullable Output<String> certificateUrl) {
        this.certificateStore = certificateStore;
        this.certificateUrl = certificateUrl;
    }

    private VaultCertificateArgs() {
        this.certificateStore = Codegen.empty();
        this.certificateUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateStore;
        private @Nullable Output<String> certificateUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateStore = defaults.certificateStore;
    	      this.certificateUrl = defaults.certificateUrl;
        }

        public Builder certificateStore(@Nullable Output<String> certificateStore) {
            this.certificateStore = certificateStore;
            return this;
        }
        public Builder certificateStore(@Nullable String certificateStore) {
            this.certificateStore = Codegen.ofNullable(certificateStore);
            return this;
        }
        public Builder certificateUrl(@Nullable Output<String> certificateUrl) {
            this.certificateUrl = certificateUrl;
            return this;
        }
        public Builder certificateUrl(@Nullable String certificateUrl) {
            this.certificateUrl = Codegen.ofNullable(certificateUrl);
            return this;
        }        public VaultCertificateArgs build() {
            return new VaultCertificateArgs(certificateStore, certificateUrl);
        }
    }
}
