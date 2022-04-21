// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.pubsub.inputs.LiteSubscriptionDeliveryConfigGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LiteSubscriptionState extends com.pulumi.resources.ResourceArgs {

    public static final LiteSubscriptionState Empty = new LiteSubscriptionState();

    /**
     * The settings for this subscription&#39;s message delivery.
     * Structure is documented below.
     * 
     */
    @Import(name="deliveryConfig")
    private @Nullable Output<LiteSubscriptionDeliveryConfigGetArgs> deliveryConfig;

    public Optional<Output<LiteSubscriptionDeliveryConfigGetArgs>> deliveryConfig() {
        return Optional.ofNullable(this.deliveryConfig);
    }

    /**
     * Name of the subscription.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region of the pubsub lite topic.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * A reference to a Topic resource.
     * 
     */
    @Import(name="topic")
    private @Nullable Output<String> topic;

    public Optional<Output<String>> topic() {
        return Optional.ofNullable(this.topic);
    }

    /**
     * The zone of the pubsub lite topic.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private LiteSubscriptionState() {}

    private LiteSubscriptionState(LiteSubscriptionState $) {
        this.deliveryConfig = $.deliveryConfig;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
        this.topic = $.topic;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LiteSubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LiteSubscriptionState $;

        public Builder() {
            $ = new LiteSubscriptionState();
        }

        public Builder(LiteSubscriptionState defaults) {
            $ = new LiteSubscriptionState(Objects.requireNonNull(defaults));
        }

        public Builder deliveryConfig(@Nullable Output<LiteSubscriptionDeliveryConfigGetArgs> deliveryConfig) {
            $.deliveryConfig = deliveryConfig;
            return this;
        }

        public Builder deliveryConfig(LiteSubscriptionDeliveryConfigGetArgs deliveryConfig) {
            return deliveryConfig(Output.of(deliveryConfig));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder topic(@Nullable Output<String> topic) {
            $.topic = topic;
            return this;
        }

        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public LiteSubscriptionState build() {
            return $;
        }
    }

}
