// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UserIdentityResponse {
    /**
     * The Azure Active Directory client id.
     * 
     */
    private final String clientId;
    /**
     * The Azure Active Directory principal id.
     * 
     */
    private final String principalId;

    @OutputCustomType.Constructor
    private UserIdentityResponse(
        @OutputCustomType.Parameter("clientId") String clientId,
        @OutputCustomType.Parameter("principalId") String principalId) {
        this.clientId = clientId;
        this.principalId = principalId;
    }

    /**
     * The Azure Active Directory client id.
     * 
    */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * The Azure Active Directory principal id.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserIdentityResponse defaults) {
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
        }
        public UserIdentityResponse build() {
            return new UserIdentityResponse(clientId, principalId);
        }
    }
}
