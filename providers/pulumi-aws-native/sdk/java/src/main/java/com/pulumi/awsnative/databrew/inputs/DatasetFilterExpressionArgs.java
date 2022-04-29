// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.awsnative.databrew.inputs.DatasetFilterValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DatasetFilterExpressionArgs extends ResourceArgs {

    public static final DatasetFilterExpressionArgs Empty = new DatasetFilterExpressionArgs();

    /**
     * Filtering expression for a parameter
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return Filtering expression for a parameter
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    @Import(name="valuesMap", required=true)
    private Output<List<DatasetFilterValueArgs>> valuesMap;

    public Output<List<DatasetFilterValueArgs>> valuesMap() {
        return this.valuesMap;
    }

    private DatasetFilterExpressionArgs() {}

    private DatasetFilterExpressionArgs(DatasetFilterExpressionArgs $) {
        this.expression = $.expression;
        this.valuesMap = $.valuesMap;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetFilterExpressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetFilterExpressionArgs $;

        public Builder() {
            $ = new DatasetFilterExpressionArgs();
        }

        public Builder(DatasetFilterExpressionArgs defaults) {
            $ = new DatasetFilterExpressionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expression Filtering expression for a parameter
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression Filtering expression for a parameter
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        public Builder valuesMap(Output<List<DatasetFilterValueArgs>> valuesMap) {
            $.valuesMap = valuesMap;
            return this;
        }

        public Builder valuesMap(List<DatasetFilterValueArgs> valuesMap) {
            return valuesMap(Output.of(valuesMap));
        }

        public Builder valuesMap(DatasetFilterValueArgs... valuesMap) {
            return valuesMap(List.of(valuesMap));
        }

        public DatasetFilterExpressionArgs build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            $.valuesMap = Objects.requireNonNull($.valuesMap, "expected parameter 'valuesMap' to be non-null");
            return $;
        }
    }

}
