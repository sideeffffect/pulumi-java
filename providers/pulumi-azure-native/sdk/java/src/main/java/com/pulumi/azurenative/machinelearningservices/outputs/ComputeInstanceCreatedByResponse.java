// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ComputeInstanceCreatedByResponse {
    /**
     * @return Uniquely identifies the user within his/her organization.
     * 
     */
    private final String userId;
    /**
     * @return Name of the user.
     * 
     */
    private final String userName;
    /**
     * @return Uniquely identifies user&#39; Azure Active Directory organization.
     * 
     */
    private final String userOrgId;

    @CustomType.Constructor
    private ComputeInstanceCreatedByResponse(
        @CustomType.Parameter("userId") String userId,
        @CustomType.Parameter("userName") String userName,
        @CustomType.Parameter("userOrgId") String userOrgId) {
        this.userId = userId;
        this.userName = userName;
        this.userOrgId = userOrgId;
    }

    /**
     * @return Uniquely identifies the user within his/her organization.
     * 
     */
    public String userId() {
        return this.userId;
    }
    /**
     * @return Name of the user.
     * 
     */
    public String userName() {
        return this.userName;
    }
    /**
     * @return Uniquely identifies user&#39; Azure Active Directory organization.
     * 
     */
    public String userOrgId() {
        return this.userOrgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstanceCreatedByResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String userId;
        private String userName;
        private String userOrgId;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeInstanceCreatedByResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userId = defaults.userId;
    	      this.userName = defaults.userName;
    	      this.userOrgId = defaults.userOrgId;
        }

        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public Builder userOrgId(String userOrgId) {
            this.userOrgId = Objects.requireNonNull(userOrgId);
            return this;
        }        public ComputeInstanceCreatedByResponse build() {
            return new ComputeInstanceCreatedByResponse(userId, userName, userOrgId);
        }
    }
}
