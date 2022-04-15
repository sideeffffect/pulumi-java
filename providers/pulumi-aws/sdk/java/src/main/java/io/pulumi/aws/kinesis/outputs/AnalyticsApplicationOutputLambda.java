// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AnalyticsApplicationOutputLambda {
    /**
     * The ARN of the Lambda function.
     * 
     */
    private final String resourceArn;
    /**
     * The ARN of the IAM Role used to access the Lambda function.
     * 
     */
    private final String roleArn;

    @CustomType.Constructor
    private AnalyticsApplicationOutputLambda(
        @CustomType.Parameter("resourceArn") String resourceArn,
        @CustomType.Parameter("roleArn") String roleArn) {
        this.resourceArn = resourceArn;
        this.roleArn = roleArn;
    }

    /**
     * The ARN of the Lambda function.
     * 
    */
    public String resourceArn() {
        return this.resourceArn;
    }
    /**
     * The ARN of the IAM Role used to access the Lambda function.
     * 
    */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationOutputLambda defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceArn;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationOutputLambda defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }        public AnalyticsApplicationOutputLambda build() {
            return new AnalyticsApplicationOutputLambda(resourceArn, roleArn);
        }
    }
}
