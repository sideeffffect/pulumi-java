// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.authorization.k8s.io_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
 * 
 */
public final class AggregationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AggregationRuleArgs Empty = new AggregationRuleArgs();

    /**
     * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole&#39;s permissions will be added
     * 
     */
    @Import(name="clusterRoleSelectors")
    private @Nullable Output<List<LabelSelectorArgs>> clusterRoleSelectors;

    public Optional<Output<List<LabelSelectorArgs>>> clusterRoleSelectors() {
        return Optional.ofNullable(this.clusterRoleSelectors);
    }

    private AggregationRuleArgs() {}

    private AggregationRuleArgs(AggregationRuleArgs $) {
        this.clusterRoleSelectors = $.clusterRoleSelectors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AggregationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AggregationRuleArgs $;

        public Builder() {
            $ = new AggregationRuleArgs();
        }

        public Builder(AggregationRuleArgs defaults) {
            $ = new AggregationRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterRoleSelectors(@Nullable Output<List<LabelSelectorArgs>> clusterRoleSelectors) {
            $.clusterRoleSelectors = clusterRoleSelectors;
            return this;
        }

        public Builder clusterRoleSelectors(List<LabelSelectorArgs> clusterRoleSelectors) {
            return clusterRoleSelectors(Output.of(clusterRoleSelectors));
        }

        public Builder clusterRoleSelectors(LabelSelectorArgs... clusterRoleSelectors) {
            return clusterRoleSelectors(List.of(clusterRoleSelectors));
        }

        public AggregationRuleArgs build() {
            return $;
        }
    }

}
