// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterIdentityResponseUserAssignedIdentities extends io.pulumi.resources.InvokeArgs {

    public static final ClusterIdentityResponseUserAssignedIdentities Empty = new ClusterIdentityResponseUserAssignedIdentities();

    /**
     * The client id of user assigned identity.
     * 
     */
    @InputImport(name="clientId", required=true)
      private final String clientId;

    public String getClientId() {
        return this.clientId;
    }

    /**
     * The principal id of user assigned identity.
     * 
     */
    @InputImport(name="principalId", required=true)
      private final String principalId;

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * The tenant id of user assigned identity.
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable String tenantId;

    public Optional<String> getTenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    public ClusterIdentityResponseUserAssignedIdentities(
        String clientId,
        String principalId,
        @Nullable String tenantId) {
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.tenantId = tenantId;
    }

    private ClusterIdentityResponseUserAssignedIdentities() {
        this.clientId = null;
        this.principalId = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIdentityResponseUserAssignedIdentities defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String principalId;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIdentityResponseUserAssignedIdentities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public ClusterIdentityResponseUserAssignedIdentities build() {
            return new ClusterIdentityResponseUserAssignedIdentities(clientId, principalId, tenantId);
        }
    }
}
