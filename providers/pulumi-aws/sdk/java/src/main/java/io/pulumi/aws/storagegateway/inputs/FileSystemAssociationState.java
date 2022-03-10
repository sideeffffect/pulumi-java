// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway.inputs;

import io.pulumi.aws.storagegateway.inputs.FileSystemAssociationCacheAttributesGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FileSystemAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final FileSystemAssociationState Empty = new FileSystemAssociationState();

    /**
     * Amazon Resource Name (ARN) of the newly created file system association.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * 
     */
    @InputImport(name="auditDestinationArn")
      private final @Nullable Input<String> auditDestinationArn;

    public Input<String> getAuditDestinationArn() {
        return this.auditDestinationArn == null ? Input.empty() : this.auditDestinationArn;
    }

    /**
     * Refresh cache information. see Cache Attributes for more details.
     * 
     */
    @InputImport(name="cacheAttributes")
      private final @Nullable Input<FileSystemAssociationCacheAttributesGetArgs> cacheAttributes;

    public Input<FileSystemAssociationCacheAttributesGetArgs> getCacheAttributes() {
        return this.cacheAttributes == null ? Input.empty() : this.cacheAttributes;
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    @InputImport(name="gatewayArn")
      private final @Nullable Input<String> gatewayArn;

    public Input<String> getGatewayArn() {
        return this.gatewayArn == null ? Input.empty() : this.gatewayArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
     * 
     */
    @InputImport(name="locationArn")
      private final @Nullable Input<String> locationArn;

    public Input<String> getLocationArn() {
        return this.locationArn == null ? Input.empty() : this.locationArn;
    }

    /**
     * The password of the user credential.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The user name of the user credential that has permission to access the root share of the Amazon FSx file system. The user account must belong to the Amazon FSx delegated admin user group.
     * 
     */
    @InputImport(name="username")
      private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public FileSystemAssociationState(
        @Nullable Input<String> arn,
        @Nullable Input<String> auditDestinationArn,
        @Nullable Input<FileSystemAssociationCacheAttributesGetArgs> cacheAttributes,
        @Nullable Input<String> gatewayArn,
        @Nullable Input<String> locationArn,
        @Nullable Input<String> password,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> username) {
        this.arn = arn;
        this.auditDestinationArn = auditDestinationArn;
        this.cacheAttributes = cacheAttributes;
        this.gatewayArn = gatewayArn;
        this.locationArn = locationArn;
        this.password = password;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.username = username;
    }

    private FileSystemAssociationState() {
        this.arn = Input.empty();
        this.auditDestinationArn = Input.empty();
        this.cacheAttributes = Input.empty();
        this.gatewayArn = Input.empty();
        this.locationArn = Input.empty();
        this.password = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> auditDestinationArn;
        private @Nullable Input<FileSystemAssociationCacheAttributesGetArgs> cacheAttributes;
        private @Nullable Input<String> gatewayArn;
        private @Nullable Input<String> locationArn;
        private @Nullable Input<String> password;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.auditDestinationArn = defaults.auditDestinationArn;
    	      this.cacheAttributes = defaults.cacheAttributes;
    	      this.gatewayArn = defaults.gatewayArn;
    	      this.locationArn = defaults.locationArn;
    	      this.password = defaults.password;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.username = defaults.username;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder auditDestinationArn(@Nullable Input<String> auditDestinationArn) {
            this.auditDestinationArn = auditDestinationArn;
            return this;
        }

        public Builder auditDestinationArn(@Nullable String auditDestinationArn) {
            this.auditDestinationArn = Input.ofNullable(auditDestinationArn);
            return this;
        }

        public Builder cacheAttributes(@Nullable Input<FileSystemAssociationCacheAttributesGetArgs> cacheAttributes) {
            this.cacheAttributes = cacheAttributes;
            return this;
        }

        public Builder cacheAttributes(@Nullable FileSystemAssociationCacheAttributesGetArgs cacheAttributes) {
            this.cacheAttributes = Input.ofNullable(cacheAttributes);
            return this;
        }

        public Builder gatewayArn(@Nullable Input<String> gatewayArn) {
            this.gatewayArn = gatewayArn;
            return this;
        }

        public Builder gatewayArn(@Nullable String gatewayArn) {
            this.gatewayArn = Input.ofNullable(gatewayArn);
            return this;
        }

        public Builder locationArn(@Nullable Input<String> locationArn) {
            this.locationArn = locationArn;
            return this;
        }

        public Builder locationArn(@Nullable String locationArn) {
            this.locationArn = Input.ofNullable(locationArn);
            return this;
        }

        public Builder password(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder username(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }
        public FileSystemAssociationState build() {
            return new FileSystemAssociationState(arn, auditDestinationArn, cacheAttributes, gatewayArn, locationArn, password, tags, tagsAll, username);
        }
    }
}
