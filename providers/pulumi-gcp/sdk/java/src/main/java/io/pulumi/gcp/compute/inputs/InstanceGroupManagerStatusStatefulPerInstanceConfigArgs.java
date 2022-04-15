// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerStatusStatefulPerInstanceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerStatusStatefulPerInstanceConfigArgs Empty = new InstanceGroupManagerStatusStatefulPerInstanceConfigArgs();

    /**
     * A bit indicating if all of the group's per-instance configs (listed in the output of a listPerInstanceConfigs API call) have status `EFFECTIVE` or there are no per-instance-configs.
     * 
     */
    @Import(name="allEffective")
      private final @Nullable Output<Boolean> allEffective;

    public Output<Boolean> allEffective() {
        return this.allEffective == null ? Codegen.empty() : this.allEffective;
    }

    public InstanceGroupManagerStatusStatefulPerInstanceConfigArgs(@Nullable Output<Boolean> allEffective) {
        this.allEffective = allEffective;
    }

    private InstanceGroupManagerStatusStatefulPerInstanceConfigArgs() {
        this.allEffective = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatusStatefulPerInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allEffective;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatusStatefulPerInstanceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allEffective = defaults.allEffective;
        }

        public Builder allEffective(@Nullable Output<Boolean> allEffective) {
            this.allEffective = allEffective;
            return this;
        }
        public Builder allEffective(@Nullable Boolean allEffective) {
            this.allEffective = Codegen.ofNullable(allEffective);
            return this;
        }        public InstanceGroupManagerStatusStatefulPerInstanceConfigArgs build() {
            return new InstanceGroupManagerStatusStatefulPerInstanceConfigArgs(allEffective);
        }
    }
}
