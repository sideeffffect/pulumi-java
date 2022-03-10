// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration options for a Lambda alert action.
 * 
 */
public final class AlertLambdaConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertLambdaConfigurationArgs Empty = new AlertLambdaConfigurationArgs();

    /**
     * ARN of a Lambda to send alert notifications to.
     * 
     */
    @InputImport(name="lambdaArn", required=true)
      private final Input<String> lambdaArn;

    public Input<String> getLambdaArn() {
        return this.lambdaArn;
    }

    /**
     * ARN of an IAM role that LookoutMetrics should assume to access the Lambda function.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    public AlertLambdaConfigurationArgs(
        Input<String> lambdaArn,
        Input<String> roleArn) {
        this.lambdaArn = Objects.requireNonNull(lambdaArn, "expected parameter 'lambdaArn' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private AlertLambdaConfigurationArgs() {
        this.lambdaArn = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertLambdaConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> lambdaArn;
        private Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertLambdaConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambdaArn = defaults.lambdaArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder lambdaArn(Input<String> lambdaArn) {
            this.lambdaArn = Objects.requireNonNull(lambdaArn);
            return this;
        }

        public Builder lambdaArn(String lambdaArn) {
            this.lambdaArn = Input.of(Objects.requireNonNull(lambdaArn));
            return this;
        }

        public Builder roleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public AlertLambdaConfigurationArgs build() {
            return new AlertLambdaConfigurationArgs(lambdaArn, roleArn);
        }
    }
}
