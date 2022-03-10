// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.outputs;

import io.pulumi.azurenative.storagesync.outputs.CloudTieringCachePerformanceResponse;
import io.pulumi.azurenative.storagesync.outputs.CloudTieringDatePolicyStatusResponse;
import io.pulumi.azurenative.storagesync.outputs.CloudTieringFilesNotTieringResponse;
import io.pulumi.azurenative.storagesync.outputs.CloudTieringSpaceSavingsResponse;
import io.pulumi.azurenative.storagesync.outputs.CloudTieringVolumeFreeSpacePolicyStatusResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServerEndpointCloudTieringStatusResponse {
    /**
     * Information regarding how well the local cache on the server is performing.
     * 
     */
    private final CloudTieringCachePerformanceResponse cachePerformance;
    /**
     * Status of the date policy
     * 
     */
    private final CloudTieringDatePolicyStatusResponse datePolicyStatus;
    /**
     * Information regarding files that failed to be tiered
     * 
     */
    private final CloudTieringFilesNotTieringResponse filesNotTiering;
    /**
     * Cloud tiering health state.
     * 
     */
    private final String health;
    /**
     * The last updated timestamp of health state
     * 
     */
    private final String healthLastUpdatedTimestamp;
    /**
     * Last cloud tiering result (HResult)
     * 
     */
    private final Integer lastCloudTieringResult;
    /**
     * Last cloud tiering success timestamp
     * 
     */
    private final String lastSuccessTimestamp;
    /**
     * Last updated timestamp
     * 
     */
    private final String lastUpdatedTimestamp;
    /**
     * Information regarding how much local space cloud tiering is saving.
     * 
     */
    private final CloudTieringSpaceSavingsResponse spaceSavings;
    /**
     * Status of the volume free space policy
     * 
     */
    private final CloudTieringVolumeFreeSpacePolicyStatusResponse volumeFreeSpacePolicyStatus;

    @OutputCustomType.Constructor
    private ServerEndpointCloudTieringStatusResponse(
        @OutputCustomType.Parameter("cachePerformance") CloudTieringCachePerformanceResponse cachePerformance,
        @OutputCustomType.Parameter("datePolicyStatus") CloudTieringDatePolicyStatusResponse datePolicyStatus,
        @OutputCustomType.Parameter("filesNotTiering") CloudTieringFilesNotTieringResponse filesNotTiering,
        @OutputCustomType.Parameter("health") String health,
        @OutputCustomType.Parameter("healthLastUpdatedTimestamp") String healthLastUpdatedTimestamp,
        @OutputCustomType.Parameter("lastCloudTieringResult") Integer lastCloudTieringResult,
        @OutputCustomType.Parameter("lastSuccessTimestamp") String lastSuccessTimestamp,
        @OutputCustomType.Parameter("lastUpdatedTimestamp") String lastUpdatedTimestamp,
        @OutputCustomType.Parameter("spaceSavings") CloudTieringSpaceSavingsResponse spaceSavings,
        @OutputCustomType.Parameter("volumeFreeSpacePolicyStatus") CloudTieringVolumeFreeSpacePolicyStatusResponse volumeFreeSpacePolicyStatus) {
        this.cachePerformance = cachePerformance;
        this.datePolicyStatus = datePolicyStatus;
        this.filesNotTiering = filesNotTiering;
        this.health = health;
        this.healthLastUpdatedTimestamp = healthLastUpdatedTimestamp;
        this.lastCloudTieringResult = lastCloudTieringResult;
        this.lastSuccessTimestamp = lastSuccessTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.spaceSavings = spaceSavings;
        this.volumeFreeSpacePolicyStatus = volumeFreeSpacePolicyStatus;
    }

    /**
     * Information regarding how well the local cache on the server is performing.
     * 
    */
    public CloudTieringCachePerformanceResponse getCachePerformance() {
        return this.cachePerformance;
    }
    /**
     * Status of the date policy
     * 
    */
    public CloudTieringDatePolicyStatusResponse getDatePolicyStatus() {
        return this.datePolicyStatus;
    }
    /**
     * Information regarding files that failed to be tiered
     * 
    */
    public CloudTieringFilesNotTieringResponse getFilesNotTiering() {
        return this.filesNotTiering;
    }
    /**
     * Cloud tiering health state.
     * 
    */
    public String getHealth() {
        return this.health;
    }
    /**
     * The last updated timestamp of health state
     * 
    */
    public String getHealthLastUpdatedTimestamp() {
        return this.healthLastUpdatedTimestamp;
    }
    /**
     * Last cloud tiering result (HResult)
     * 
    */
    public Integer getLastCloudTieringResult() {
        return this.lastCloudTieringResult;
    }
    /**
     * Last cloud tiering success timestamp
     * 
    */
    public String getLastSuccessTimestamp() {
        return this.lastSuccessTimestamp;
    }
    /**
     * Last updated timestamp
     * 
    */
    public String getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }
    /**
     * Information regarding how much local space cloud tiering is saving.
     * 
    */
    public CloudTieringSpaceSavingsResponse getSpaceSavings() {
        return this.spaceSavings;
    }
    /**
     * Status of the volume free space policy
     * 
    */
    public CloudTieringVolumeFreeSpacePolicyStatusResponse getVolumeFreeSpacePolicyStatus() {
        return this.volumeFreeSpacePolicyStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerEndpointCloudTieringStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudTieringCachePerformanceResponse cachePerformance;
        private CloudTieringDatePolicyStatusResponse datePolicyStatus;
        private CloudTieringFilesNotTieringResponse filesNotTiering;
        private String health;
        private String healthLastUpdatedTimestamp;
        private Integer lastCloudTieringResult;
        private String lastSuccessTimestamp;
        private String lastUpdatedTimestamp;
        private CloudTieringSpaceSavingsResponse spaceSavings;
        private CloudTieringVolumeFreeSpacePolicyStatusResponse volumeFreeSpacePolicyStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerEndpointCloudTieringStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cachePerformance = defaults.cachePerformance;
    	      this.datePolicyStatus = defaults.datePolicyStatus;
    	      this.filesNotTiering = defaults.filesNotTiering;
    	      this.health = defaults.health;
    	      this.healthLastUpdatedTimestamp = defaults.healthLastUpdatedTimestamp;
    	      this.lastCloudTieringResult = defaults.lastCloudTieringResult;
    	      this.lastSuccessTimestamp = defaults.lastSuccessTimestamp;
    	      this.lastUpdatedTimestamp = defaults.lastUpdatedTimestamp;
    	      this.spaceSavings = defaults.spaceSavings;
    	      this.volumeFreeSpacePolicyStatus = defaults.volumeFreeSpacePolicyStatus;
        }

        public Builder cachePerformance(CloudTieringCachePerformanceResponse cachePerformance) {
            this.cachePerformance = Objects.requireNonNull(cachePerformance);
            return this;
        }

        public Builder datePolicyStatus(CloudTieringDatePolicyStatusResponse datePolicyStatus) {
            this.datePolicyStatus = Objects.requireNonNull(datePolicyStatus);
            return this;
        }

        public Builder filesNotTiering(CloudTieringFilesNotTieringResponse filesNotTiering) {
            this.filesNotTiering = Objects.requireNonNull(filesNotTiering);
            return this;
        }

        public Builder health(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }

        public Builder healthLastUpdatedTimestamp(String healthLastUpdatedTimestamp) {
            this.healthLastUpdatedTimestamp = Objects.requireNonNull(healthLastUpdatedTimestamp);
            return this;
        }

        public Builder lastCloudTieringResult(Integer lastCloudTieringResult) {
            this.lastCloudTieringResult = Objects.requireNonNull(lastCloudTieringResult);
            return this;
        }

        public Builder lastSuccessTimestamp(String lastSuccessTimestamp) {
            this.lastSuccessTimestamp = Objects.requireNonNull(lastSuccessTimestamp);
            return this;
        }

        public Builder lastUpdatedTimestamp(String lastUpdatedTimestamp) {
            this.lastUpdatedTimestamp = Objects.requireNonNull(lastUpdatedTimestamp);
            return this;
        }

        public Builder spaceSavings(CloudTieringSpaceSavingsResponse spaceSavings) {
            this.spaceSavings = Objects.requireNonNull(spaceSavings);
            return this;
        }

        public Builder volumeFreeSpacePolicyStatus(CloudTieringVolumeFreeSpacePolicyStatusResponse volumeFreeSpacePolicyStatus) {
            this.volumeFreeSpacePolicyStatus = Objects.requireNonNull(volumeFreeSpacePolicyStatus);
            return this;
        }
        public ServerEndpointCloudTieringStatusResponse build() {
            return new ServerEndpointCloudTieringStatusResponse(cachePerformance, datePolicyStatus, filesNotTiering, health, healthLastUpdatedTimestamp, lastCloudTieringResult, lastSuccessTimestamp, lastUpdatedTimestamp, spaceSavings, volumeFreeSpacePolicyStatus);
        }
    }
}
