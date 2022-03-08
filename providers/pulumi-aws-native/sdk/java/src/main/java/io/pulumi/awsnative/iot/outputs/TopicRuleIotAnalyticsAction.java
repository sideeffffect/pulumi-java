// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TopicRuleIotAnalyticsAction {
    private final @Nullable Boolean batchMode;
    private final String channelName;
    private final String roleArn;

    @OutputCustomType.Constructor({"batchMode","channelName","roleArn"})
    private TopicRuleIotAnalyticsAction(
        @Nullable Boolean batchMode,
        String channelName,
        String roleArn) {
        this.batchMode = batchMode;
        this.channelName = channelName;
        this.roleArn = roleArn;
    }

    public Optional<Boolean> getBatchMode() {
        return Optional.ofNullable(this.batchMode);
    }
    public String getChannelName() {
        return this.channelName;
    }
    public String getRoleArn() {
        return this.roleArn;
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

        public Builder setBatchMode(@Nullable Boolean batchMode) {
            this.batchMode = batchMode;
            return this;
        }

        public Builder setChannelName(String channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public TopicRuleIotAnalyticsAction build() {
            return new TopicRuleIotAnalyticsAction(batchMode, channelName, roleArn);
        }
    }
}
