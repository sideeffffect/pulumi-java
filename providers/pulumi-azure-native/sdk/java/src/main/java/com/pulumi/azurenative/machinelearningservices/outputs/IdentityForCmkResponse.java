// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IdentityForCmkResponse {
    /**
     * The ArmId of the user assigned identity that will be used to access the customer managed key vault
     * 
     */
    private final String userAssignedIdentity;

    @CustomType.Constructor
    private IdentityForCmkResponse(@CustomType.Parameter("userAssignedIdentity") String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
    }

    /**
     * The ArmId of the user assigned identity that will be used to access the customer managed key vault
     * 
    */
    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityForCmkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityForCmkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder userAssignedIdentity(String userAssignedIdentity) {
            this.userAssignedIdentity = Objects.requireNonNull(userAssignedIdentity);
            return this;
        }        public IdentityForCmkResponse build() {
            return new IdentityForCmkResponse(userAssignedIdentity);
        }
    }
}
