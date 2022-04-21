// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.azurenative.costmanagement.inputs.SourceCostAllocationResourceArgs;
import com.pulumi.azurenative.costmanagement.inputs.TargetCostAllocationResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Resource details of the cost allocation rule
 * 
 */
public final class CostAllocationRuleDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CostAllocationRuleDetailsArgs Empty = new CostAllocationRuleDetailsArgs();

    /**
     * Source resources for cost allocation. At this time, this list can contain no more than one element.
     * 
     */
    @Import(name="sourceResources")
    private @Nullable Output<List<SourceCostAllocationResourceArgs>> sourceResources;

    public Optional<Output<List<SourceCostAllocationResourceArgs>>> sourceResources() {
        return Optional.ofNullable(this.sourceResources);
    }

    /**
     * Target resources for cost allocation. At this time, this list can contain no more than one element.
     * 
     */
    @Import(name="targetResources")
    private @Nullable Output<List<TargetCostAllocationResourceArgs>> targetResources;

    public Optional<Output<List<TargetCostAllocationResourceArgs>>> targetResources() {
        return Optional.ofNullable(this.targetResources);
    }

    private CostAllocationRuleDetailsArgs() {}

    private CostAllocationRuleDetailsArgs(CostAllocationRuleDetailsArgs $) {
        this.sourceResources = $.sourceResources;
        this.targetResources = $.targetResources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CostAllocationRuleDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CostAllocationRuleDetailsArgs $;

        public Builder() {
            $ = new CostAllocationRuleDetailsArgs();
        }

        public Builder(CostAllocationRuleDetailsArgs defaults) {
            $ = new CostAllocationRuleDetailsArgs(Objects.requireNonNull(defaults));
        }

        public Builder sourceResources(@Nullable Output<List<SourceCostAllocationResourceArgs>> sourceResources) {
            $.sourceResources = sourceResources;
            return this;
        }

        public Builder sourceResources(List<SourceCostAllocationResourceArgs> sourceResources) {
            return sourceResources(Output.of(sourceResources));
        }

        public Builder sourceResources(SourceCostAllocationResourceArgs... sourceResources) {
            return sourceResources(List.of(sourceResources));
        }

        public Builder targetResources(@Nullable Output<List<TargetCostAllocationResourceArgs>> targetResources) {
            $.targetResources = targetResources;
            return this;
        }

        public Builder targetResources(List<TargetCostAllocationResourceArgs> targetResources) {
            return targetResources(Output.of(targetResources));
        }

        public Builder targetResources(TargetCostAllocationResourceArgs... targetResources) {
            return targetResources(List.of(targetResources));
        }

        public CostAllocationRuleDetailsArgs build() {
            return $;
        }
    }

}
