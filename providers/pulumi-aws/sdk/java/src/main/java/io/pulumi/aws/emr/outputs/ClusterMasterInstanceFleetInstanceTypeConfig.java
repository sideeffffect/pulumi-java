// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.outputs;

import io.pulumi.aws.emr.outputs.ClusterMasterInstanceFleetInstanceTypeConfigConfiguration;
import io.pulumi.aws.emr.outputs.ClusterMasterInstanceFleetInstanceTypeConfigEbsConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterMasterInstanceFleetInstanceTypeConfig {
    /**
     * Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
     */
    private final @Nullable String bidPrice;
    /**
     * Bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by `instance_type`. Expressed as a number (for example, 20 specifies 20%). If neither `bid_price` nor `bid_price_as_percentage_of_on_demand_price` is provided, `bid_price_as_percentage_of_on_demand_price` defaults to 100%.
     * 
     */
    private final @Nullable Double bidPriceAsPercentageOfOnDemandPrice;
    /**
     * Configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
     * 
     */
    private final @Nullable List<ClusterMasterInstanceFleetInstanceTypeConfigConfiguration> configurations;
    /**
     * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * 
     */
    private final @Nullable List<ClusterMasterInstanceFleetInstanceTypeConfigEbsConfig> ebsConfigs;
    /**
     * EC2 instance type for all instances in the instance group.
     * 
     */
    private final String instanceType;
    /**
     * Number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in `aws.emr.InstanceFleet`.
     * 
     */
    private final @Nullable Integer weightedCapacity;

    @OutputCustomType.Constructor
    private ClusterMasterInstanceFleetInstanceTypeConfig(
        @OutputCustomType.Parameter("bidPrice") @Nullable String bidPrice,
        @OutputCustomType.Parameter("bidPriceAsPercentageOfOnDemandPrice") @Nullable Double bidPriceAsPercentageOfOnDemandPrice,
        @OutputCustomType.Parameter("configurations") @Nullable List<ClusterMasterInstanceFleetInstanceTypeConfigConfiguration> configurations,
        @OutputCustomType.Parameter("ebsConfigs") @Nullable List<ClusterMasterInstanceFleetInstanceTypeConfigEbsConfig> ebsConfigs,
        @OutputCustomType.Parameter("instanceType") String instanceType,
        @OutputCustomType.Parameter("weightedCapacity") @Nullable Integer weightedCapacity) {
        this.bidPrice = bidPrice;
        this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
        this.configurations = configurations;
        this.ebsConfigs = ebsConfigs;
        this.instanceType = instanceType;
        this.weightedCapacity = weightedCapacity;
    }

    /**
     * Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
    */
    public Optional<String> getBidPrice() {
        return Optional.ofNullable(this.bidPrice);
    }
    /**
     * Bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by `instance_type`. Expressed as a number (for example, 20 specifies 20%). If neither `bid_price` nor `bid_price_as_percentage_of_on_demand_price` is provided, `bid_price_as_percentage_of_on_demand_price` defaults to 100%.
     * 
    */
    public Optional<Double> getBidPriceAsPercentageOfOnDemandPrice() {
        return Optional.ofNullable(this.bidPriceAsPercentageOfOnDemandPrice);
    }
    /**
     * Configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
     * 
    */
    public List<ClusterMasterInstanceFleetInstanceTypeConfigConfiguration> getConfigurations() {
        return this.configurations == null ? List.of() : this.configurations;
    }
    /**
     * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * 
    */
    public List<ClusterMasterInstanceFleetInstanceTypeConfigEbsConfig> getEbsConfigs() {
        return this.ebsConfigs == null ? List.of() : this.ebsConfigs;
    }
    /**
     * EC2 instance type for all instances in the instance group.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * Number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in `aws.emr.InstanceFleet`.
     * 
    */
    public Optional<Integer> getWeightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterInstanceFleetInstanceTypeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bidPrice;
        private @Nullable Double bidPriceAsPercentageOfOnDemandPrice;
        private @Nullable List<ClusterMasterInstanceFleetInstanceTypeConfigConfiguration> configurations;
        private @Nullable List<ClusterMasterInstanceFleetInstanceTypeConfigEbsConfig> ebsConfigs;
        private String instanceType;
        private @Nullable Integer weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterInstanceFleetInstanceTypeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bidPrice = defaults.bidPrice;
    	      this.bidPriceAsPercentageOfOnDemandPrice = defaults.bidPriceAsPercentageOfOnDemandPrice;
    	      this.configurations = defaults.configurations;
    	      this.ebsConfigs = defaults.ebsConfigs;
    	      this.instanceType = defaults.instanceType;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder bidPrice(@Nullable String bidPrice) {
            this.bidPrice = bidPrice;
            return this;
        }

        public Builder bidPriceAsPercentageOfOnDemandPrice(@Nullable Double bidPriceAsPercentageOfOnDemandPrice) {
            this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
            return this;
        }

        public Builder configurations(@Nullable List<ClusterMasterInstanceFleetInstanceTypeConfigConfiguration> configurations) {
            this.configurations = configurations;
            return this;
        }

        public Builder ebsConfigs(@Nullable List<ClusterMasterInstanceFleetInstanceTypeConfigEbsConfig> ebsConfigs) {
            this.ebsConfigs = ebsConfigs;
            return this;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder weightedCapacity(@Nullable Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public ClusterMasterInstanceFleetInstanceTypeConfig build() {
            return new ClusterMasterInstanceFleetInstanceTypeConfig(bidPrice, bidPriceAsPercentageOfOnDemandPrice, configurations, ebsConfigs, instanceType, weightedCapacity);
        }
    }
}
