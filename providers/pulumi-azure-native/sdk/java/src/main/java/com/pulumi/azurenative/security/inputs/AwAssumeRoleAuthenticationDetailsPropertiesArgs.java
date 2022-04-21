// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * AWS cloud account connector based assume role, the role enables delegating access to your AWS resources. The role is composed of role Amazon Resource Name (ARN) and external ID. For more details, refer to &lt;a href=&#34;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user.html&#34;&gt;Creating a Role to Delegate Permissions to an IAM User (write only)&lt;/a&gt;
 * 
 */
public final class AwAssumeRoleAuthenticationDetailsPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwAssumeRoleAuthenticationDetailsPropertiesArgs Empty = new AwAssumeRoleAuthenticationDetailsPropertiesArgs();

    /**
     * Connect to your cloud account, for AWS use either account credentials or role-based authentication. For GCP use account organization credentials.
     * Expected value is &#39;awsAssumeRole&#39;.
     * 
     */
    @Import(name="authenticationType", required=true)
    private Output<String> authenticationType;

    public Output<String> authenticationType() {
        return this.authenticationType;
    }

    /**
     * Assumed role ID is an identifier that you can use to create temporary security credentials.
     * 
     */
    @Import(name="awsAssumeRoleArn", required=true)
    private Output<String> awsAssumeRoleArn;

    public Output<String> awsAssumeRoleArn() {
        return this.awsAssumeRoleArn;
    }

    /**
     * A unique identifier that is required when you assume a role in another account.
     * 
     */
    @Import(name="awsExternalId", required=true)
    private Output<String> awsExternalId;

    public Output<String> awsExternalId() {
        return this.awsExternalId;
    }

    private AwAssumeRoleAuthenticationDetailsPropertiesArgs() {}

    private AwAssumeRoleAuthenticationDetailsPropertiesArgs(AwAssumeRoleAuthenticationDetailsPropertiesArgs $) {
        this.authenticationType = $.authenticationType;
        this.awsAssumeRoleArn = $.awsAssumeRoleArn;
        this.awsExternalId = $.awsExternalId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwAssumeRoleAuthenticationDetailsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwAssumeRoleAuthenticationDetailsPropertiesArgs $;

        public Builder() {
            $ = new AwAssumeRoleAuthenticationDetailsPropertiesArgs();
        }

        public Builder(AwAssumeRoleAuthenticationDetailsPropertiesArgs defaults) {
            $ = new AwAssumeRoleAuthenticationDetailsPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder authenticationType(Output<String> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder authenticationType(String authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        public Builder awsAssumeRoleArn(Output<String> awsAssumeRoleArn) {
            $.awsAssumeRoleArn = awsAssumeRoleArn;
            return this;
        }

        public Builder awsAssumeRoleArn(String awsAssumeRoleArn) {
            return awsAssumeRoleArn(Output.of(awsAssumeRoleArn));
        }

        public Builder awsExternalId(Output<String> awsExternalId) {
            $.awsExternalId = awsExternalId;
            return this;
        }

        public Builder awsExternalId(String awsExternalId) {
            return awsExternalId(Output.of(awsExternalId));
        }

        public AwAssumeRoleAuthenticationDetailsPropertiesArgs build() {
            $.authenticationType = Codegen.stringProp("authenticationType").output().arg($.authenticationType).require();
            $.awsAssumeRoleArn = Objects.requireNonNull($.awsAssumeRoleArn, "expected parameter 'awsAssumeRoleArn' to be non-null");
            $.awsExternalId = Objects.requireNonNull($.awsExternalId, "expected parameter 'awsExternalId' to be non-null");
            return $;
        }
    }

}
