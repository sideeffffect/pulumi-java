// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleSnsActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleSnsActionArgs Empty = new TopicRuleSnsActionArgs();

    @InputImport(name="messageFormat")
      private final @Nullable Input<String> messageFormat;

    public Input<String> getMessageFormat() {
        return this.messageFormat == null ? Input.empty() : this.messageFormat;
    }

    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="targetArn", required=true)
      private final Input<String> targetArn;

    public Input<String> getTargetArn() {
        return this.targetArn;
    }

    public TopicRuleSnsActionArgs(
        @Nullable Input<String> messageFormat,
        Input<String> roleArn,
        Input<String> targetArn) {
        this.messageFormat = messageFormat;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.targetArn = Objects.requireNonNull(targetArn, "expected parameter 'targetArn' to be non-null");
    }

    private TopicRuleSnsActionArgs() {
        this.messageFormat = Input.empty();
        this.roleArn = Input.empty();
        this.targetArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleSnsActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> messageFormat;
        private Input<String> roleArn;
        private Input<String> targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleSnsActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFormat = defaults.messageFormat;
    	      this.roleArn = defaults.roleArn;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder messageFormat(@Nullable Input<String> messageFormat) {
            this.messageFormat = messageFormat;
            return this;
        }

        public Builder messageFormat(@Nullable String messageFormat) {
            this.messageFormat = Input.ofNullable(messageFormat);
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

        public Builder targetArn(Input<String> targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }

        public Builder targetArn(String targetArn) {
            this.targetArn = Input.of(Objects.requireNonNull(targetArn));
            return this;
        }
        public TopicRuleSnsActionArgs build() {
            return new TopicRuleSnsActionArgs(messageFormat, roleArn, targetArn);
        }
    }
}
