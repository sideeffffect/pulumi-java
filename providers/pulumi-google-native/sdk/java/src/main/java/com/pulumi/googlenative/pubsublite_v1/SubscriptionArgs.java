// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsublite_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.pubsublite_v1.inputs.DeliveryConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionArgs Empty = new SubscriptionArgs();

    /**
     * The settings for this subscription's message delivery.
     * 
     */
    @Import(name="deliveryConfig")
      private final @Nullable Output<DeliveryConfigArgs> deliveryConfig;

    public Output<DeliveryConfigArgs> deliveryConfig() {
        return this.deliveryConfig == null ? Codegen.empty() : this.deliveryConfig;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the subscription. Structured like: projects/{project_number}/locations/{location}/subscriptions/{subscription_id}
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="skipBacklog")
      private final @Nullable Output<String> skipBacklog;

    public Output<String> skipBacklog() {
        return this.skipBacklog == null ? Codegen.empty() : this.skipBacklog;
    }

    @Import(name="subscriptionId", required=true)
      private final Output<String> subscriptionId;

    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * The name of the topic this subscription is attached to. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
     * 
     */
    @Import(name="topic")
      private final @Nullable Output<String> topic;

    public Output<String> topic() {
        return this.topic == null ? Codegen.empty() : this.topic;
    }

    public SubscriptionArgs(
        @Nullable Output<DeliveryConfigArgs> deliveryConfig,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> skipBacklog,
        Output<String> subscriptionId,
        @Nullable Output<String> topic) {
        this.deliveryConfig = deliveryConfig;
        this.location = location;
        this.name = name;
        this.project = project;
        this.skipBacklog = skipBacklog;
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
        this.topic = topic;
    }

    private SubscriptionArgs() {
        this.deliveryConfig = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.skipBacklog = Codegen.empty();
        this.subscriptionId = Codegen.empty();
        this.topic = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DeliveryConfigArgs> deliveryConfig;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> skipBacklog;
        private Output<String> subscriptionId;
        private @Nullable Output<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryConfig = defaults.deliveryConfig;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.skipBacklog = defaults.skipBacklog;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.topic = defaults.topic;
        }

        public Builder deliveryConfig(@Nullable Output<DeliveryConfigArgs> deliveryConfig) {
            this.deliveryConfig = deliveryConfig;
            return this;
        }
        public Builder deliveryConfig(@Nullable DeliveryConfigArgs deliveryConfig) {
            this.deliveryConfig = Codegen.ofNullable(deliveryConfig);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder skipBacklog(@Nullable Output<String> skipBacklog) {
            this.skipBacklog = skipBacklog;
            return this;
        }
        public Builder skipBacklog(@Nullable String skipBacklog) {
            this.skipBacklog = Codegen.ofNullable(skipBacklog);
            return this;
        }
        public Builder subscriptionId(Output<String> subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Output.of(Objects.requireNonNull(subscriptionId));
            return this;
        }
        public Builder topic(@Nullable Output<String> topic) {
            this.topic = topic;
            return this;
        }
        public Builder topic(@Nullable String topic) {
            this.topic = Codegen.ofNullable(topic);
            return this;
        }        public SubscriptionArgs build() {
            return new SubscriptionArgs(deliveryConfig, location, name, project, skipBacklog, subscriptionId, topic);
        }
    }
}
