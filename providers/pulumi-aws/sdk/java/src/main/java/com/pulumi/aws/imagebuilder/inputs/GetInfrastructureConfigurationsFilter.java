// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetInfrastructureConfigurationsFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetInfrastructureConfigurationsFilter Empty = new GetInfrastructureConfigurationsFilter();

    /**
     * The name of the filter field. Valid values can be found in the [Image Builder ListInfrastructureConfigurations API Reference](https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_ListInfrastructureConfigurations.html).
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    public List<String> values() {
        return this.values;
    }

    private GetInfrastructureConfigurationsFilter() {}

    private GetInfrastructureConfigurationsFilter(GetInfrastructureConfigurationsFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInfrastructureConfigurationsFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInfrastructureConfigurationsFilter $;

        public Builder() {
            $ = new GetInfrastructureConfigurationsFilter();
        }

        public Builder(GetInfrastructureConfigurationsFilter defaults) {
            $ = new GetInfrastructureConfigurationsFilter(Objects.requireNonNull(defaults));
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

        public GetInfrastructureConfigurationsFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
