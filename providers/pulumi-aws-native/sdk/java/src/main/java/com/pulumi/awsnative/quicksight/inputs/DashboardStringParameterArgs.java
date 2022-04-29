// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * &lt;p&gt;A string parameter.&lt;/p&gt;
 * 
 */
public final class DashboardStringParameterArgs extends ResourceArgs {

    public static final DashboardStringParameterArgs Empty = new DashboardStringParameterArgs();

    /**
     * &lt;p&gt;A display name for a string parameter.&lt;/p&gt;
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return &lt;p&gt;A display name for a string parameter.&lt;/p&gt;
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * &lt;p&gt;The values of a string parameter.&lt;/p&gt;
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return &lt;p&gt;The values of a string parameter.&lt;/p&gt;
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private DashboardStringParameterArgs() {}

    private DashboardStringParameterArgs(DashboardStringParameterArgs $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardStringParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardStringParameterArgs $;

        public Builder() {
            $ = new DashboardStringParameterArgs();
        }

        public Builder(DashboardStringParameterArgs defaults) {
            $ = new DashboardStringParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name &lt;p&gt;A display name for a string parameter.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name &lt;p&gt;A display name for a string parameter.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param values &lt;p&gt;The values of a string parameter.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values &lt;p&gt;The values of a string parameter.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values &lt;p&gt;The values of a string parameter.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public DashboardStringParameterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
