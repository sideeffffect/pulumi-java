// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * SSL configuration for a DomainMapping resource.
 * 
 */
public final class SslSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SslSettingsResponse Empty = new SslSettingsResponse();

    /**
     * ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support.By default, a managed certificate is automatically created for every domain mapping. To omit SSL support or to configure SSL manually, specify SslManagementType.MANUAL on a CREATE or UPDATE request. You must be authorized to administer the AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
     * 
     */
    @InputImport(name="certificateId", required=true)
      private final String certificateId;

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * ID of the managed AuthorizedCertificate resource currently being provisioned, if applicable. Until the new managed certificate has been successfully provisioned, the previous SSL state will be preserved. Once the provisioning process completes, the certificate_id field will reflect the new managed certificate and this field will be left empty. To remove SSL support while there is still a pending managed certificate, clear the certificate_id field with an UpdateDomainMappingRequest.
     * 
     */
    @InputImport(name="pendingManagedCertificateId", required=true)
      private final String pendingManagedCertificateId;

    public String getPendingManagedCertificateId() {
        return this.pendingManagedCertificateId;
    }

    /**
     * SSL management type for this domain. If AUTOMATIC, a managed certificate is automatically provisioned. If MANUAL, certificate_id must be manually specified in order to configure SSL for this domain.
     * 
     */
    @InputImport(name="sslManagementType", required=true)
      private final String sslManagementType;

    public String getSslManagementType() {
        return this.sslManagementType;
    }

    public SslSettingsResponse(
        String certificateId,
        String pendingManagedCertificateId,
        String sslManagementType) {
        this.certificateId = Objects.requireNonNull(certificateId, "expected parameter 'certificateId' to be non-null");
        this.pendingManagedCertificateId = Objects.requireNonNull(pendingManagedCertificateId, "expected parameter 'pendingManagedCertificateId' to be non-null");
        this.sslManagementType = Objects.requireNonNull(sslManagementType, "expected parameter 'sslManagementType' to be non-null");
    }

    private SslSettingsResponse() {
        this.certificateId = null;
        this.pendingManagedCertificateId = null;
        this.sslManagementType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateId;
        private String pendingManagedCertificateId;
        private String sslManagementType;

        public Builder() {
    	      // Empty
        }

        public Builder(SslSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateId = defaults.certificateId;
    	      this.pendingManagedCertificateId = defaults.pendingManagedCertificateId;
    	      this.sslManagementType = defaults.sslManagementType;
        }

        public Builder certificateId(String certificateId) {
            this.certificateId = Objects.requireNonNull(certificateId);
            return this;
        }

        public Builder pendingManagedCertificateId(String pendingManagedCertificateId) {
            this.pendingManagedCertificateId = Objects.requireNonNull(pendingManagedCertificateId);
            return this;
        }

        public Builder sslManagementType(String sslManagementType) {
            this.sslManagementType = Objects.requireNonNull(sslManagementType);
            return this;
        }
        public SslSettingsResponse build() {
            return new SslSettingsResponse(certificateId, pendingManagedCertificateId, sslManagementType);
        }
    }
}
