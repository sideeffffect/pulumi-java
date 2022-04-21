// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice;

import com.pulumi.azurenative.botservice.enums.Kind;
import com.pulumi.azurenative.botservice.inputs.AlexaChannelArgs;
import com.pulumi.azurenative.botservice.inputs.DirectLineChannelArgs;
import com.pulumi.azurenative.botservice.inputs.DirectLineSpeechChannelArgs;
import com.pulumi.azurenative.botservice.inputs.EmailChannelArgs;
import com.pulumi.azurenative.botservice.inputs.FacebookChannelArgs;
import com.pulumi.azurenative.botservice.inputs.KikChannelArgs;
import com.pulumi.azurenative.botservice.inputs.LineChannelArgs;
import com.pulumi.azurenative.botservice.inputs.MsTeamsChannelArgs;
import com.pulumi.azurenative.botservice.inputs.SkuArgs;
import com.pulumi.azurenative.botservice.inputs.SkypeChannelArgs;
import com.pulumi.azurenative.botservice.inputs.SlackChannelArgs;
import com.pulumi.azurenative.botservice.inputs.SmsChannelArgs;
import com.pulumi.azurenative.botservice.inputs.TelegramChannelArgs;
import com.pulumi.azurenative.botservice.inputs.WebChatChannelArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelArgs Empty = new ChannelArgs();

    /**
     * The name of the Channel resource.
     * 
     */
    @Import(name="channelName")
    private @Nullable Output<String> channelName;

    public Optional<Output<String>> channelName() {
        return Optional.ofNullable(this.channelName);
    }

    /**
     * Required. Gets or sets the Kind of the resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<Either<String,Kind>> kind;

    public Optional<Output<Either<String,Kind>>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The set of properties specific to bot channel resource
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Object> properties;

    public Optional<Output<Object>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the Bot resource group in the user subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Bot resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    public Output<String> resourceName() {
        return this.resourceName;
    }

    /**
     * Gets or sets the SKU of the resource.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SkuArgs> sku;

    public Optional<Output<SkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ChannelArgs() {}

    private ChannelArgs(ChannelArgs $) {
        this.channelName = $.channelName;
        this.kind = $.kind;
        this.location = $.location;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelArgs $;

        public Builder() {
            $ = new ChannelArgs();
        }

        public Builder(ChannelArgs defaults) {
            $ = new ChannelArgs(Objects.requireNonNull(defaults));
        }

        public Builder channelName(@Nullable Output<String> channelName) {
            $.channelName = channelName;
            return this;
        }

        public Builder channelName(String channelName) {
            return channelName(Output.of(channelName));
        }

        public Builder kind(@Nullable Output<Either<String,Kind>> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(Either<String,Kind> kind) {
            return kind(Output.of(kind));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder properties(@Nullable Output<Object> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(Object properties) {
            return properties(Output.of(properties));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public Builder sku(@Nullable Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ChannelArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
