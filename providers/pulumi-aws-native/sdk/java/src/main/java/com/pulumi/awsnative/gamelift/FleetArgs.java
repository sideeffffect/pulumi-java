// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.gamelift;

import com.pulumi.awsnative.gamelift.enums.FleetNewGameSessionProtectionPolicy;
import com.pulumi.awsnative.gamelift.enums.FleetType;
import com.pulumi.awsnative.gamelift.inputs.FleetCertificateConfigurationArgs;
import com.pulumi.awsnative.gamelift.inputs.FleetIpPermissionArgs;
import com.pulumi.awsnative.gamelift.inputs.FleetLocationConfigurationArgs;
import com.pulumi.awsnative.gamelift.inputs.FleetResourceCreationLimitPolicyArgs;
import com.pulumi.awsnative.gamelift.inputs.FleetRuntimeConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FleetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FleetArgs Empty = new FleetArgs();

    /**
     * A unique identifier for a build to be deployed on the new fleet. If you are deploying the fleet with a custom game build, you must specify this property. The build must have been successfully uploaded to Amazon GameLift and be in a READY status. This fleet setting cannot be changed once the fleet is created.
     * 
     */
    @Import(name="buildId")
    private @Nullable Output<String> buildId;

    public Optional<Output<String>> buildId() {
        return Optional.ofNullable(this.buildId);
    }

    /**
     * Indicates whether to generate a TLS/SSL certificate for the new fleet. TLS certificates are used for encrypting traffic between game clients and game servers running on GameLift. If this parameter is not set, certificate generation is disabled. This fleet setting cannot be changed once the fleet is created.
     * 
     */
    @Import(name="certificateConfiguration")
    private @Nullable Output<FleetCertificateConfigurationArgs> certificateConfiguration;

    public Optional<Output<FleetCertificateConfigurationArgs>> certificateConfiguration() {
        return Optional.ofNullable(this.certificateConfiguration);
    }

    /**
     * A human-readable description of a fleet.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * [DEPRECATED] The number of EC2 instances that you want this fleet to host. When creating a new fleet, GameLift automatically sets this value to &#34;1&#34; and initiates a single instance. Once the fleet is active, update this value to trigger GameLift to add or remove instances from the fleet.
     * 
     */
    @Import(name="desiredEC2Instances")
    private @Nullable Output<Integer> desiredEC2Instances;

    public Optional<Output<Integer>> desiredEC2Instances() {
        return Optional.ofNullable(this.desiredEC2Instances);
    }

    /**
     * A range of IP addresses and port settings that allow inbound traffic to connect to server processes on an Amazon GameLift server.
     * 
     */
    @Import(name="eC2InboundPermissions")
    private @Nullable Output<List<FleetIpPermissionArgs>> eC2InboundPermissions;

    public Optional<Output<List<FleetIpPermissionArgs>>> eC2InboundPermissions() {
        return Optional.ofNullable(this.eC2InboundPermissions);
    }

    /**
     * The name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift supports the following EC2 instance types. See Amazon EC2 Instance Types for detailed descriptions.
     * 
     */
    @Import(name="eC2InstanceType")
    private @Nullable Output<String> eC2InstanceType;

    public Optional<Output<String>> eC2InstanceType() {
        return Optional.ofNullable(this.eC2InstanceType);
    }

    /**
     * Indicates whether to use On-Demand instances or Spot instances for this fleet. If empty, the default is ON_DEMAND. Both categories of instances use identical hardware and configurations based on the instance type selected for this fleet.
     * 
     */
    @Import(name="fleetType")
    private @Nullable Output<FleetType> fleetType;

    public Optional<Output<FleetType>> fleetType() {
        return Optional.ofNullable(this.fleetType);
    }

    /**
     * A unique identifier for an AWS IAM role that manages access to your AWS services. With an instance role ARN set, any application that runs on an instance in this fleet can assume the role, including install scripts, server processes, and daemons (background processes). Create a role or look up a role&#39;s ARN from the IAM dashboard in the AWS Management Console.
     * 
     */
    @Import(name="instanceRoleARN")
    private @Nullable Output<String> instanceRoleARN;

    public Optional<Output<String>> instanceRoleARN() {
        return Optional.ofNullable(this.instanceRoleARN);
    }

    @Import(name="locations")
    private @Nullable Output<List<FleetLocationConfigurationArgs>> locations;

    public Optional<Output<List<FleetLocationConfigurationArgs>>> locations() {
        return Optional.ofNullable(this.locations);
    }

    /**
     * This parameter is no longer used. When hosting a custom game build, specify where Amazon GameLift should store log files using the Amazon GameLift server API call ProcessReady()
     * 
     */
    @Import(name="logPaths")
    private @Nullable Output<List<String>> logPaths;

    public Optional<Output<List<String>>> logPaths() {
        return Optional.ofNullable(this.logPaths);
    }

    /**
     * [DEPRECATED] The maximum value that is allowed for the fleet&#39;s instance count. When creating a new fleet, GameLift automatically sets this value to &#34;1&#34;. Once the fleet is active, you can change this value.
     * 
     */
    @Import(name="maxSize")
    private @Nullable Output<Integer> maxSize;

    public Optional<Output<Integer>> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }

    /**
     * The name of an Amazon CloudWatch metric group. A metric group aggregates the metrics for all fleets in the group. Specify a string containing the metric group name. You can use an existing name or use a new name to create a new metric group. Currently, this parameter can have only one string.
     * 
     */
    @Import(name="metricGroups")
    private @Nullable Output<List<String>> metricGroups;

    public Optional<Output<List<String>>> metricGroups() {
        return Optional.ofNullable(this.metricGroups);
    }

    /**
     * [DEPRECATED] The minimum value allowed for the fleet&#39;s instance count. When creating a new fleet, GameLift automatically sets this value to &#34;0&#34;. After the fleet is active, you can change this value.
     * 
     */
    @Import(name="minSize")
    private @Nullable Output<Integer> minSize;

    public Optional<Output<Integer>> minSize() {
        return Optional.ofNullable(this.minSize);
    }

    /**
     * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A game session protection policy to apply to all game sessions hosted on instances in this fleet. When protected, active game sessions cannot be terminated during a scale-down event. If this parameter is not set, instances in this fleet default to no protection. You can change a fleet&#39;s protection policy to affect future game sessions on the fleet. You can also set protection for individual game sessions.
     * 
     */
    @Import(name="newGameSessionProtectionPolicy")
    private @Nullable Output<FleetNewGameSessionProtectionPolicy> newGameSessionProtectionPolicy;

    public Optional<Output<FleetNewGameSessionProtectionPolicy>> newGameSessionProtectionPolicy() {
        return Optional.ofNullable(this.newGameSessionProtectionPolicy);
    }

    /**
     * A unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with. You can find your account ID in the AWS Management Console under account settings.
     * 
     */
    @Import(name="peerVpcAwsAccountId")
    private @Nullable Output<String> peerVpcAwsAccountId;

    public Optional<Output<String>> peerVpcAwsAccountId() {
        return Optional.ofNullable(this.peerVpcAwsAccountId);
    }

    /**
     * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same Region as your fleet. To look up a VPC ID, use the VPC Dashboard in the AWS Management Console.
     * 
     */
    @Import(name="peerVpcId")
    private @Nullable Output<String> peerVpcId;

    public Optional<Output<String>> peerVpcId() {
        return Optional.ofNullable(this.peerVpcId);
    }

    /**
     * A policy that limits the number of game sessions an individual player can create over a span of time for this fleet.
     * 
     */
    @Import(name="resourceCreationLimitPolicy")
    private @Nullable Output<FleetResourceCreationLimitPolicyArgs> resourceCreationLimitPolicy;

    public Optional<Output<FleetResourceCreationLimitPolicyArgs>> resourceCreationLimitPolicy() {
        return Optional.ofNullable(this.resourceCreationLimitPolicy);
    }

    /**
     * Instructions for launching server processes on each instance in the fleet. Server processes run either a custom game build executable or a Realtime script. The runtime configuration defines the server executables or launch script file, launch parameters, and the number of processes to run concurrently on each instance. When creating a fleet, the runtime configuration must have at least one server process configuration; otherwise the request fails with an invalid request exception.
     * 
     * This parameter is required unless the parameters ServerLaunchPath and ServerLaunchParameters are defined. Runtime configuration has replaced these parameters, but fleets that use them will continue to work.
     * 
     */
    @Import(name="runtimeConfiguration")
    private @Nullable Output<FleetRuntimeConfigurationArgs> runtimeConfiguration;

    public Optional<Output<FleetRuntimeConfigurationArgs>> runtimeConfiguration() {
        return Optional.ofNullable(this.runtimeConfiguration);
    }

    /**
     * A unique identifier for a Realtime script to be deployed on a new Realtime Servers fleet. The script must have been successfully uploaded to Amazon GameLift. This fleet setting cannot be changed once the fleet is created.
     * 
     * Note: It is not currently possible to use the !Ref command to reference a script created with a CloudFormation template for the fleet property ScriptId. Instead, use Fn::GetAtt Script.Arn or Fn::GetAtt Script.Id to retrieve either of these properties as input for ScriptId. Alternatively, enter a ScriptId string manually.
     * 
     */
    @Import(name="scriptId")
    private @Nullable Output<String> scriptId;

    public Optional<Output<String>> scriptId() {
        return Optional.ofNullable(this.scriptId);
    }

    /**
     * This parameter is no longer used but is retained for backward compatibility. Instead, specify server launch parameters in the RuntimeConfiguration parameter. A request must specify either a runtime configuration or values for both ServerLaunchParameters and ServerLaunchPath.
     * 
     */
    @Import(name="serverLaunchParameters")
    private @Nullable Output<String> serverLaunchParameters;

    public Optional<Output<String>> serverLaunchParameters() {
        return Optional.ofNullable(this.serverLaunchParameters);
    }

    /**
     * This parameter is no longer used. Instead, specify a server launch path using the RuntimeConfiguration parameter. Requests that specify a server launch path and launch parameters instead of a runtime configuration will continue to work.
     * 
     */
    @Import(name="serverLaunchPath")
    private @Nullable Output<String> serverLaunchPath;

    public Optional<Output<String>> serverLaunchPath() {
        return Optional.ofNullable(this.serverLaunchPath);
    }

    private FleetArgs() {}

    private FleetArgs(FleetArgs $) {
        this.buildId = $.buildId;
        this.certificateConfiguration = $.certificateConfiguration;
        this.description = $.description;
        this.desiredEC2Instances = $.desiredEC2Instances;
        this.eC2InboundPermissions = $.eC2InboundPermissions;
        this.eC2InstanceType = $.eC2InstanceType;
        this.fleetType = $.fleetType;
        this.instanceRoleARN = $.instanceRoleARN;
        this.locations = $.locations;
        this.logPaths = $.logPaths;
        this.maxSize = $.maxSize;
        this.metricGroups = $.metricGroups;
        this.minSize = $.minSize;
        this.name = $.name;
        this.newGameSessionProtectionPolicy = $.newGameSessionProtectionPolicy;
        this.peerVpcAwsAccountId = $.peerVpcAwsAccountId;
        this.peerVpcId = $.peerVpcId;
        this.resourceCreationLimitPolicy = $.resourceCreationLimitPolicy;
        this.runtimeConfiguration = $.runtimeConfiguration;
        this.scriptId = $.scriptId;
        this.serverLaunchParameters = $.serverLaunchParameters;
        this.serverLaunchPath = $.serverLaunchPath;
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

        public Builder buildId(@Nullable Output<String> buildId) {
            $.buildId = buildId;
            return this;
        }

        public Builder buildId(String buildId) {
            return buildId(Output.of(buildId));
        }

        public Builder certificateConfiguration(@Nullable Output<FleetCertificateConfigurationArgs> certificateConfiguration) {
            $.certificateConfiguration = certificateConfiguration;
            return this;
        }

        public Builder certificateConfiguration(FleetCertificateConfigurationArgs certificateConfiguration) {
            return certificateConfiguration(Output.of(certificateConfiguration));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder desiredEC2Instances(@Nullable Output<Integer> desiredEC2Instances) {
            $.desiredEC2Instances = desiredEC2Instances;
            return this;
        }

        public Builder desiredEC2Instances(Integer desiredEC2Instances) {
            return desiredEC2Instances(Output.of(desiredEC2Instances));
        }

        public Builder eC2InboundPermissions(@Nullable Output<List<FleetIpPermissionArgs>> eC2InboundPermissions) {
            $.eC2InboundPermissions = eC2InboundPermissions;
            return this;
        }

        public Builder eC2InboundPermissions(List<FleetIpPermissionArgs> eC2InboundPermissions) {
            return eC2InboundPermissions(Output.of(eC2InboundPermissions));
        }

        public Builder eC2InboundPermissions(FleetIpPermissionArgs... eC2InboundPermissions) {
            return eC2InboundPermissions(List.of(eC2InboundPermissions));
        }

        public Builder eC2InstanceType(@Nullable Output<String> eC2InstanceType) {
            $.eC2InstanceType = eC2InstanceType;
            return this;
        }

        public Builder eC2InstanceType(String eC2InstanceType) {
            return eC2InstanceType(Output.of(eC2InstanceType));
        }

        public Builder fleetType(@Nullable Output<FleetType> fleetType) {
            $.fleetType = fleetType;
            return this;
        }

        public Builder fleetType(FleetType fleetType) {
            return fleetType(Output.of(fleetType));
        }

        public Builder instanceRoleARN(@Nullable Output<String> instanceRoleARN) {
            $.instanceRoleARN = instanceRoleARN;
            return this;
        }

        public Builder instanceRoleARN(String instanceRoleARN) {
            return instanceRoleARN(Output.of(instanceRoleARN));
        }

        public Builder locations(@Nullable Output<List<FleetLocationConfigurationArgs>> locations) {
            $.locations = locations;
            return this;
        }

        public Builder locations(List<FleetLocationConfigurationArgs> locations) {
            return locations(Output.of(locations));
        }

        public Builder locations(FleetLocationConfigurationArgs... locations) {
            return locations(List.of(locations));
        }

        public Builder logPaths(@Nullable Output<List<String>> logPaths) {
            $.logPaths = logPaths;
            return this;
        }

        public Builder logPaths(List<String> logPaths) {
            return logPaths(Output.of(logPaths));
        }

        public Builder logPaths(String... logPaths) {
            return logPaths(List.of(logPaths));
        }

        public Builder maxSize(@Nullable Output<Integer> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        public Builder maxSize(Integer maxSize) {
            return maxSize(Output.of(maxSize));
        }

        public Builder metricGroups(@Nullable Output<List<String>> metricGroups) {
            $.metricGroups = metricGroups;
            return this;
        }

        public Builder metricGroups(List<String> metricGroups) {
            return metricGroups(Output.of(metricGroups));
        }

        public Builder metricGroups(String... metricGroups) {
            return metricGroups(List.of(metricGroups));
        }

        public Builder minSize(@Nullable Output<Integer> minSize) {
            $.minSize = minSize;
            return this;
        }

        public Builder minSize(Integer minSize) {
            return minSize(Output.of(minSize));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder newGameSessionProtectionPolicy(@Nullable Output<FleetNewGameSessionProtectionPolicy> newGameSessionProtectionPolicy) {
            $.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy;
            return this;
        }

        public Builder newGameSessionProtectionPolicy(FleetNewGameSessionProtectionPolicy newGameSessionProtectionPolicy) {
            return newGameSessionProtectionPolicy(Output.of(newGameSessionProtectionPolicy));
        }

        public Builder peerVpcAwsAccountId(@Nullable Output<String> peerVpcAwsAccountId) {
            $.peerVpcAwsAccountId = peerVpcAwsAccountId;
            return this;
        }

        public Builder peerVpcAwsAccountId(String peerVpcAwsAccountId) {
            return peerVpcAwsAccountId(Output.of(peerVpcAwsAccountId));
        }

        public Builder peerVpcId(@Nullable Output<String> peerVpcId) {
            $.peerVpcId = peerVpcId;
            return this;
        }

        public Builder peerVpcId(String peerVpcId) {
            return peerVpcId(Output.of(peerVpcId));
        }

        public Builder resourceCreationLimitPolicy(@Nullable Output<FleetResourceCreationLimitPolicyArgs> resourceCreationLimitPolicy) {
            $.resourceCreationLimitPolicy = resourceCreationLimitPolicy;
            return this;
        }

        public Builder resourceCreationLimitPolicy(FleetResourceCreationLimitPolicyArgs resourceCreationLimitPolicy) {
            return resourceCreationLimitPolicy(Output.of(resourceCreationLimitPolicy));
        }

        public Builder runtimeConfiguration(@Nullable Output<FleetRuntimeConfigurationArgs> runtimeConfiguration) {
            $.runtimeConfiguration = runtimeConfiguration;
            return this;
        }

        public Builder runtimeConfiguration(FleetRuntimeConfigurationArgs runtimeConfiguration) {
            return runtimeConfiguration(Output.of(runtimeConfiguration));
        }

        public Builder scriptId(@Nullable Output<String> scriptId) {
            $.scriptId = scriptId;
            return this;
        }

        public Builder scriptId(String scriptId) {
            return scriptId(Output.of(scriptId));
        }

        public Builder serverLaunchParameters(@Nullable Output<String> serverLaunchParameters) {
            $.serverLaunchParameters = serverLaunchParameters;
            return this;
        }

        public Builder serverLaunchParameters(String serverLaunchParameters) {
            return serverLaunchParameters(Output.of(serverLaunchParameters));
        }

        public Builder serverLaunchPath(@Nullable Output<String> serverLaunchPath) {
            $.serverLaunchPath = serverLaunchPath;
            return this;
        }

        public Builder serverLaunchPath(String serverLaunchPath) {
            return serverLaunchPath(Output.of(serverLaunchPath));
        }

        public FleetArgs build() {
            return $;
        }
    }

}
