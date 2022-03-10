// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainCognitoOptions {
    /**
     * Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * ID of the Cognito Identity Pool to use.
     * 
     */
    private final String identityPoolId;
    /**
     * ARN of the IAM role that has the AmazonESCognitoAccess policy attached.
     * 
     */
    private final String roleArn;
    /**
     * ID of the Cognito User Pool to use.
     * 
     */
    private final String userPoolId;

    @OutputCustomType.Constructor
    private DomainCognitoOptions(
        @OutputCustomType.Parameter("enabled") @Nullable Boolean enabled,
        @OutputCustomType.Parameter("identityPoolId") String identityPoolId,
        @OutputCustomType.Parameter("roleArn") String roleArn,
        @OutputCustomType.Parameter("userPoolId") String userPoolId) {
        this.enabled = enabled;
        this.identityPoolId = identityPoolId;
        this.roleArn = roleArn;
        this.userPoolId = userPoolId;
    }

    /**
     * Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * ID of the Cognito Identity Pool to use.
     * 
    */
    public String getIdentityPoolId() {
        return this.identityPoolId;
    }
    /**
     * ARN of the IAM role that has the AmazonESCognitoAccess policy attached.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * ID of the Cognito User Pool to use.
     * 
    */
    public String getUserPoolId() {
        return this.userPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainCognitoOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private String identityPoolId;
        private String roleArn;
        private String userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainCognitoOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.identityPoolId = defaults.identityPoolId;
    	      this.roleArn = defaults.roleArn;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder identityPoolId(String identityPoolId) {
            this.identityPoolId = Objects.requireNonNull(identityPoolId);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder userPoolId(String userPoolId) {
            this.userPoolId = Objects.requireNonNull(userPoolId);
            return this;
        }
        public DomainCognitoOptions build() {
            return new DomainCognitoOptions(enabled, identityPoolId, roleArn, userPoolId);
        }
    }
}
