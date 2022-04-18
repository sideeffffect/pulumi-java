// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudbuild_v1.outputs.BitbucketServerRepositoryIdResponse;
import com.pulumi.googlenative.cloudbuild_v1.outputs.BitbucketServerSecretsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BitbucketServerConfigResponse {
    /**
     * Immutable. API Key that will be attached to webhook. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig.
     * 
     */
    private final String apiKey;
    /**
     * Connected Bitbucket Server repositories for this config.
     * 
     */
    private final List<BitbucketServerRepositoryIdResponse> connectedRepositories;
    /**
     * Time when the config was created.
     * 
     */
    private final String createTime;
    /**
     * Immutable. The URI of the Bitbucket Server host. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig.
     * 
     */
    private final String hostUri;
    /**
     * The resource name for the config.
     * 
     */
    private final String name;
    /**
     * Optional. The network to be used when reaching out to the Bitbucket Server instance. The VPC network must be enabled for private service connection. This should be set if the Bitbucket Server instance is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the Bitbucket Server instance will be made over the public internet. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number or id and {network} is the name of a VPC network in the project.
     * 
     */
    private final String peeredNetwork;
    /**
     * Secret Manager secrets needed by the config.
     * 
     */
    private final BitbucketServerSecretsResponse secrets;
    /**
     * Optional. SSL certificate to use for requests to Bitbucket Server. The format should be PEM format but the extension can be one of .pem, .cer, or .crt.
     * 
     */
    private final String sslCa;
    /**
     * Username of the account Cloud Build will use on Bitbucket Server.
     * 
     */
    private final String username;
    /**
     * UUID included in webhook requests. The UUID is used to look up the corresponding config.
     * 
     */
    private final String webhookKey;

    @CustomType.Constructor
    private BitbucketServerConfigResponse(
        @CustomType.Parameter("apiKey") String apiKey,
        @CustomType.Parameter("connectedRepositories") List<BitbucketServerRepositoryIdResponse> connectedRepositories,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("hostUri") String hostUri,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("peeredNetwork") String peeredNetwork,
        @CustomType.Parameter("secrets") BitbucketServerSecretsResponse secrets,
        @CustomType.Parameter("sslCa") String sslCa,
        @CustomType.Parameter("username") String username,
        @CustomType.Parameter("webhookKey") String webhookKey) {
        this.apiKey = apiKey;
        this.connectedRepositories = connectedRepositories;
        this.createTime = createTime;
        this.hostUri = hostUri;
        this.name = name;
        this.peeredNetwork = peeredNetwork;
        this.secrets = secrets;
        this.sslCa = sslCa;
        this.username = username;
        this.webhookKey = webhookKey;
    }

    /**
     * Immutable. API Key that will be attached to webhook. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig.
     * 
    */
    public String apiKey() {
        return this.apiKey;
    }
    /**
     * Connected Bitbucket Server repositories for this config.
     * 
    */
    public List<BitbucketServerRepositoryIdResponse> connectedRepositories() {
        return this.connectedRepositories;
    }
    /**
     * Time when the config was created.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * Immutable. The URI of the Bitbucket Server host. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig.
     * 
    */
    public String hostUri() {
        return this.hostUri;
    }
    /**
     * The resource name for the config.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Optional. The network to be used when reaching out to the Bitbucket Server instance. The VPC network must be enabled for private service connection. This should be set if the Bitbucket Server instance is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the Bitbucket Server instance will be made over the public internet. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number or id and {network} is the name of a VPC network in the project.
     * 
    */
    public String peeredNetwork() {
        return this.peeredNetwork;
    }
    /**
     * Secret Manager secrets needed by the config.
     * 
    */
    public BitbucketServerSecretsResponse secrets() {
        return this.secrets;
    }
    /**
     * Optional. SSL certificate to use for requests to Bitbucket Server. The format should be PEM format but the extension can be one of .pem, .cer, or .crt.
     * 
    */
    public String sslCa() {
        return this.sslCa;
    }
    /**
     * Username of the account Cloud Build will use on Bitbucket Server.
     * 
    */
    public String username() {
        return this.username;
    }
    /**
     * UUID included in webhook requests. The UUID is used to look up the corresponding config.
     * 
    */
    public String webhookKey() {
        return this.webhookKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BitbucketServerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiKey;
        private List<BitbucketServerRepositoryIdResponse> connectedRepositories;
        private String createTime;
        private String hostUri;
        private String name;
        private String peeredNetwork;
        private BitbucketServerSecretsResponse secrets;
        private String sslCa;
        private String username;
        private String webhookKey;

        public Builder() {
    	      // Empty
        }

        public Builder(BitbucketServerConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.connectedRepositories = defaults.connectedRepositories;
    	      this.createTime = defaults.createTime;
    	      this.hostUri = defaults.hostUri;
    	      this.name = defaults.name;
    	      this.peeredNetwork = defaults.peeredNetwork;
    	      this.secrets = defaults.secrets;
    	      this.sslCa = defaults.sslCa;
    	      this.username = defaults.username;
    	      this.webhookKey = defaults.webhookKey;
        }

        public Builder apiKey(String apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }
        public Builder connectedRepositories(List<BitbucketServerRepositoryIdResponse> connectedRepositories) {
            this.connectedRepositories = Objects.requireNonNull(connectedRepositories);
            return this;
        }
        public Builder connectedRepositories(BitbucketServerRepositoryIdResponse... connectedRepositories) {
            return connectedRepositories(List.of(connectedRepositories));
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder hostUri(String hostUri) {
            this.hostUri = Objects.requireNonNull(hostUri);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder peeredNetwork(String peeredNetwork) {
            this.peeredNetwork = Objects.requireNonNull(peeredNetwork);
            return this;
        }
        public Builder secrets(BitbucketServerSecretsResponse secrets) {
            this.secrets = Objects.requireNonNull(secrets);
            return this;
        }
        public Builder sslCa(String sslCa) {
            this.sslCa = Objects.requireNonNull(sslCa);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public Builder webhookKey(String webhookKey) {
            this.webhookKey = Objects.requireNonNull(webhookKey);
            return this;
        }        public BitbucketServerConfigResponse build() {
            return new BitbucketServerConfigResponse(apiKey, connectedRepositories, createTime, hostUri, name, peeredNetwork, secrets, sslCa, username, webhookKey);
        }
    }
}
