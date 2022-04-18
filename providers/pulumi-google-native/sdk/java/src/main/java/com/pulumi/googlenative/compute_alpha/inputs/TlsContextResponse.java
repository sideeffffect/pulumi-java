// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.TlsCertificateContextResponse;
import com.pulumi.googlenative.compute_alpha.inputs.TlsValidationContextResponse;
import java.util.Objects;


/**
 * [Deprecated] The TLS settings for the client or server. The TLS settings for the client or server.
 * 
 */
public final class TlsContextResponse extends com.pulumi.resources.InvokeArgs {

    public static final TlsContextResponse Empty = new TlsContextResponse();

    /**
     * Defines the mechanism to obtain the client or server certificate.
     * 
     */
    @Import(name="certificateContext", required=true)
      private final TlsCertificateContextResponse certificateContext;

    public TlsCertificateContextResponse certificateContext() {
        return this.certificateContext;
    }

    /**
     * Defines the mechanism to obtain the Certificate Authority certificate to validate the client/server certificate. If omitted, the proxy will not validate the server or client certificate.
     * 
     */
    @Import(name="validationContext", required=true)
      private final TlsValidationContextResponse validationContext;

    public TlsValidationContextResponse validationContext() {
        return this.validationContext;
    }

    public TlsContextResponse(
        TlsCertificateContextResponse certificateContext,
        TlsValidationContextResponse validationContext) {
        this.certificateContext = Objects.requireNonNull(certificateContext, "expected parameter 'certificateContext' to be non-null");
        this.validationContext = Objects.requireNonNull(validationContext, "expected parameter 'validationContext' to be non-null");
    }

    private TlsContextResponse() {
        this.certificateContext = null;
        this.validationContext = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsCertificateContextResponse certificateContext;
        private TlsValidationContextResponse validationContext;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateContext = defaults.certificateContext;
    	      this.validationContext = defaults.validationContext;
        }

        public Builder certificateContext(TlsCertificateContextResponse certificateContext) {
            this.certificateContext = Objects.requireNonNull(certificateContext);
            return this;
        }
        public Builder validationContext(TlsValidationContextResponse validationContext) {
            this.validationContext = Objects.requireNonNull(validationContext);
            return this;
        }        public TlsContextResponse build() {
            return new TlsContextResponse(certificateContext, validationContext);
        }
    }
}
