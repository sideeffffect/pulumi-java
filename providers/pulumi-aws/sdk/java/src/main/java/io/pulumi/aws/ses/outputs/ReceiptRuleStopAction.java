// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReceiptRuleStopAction {
    /**
     * The position of the action in the receipt rule
     * 
     */
    private final Integer position;
    /**
     * The scope to apply
     * 
     */
    private final String scope;
    /**
     * The ARN of an SNS topic to notify
     * 
     */
    private final @Nullable String topicArn;

    @CustomType.Constructor
    private ReceiptRuleStopAction(
        @CustomType.Parameter("position") Integer position,
        @CustomType.Parameter("scope") String scope,
        @CustomType.Parameter("topicArn") @Nullable String topicArn) {
        this.position = position;
        this.scope = scope;
        this.topicArn = topicArn;
    }

    /**
     * The position of the action in the receipt rule
     * 
    */
    public Integer position() {
        return this.position;
    }
    /**
     * The scope to apply
     * 
    */
    public String scope() {
        return this.scope;
    }
    /**
     * The ARN of an SNS topic to notify
     * 
    */
    public Optional<String> topicArn() {
        return Optional.ofNullable(this.topicArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleStopAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer position;
        private String scope;
        private @Nullable String topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ReceiptRuleStopAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.position = defaults.position;
    	      this.scope = defaults.scope;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder position(Integer position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder topicArn(@Nullable String topicArn) {
            this.topicArn = topicArn;
            return this;
        }        public ReceiptRuleStopAction build() {
            return new ReceiptRuleStopAction(position, scope, topicArn);
        }
    }
}
