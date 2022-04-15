// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs;
import io.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsFirehoseGetArgs;
import io.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsS3GetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterLoggingInfoBrokerLogsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterLoggingInfoBrokerLogsGetArgs Empty = new ClusterLoggingInfoBrokerLogsGetArgs();

    @Import(name="cloudwatchLogs")
      private final @Nullable Output<ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs> cloudwatchLogs;

    public Output<ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs> cloudwatchLogs() {
        return this.cloudwatchLogs == null ? Codegen.empty() : this.cloudwatchLogs;
    }

    @Import(name="firehose")
      private final @Nullable Output<ClusterLoggingInfoBrokerLogsFirehoseGetArgs> firehose;

    public Output<ClusterLoggingInfoBrokerLogsFirehoseGetArgs> firehose() {
        return this.firehose == null ? Codegen.empty() : this.firehose;
    }

    @Import(name="s3")
      private final @Nullable Output<ClusterLoggingInfoBrokerLogsS3GetArgs> s3;

    public Output<ClusterLoggingInfoBrokerLogsS3GetArgs> s3() {
        return this.s3 == null ? Codegen.empty() : this.s3;
    }

    public ClusterLoggingInfoBrokerLogsGetArgs(
        @Nullable Output<ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs> cloudwatchLogs,
        @Nullable Output<ClusterLoggingInfoBrokerLogsFirehoseGetArgs> firehose,
        @Nullable Output<ClusterLoggingInfoBrokerLogsS3GetArgs> s3) {
        this.cloudwatchLogs = cloudwatchLogs;
        this.firehose = firehose;
        this.s3 = s3;
    }

    private ClusterLoggingInfoBrokerLogsGetArgs() {
        this.cloudwatchLogs = Codegen.empty();
        this.firehose = Codegen.empty();
        this.s3 = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingInfoBrokerLogsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs> cloudwatchLogs;
        private @Nullable Output<ClusterLoggingInfoBrokerLogsFirehoseGetArgs> firehose;
        private @Nullable Output<ClusterLoggingInfoBrokerLogsS3GetArgs> s3;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingInfoBrokerLogsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogs = defaults.cloudwatchLogs;
    	      this.firehose = defaults.firehose;
    	      this.s3 = defaults.s3;
        }

        public Builder cloudwatchLogs(@Nullable Output<ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs> cloudwatchLogs) {
            this.cloudwatchLogs = cloudwatchLogs;
            return this;
        }
        public Builder cloudwatchLogs(@Nullable ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs cloudwatchLogs) {
            this.cloudwatchLogs = Codegen.ofNullable(cloudwatchLogs);
            return this;
        }
        public Builder firehose(@Nullable Output<ClusterLoggingInfoBrokerLogsFirehoseGetArgs> firehose) {
            this.firehose = firehose;
            return this;
        }
        public Builder firehose(@Nullable ClusterLoggingInfoBrokerLogsFirehoseGetArgs firehose) {
            this.firehose = Codegen.ofNullable(firehose);
            return this;
        }
        public Builder s3(@Nullable Output<ClusterLoggingInfoBrokerLogsS3GetArgs> s3) {
            this.s3 = s3;
            return this;
        }
        public Builder s3(@Nullable ClusterLoggingInfoBrokerLogsS3GetArgs s3) {
            this.s3 = Codegen.ofNullable(s3);
            return this;
        }        public ClusterLoggingInfoBrokerLogsGetArgs build() {
            return new ClusterLoggingInfoBrokerLogsGetArgs(cloudwatchLogs, firehose, s3);
        }
    }
}
