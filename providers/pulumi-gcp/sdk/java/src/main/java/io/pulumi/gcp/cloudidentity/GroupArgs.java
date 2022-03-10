// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudidentity;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudidentity.inputs.GroupGroupKeyArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupArgs Empty = new GroupArgs();

    /**
     * An extended description to help users determine the purpose of a Group.
     * Must not be longer than 4,096 characters.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The display name of the Group.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * EntityKey of the Group.
     * Structure is documented below.
     * 
     */
    @InputImport(name="groupKey", required=true)
      private final Input<GroupGroupKeyArgs> groupKey;

    public Input<GroupGroupKeyArgs> getGroupKey() {
        return this.groupKey;
    }

    /**
     * The initial configuration options for creating a Group.
     * See the
     * [API reference](https://cloud.google.com/identity/docs/reference/rest/v1beta1/groups/create#initialgroupconfig)
     * for possible values.
     * Default value is `EMPTY`.
     * Possible values are `INITIAL_GROUP_CONFIG_UNSPECIFIED`, `WITH_INITIAL_OWNER`, and `EMPTY`.
     * 
     */
    @InputImport(name="initialGroupConfig")
      private final @Nullable Input<String> initialGroupConfig;

    public Input<String> getInitialGroupConfig() {
        return this.initialGroupConfig == null ? Input.empty() : this.initialGroupConfig;
    }

    /**
     * The labels that apply to the Group.
     * Must not contain more than one entry. Must contain the entry
     * 'cloudidentity.googleapis.com/groups.discussion_forum': '' if the Group is a Google Group or
     * 'system/groups/external': '' if the Group is an external-identity-mapped group.
     * 
     */
    @InputImport(name="labels", required=true)
      private final Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels;
    }

    /**
     * The resource name of the entity under which this Group resides in the
     * Cloud Identity resource hierarchy.
     * Must be of the form identitysources/{identity_source_id} for external-identity-mapped
     * groups or customers/{customer_id} for Google Groups.
     * 
     */
    @InputImport(name="parent", required=true)
      private final Input<String> parent;

    public Input<String> getParent() {
        return this.parent;
    }

    public GroupArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        Input<GroupGroupKeyArgs> groupKey,
        @Nullable Input<String> initialGroupConfig,
        Input<Map<String,String>> labels,
        Input<String> parent) {
        this.description = description;
        this.displayName = displayName;
        this.groupKey = Objects.requireNonNull(groupKey, "expected parameter 'groupKey' to be non-null");
        this.initialGroupConfig = initialGroupConfig;
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
    }

    private GroupArgs() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.groupKey = Input.empty();
        this.initialGroupConfig = Input.empty();
        this.labels = Input.empty();
        this.parent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private Input<GroupGroupKeyArgs> groupKey;
        private @Nullable Input<String> initialGroupConfig;
        private Input<Map<String,String>> labels;
        private Input<String> parent;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.groupKey = defaults.groupKey;
    	      this.initialGroupConfig = defaults.initialGroupConfig;
    	      this.labels = defaults.labels;
    	      this.parent = defaults.parent;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder displayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder groupKey(Input<GroupGroupKeyArgs> groupKey) {
            this.groupKey = Objects.requireNonNull(groupKey);
            return this;
        }

        public Builder groupKey(GroupGroupKeyArgs groupKey) {
            this.groupKey = Input.of(Objects.requireNonNull(groupKey));
            return this;
        }

        public Builder initialGroupConfig(@Nullable Input<String> initialGroupConfig) {
            this.initialGroupConfig = initialGroupConfig;
            return this;
        }

        public Builder initialGroupConfig(@Nullable String initialGroupConfig) {
            this.initialGroupConfig = Input.ofNullable(initialGroupConfig);
            return this;
        }

        public Builder labels(Input<Map<String,String>> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Input.of(Objects.requireNonNull(labels));
            return this;
        }

        public Builder parent(Input<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder parent(String parent) {
            this.parent = Input.of(Objects.requireNonNull(parent));
            return this;
        }
        public GroupArgs build() {
            return new GroupArgs(description, displayName, groupKey, initialGroupConfig, labels, parent);
        }
    }
}
