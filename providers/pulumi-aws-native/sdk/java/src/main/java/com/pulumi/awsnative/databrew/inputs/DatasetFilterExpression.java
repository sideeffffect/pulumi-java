// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.awsnative.databrew.inputs.DatasetFilterValue;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DatasetFilterExpression extends com.pulumi.resources.InvokeArgs {

    public static final DatasetFilterExpression Empty = new DatasetFilterExpression();

    /**
     * Filtering expression for a parameter
     * 
     */
    @Import(name="expression", required=true)
    private String expression;

    public String expression() {
        return this.expression;
    }

    @Import(name="valuesMap", required=true)
    private List<DatasetFilterValue> valuesMap;

    public List<DatasetFilterValue> valuesMap() {
        return this.valuesMap;
    }

    private DatasetFilterExpression() {}

    private DatasetFilterExpression(DatasetFilterExpression $) {
        this.expression = $.expression;
        this.valuesMap = $.valuesMap;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetFilterExpression defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetFilterExpression $;

        public Builder() {
            $ = new DatasetFilterExpression();
        }

        public Builder(DatasetFilterExpression defaults) {
            $ = new DatasetFilterExpression(Objects.requireNonNull(defaults));
        }

        public Builder expression(String expression) {
            $.expression = expression;
            return this;
        }

        public Builder valuesMap(List<DatasetFilterValue> valuesMap) {
            $.valuesMap = valuesMap;
            return this;
        }

        public Builder valuesMap(DatasetFilterValue... valuesMap) {
            return valuesMap(List.of(valuesMap));
        }

        public DatasetFilterExpression build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            $.valuesMap = Objects.requireNonNull($.valuesMap, "expected parameter 'valuesMap' to be non-null");
            return $;
        }
    }

}
