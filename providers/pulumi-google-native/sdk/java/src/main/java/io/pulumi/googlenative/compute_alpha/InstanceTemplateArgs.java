// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.InstancePropertiesArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SourceInstanceParamsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateArgs Empty = new InstanceTemplateArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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

    /**
     * The instance properties for this instance template.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<InstancePropertiesArgs> properties;

    public Input<InstancePropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * The source instance used to create the template. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
     * 
     */
    @InputImport(name="sourceInstance")
      private final @Nullable Input<String> sourceInstance;

    public Input<String> getSourceInstance() {
        return this.sourceInstance == null ? Input.empty() : this.sourceInstance;
    }

    /**
     * The source instance params to use to create this instance template.
     * 
     */
    @InputImport(name="sourceInstanceParams")
      private final @Nullable Input<SourceInstanceParamsArgs> sourceInstanceParams;

    public Input<SourceInstanceParamsArgs> getSourceInstanceParams() {
        return this.sourceInstanceParams == null ? Input.empty() : this.sourceInstanceParams;
    }

    public InstanceTemplateArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<InstancePropertiesArgs> properties,
        @Nullable Input<String> requestId,
        @Nullable Input<String> sourceInstance,
        @Nullable Input<SourceInstanceParamsArgs> sourceInstanceParams) {
        this.description = description;
        this.name = name;
        this.project = project;
        this.properties = properties;
        this.requestId = requestId;
        this.sourceInstance = sourceInstance;
        this.sourceInstanceParams = sourceInstanceParams;
    }

    private InstanceTemplateArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.properties = Input.empty();
        this.requestId = Input.empty();
        this.sourceInstance = Input.empty();
        this.sourceInstanceParams = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<InstancePropertiesArgs> properties;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> sourceInstance;
        private @Nullable Input<SourceInstanceParamsArgs> sourceInstanceParams;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.properties = defaults.properties;
    	      this.requestId = defaults.requestId;
    	      this.sourceInstance = defaults.sourceInstance;
    	      this.sourceInstanceParams = defaults.sourceInstanceParams;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder properties(@Nullable Input<InstancePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable InstancePropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder requestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder sourceInstance(@Nullable Input<String> sourceInstance) {
            this.sourceInstance = sourceInstance;
            return this;
        }

        public Builder sourceInstance(@Nullable String sourceInstance) {
            this.sourceInstance = Input.ofNullable(sourceInstance);
            return this;
        }

        public Builder sourceInstanceParams(@Nullable Input<SourceInstanceParamsArgs> sourceInstanceParams) {
            this.sourceInstanceParams = sourceInstanceParams;
            return this;
        }

        public Builder sourceInstanceParams(@Nullable SourceInstanceParamsArgs sourceInstanceParams) {
            this.sourceInstanceParams = Input.ofNullable(sourceInstanceParams);
            return this;
        }
        public InstanceTemplateArgs build() {
            return new InstanceTemplateArgs(description, name, project, properties, requestId, sourceInstance, sourceInstanceParams);
        }
    }
}
