// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networksecurity.v1.outputs.CertificateProviderInstanceResponse;
import com.pulumi.googlenative.networksecurity.v1.outputs.GoogleCloudNetworksecurityV1GrpcEndpointResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudNetworksecurityV1CertificateProviderResponse {
    /**
     * @return The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
     * 
     */
    private final CertificateProviderInstanceResponse certificateProviderInstance;
    /**
     * @return gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     * 
     */
    private final GoogleCloudNetworksecurityV1GrpcEndpointResponse grpcEndpoint;

    @CustomType.Constructor
    private GoogleCloudNetworksecurityV1CertificateProviderResponse(
        @CustomType.Parameter("certificateProviderInstance") CertificateProviderInstanceResponse certificateProviderInstance,
        @CustomType.Parameter("grpcEndpoint") GoogleCloudNetworksecurityV1GrpcEndpointResponse grpcEndpoint) {
        this.certificateProviderInstance = certificateProviderInstance;
        this.grpcEndpoint = grpcEndpoint;
    }

    /**
     * @return The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
     * 
     */
    public CertificateProviderInstanceResponse certificateProviderInstance() {
        return this.certificateProviderInstance;
    }
    /**
     * @return gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     * 
     */
    public GoogleCloudNetworksecurityV1GrpcEndpointResponse grpcEndpoint() {
        return this.grpcEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudNetworksecurityV1CertificateProviderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateProviderInstanceResponse certificateProviderInstance;
        private GoogleCloudNetworksecurityV1GrpcEndpointResponse grpcEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudNetworksecurityV1CertificateProviderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateProviderInstance = defaults.certificateProviderInstance;
    	      this.grpcEndpoint = defaults.grpcEndpoint;
        }

        public Builder certificateProviderInstance(CertificateProviderInstanceResponse certificateProviderInstance) {
            this.certificateProviderInstance = Objects.requireNonNull(certificateProviderInstance);
            return this;
        }
        public Builder grpcEndpoint(GoogleCloudNetworksecurityV1GrpcEndpointResponse grpcEndpoint) {
            this.grpcEndpoint = Objects.requireNonNull(grpcEndpoint);
            return this;
        }        public GoogleCloudNetworksecurityV1CertificateProviderResponse build() {
            return new GoogleCloudNetworksecurityV1CertificateProviderResponse(certificateProviderInstance, grpcEndpoint);
        }
    }
}
