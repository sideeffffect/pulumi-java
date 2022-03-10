// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCertificateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCertificateArgs Empty = new GetCertificateArgs();

    /**
     * Identifier of the certificate entity. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="certificateId", required=true)
      private final String certificateId;

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetCertificateArgs(
        String certificateId,
        String resourceGroupName,
        String serviceName) {
        this.certificateId = Objects.requireNonNull(certificateId, "expected parameter 'certificateId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetCertificateArgs() {
        this.certificateId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateId = defaults.certificateId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder certificateId(String certificateId) {
            this.certificateId = Objects.requireNonNull(certificateId);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public GetCertificateArgs build() {
            return new GetCertificateArgs(certificateId, resourceGroupName, serviceName);
        }
    }
}
