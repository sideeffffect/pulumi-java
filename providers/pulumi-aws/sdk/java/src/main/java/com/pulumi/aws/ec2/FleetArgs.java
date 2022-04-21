// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigArgs;
import com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsArgs;
import com.pulumi.aws.ec2.inputs.FleetSpotOptionsArgs;
import com.pulumi.aws.ec2.inputs.FleetTargetCapacitySpecificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FleetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FleetArgs Empty = new FleetArgs();

    /**
     * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
     * 
     */
    @Import(name="excessCapacityTerminationPolicy")
    private @Nullable Output<String> excessCapacityTerminationPolicy;

    public Optional<Output<String>> excessCapacityTerminationPolicy() {
        return Optional.ofNullable(this.excessCapacityTerminationPolicy);
    }

    /**
     * Nested argument containing EC2 Launch Template configurations. Defined below.
     * 
     */
    @Import(name="launchTemplateConfig", required=true)
    private Output<FleetLaunchTemplateConfigArgs> launchTemplateConfig;

    public Output<FleetLaunchTemplateConfigArgs> launchTemplateConfig() {
        return this.launchTemplateConfig;
    }

    /**
     * Nested argument containing On-Demand configurations. Defined below.
     * 
     */
    @Import(name="onDemandOptions")
    private @Nullable Output<FleetOnDemandOptionsArgs> onDemandOptions;

    public Optional<Output<FleetOnDemandOptionsArgs>> onDemandOptions() {
        return Optional.ofNullable(this.onDemandOptions);
    }

    /**
     * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
     * 
     */
    @Import(name="replaceUnhealthyInstances")
    private @Nullable Output<Boolean> replaceUnhealthyInstances;

    public Optional<Output<Boolean>> replaceUnhealthyInstances() {
        return Optional.ofNullable(this.replaceUnhealthyInstances);
    }

    /**
     * Nested argument containing Spot configurations. Defined below.
     * 
     */
    @Import(name="spotOptions")
    private @Nullable Output<FleetSpotOptionsArgs> spotOptions;

    public Optional<Output<FleetSpotOptionsArgs>> spotOptions() {
        return Optional.ofNullable(this.spotOptions);
    }

    /**
     * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Nested argument containing target capacity configurations. Defined below.
     * 
     */
    @Import(name="targetCapacitySpecification", required=true)
    private Output<FleetTargetCapacitySpecificationArgs> targetCapacitySpecification;

    public Output<FleetTargetCapacitySpecificationArgs> targetCapacitySpecification() {
        return this.targetCapacitySpecification;
    }

    /**
     * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
     * 
     */
    @Import(name="terminateInstances")
    private @Nullable Output<Boolean> terminateInstances;

    public Optional<Output<Boolean>> terminateInstances() {
        return Optional.ofNullable(this.terminateInstances);
    }

    /**
     * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
     * 
     */
    @Import(name="terminateInstancesWithExpiration")
    private @Nullable Output<Boolean> terminateInstancesWithExpiration;

    public Optional<Output<Boolean>> terminateInstancesWithExpiration() {
        return Optional.ofNullable(this.terminateInstancesWithExpiration);
    }

    /**
     * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private FleetArgs() {}

    private FleetArgs(FleetArgs $) {
        this.excessCapacityTerminationPolicy = $.excessCapacityTerminationPolicy;
        this.launchTemplateConfig = $.launchTemplateConfig;
        this.onDemandOptions = $.onDemandOptions;
        this.replaceUnhealthyInstances = $.replaceUnhealthyInstances;
        this.spotOptions = $.spotOptions;
        this.tags = $.tags;
        this.targetCapacitySpecification = $.targetCapacitySpecification;
        this.terminateInstances = $.terminateInstances;
        this.terminateInstancesWithExpiration = $.terminateInstancesWithExpiration;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetArgs $;

        public Builder() {
            $ = new FleetArgs();
        }

        public Builder(FleetArgs defaults) {
            $ = new FleetArgs(Objects.requireNonNull(defaults));
        }

        public Builder excessCapacityTerminationPolicy(@Nullable Output<String> excessCapacityTerminationPolicy) {
            $.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }

        public Builder excessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
            return excessCapacityTerminationPolicy(Output.of(excessCapacityTerminationPolicy));
        }

        public Builder launchTemplateConfig(Output<FleetLaunchTemplateConfigArgs> launchTemplateConfig) {
            $.launchTemplateConfig = launchTemplateConfig;
            return this;
        }

        public Builder launchTemplateConfig(FleetLaunchTemplateConfigArgs launchTemplateConfig) {
            return launchTemplateConfig(Output.of(launchTemplateConfig));
        }

        public Builder onDemandOptions(@Nullable Output<FleetOnDemandOptionsArgs> onDemandOptions) {
            $.onDemandOptions = onDemandOptions;
            return this;
        }

        public Builder onDemandOptions(FleetOnDemandOptionsArgs onDemandOptions) {
            return onDemandOptions(Output.of(onDemandOptions));
        }

        public Builder replaceUnhealthyInstances(@Nullable Output<Boolean> replaceUnhealthyInstances) {
            $.replaceUnhealthyInstances = replaceUnhealthyInstances;
            return this;
        }

        public Builder replaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
            return replaceUnhealthyInstances(Output.of(replaceUnhealthyInstances));
        }

        public Builder spotOptions(@Nullable Output<FleetSpotOptionsArgs> spotOptions) {
            $.spotOptions = spotOptions;
            return this;
        }

        public Builder spotOptions(FleetSpotOptionsArgs spotOptions) {
            return spotOptions(Output.of(spotOptions));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder targetCapacitySpecification(Output<FleetTargetCapacitySpecificationArgs> targetCapacitySpecification) {
            $.targetCapacitySpecification = targetCapacitySpecification;
            return this;
        }

        public Builder targetCapacitySpecification(FleetTargetCapacitySpecificationArgs targetCapacitySpecification) {
            return targetCapacitySpecification(Output.of(targetCapacitySpecification));
        }

        public Builder terminateInstances(@Nullable Output<Boolean> terminateInstances) {
            $.terminateInstances = terminateInstances;
            return this;
        }

        public Builder terminateInstances(Boolean terminateInstances) {
            return terminateInstances(Output.of(terminateInstances));
        }

        public Builder terminateInstancesWithExpiration(@Nullable Output<Boolean> terminateInstancesWithExpiration) {
            $.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }

        public Builder terminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
            return terminateInstancesWithExpiration(Output.of(terminateInstancesWithExpiration));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FleetArgs build() {
            $.launchTemplateConfig = Objects.requireNonNull($.launchTemplateConfig, "expected parameter 'launchTemplateConfig' to be non-null");
            $.targetCapacitySpecification = Objects.requireNonNull($.targetCapacitySpecification, "expected parameter 'targetCapacitySpecification' to be non-null");
            return $;
        }
    }

}
