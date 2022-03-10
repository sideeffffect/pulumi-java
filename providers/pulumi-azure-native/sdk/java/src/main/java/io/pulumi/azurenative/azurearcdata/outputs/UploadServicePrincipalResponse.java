// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UploadServicePrincipalResponse {
    /**
     * Authority for the service principal. Example: https://login.microsoftonline.com/
     * 
     */
    private final @Nullable String authority;
    /**
     * Client ID of the service principal for uploading data.
     * 
     */
    private final @Nullable String clientId;
    /**
     * Tenant ID of the service principal.
     * 
     */
    private final @Nullable String tenantId;

    @OutputCustomType.Constructor
    private UploadServicePrincipalResponse(
        @OutputCustomType.Parameter("authority") @Nullable String authority,
        @OutputCustomType.Parameter("clientId") @Nullable String clientId,
        @OutputCustomType.Parameter("tenantId") @Nullable String tenantId) {
        this.authority = authority;
        this.clientId = clientId;
        this.tenantId = tenantId;
    }

    /**
     * Authority for the service principal. Example: https://login.microsoftonline.com/
     * 
    */
    public Optional<String> getAuthority() {
        return Optional.ofNullable(this.authority);
    }
    /**
     * Client ID of the service principal for uploading data.
     * 
    */
    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * Tenant ID of the service principal.
     * 
    */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UploadServicePrincipalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authority;
        private @Nullable String clientId;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(UploadServicePrincipalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authority = defaults.authority;
    	      this.clientId = defaults.clientId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder authority(@Nullable String authority) {
            this.authority = authority;
            return this;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public UploadServicePrincipalResponse build() {
            return new UploadServicePrincipalResponse(authority, clientId, tenantId);
        }
    }
}
