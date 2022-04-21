// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.inputs.PriorityLevelConfigurationConditionArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PriorityLevelConfigurationStatus represents the current state of a &#34;request-priority&#34;.
 * 
 */
public final class PriorityLevelConfigurationStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final PriorityLevelConfigurationStatusArgs Empty = new PriorityLevelConfigurationStatusArgs();

    /**
     * `conditions` is the current state of &#34;request-priority&#34;.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<PriorityLevelConfigurationConditionArgs>> conditions;

    public Optional<Output<List<PriorityLevelConfigurationConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    private PriorityLevelConfigurationStatusArgs() {}

    private PriorityLevelConfigurationStatusArgs(PriorityLevelConfigurationStatusArgs $) {
        this.conditions = $.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PriorityLevelConfigurationStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PriorityLevelConfigurationStatusArgs $;

        public Builder() {
            $ = new PriorityLevelConfigurationStatusArgs();
        }

        public Builder(PriorityLevelConfigurationStatusArgs defaults) {
            $ = new PriorityLevelConfigurationStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditions(@Nullable Output<List<PriorityLevelConfigurationConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<PriorityLevelConfigurationConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(PriorityLevelConfigurationConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public PriorityLevelConfigurationStatusArgs build() {
            return $;
        }
    }

}
