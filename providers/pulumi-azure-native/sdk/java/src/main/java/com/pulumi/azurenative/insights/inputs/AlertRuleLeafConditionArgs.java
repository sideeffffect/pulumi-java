// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Activity Log Alert rule condition that is met by comparing the field and value of an Activity Log event.
 * This condition must contain &#39;field&#39; and either &#39;equals&#39; or &#39;containsAny&#39;.
 * 
 */
public final class AlertRuleLeafConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertRuleLeafConditionArgs Empty = new AlertRuleLeafConditionArgs();

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

    private AlertRuleLeafConditionArgs() {}

    private AlertRuleLeafConditionArgs(AlertRuleLeafConditionArgs $) {
        this.containsAny = $.containsAny;
        this.equals = $.equals;
        this.field = $.field;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertRuleLeafConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertRuleLeafConditionArgs $;

        public Builder() {
            $ = new AlertRuleLeafConditionArgs();
        }

        public Builder(AlertRuleLeafConditionArgs defaults) {
            $ = new AlertRuleLeafConditionArgs(Objects.requireNonNull(defaults));
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

        public AlertRuleLeafConditionArgs build() {
            return $;
        }
    }

}
