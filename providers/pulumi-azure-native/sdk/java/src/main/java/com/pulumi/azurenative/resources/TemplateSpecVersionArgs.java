// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources;

import com.pulumi.azurenative.resources.inputs.LinkedTemplateArtifactArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TemplateSpecVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TemplateSpecVersionArgs Empty = new TemplateSpecVersionArgs();

    /**
     * Template Spec version description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * An array of linked template artifacts.
     * 
     */
    @Import(name="linkedTemplates")
    private @Nullable Output<List<LinkedTemplateArtifactArgs>> linkedTemplates;

    public Optional<Output<List<LinkedTemplateArtifactArgs>>> linkedTemplates() {
        return Optional.ofNullable(this.linkedTemplates);
    }

    /**
     * The location of the Template Spec Version. It must match the location of the parent Template Spec.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The main Azure Resource Manager template content.
     * 
     */
    @Import(name="mainTemplate")
    private @Nullable Output<Object> mainTemplate;

    public Optional<Output<Object>> mainTemplate() {
        return Optional.ofNullable(this.mainTemplate);
    }

    /**
     * The version metadata. Metadata is an open-ended object and is typically a collection of key-value pairs.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Object> metadata;

    public Optional<Output<Object>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Name of the Template Spec.
     * 
     */
    @Import(name="templateSpecName", required=true)
    private Output<String> templateSpecName;

    public Output<String> templateSpecName() {
        return this.templateSpecName;
    }

    /**
     * The version of the Template Spec.
     * 
     */
    @Import(name="templateSpecVersion")
    private @Nullable Output<String> templateSpecVersion;

    public Optional<Output<String>> templateSpecVersion() {
        return Optional.ofNullable(this.templateSpecVersion);
    }

    /**
     * The Azure Resource Manager template UI definition content.
     * 
     */
    @Import(name="uiFormDefinition")
    private @Nullable Output<Object> uiFormDefinition;

    public Optional<Output<Object>> uiFormDefinition() {
        return Optional.ofNullable(this.uiFormDefinition);
    }

    private TemplateSpecVersionArgs() {}

    private TemplateSpecVersionArgs(TemplateSpecVersionArgs $) {
        this.description = $.description;
        this.linkedTemplates = $.linkedTemplates;
        this.location = $.location;
        this.mainTemplate = $.mainTemplate;
        this.metadata = $.metadata;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.templateSpecName = $.templateSpecName;
        this.templateSpecVersion = $.templateSpecVersion;
        this.uiFormDefinition = $.uiFormDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateSpecVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateSpecVersionArgs $;

        public Builder() {
            $ = new TemplateSpecVersionArgs();
        }

        public Builder(TemplateSpecVersionArgs defaults) {
            $ = new TemplateSpecVersionArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder linkedTemplates(@Nullable Output<List<LinkedTemplateArtifactArgs>> linkedTemplates) {
            $.linkedTemplates = linkedTemplates;
            return this;
        }

        public Builder linkedTemplates(List<LinkedTemplateArtifactArgs> linkedTemplates) {
            return linkedTemplates(Output.of(linkedTemplates));
        }

        public Builder linkedTemplates(LinkedTemplateArtifactArgs... linkedTemplates) {
            return linkedTemplates(List.of(linkedTemplates));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder mainTemplate(@Nullable Output<Object> mainTemplate) {
            $.mainTemplate = mainTemplate;
            return this;
        }

        public Builder mainTemplate(Object mainTemplate) {
            return mainTemplate(Output.of(mainTemplate));
        }

        public Builder metadata(@Nullable Output<Object> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(Object metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder templateSpecName(Output<String> templateSpecName) {
            $.templateSpecName = templateSpecName;
            return this;
        }

        public Builder templateSpecName(String templateSpecName) {
            return templateSpecName(Output.of(templateSpecName));
        }

        public Builder templateSpecVersion(@Nullable Output<String> templateSpecVersion) {
            $.templateSpecVersion = templateSpecVersion;
            return this;
        }

        public Builder templateSpecVersion(String templateSpecVersion) {
            return templateSpecVersion(Output.of(templateSpecVersion));
        }

        public Builder uiFormDefinition(@Nullable Output<Object> uiFormDefinition) {
            $.uiFormDefinition = uiFormDefinition;
            return this;
        }

        public Builder uiFormDefinition(Object uiFormDefinition) {
            return uiFormDefinition(Output.of(uiFormDefinition));
        }

        public TemplateSpecVersionArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.templateSpecName = Objects.requireNonNull($.templateSpecName, "expected parameter 'templateSpecName' to be non-null");
            return $;
        }
    }

}
