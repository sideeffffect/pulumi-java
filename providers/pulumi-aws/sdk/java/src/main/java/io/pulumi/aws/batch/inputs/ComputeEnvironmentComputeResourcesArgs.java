// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesEc2ConfigurationArgs;
import io.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesLaunchTemplateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComputeEnvironmentComputeResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComputeEnvironmentComputeResourcesArgs Empty = new ComputeEnvironmentComputeResourcesArgs();

    /**
     * The allocation strategy to use for the compute resource in case not enough instances of the best fitting instance type can be allocated. Valid items are `BEST_FIT_PROGRESSIVE`, `SPOT_CAPACITY_OPTIMIZED` or `BEST_FIT`. Defaults to `BEST_FIT`. See [AWS docs](https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html) for details. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @InputImport(name="allocationStrategy")
      private final @Nullable Input<String> allocationStrategy;

    public Input<String> getAllocationStrategy() {
        return this.allocationStrategy == null ? Input.empty() : this.allocationStrategy;
    }

    /**
     * Integer of maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance type before instances are launched. For example, if your bid percentage is 20% (`20`), then the Spot price must be below 20% of the current On-Demand price for that EC2 instance. If you leave this field empty, the default value is 100% of the On-Demand price. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @InputImport(name="bidPercentage")
      private final @Nullable Input<Integer> bidPercentage;

    public Input<Integer> getBidPercentage() {
        return this.bidPercentage == null ? Input.empty() : this.bidPercentage;
    }

    /**
     * The desired number of EC2 vCPUS in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @InputImport(name="desiredVcpus")
      private final @Nullable Input<Integer> desiredVcpus;

    public Input<Integer> getDesiredVcpus() {
        return this.desiredVcpus == null ? Input.empty() : this.desiredVcpus;
    }

    /**
     * Provides information used to select Amazon Machine Images (AMIs) for EC2 instances in the compute environment. If Ec2Configuration isn't specified, the default is ECS_AL2. This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified.
     * 
     */
    @InputImport(name="ec2Configuration")
      private final @Nullable Input<ComputeEnvironmentComputeResourcesEc2ConfigurationArgs> ec2Configuration;

    public Input<ComputeEnvironmentComputeResourcesEc2ConfigurationArgs> getEc2Configuration() {
        return this.ec2Configuration == null ? Input.empty() : this.ec2Configuration;
    }

    /**
     * The EC2 key pair that is used for instances launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @InputImport(name="ec2KeyPair")
      private final @Nullable Input<String> ec2KeyPair;

    public Input<String> getEc2KeyPair() {
        return this.ec2KeyPair == null ? Input.empty() : this.ec2KeyPair;
    }

    /**
     * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified. (Deprecated, use `image_id_override` instead)
     * 
     */
    @InputImport(name="imageId")
      private final @Nullable Input<String> imageId;

    public Input<String> getImageId() {
        return this.imageId == null ? Input.empty() : this.imageId;
    }

    /**
     * The Amazon ECS instance role applied to Amazon EC2 instances in a compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @InputImport(name="instanceRole")
      private final @Nullable Input<String> instanceRole;

    public Input<String> getInstanceRole() {
        return this.instanceRole == null ? Input.empty() : this.instanceRole;
    }

    /**
     * A list of instance types that may be launched. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @InputImport(name="instanceTypes")
      private final @Nullable Input<List<String>> instanceTypes;

    public Input<List<String>> getInstanceTypes() {
        return this.instanceTypes == null ? Input.empty() : this.instanceTypes;
    }

    /**
     * The launch template to use for your compute resources. See details below. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @InputImport(name="launchTemplate")
      private final @Nullable Input<ComputeEnvironmentComputeResourcesLaunchTemplateArgs> launchTemplate;

    public Input<ComputeEnvironmentComputeResourcesLaunchTemplateArgs> getLaunchTemplate() {
        return this.launchTemplate == null ? Input.empty() : this.launchTemplate;
    }

    /**
     * The maximum number of EC2 vCPUs that an environment can reach.
     * 
     */
    @InputImport(name="maxVcpus", required=true)
      private final Input<Integer> maxVcpus;

    public Input<Integer> getMaxVcpus() {
        return this.maxVcpus;
    }

    /**
     * The minimum number of EC2 vCPUs that an environment should maintain. For `EC2` or `SPOT` compute environments, if the parameter is not explicitly defined, a `0` default value will be set. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @InputImport(name="minVcpus")
      private final @Nullable Input<Integer> minVcpus;

    public Input<Integer> getMinVcpus() {
        return this.minVcpus == null ? Input.empty() : this.minVcpus;
    }

    /**
     * A list of EC2 security group that are associated with instances launched in the compute environment.
     * 
     */
    @InputImport(name="securityGroupIds", required=true)
      private final Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a SPOT compute environment. This parameter is required for SPOT compute environments. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @InputImport(name="spotIamFleetRole")
      private final @Nullable Input<String> spotIamFleetRole;

    public Input<String> getSpotIamFleetRole() {
        return this.spotIamFleetRole == null ? Input.empty() : this.spotIamFleetRole;
    }

    /**
     * A list of VPC subnets into which the compute resources are launched.
     * 
     */
    @InputImport(name="subnets", required=true)
      private final Input<List<String>> subnets;

    public Input<List<String>> getSubnets() {
        return this.subnets;
    }

    /**
     * Key-value pair tags to be applied to resources that are launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The type of compute environment. Valid items are `EC2`, `SPOT`, `FARGATE` or `FARGATE_SPOT`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ComputeEnvironmentComputeResourcesArgs(
        @Nullable Input<String> allocationStrategy,
        @Nullable Input<Integer> bidPercentage,
        @Nullable Input<Integer> desiredVcpus,
        @Nullable Input<ComputeEnvironmentComputeResourcesEc2ConfigurationArgs> ec2Configuration,
        @Nullable Input<String> ec2KeyPair,
        @Nullable Input<String> imageId,
        @Nullable Input<String> instanceRole,
        @Nullable Input<List<String>> instanceTypes,
        @Nullable Input<ComputeEnvironmentComputeResourcesLaunchTemplateArgs> launchTemplate,
        Input<Integer> maxVcpus,
        @Nullable Input<Integer> minVcpus,
        Input<List<String>> securityGroupIds,
        @Nullable Input<String> spotIamFleetRole,
        Input<List<String>> subnets,
        @Nullable Input<Map<String,String>> tags,
        Input<String> type) {
        this.allocationStrategy = allocationStrategy;
        this.bidPercentage = bidPercentage;
        this.desiredVcpus = desiredVcpus;
        this.ec2Configuration = ec2Configuration;
        this.ec2KeyPair = ec2KeyPair;
        this.imageId = imageId;
        this.instanceRole = instanceRole;
        this.instanceTypes = instanceTypes;
        this.launchTemplate = launchTemplate;
        this.maxVcpus = Objects.requireNonNull(maxVcpus, "expected parameter 'maxVcpus' to be non-null");
        this.minVcpus = minVcpus;
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.spotIamFleetRole = spotIamFleetRole;
        this.subnets = Objects.requireNonNull(subnets, "expected parameter 'subnets' to be non-null");
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ComputeEnvironmentComputeResourcesArgs() {
        this.allocationStrategy = Input.empty();
        this.bidPercentage = Input.empty();
        this.desiredVcpus = Input.empty();
        this.ec2Configuration = Input.empty();
        this.ec2KeyPair = Input.empty();
        this.imageId = Input.empty();
        this.instanceRole = Input.empty();
        this.instanceTypes = Input.empty();
        this.launchTemplate = Input.empty();
        this.maxVcpus = Input.empty();
        this.minVcpus = Input.empty();
        this.securityGroupIds = Input.empty();
        this.spotIamFleetRole = Input.empty();
        this.subnets = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeEnvironmentComputeResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> allocationStrategy;
        private @Nullable Input<Integer> bidPercentage;
        private @Nullable Input<Integer> desiredVcpus;
        private @Nullable Input<ComputeEnvironmentComputeResourcesEc2ConfigurationArgs> ec2Configuration;
        private @Nullable Input<String> ec2KeyPair;
        private @Nullable Input<String> imageId;
        private @Nullable Input<String> instanceRole;
        private @Nullable Input<List<String>> instanceTypes;
        private @Nullable Input<ComputeEnvironmentComputeResourcesLaunchTemplateArgs> launchTemplate;
        private Input<Integer> maxVcpus;
        private @Nullable Input<Integer> minVcpus;
        private Input<List<String>> securityGroupIds;
        private @Nullable Input<String> spotIamFleetRole;
        private Input<List<String>> subnets;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeEnvironmentComputeResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
    	      this.bidPercentage = defaults.bidPercentage;
    	      this.desiredVcpus = defaults.desiredVcpus;
    	      this.ec2Configuration = defaults.ec2Configuration;
    	      this.ec2KeyPair = defaults.ec2KeyPair;
    	      this.imageId = defaults.imageId;
    	      this.instanceRole = defaults.instanceRole;
    	      this.instanceTypes = defaults.instanceTypes;
    	      this.launchTemplate = defaults.launchTemplate;
    	      this.maxVcpus = defaults.maxVcpus;
    	      this.minVcpus = defaults.minVcpus;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.spotIamFleetRole = defaults.spotIamFleetRole;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder allocationStrategy(@Nullable Input<String> allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }

        public Builder allocationStrategy(@Nullable String allocationStrategy) {
            this.allocationStrategy = Input.ofNullable(allocationStrategy);
            return this;
        }

        public Builder bidPercentage(@Nullable Input<Integer> bidPercentage) {
            this.bidPercentage = bidPercentage;
            return this;
        }

        public Builder bidPercentage(@Nullable Integer bidPercentage) {
            this.bidPercentage = Input.ofNullable(bidPercentage);
            return this;
        }

        public Builder desiredVcpus(@Nullable Input<Integer> desiredVcpus) {
            this.desiredVcpus = desiredVcpus;
            return this;
        }

        public Builder desiredVcpus(@Nullable Integer desiredVcpus) {
            this.desiredVcpus = Input.ofNullable(desiredVcpus);
            return this;
        }

        public Builder ec2Configuration(@Nullable Input<ComputeEnvironmentComputeResourcesEc2ConfigurationArgs> ec2Configuration) {
            this.ec2Configuration = ec2Configuration;
            return this;
        }

        public Builder ec2Configuration(@Nullable ComputeEnvironmentComputeResourcesEc2ConfigurationArgs ec2Configuration) {
            this.ec2Configuration = Input.ofNullable(ec2Configuration);
            return this;
        }

        public Builder ec2KeyPair(@Nullable Input<String> ec2KeyPair) {
            this.ec2KeyPair = ec2KeyPair;
            return this;
        }

        public Builder ec2KeyPair(@Nullable String ec2KeyPair) {
            this.ec2KeyPair = Input.ofNullable(ec2KeyPair);
            return this;
        }

        public Builder imageId(@Nullable Input<String> imageId) {
            this.imageId = imageId;
            return this;
        }

        public Builder imageId(@Nullable String imageId) {
            this.imageId = Input.ofNullable(imageId);
            return this;
        }

        public Builder instanceRole(@Nullable Input<String> instanceRole) {
            this.instanceRole = instanceRole;
            return this;
        }

        public Builder instanceRole(@Nullable String instanceRole) {
            this.instanceRole = Input.ofNullable(instanceRole);
            return this;
        }

        public Builder instanceTypes(@Nullable Input<List<String>> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        public Builder instanceTypes(@Nullable List<String> instanceTypes) {
            this.instanceTypes = Input.ofNullable(instanceTypes);
            return this;
        }

        public Builder launchTemplate(@Nullable Input<ComputeEnvironmentComputeResourcesLaunchTemplateArgs> launchTemplate) {
            this.launchTemplate = launchTemplate;
            return this;
        }

        public Builder launchTemplate(@Nullable ComputeEnvironmentComputeResourcesLaunchTemplateArgs launchTemplate) {
            this.launchTemplate = Input.ofNullable(launchTemplate);
            return this;
        }

        public Builder maxVcpus(Input<Integer> maxVcpus) {
            this.maxVcpus = Objects.requireNonNull(maxVcpus);
            return this;
        }

        public Builder maxVcpus(Integer maxVcpus) {
            this.maxVcpus = Input.of(Objects.requireNonNull(maxVcpus));
            return this;
        }

        public Builder minVcpus(@Nullable Input<Integer> minVcpus) {
            this.minVcpus = minVcpus;
            return this;
        }

        public Builder minVcpus(@Nullable Integer minVcpus) {
            this.minVcpus = Input.ofNullable(minVcpus);
            return this;
        }

        public Builder securityGroupIds(Input<List<String>> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Input.of(Objects.requireNonNull(securityGroupIds));
            return this;
        }

        public Builder spotIamFleetRole(@Nullable Input<String> spotIamFleetRole) {
            this.spotIamFleetRole = spotIamFleetRole;
            return this;
        }

        public Builder spotIamFleetRole(@Nullable String spotIamFleetRole) {
            this.spotIamFleetRole = Input.ofNullable(spotIamFleetRole);
            return this;
        }

        public Builder subnets(Input<List<String>> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }

        public Builder subnets(List<String> subnets) {
            this.subnets = Input.of(Objects.requireNonNull(subnets));
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ComputeEnvironmentComputeResourcesArgs build() {
            return new ComputeEnvironmentComputeResourcesArgs(allocationStrategy, bidPercentage, desiredVcpus, ec2Configuration, ec2KeyPair, imageId, instanceRole, instanceTypes, launchTemplate, maxVcpus, minVcpus, securityGroupIds, spotIamFleetRole, subnets, tags, type);
        }
    }
}
