// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.ec2.enums.EC2FleetExcessCapacityTerminationPolicy;
import com.pulumi.awsnative.ec2.enums.EC2FleetType;
import com.pulumi.awsnative.ec2.inputs.EC2FleetFleetLaunchTemplateConfigRequestArgs;
import com.pulumi.awsnative.ec2.inputs.EC2FleetOnDemandOptionsRequestArgs;
import com.pulumi.awsnative.ec2.inputs.EC2FleetSpotOptionsRequestArgs;
import com.pulumi.awsnative.ec2.inputs.EC2FleetTagSpecificationArgs;
import com.pulumi.awsnative.ec2.inputs.EC2FleetTargetCapacitySpecificationRequestArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EC2FleetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EC2FleetArgs Empty = new EC2FleetArgs();

    @Import(name="context")
    private @Nullable Output<String> context;

    public Optional<Output<String>> context() {
        return Optional.ofNullable(this.context);
    }

    @Import(name="excessCapacityTerminationPolicy")
    private @Nullable Output<EC2FleetExcessCapacityTerminationPolicy> excessCapacityTerminationPolicy;

    public Optional<Output<EC2FleetExcessCapacityTerminationPolicy>> excessCapacityTerminationPolicy() {
        return Optional.ofNullable(this.excessCapacityTerminationPolicy);
    }

    @Import(name="launchTemplateConfigs", required=true)
    private Output<List<EC2FleetFleetLaunchTemplateConfigRequestArgs>> launchTemplateConfigs;

    public Output<List<EC2FleetFleetLaunchTemplateConfigRequestArgs>> launchTemplateConfigs() {
        return this.launchTemplateConfigs;
    }

    @Import(name="onDemandOptions")
    private @Nullable Output<EC2FleetOnDemandOptionsRequestArgs> onDemandOptions;

    public Optional<Output<EC2FleetOnDemandOptionsRequestArgs>> onDemandOptions() {
        return Optional.ofNullable(this.onDemandOptions);
    }

    @Import(name="replaceUnhealthyInstances")
    private @Nullable Output<Boolean> replaceUnhealthyInstances;

    public Optional<Output<Boolean>> replaceUnhealthyInstances() {
        return Optional.ofNullable(this.replaceUnhealthyInstances);
    }

    @Import(name="spotOptions")
    private @Nullable Output<EC2FleetSpotOptionsRequestArgs> spotOptions;

    public Optional<Output<EC2FleetSpotOptionsRequestArgs>> spotOptions() {
        return Optional.ofNullable(this.spotOptions);
    }

    @Import(name="tagSpecifications")
    private @Nullable Output<List<EC2FleetTagSpecificationArgs>> tagSpecifications;

    public Optional<Output<List<EC2FleetTagSpecificationArgs>>> tagSpecifications() {
        return Optional.ofNullable(this.tagSpecifications);
    }

    @Import(name="targetCapacitySpecification", required=true)
    private Output<EC2FleetTargetCapacitySpecificationRequestArgs> targetCapacitySpecification;

    public Output<EC2FleetTargetCapacitySpecificationRequestArgs> targetCapacitySpecification() {
        return this.targetCapacitySpecification;
    }

    @Import(name="terminateInstancesWithExpiration")
    private @Nullable Output<Boolean> terminateInstancesWithExpiration;

    public Optional<Output<Boolean>> terminateInstancesWithExpiration() {
        return Optional.ofNullable(this.terminateInstancesWithExpiration);
    }

    @Import(name="type")
    private @Nullable Output<EC2FleetType> type;

    public Optional<Output<EC2FleetType>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="validFrom")
    private @Nullable Output<String> validFrom;

    public Optional<Output<String>> validFrom() {
        return Optional.ofNullable(this.validFrom);
    }

    @Import(name="validUntil")
    private @Nullable Output<String> validUntil;

    public Optional<Output<String>> validUntil() {
        return Optional.ofNullable(this.validUntil);
    }

    private EC2FleetArgs() {}

    private EC2FleetArgs(EC2FleetArgs $) {
        this.context = $.context;
        this.excessCapacityTerminationPolicy = $.excessCapacityTerminationPolicy;
        this.launchTemplateConfigs = $.launchTemplateConfigs;
        this.onDemandOptions = $.onDemandOptions;
        this.replaceUnhealthyInstances = $.replaceUnhealthyInstances;
        this.spotOptions = $.spotOptions;
        this.tagSpecifications = $.tagSpecifications;
        this.targetCapacitySpecification = $.targetCapacitySpecification;
        this.terminateInstancesWithExpiration = $.terminateInstancesWithExpiration;
        this.type = $.type;
        this.validFrom = $.validFrom;
        this.validUntil = $.validUntil;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EC2FleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EC2FleetArgs $;

        public Builder() {
            $ = new EC2FleetArgs();
        }

        public Builder(EC2FleetArgs defaults) {
            $ = new EC2FleetArgs(Objects.requireNonNull(defaults));
        }

        public Builder context(@Nullable Output<String> context) {
            $.context = context;
            return this;
        }

        public Builder context(String context) {
            return context(Output.of(context));
        }

        public Builder excessCapacityTerminationPolicy(@Nullable Output<EC2FleetExcessCapacityTerminationPolicy> excessCapacityTerminationPolicy) {
            $.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }

        public Builder excessCapacityTerminationPolicy(EC2FleetExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
            return excessCapacityTerminationPolicy(Output.of(excessCapacityTerminationPolicy));
        }

        public Builder launchTemplateConfigs(Output<List<EC2FleetFleetLaunchTemplateConfigRequestArgs>> launchTemplateConfigs) {
            $.launchTemplateConfigs = launchTemplateConfigs;
            return this;
        }

        public Builder launchTemplateConfigs(List<EC2FleetFleetLaunchTemplateConfigRequestArgs> launchTemplateConfigs) {
            return launchTemplateConfigs(Output.of(launchTemplateConfigs));
        }

        public Builder launchTemplateConfigs(EC2FleetFleetLaunchTemplateConfigRequestArgs... launchTemplateConfigs) {
            return launchTemplateConfigs(List.of(launchTemplateConfigs));
        }

        public Builder onDemandOptions(@Nullable Output<EC2FleetOnDemandOptionsRequestArgs> onDemandOptions) {
            $.onDemandOptions = onDemandOptions;
            return this;
        }

        public Builder onDemandOptions(EC2FleetOnDemandOptionsRequestArgs onDemandOptions) {
            return onDemandOptions(Output.of(onDemandOptions));
        }

        public Builder replaceUnhealthyInstances(@Nullable Output<Boolean> replaceUnhealthyInstances) {
            $.replaceUnhealthyInstances = replaceUnhealthyInstances;
            return this;
        }

        public Builder replaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
            return replaceUnhealthyInstances(Output.of(replaceUnhealthyInstances));
        }

        public Builder spotOptions(@Nullable Output<EC2FleetSpotOptionsRequestArgs> spotOptions) {
            $.spotOptions = spotOptions;
            return this;
        }

        public Builder spotOptions(EC2FleetSpotOptionsRequestArgs spotOptions) {
            return spotOptions(Output.of(spotOptions));
        }

        public Builder tagSpecifications(@Nullable Output<List<EC2FleetTagSpecificationArgs>> tagSpecifications) {
            $.tagSpecifications = tagSpecifications;
            return this;
        }

        public Builder tagSpecifications(List<EC2FleetTagSpecificationArgs> tagSpecifications) {
            return tagSpecifications(Output.of(tagSpecifications));
        }

        public Builder tagSpecifications(EC2FleetTagSpecificationArgs... tagSpecifications) {
            return tagSpecifications(List.of(tagSpecifications));
        }

        public Builder targetCapacitySpecification(Output<EC2FleetTargetCapacitySpecificationRequestArgs> targetCapacitySpecification) {
            $.targetCapacitySpecification = targetCapacitySpecification;
            return this;
        }

        public Builder targetCapacitySpecification(EC2FleetTargetCapacitySpecificationRequestArgs targetCapacitySpecification) {
            return targetCapacitySpecification(Output.of(targetCapacitySpecification));
        }

        public Builder terminateInstancesWithExpiration(@Nullable Output<Boolean> terminateInstancesWithExpiration) {
            $.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }

        public Builder terminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
            return terminateInstancesWithExpiration(Output.of(terminateInstancesWithExpiration));
        }

        public Builder type(@Nullable Output<EC2FleetType> type) {
            $.type = type;
            return this;
        }

        public Builder type(EC2FleetType type) {
            return type(Output.of(type));
        }

        public Builder validFrom(@Nullable Output<String> validFrom) {
            $.validFrom = validFrom;
            return this;
        }

        public Builder validFrom(String validFrom) {
            return validFrom(Output.of(validFrom));
        }

        public Builder validUntil(@Nullable Output<String> validUntil) {
            $.validUntil = validUntil;
            return this;
        }

        public Builder validUntil(String validUntil) {
            return validUntil(Output.of(validUntil));
        }

        public EC2FleetArgs build() {
            $.launchTemplateConfigs = Objects.requireNonNull($.launchTemplateConfigs, "expected parameter 'launchTemplateConfigs' to be non-null");
            $.targetCapacitySpecification = Objects.requireNonNull($.targetCapacitySpecification, "expected parameter 'targetCapacitySpecification' to be non-null");
            return $;
        }
    }

}
