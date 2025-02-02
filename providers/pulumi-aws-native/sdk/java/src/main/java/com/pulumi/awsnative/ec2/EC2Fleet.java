// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ec2.EC2FleetArgs;
import com.pulumi.awsnative.ec2.enums.EC2FleetExcessCapacityTerminationPolicy;
import com.pulumi.awsnative.ec2.enums.EC2FleetType;
import com.pulumi.awsnative.ec2.outputs.EC2FleetFleetLaunchTemplateConfigRequest;
import com.pulumi.awsnative.ec2.outputs.EC2FleetOnDemandOptionsRequest;
import com.pulumi.awsnative.ec2.outputs.EC2FleetSpotOptionsRequest;
import com.pulumi.awsnative.ec2.outputs.EC2FleetTagSpecification;
import com.pulumi.awsnative.ec2.outputs.EC2FleetTargetCapacitySpecificationRequest;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::EC2::EC2Fleet
 * 
 */
@ResourceType(type="aws-native:ec2:EC2Fleet")
public class EC2Fleet extends com.pulumi.resources.CustomResource {
    @Export(name="context", type=String.class, parameters={})
    private Output</* @Nullable */ String> context;

    public Output<Optional<String>> context() {
        return Codegen.optional(this.context);
    }
    @Export(name="excessCapacityTerminationPolicy", type=EC2FleetExcessCapacityTerminationPolicy.class, parameters={})
    private Output</* @Nullable */ EC2FleetExcessCapacityTerminationPolicy> excessCapacityTerminationPolicy;

    public Output<Optional<EC2FleetExcessCapacityTerminationPolicy>> excessCapacityTerminationPolicy() {
        return Codegen.optional(this.excessCapacityTerminationPolicy);
    }
    @Export(name="fleetId", type=String.class, parameters={})
    private Output<String> fleetId;

    public Output<String> fleetId() {
        return this.fleetId;
    }
    @Export(name="launchTemplateConfigs", type=List.class, parameters={EC2FleetFleetLaunchTemplateConfigRequest.class})
    private Output<List<EC2FleetFleetLaunchTemplateConfigRequest>> launchTemplateConfigs;

    public Output<List<EC2FleetFleetLaunchTemplateConfigRequest>> launchTemplateConfigs() {
        return this.launchTemplateConfigs;
    }
    @Export(name="onDemandOptions", type=EC2FleetOnDemandOptionsRequest.class, parameters={})
    private Output</* @Nullable */ EC2FleetOnDemandOptionsRequest> onDemandOptions;

    public Output<Optional<EC2FleetOnDemandOptionsRequest>> onDemandOptions() {
        return Codegen.optional(this.onDemandOptions);
    }
    @Export(name="replaceUnhealthyInstances", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> replaceUnhealthyInstances;

    public Output<Optional<Boolean>> replaceUnhealthyInstances() {
        return Codegen.optional(this.replaceUnhealthyInstances);
    }
    @Export(name="spotOptions", type=EC2FleetSpotOptionsRequest.class, parameters={})
    private Output</* @Nullable */ EC2FleetSpotOptionsRequest> spotOptions;

    public Output<Optional<EC2FleetSpotOptionsRequest>> spotOptions() {
        return Codegen.optional(this.spotOptions);
    }
    @Export(name="tagSpecifications", type=List.class, parameters={EC2FleetTagSpecification.class})
    private Output</* @Nullable */ List<EC2FleetTagSpecification>> tagSpecifications;

    public Output<Optional<List<EC2FleetTagSpecification>>> tagSpecifications() {
        return Codegen.optional(this.tagSpecifications);
    }
    @Export(name="targetCapacitySpecification", type=EC2FleetTargetCapacitySpecificationRequest.class, parameters={})
    private Output<EC2FleetTargetCapacitySpecificationRequest> targetCapacitySpecification;

    public Output<EC2FleetTargetCapacitySpecificationRequest> targetCapacitySpecification() {
        return this.targetCapacitySpecification;
    }
    @Export(name="terminateInstancesWithExpiration", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> terminateInstancesWithExpiration;

    public Output<Optional<Boolean>> terminateInstancesWithExpiration() {
        return Codegen.optional(this.terminateInstancesWithExpiration);
    }
    @Export(name="type", type=EC2FleetType.class, parameters={})
    private Output</* @Nullable */ EC2FleetType> type;

    public Output<Optional<EC2FleetType>> type() {
        return Codegen.optional(this.type);
    }
    @Export(name="validFrom", type=String.class, parameters={})
    private Output</* @Nullable */ String> validFrom;

    public Output<Optional<String>> validFrom() {
        return Codegen.optional(this.validFrom);
    }
    @Export(name="validUntil", type=String.class, parameters={})
    private Output</* @Nullable */ String> validUntil;

    public Output<Optional<String>> validUntil() {
        return Codegen.optional(this.validUntil);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EC2Fleet(String name) {
        this(name, EC2FleetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EC2Fleet(String name, EC2FleetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EC2Fleet(String name, EC2FleetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:EC2Fleet", name, args == null ? EC2FleetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EC2Fleet(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:EC2Fleet", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EC2Fleet get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EC2Fleet(name, id, options);
    }
}
