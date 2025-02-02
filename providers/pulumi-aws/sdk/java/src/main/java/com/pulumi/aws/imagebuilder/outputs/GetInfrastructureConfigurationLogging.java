// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.aws.imagebuilder.outputs.GetInfrastructureConfigurationLoggingS3Log;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInfrastructureConfigurationLogging {
    /**
     * @return Nested list of S3 logs settings.
     * 
     */
    private final List<GetInfrastructureConfigurationLoggingS3Log> s3Logs;

    @CustomType.Constructor
    private GetInfrastructureConfigurationLogging(@CustomType.Parameter("s3Logs") List<GetInfrastructureConfigurationLoggingS3Log> s3Logs) {
        this.s3Logs = s3Logs;
    }

    /**
     * @return Nested list of S3 logs settings.
     * 
     */
    public List<GetInfrastructureConfigurationLoggingS3Log> s3Logs() {
        return this.s3Logs;
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
        public Builder s3Logs(GetInfrastructureConfigurationLoggingS3Log... s3Logs) {
            return s3Logs(List.of(s3Logs));
        }        public GetInfrastructureConfigurationLogging build() {
            return new GetInfrastructureConfigurationLogging(s3Logs);
        }
    }
}
