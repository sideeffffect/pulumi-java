// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TlsCertificatePathsResponse {
    /**
     * The path to the file holding the client or server TLS certificate to use.
     * 
     */
    private final String certificatePath;
    /**
     * The path to the file holding the client or server private key.
     * 
     */
    private final String privateKeyPath;

    @CustomType.Constructor
    private TlsCertificatePathsResponse(
        @CustomType.Parameter("certificatePath") String certificatePath,
        @CustomType.Parameter("privateKeyPath") String privateKeyPath) {
        this.certificatePath = certificatePath;
        this.privateKeyPath = privateKeyPath;
    }

    /**
     * The path to the file holding the client or server TLS certificate to use.
     * 
    */
    public String certificatePath() {
        return this.certificatePath;
    }
    /**
     * The path to the file holding the client or server private key.
     * 
    */
    public String privateKeyPath() {
        return this.privateKeyPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsCertificatePathsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificatePath;
        private String privateKeyPath;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsCertificatePathsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificatePath = defaults.certificatePath;
    	      this.privateKeyPath = defaults.privateKeyPath;
        }

        public Builder certificatePath(String certificatePath) {
            this.certificatePath = Objects.requireNonNull(certificatePath);
            return this;
        }
        public Builder privateKeyPath(String privateKeyPath) {
            this.privateKeyPath = Objects.requireNonNull(privateKeyPath);
            return this;
        }        public TlsCertificatePathsResponse build() {
            return new TlsCertificatePathsResponse(certificatePath, privateKeyPath);
        }
    }
}
