// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.inputs;

import com.pulumi.aws.guardduty.inputs.FilterFindingCriteriaCriterionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class FilterFindingCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final FilterFindingCriteriaArgs Empty = new FilterFindingCriteriaArgs();

    @Import(name="criterions", required=true)
    private Output<List<FilterFindingCriteriaCriterionArgs>> criterions;

    public Output<List<FilterFindingCriteriaCriterionArgs>> criterions() {
        return this.criterions;
    }

    private FilterFindingCriteriaArgs() {}

    private FilterFindingCriteriaArgs(FilterFindingCriteriaArgs $) {
        this.criterions = $.criterions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterFindingCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterFindingCriteriaArgs $;

        public Builder() {
            $ = new FilterFindingCriteriaArgs();
        }

        public Builder(FilterFindingCriteriaArgs defaults) {
            $ = new FilterFindingCriteriaArgs(Objects.requireNonNull(defaults));
        }

        public Builder criterions(Output<List<FilterFindingCriteriaCriterionArgs>> criterions) {
            $.criterions = criterions;
            return this;
        }

        public Builder criterions(List<FilterFindingCriteriaCriterionArgs> criterions) {
            return criterions(Output.of(criterions));
        }

        public Builder criterions(FilterFindingCriteriaCriterionArgs... criterions) {
            return criterions(List.of(criterions));
        }

        public FilterFindingCriteriaArgs build() {
            $.criterions = Objects.requireNonNull($.criterions, "expected parameter 'criterions' to be non-null");
            return $;
        }
    }

}
