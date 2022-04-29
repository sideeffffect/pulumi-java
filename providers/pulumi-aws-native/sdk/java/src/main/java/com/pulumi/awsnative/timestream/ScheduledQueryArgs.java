// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.timestream;

import com.pulumi.awsnative.timestream.inputs.ScheduledQueryErrorReportConfigurationArgs;
import com.pulumi.awsnative.timestream.inputs.ScheduledQueryNotificationConfigurationArgs;
import com.pulumi.awsnative.timestream.inputs.ScheduledQueryScheduleConfigurationArgs;
import com.pulumi.awsnative.timestream.inputs.ScheduledQueryTagArgs;
import com.pulumi.awsnative.timestream.inputs.ScheduledQueryTargetConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduledQueryArgs extends ResourceArgs {

    public static final ScheduledQueryArgs Empty = new ScheduledQueryArgs();

    @Import(name="clientToken")
    private @Nullable Output<String> clientToken;

    public Optional<Output<String>> clientToken() {
        return Optional.ofNullable(this.clientToken);
    }

    @Import(name="errorReportConfiguration", required=true)
    private Output<ScheduledQueryErrorReportConfigurationArgs> errorReportConfiguration;

    public Output<ScheduledQueryErrorReportConfigurationArgs> errorReportConfiguration() {
        return this.errorReportConfiguration;
    }

    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    @Import(name="notificationConfiguration", required=true)
    private Output<ScheduledQueryNotificationConfigurationArgs> notificationConfiguration;

    public Output<ScheduledQueryNotificationConfigurationArgs> notificationConfiguration() {
        return this.notificationConfiguration;
    }

    @Import(name="queryString", required=true)
    private Output<String> queryString;

    public Output<String> queryString() {
        return this.queryString;
    }

    @Import(name="scheduleConfiguration", required=true)
    private Output<ScheduledQueryScheduleConfigurationArgs> scheduleConfiguration;

    public Output<ScheduledQueryScheduleConfigurationArgs> scheduleConfiguration() {
        return this.scheduleConfiguration;
    }

    @Import(name="scheduledQueryExecutionRoleArn", required=true)
    private Output<String> scheduledQueryExecutionRoleArn;

    public Output<String> scheduledQueryExecutionRoleArn() {
        return this.scheduledQueryExecutionRoleArn;
    }

    @Import(name="scheduledQueryName")
    private @Nullable Output<String> scheduledQueryName;

    public Optional<Output<String>> scheduledQueryName() {
        return Optional.ofNullable(this.scheduledQueryName);
    }

    @Import(name="tags")
    private @Nullable Output<List<ScheduledQueryTagArgs>> tags;

    public Optional<Output<List<ScheduledQueryTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="targetConfiguration")
    private @Nullable Output<ScheduledQueryTargetConfigurationArgs> targetConfiguration;

    public Optional<Output<ScheduledQueryTargetConfigurationArgs>> targetConfiguration() {
        return Optional.ofNullable(this.targetConfiguration);
    }

    private ScheduledQueryArgs() {}

    private ScheduledQueryArgs(ScheduledQueryArgs $) {
        this.clientToken = $.clientToken;
        this.errorReportConfiguration = $.errorReportConfiguration;
        this.kmsKeyId = $.kmsKeyId;
        this.notificationConfiguration = $.notificationConfiguration;
        this.queryString = $.queryString;
        this.scheduleConfiguration = $.scheduleConfiguration;
        this.scheduledQueryExecutionRoleArn = $.scheduledQueryExecutionRoleArn;
        this.scheduledQueryName = $.scheduledQueryName;
        this.tags = $.tags;
        this.targetConfiguration = $.targetConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledQueryArgs $;

        public Builder() {
            $ = new ScheduledQueryArgs();
        }

        public Builder(ScheduledQueryArgs defaults) {
            $ = new ScheduledQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientToken(@Nullable Output<String> clientToken) {
            $.clientToken = clientToken;
            return this;
        }

        public Builder clientToken(String clientToken) {
            return clientToken(Output.of(clientToken));
        }

        public Builder errorReportConfiguration(Output<ScheduledQueryErrorReportConfigurationArgs> errorReportConfiguration) {
            $.errorReportConfiguration = errorReportConfiguration;
            return this;
        }

        public Builder errorReportConfiguration(ScheduledQueryErrorReportConfigurationArgs errorReportConfiguration) {
            return errorReportConfiguration(Output.of(errorReportConfiguration));
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public Builder notificationConfiguration(Output<ScheduledQueryNotificationConfigurationArgs> notificationConfiguration) {
            $.notificationConfiguration = notificationConfiguration;
            return this;
        }

        public Builder notificationConfiguration(ScheduledQueryNotificationConfigurationArgs notificationConfiguration) {
            return notificationConfiguration(Output.of(notificationConfiguration));
        }

        public Builder queryString(Output<String> queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryString(String queryString) {
            return queryString(Output.of(queryString));
        }

        public Builder scheduleConfiguration(Output<ScheduledQueryScheduleConfigurationArgs> scheduleConfiguration) {
            $.scheduleConfiguration = scheduleConfiguration;
            return this;
        }

        public Builder scheduleConfiguration(ScheduledQueryScheduleConfigurationArgs scheduleConfiguration) {
            return scheduleConfiguration(Output.of(scheduleConfiguration));
        }

        public Builder scheduledQueryExecutionRoleArn(Output<String> scheduledQueryExecutionRoleArn) {
            $.scheduledQueryExecutionRoleArn = scheduledQueryExecutionRoleArn;
            return this;
        }

        public Builder scheduledQueryExecutionRoleArn(String scheduledQueryExecutionRoleArn) {
            return scheduledQueryExecutionRoleArn(Output.of(scheduledQueryExecutionRoleArn));
        }

        public Builder scheduledQueryName(@Nullable Output<String> scheduledQueryName) {
            $.scheduledQueryName = scheduledQueryName;
            return this;
        }

        public Builder scheduledQueryName(String scheduledQueryName) {
            return scheduledQueryName(Output.of(scheduledQueryName));
        }

        public Builder tags(@Nullable Output<List<ScheduledQueryTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<ScheduledQueryTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(ScheduledQueryTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder targetConfiguration(@Nullable Output<ScheduledQueryTargetConfigurationArgs> targetConfiguration) {
            $.targetConfiguration = targetConfiguration;
            return this;
        }

        public Builder targetConfiguration(ScheduledQueryTargetConfigurationArgs targetConfiguration) {
            return targetConfiguration(Output.of(targetConfiguration));
        }

        public ScheduledQueryArgs build() {
            $.errorReportConfiguration = Objects.requireNonNull($.errorReportConfiguration, "expected parameter 'errorReportConfiguration' to be non-null");
            $.notificationConfiguration = Objects.requireNonNull($.notificationConfiguration, "expected parameter 'notificationConfiguration' to be non-null");
            $.queryString = Objects.requireNonNull($.queryString, "expected parameter 'queryString' to be non-null");
            $.scheduleConfiguration = Objects.requireNonNull($.scheduleConfiguration, "expected parameter 'scheduleConfiguration' to be non-null");
            $.scheduledQueryExecutionRoleArn = Objects.requireNonNull($.scheduledQueryExecutionRoleArn, "expected parameter 'scheduledQueryExecutionRoleArn' to be non-null");
            return $;
        }
    }

}
