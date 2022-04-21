// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGroupManagerStatusStatefulPerInstanceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerStatusStatefulPerInstanceConfigArgs Empty = new InstanceGroupManagerStatusStatefulPerInstanceConfigArgs();

    /**
     * A bit indicating if all of the group&#39;s per-instance configs (listed in the output of a listPerInstanceConfigs API call) have status `EFFECTIVE` or there are no per-instance-configs.
     * 
     */
    @Import(name="allEffective")
    private @Nullable Output<Boolean> allEffective;

    public Optional<Output<Boolean>> allEffective() {
        return Optional.ofNullable(this.allEffective);
    }

    private InstanceGroupManagerStatusStatefulPerInstanceConfigArgs() {}

    private InstanceGroupManagerStatusStatefulPerInstanceConfigArgs(InstanceGroupManagerStatusStatefulPerInstanceConfigArgs $) {
        this.allEffective = $.allEffective;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerStatusStatefulPerInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerStatusStatefulPerInstanceConfigArgs $;

        public Builder() {
            $ = new InstanceGroupManagerStatusStatefulPerInstanceConfigArgs();
        }

        public Builder(InstanceGroupManagerStatusStatefulPerInstanceConfigArgs defaults) {
            $ = new InstanceGroupManagerStatusStatefulPerInstanceConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder allEffective(@Nullable Output<Boolean> allEffective) {
            $.allEffective = allEffective;
            return this;
        }

        public Builder allEffective(Boolean allEffective) {
            return allEffective(Output.of(allEffective));
        }

        public InstanceGroupManagerStatusStatefulPerInstanceConfigArgs build() {
            return $;
        }
    }

}
