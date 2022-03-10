// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationLoggingS3Log;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class GetInfrastructureConfigurationLogging extends io.pulumi.resources.InvokeArgs {

    public static final GetInfrastructureConfigurationLogging Empty = new GetInfrastructureConfigurationLogging();

    /**
     * Nested list of S3 logs settings.
     * 
     */
    @InputImport(name="s3Logs", required=true)
      private final List<GetInfrastructureConfigurationLoggingS3Log> s3Logs;

    public List<GetInfrastructureConfigurationLoggingS3Log> getS3Logs() {
        return this.s3Logs;
    }

    public GetInfrastructureConfigurationLogging(List<GetInfrastructureConfigurationLoggingS3Log> s3Logs) {
        this.s3Logs = Objects.requireNonNull(s3Logs, "expected parameter 's3Logs' to be non-null");
    }

    private GetInfrastructureConfigurationLogging() {
        this.s3Logs = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInfrastructureConfigurationLogging defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetInfrastructureConfigurationLoggingS3Log> s3Logs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInfrastructureConfigurationLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Logs = defaults.s3Logs;
        }

        public Builder s3Logs(List<GetInfrastructureConfigurationLoggingS3Log> s3Logs) {
            this.s3Logs = Objects.requireNonNull(s3Logs);
            return this;
        }
        public GetInfrastructureConfigurationLogging build() {
            return new GetInfrastructureConfigurationLogging(s3Logs);
        }
    }
}
