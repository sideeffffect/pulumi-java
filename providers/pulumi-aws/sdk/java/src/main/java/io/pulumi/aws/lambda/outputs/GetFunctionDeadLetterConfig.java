// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetFunctionDeadLetterConfig {
    private final String targetArn;

    @OutputCustomType.Constructor({"targetArn"})
    private GetFunctionDeadLetterConfig(String targetArn) {
        this.targetArn = targetArn;
    }

    public String getTargetArn() {
        return this.targetArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionDeadLetterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionDeadLetterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetArn = defaults.targetArn;
        }

        public Builder setTargetArn(String targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }
        public GetFunctionDeadLetterConfig build() {
            return new GetFunctionDeadLetterConfig(targetArn);
        }
    }
}
