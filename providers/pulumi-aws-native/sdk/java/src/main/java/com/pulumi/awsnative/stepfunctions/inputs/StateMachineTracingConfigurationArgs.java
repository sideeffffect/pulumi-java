// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.stepfunctions.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StateMachineTracingConfigurationArgs extends ResourceArgs {

    public static final StateMachineTracingConfigurationArgs Empty = new StateMachineTracingConfigurationArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private StateMachineTracingConfigurationArgs() {}

    private StateMachineTracingConfigurationArgs(StateMachineTracingConfigurationArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StateMachineTracingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StateMachineTracingConfigurationArgs $;

        public Builder() {
            $ = new StateMachineTracingConfigurationArgs();
        }

        public Builder(StateMachineTracingConfigurationArgs defaults) {
            $ = new StateMachineTracingConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public StateMachineTracingConfigurationArgs build() {
            return $;
        }
    }

}
