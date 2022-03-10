// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TopicRuleSns {
    /**
     * The message format of the message to publish. Accepted values are "JSON" and "RAW".
     * 
     */
    private final @Nullable String messageFormat;
    /**
     * The ARN of the IAM role that grants access.
     * 
     */
    private final String roleArn;
    /**
     * The ARN of the SNS topic.
     * 
     */
    private final String targetArn;

    @OutputCustomType.Constructor
    private TopicRuleSns(
        @OutputCustomType.Parameter("messageFormat") @Nullable String messageFormat,
        @OutputCustomType.Parameter("roleArn") String roleArn,
        @OutputCustomType.Parameter("targetArn") String targetArn) {
        this.messageFormat = messageFormat;
        this.roleArn = roleArn;
        this.targetArn = targetArn;
    }

    /**
     * The message format of the message to publish. Accepted values are "JSON" and "RAW".
     * 
    */
    public Optional<String> getMessageFormat() {
        return Optional.ofNullable(this.messageFormat);
    }
    /**
     * The ARN of the IAM role that grants access.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * The ARN of the SNS topic.
     * 
    */
    public String getTargetArn() {
        return this.targetArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleSns defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String messageFormat;
        private String roleArn;
        private String targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleSns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFormat = defaults.messageFormat;
    	      this.roleArn = defaults.roleArn;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder messageFormat(@Nullable String messageFormat) {
            this.messageFormat = messageFormat;
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder targetArn(String targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }
        public TopicRuleSns build() {
            return new TopicRuleSns(messageFormat, roleArn, targetArn);
        }
    }
}
