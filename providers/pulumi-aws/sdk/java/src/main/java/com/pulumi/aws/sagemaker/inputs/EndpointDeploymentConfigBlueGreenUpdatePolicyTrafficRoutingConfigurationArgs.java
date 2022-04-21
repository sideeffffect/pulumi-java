// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeArgs;
import com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationLinearStepSizeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs Empty = new EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs();

    /**
     * Batch size for the first step to turn on traffic on the new endpoint fleet. Value must be less than or equal to 50% of the variant&#39;s total instance count. See Canary Size.
     * 
     */
    @Import(name="canarySize")
    private @Nullable Output<EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeArgs> canarySize;

    public Optional<Output<EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeArgs>> canarySize() {
        return Optional.ofNullable(this.canarySize);
    }

    /**
     * Batch size for each step to turn on traffic on the new endpoint fleet. Value must be 10-50% of the variant&#39;s total instance count. See Linear Step Size.
     * 
     */
    @Import(name="linearStepSize")
    private @Nullable Output<EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationLinearStepSizeArgs> linearStepSize;

    public Optional<Output<EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationLinearStepSizeArgs>> linearStepSize() {
        return Optional.ofNullable(this.linearStepSize);
    }

    /**
     * Specifies the endpoint capacity type. Valid values are: `INSTANCE_COUNT`, or `CAPACITY_PERCENT`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * The waiting time (in seconds) between incremental steps to turn on traffic on the new endpoint fleet. Valid values are between `0` and `3600`.
     * 
     */
    @Import(name="waitIntervalInSeconds", required=true)
    private Output<Integer> waitIntervalInSeconds;

    public Output<Integer> waitIntervalInSeconds() {
        return this.waitIntervalInSeconds;
    }

    private EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs() {}

    private EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs(EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs $) {
        this.canarySize = $.canarySize;
        this.linearStepSize = $.linearStepSize;
        this.type = $.type;
        this.waitIntervalInSeconds = $.waitIntervalInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs $;

        public Builder() {
            $ = new EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs();
        }

        public Builder(EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs defaults) {
            $ = new EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder canarySize(@Nullable Output<EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeArgs> canarySize) {
            $.canarySize = canarySize;
            return this;
        }

        public Builder canarySize(EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeArgs canarySize) {
            return canarySize(Output.of(canarySize));
        }

        public Builder linearStepSize(@Nullable Output<EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationLinearStepSizeArgs> linearStepSize) {
            $.linearStepSize = linearStepSize;
            return this;
        }

        public Builder linearStepSize(EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationLinearStepSizeArgs linearStepSize) {
            return linearStepSize(Output.of(linearStepSize));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder waitIntervalInSeconds(Output<Integer> waitIntervalInSeconds) {
            $.waitIntervalInSeconds = waitIntervalInSeconds;
            return this;
        }

        public Builder waitIntervalInSeconds(Integer waitIntervalInSeconds) {
            return waitIntervalInSeconds(Output.of(waitIntervalInSeconds));
        }

        public EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.waitIntervalInSeconds = Objects.requireNonNull($.waitIntervalInSeconds, "expected parameter 'waitIntervalInSeconds' to be non-null");
            return $;
        }
    }

}
