// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetContentTypeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContentTypeArgs Empty = new GetContentTypeArgs();

    /**
     * Content type identifier.
     * 
     */
    @Import(name="contentTypeId", required=true)
    private Output<String> contentTypeId;

    /**
     * @return Content type identifier.
     * 
     */
    public Output<String> contentTypeId() {
        return this.contentTypeId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GetContentTypeArgs() {}

    private GetContentTypeArgs(GetContentTypeArgs $) {
        this.contentTypeId = $.contentTypeId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContentTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContentTypeArgs $;

        public Builder() {
            $ = new GetContentTypeArgs();
        }

        public Builder(GetContentTypeArgs defaults) {
            $ = new GetContentTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentTypeId Content type identifier.
         * 
         * @return builder
         * 
         */
        public Builder contentTypeId(Output<String> contentTypeId) {
            $.contentTypeId = contentTypeId;
            return this;
        }

        /**
         * @param contentTypeId Content type identifier.
         * 
         * @return builder
         * 
         */
        public Builder contentTypeId(String contentTypeId) {
            return contentTypeId(Output.of(contentTypeId));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GetContentTypeArgs build() {
            $.contentTypeId = Objects.requireNonNull($.contentTypeId, "expected parameter 'contentTypeId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
