// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SchemaConfigResponse {
    /**
     * @return The depth for all recursive structures in the output analytics schema. For example, `concept` in the CodeSystem resource is a recursive structure; when the depth is 2, the CodeSystem table will have a column called `concept.concept` but not `concept.concept.concept`. If not specified or set to 0, the server will use the default value 2. The maximum depth allowed is 5.
     * 
     */
    private final String recursiveStructureDepth;
    /**
     * @return Specifies the output schema type. Schema type is required.
     * 
     */
    private final String schemaType;

    @CustomType.Constructor
    private SchemaConfigResponse(
        @CustomType.Parameter("recursiveStructureDepth") String recursiveStructureDepth,
        @CustomType.Parameter("schemaType") String schemaType) {
        this.recursiveStructureDepth = recursiveStructureDepth;
        this.schemaType = schemaType;
    }

    /**
     * @return The depth for all recursive structures in the output analytics schema. For example, `concept` in the CodeSystem resource is a recursive structure; when the depth is 2, the CodeSystem table will have a column called `concept.concept` but not `concept.concept.concept`. If not specified or set to 0, the server will use the default value 2. The maximum depth allowed is 5.
     * 
     */
    public String recursiveStructureDepth() {
        return this.recursiveStructureDepth;
    }
    /**
     * @return Specifies the output schema type. Schema type is required.
     * 
     */
    public String schemaType() {
        return this.schemaType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recursiveStructureDepth;
        private String schemaType;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recursiveStructureDepth = defaults.recursiveStructureDepth;
    	      this.schemaType = defaults.schemaType;
        }

        public Builder recursiveStructureDepth(String recursiveStructureDepth) {
            this.recursiveStructureDepth = Objects.requireNonNull(recursiveStructureDepth);
            return this;
        }
        public Builder schemaType(String schemaType) {
            this.schemaType = Objects.requireNonNull(schemaType);
            return this;
        }        public SchemaConfigResponse build() {
            return new SchemaConfigResponse(recursiveStructureDepth, schemaType);
        }
    }
}
