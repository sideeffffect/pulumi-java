// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devopsguru.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about a notification channel configured in DevOps Guru to send notifications when insights are created.
 * 
 */
public final class NotificationChannelSnsChannelConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationChannelSnsChannelConfigArgs Empty = new NotificationChannelSnsChannelConfigArgs();

    @Import(name="topicArn")
    private @Nullable Output<String> topicArn;

    public Optional<Output<String>> topicArn() {
        return Optional.ofNullable(this.topicArn);
    }

    private NotificationChannelSnsChannelConfigArgs() {}

    private NotificationChannelSnsChannelConfigArgs(NotificationChannelSnsChannelConfigArgs $) {
        this.topicArn = $.topicArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationChannelSnsChannelConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationChannelSnsChannelConfigArgs $;

        public Builder() {
            $ = new NotificationChannelSnsChannelConfigArgs();
        }

        public Builder(NotificationChannelSnsChannelConfigArgs defaults) {
            $ = new NotificationChannelSnsChannelConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder topicArn(@Nullable Output<String> topicArn) {
            $.topicArn = topicArn;
            return this;
        }

        public Builder topicArn(String topicArn) {
            return topicArn(Output.of(topicArn));
        }

        public NotificationChannelSnsChannelConfigArgs build() {
            return $;
        }
    }

}
