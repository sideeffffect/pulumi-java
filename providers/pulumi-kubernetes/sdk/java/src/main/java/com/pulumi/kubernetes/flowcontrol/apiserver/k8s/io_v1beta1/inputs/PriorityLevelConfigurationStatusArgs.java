// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.inputs.PriorityLevelConfigurationConditionArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PriorityLevelConfigurationStatus represents the current state of a "request-priority".
 * 
 */
public final class PriorityLevelConfigurationStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final PriorityLevelConfigurationStatusArgs Empty = new PriorityLevelConfigurationStatusArgs();

    /**
     * `conditions` is the current state of "request-priority".
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<PriorityLevelConfigurationConditionArgs>> conditions;

    public Output<List<PriorityLevelConfigurationConditionArgs>> conditions() {
        return this.conditions == null ? Codegen.empty() : this.conditions;
    }

    public PriorityLevelConfigurationStatusArgs(@Nullable Output<List<PriorityLevelConfigurationConditionArgs>> conditions) {
        this.conditions = conditions;
    }

    private PriorityLevelConfigurationStatusArgs() {
        this.conditions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityLevelConfigurationStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<PriorityLevelConfigurationConditionArgs>> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(PriorityLevelConfigurationStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        public Builder conditions(@Nullable Output<List<PriorityLevelConfigurationConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<PriorityLevelConfigurationConditionArgs> conditions) {
            this.conditions = Codegen.ofNullable(conditions);
            return this;
        }
        public Builder conditions(PriorityLevelConfigurationConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }        public PriorityLevelConfigurationStatusArgs build() {
            return new PriorityLevelConfigurationStatusArgs(conditions);
        }
    }
}
