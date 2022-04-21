// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryEventNotificationConfigItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryEventNotificationConfigItemArgs Empty = new RegistryEventNotificationConfigItemArgs();

    @Import(name="pubsubTopicName", required=true)
    private Output<String> pubsubTopicName;

    public Output<String> pubsubTopicName() {
        return this.pubsubTopicName;
    }

    @Import(name="subfolderMatches")
    private @Nullable Output<String> subfolderMatches;

    public Optional<Output<String>> subfolderMatches() {
        return Optional.ofNullable(this.subfolderMatches);
    }

    private RegistryEventNotificationConfigItemArgs() {}

    private RegistryEventNotificationConfigItemArgs(RegistryEventNotificationConfigItemArgs $) {
        this.pubsubTopicName = $.pubsubTopicName;
        this.subfolderMatches = $.subfolderMatches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryEventNotificationConfigItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryEventNotificationConfigItemArgs $;

        public Builder() {
            $ = new RegistryEventNotificationConfigItemArgs();
        }

        public Builder(RegistryEventNotificationConfigItemArgs defaults) {
            $ = new RegistryEventNotificationConfigItemArgs(Objects.requireNonNull(defaults));
        }

        public Builder pubsubTopicName(Output<String> pubsubTopicName) {
            $.pubsubTopicName = pubsubTopicName;
            return this;
        }

        public Builder pubsubTopicName(String pubsubTopicName) {
            return pubsubTopicName(Output.of(pubsubTopicName));
        }

        public Builder subfolderMatches(@Nullable Output<String> subfolderMatches) {
            $.subfolderMatches = subfolderMatches;
            return this;
        }

        public Builder subfolderMatches(String subfolderMatches) {
            return subfolderMatches(Output.of(subfolderMatches));
        }

        public RegistryEventNotificationConfigItemArgs build() {
            $.pubsubTopicName = Objects.requireNonNull($.pubsubTopicName, "expected parameter 'pubsubTopicName' to be non-null");
            return $;
        }
    }

}
