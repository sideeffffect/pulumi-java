// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticache;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalReplicationGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalReplicationGroupArgs Empty = new GlobalReplicationGroupArgs();

    /**
     * A user-created description for the global replication group.
     * 
     */
    @InputImport(name="globalReplicationGroupDescription")
      private final @Nullable Input<String> globalReplicationGroupDescription;

    public Input<String> getGlobalReplicationGroupDescription() {
        return this.globalReplicationGroupDescription == null ? Input.empty() : this.globalReplicationGroupDescription;
    }

    /**
     * The suffix name of a Global Datastore. If `global_replication_group_id_suffix` is changed, creates a new resource.
     * 
     */
    @InputImport(name="globalReplicationGroupIdSuffix", required=true)
      private final Input<String> globalReplicationGroupIdSuffix;

    public Input<String> getGlobalReplicationGroupIdSuffix() {
        return this.globalReplicationGroupIdSuffix;
    }

    /**
     * The ID of the primary cluster that accepts writes and will replicate updates to the secondary cluster. If `primary_replication_group_id` is changed, creates a new resource.
     * 
     */
    @InputImport(name="primaryReplicationGroupId", required=true)
      private final Input<String> primaryReplicationGroupId;

    public Input<String> getPrimaryReplicationGroupId() {
        return this.primaryReplicationGroupId;
    }

    public GlobalReplicationGroupArgs(
        @Nullable Input<String> globalReplicationGroupDescription,
        Input<String> globalReplicationGroupIdSuffix,
        Input<String> primaryReplicationGroupId) {
        this.globalReplicationGroupDescription = globalReplicationGroupDescription;
        this.globalReplicationGroupIdSuffix = Objects.requireNonNull(globalReplicationGroupIdSuffix, "expected parameter 'globalReplicationGroupIdSuffix' to be non-null");
        this.primaryReplicationGroupId = Objects.requireNonNull(primaryReplicationGroupId, "expected parameter 'primaryReplicationGroupId' to be non-null");
    }

    private GlobalReplicationGroupArgs() {
        this.globalReplicationGroupDescription = Input.empty();
        this.globalReplicationGroupIdSuffix = Input.empty();
        this.primaryReplicationGroupId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalReplicationGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> globalReplicationGroupDescription;
        private Input<String> globalReplicationGroupIdSuffix;
        private Input<String> primaryReplicationGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalReplicationGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.globalReplicationGroupDescription = defaults.globalReplicationGroupDescription;
    	      this.globalReplicationGroupIdSuffix = defaults.globalReplicationGroupIdSuffix;
    	      this.primaryReplicationGroupId = defaults.primaryReplicationGroupId;
        }

        public Builder globalReplicationGroupDescription(@Nullable Input<String> globalReplicationGroupDescription) {
            this.globalReplicationGroupDescription = globalReplicationGroupDescription;
            return this;
        }

        public Builder globalReplicationGroupDescription(@Nullable String globalReplicationGroupDescription) {
            this.globalReplicationGroupDescription = Input.ofNullable(globalReplicationGroupDescription);
            return this;
        }

        public Builder globalReplicationGroupIdSuffix(Input<String> globalReplicationGroupIdSuffix) {
            this.globalReplicationGroupIdSuffix = Objects.requireNonNull(globalReplicationGroupIdSuffix);
            return this;
        }

        public Builder globalReplicationGroupIdSuffix(String globalReplicationGroupIdSuffix) {
            this.globalReplicationGroupIdSuffix = Input.of(Objects.requireNonNull(globalReplicationGroupIdSuffix));
            return this;
        }

        public Builder primaryReplicationGroupId(Input<String> primaryReplicationGroupId) {
            this.primaryReplicationGroupId = Objects.requireNonNull(primaryReplicationGroupId);
            return this;
        }

        public Builder primaryReplicationGroupId(String primaryReplicationGroupId) {
            this.primaryReplicationGroupId = Input.of(Objects.requireNonNull(primaryReplicationGroupId));
            return this;
        }
        public GlobalReplicationGroupArgs build() {
            return new GlobalReplicationGroupArgs(globalReplicationGroupDescription, globalReplicationGroupIdSuffix, primaryReplicationGroupId);
        }
    }
}
