// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.AlertRuleLeafConditionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Activity Log Alert rule condition that is met when all its member conditions are met.
 * Each condition can be of one of the following types:
 * __Important__: Each type has its unique subset of properties. Properties from different types CANNOT exist in one condition.
 *    * __Leaf Condition -__ must contain &#39;field&#39; and either &#39;equals&#39; or &#39;containsAny&#39;.
 *        _Please note, &#39;anyOf&#39; should __not__ be set in a Leaf Condition._
 *   * __AnyOf Condition -__ must contain __only__ &#39;anyOf&#39; (which is an array of Leaf Conditions).
 *       _Please note, &#39;field&#39;, &#39;equals&#39; and &#39;containsAny&#39; should __not__ be set in an AnyOf Condition._
 * 
 */
public final class AlertRuleAnyOfOrLeafConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertRuleAnyOfOrLeafConditionArgs Empty = new AlertRuleAnyOfOrLeafConditionArgs();

    /**
     * An Activity Log Alert rule condition that is met when at least one of its member leaf conditions are met.
     * 
     */
    @Import(name="anyOf")
    private @Nullable Output<List<AlertRuleLeafConditionArgs>> anyOf;

    public Optional<Output<List<AlertRuleLeafConditionArgs>>> anyOf() {
        return Optional.ofNullable(this.anyOf);
    }

    /**
     * The value of the event&#39;s field will be compared to the values in this array (case-insensitive) to determine if the condition is met.
     * 
     */
    @Import(name="containsAny")
    private @Nullable Output<List<String>> containsAny;

    public Optional<Output<List<String>>> containsAny() {
        return Optional.ofNullable(this.containsAny);
    }

    /**
     * The value of the event&#39;s field will be compared to this value (case-insensitive) to determine if the condition is met.
     * 
     */
    @Import(name="equals")
    private @Nullable Output<String> equals;

    public Optional<Output<String>> equals_() {
        return Optional.ofNullable(this.equals);
    }

    /**
     * The name of the Activity Log event&#39;s field that this condition will examine.
     * The possible values for this field are (case-insensitive): &#39;resourceId&#39;, &#39;category&#39;, &#39;caller&#39;, &#39;level&#39;, &#39;operationName&#39;, &#39;resourceGroup&#39;, &#39;resourceProvider&#39;, &#39;status&#39;, &#39;subStatus&#39;, &#39;resourceType&#39;, or anything beginning with &#39;properties&#39;.
     * 
     */
    @Import(name="field")
    private @Nullable Output<String> field;

    public Optional<Output<String>> field() {
        return Optional.ofNullable(this.field);
    }

    private AlertRuleAnyOfOrLeafConditionArgs() {}

    private AlertRuleAnyOfOrLeafConditionArgs(AlertRuleAnyOfOrLeafConditionArgs $) {
        this.anyOf = $.anyOf;
        this.containsAny = $.containsAny;
        this.equals = $.equals;
        this.field = $.field;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertRuleAnyOfOrLeafConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertRuleAnyOfOrLeafConditionArgs $;

        public Builder() {
            $ = new AlertRuleAnyOfOrLeafConditionArgs();
        }

        public Builder(AlertRuleAnyOfOrLeafConditionArgs defaults) {
            $ = new AlertRuleAnyOfOrLeafConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder anyOf(@Nullable Output<List<AlertRuleLeafConditionArgs>> anyOf) {
            $.anyOf = anyOf;
            return this;
        }

        public Builder anyOf(List<AlertRuleLeafConditionArgs> anyOf) {
            return anyOf(Output.of(anyOf));
        }

        public Builder anyOf(AlertRuleLeafConditionArgs... anyOf) {
            return anyOf(List.of(anyOf));
        }

        public Builder containsAny(@Nullable Output<List<String>> containsAny) {
            $.containsAny = containsAny;
            return this;
        }

        public Builder containsAny(List<String> containsAny) {
            return containsAny(Output.of(containsAny));
        }

        public Builder containsAny(String... containsAny) {
            return containsAny(List.of(containsAny));
        }

        public Builder equals_(@Nullable Output<String> equals) {
            $.equals = equals;
            return this;
        }

        public Builder equals_(String equals) {
            return equals_(Output.of(equals));
        }

        public Builder field(@Nullable Output<String> field) {
            $.field = field;
            return this;
        }

        public Builder field(String field) {
            return field(Output.of(field));
        }

        public AlertRuleAnyOfOrLeafConditionArgs build() {
            return $;
        }
    }

}
