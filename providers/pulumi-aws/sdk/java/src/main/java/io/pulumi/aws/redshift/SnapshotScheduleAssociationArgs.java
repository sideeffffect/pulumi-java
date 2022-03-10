// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SnapshotScheduleAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotScheduleAssociationArgs Empty = new SnapshotScheduleAssociationArgs();

    /**
     * The cluster identifier.
     * 
     */
    @InputImport(name="clusterIdentifier", required=true)
      private final Input<String> clusterIdentifier;

    public Input<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * The snapshot schedule identifier.
     * 
     */
    @InputImport(name="scheduleIdentifier", required=true)
      private final Input<String> scheduleIdentifier;

    public Input<String> getScheduleIdentifier() {
        return this.scheduleIdentifier;
    }

    public SnapshotScheduleAssociationArgs(
        Input<String> clusterIdentifier,
        Input<String> scheduleIdentifier) {
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
        this.scheduleIdentifier = Objects.requireNonNull(scheduleIdentifier, "expected parameter 'scheduleIdentifier' to be non-null");
    }

    private SnapshotScheduleAssociationArgs() {
        this.clusterIdentifier = Input.empty();
        this.scheduleIdentifier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotScheduleAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterIdentifier;
        private Input<String> scheduleIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotScheduleAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.scheduleIdentifier = defaults.scheduleIdentifier;
        }

        public Builder clusterIdentifier(Input<String> clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }

        public Builder clusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Input.of(Objects.requireNonNull(clusterIdentifier));
            return this;
        }

        public Builder scheduleIdentifier(Input<String> scheduleIdentifier) {
            this.scheduleIdentifier = Objects.requireNonNull(scheduleIdentifier);
            return this;
        }

        public Builder scheduleIdentifier(String scheduleIdentifier) {
            this.scheduleIdentifier = Input.of(Objects.requireNonNull(scheduleIdentifier));
            return this;
        }
        public SnapshotScheduleAssociationArgs build() {
            return new SnapshotScheduleAssociationArgs(clusterIdentifier, scheduleIdentifier);
        }
    }
}
