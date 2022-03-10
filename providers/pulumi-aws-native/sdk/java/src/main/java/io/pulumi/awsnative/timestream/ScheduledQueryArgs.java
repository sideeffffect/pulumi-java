// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream;

import io.pulumi.awsnative.timestream.inputs.ScheduledQueryErrorReportConfigurationArgs;
import io.pulumi.awsnative.timestream.inputs.ScheduledQueryNotificationConfigurationArgs;
import io.pulumi.awsnative.timestream.inputs.ScheduledQueryScheduleConfigurationArgs;
import io.pulumi.awsnative.timestream.inputs.ScheduledQueryTagArgs;
import io.pulumi.awsnative.timestream.inputs.ScheduledQueryTargetConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduledQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledQueryArgs Empty = new ScheduledQueryArgs();

    @InputImport(name="clientToken")
      private final @Nullable Input<String> clientToken;

    public Input<String> getClientToken() {
        return this.clientToken == null ? Input.empty() : this.clientToken;
    }

    @InputImport(name="errorReportConfiguration", required=true)
      private final Input<ScheduledQueryErrorReportConfigurationArgs> errorReportConfiguration;

    public Input<ScheduledQueryErrorReportConfigurationArgs> getErrorReportConfiguration() {
        return this.errorReportConfiguration;
    }

    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    @InputImport(name="notificationConfiguration", required=true)
      private final Input<ScheduledQueryNotificationConfigurationArgs> notificationConfiguration;

    public Input<ScheduledQueryNotificationConfigurationArgs> getNotificationConfiguration() {
        return this.notificationConfiguration;
    }

    @InputImport(name="queryString", required=true)
      private final Input<String> queryString;

    public Input<String> getQueryString() {
        return this.queryString;
    }

    @InputImport(name="scheduleConfiguration", required=true)
      private final Input<ScheduledQueryScheduleConfigurationArgs> scheduleConfiguration;

    public Input<ScheduledQueryScheduleConfigurationArgs> getScheduleConfiguration() {
        return this.scheduleConfiguration;
    }

    @InputImport(name="scheduledQueryExecutionRoleArn", required=true)
      private final Input<String> scheduledQueryExecutionRoleArn;

    public Input<String> getScheduledQueryExecutionRoleArn() {
        return this.scheduledQueryExecutionRoleArn;
    }

    @InputImport(name="scheduledQueryName")
      private final @Nullable Input<String> scheduledQueryName;

    public Input<String> getScheduledQueryName() {
        return this.scheduledQueryName == null ? Input.empty() : this.scheduledQueryName;
    }

    @InputImport(name="tags")
      private final @Nullable Input<List<ScheduledQueryTagArgs>> tags;

    public Input<List<ScheduledQueryTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="targetConfiguration")
      private final @Nullable Input<ScheduledQueryTargetConfigurationArgs> targetConfiguration;

    public Input<ScheduledQueryTargetConfigurationArgs> getTargetConfiguration() {
        return this.targetConfiguration == null ? Input.empty() : this.targetConfiguration;
    }

    public ScheduledQueryArgs(
        @Nullable Input<String> clientToken,
        Input<ScheduledQueryErrorReportConfigurationArgs> errorReportConfiguration,
        @Nullable Input<String> kmsKeyId,
        Input<ScheduledQueryNotificationConfigurationArgs> notificationConfiguration,
        Input<String> queryString,
        Input<ScheduledQueryScheduleConfigurationArgs> scheduleConfiguration,
        Input<String> scheduledQueryExecutionRoleArn,
        @Nullable Input<String> scheduledQueryName,
        @Nullable Input<List<ScheduledQueryTagArgs>> tags,
        @Nullable Input<ScheduledQueryTargetConfigurationArgs> targetConfiguration) {
        this.clientToken = clientToken;
        this.errorReportConfiguration = Objects.requireNonNull(errorReportConfiguration, "expected parameter 'errorReportConfiguration' to be non-null");
        this.kmsKeyId = kmsKeyId;
        this.notificationConfiguration = Objects.requireNonNull(notificationConfiguration, "expected parameter 'notificationConfiguration' to be non-null");
        this.queryString = Objects.requireNonNull(queryString, "expected parameter 'queryString' to be non-null");
        this.scheduleConfiguration = Objects.requireNonNull(scheduleConfiguration, "expected parameter 'scheduleConfiguration' to be non-null");
        this.scheduledQueryExecutionRoleArn = Objects.requireNonNull(scheduledQueryExecutionRoleArn, "expected parameter 'scheduledQueryExecutionRoleArn' to be non-null");
        this.scheduledQueryName = scheduledQueryName;
        this.tags = tags;
        this.targetConfiguration = targetConfiguration;
    }

    private ScheduledQueryArgs() {
        this.clientToken = Input.empty();
        this.errorReportConfiguration = Input.empty();
        this.kmsKeyId = Input.empty();
        this.notificationConfiguration = Input.empty();
        this.queryString = Input.empty();
        this.scheduleConfiguration = Input.empty();
        this.scheduledQueryExecutionRoleArn = Input.empty();
        this.scheduledQueryName = Input.empty();
        this.tags = Input.empty();
        this.targetConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientToken;
        private Input<ScheduledQueryErrorReportConfigurationArgs> errorReportConfiguration;
        private @Nullable Input<String> kmsKeyId;
        private Input<ScheduledQueryNotificationConfigurationArgs> notificationConfiguration;
        private Input<String> queryString;
        private Input<ScheduledQueryScheduleConfigurationArgs> scheduleConfiguration;
        private Input<String> scheduledQueryExecutionRoleArn;
        private @Nullable Input<String> scheduledQueryName;
        private @Nullable Input<List<ScheduledQueryTagArgs>> tags;
        private @Nullable Input<ScheduledQueryTargetConfigurationArgs> targetConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientToken = defaults.clientToken;
    	      this.errorReportConfiguration = defaults.errorReportConfiguration;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.notificationConfiguration = defaults.notificationConfiguration;
    	      this.queryString = defaults.queryString;
    	      this.scheduleConfiguration = defaults.scheduleConfiguration;
    	      this.scheduledQueryExecutionRoleArn = defaults.scheduledQueryExecutionRoleArn;
    	      this.scheduledQueryName = defaults.scheduledQueryName;
    	      this.tags = defaults.tags;
    	      this.targetConfiguration = defaults.targetConfiguration;
        }

        public Builder clientToken(@Nullable Input<String> clientToken) {
            this.clientToken = clientToken;
            return this;
        }

        public Builder clientToken(@Nullable String clientToken) {
            this.clientToken = Input.ofNullable(clientToken);
            return this;
        }

        public Builder errorReportConfiguration(Input<ScheduledQueryErrorReportConfigurationArgs> errorReportConfiguration) {
            this.errorReportConfiguration = Objects.requireNonNull(errorReportConfiguration);
            return this;
        }

        public Builder errorReportConfiguration(ScheduledQueryErrorReportConfigurationArgs errorReportConfiguration) {
            this.errorReportConfiguration = Input.of(Objects.requireNonNull(errorReportConfiguration));
            return this;
        }

        public Builder kmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder notificationConfiguration(Input<ScheduledQueryNotificationConfigurationArgs> notificationConfiguration) {
            this.notificationConfiguration = Objects.requireNonNull(notificationConfiguration);
            return this;
        }

        public Builder notificationConfiguration(ScheduledQueryNotificationConfigurationArgs notificationConfiguration) {
            this.notificationConfiguration = Input.of(Objects.requireNonNull(notificationConfiguration));
            return this;
        }

        public Builder queryString(Input<String> queryString) {
            this.queryString = Objects.requireNonNull(queryString);
            return this;
        }

        public Builder queryString(String queryString) {
            this.queryString = Input.of(Objects.requireNonNull(queryString));
            return this;
        }

        public Builder scheduleConfiguration(Input<ScheduledQueryScheduleConfigurationArgs> scheduleConfiguration) {
            this.scheduleConfiguration = Objects.requireNonNull(scheduleConfiguration);
            return this;
        }

        public Builder scheduleConfiguration(ScheduledQueryScheduleConfigurationArgs scheduleConfiguration) {
            this.scheduleConfiguration = Input.of(Objects.requireNonNull(scheduleConfiguration));
            return this;
        }

        public Builder scheduledQueryExecutionRoleArn(Input<String> scheduledQueryExecutionRoleArn) {
            this.scheduledQueryExecutionRoleArn = Objects.requireNonNull(scheduledQueryExecutionRoleArn);
            return this;
        }

        public Builder scheduledQueryExecutionRoleArn(String scheduledQueryExecutionRoleArn) {
            this.scheduledQueryExecutionRoleArn = Input.of(Objects.requireNonNull(scheduledQueryExecutionRoleArn));
            return this;
        }

        public Builder scheduledQueryName(@Nullable Input<String> scheduledQueryName) {
            this.scheduledQueryName = scheduledQueryName;
            return this;
        }

        public Builder scheduledQueryName(@Nullable String scheduledQueryName) {
            this.scheduledQueryName = Input.ofNullable(scheduledQueryName);
            return this;
        }

        public Builder tags(@Nullable Input<List<ScheduledQueryTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<ScheduledQueryTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder targetConfiguration(@Nullable Input<ScheduledQueryTargetConfigurationArgs> targetConfiguration) {
            this.targetConfiguration = targetConfiguration;
            return this;
        }

        public Builder targetConfiguration(@Nullable ScheduledQueryTargetConfigurationArgs targetConfiguration) {
            this.targetConfiguration = Input.ofNullable(targetConfiguration);
            return this;
        }
        public ScheduledQueryArgs build() {
            return new ScheduledQueryArgs(clientToken, errorReportConfiguration, kmsKeyId, notificationConfiguration, queryString, scheduleConfiguration, scheduledQueryExecutionRoleArn, scheduledQueryName, tags, targetConfiguration);
        }
    }
}
