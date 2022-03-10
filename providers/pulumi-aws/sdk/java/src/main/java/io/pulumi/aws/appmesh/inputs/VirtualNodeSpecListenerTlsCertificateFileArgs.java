// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class VirtualNodeSpecListenerTlsCertificateFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTlsCertificateFileArgs Empty = new VirtualNodeSpecListenerTlsCertificateFileArgs();

    /**
     * The certificate trust chain for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="certificateChain", required=true)
      private final Input<String> certificateChain;

    public Input<String> getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * The private key for a certificate stored on the file system of the virtual node that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="privateKey", required=true)
      private final Input<String> privateKey;

    public Input<String> getPrivateKey() {
        return this.privateKey;
    }

    public VirtualNodeSpecListenerTlsCertificateFileArgs(
        Input<String> certificateChain,
        Input<String> privateKey) {
        this.certificateChain = Objects.requireNonNull(certificateChain, "expected parameter 'certificateChain' to be non-null");
        this.privateKey = Objects.requireNonNull(privateKey, "expected parameter 'privateKey' to be non-null");
    }

    private VirtualNodeSpecListenerTlsCertificateFileArgs() {
        this.certificateChain = Input.empty();
        this.privateKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTlsCertificateFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> certificateChain;
        private Input<String> privateKey;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTlsCertificateFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateChain = defaults.certificateChain;
    	      this.privateKey = defaults.privateKey;
        }

        public Builder certificateChain(Input<String> certificateChain) {
            this.certificateChain = Objects.requireNonNull(certificateChain);
            return this;
        }

        public Builder certificateChain(String certificateChain) {
            this.certificateChain = Input.of(Objects.requireNonNull(certificateChain));
            return this;
        }

        public Builder privateKey(Input<String> privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }

        public Builder privateKey(String privateKey) {
            this.privateKey = Input.of(Objects.requireNonNull(privateKey));
            return this;
        }
        public VirtualNodeSpecListenerTlsCertificateFileArgs build() {
            return new VirtualNodeSpecListenerTlsCertificateFileArgs(certificateChain, privateKey);
        }
    }
}
