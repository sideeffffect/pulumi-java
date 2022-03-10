// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.outputs;

import io.pulumi.aws.iot.outputs.TopicRuleErrorActionDynamodbv2PutItem;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TopicRuleErrorActionDynamodbv2 {
    /**
     * Configuration block with DynamoDB Table to which the message will be written. Nested arguments below.
     * 
     */
    private final @Nullable TopicRuleErrorActionDynamodbv2PutItem putItem;
    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     * 
     */
    private final String roleArn;

    @OutputCustomType.Constructor
    private TopicRuleErrorActionDynamodbv2(
        @OutputCustomType.Parameter("putItem") @Nullable TopicRuleErrorActionDynamodbv2PutItem putItem,
        @OutputCustomType.Parameter("roleArn") String roleArn) {
        this.putItem = putItem;
        this.roleArn = roleArn;
    }

    /**
     * Configuration block with DynamoDB Table to which the message will be written. Nested arguments below.
     * 
    */
    public Optional<TopicRuleErrorActionDynamodbv2PutItem> getPutItem() {
        return Optional.ofNullable(this.putItem);
    }
    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionDynamodbv2 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TopicRuleErrorActionDynamodbv2PutItem putItem;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionDynamodbv2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.putItem = defaults.putItem;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder putItem(@Nullable TopicRuleErrorActionDynamodbv2PutItem putItem) {
            this.putItem = putItem;
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public TopicRuleErrorActionDynamodbv2 build() {
            return new TopicRuleErrorActionDynamodbv2(putItem, roleArn);
        }
    }
}
