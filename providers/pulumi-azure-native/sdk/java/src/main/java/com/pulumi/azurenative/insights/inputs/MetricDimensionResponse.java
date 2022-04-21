// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies a metric dimension.
 * 
 */
public final class MetricDimensionResponse extends com.pulumi.resources.InvokeArgs {

    public static final MetricDimensionResponse Empty = new MetricDimensionResponse();

    /**
     * Name of the dimension.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * the dimension operator. Only &#39;Include&#39; and &#39;Exclude&#39; are supported
     * 
     */
    @Import(name="operator", required=true)
    private String operator;

    public String operator() {
        return this.operator;
    }

    /**
     * list of dimension values.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    public List<String> values() {
        return this.values;
    }

    private MetricDimensionResponse() {}

    private MetricDimensionResponse(MetricDimensionResponse $) {
        this.name = $.name;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricDimensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricDimensionResponse $;

        public Builder() {
            $ = new MetricDimensionResponse();
        }

        public Builder(MetricDimensionResponse defaults) {
            $ = new MetricDimensionResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder operator(String operator) {
            $.operator = operator;
            return this;
        }

        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public MetricDimensionResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
