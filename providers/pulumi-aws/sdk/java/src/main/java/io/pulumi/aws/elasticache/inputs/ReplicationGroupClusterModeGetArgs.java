// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticache.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationGroupClusterModeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationGroupClusterModeGetArgs Empty = new ReplicationGroupClusterModeGetArgs();

    /**
     * Number of node groups (shards) for this Redis replication group. Changing this number will trigger an online resizing operation before other settings modifications. Required unless `global_replication_group_id` is set.
     * 
     */
    @InputImport(name="numNodeGroups")
      private final @Nullable Input<Integer> numNodeGroups;

    public Input<Integer> getNumNodeGroups() {
        return this.numNodeGroups == null ? Input.empty() : this.numNodeGroups;
    }

    /**
     * Number of replica nodes in each node group. Valid values are 0 to 5. Changing this number will trigger an online resizing operation before other settings modifications.
     * 
     */
    @InputImport(name="replicasPerNodeGroup", required=true)
      private final Input<Integer> replicasPerNodeGroup;

    public Input<Integer> getReplicasPerNodeGroup() {
        return this.replicasPerNodeGroup;
    }

    public ReplicationGroupClusterModeGetArgs(
        @Nullable Input<Integer> numNodeGroups,
        Input<Integer> replicasPerNodeGroup) {
        this.numNodeGroups = numNodeGroups;
        this.replicasPerNodeGroup = Objects.requireNonNull(replicasPerNodeGroup, "expected parameter 'replicasPerNodeGroup' to be non-null");
    }

    private ReplicationGroupClusterModeGetArgs() {
        this.numNodeGroups = Input.empty();
        this.replicasPerNodeGroup = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationGroupClusterModeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> numNodeGroups;
        private Input<Integer> replicasPerNodeGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationGroupClusterModeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numNodeGroups = defaults.numNodeGroups;
    	      this.replicasPerNodeGroup = defaults.replicasPerNodeGroup;
        }

        public Builder numNodeGroups(@Nullable Input<Integer> numNodeGroups) {
            this.numNodeGroups = numNodeGroups;
            return this;
        }

        public Builder numNodeGroups(@Nullable Integer numNodeGroups) {
            this.numNodeGroups = Input.ofNullable(numNodeGroups);
            return this;
        }

        public Builder replicasPerNodeGroup(Input<Integer> replicasPerNodeGroup) {
            this.replicasPerNodeGroup = Objects.requireNonNull(replicasPerNodeGroup);
            return this;
        }

        public Builder replicasPerNodeGroup(Integer replicasPerNodeGroup) {
            this.replicasPerNodeGroup = Input.of(Objects.requireNonNull(replicasPerNodeGroup));
            return this;
        }
        public ReplicationGroupClusterModeGetArgs build() {
            return new ReplicationGroupClusterModeGetArgs(numNodeGroups, replicasPerNodeGroup);
        }
    }
}
