// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LaunchTemplatePlacement {
    /**
     * The affinity setting for an instance on a Dedicated Host.
     * 
     */
    private final @Nullable String affinity;
    /**
     * The Availability Zone for the instance.
     * 
     */
    private final @Nullable String availabilityZone;
    /**
     * The name of the placement group for the instance.
     * 
     */
    private final @Nullable String groupName;
    /**
     * The ID of the Dedicated Host for the instance.
     * 
     */
    private final @Nullable String hostId;
    /**
     * The ARN of the Host Resource Group in which to launch instances.
     * 
     */
    private final @Nullable String hostResourceGroupArn;
    /**
     * The number of the partition the instance should launch in. Valid only if the placement group strategy is set to partition.
     * 
     */
    private final @Nullable Integer partitionNumber;
    /**
     * Reserved for future use.
     * 
     */
    private final @Nullable String spreadDomain;
    /**
     * The tenancy of the instance (if the instance is running in a VPC). Can be `default`, `dedicated`, or `host`.
     * 
     */
    private final @Nullable String tenancy;

    @OutputCustomType.Constructor
    private LaunchTemplatePlacement(
        @OutputCustomType.Parameter("affinity") @Nullable String affinity,
        @OutputCustomType.Parameter("availabilityZone") @Nullable String availabilityZone,
        @OutputCustomType.Parameter("groupName") @Nullable String groupName,
        @OutputCustomType.Parameter("hostId") @Nullable String hostId,
        @OutputCustomType.Parameter("hostResourceGroupArn") @Nullable String hostResourceGroupArn,
        @OutputCustomType.Parameter("partitionNumber") @Nullable Integer partitionNumber,
        @OutputCustomType.Parameter("spreadDomain") @Nullable String spreadDomain,
        @OutputCustomType.Parameter("tenancy") @Nullable String tenancy) {
        this.affinity = affinity;
        this.availabilityZone = availabilityZone;
        this.groupName = groupName;
        this.hostId = hostId;
        this.hostResourceGroupArn = hostResourceGroupArn;
        this.partitionNumber = partitionNumber;
        this.spreadDomain = spreadDomain;
        this.tenancy = tenancy;
    }

    /**
     * The affinity setting for an instance on a Dedicated Host.
     * 
    */
    public Optional<String> getAffinity() {
        return Optional.ofNullable(this.affinity);
    }
    /**
     * The Availability Zone for the instance.
     * 
    */
    public Optional<String> getAvailabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    /**
     * The name of the placement group for the instance.
     * 
    */
    public Optional<String> getGroupName() {
        return Optional.ofNullable(this.groupName);
    }
    /**
     * The ID of the Dedicated Host for the instance.
     * 
    */
    public Optional<String> getHostId() {
        return Optional.ofNullable(this.hostId);
    }
    /**
     * The ARN of the Host Resource Group in which to launch instances.
     * 
    */
    public Optional<String> getHostResourceGroupArn() {
        return Optional.ofNullable(this.hostResourceGroupArn);
    }
    /**
     * The number of the partition the instance should launch in. Valid only if the placement group strategy is set to partition.
     * 
    */
    public Optional<Integer> getPartitionNumber() {
        return Optional.ofNullable(this.partitionNumber);
    }
    /**
     * Reserved for future use.
     * 
    */
    public Optional<String> getSpreadDomain() {
        return Optional.ofNullable(this.spreadDomain);
    }
    /**
     * The tenancy of the instance (if the instance is running in a VPC). Can be `default`, `dedicated`, or `host`.
     * 
    */
    public Optional<String> getTenancy() {
        return Optional.ofNullable(this.tenancy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplatePlacement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String affinity;
        private @Nullable String availabilityZone;
        private @Nullable String groupName;
        private @Nullable String hostId;
        private @Nullable String hostResourceGroupArn;
        private @Nullable Integer partitionNumber;
        private @Nullable String spreadDomain;
        private @Nullable String tenancy;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplatePlacement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinity = defaults.affinity;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.groupName = defaults.groupName;
    	      this.hostId = defaults.hostId;
    	      this.hostResourceGroupArn = defaults.hostResourceGroupArn;
    	      this.partitionNumber = defaults.partitionNumber;
    	      this.spreadDomain = defaults.spreadDomain;
    	      this.tenancy = defaults.tenancy;
        }

        public Builder affinity(@Nullable String affinity) {
            this.affinity = affinity;
            return this;
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder groupName(@Nullable String groupName) {
            this.groupName = groupName;
            return this;
        }

        public Builder hostId(@Nullable String hostId) {
            this.hostId = hostId;
            return this;
        }

        public Builder hostResourceGroupArn(@Nullable String hostResourceGroupArn) {
            this.hostResourceGroupArn = hostResourceGroupArn;
            return this;
        }

        public Builder partitionNumber(@Nullable Integer partitionNumber) {
            this.partitionNumber = partitionNumber;
            return this;
        }

        public Builder spreadDomain(@Nullable String spreadDomain) {
            this.spreadDomain = spreadDomain;
            return this;
        }

        public Builder tenancy(@Nullable String tenancy) {
            this.tenancy = tenancy;
            return this;
        }
        public LaunchTemplatePlacement build() {
            return new LaunchTemplatePlacement(affinity, availabilityZone, groupName, hostId, hostResourceGroupArn, partitionNumber, spreadDomain, tenancy);
        }
    }
}
