// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Options for controlling the authentication of TLS endpoints.
 * 
 */
public final class MediaGraphTlsValidationOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final MediaGraphTlsValidationOptionsResponse Empty = new MediaGraphTlsValidationOptionsResponse();

    /**
     * Ignore the host name (common name) during validation.
     * 
     */
    @InputImport(name="ignoreHostname", required=true)
      private final Boolean ignoreHostname;

    public Boolean getIgnoreHostname() {
        return this.ignoreHostname;
    }

    /**
     * Ignore the integrity of the certificate chain at the current time.
     * 
     */
    @InputImport(name="ignoreSignature", required=true)
      private final Boolean ignoreSignature;

    public Boolean getIgnoreSignature() {
        return this.ignoreSignature;
    }

    public MediaGraphTlsValidationOptionsResponse(
        Boolean ignoreHostname,
        Boolean ignoreSignature) {
        this.ignoreHostname = Objects.requireNonNull(ignoreHostname, "expected parameter 'ignoreHostname' to be non-null");
        this.ignoreSignature = Objects.requireNonNull(ignoreSignature, "expected parameter 'ignoreSignature' to be non-null");
    }

    private MediaGraphTlsValidationOptionsResponse() {
        this.ignoreHostname = null;
        this.ignoreSignature = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaGraphTlsValidationOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean ignoreHostname;
        private Boolean ignoreSignature;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaGraphTlsValidationOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreHostname = defaults.ignoreHostname;
    	      this.ignoreSignature = defaults.ignoreSignature;
        }

        public Builder ignoreHostname(Boolean ignoreHostname) {
            this.ignoreHostname = Objects.requireNonNull(ignoreHostname);
            return this;
        }

        public Builder ignoreSignature(Boolean ignoreSignature) {
            this.ignoreSignature = Objects.requireNonNull(ignoreSignature);
            return this;
        }
        public MediaGraphTlsValidationOptionsResponse build() {
            return new MediaGraphTlsValidationOptionsResponse(ignoreHostname, ignoreSignature);
        }
    }
}
