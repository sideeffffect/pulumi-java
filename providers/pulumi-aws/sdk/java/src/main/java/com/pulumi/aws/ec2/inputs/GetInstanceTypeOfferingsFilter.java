// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetInstanceTypeOfferingsFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTypeOfferingsFilter Empty = new GetInstanceTypeOfferingsFilter();

    /**
     * Name of the filter. The `location` filter depends on the top-level `location_type` argument and if not specified, defaults to the current region.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * List of one or more values for the filter.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    public List<String> values() {
        return this.values;
    }

    private GetInstanceTypeOfferingsFilter() {}

    private GetInstanceTypeOfferingsFilter(GetInstanceTypeOfferingsFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceTypeOfferingsFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTypeOfferingsFilter $;

        public Builder() {
            $ = new GetInstanceTypeOfferingsFilter();
        }

        public Builder(GetInstanceTypeOfferingsFilter defaults) {
            $ = new GetInstanceTypeOfferingsFilter(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetInstanceTypeOfferingsFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
