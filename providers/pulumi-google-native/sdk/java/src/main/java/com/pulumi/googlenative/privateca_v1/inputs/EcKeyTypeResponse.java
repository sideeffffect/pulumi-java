// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes an Elliptic Curve key that may be used in a Certificate issued from a CaPool.
 * 
 */
public final class EcKeyTypeResponse extends com.pulumi.resources.InvokeArgs {

    public static final EcKeyTypeResponse Empty = new EcKeyTypeResponse();

    /**
     * Optional. A signature algorithm that must be used. If this is omitted, any EC-based signature algorithm will be allowed.
     * 
     */
    @Import(name="signatureAlgorithm", required=true)
      private final String signatureAlgorithm;

    public String signatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public EcKeyTypeResponse(String signatureAlgorithm) {
        this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm, "expected parameter 'signatureAlgorithm' to be non-null");
    }

    private EcKeyTypeResponse() {
        this.signatureAlgorithm = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EcKeyTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String signatureAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(EcKeyTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.signatureAlgorithm = defaults.signatureAlgorithm;
        }

        public Builder signatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm);
            return this;
        }        public EcKeyTypeResponse build() {
            return new EcKeyTypeResponse(signatureAlgorithm);
        }
    }
}
