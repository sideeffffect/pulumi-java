// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRestoreToPointInTime {
    /**
     * Date and time in UTC format to restore the database cluster to. Conflicts with `use_latest_restorable_time`.
     * 
     */
    private final @Nullable String restoreToTime;
    /**
     * Type of restore to be performed.
     * Valid options are `full-copy` (default) and `copy-on-write`.
     * 
     */
    private final @Nullable String restoreType;
    /**
     * The identifier of the source database cluster from which to restore.
     * 
     */
    private final String sourceClusterIdentifier;
    /**
     * Set to true to restore the database cluster to the latest restorable backup time. Defaults to false. Conflicts with `restore_to_time`.
     * 
     */
    private final @Nullable Boolean useLatestRestorableTime;

    @CustomType.Constructor
    private ClusterRestoreToPointInTime(
        @CustomType.Parameter("restoreToTime") @Nullable String restoreToTime,
        @CustomType.Parameter("restoreType") @Nullable String restoreType,
        @CustomType.Parameter("sourceClusterIdentifier") String sourceClusterIdentifier,
        @CustomType.Parameter("useLatestRestorableTime") @Nullable Boolean useLatestRestorableTime) {
        this.restoreToTime = restoreToTime;
        this.restoreType = restoreType;
        this.sourceClusterIdentifier = sourceClusterIdentifier;
        this.useLatestRestorableTime = useLatestRestorableTime;
    }

    /**
     * Date and time in UTC format to restore the database cluster to. Conflicts with `use_latest_restorable_time`.
     * 
    */
    public Optional<String> restoreToTime() {
        return Optional.ofNullable(this.restoreToTime);
    }
    /**
     * Type of restore to be performed.
     * Valid options are `full-copy` (default) and `copy-on-write`.
     * 
    */
    public Optional<String> restoreType() {
        return Optional.ofNullable(this.restoreType);
    }
    /**
     * The identifier of the source database cluster from which to restore.
     * 
    */
    public String sourceClusterIdentifier() {
        return this.sourceClusterIdentifier;
    }
    /**
     * Set to true to restore the database cluster to the latest restorable backup time. Defaults to false. Conflicts with `restore_to_time`.
     * 
    */
    public Optional<Boolean> useLatestRestorableTime() {
        return Optional.ofNullable(this.useLatestRestorableTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRestoreToPointInTime defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String restoreToTime;
        private @Nullable String restoreType;
        private String sourceClusterIdentifier;
        private @Nullable Boolean useLatestRestorableTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterRestoreToPointInTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.restoreToTime = defaults.restoreToTime;
    	      this.restoreType = defaults.restoreType;
    	      this.sourceClusterIdentifier = defaults.sourceClusterIdentifier;
    	      this.useLatestRestorableTime = defaults.useLatestRestorableTime;
        }

        public Builder restoreToTime(@Nullable String restoreToTime) {
            this.restoreToTime = restoreToTime;
            return this;
        }
        public Builder restoreType(@Nullable String restoreType) {
            this.restoreType = restoreType;
            return this;
        }
        public Builder sourceClusterIdentifier(String sourceClusterIdentifier) {
            this.sourceClusterIdentifier = Objects.requireNonNull(sourceClusterIdentifier);
            return this;
        }
        public Builder useLatestRestorableTime(@Nullable Boolean useLatestRestorableTime) {
            this.useLatestRestorableTime = useLatestRestorableTime;
            return this;
        }        public ClusterRestoreToPointInTime build() {
            return new ClusterRestoreToPointInTime(restoreToTime, restoreType, sourceClusterIdentifier, useLatestRestorableTime);
        }
    }
}
