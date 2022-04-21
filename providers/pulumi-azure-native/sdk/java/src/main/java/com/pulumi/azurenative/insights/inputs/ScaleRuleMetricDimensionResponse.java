// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies an auto scale rule metric dimension.
 * 
 */
public final class ScaleRuleMetricDimensionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScaleRuleMetricDimensionResponse Empty = new ScaleRuleMetricDimensionResponse();

    /**
     * Name of the dimension.
     * 
     */
    @Import(name="dimensionName", required=true)
    private String dimensionName;

    public String dimensionName() {
        return this.dimensionName;
    }

    /**
     * the dimension operator. Only &#39;Equals&#39; and &#39;NotEquals&#39; are supported. &#39;Equals&#39; being equal to any of the values. &#39;NotEquals&#39; being not equal to all of the values
     * 
     */
    @Import(name="operator", required=true)
    private String operator;

    public String operator() {
        return this.operator;
    }

    /**
     * list of dimension values. For example: [&#34;App1&#34;,&#34;App2&#34;].
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    public List<String> values() {
        return this.values;
    }

    private ScaleRuleMetricDimensionResponse() {}

    private ScaleRuleMetricDimensionResponse(ScaleRuleMetricDimensionResponse $) {
        this.dimensionName = $.dimensionName;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScaleRuleMetricDimensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScaleRuleMetricDimensionResponse $;

        public Builder() {
            $ = new ScaleRuleMetricDimensionResponse();
        }

        public Builder(ScaleRuleMetricDimensionResponse defaults) {
            $ = new ScaleRuleMetricDimensionResponse(Objects.requireNonNull(defaults));
        }

        public Builder dimensionName(String dimensionName) {
            $.dimensionName = dimensionName;
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

        public ScaleRuleMetricDimensionResponse build() {
            $.dimensionName = Objects.requireNonNull($.dimensionName, "expected parameter 'dimensionName' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
