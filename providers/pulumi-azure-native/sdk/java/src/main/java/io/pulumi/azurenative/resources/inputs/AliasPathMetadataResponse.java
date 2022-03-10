// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AliasPathMetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final AliasPathMetadataResponse Empty = new AliasPathMetadataResponse();

    /**
     * The attributes of the token that the alias path is referring to.
     * 
     */
    @InputImport(name="attributes", required=true)
      private final String attributes;

    public String getAttributes() {
        return this.attributes;
    }

    /**
     * The type of the token that the alias path is referring to.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public AliasPathMetadataResponse(
        String attributes,
        String type) {
        this.attributes = Objects.requireNonNull(attributes, "expected parameter 'attributes' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AliasPathMetadataResponse() {
        this.attributes = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasPathMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attributes;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasPathMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.type = defaults.type;
        }

        public Builder attributes(String attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AliasPathMetadataResponse build() {
            return new AliasPathMetadataResponse(attributes, type);
        }
    }
}
