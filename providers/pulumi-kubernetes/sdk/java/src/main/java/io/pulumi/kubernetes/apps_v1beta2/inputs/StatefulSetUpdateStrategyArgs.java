// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.apps_v1beta2.inputs.RollingUpdateStatefulSetStrategyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
 * 
 */
public final class StatefulSetUpdateStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatefulSetUpdateStrategyArgs Empty = new StatefulSetUpdateStrategyArgs();

    /**
     * RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
     * 
     */
    @InputImport(name="rollingUpdate")
      private final @Nullable Input<RollingUpdateStatefulSetStrategyArgs> rollingUpdate;

    public Input<RollingUpdateStatefulSetStrategyArgs> getRollingUpdate() {
        return this.rollingUpdate == null ? Input.empty() : this.rollingUpdate;
    }

    /**
     * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public StatefulSetUpdateStrategyArgs(
        @Nullable Input<RollingUpdateStatefulSetStrategyArgs> rollingUpdate,
        @Nullable Input<String> type) {
        this.rollingUpdate = rollingUpdate;
        this.type = type;
    }

    private StatefulSetUpdateStrategyArgs() {
        this.rollingUpdate = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetUpdateStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RollingUpdateStatefulSetStrategyArgs> rollingUpdate;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulSetUpdateStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.type = defaults.type;
        }

        public Builder rollingUpdate(@Nullable Input<RollingUpdateStatefulSetStrategyArgs> rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }

        public Builder rollingUpdate(@Nullable RollingUpdateStatefulSetStrategyArgs rollingUpdate) {
            this.rollingUpdate = Input.ofNullable(rollingUpdate);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public StatefulSetUpdateStrategyArgs build() {
            return new StatefulSetUpdateStrategyArgs(rollingUpdate, type);
        }
    }
}
