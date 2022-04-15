// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCredentialsResult {
    private final String authorizationToken;
    private final String expiresAt;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String proxyEndpoint;
    private final String registryId;

    @CustomType.Constructor
    private GetCredentialsResult(
        @CustomType.Parameter("authorizationToken") String authorizationToken,
        @CustomType.Parameter("expiresAt") String expiresAt,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("proxyEndpoint") String proxyEndpoint,
        @CustomType.Parameter("registryId") String registryId) {
        this.authorizationToken = authorizationToken;
        this.expiresAt = expiresAt;
        this.id = id;
        this.proxyEndpoint = proxyEndpoint;
        this.registryId = registryId;
    }

    public String authorizationToken() {
        return this.authorizationToken;
    }
    public String expiresAt() {
        return this.expiresAt;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public String proxyEndpoint() {
        return this.proxyEndpoint;
    }
    public String registryId() {
        return this.registryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCredentialsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationToken;
        private String expiresAt;
        private String id;
        private String proxyEndpoint;
        private String registryId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCredentialsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationToken = defaults.authorizationToken;
    	      this.expiresAt = defaults.expiresAt;
    	      this.id = defaults.id;
    	      this.proxyEndpoint = defaults.proxyEndpoint;
    	      this.registryId = defaults.registryId;
        }

        public Builder authorizationToken(String authorizationToken) {
            this.authorizationToken = Objects.requireNonNull(authorizationToken);
            return this;
        }
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = Objects.requireNonNull(expiresAt);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder proxyEndpoint(String proxyEndpoint) {
            this.proxyEndpoint = Objects.requireNonNull(proxyEndpoint);
            return this;
        }
        public Builder registryId(String registryId) {
            this.registryId = Objects.requireNonNull(registryId);
            return this;
        }        public GetCredentialsResult build() {
            return new GetCredentialsResult(authorizationToken, expiresAt, id, proxyEndpoint, registryId);
        }
    }
}
