// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ManagedServiceIdentityResponseUserAssignedIdentities extends com.pulumi.resources.InvokeArgs {

    public static final ManagedServiceIdentityResponseUserAssignedIdentities Empty = new ManagedServiceIdentityResponseUserAssignedIdentities();

    /**
     * Client Id of user assigned identity
     * 
     */
    @Import(name="clientId", required=true)
      private final String clientId;

    public String clientId() {
        return this.clientId;
    }

    /**
     * Principal Id of user assigned identity
     * 
     */
    @Import(name="principalId", required=true)
      private final String principalId;

    public String principalId() {
        return this.principalId;
    }

    public ManagedServiceIdentityResponseUserAssignedIdentities(
        String clientId,
        String principalId) {
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
    }

    private ManagedServiceIdentityResponseUserAssignedIdentities() {
        this.clientId = null;
        this.principalId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedServiceIdentityResponseUserAssignedIdentities defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedServiceIdentityResponseUserAssignedIdentities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }        public ManagedServiceIdentityResponseUserAssignedIdentities build() {
            return new ManagedServiceIdentityResponseUserAssignedIdentities(clientId, principalId);
        }
    }
}
