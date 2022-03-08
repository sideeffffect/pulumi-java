// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningexperimentation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkspaceResult {
    /**
     * The immutable id of the team account which contains this workspace.
     * 
     */
    private final String accountId;
    /**
     * The creation date of the machine learning workspace in ISO8601 format.
     * 
     */
    private final String creationDate;
    /**
     * The description of this workspace.
     * 
     */
    private final @Nullable String description;
    /**
     * The friendly name for this workspace. This will be the workspace name in the arm id when the workspace object gets created
     * 
     */
    private final String friendlyName;
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    private final String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The current deployment state of team account workspace resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    private final String provisioningState;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The immutable id of this workspace.
     * 
     */
    private final String workspaceId;

    @OutputCustomType.Constructor({"accountId","creationDate","description","friendlyName","id","location","name","provisioningState","tags","type","workspaceId"})
    private GetWorkspaceResult(
        String accountId,
        String creationDate,
        @Nullable String description,
        String friendlyName,
        String id,
        String location,
        String name,
        String provisioningState,
        @Nullable Map<String,String> tags,
        String type,
        String workspaceId) {
        this.accountId = accountId;
        this.creationDate = creationDate;
        this.description = description;
        this.friendlyName = friendlyName;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.type = type;
        this.workspaceId = workspaceId;
    }

    /**
     * The immutable id of the team account which contains this workspace.
     * 
    */
    public String getAccountId() {
        return this.accountId;
    }
    /**
     * The creation date of the machine learning workspace in ISO8601 format.
     * 
    */
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * The description of this workspace.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The friendly name for this workspace. This will be the workspace name in the arm id when the workspace object gets created
     * 
    */
    public String getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * The resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The current deployment state of team account workspace resource. The provisioningState is to indicate states for resource provisioning.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The immutable id of this workspace.
     * 
    */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private String creationDate;
        private @Nullable String description;
        private String friendlyName;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        private String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.creationDate = defaults.creationDate;
    	      this.description = defaults.description;
    	      this.friendlyName = defaults.friendlyName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder setAccountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder setCreationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFriendlyName(String friendlyName) {
            this.friendlyName = Objects.requireNonNull(friendlyName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWorkspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }
        public GetWorkspaceResult build() {
            return new GetWorkspaceResult(accountId, creationDate, description, friendlyName, id, location, name, provisioningState, tags, type, workspaceId);
        }
    }
}
