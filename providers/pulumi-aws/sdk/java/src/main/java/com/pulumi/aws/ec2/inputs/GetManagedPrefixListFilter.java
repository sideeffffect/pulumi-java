// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetManagedPrefixListFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedPrefixListFilter Empty = new GetManagedPrefixListFilter();

    /**
     * The name of the filter field. Valid values can be found in the EC2 [DescribeManagedPrefixLists](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeManagedPrefixLists.html) API Reference.
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

    private GetManagedPrefixListFilter() {}

    private GetManagedPrefixListFilter(GetManagedPrefixListFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedPrefixListFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedPrefixListFilter $;

        public Builder() {
            $ = new GetManagedPrefixListFilter();
        }

        public Builder(GetManagedPrefixListFilter defaults) {
            $ = new GetManagedPrefixListFilter(Objects.requireNonNull(defaults));
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

        public GetManagedPrefixListFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
