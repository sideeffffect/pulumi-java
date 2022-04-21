// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTemplateSpecVersionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTemplateSpecVersionArgs Empty = new GetTemplateSpecVersionArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the Template Spec.
     * 
     */
    @Import(name="templateSpecName", required=true)
    private String templateSpecName;

    public String templateSpecName() {
        return this.templateSpecName;
    }

    /**
     * The version of the Template Spec.
     * 
     */
    @Import(name="templateSpecVersion", required=true)
    private String templateSpecVersion;

    public String templateSpecVersion() {
        return this.templateSpecVersion;
    }

    private GetTemplateSpecVersionArgs() {}

    private GetTemplateSpecVersionArgs(GetTemplateSpecVersionArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.templateSpecName = $.templateSpecName;
        this.templateSpecVersion = $.templateSpecVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTemplateSpecVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTemplateSpecVersionArgs $;

        public Builder() {
            $ = new GetTemplateSpecVersionArgs();
        }

        public Builder(GetTemplateSpecVersionArgs defaults) {
            $ = new GetTemplateSpecVersionArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder templateSpecName(String templateSpecName) {
            $.templateSpecName = templateSpecName;
            return this;
        }

        public Builder templateSpecVersion(String templateSpecVersion) {
            $.templateSpecVersion = templateSpecVersion;
            return this;
        }

        public GetTemplateSpecVersionArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.templateSpecName = Objects.requireNonNull($.templateSpecName, "expected parameter 'templateSpecName' to be non-null");
            $.templateSpecVersion = Objects.requireNonNull($.templateSpecVersion, "expected parameter 'templateSpecVersion' to be non-null");
            return $;
        }
    }

}
