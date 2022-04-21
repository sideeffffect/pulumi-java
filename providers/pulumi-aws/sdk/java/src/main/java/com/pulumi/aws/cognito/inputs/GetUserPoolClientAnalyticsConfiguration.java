// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetUserPoolClientAnalyticsConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final GetUserPoolClientAnalyticsConfiguration Empty = new GetUserPoolClientAnalyticsConfiguration();

    /**
     * (Optional) Application ARN for an Amazon Pinpoint application. Conflicts with `external_id` and `role_arn`.
     * 
     */
    @Import(name="applicationArn", required=true)
    private String applicationArn;

    public String applicationArn() {
        return this.applicationArn;
    }

    /**
     * (Optional) Application ID for an Amazon Pinpoint application.
     * 
     */
    @Import(name="applicationId", required=true)
    private String applicationId;

    public String applicationId() {
        return this.applicationId;
    }

    /**
     * (Optional) ID for the Analytics Configuration. Conflicts with `application_arn`.
     * 
     */
    @Import(name="externalId", required=true)
    private String externalId;

    public String externalId() {
        return this.externalId;
    }

    /**
     * (Optional) ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics. Conflicts with `application_arn`.
     * * `user_data_shared` (Optional) If set to `true`, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
     * 
     */
    @Import(name="roleArn", required=true)
    private String roleArn;

    public String roleArn() {
        return this.roleArn;
    }

    @Import(name="userDataShared", required=true)
    private Boolean userDataShared;

    public Boolean userDataShared() {
        return this.userDataShared;
    }

    private GetUserPoolClientAnalyticsConfiguration() {}

    private GetUserPoolClientAnalyticsConfiguration(GetUserPoolClientAnalyticsConfiguration $) {
        this.applicationArn = $.applicationArn;
        this.applicationId = $.applicationId;
        this.externalId = $.externalId;
        this.roleArn = $.roleArn;
        this.userDataShared = $.userDataShared;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserPoolClientAnalyticsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserPoolClientAnalyticsConfiguration $;

        public Builder() {
            $ = new GetUserPoolClientAnalyticsConfiguration();
        }

        public Builder(GetUserPoolClientAnalyticsConfiguration defaults) {
            $ = new GetUserPoolClientAnalyticsConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder applicationArn(String applicationArn) {
            $.applicationArn = applicationArn;
            return this;
        }

        public Builder applicationId(String applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        public Builder externalId(String externalId) {
            $.externalId = externalId;
            return this;
        }

        public Builder roleArn(String roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder userDataShared(Boolean userDataShared) {
            $.userDataShared = userDataShared;
            return this;
        }

        public GetUserPoolClientAnalyticsConfiguration build() {
            $.applicationArn = Objects.requireNonNull($.applicationArn, "expected parameter 'applicationArn' to be non-null");
            $.applicationId = Objects.requireNonNull($.applicationId, "expected parameter 'applicationId' to be non-null");
            $.externalId = Objects.requireNonNull($.externalId, "expected parameter 'externalId' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.userDataShared = Objects.requireNonNull($.userDataShared, "expected parameter 'userDataShared' to be non-null");
            return $;
        }
    }

}
