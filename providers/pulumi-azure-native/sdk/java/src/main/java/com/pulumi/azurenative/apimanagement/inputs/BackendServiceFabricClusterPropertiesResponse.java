// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.azurenative.apimanagement.inputs.X509CertificateNameResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the Service Fabric Type Backend.
 * 
 */
public final class BackendServiceFabricClusterPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final BackendServiceFabricClusterPropertiesResponse Empty = new BackendServiceFabricClusterPropertiesResponse();

    /**
     * The client certificate id for the management endpoint.
     * 
     */
    @Import(name="clientCertificateId")
    private @Nullable String clientCertificateId;

    public Optional<String> clientCertificateId() {
        return Optional.ofNullable(this.clientCertificateId);
    }

    /**
     * The client certificate thumbprint for the management endpoint. Will be ignored if certificatesIds are provided
     * 
     */
    @Import(name="clientCertificatethumbprint")
    private @Nullable String clientCertificatethumbprint;

    public Optional<String> clientCertificatethumbprint() {
        return Optional.ofNullable(this.clientCertificatethumbprint);
    }

    /**
     * The cluster management endpoint.
     * 
     */
    @Import(name="managementEndpoints", required=true)
    private List<String> managementEndpoints;

    public List<String> managementEndpoints() {
        return this.managementEndpoints;
    }

    /**
     * Maximum number of retries while attempting resolve the partition.
     * 
     */
    @Import(name="maxPartitionResolutionRetries")
    private @Nullable Integer maxPartitionResolutionRetries;

    public Optional<Integer> maxPartitionResolutionRetries() {
        return Optional.ofNullable(this.maxPartitionResolutionRetries);
    }

    /**
     * Thumbprints of certificates cluster management service uses for tls communication
     * 
     */
    @Import(name="serverCertificateThumbprints")
    private @Nullable List<String> serverCertificateThumbprints;

    public Optional<List<String>> serverCertificateThumbprints() {
        return Optional.ofNullable(this.serverCertificateThumbprints);
    }

    /**
     * Server X509 Certificate Names Collection
     * 
     */
    @Import(name="serverX509Names")
    private @Nullable List<X509CertificateNameResponse> serverX509Names;

    public Optional<List<X509CertificateNameResponse>> serverX509Names() {
        return Optional.ofNullable(this.serverX509Names);
    }

    private BackendServiceFabricClusterPropertiesResponse() {}

    private BackendServiceFabricClusterPropertiesResponse(BackendServiceFabricClusterPropertiesResponse $) {
        this.clientCertificateId = $.clientCertificateId;
        this.clientCertificatethumbprint = $.clientCertificatethumbprint;
        this.managementEndpoints = $.managementEndpoints;
        this.maxPartitionResolutionRetries = $.maxPartitionResolutionRetries;
        this.serverCertificateThumbprints = $.serverCertificateThumbprints;
        this.serverX509Names = $.serverX509Names;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceFabricClusterPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceFabricClusterPropertiesResponse $;

        public Builder() {
            $ = new BackendServiceFabricClusterPropertiesResponse();
        }

        public Builder(BackendServiceFabricClusterPropertiesResponse defaults) {
            $ = new BackendServiceFabricClusterPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder clientCertificateId(@Nullable String clientCertificateId) {
            $.clientCertificateId = clientCertificateId;
            return this;
        }

        public Builder clientCertificatethumbprint(@Nullable String clientCertificatethumbprint) {
            $.clientCertificatethumbprint = clientCertificatethumbprint;
            return this;
        }

        public Builder managementEndpoints(List<String> managementEndpoints) {
            $.managementEndpoints = managementEndpoints;
            return this;
        }

        public Builder managementEndpoints(String... managementEndpoints) {
            return managementEndpoints(List.of(managementEndpoints));
        }

        public Builder maxPartitionResolutionRetries(@Nullable Integer maxPartitionResolutionRetries) {
            $.maxPartitionResolutionRetries = maxPartitionResolutionRetries;
            return this;
        }

        public Builder serverCertificateThumbprints(@Nullable List<String> serverCertificateThumbprints) {
            $.serverCertificateThumbprints = serverCertificateThumbprints;
            return this;
        }

        public Builder serverCertificateThumbprints(String... serverCertificateThumbprints) {
            return serverCertificateThumbprints(List.of(serverCertificateThumbprints));
        }

        public Builder serverX509Names(@Nullable List<X509CertificateNameResponse> serverX509Names) {
            $.serverX509Names = serverX509Names;
            return this;
        }

        public Builder serverX509Names(X509CertificateNameResponse... serverX509Names) {
            return serverX509Names(List.of(serverX509Names));
        }

        public BackendServiceFabricClusterPropertiesResponse build() {
            $.managementEndpoints = Objects.requireNonNull($.managementEndpoints, "expected parameter 'managementEndpoints' to be non-null");
            return $;
        }
    }

}
