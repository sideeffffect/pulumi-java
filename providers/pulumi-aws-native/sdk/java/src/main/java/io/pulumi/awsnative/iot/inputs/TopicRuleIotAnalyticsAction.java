// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleIotAnalyticsAction extends io.pulumi.resources.InvokeArgs {

    public static final TopicRuleIotAnalyticsAction Empty = new TopicRuleIotAnalyticsAction();

    @InputImport(name="batchMode")
      private final @Nullable Boolean batchMode;

    public Optional<Boolean> getBatchMode() {
        return this.batchMode == null ? Optional.empty() : Optional.ofNullable(this.batchMode);
    }

    @InputImport(name="channelName", required=true)
      private final String channelName;

    public String getChannelName() {
        return this.channelName;
    }

    @InputImport(name="roleArn", required=true)
      private final String roleArn;

    public String getRoleArn() {
        return this.roleArn;
    }

    public TopicRuleIotAnalyticsAction(
        @Nullable Boolean batchMode,
        String channelName,
        String roleArn) {
        this.batchMode = batchMode;
        this.channelName = Objects.requireNonNull(channelName, "expected parameter 'channelName' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private TopicRuleIotAnalyticsAction() {
        this.batchMode = null;
        this.channelName = null;
        this.roleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleIotAnalyticsAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean batchMode;
        private String channelName;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleIotAnalyticsAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchMode = defaults.batchMode;
    	      this.channelName = defaults.channelName;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder batchMode(@Nullable Boolean batchMode) {
            this.batchMode = batchMode;
            return this;
        }

        public Builder channelName(String channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public TopicRuleIotAnalyticsAction build() {
            return new TopicRuleIotAnalyticsAction(batchMode, channelName, roleArn);
        }
    }
}
