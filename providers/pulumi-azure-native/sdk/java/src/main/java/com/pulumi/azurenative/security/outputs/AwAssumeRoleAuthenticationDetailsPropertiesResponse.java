// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AwAssumeRoleAuthenticationDetailsPropertiesResponse {
    /**
     * The ID of the cloud account
     * 
     */
    private final String accountId;
    /**
     * State of the multi-cloud connector
     * 
     */
    private final String authenticationProvisioningState;
    /**
     * Connect to your cloud account, for AWS use either account credentials or role-based authentication. For GCP use account organization credentials.
     * Expected value is 'awsAssumeRole'.
     * 
     */
    private final String authenticationType;
    /**
     * Assumed role ID is an identifier that you can use to create temporary security credentials.
     * 
     */
    private final String awsAssumeRoleArn;
    /**
     * A unique identifier that is required when you assume a role in another account.
     * 
     */
    private final String awsExternalId;
    /**
     * The permissions detected in the cloud account.
     * 
     */
    private final List<String> grantedPermissions;

    @CustomType.Constructor
    private AwAssumeRoleAuthenticationDetailsPropertiesResponse(
        @CustomType.Parameter("accountId") String accountId,
        @CustomType.Parameter("authenticationProvisioningState") String authenticationProvisioningState,
        @CustomType.Parameter("authenticationType") String authenticationType,
        @CustomType.Parameter("awsAssumeRoleArn") String awsAssumeRoleArn,
        @CustomType.Parameter("awsExternalId") String awsExternalId,
        @CustomType.Parameter("grantedPermissions") List<String> grantedPermissions) {
        this.accountId = accountId;
        this.authenticationProvisioningState = authenticationProvisioningState;
        this.authenticationType = authenticationType;
        this.awsAssumeRoleArn = awsAssumeRoleArn;
        this.awsExternalId = awsExternalId;
        this.grantedPermissions = grantedPermissions;
    }

    /**
     * The ID of the cloud account
     * 
    */
    public String accountId() {
        return this.accountId;
    }
    /**
     * State of the multi-cloud connector
     * 
    */
    public String authenticationProvisioningState() {
        return this.authenticationProvisioningState;
    }
    /**
     * Connect to your cloud account, for AWS use either account credentials or role-based authentication. For GCP use account organization credentials.
     * Expected value is 'awsAssumeRole'.
     * 
    */
    public String authenticationType() {
        return this.authenticationType;
    }
    /**
     * Assumed role ID is an identifier that you can use to create temporary security credentials.
     * 
    */
    public String awsAssumeRoleArn() {
        return this.awsAssumeRoleArn;
    }
    /**
     * A unique identifier that is required when you assume a role in another account.
     * 
    */
    public String awsExternalId() {
        return this.awsExternalId;
    }
    /**
     * The permissions detected in the cloud account.
     * 
    */
    public List<String> grantedPermissions() {
        return this.grantedPermissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwAssumeRoleAuthenticationDetailsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private String authenticationProvisioningState;
        private String authenticationType;
        private String awsAssumeRoleArn;
        private String awsExternalId;
        private List<String> grantedPermissions;

        public Builder() {
    	      // Empty
        }

        public Builder(AwAssumeRoleAuthenticationDetailsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.authenticationProvisioningState = defaults.authenticationProvisioningState;
    	      this.authenticationType = defaults.authenticationType;
    	      this.awsAssumeRoleArn = defaults.awsAssumeRoleArn;
    	      this.awsExternalId = defaults.awsExternalId;
    	      this.grantedPermissions = defaults.grantedPermissions;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder authenticationProvisioningState(String authenticationProvisioningState) {
            this.authenticationProvisioningState = Objects.requireNonNull(authenticationProvisioningState);
            return this;
        }
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        public Builder awsAssumeRoleArn(String awsAssumeRoleArn) {
            this.awsAssumeRoleArn = Objects.requireNonNull(awsAssumeRoleArn);
            return this;
        }
        public Builder awsExternalId(String awsExternalId) {
            this.awsExternalId = Objects.requireNonNull(awsExternalId);
            return this;
        }
        public Builder grantedPermissions(List<String> grantedPermissions) {
            this.grantedPermissions = Objects.requireNonNull(grantedPermissions);
            return this;
        }
        public Builder grantedPermissions(String... grantedPermissions) {
            return grantedPermissions(List.of(grantedPermissions));
        }        public AwAssumeRoleAuthenticationDetailsPropertiesResponse build() {
            return new AwAssumeRoleAuthenticationDetailsPropertiesResponse(accountId, authenticationProvisioningState, authenticationType, awsAssumeRoleArn, awsExternalId, grantedPermissions);
        }
    }
}
