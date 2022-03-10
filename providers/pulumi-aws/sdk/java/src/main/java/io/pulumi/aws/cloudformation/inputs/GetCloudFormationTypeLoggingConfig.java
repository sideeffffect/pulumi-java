// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudformation.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCloudFormationTypeLoggingConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetCloudFormationTypeLoggingConfig Empty = new GetCloudFormationTypeLoggingConfig();

    /**
     * Name of the CloudWatch Log Group where CloudFormation sends error logging information when invoking the type's handlers.
     * 
     */
    @InputImport(name="logGroupName", required=true)
      private final String logGroupName;

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role CloudFormation assumes when sending error logging information to CloudWatch Logs.
     * 
     */
    @InputImport(name="logRoleArn", required=true)
      private final String logRoleArn;

    public String getLogRoleArn() {
        return this.logRoleArn;
    }

    public GetCloudFormationTypeLoggingConfig(
        String logGroupName,
        String logRoleArn) {
        this.logGroupName = Objects.requireNonNull(logGroupName, "expected parameter 'logGroupName' to be non-null");
        this.logRoleArn = Objects.requireNonNull(logRoleArn, "expected parameter 'logRoleArn' to be non-null");
    }

    private GetCloudFormationTypeLoggingConfig() {
        this.logGroupName = null;
        this.logRoleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudFormationTypeLoggingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logGroupName;
        private String logRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCloudFormationTypeLoggingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
    	      this.logRoleArn = defaults.logRoleArn;
        }

        public Builder logGroupName(String logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }

        public Builder logRoleArn(String logRoleArn) {
            this.logRoleArn = Objects.requireNonNull(logRoleArn);
            return this;
        }
        public GetCloudFormationTypeLoggingConfig build() {
            return new GetCloudFormationTypeLoggingConfig(logGroupName, logRoleArn);
        }
    }
}
