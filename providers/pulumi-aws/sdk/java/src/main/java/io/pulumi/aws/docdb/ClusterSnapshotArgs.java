// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ClusterSnapshotArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterSnapshotArgs Empty = new ClusterSnapshotArgs();

    /**
     * The DocDB Cluster Identifier from which to take the snapshot.
     * 
     */
    @Import(name="dbClusterIdentifier", required=true)
      private final Output<String> dbClusterIdentifier;

    public Output<String> dbClusterIdentifier() {
        return this.dbClusterIdentifier;
    }

    /**
     * The Identifier for the snapshot.
     * 
     */
    @Import(name="dbClusterSnapshotIdentifier", required=true)
      private final Output<String> dbClusterSnapshotIdentifier;

    public Output<String> dbClusterSnapshotIdentifier() {
        return this.dbClusterSnapshotIdentifier;
    }

    public ClusterSnapshotArgs(
        Output<String> dbClusterIdentifier,
        Output<String> dbClusterSnapshotIdentifier) {
        this.dbClusterIdentifier = Objects.requireNonNull(dbClusterIdentifier, "expected parameter 'dbClusterIdentifier' to be non-null");
        this.dbClusterSnapshotIdentifier = Objects.requireNonNull(dbClusterSnapshotIdentifier, "expected parameter 'dbClusterSnapshotIdentifier' to be non-null");
    }

    private ClusterSnapshotArgs() {
        this.dbClusterIdentifier = Codegen.empty();
        this.dbClusterSnapshotIdentifier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dbClusterIdentifier;
        private Output<String> dbClusterSnapshotIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterSnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbClusterIdentifier = defaults.dbClusterIdentifier;
    	      this.dbClusterSnapshotIdentifier = defaults.dbClusterSnapshotIdentifier;
        }

        public Builder dbClusterIdentifier(Output<String> dbClusterIdentifier) {
            this.dbClusterIdentifier = Objects.requireNonNull(dbClusterIdentifier);
            return this;
        }
        public Builder dbClusterIdentifier(String dbClusterIdentifier) {
            this.dbClusterIdentifier = Output.of(Objects.requireNonNull(dbClusterIdentifier));
            return this;
        }
        public Builder dbClusterSnapshotIdentifier(Output<String> dbClusterSnapshotIdentifier) {
            this.dbClusterSnapshotIdentifier = Objects.requireNonNull(dbClusterSnapshotIdentifier);
            return this;
        }
        public Builder dbClusterSnapshotIdentifier(String dbClusterSnapshotIdentifier) {
            this.dbClusterSnapshotIdentifier = Output.of(Objects.requireNonNull(dbClusterSnapshotIdentifier));
            return this;
        }        public ClusterSnapshotArgs build() {
            return new ClusterSnapshotArgs(dbClusterIdentifier, dbClusterSnapshotIdentifier);
        }
    }
}
