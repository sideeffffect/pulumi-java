// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApiIssueAttachmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiIssueAttachmentArgs Empty = new GetApiIssueAttachmentArgs();

    /**
     * API identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="apiId", required=true)
    private String apiId;

    public String apiId() {
        return this.apiId;
    }

    /**
     * Attachment identifier within an Issue. Must be unique in the current Issue.
     * 
     */
    @Import(name="attachmentId", required=true)
    private String attachmentId;

    public String attachmentId() {
        return this.attachmentId;
    }

    /**
     * Issue identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="issueId", required=true)
    private String issueId;

    public String issueId() {
        return this.issueId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    private GetApiIssueAttachmentArgs() {}

    private GetApiIssueAttachmentArgs(GetApiIssueAttachmentArgs $) {
        this.apiId = $.apiId;
        this.attachmentId = $.attachmentId;
        this.issueId = $.issueId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiIssueAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiIssueAttachmentArgs $;

        public Builder() {
            $ = new GetApiIssueAttachmentArgs();
        }

        public Builder(GetApiIssueAttachmentArgs defaults) {
            $ = new GetApiIssueAttachmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiId(String apiId) {
            $.apiId = apiId;
            return this;
        }

        public Builder attachmentId(String attachmentId) {
            $.attachmentId = attachmentId;
            return this;
        }

        public Builder issueId(String issueId) {
            $.issueId = issueId;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetApiIssueAttachmentArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.attachmentId = Objects.requireNonNull($.attachmentId, "expected parameter 'attachmentId' to be non-null");
            $.issueId = Objects.requireNonNull($.issueId, "expected parameter 'issueId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
