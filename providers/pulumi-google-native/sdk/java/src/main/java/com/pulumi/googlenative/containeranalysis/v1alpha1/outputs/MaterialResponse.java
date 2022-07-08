// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class MaterialResponse {
    /**
     * @return digest is a map from a hash algorithm (e.g. sha256) to the value in the material
     * 
     */
    private final Map<String,String> digest;
    /**
     * @return uri is the uri of the material
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private MaterialResponse(
        @CustomType.Parameter("digest") Map<String,String> digest,
        @CustomType.Parameter("uri") String uri) {
        this.digest = digest;
        this.uri = uri;
    }

    /**
     * @return digest is a map from a hash algorithm (e.g. sha256) to the value in the material
     * 
     */
    public Map<String,String> digest() {
        return this.digest;
    }
    /**
     * @return uri is the uri of the material
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaterialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> digest;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(MaterialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.uri = defaults.uri;
        }

        public Builder digest(Map<String,String> digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public MaterialResponse build() {
            return new MaterialResponse(digest, uri);
        }
    }
}
