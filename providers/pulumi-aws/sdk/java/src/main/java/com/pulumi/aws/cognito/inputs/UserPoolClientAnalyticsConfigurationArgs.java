// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserPoolClientAnalyticsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserPoolClientAnalyticsConfigurationArgs Empty = new UserPoolClientAnalyticsConfigurationArgs();

    /**
     * Application ARN for an Amazon Pinpoint application. Conflicts with `external_id` and `role_arn`.
     * 
     */
    @Import(name="applicationArn")
    private @Nullable Output<String> applicationArn;

    public Optional<Output<String>> applicationArn() {
        return Optional.ofNullable(this.applicationArn);
    }

    /**
     * Application ID for an Amazon Pinpoint application.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * ID for the Analytics Configuration. Conflicts with `application_arn`.
     * 
     */
    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    /**
     * ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics. Conflicts with `application_arn`.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * If set to `true`, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
     * 
     */
    @Import(name="userDataShared")
    private @Nullable Output<Boolean> userDataShared;

    public Optional<Output<Boolean>> userDataShared() {
        return Optional.ofNullable(this.userDataShared);
    }

    private UserPoolClientAnalyticsConfigurationArgs() {}

    private UserPoolClientAnalyticsConfigurationArgs(UserPoolClientAnalyticsConfigurationArgs $) {
        this.applicationArn = $.applicationArn;
        this.applicationId = $.applicationId;
        this.externalId = $.externalId;
        this.roleArn = $.roleArn;
        this.userDataShared = $.userDataShared;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPoolClientAnalyticsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPoolClientAnalyticsConfigurationArgs $;

        public Builder() {
            $ = new UserPoolClientAnalyticsConfigurationArgs();
        }

        public Builder(UserPoolClientAnalyticsConfigurationArgs defaults) {
            $ = new UserPoolClientAnalyticsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationArn(@Nullable Output<String> applicationArn) {
            $.applicationArn = applicationArn;
            return this;
        }

        public Builder applicationArn(String applicationArn) {
            return applicationArn(Output.of(applicationArn));
        }

        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder userDataShared(@Nullable Output<Boolean> userDataShared) {
            $.userDataShared = userDataShared;
            return this;
        }

        public Builder userDataShared(Boolean userDataShared) {
            return userDataShared(Output.of(userDataShared));
        }

        public UserPoolClientAnalyticsConfigurationArgs build() {
            return $;
        }
    }

}
