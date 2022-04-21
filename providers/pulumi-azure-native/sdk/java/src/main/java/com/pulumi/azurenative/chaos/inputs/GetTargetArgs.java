// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.chaos.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTargetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetArgs Empty = new GetTargetArgs();

    /**
     * String that represents a resource provider namespace.
     * 
     */
    @Import(name="parentProviderNamespace", required=true)
    private String parentProviderNamespace;

    public String parentProviderNamespace() {
        return this.parentProviderNamespace;
    }

    /**
     * String that represents a resource name.
     * 
     */
    @Import(name="parentResourceName", required=true)
    private String parentResourceName;

    public String parentResourceName() {
        return this.parentResourceName;
    }

    /**
     * String that represents a resource type.
     * 
     */
    @Import(name="parentResourceType", required=true)
    private String parentResourceType;

    public String parentResourceType() {
        return this.parentResourceType;
    }

    /**
     * String that represents an Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * String that represents a Target resource name.
     * 
     */
    @Import(name="targetName", required=true)
    private String targetName;

    public String targetName() {
        return this.targetName;
    }

    private GetTargetArgs() {}

    private GetTargetArgs(GetTargetArgs $) {
        this.parentProviderNamespace = $.parentProviderNamespace;
        this.parentResourceName = $.parentResourceName;
        this.parentResourceType = $.parentResourceType;
        this.resourceGroupName = $.resourceGroupName;
        this.targetName = $.targetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetArgs $;

        public Builder() {
            $ = new GetTargetArgs();
        }

        public Builder(GetTargetArgs defaults) {
            $ = new GetTargetArgs(Objects.requireNonNull(defaults));
        }

        public Builder parentProviderNamespace(String parentProviderNamespace) {
            $.parentProviderNamespace = parentProviderNamespace;
            return this;
        }

        public Builder parentResourceName(String parentResourceName) {
            $.parentResourceName = parentResourceName;
            return this;
        }

        public Builder parentResourceType(String parentResourceType) {
            $.parentResourceType = parentResourceType;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder targetName(String targetName) {
            $.targetName = targetName;
            return this;
        }

        public GetTargetArgs build() {
            $.parentProviderNamespace = Objects.requireNonNull($.parentProviderNamespace, "expected parameter 'parentProviderNamespace' to be non-null");
            $.parentResourceName = Objects.requireNonNull($.parentResourceName, "expected parameter 'parentResourceName' to be non-null");
            $.parentResourceType = Objects.requireNonNull($.parentResourceType, "expected parameter 'parentResourceType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.targetName = Objects.requireNonNull($.targetName, "expected parameter 'targetName' to be non-null");
            return $;
        }
    }

}
