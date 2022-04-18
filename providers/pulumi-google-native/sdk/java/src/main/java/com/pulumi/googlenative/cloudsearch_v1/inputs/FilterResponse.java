// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudsearch_v1.inputs.CompositeFilterResponse;
import com.pulumi.googlenative.cloudsearch_v1.inputs.ValueFilterResponse;
import java.util.Objects;


/**
 * A generic way of expressing filters in a query, which supports two approaches: **1. Setting a ValueFilter.** The name must match an operator_name defined in the schema for your data source. **2. Setting a CompositeFilter.** The filters are evaluated using the logical operator. The top-level operators can only be either an AND or a NOT. AND can appear only at the top-most level. OR can appear only under a top-level AND.
 * 
 */
public final class FilterResponse extends com.pulumi.resources.InvokeArgs {

    public static final FilterResponse Empty = new FilterResponse();

    @Import(name="compositeFilter", required=true)
      private final CompositeFilterResponse compositeFilter;

    public CompositeFilterResponse compositeFilter() {
        return this.compositeFilter;
    }

    @Import(name="valueFilter", required=true)
      private final ValueFilterResponse valueFilter;

    public ValueFilterResponse valueFilter() {
        return this.valueFilter;
    }

    public FilterResponse(
        CompositeFilterResponse compositeFilter,
        ValueFilterResponse valueFilter) {
        this.compositeFilter = Objects.requireNonNull(compositeFilter, "expected parameter 'compositeFilter' to be non-null");
        this.valueFilter = Objects.requireNonNull(valueFilter, "expected parameter 'valueFilter' to be non-null");
    }

    private FilterResponse() {
        this.compositeFilter = null;
        this.valueFilter = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CompositeFilterResponse compositeFilter;
        private ValueFilterResponse valueFilter;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compositeFilter = defaults.compositeFilter;
    	      this.valueFilter = defaults.valueFilter;
        }

        public Builder compositeFilter(CompositeFilterResponse compositeFilter) {
            this.compositeFilter = Objects.requireNonNull(compositeFilter);
            return this;
        }
        public Builder valueFilter(ValueFilterResponse valueFilter) {
            this.valueFilter = Objects.requireNonNull(valueFilter);
            return this;
        }        public FilterResponse build() {
            return new FilterResponse(compositeFilter, valueFilter);
        }
    }
}
