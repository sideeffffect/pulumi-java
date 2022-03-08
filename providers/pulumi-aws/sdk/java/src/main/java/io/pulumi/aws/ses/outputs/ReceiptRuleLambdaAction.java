// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReceiptRuleLambdaAction {
    /**
     * The ARN of the Lambda function to invoke
     * 
     */
    private final String functionArn;
    /**
     * `Event` or `RequestResponse`
     * 
     */
    private final @Nullable String invocationType;
    /**
     * The position of the action in the receipt rule
     * 
     */
    private final Integer position;
    /**
     * The ARN of an SNS topic to notify
     * 
     */
    private final @Nullable String topicArn;

    @OutputCustomType.Constructor({"functionArn","invocationType","position","topicArn"})
    private ReceiptRuleLambdaAction(
        String functionArn,
        @Nullable String invocationType,
        Integer position,
        @Nullable String topicArn) {
        this.functionArn = functionArn;
        this.invocationType = invocationType;
        this.position = position;
        this.topicArn = topicArn;
    }

    /**
     * The ARN of the Lambda function to invoke
     * 
    */
    public String getFunctionArn() {
        return this.functionArn;
    }
    /**
     * `Event` or `RequestResponse`
     * 
    */
    public Optional<String> getInvocationType() {
        return Optional.ofNullable(this.invocationType);
    }
    /**
     * The position of the action in the receipt rule
     * 
    */
    public Integer getPosition() {
        return this.position;
    }
    /**
     * The ARN of an SNS topic to notify
     * 
    */
    public Optional<String> getTopicArn() {
        return Optional.ofNullable(this.topicArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleLambdaAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionArn;
        private @Nullable String invocationType;
        private Integer position;
        private @Nullable String topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ReceiptRuleLambdaAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
    	      this.invocationType = defaults.invocationType;
    	      this.position = defaults.position;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder setFunctionArn(String functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }

        public Builder setInvocationType(@Nullable String invocationType) {
            this.invocationType = invocationType;
            return this;
        }

        public Builder setPosition(Integer position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }

        public Builder setTopicArn(@Nullable String topicArn) {
            this.topicArn = topicArn;
            return this;
        }
        public ReceiptRuleLambdaAction build() {
            return new ReceiptRuleLambdaAction(functionArn, invocationType, position, topicArn);
        }
    }
}
