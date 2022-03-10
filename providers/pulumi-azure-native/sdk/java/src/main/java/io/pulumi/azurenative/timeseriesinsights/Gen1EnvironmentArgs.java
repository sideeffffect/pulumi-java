// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights;

import io.pulumi.azurenative.timeseriesinsights.enums.StorageLimitExceededBehavior;
import io.pulumi.azurenative.timeseriesinsights.inputs.SkuArgs;
import io.pulumi.azurenative.timeseriesinsights.inputs.TimeSeriesIdPropertyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class Gen1EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final Gen1EnvironmentArgs Empty = new Gen1EnvironmentArgs();

    /**
     * ISO8601 timespan specifying the minimum number of days the environment's events will be available for query.
     * 
     */
    @InputImport(name="dataRetentionTime", required=true)
      private final Input<String> dataRetentionTime;

    public Input<String> getDataRetentionTime() {
        return this.dataRetentionTime;
    }

    /**
     * Name of the environment
     * 
     */
    @InputImport(name="environmentName")
      private final @Nullable Input<String> environmentName;

    public Input<String> getEnvironmentName() {
        return this.environmentName == null ? Input.empty() : this.environmentName;
    }

    /**
     * The kind of the environment.
     * Expected value is 'Gen1'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * The location of the resource.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The list of event properties which will be used to partition data in the environment. Currently, only a single partition key property is supported.
     * 
     */
    @InputImport(name="partitionKeyProperties")
      private final @Nullable Input<List<TimeSeriesIdPropertyArgs>> partitionKeyProperties;

    public Input<List<TimeSeriesIdPropertyArgs>> getPartitionKeyProperties() {
        return this.partitionKeyProperties == null ? Input.empty() : this.partitionKeyProperties;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The sku determines the type of environment, either Gen1 (S1 or S2) or Gen2 (L1). For Gen1 environments the sku determines the capacity of the environment, the ingress rate, and the billing rate.
     * 
     */
    @InputImport(name="sku", required=true)
      private final Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku;
    }

    /**
     * The behavior the Time Series Insights service should take when the environment's capacity has been exceeded. If "PauseIngress" is specified, new events will not be read from the event source. If "PurgeOldData" is specified, new events will continue to be read and old events will be deleted from the environment. The default behavior is PurgeOldData.
     * 
     */
    @InputImport(name="storageLimitExceededBehavior")
      private final @Nullable Input<Either<String,StorageLimitExceededBehavior>> storageLimitExceededBehavior;

    public Input<Either<String,StorageLimitExceededBehavior>> getStorageLimitExceededBehavior() {
        return this.storageLimitExceededBehavior == null ? Input.empty() : this.storageLimitExceededBehavior;
    }

    /**
     * Key-value pairs of additional properties for the resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public Gen1EnvironmentArgs(
        Input<String> dataRetentionTime,
        @Nullable Input<String> environmentName,
        Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<List<TimeSeriesIdPropertyArgs>> partitionKeyProperties,
        Input<String> resourceGroupName,
        Input<SkuArgs> sku,
        @Nullable Input<Either<String,StorageLimitExceededBehavior>> storageLimitExceededBehavior,
        @Nullable Input<Map<String,String>> tags) {
        this.dataRetentionTime = Objects.requireNonNull(dataRetentionTime, "expected parameter 'dataRetentionTime' to be non-null");
        this.environmentName = environmentName;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.partitionKeyProperties = partitionKeyProperties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.storageLimitExceededBehavior = storageLimitExceededBehavior;
        this.tags = tags;
    }

    private Gen1EnvironmentArgs() {
        this.dataRetentionTime = Input.empty();
        this.environmentName = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.partitionKeyProperties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.storageLimitExceededBehavior = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Gen1EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> dataRetentionTime;
        private @Nullable Input<String> environmentName;
        private Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<List<TimeSeriesIdPropertyArgs>> partitionKeyProperties;
        private Input<String> resourceGroupName;
        private Input<SkuArgs> sku;
        private @Nullable Input<Either<String,StorageLimitExceededBehavior>> storageLimitExceededBehavior;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(Gen1EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataRetentionTime = defaults.dataRetentionTime;
    	      this.environmentName = defaults.environmentName;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.partitionKeyProperties = defaults.partitionKeyProperties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.storageLimitExceededBehavior = defaults.storageLimitExceededBehavior;
    	      this.tags = defaults.tags;
        }

        public Builder dataRetentionTime(Input<String> dataRetentionTime) {
            this.dataRetentionTime = Objects.requireNonNull(dataRetentionTime);
            return this;
        }

        public Builder dataRetentionTime(String dataRetentionTime) {
            this.dataRetentionTime = Input.of(Objects.requireNonNull(dataRetentionTime));
            return this;
        }

        public Builder environmentName(@Nullable Input<String> environmentName) {
            this.environmentName = environmentName;
            return this;
        }

        public Builder environmentName(@Nullable String environmentName) {
            this.environmentName = Input.ofNullable(environmentName);
            return this;
        }

        public Builder kind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder partitionKeyProperties(@Nullable Input<List<TimeSeriesIdPropertyArgs>> partitionKeyProperties) {
            this.partitionKeyProperties = partitionKeyProperties;
            return this;
        }

        public Builder partitionKeyProperties(@Nullable List<TimeSeriesIdPropertyArgs> partitionKeyProperties) {
            this.partitionKeyProperties = Input.ofNullable(partitionKeyProperties);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder sku(Input<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder sku(SkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder storageLimitExceededBehavior(@Nullable Input<Either<String,StorageLimitExceededBehavior>> storageLimitExceededBehavior) {
            this.storageLimitExceededBehavior = storageLimitExceededBehavior;
            return this;
        }

        public Builder storageLimitExceededBehavior(@Nullable Either<String,StorageLimitExceededBehavior> storageLimitExceededBehavior) {
            this.storageLimitExceededBehavior = Input.ofNullable(storageLimitExceededBehavior);
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
        public Gen1EnvironmentArgs build() {
            return new Gen1EnvironmentArgs(dataRetentionTime, environmentName, kind, location, partitionKeyProperties, resourceGroupName, sku, storageLimitExceededBehavior, tags);
        }
    }
}
