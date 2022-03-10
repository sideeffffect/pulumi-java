// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterSnapshotCopyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterSnapshotCopyGetArgs Empty = new ClusterSnapshotCopyGetArgs();

    /**
     * The destination region that you want to copy snapshots to.
     * 
     */
    @InputImport(name="destinationRegion", required=true)
      private final Input<String> destinationRegion;

    public Input<String> getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * The name of the snapshot copy grant to use when snapshots of an AWS KMS-encrypted cluster are copied to the destination region.
     * 
     */
    @InputImport(name="grantName")
      private final @Nullable Input<String> grantName;

    public Input<String> getGrantName() {
        return this.grantName == null ? Input.empty() : this.grantName;
    }

    /**
     * The number of days to retain automated snapshots in the destination region after they are copied from the source region. Defaults to `7`.
     * 
     */
    @InputImport(name="retentionPeriod")
      private final @Nullable Input<Integer> retentionPeriod;

    public Input<Integer> getRetentionPeriod() {
        return this.retentionPeriod == null ? Input.empty() : this.retentionPeriod;
    }

    public ClusterSnapshotCopyGetArgs(
        Input<String> destinationRegion,
        @Nullable Input<String> grantName,
        @Nullable Input<Integer> retentionPeriod) {
        this.destinationRegion = Objects.requireNonNull(destinationRegion, "expected parameter 'destinationRegion' to be non-null");
        this.grantName = grantName;
        this.retentionPeriod = retentionPeriod;
    }

    private ClusterSnapshotCopyGetArgs() {
        this.destinationRegion = Input.empty();
        this.grantName = Input.empty();
        this.retentionPeriod = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSnapshotCopyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> destinationRegion;
        private @Nullable Input<String> grantName;
        private @Nullable Input<Integer> retentionPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterSnapshotCopyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationRegion = defaults.destinationRegion;
    	      this.grantName = defaults.grantName;
    	      this.retentionPeriod = defaults.retentionPeriod;
        }

        public Builder destinationRegion(Input<String> destinationRegion) {
            this.destinationRegion = Objects.requireNonNull(destinationRegion);
            return this;
        }

        public Builder destinationRegion(String destinationRegion) {
            this.destinationRegion = Input.of(Objects.requireNonNull(destinationRegion));
            return this;
        }

        public Builder grantName(@Nullable Input<String> grantName) {
            this.grantName = grantName;
            return this;
        }

        public Builder grantName(@Nullable String grantName) {
            this.grantName = Input.ofNullable(grantName);
            return this;
        }

        public Builder retentionPeriod(@Nullable Input<Integer> retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }

        public Builder retentionPeriod(@Nullable Integer retentionPeriod) {
            this.retentionPeriod = Input.ofNullable(retentionPeriod);
            return this;
        }
        public ClusterSnapshotCopyGetArgs build() {
            return new ClusterSnapshotCopyGetArgs(destinationRegion, grantName, retentionPeriod);
        }
    }
}
