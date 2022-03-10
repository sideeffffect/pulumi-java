// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.WebACLSizeConstraintStatementComparisonOperator;
import io.pulumi.awsnative.wafv2.inputs.WebACLFieldToMatchArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLTextTransformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.List;
import java.util.Objects;


/**
 * Size Constraint statement.
 * 
 */
public final class WebACLSizeConstraintStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLSizeConstraintStatementArgs Empty = new WebACLSizeConstraintStatementArgs();

    @InputImport(name="comparisonOperator", required=true)
      private final Input<WebACLSizeConstraintStatementComparisonOperator> comparisonOperator;

    public Input<WebACLSizeConstraintStatementComparisonOperator> getComparisonOperator() {
        return this.comparisonOperator;
    }

    @InputImport(name="fieldToMatch", required=true)
      private final Input<WebACLFieldToMatchArgs> fieldToMatch;

    public Input<WebACLFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch;
    }

    @InputImport(name="size", required=true)
      private final Input<Double> size;

    public Input<Double> getSize() {
        return this.size;
    }

    @InputImport(name="textTransformations", required=true)
      private final Input<List<WebACLTextTransformationArgs>> textTransformations;

    public Input<List<WebACLTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebACLSizeConstraintStatementArgs(
        Input<WebACLSizeConstraintStatementComparisonOperator> comparisonOperator,
        Input<WebACLFieldToMatchArgs> fieldToMatch,
        Input<Double> size,
        Input<List<WebACLTextTransformationArgs>> textTransformations) {
        this.comparisonOperator = Objects.requireNonNull(comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebACLSizeConstraintStatementArgs() {
        this.comparisonOperator = Input.empty();
        this.fieldToMatch = Input.empty();
        this.size = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLSizeConstraintStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<WebACLSizeConstraintStatementComparisonOperator> comparisonOperator;
        private Input<WebACLFieldToMatchArgs> fieldToMatch;
        private Input<Double> size;
        private Input<List<WebACLTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLSizeConstraintStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.size = defaults.size;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder comparisonOperator(Input<WebACLSizeConstraintStatementComparisonOperator> comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }

        public Builder comparisonOperator(WebACLSizeConstraintStatementComparisonOperator comparisonOperator) {
            this.comparisonOperator = Input.of(Objects.requireNonNull(comparisonOperator));
            return this;
        }

        public Builder fieldToMatch(Input<WebACLFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder fieldToMatch(WebACLFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Input.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }

        public Builder size(Input<Double> size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder size(Double size) {
            this.size = Input.of(Objects.requireNonNull(size));
            return this;
        }

        public Builder textTransformations(Input<List<WebACLTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder textTransformations(List<WebACLTextTransformationArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebACLSizeConstraintStatementArgs build() {
            return new WebACLSizeConstraintStatementArgs(comparisonOperator, fieldToMatch, size, textTransformations);
        }
    }
}
