// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudkms_v1.outputs.CertificateResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ServiceResolverResponse {
    /**
     * Optional. The filter applied to the endpoints of the resolved service. If no filter is specified, all endpoints will be considered. An endpoint will be chosen arbitrarily from the filtered list for each request. For endpoint filter syntax and examples, see https://cloud.google.com/service-directory/docs/reference/rpc/google.cloud.servicedirectory.v1#resolveservicerequest.
     * 
     */
    private final String endpointFilter;
    /**
     * The hostname of the EKM replica used at TLS and HTTP layers.
     * 
     */
    private final String hostname;
    /**
     * A list of leaf server certificates used to authenticate HTTPS connections to the EKM replica.
     * 
     */
    private final List<CertificateResponse> serverCertificates;
    /**
     * The resource name of the Service Directory service pointing to an EKM replica, in the format `projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*`.
     * 
     */
    private final String serviceDirectoryService;

    @OutputCustomType.Constructor({"endpointFilter","hostname","serverCertificates","serviceDirectoryService"})
    private ServiceResolverResponse(
        String endpointFilter,
        String hostname,
        List<CertificateResponse> serverCertificates,
        String serviceDirectoryService) {
        this.endpointFilter = endpointFilter;
        this.hostname = hostname;
        this.serverCertificates = serverCertificates;
        this.serviceDirectoryService = serviceDirectoryService;
    }

    /**
     * Optional. The filter applied to the endpoints of the resolved service. If no filter is specified, all endpoints will be considered. An endpoint will be chosen arbitrarily from the filtered list for each request. For endpoint filter syntax and examples, see https://cloud.google.com/service-directory/docs/reference/rpc/google.cloud.servicedirectory.v1#resolveservicerequest.
     * 
    */
    public String getEndpointFilter() {
        return this.endpointFilter;
    }
    /**
     * The hostname of the EKM replica used at TLS and HTTP layers.
     * 
    */
    public String getHostname() {
        return this.hostname;
    }
    /**
     * A list of leaf server certificates used to authenticate HTTPS connections to the EKM replica.
     * 
    */
    public List<CertificateResponse> getServerCertificates() {
        return this.serverCertificates;
    }
    /**
     * The resource name of the Service Directory service pointing to an EKM replica, in the format `projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*`.
     * 
    */
    public String getServiceDirectoryService() {
        return this.serviceDirectoryService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceResolverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointFilter;
        private String hostname;
        private List<CertificateResponse> serverCertificates;
        private String serviceDirectoryService;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceResolverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointFilter = defaults.endpointFilter;
    	      this.hostname = defaults.hostname;
    	      this.serverCertificates = defaults.serverCertificates;
    	      this.serviceDirectoryService = defaults.serviceDirectoryService;
        }

        public Builder setEndpointFilter(String endpointFilter) {
            this.endpointFilter = Objects.requireNonNull(endpointFilter);
            return this;
        }

        public Builder setHostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }

        public Builder setServerCertificates(List<CertificateResponse> serverCertificates) {
            this.serverCertificates = Objects.requireNonNull(serverCertificates);
            return this;
        }

        public Builder setServiceDirectoryService(String serviceDirectoryService) {
            this.serviceDirectoryService = Objects.requireNonNull(serviceDirectoryService);
            return this;
        }
        public ServiceResolverResponse build() {
            return new ServiceResolverResponse(endpointFilter, hostname, serverCertificates, serviceDirectoryService);
        }
    }
}
