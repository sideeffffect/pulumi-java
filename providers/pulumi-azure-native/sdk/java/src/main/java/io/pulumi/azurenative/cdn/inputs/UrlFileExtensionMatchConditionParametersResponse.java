// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the parameters for UrlFileExtension match conditions
 * 
 */
public final class UrlFileExtensionMatchConditionParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final UrlFileExtensionMatchConditionParametersResponse Empty = new UrlFileExtensionMatchConditionParametersResponse();

    /**
     * The match value for the condition of the delivery rule
     * 
     */
    @InputImport(name="matchValues")
      private final @Nullable List<String> matchValues;

    public List<String> getMatchValues() {
        return this.matchValues == null ? List.of() : this.matchValues;
    }

    /**
     * Describes if this is negate condition or not
     * 
     */
    @InputImport(name="negateCondition")
      private final @Nullable Boolean negateCondition;

    public Optional<Boolean> getNegateCondition() {
        return this.negateCondition == null ? Optional.empty() : Optional.ofNullable(this.negateCondition);
    }

    @InputImport(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Describes operator to be matched
     * 
     */
    @InputImport(name="operator", required=true)
      private final String operator;

    public String getOperator() {
        return this.operator;
    }

    /**
     * List of transforms
     * 
     */
    @InputImport(name="transforms")
      private final @Nullable List<String> transforms;

    public List<String> getTransforms() {
        return this.transforms == null ? List.of() : this.transforms;
    }

    public UrlFileExtensionMatchConditionParametersResponse(
        @Nullable List<String> matchValues,
        @Nullable Boolean negateCondition,
        String odataType,
        String operator,
        @Nullable List<String> transforms) {
        this.matchValues = matchValues;
        this.negateCondition = negateCondition;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.transforms = transforms;
    }

    private UrlFileExtensionMatchConditionParametersResponse() {
        this.matchValues = List.of();
        this.negateCondition = null;
        this.odataType = null;
        this.operator = null;
        this.transforms = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlFileExtensionMatchConditionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> matchValues;
        private @Nullable Boolean negateCondition;
        private String odataType;
        private String operator;
        private @Nullable List<String> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlFileExtensionMatchConditionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.negateCondition = defaults.negateCondition;
    	      this.odataType = defaults.odataType;
    	      this.operator = defaults.operator;
    	      this.transforms = defaults.transforms;
        }

        public Builder matchValues(@Nullable List<String> matchValues) {
            this.matchValues = matchValues;
            return this;
        }

        public Builder negateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder transforms(@Nullable List<String> transforms) {
            this.transforms = transforms;
            return this;
        }
        public UrlFileExtensionMatchConditionParametersResponse build() {
            return new UrlFileExtensionMatchConditionParametersResponse(matchValues, negateCondition, odataType, operator, transforms);
        }
    }
}
