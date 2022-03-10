// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.aws.codebuild.inputs.ProjectLogsConfigCloudwatchLogsGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectLogsConfigS3LogsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectLogsConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectLogsConfigGetArgs Empty = new ProjectLogsConfigGetArgs();

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="cloudwatchLogs")
      private final @Nullable Input<ProjectLogsConfigCloudwatchLogsGetArgs> cloudwatchLogs;

    public Input<ProjectLogsConfigCloudwatchLogsGetArgs> getCloudwatchLogs() {
        return this.cloudwatchLogs == null ? Input.empty() : this.cloudwatchLogs;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="s3Logs")
      private final @Nullable Input<ProjectLogsConfigS3LogsGetArgs> s3Logs;

    public Input<ProjectLogsConfigS3LogsGetArgs> getS3Logs() {
        return this.s3Logs == null ? Input.empty() : this.s3Logs;
    }

    public ProjectLogsConfigGetArgs(
        @Nullable Input<ProjectLogsConfigCloudwatchLogsGetArgs> cloudwatchLogs,
        @Nullable Input<ProjectLogsConfigS3LogsGetArgs> s3Logs) {
        this.cloudwatchLogs = cloudwatchLogs;
        this.s3Logs = s3Logs;
    }

    private ProjectLogsConfigGetArgs() {
        this.cloudwatchLogs = Input.empty();
        this.s3Logs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectLogsConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ProjectLogsConfigCloudwatchLogsGetArgs> cloudwatchLogs;
        private @Nullable Input<ProjectLogsConfigS3LogsGetArgs> s3Logs;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectLogsConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogs = defaults.cloudwatchLogs;
    	      this.s3Logs = defaults.s3Logs;
        }

        public Builder cloudwatchLogs(@Nullable Input<ProjectLogsConfigCloudwatchLogsGetArgs> cloudwatchLogs) {
            this.cloudwatchLogs = cloudwatchLogs;
            return this;
        }

        public Builder cloudwatchLogs(@Nullable ProjectLogsConfigCloudwatchLogsGetArgs cloudwatchLogs) {
            this.cloudwatchLogs = Input.ofNullable(cloudwatchLogs);
            return this;
        }

        public Builder s3Logs(@Nullable Input<ProjectLogsConfigS3LogsGetArgs> s3Logs) {
            this.s3Logs = s3Logs;
            return this;
        }

        public Builder s3Logs(@Nullable ProjectLogsConfigS3LogsGetArgs s3Logs) {
            this.s3Logs = Input.ofNullable(s3Logs);
            return this;
        }
        public ProjectLogsConfigGetArgs build() {
            return new ProjectLogsConfigGetArgs(cloudwatchLogs, s3Logs);
        }
    }
}
