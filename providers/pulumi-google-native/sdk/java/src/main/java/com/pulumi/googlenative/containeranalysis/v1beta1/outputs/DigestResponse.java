// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DigestResponse {
    /**
     * @return `SHA1`, `SHA512` etc.
     * 
     */
    private final String algo;
    /**
     * @return Value of the digest.
     * 
     */
    private final String digestBytes;

    @CustomType.Constructor
    private DigestResponse(
        @CustomType.Parameter("algo") String algo,
        @CustomType.Parameter("digestBytes") String digestBytes) {
        this.algo = algo;
        this.digestBytes = digestBytes;
    }

    /**
     * @return `SHA1`, `SHA512` etc.
     * 
     */
    public String algo() {
        return this.algo;
    }
    /**
     * @return Value of the digest.
     * 
     */
    public String digestBytes() {
        return this.digestBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DigestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algo;
        private String digestBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(DigestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algo = defaults.algo;
    	      this.digestBytes = defaults.digestBytes;
        }

        public Builder algo(String algo) {
            this.algo = Objects.requireNonNull(algo);
            return this;
        }
        public Builder digestBytes(String digestBytes) {
            this.digestBytes = Objects.requireNonNull(digestBytes);
            return this;
        }        public DigestResponse build() {
            return new DigestResponse(algo, digestBytes);
        }
    }
}
