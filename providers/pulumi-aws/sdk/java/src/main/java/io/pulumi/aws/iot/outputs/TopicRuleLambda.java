// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TopicRuleLambda {
    /**
     * The ARN of the Lambda function.
     * 
     */
    private final String functionArn;

    @OutputCustomType.Constructor
    private TopicRuleLambda(@OutputCustomType.Parameter("functionArn") String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * The ARN of the Lambda function.
     * 
    */
    public String getFunctionArn() {
        return this.functionArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleLambda defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleLambda defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
        }

        public Builder functionArn(String functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }
        public TopicRuleLambda build() {
            return new TopicRuleLambda(functionArn);
        }
    }
}
