// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetArtifactSourceResult {
    /**
     * The folder containing Azure Resource Manager templates.
     * 
     */
    private final @Nullable String armTemplateFolderPath;
    /**
     * The artifact source's branch reference.
     * 
     */
    private final @Nullable String branchRef;
    /**
     * The artifact source's creation date.
     * 
     */
    private final String createdDate;
    /**
     * The artifact source's display name.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The folder containing artifacts.
     * 
     */
    private final @Nullable String folderPath;
    /**
     * The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * The location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The provisioning status of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The security token to authenticate to the artifact source.
     * 
     */
    private final @Nullable String securityToken;
    /**
     * The artifact source's type.
     * 
     */
    private final @Nullable String sourceType;
    /**
     * Indicates if the artifact source is enabled (values: Enabled, Disabled).
     * 
     */
    private final @Nullable String status;
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
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    private final String uniqueIdentifier;
    /**
     * The artifact source's URI.
     * 
     */
    private final @Nullable String uri;

    @OutputCustomType.Constructor({"armTemplateFolderPath","branchRef","createdDate","displayName","folderPath","id","location","name","provisioningState","securityToken","sourceType","status","tags","type","uniqueIdentifier","uri"})
    private GetArtifactSourceResult(
        @Nullable String armTemplateFolderPath,
        @Nullable String branchRef,
        String createdDate,
        @Nullable String displayName,
        @Nullable String folderPath,
        String id,
        @Nullable String location,
        String name,
        String provisioningState,
        @Nullable String securityToken,
        @Nullable String sourceType,
        @Nullable String status,
        @Nullable Map<String,String> tags,
        String type,
        String uniqueIdentifier,
        @Nullable String uri) {
        this.armTemplateFolderPath = armTemplateFolderPath;
        this.branchRef = branchRef;
        this.createdDate = createdDate;
        this.displayName = displayName;
        this.folderPath = folderPath;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.securityToken = securityToken;
        this.sourceType = sourceType;
        this.status = status;
        this.tags = tags;
        this.type = type;
        this.uniqueIdentifier = uniqueIdentifier;
        this.uri = uri;
    }

    /**
     * The folder containing Azure Resource Manager templates.
     * 
    */
    public Optional<String> getArmTemplateFolderPath() {
        return Optional.ofNullable(this.armTemplateFolderPath);
    }
    /**
     * The artifact source's branch reference.
     * 
    */
    public Optional<String> getBranchRef() {
        return Optional.ofNullable(this.branchRef);
    }
    /**
     * The artifact source's creation date.
     * 
    */
    public String getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The artifact source's display name.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The folder containing artifacts.
     * 
    */
    public Optional<String> getFolderPath() {
        return Optional.ofNullable(this.folderPath);
    }
    /**
     * The identifier of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The location of the resource.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning status of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The security token to authenticate to the artifact source.
     * 
    */
    public Optional<String> getSecurityToken() {
        return Optional.ofNullable(this.securityToken);
    }
    /**
     * The artifact source's type.
     * 
    */
    public Optional<String> getSourceType() {
        return Optional.ofNullable(this.sourceType);
    }
    /**
     * Indicates if the artifact source is enabled (values: Enabled, Disabled).
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
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
     * The unique immutable identifier of a resource (Guid).
     * 
    */
    public String getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }
    /**
     * The artifact source's URI.
     * 
    */
    public Optional<String> getUri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetArtifactSourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String armTemplateFolderPath;
        private @Nullable String branchRef;
        private String createdDate;
        private @Nullable String displayName;
        private @Nullable String folderPath;
        private String id;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private @Nullable String securityToken;
        private @Nullable String sourceType;
        private @Nullable String status;
        private @Nullable Map<String,String> tags;
        private String type;
        private String uniqueIdentifier;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetArtifactSourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.armTemplateFolderPath = defaults.armTemplateFolderPath;
    	      this.branchRef = defaults.branchRef;
    	      this.createdDate = defaults.createdDate;
    	      this.displayName = defaults.displayName;
    	      this.folderPath = defaults.folderPath;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.securityToken = defaults.securityToken;
    	      this.sourceType = defaults.sourceType;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
    	      this.uri = defaults.uri;
        }

        public Builder setArmTemplateFolderPath(@Nullable String armTemplateFolderPath) {
            this.armTemplateFolderPath = armTemplateFolderPath;
            return this;
        }

        public Builder setBranchRef(@Nullable String branchRef) {
            this.branchRef = branchRef;
            return this;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setFolderPath(@Nullable String folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
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

        public Builder setSecurityToken(@Nullable String securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        public Builder setSourceType(@Nullable String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
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

        public Builder setUniqueIdentifier(String uniqueIdentifier) {
            this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public GetArtifactSourceResult build() {
            return new GetArtifactSourceResult(armTemplateFolderPath, branchRef, createdDate, displayName, folderPath, id, location, name, provisioningState, securityToken, sourceType, status, tags, type, uniqueIdentifier, uri);
        }
    }
}
