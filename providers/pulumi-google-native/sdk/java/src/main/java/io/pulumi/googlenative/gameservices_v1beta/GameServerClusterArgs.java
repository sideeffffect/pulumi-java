// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gameservices_v1beta.inputs.GameServerClusterConnectionInfoArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerClusterArgs Empty = new GameServerClusterArgs();

    /**
     * The game server cluster connection information. This information is used to manage game server clusters.
     * 
     */
    @InputImport(name="connectionInfo")
      private final @Nullable Input<GameServerClusterConnectionInfoArgs> connectionInfo;

    public Input<GameServerClusterConnectionInfoArgs> getConnectionInfo() {
        return this.connectionInfo == null ? Input.empty() : this.connectionInfo;
    }

    /**
     * Human readable description of the cluster.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * ETag of the resource.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="gameServerClusterId", required=true)
      private final Input<String> gameServerClusterId;

    public Input<String> getGameServerClusterId() {
        return this.gameServerClusterId;
    }

    /**
     * The labels associated with this game server cluster. Each label is a key-value pair.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The resource name of the game server cluster, in the following form: `projects/{project}/locations/{location}/realms/{realm}/gameServerClusters/{cluster}`. For example, `projects/my-project/locations/{location}/realms/zanzibar/gameServerClusters/my-onprem-cluster`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="realmId", required=true)
      private final Input<String> realmId;

    public Input<String> getRealmId() {
        return this.realmId;
    }

    public GameServerClusterArgs(
        @Nullable Input<GameServerClusterConnectionInfoArgs> connectionInfo,
        @Nullable Input<String> description,
        @Nullable Input<String> etag,
        Input<String> gameServerClusterId,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        Input<String> realmId) {
        this.connectionInfo = connectionInfo;
        this.description = description;
        this.etag = etag;
        this.gameServerClusterId = Objects.requireNonNull(gameServerClusterId, "expected parameter 'gameServerClusterId' to be non-null");
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.realmId = Objects.requireNonNull(realmId, "expected parameter 'realmId' to be non-null");
    }

    private GameServerClusterArgs() {
        this.connectionInfo = Input.empty();
        this.description = Input.empty();
        this.etag = Input.empty();
        this.gameServerClusterId = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.realmId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GameServerClusterConnectionInfoArgs> connectionInfo;
        private @Nullable Input<String> description;
        private @Nullable Input<String> etag;
        private Input<String> gameServerClusterId;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private Input<String> realmId;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionInfo = defaults.connectionInfo;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.gameServerClusterId = defaults.gameServerClusterId;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.realmId = defaults.realmId;
        }

        public Builder connectionInfo(@Nullable Input<GameServerClusterConnectionInfoArgs> connectionInfo) {
            this.connectionInfo = connectionInfo;
            return this;
        }

        public Builder connectionInfo(@Nullable GameServerClusterConnectionInfoArgs connectionInfo) {
            this.connectionInfo = Input.ofNullable(connectionInfo);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder etag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder gameServerClusterId(Input<String> gameServerClusterId) {
            this.gameServerClusterId = Objects.requireNonNull(gameServerClusterId);
            return this;
        }

        public Builder gameServerClusterId(String gameServerClusterId) {
            this.gameServerClusterId = Input.of(Objects.requireNonNull(gameServerClusterId));
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
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

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder realmId(Input<String> realmId) {
            this.realmId = Objects.requireNonNull(realmId);
            return this;
        }

        public Builder realmId(String realmId) {
            this.realmId = Input.of(Objects.requireNonNull(realmId));
            return this;
        }
        public GameServerClusterArgs build() {
            return new GameServerClusterArgs(connectionInfo, description, etag, gameServerClusterId, labels, location, name, project, realmId);
        }
    }
}
