// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.container.v1beta1.outputs.ClientCertificateConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MasterAuthResponse {
    /**
     * @return [Output only] Base64-encoded public certificate used by clients to authenticate to the cluster endpoint.
     * 
     */
    private final String clientCertificate;
    /**
     * @return Configuration for client certificate authentication on the cluster. For clusters before v1.12, if no configuration is specified, a client certificate is issued.
     * 
     */
    private final ClientCertificateConfigResponse clientCertificateConfig;
    /**
     * @return [Output only] Base64-encoded private key used by clients to authenticate to the cluster endpoint.
     * 
     */
    private final String clientKey;
    private final String clusterCaCertificate;
    /**
     * @return The password to use for HTTP basic authentication to the master endpoint. Because the master endpoint is open to the Internet, you should create a strong password. If a password is provided for cluster creation, username must be non-empty. Warning: basic authentication is deprecated, and will be removed in GKE control plane versions 1.19 and newer. For a list of recommended authentication methods, see: https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication
     * 
     */
    private final String password;
    /**
     * @return The username to use for HTTP basic authentication to the master endpoint. For clusters v1.6.0 and later, basic authentication can be disabled by leaving username unspecified (or setting it to the empty string). Warning: basic authentication is deprecated, and will be removed in GKE control plane versions 1.19 and newer. For a list of recommended authentication methods, see: https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication
     * 
     */
    private final String username;

    @CustomType.Constructor
    private MasterAuthResponse(
        @CustomType.Parameter("clientCertificate") String clientCertificate,
        @CustomType.Parameter("clientCertificateConfig") ClientCertificateConfigResponse clientCertificateConfig,
        @CustomType.Parameter("clientKey") String clientKey,
        @CustomType.Parameter("clusterCaCertificate") String clusterCaCertificate,
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("username") String username) {
        this.clientCertificate = clientCertificate;
        this.clientCertificateConfig = clientCertificateConfig;
        this.clientKey = clientKey;
        this.clusterCaCertificate = clusterCaCertificate;
        this.password = password;
        this.username = username;
    }

    /**
     * @return [Output only] Base64-encoded public certificate used by clients to authenticate to the cluster endpoint.
     * 
     */
    public String clientCertificate() {
        return this.clientCertificate;
    }
    /**
     * @return Configuration for client certificate authentication on the cluster. For clusters before v1.12, if no configuration is specified, a client certificate is issued.
     * 
     */
    public ClientCertificateConfigResponse clientCertificateConfig() {
        return this.clientCertificateConfig;
    }
    /**
     * @return [Output only] Base64-encoded private key used by clients to authenticate to the cluster endpoint.
     * 
     */
    public String clientKey() {
        return this.clientKey;
    }
    public String clusterCaCertificate() {
        return this.clusterCaCertificate;
    }
    /**
     * @return The password to use for HTTP basic authentication to the master endpoint. Because the master endpoint is open to the Internet, you should create a strong password. If a password is provided for cluster creation, username must be non-empty. Warning: basic authentication is deprecated, and will be removed in GKE control plane versions 1.19 and newer. For a list of recommended authentication methods, see: https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The username to use for HTTP basic authentication to the master endpoint. For clusters v1.6.0 and later, basic authentication can be disabled by leaving username unspecified (or setting it to the empty string). Warning: basic authentication is deprecated, and will be removed in GKE control plane versions 1.19 and newer. For a list of recommended authentication methods, see: https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MasterAuthResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientCertificate;
        private ClientCertificateConfigResponse clientCertificateConfig;
        private String clientKey;
        private String clusterCaCertificate;
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(MasterAuthResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientCertificateConfig = defaults.clientCertificateConfig;
    	      this.clientKey = defaults.clientKey;
    	      this.clusterCaCertificate = defaults.clusterCaCertificate;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder clientCertificate(String clientCertificate) {
            this.clientCertificate = Objects.requireNonNull(clientCertificate);
            return this;
        }
        public Builder clientCertificateConfig(ClientCertificateConfigResponse clientCertificateConfig) {
            this.clientCertificateConfig = Objects.requireNonNull(clientCertificateConfig);
            return this;
        }
        public Builder clientKey(String clientKey) {
            this.clientKey = Objects.requireNonNull(clientKey);
            return this;
        }
        public Builder clusterCaCertificate(String clusterCaCertificate) {
            this.clusterCaCertificate = Objects.requireNonNull(clusterCaCertificate);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public MasterAuthResponse build() {
            return new MasterAuthResponse(clientCertificate, clientCertificateConfig, clientKey, clusterCaCertificate, password, username);
        }
    }
}
