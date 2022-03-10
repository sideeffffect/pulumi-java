// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight;

import io.pulumi.awsnative.quicksight.inputs.TemplateResourcePermissionArgs;
import io.pulumi.awsnative.quicksight.inputs.TemplateSourceEntityArgs;
import io.pulumi.awsnative.quicksight.inputs.TemplateTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final TemplateArgs Empty = new TemplateArgs();

    @InputImport(name="awsAccountId", required=true)
      private final Input<String> awsAccountId;

    public Input<String> getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>A display name for the template.</p>
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * <p>A list of resource permissions to be set on the template. </p>
     * 
     */
    @InputImport(name="permissions")
      private final @Nullable Input<List<TemplateResourcePermissionArgs>> permissions;

    public Input<List<TemplateResourcePermissionArgs>> getPermissions() {
        return this.permissions == null ? Input.empty() : this.permissions;
    }

    @InputImport(name="sourceEntity", required=true)
      private final Input<TemplateSourceEntityArgs> sourceEntity;

    public Input<TemplateSourceEntityArgs> getSourceEntity() {
        return this.sourceEntity;
    }

    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.</p>
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<TemplateTagArgs>> tags;

    public Input<List<TemplateTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="templateId", required=true)
      private final Input<String> templateId;

    public Input<String> getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>A description of the current template version being created. This API operation creates the
     * 			first version of the template. Every time <code>UpdateTemplate</code> is called, a new
     * 			version is created. Each version of the template maintains a description of the version
     * 			in the <code>VersionDescription</code> field.</p>
     * 
     */
    @InputImport(name="versionDescription")
      private final @Nullable Input<String> versionDescription;

    public Input<String> getVersionDescription() {
        return this.versionDescription == null ? Input.empty() : this.versionDescription;
    }

    public TemplateArgs(
        Input<String> awsAccountId,
        @Nullable Input<String> name,
        @Nullable Input<List<TemplateResourcePermissionArgs>> permissions,
        Input<TemplateSourceEntityArgs> sourceEntity,
        @Nullable Input<List<TemplateTagArgs>> tags,
        Input<String> templateId,
        @Nullable Input<String> versionDescription) {
        this.awsAccountId = Objects.requireNonNull(awsAccountId, "expected parameter 'awsAccountId' to be non-null");
        this.name = name;
        this.permissions = permissions;
        this.sourceEntity = Objects.requireNonNull(sourceEntity, "expected parameter 'sourceEntity' to be non-null");
        this.tags = tags;
        this.templateId = Objects.requireNonNull(templateId, "expected parameter 'templateId' to be non-null");
        this.versionDescription = versionDescription;
    }

    private TemplateArgs() {
        this.awsAccountId = Input.empty();
        this.name = Input.empty();
        this.permissions = Input.empty();
        this.sourceEntity = Input.empty();
        this.tags = Input.empty();
        this.templateId = Input.empty();
        this.versionDescription = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> awsAccountId;
        private @Nullable Input<String> name;
        private @Nullable Input<List<TemplateResourcePermissionArgs>> permissions;
        private Input<TemplateSourceEntityArgs> sourceEntity;
        private @Nullable Input<List<TemplateTagArgs>> tags;
        private Input<String> templateId;
        private @Nullable Input<String> versionDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.sourceEntity = defaults.sourceEntity;
    	      this.tags = defaults.tags;
    	      this.templateId = defaults.templateId;
    	      this.versionDescription = defaults.versionDescription;
        }

        public Builder awsAccountId(Input<String> awsAccountId) {
            this.awsAccountId = Objects.requireNonNull(awsAccountId);
            return this;
        }

        public Builder awsAccountId(String awsAccountId) {
            this.awsAccountId = Input.of(Objects.requireNonNull(awsAccountId));
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

        public Builder permissions(@Nullable Input<List<TemplateResourcePermissionArgs>> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder permissions(@Nullable List<TemplateResourcePermissionArgs> permissions) {
            this.permissions = Input.ofNullable(permissions);
            return this;
        }

        public Builder sourceEntity(Input<TemplateSourceEntityArgs> sourceEntity) {
            this.sourceEntity = Objects.requireNonNull(sourceEntity);
            return this;
        }

        public Builder sourceEntity(TemplateSourceEntityArgs sourceEntity) {
            this.sourceEntity = Input.of(Objects.requireNonNull(sourceEntity));
            return this;
        }

        public Builder tags(@Nullable Input<List<TemplateTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<TemplateTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder templateId(Input<String> templateId) {
            this.templateId = Objects.requireNonNull(templateId);
            return this;
        }

        public Builder templateId(String templateId) {
            this.templateId = Input.of(Objects.requireNonNull(templateId));
            return this;
        }

        public Builder versionDescription(@Nullable Input<String> versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }

        public Builder versionDescription(@Nullable String versionDescription) {
            this.versionDescription = Input.ofNullable(versionDescription);
            return this;
        }
        public TemplateArgs build() {
            return new TemplateArgs(awsAccountId, name, permissions, sourceEntity, tags, templateId, versionDescription);
        }
    }
}
