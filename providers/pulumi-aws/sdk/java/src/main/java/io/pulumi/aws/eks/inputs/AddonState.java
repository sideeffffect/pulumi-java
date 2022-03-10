// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AddonState extends io.pulumi.resources.ResourceArgs {

    public static final AddonState Empty = new AddonState();

    /**
     * Name of the EKS add-on. The name must match one of
     * the names returned by [list-addon](https://docs.aws.amazon.com/cli/latest/reference/eks/list-addons.html).
     * 
     */
    @InputImport(name="addonName")
      private final @Nullable Input<String> addonName;

    public Input<String> getAddonName() {
        return this.addonName == null ? Input.empty() : this.addonName;
    }

    /**
     * The version of the EKS add-on. The version must
     * match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     * 
     */
    @InputImport(name="addonVersion")
      private final @Nullable Input<String> addonVersion;

    public Input<String> getAddonVersion() {
        return this.addonVersion == null ? Input.empty() : this.addonVersion;
    }

    /**
     * Amazon Resource Name (ARN) of the EKS add-on.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    @InputImport(name="clusterName")
      private final @Nullable Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName == null ? Input.empty() : this.clusterName;
    }

    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
     * 
     */
    @InputImport(name="createdAt")
      private final @Nullable Input<String> createdAt;

    public Input<String> getCreatedAt() {
        return this.createdAt == null ? Input.empty() : this.createdAt;
    }

    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
     * 
     */
    @InputImport(name="modifiedAt")
      private final @Nullable Input<String> modifiedAt;

    public Input<String> getModifiedAt() {
        return this.modifiedAt == null ? Input.empty() : this.modifiedAt;
    }

    /**
     * Define how to resolve parameter value conflicts
     * when migrating an existing add-on to an Amazon EKS add-on or when applying
     * version updates to the add-on. Valid values are `NONE` and `OVERWRITE`.
     * 
     */
    @InputImport(name="resolveConflicts")
      private final @Nullable Input<String> resolveConflicts;

    public Input<String> getResolveConflicts() {
        return this.resolveConflicts == null ? Input.empty() : this.resolveConflicts;
    }

    /**
     * The Amazon Resource Name (ARN) of an
     * existing IAM role to bind to the add-on's service account. The role must be
     * assigned the IAM permissions required by the add-on. If you don't specify
     * an existing IAM role, then the add-on uses the permissions assigned to the node
     * IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
     * in the Amazon EKS User Guide.
     * 
     */
    @InputImport(name="serviceAccountRoleArn")
      private final @Nullable Input<String> serviceAccountRoleArn;

    public Input<String> getServiceAccountRoleArn() {
        return this.serviceAccountRoleArn == null ? Input.empty() : this.serviceAccountRoleArn;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * (Optional) Key-value map of resource tags, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public AddonState(
        @Nullable Input<String> addonName,
        @Nullable Input<String> addonVersion,
        @Nullable Input<String> arn,
        @Nullable Input<String> clusterName,
        @Nullable Input<String> createdAt,
        @Nullable Input<String> modifiedAt,
        @Nullable Input<String> resolveConflicts,
        @Nullable Input<String> serviceAccountRoleArn,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.addonName = addonName;
        this.addonVersion = addonVersion;
        this.arn = arn;
        this.clusterName = clusterName;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.resolveConflicts = resolveConflicts;
        this.serviceAccountRoleArn = serviceAccountRoleArn;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private AddonState() {
        this.addonName = Input.empty();
        this.addonVersion = Input.empty();
        this.arn = Input.empty();
        this.clusterName = Input.empty();
        this.createdAt = Input.empty();
        this.modifiedAt = Input.empty();
        this.resolveConflicts = Input.empty();
        this.serviceAccountRoleArn = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddonState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> addonName;
        private @Nullable Input<String> addonVersion;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> clusterName;
        private @Nullable Input<String> createdAt;
        private @Nullable Input<String> modifiedAt;
        private @Nullable Input<String> resolveConflicts;
        private @Nullable Input<String> serviceAccountRoleArn;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(AddonState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonName = defaults.addonName;
    	      this.addonVersion = defaults.addonVersion;
    	      this.arn = defaults.arn;
    	      this.clusterName = defaults.clusterName;
    	      this.createdAt = defaults.createdAt;
    	      this.modifiedAt = defaults.modifiedAt;
    	      this.resolveConflicts = defaults.resolveConflicts;
    	      this.serviceAccountRoleArn = defaults.serviceAccountRoleArn;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder addonName(@Nullable Input<String> addonName) {
            this.addonName = addonName;
            return this;
        }

        public Builder addonName(@Nullable String addonName) {
            this.addonName = Input.ofNullable(addonName);
            return this;
        }

        public Builder addonVersion(@Nullable Input<String> addonVersion) {
            this.addonVersion = addonVersion;
            return this;
        }

        public Builder addonVersion(@Nullable String addonVersion) {
            this.addonVersion = Input.ofNullable(addonVersion);
            return this;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder clusterName(@Nullable Input<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Input.ofNullable(clusterName);
            return this;
        }

        public Builder createdAt(@Nullable Input<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = Input.ofNullable(createdAt);
            return this;
        }

        public Builder modifiedAt(@Nullable Input<String> modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        public Builder modifiedAt(@Nullable String modifiedAt) {
            this.modifiedAt = Input.ofNullable(modifiedAt);
            return this;
        }

        public Builder resolveConflicts(@Nullable Input<String> resolveConflicts) {
            this.resolveConflicts = resolveConflicts;
            return this;
        }

        public Builder resolveConflicts(@Nullable String resolveConflicts) {
            this.resolveConflicts = Input.ofNullable(resolveConflicts);
            return this;
        }

        public Builder serviceAccountRoleArn(@Nullable Input<String> serviceAccountRoleArn) {
            this.serviceAccountRoleArn = serviceAccountRoleArn;
            return this;
        }

        public Builder serviceAccountRoleArn(@Nullable String serviceAccountRoleArn) {
            this.serviceAccountRoleArn = Input.ofNullable(serviceAccountRoleArn);
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
        public AddonState build() {
            return new AddonState(addonName, addonVersion, arn, clusterName, createdAt, modifiedAt, resolveConflicts, serviceAccountRoleArn, tags, tagsAll);
        }
    }
}
