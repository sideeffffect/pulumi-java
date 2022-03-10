// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about a service principal identity for the cluster to use for manipulating Azure APIs.
 * 
 */
public final class ManagedClusterServicePrincipalProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedClusterServicePrincipalProfileResponse Empty = new ManagedClusterServicePrincipalProfileResponse();

    /**
     * The ID for the service principal.
     * 
     */
    @InputImport(name="clientId", required=true)
      private final String clientId;

    public String getClientId() {
        return this.clientId;
    }

    /**
     * The secret password associated with the service principal in plain text.
     * 
     */
    @InputImport(name="secret")
      private final @Nullable String secret;

    public Optional<String> getSecret() {
        return this.secret == null ? Optional.empty() : Optional.ofNullable(this.secret);
    }

    public ManagedClusterServicePrincipalProfileResponse(
        String clientId,
        @Nullable String secret) {
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.secret = secret;
    }

    private ManagedClusterServicePrincipalProfileResponse() {
        this.clientId = null;
        this.secret = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterServicePrincipalProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private @Nullable String secret;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterServicePrincipalProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.secret = defaults.secret;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder secret(@Nullable String secret) {
            this.secret = secret;
            return this;
        }
        public ManagedClusterServicePrincipalProfileResponse build() {
            return new ManagedClusterServicePrincipalProfileResponse(clientId, secret);
        }
    }
}
