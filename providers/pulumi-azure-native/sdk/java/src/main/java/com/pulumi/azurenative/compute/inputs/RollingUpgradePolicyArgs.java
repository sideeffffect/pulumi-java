// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration parameters used while performing a rolling upgrade.
 * 
 */
public final class RollingUpgradePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RollingUpgradePolicyArgs Empty = new RollingUpgradePolicyArgs();

    /**
     * Allow VMSS to ignore AZ boundaries when constructing upgrade batches. Take into consideration the Update Domain and maxBatchInstancePercent to determine the batch size.
     * 
     */
    @Import(name="enableCrossZoneUpgrade")
    private @Nullable Output<Boolean> enableCrossZoneUpgrade;

    public Optional<Output<Boolean>> enableCrossZoneUpgrade() {
        return Optional.ofNullable(this.enableCrossZoneUpgrade);
    }

    /**
     * The maximum percent of total virtual machine instances that will be upgraded simultaneously by the rolling upgrade in one batch. As this is a maximum, unhealthy instances in previous or future batches can cause the percentage of instances in a batch to decrease to ensure higher reliability. The default value for this parameter is 20%.
     * 
     */
    @Import(name="maxBatchInstancePercent")
    private @Nullable Output<Integer> maxBatchInstancePercent;

    public Optional<Output<Integer>> maxBatchInstancePercent() {
        return Optional.ofNullable(this.maxBatchInstancePercent);
    }

    /**
     * The maximum percentage of the total virtual machine instances in the scale set that can be simultaneously unhealthy, either as a result of being upgraded, or by being found in an unhealthy state by the virtual machine health checks before the rolling upgrade aborts. This constraint will be checked prior to starting any batch. The default value for this parameter is 20%.
     * 
     */
    @Import(name="maxUnhealthyInstancePercent")
    private @Nullable Output<Integer> maxUnhealthyInstancePercent;

    public Optional<Output<Integer>> maxUnhealthyInstancePercent() {
        return Optional.ofNullable(this.maxUnhealthyInstancePercent);
    }

    /**
     * The maximum percentage of upgraded virtual machine instances that can be found to be in an unhealthy state. This check will happen after each batch is upgraded. If this percentage is ever exceeded, the rolling update aborts. The default value for this parameter is 20%.
     * 
     */
    @Import(name="maxUnhealthyUpgradedInstancePercent")
    private @Nullable Output<Integer> maxUnhealthyUpgradedInstancePercent;

    public Optional<Output<Integer>> maxUnhealthyUpgradedInstancePercent() {
        return Optional.ofNullable(this.maxUnhealthyUpgradedInstancePercent);
    }

    /**
     * The wait time between completing the update for all virtual machines in one batch and starting the next batch. The time duration should be specified in ISO 8601 format. The default value is 0 seconds (PT0S).
     * 
     */
    @Import(name="pauseTimeBetweenBatches")
    private @Nullable Output<String> pauseTimeBetweenBatches;

    public Optional<Output<String>> pauseTimeBetweenBatches() {
        return Optional.ofNullable(this.pauseTimeBetweenBatches);
    }

    /**
     * Upgrade all unhealthy instances in a scale set before any healthy instances.
     * 
     */
    @Import(name="prioritizeUnhealthyInstances")
    private @Nullable Output<Boolean> prioritizeUnhealthyInstances;

    public Optional<Output<Boolean>> prioritizeUnhealthyInstances() {
        return Optional.ofNullable(this.prioritizeUnhealthyInstances);
    }

    private RollingUpgradePolicyArgs() {}

    private RollingUpgradePolicyArgs(RollingUpgradePolicyArgs $) {
        this.enableCrossZoneUpgrade = $.enableCrossZoneUpgrade;
        this.maxBatchInstancePercent = $.maxBatchInstancePercent;
        this.maxUnhealthyInstancePercent = $.maxUnhealthyInstancePercent;
        this.maxUnhealthyUpgradedInstancePercent = $.maxUnhealthyUpgradedInstancePercent;
        this.pauseTimeBetweenBatches = $.pauseTimeBetweenBatches;
        this.prioritizeUnhealthyInstances = $.prioritizeUnhealthyInstances;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RollingUpgradePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RollingUpgradePolicyArgs $;

        public Builder() {
            $ = new RollingUpgradePolicyArgs();
        }

        public Builder(RollingUpgradePolicyArgs defaults) {
            $ = new RollingUpgradePolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableCrossZoneUpgrade(@Nullable Output<Boolean> enableCrossZoneUpgrade) {
            $.enableCrossZoneUpgrade = enableCrossZoneUpgrade;
            return this;
        }

        public Builder enableCrossZoneUpgrade(Boolean enableCrossZoneUpgrade) {
            return enableCrossZoneUpgrade(Output.of(enableCrossZoneUpgrade));
        }

        public Builder maxBatchInstancePercent(@Nullable Output<Integer> maxBatchInstancePercent) {
            $.maxBatchInstancePercent = maxBatchInstancePercent;
            return this;
        }

        public Builder maxBatchInstancePercent(Integer maxBatchInstancePercent) {
            return maxBatchInstancePercent(Output.of(maxBatchInstancePercent));
        }

        public Builder maxUnhealthyInstancePercent(@Nullable Output<Integer> maxUnhealthyInstancePercent) {
            $.maxUnhealthyInstancePercent = maxUnhealthyInstancePercent;
            return this;
        }

        public Builder maxUnhealthyInstancePercent(Integer maxUnhealthyInstancePercent) {
            return maxUnhealthyInstancePercent(Output.of(maxUnhealthyInstancePercent));
        }

        public Builder maxUnhealthyUpgradedInstancePercent(@Nullable Output<Integer> maxUnhealthyUpgradedInstancePercent) {
            $.maxUnhealthyUpgradedInstancePercent = maxUnhealthyUpgradedInstancePercent;
            return this;
        }

        public Builder maxUnhealthyUpgradedInstancePercent(Integer maxUnhealthyUpgradedInstancePercent) {
            return maxUnhealthyUpgradedInstancePercent(Output.of(maxUnhealthyUpgradedInstancePercent));
        }

        public Builder pauseTimeBetweenBatches(@Nullable Output<String> pauseTimeBetweenBatches) {
            $.pauseTimeBetweenBatches = pauseTimeBetweenBatches;
            return this;
        }

        public Builder pauseTimeBetweenBatches(String pauseTimeBetweenBatches) {
            return pauseTimeBetweenBatches(Output.of(pauseTimeBetweenBatches));
        }

        public Builder prioritizeUnhealthyInstances(@Nullable Output<Boolean> prioritizeUnhealthyInstances) {
            $.prioritizeUnhealthyInstances = prioritizeUnhealthyInstances;
            return this;
        }

        public Builder prioritizeUnhealthyInstances(Boolean prioritizeUnhealthyInstances) {
            return prioritizeUnhealthyInstances(Output.of(prioritizeUnhealthyInstances));
        }

        public RollingUpgradePolicyArgs build() {
            return $;
        }
    }

}
