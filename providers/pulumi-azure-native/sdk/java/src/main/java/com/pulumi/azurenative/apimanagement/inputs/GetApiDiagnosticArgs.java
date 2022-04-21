// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApiDiagnosticArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiDiagnosticArgs Empty = new GetApiDiagnosticArgs();

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
     * Diagnostic identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="diagnosticId", required=true)
    private String diagnosticId;

    public String diagnosticId() {
        return this.diagnosticId;
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

    private GetApiDiagnosticArgs() {}

    private GetApiDiagnosticArgs(GetApiDiagnosticArgs $) {
        this.apiId = $.apiId;
        this.diagnosticId = $.diagnosticId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiDiagnosticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiDiagnosticArgs $;

        public Builder() {
            $ = new GetApiDiagnosticArgs();
        }

        public Builder(GetApiDiagnosticArgs defaults) {
            $ = new GetApiDiagnosticArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiId(String apiId) {
            $.apiId = apiId;
            return this;
        }

        public Builder diagnosticId(String diagnosticId) {
            $.diagnosticId = diagnosticId;
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

        public GetApiDiagnosticArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.diagnosticId = Objects.requireNonNull($.diagnosticId, "expected parameter 'diagnosticId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
