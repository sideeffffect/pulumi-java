// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A private link resource
 * 
 */
public final class PrivateLinkResourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateLinkResourceResponse Empty = new PrivateLinkResourceResponse();

    /**
     * The group ID of the resource.
     * 
     */
    @InputImport(name="groupId")
      private final @Nullable String groupId;

    public Optional<String> getGroupId() {
        return this.groupId == null ? Optional.empty() : Optional.ofNullable(this.groupId);
    }

    /**
     * The ID of the private link resource.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name of the private link resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The private link service ID of the resource, this field is exposed only to NRP internally.
     * 
     */
    @InputImport(name="privateLinkServiceID", required=true)
      private final String privateLinkServiceID;

    public String getPrivateLinkServiceID() {
        return this.privateLinkServiceID;
    }

    /**
     * RequiredMembers of the resource
     * 
     */
    @InputImport(name="requiredMembers")
      private final @Nullable List<String> requiredMembers;

    public List<String> getRequiredMembers() {
        return this.requiredMembers == null ? List.of() : this.requiredMembers;
    }

    /**
     * The resource type.
     * 
     */
    @InputImport(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public PrivateLinkResourceResponse(
        @Nullable String groupId,
        @Nullable String id,
        @Nullable String name,
        String privateLinkServiceID,
        @Nullable List<String> requiredMembers,
        @Nullable String type) {
        this.groupId = groupId;
        this.id = id;
        this.name = name;
        this.privateLinkServiceID = Objects.requireNonNull(privateLinkServiceID, "expected parameter 'privateLinkServiceID' to be non-null");
        this.requiredMembers = requiredMembers;
        this.type = type;
    }

    private PrivateLinkResourceResponse() {
        this.groupId = null;
        this.id = null;
        this.name = null;
        this.privateLinkServiceID = null;
        this.requiredMembers = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String groupId;
        private @Nullable String id;
        private @Nullable String name;
        private String privateLinkServiceID;
        private @Nullable List<String> requiredMembers;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateLinkServiceID = defaults.privateLinkServiceID;
    	      this.requiredMembers = defaults.requiredMembers;
    	      this.type = defaults.type;
        }

        public Builder groupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder privateLinkServiceID(String privateLinkServiceID) {
            this.privateLinkServiceID = Objects.requireNonNull(privateLinkServiceID);
            return this;
        }

        public Builder requiredMembers(@Nullable List<String> requiredMembers) {
            this.requiredMembers = requiredMembers;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public PrivateLinkResourceResponse build() {
            return new PrivateLinkResourceResponse(groupId, id, name, privateLinkServiceID, requiredMembers, type);
        }
    }
}
