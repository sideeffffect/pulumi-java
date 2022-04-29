// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.securitycenter.inputs.NotificationConfigStreamingConfigArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationConfigState extends ResourceArgs {

    public static final NotificationConfigState Empty = new NotificationConfigState();

    /**
     * This must be unique within the organization.
     * 
     */
    @Import(name="configId")
    private @Nullable Output<String> configId;

    /**
     * @return This must be unique within the organization.
     * 
     */
    public Optional<Output<String>> configId() {
        return Optional.ofNullable(this.configId);
    }

    /**
     * The description of the notification config (max of 1024 characters).
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the notification config (max of 1024 characters).
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The resource name of this notification config, in the format
     * &#39;organizations/{{organization}}/notificationConfigs/{{config_id}}&#39;.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of this notification config, in the format
     * &#39;organizations/{{organization}}/notificationConfigs/{{config_id}}&#39;.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The organization whose Cloud Security Command Center the Notification
     * Config lives in.
     * 
     */
    @Import(name="organization")
    private @Nullable Output<String> organization;

    /**
     * @return The organization whose Cloud Security Command Center the Notification
     * Config lives in.
     * 
     */
    public Optional<Output<String>> organization() {
        return Optional.ofNullable(this.organization);
    }

    /**
     * The Pub/Sub topic to send notifications to. Its format is
     * &#34;projects/[project_id]/topics/[topic]&#34;.
     * 
     */
    @Import(name="pubsubTopic")
    private @Nullable Output<String> pubsubTopic;

    /**
     * @return The Pub/Sub topic to send notifications to. Its format is
     * &#34;projects/[project_id]/topics/[topic]&#34;.
     * 
     */
    public Optional<Output<String>> pubsubTopic() {
        return Optional.ofNullable(this.pubsubTopic);
    }

    /**
     * The service account that needs &#34;pubsub.topics.publish&#34; permission to publish to the Pub/Sub topic.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return The service account that needs &#34;pubsub.topics.publish&#34; permission to publish to the Pub/Sub topic.
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * The config for triggering streaming-based notifications.
     * Structure is documented below.
     * 
     */
    @Import(name="streamingConfig")
    private @Nullable Output<NotificationConfigStreamingConfigArgs> streamingConfig;

    /**
     * @return The config for triggering streaming-based notifications.
     * Structure is documented below.
     * 
     */
    public Optional<Output<NotificationConfigStreamingConfigArgs>> streamingConfig() {
        return Optional.ofNullable(this.streamingConfig);
    }

    private NotificationConfigState() {}

    private NotificationConfigState(NotificationConfigState $) {
        this.configId = $.configId;
        this.description = $.description;
        this.name = $.name;
        this.organization = $.organization;
        this.pubsubTopic = $.pubsubTopic;
        this.serviceAccount = $.serviceAccount;
        this.streamingConfig = $.streamingConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationConfigState $;

        public Builder() {
            $ = new NotificationConfigState();
        }

        public Builder(NotificationConfigState defaults) {
            $ = new NotificationConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configId This must be unique within the organization.
         * 
         * @return builder
         * 
         */
        public Builder configId(@Nullable Output<String> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId This must be unique within the organization.
         * 
         * @return builder
         * 
         */
        public Builder configId(String configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param description The description of the notification config (max of 1024 characters).
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the notification config (max of 1024 characters).
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The resource name of this notification config, in the format
         * &#39;organizations/{{organization}}/notificationConfigs/{{config_id}}&#39;.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of this notification config, in the format
         * &#39;organizations/{{organization}}/notificationConfigs/{{config_id}}&#39;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organization The organization whose Cloud Security Command Center the Notification
         * Config lives in.
         * 
         * @return builder
         * 
         */
        public Builder organization(@Nullable Output<String> organization) {
            $.organization = organization;
            return this;
        }

        /**
         * @param organization The organization whose Cloud Security Command Center the Notification
         * Config lives in.
         * 
         * @return builder
         * 
         */
        public Builder organization(String organization) {
            return organization(Output.of(organization));
        }

        /**
         * @param pubsubTopic The Pub/Sub topic to send notifications to. Its format is
         * &#34;projects/[project_id]/topics/[topic]&#34;.
         * 
         * @return builder
         * 
         */
        public Builder pubsubTopic(@Nullable Output<String> pubsubTopic) {
            $.pubsubTopic = pubsubTopic;
            return this;
        }

        /**
         * @param pubsubTopic The Pub/Sub topic to send notifications to. Its format is
         * &#34;projects/[project_id]/topics/[topic]&#34;.
         * 
         * @return builder
         * 
         */
        public Builder pubsubTopic(String pubsubTopic) {
            return pubsubTopic(Output.of(pubsubTopic));
        }

        /**
         * @param serviceAccount The service account that needs &#34;pubsub.topics.publish&#34; permission to publish to the Pub/Sub topic.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount The service account that needs &#34;pubsub.topics.publish&#34; permission to publish to the Pub/Sub topic.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param streamingConfig The config for triggering streaming-based notifications.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder streamingConfig(@Nullable Output<NotificationConfigStreamingConfigArgs> streamingConfig) {
            $.streamingConfig = streamingConfig;
            return this;
        }

        /**
         * @param streamingConfig The config for triggering streaming-based notifications.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder streamingConfig(NotificationConfigStreamingConfigArgs streamingConfig) {
            return streamingConfig(Output.of(streamingConfig));
        }

        public NotificationConfigState build() {
            return $;
        }
    }

}
