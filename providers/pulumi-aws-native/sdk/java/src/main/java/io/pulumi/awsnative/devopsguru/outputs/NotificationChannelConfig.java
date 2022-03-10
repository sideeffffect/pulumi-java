// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devopsguru.outputs;

import io.pulumi.awsnative.devopsguru.outputs.NotificationChannelSnsChannelConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NotificationChannelConfig {
    private final @Nullable NotificationChannelSnsChannelConfig sns;

    @OutputCustomType.Constructor
    private NotificationChannelConfig(@OutputCustomType.Parameter("sns") @Nullable NotificationChannelSnsChannelConfig sns) {
        this.sns = sns;
    }

    public Optional<NotificationChannelSnsChannelConfig> getSns() {
        return Optional.ofNullable(this.sns);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationChannelConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NotificationChannelSnsChannelConfig sns;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationChannelConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sns = defaults.sns;
        }

        public Builder sns(@Nullable NotificationChannelSnsChannelConfig sns) {
            this.sns = sns;
            return this;
        }
        public NotificationChannelConfig build() {
            return new NotificationChannelConfig(sns);
        }
    }
}
