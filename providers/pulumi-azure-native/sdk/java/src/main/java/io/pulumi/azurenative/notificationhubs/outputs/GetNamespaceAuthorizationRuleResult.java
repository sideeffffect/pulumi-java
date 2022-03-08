// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.outputs;

import io.pulumi.azurenative.notificationhubs.outputs.SkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNamespaceAuthorizationRuleResult {
    /**
     * A string that describes the claim type
     * 
     */
    private final String claimType;
    /**
     * A string that describes the claim value
     * 
     */
    private final String claimValue;
    /**
     * The created time for this rule
     * 
     */
    private final String createdTime;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * A string that describes the authorization rule.
     * 
     */
    private final String keyName;
    /**
     * Resource location
     * 
     */
    private final @Nullable String location;
    /**
     * The last modified time for this rule
     * 
     */
    private final String modifiedTime;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
     */
    private final String primaryKey;
    /**
     * The revision number for the rule
     * 
     */
    private final Integer revision;
    /**
     * The rights associated with the rule.
     * 
     */
    private final @Nullable List<String> rights;
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
     */
    private final String secondaryKey;
    /**
     * The sku of the created namespace
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"claimType","claimValue","createdTime","id","keyName","location","modifiedTime","name","primaryKey","revision","rights","secondaryKey","sku","tags","type"})
    private GetNamespaceAuthorizationRuleResult(
        String claimType,
        String claimValue,
        String createdTime,
        String id,
        String keyName,
        @Nullable String location,
        String modifiedTime,
        String name,
        String primaryKey,
        Integer revision,
        @Nullable List<String> rights,
        String secondaryKey,
        @Nullable SkuResponse sku,
        @Nullable Map<String,String> tags,
        String type) {
        this.claimType = claimType;
        this.claimValue = claimValue;
        this.createdTime = createdTime;
        this.id = id;
        this.keyName = keyName;
        this.location = location;
        this.modifiedTime = modifiedTime;
        this.name = name;
        this.primaryKey = primaryKey;
        this.revision = revision;
        this.rights = rights;
        this.secondaryKey = secondaryKey;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
    }

    /**
     * A string that describes the claim type
     * 
    */
    public String getClaimType() {
        return this.claimType;
    }
    /**
     * A string that describes the claim value
     * 
    */
    public String getClaimValue() {
        return this.claimValue;
    }
    /**
     * The created time for this rule
     * 
    */
    public String getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * A string that describes the authorization rule.
     * 
    */
    public String getKeyName() {
        return this.keyName;
    }
    /**
     * Resource location
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The last modified time for this rule
     * 
    */
    public String getModifiedTime() {
        return this.modifiedTime;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
    */
    public String getPrimaryKey() {
        return this.primaryKey;
    }
    /**
     * The revision number for the rule
     * 
    */
    public Integer getRevision() {
        return this.revision;
    }
    /**
     * The rights associated with the rule.
     * 
    */
    public List<String> getRights() {
        return this.rights == null ? List.of() : this.rights;
    }
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
    */
    public String getSecondaryKey() {
        return this.secondaryKey;
    }
    /**
     * The sku of the created namespace
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceAuthorizationRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String claimType;
        private String claimValue;
        private String createdTime;
        private String id;
        private String keyName;
        private @Nullable String location;
        private String modifiedTime;
        private String name;
        private String primaryKey;
        private Integer revision;
        private @Nullable List<String> rights;
        private String secondaryKey;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceAuthorizationRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claimType = defaults.claimType;
    	      this.claimValue = defaults.claimValue;
    	      this.createdTime = defaults.createdTime;
    	      this.id = defaults.id;
    	      this.keyName = defaults.keyName;
    	      this.location = defaults.location;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.name = defaults.name;
    	      this.primaryKey = defaults.primaryKey;
    	      this.revision = defaults.revision;
    	      this.rights = defaults.rights;
    	      this.secondaryKey = defaults.secondaryKey;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setClaimType(String claimType) {
            this.claimType = Objects.requireNonNull(claimType);
            return this;
        }

        public Builder setClaimValue(String claimValue) {
            this.claimValue = Objects.requireNonNull(claimValue);
            return this;
        }

        public Builder setCreatedTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setModifiedTime(String modifiedTime) {
            this.modifiedTime = Objects.requireNonNull(modifiedTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrimaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }

        public Builder setRevision(Integer revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }

        public Builder setRights(@Nullable List<String> rights) {
            this.rights = rights;
            return this;
        }

        public Builder setSecondaryKey(String secondaryKey) {
            this.secondaryKey = Objects.requireNonNull(secondaryKey);
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
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
        public GetNamespaceAuthorizationRuleResult build() {
            return new GetNamespaceAuthorizationRuleResult(claimType, claimValue, createdTime, id, keyName, location, modifiedTime, name, primaryKey, revision, rights, secondaryKey, sku, tags, type);
        }
    }
}
