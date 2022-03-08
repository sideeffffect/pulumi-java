// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UserAssignedResourceIdentityResponse {
    /**
     * The principal id of user assigned identity.
     * 
     */
    private final String principalId;
    /**
     * The tenant id of user assigned identity.
     * 
     */
    private final String tenantId;

    @OutputCustomType.Constructor({"principalId","tenantId"})
    private UserAssignedResourceIdentityResponse(
        String principalId,
        String tenantId) {
        this.principalId = principalId;
        this.tenantId = tenantId;
    }

    /**
     * The principal id of user assigned identity.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The tenant id of user assigned identity.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedResourceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedResourceIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public UserAssignedResourceIdentityResponse build() {
            return new UserAssignedResourceIdentityResponse(principalId, tenantId);
        }
    }
}
