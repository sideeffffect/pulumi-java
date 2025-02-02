// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.outputs;

import com.pulumi.azurenative.kusto.outputs.DatabaseStatisticsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetReadOnlyFollowingDatabaseResult {
    /**
     * @return The name of the attached database configuration cluster
     * 
     */
    private final String attachedDatabaseConfigurationName;
    /**
     * @return The time the data should be kept in cache for fast queries in TimeSpan.
     * 
     */
    private final @Nullable String hotCachePeriod;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return Kind of the database
     * Expected value is &#39;ReadOnlyFollowing&#39;.
     * 
     */
    private final String kind;
    /**
     * @return The name of the leader cluster
     * 
     */
    private final String leaderClusterResourceId;
    /**
     * @return Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return The principals modification kind of the database
     * 
     */
    private final String principalsModificationKind;
    /**
     * @return The provisioned state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return The time the data should be kept before it stops being accessible to queries in TimeSpan.
     * 
     */
    private final String softDeletePeriod;
    /**
     * @return The statistics of the database.
     * 
     */
    private final DatabaseStatisticsResponse statistics;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetReadOnlyFollowingDatabaseResult(
        @CustomType.Parameter("attachedDatabaseConfigurationName") String attachedDatabaseConfigurationName,
        @CustomType.Parameter("hotCachePeriod") @Nullable String hotCachePeriod,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("leaderClusterResourceId") String leaderClusterResourceId,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("principalsModificationKind") String principalsModificationKind,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("softDeletePeriod") String softDeletePeriod,
        @CustomType.Parameter("statistics") DatabaseStatisticsResponse statistics,
        @CustomType.Parameter("type") String type) {
        this.attachedDatabaseConfigurationName = attachedDatabaseConfigurationName;
        this.hotCachePeriod = hotCachePeriod;
        this.id = id;
        this.kind = kind;
        this.leaderClusterResourceId = leaderClusterResourceId;
        this.location = location;
        this.name = name;
        this.principalsModificationKind = principalsModificationKind;
        this.provisioningState = provisioningState;
        this.softDeletePeriod = softDeletePeriod;
        this.statistics = statistics;
        this.type = type;
    }

    /**
     * @return The name of the attached database configuration cluster
     * 
     */
    public String attachedDatabaseConfigurationName() {
        return this.attachedDatabaseConfigurationName;
    }
    /**
     * @return The time the data should be kept in cache for fast queries in TimeSpan.
     * 
     */
    public Optional<String> hotCachePeriod() {
        return Optional.ofNullable(this.hotCachePeriod);
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Kind of the database
     * Expected value is &#39;ReadOnlyFollowing&#39;.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The name of the leader cluster
     * 
     */
    public String leaderClusterResourceId() {
        return this.leaderClusterResourceId;
    }
    /**
     * @return Resource location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The principals modification kind of the database
     * 
     */
    public String principalsModificationKind() {
        return this.principalsModificationKind;
    }
    /**
     * @return The provisioned state of the resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The time the data should be kept before it stops being accessible to queries in TimeSpan.
     * 
     */
    public String softDeletePeriod() {
        return this.softDeletePeriod;
    }
    /**
     * @return The statistics of the database.
     * 
     */
    public DatabaseStatisticsResponse statistics() {
        return this.statistics;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReadOnlyFollowingDatabaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attachedDatabaseConfigurationName;
        private @Nullable String hotCachePeriod;
        private String id;
        private String kind;
        private String leaderClusterResourceId;
        private @Nullable String location;
        private String name;
        private String principalsModificationKind;
        private String provisioningState;
        private String softDeletePeriod;
        private DatabaseStatisticsResponse statistics;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReadOnlyFollowingDatabaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedDatabaseConfigurationName = defaults.attachedDatabaseConfigurationName;
    	      this.hotCachePeriod = defaults.hotCachePeriod;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.leaderClusterResourceId = defaults.leaderClusterResourceId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.principalsModificationKind = defaults.principalsModificationKind;
    	      this.provisioningState = defaults.provisioningState;
    	      this.softDeletePeriod = defaults.softDeletePeriod;
    	      this.statistics = defaults.statistics;
    	      this.type = defaults.type;
        }

        public Builder attachedDatabaseConfigurationName(String attachedDatabaseConfigurationName) {
            this.attachedDatabaseConfigurationName = Objects.requireNonNull(attachedDatabaseConfigurationName);
            return this;
        }
        public Builder hotCachePeriod(@Nullable String hotCachePeriod) {
            this.hotCachePeriod = hotCachePeriod;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder leaderClusterResourceId(String leaderClusterResourceId) {
            this.leaderClusterResourceId = Objects.requireNonNull(leaderClusterResourceId);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder principalsModificationKind(String principalsModificationKind) {
            this.principalsModificationKind = Objects.requireNonNull(principalsModificationKind);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder softDeletePeriod(String softDeletePeriod) {
            this.softDeletePeriod = Objects.requireNonNull(softDeletePeriod);
            return this;
        }
        public Builder statistics(DatabaseStatisticsResponse statistics) {
            this.statistics = Objects.requireNonNull(statistics);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetReadOnlyFollowingDatabaseResult build() {
            return new GetReadOnlyFollowingDatabaseResult(attachedDatabaseConfigurationName, hotCachePeriod, id, kind, leaderClusterResourceId, location, name, principalsModificationKind, provisioningState, softDeletePeriod, statistics, type);
        }
    }
}
