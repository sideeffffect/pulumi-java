// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults.v1beta3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class MatrixDimensionDefinitionResponse {
    @CustomType.Constructor
    private MatrixDimensionDefinitionResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MatrixDimensionDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(MatrixDimensionDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public MatrixDimensionDefinitionResponse build() {
            return new MatrixDimensionDefinitionResponse();
        }
    }
}
