// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigquery_v2.outputs.QueryParameterTypeStructTypesItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class QueryParameterTypeResponse {
    /**
     * [Optional] The type of the array's elements, if this is an array.
     * 
     */
    private final QueryParameterTypeResponse arrayType;
    /**
     * [Optional] The types of the fields of this struct, in order, if this is a struct.
     * 
     */
    private final List<QueryParameterTypeStructTypesItemResponse> structTypes;
    /**
     * [Required] The top level type of this field.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private QueryParameterTypeResponse(
        @CustomType.Parameter("arrayType") QueryParameterTypeResponse arrayType,
        @CustomType.Parameter("structTypes") List<QueryParameterTypeStructTypesItemResponse> structTypes,
        @CustomType.Parameter("type") String type) {
        this.arrayType = arrayType;
        this.structTypes = structTypes;
        this.type = type;
    }

    /**
     * [Optional] The type of the array's elements, if this is an array.
     * 
    */
    public QueryParameterTypeResponse arrayType() {
        return this.arrayType;
    }
    /**
     * [Optional] The types of the fields of this struct, in order, if this is a struct.
     * 
    */
    public List<QueryParameterTypeStructTypesItemResponse> structTypes() {
        return this.structTypes;
    }
    /**
     * [Required] The top level type of this field.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryParameterTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueryParameterTypeResponse arrayType;
        private List<QueryParameterTypeStructTypesItemResponse> structTypes;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryParameterTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arrayType = defaults.arrayType;
    	      this.structTypes = defaults.structTypes;
    	      this.type = defaults.type;
        }

        public Builder arrayType(QueryParameterTypeResponse arrayType) {
            this.arrayType = Objects.requireNonNull(arrayType);
            return this;
        }
        public Builder structTypes(List<QueryParameterTypeStructTypesItemResponse> structTypes) {
            this.structTypes = Objects.requireNonNull(structTypes);
            return this;
        }
        public Builder structTypes(QueryParameterTypeStructTypesItemResponse... structTypes) {
            return structTypes(List.of(structTypes));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public QueryParameterTypeResponse build() {
            return new QueryParameterTypeResponse(arrayType, structTypes, type);
        }
    }
}
