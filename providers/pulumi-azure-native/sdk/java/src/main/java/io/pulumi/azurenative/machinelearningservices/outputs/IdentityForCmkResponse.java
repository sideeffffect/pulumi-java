// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IdentityForCmkResponse {
    /**
     * The ArmId of the user assigned identity that will be used to access the customer managed key vault
     * 
     */
    private final String userAssignedIdentity;

    @OutputCustomType.Constructor
    private IdentityForCmkResponse(@OutputCustomType.Parameter("userAssignedIdentity") String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
    }

    /**
     * The ArmId of the user assigned identity that will be used to access the customer managed key vault
     * 
    */
    public String getUserAssignedIdentity() {
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
        }
        public IdentityForCmkResponse build() {
            return new IdentityForCmkResponse(userAssignedIdentity);
        }
    }
}
