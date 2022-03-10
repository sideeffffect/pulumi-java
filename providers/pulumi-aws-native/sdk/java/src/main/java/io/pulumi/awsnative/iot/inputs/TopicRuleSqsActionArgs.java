// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleSqsActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleSqsActionArgs Empty = new TopicRuleSqsActionArgs();

    @InputImport(name="queueUrl", required=true)
      private final Input<String> queueUrl;

    public Input<String> getQueueUrl() {
        return this.queueUrl;
    }

    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="useBase64")
      private final @Nullable Input<Boolean> useBase64;

    public Input<Boolean> getUseBase64() {
        return this.useBase64 == null ? Input.empty() : this.useBase64;
    }

    public TopicRuleSqsActionArgs(
        Input<String> queueUrl,
        Input<String> roleArn,
        @Nullable Input<Boolean> useBase64) {
        this.queueUrl = Objects.requireNonNull(queueUrl, "expected parameter 'queueUrl' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.useBase64 = useBase64;
    }

    private TopicRuleSqsActionArgs() {
        this.queueUrl = Input.empty();
        this.roleArn = Input.empty();
        this.useBase64 = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleSqsActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> queueUrl;
        private Input<String> roleArn;
        private @Nullable Input<Boolean> useBase64;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleSqsActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queueUrl = defaults.queueUrl;
    	      this.roleArn = defaults.roleArn;
    	      this.useBase64 = defaults.useBase64;
        }

        public Builder queueUrl(Input<String> queueUrl) {
            this.queueUrl = Objects.requireNonNull(queueUrl);
            return this;
        }

        public Builder queueUrl(String queueUrl) {
            this.queueUrl = Input.of(Objects.requireNonNull(queueUrl));
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

        public Builder useBase64(@Nullable Input<Boolean> useBase64) {
            this.useBase64 = useBase64;
            return this;
        }

        public Builder useBase64(@Nullable Boolean useBase64) {
            this.useBase64 = Input.ofNullable(useBase64);
            return this;
        }
        public TopicRuleSqsActionArgs build() {
            return new TopicRuleSqsActionArgs(queueUrl, roleArn, useBase64);
        }
    }
}
