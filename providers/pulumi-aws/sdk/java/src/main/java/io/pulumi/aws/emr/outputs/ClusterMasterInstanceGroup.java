// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.outputs;

import io.pulumi.aws.emr.outputs.ClusterMasterInstanceGroupEbsConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterMasterInstanceGroup {
    /**
     * Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
     */
    private final @Nullable String bidPrice;
    /**
     * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * 
     */
    private final @Nullable List<ClusterMasterInstanceGroupEbsConfig> ebsConfigs;
    /**
     * ID of the cluster.
     * 
     */
    private final @Nullable String id;
    /**
     * Target number of instances for the instance group. Must be 1 or 3. Defaults to 1. Launching with multiple master nodes is only supported in EMR version 5.23.0+, and requires this resource's `core_instance_group` to be configured. Public (Internet accessible) instances must be created in VPC subnets that have map public IP on launch enabled. Termination protection is automatically enabled when launched with multiple master nodes and this provider must have the `termination_protection = false` configuration applied before destroying this resource.
     * 
     */
    private final @Nullable Integer instanceCount;
    /**
     * EC2 instance type for all instances in the instance group.
     * 
     */
    private final String instanceType;
    /**
     * Name of the step.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor
    private ClusterMasterInstanceGroup(
        @OutputCustomType.Parameter("bidPrice") @Nullable String bidPrice,
        @OutputCustomType.Parameter("ebsConfigs") @Nullable List<ClusterMasterInstanceGroupEbsConfig> ebsConfigs,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("instanceCount") @Nullable Integer instanceCount,
        @OutputCustomType.Parameter("instanceType") String instanceType,
        @OutputCustomType.Parameter("name") @Nullable String name) {
        this.bidPrice = bidPrice;
        this.ebsConfigs = ebsConfigs;
        this.id = id;
        this.instanceCount = instanceCount;
        this.instanceType = instanceType;
        this.name = name;
    }

    /**
     * Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
    */
    public Optional<String> getBidPrice() {
        return Optional.ofNullable(this.bidPrice);
    }
    /**
     * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * 
    */
    public List<ClusterMasterInstanceGroupEbsConfig> getEbsConfigs() {
        return this.ebsConfigs == null ? List.of() : this.ebsConfigs;
    }
    /**
     * ID of the cluster.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Target number of instances for the instance group. Must be 1 or 3. Defaults to 1. Launching with multiple master nodes is only supported in EMR version 5.23.0+, and requires this resource's `core_instance_group` to be configured. Public (Internet accessible) instances must be created in VPC subnets that have map public IP on launch enabled. Termination protection is automatically enabled when launched with multiple master nodes and this provider must have the `termination_protection = false` configuration applied before destroying this resource.
     * 
    */
    public Optional<Integer> getInstanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }
    /**
     * EC2 instance type for all instances in the instance group.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * Name of the step.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterInstanceGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bidPrice;
        private @Nullable List<ClusterMasterInstanceGroupEbsConfig> ebsConfigs;
        private @Nullable String id;
        private @Nullable Integer instanceCount;
        private String instanceType;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterInstanceGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bidPrice = defaults.bidPrice;
    	      this.ebsConfigs = defaults.ebsConfigs;
    	      this.id = defaults.id;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.name = defaults.name;
        }

        public Builder bidPrice(@Nullable String bidPrice) {
            this.bidPrice = bidPrice;
            return this;
        }

        public Builder ebsConfigs(@Nullable List<ClusterMasterInstanceGroupEbsConfig> ebsConfigs) {
            this.ebsConfigs = ebsConfigs;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder instanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public ClusterMasterInstanceGroup build() {
            return new ClusterMasterInstanceGroup(bidPrice, ebsConfigs, id, instanceCount, instanceType, name);
        }
    }
}
