// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.pubsub.LiteSubscriptionArgs;
import io.pulumi.gcp.pubsub.inputs.LiteSubscriptionState;
import io.pulumi.gcp.pubsub.outputs.LiteSubscriptionDeliveryConfig;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A named resource representing the stream of messages from a single,
 * specific topic, to be delivered to the subscribing application.
 * 
 * To get more information about Subscription, see:
 * 
 * * [API documentation](https://cloud.google.com/pubsub/lite/docs/reference/rest/v1/admin.projects.locations.subscriptions)
 * * How-to Guides
 *     * [Managing Subscriptions](https://cloud.google.com/pubsub/lite/docs/subscriptions)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Subscription can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/liteSubscription:LiteSubscription default projects/{{project}}/locations/{{zone}}/subscriptions/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/liteSubscription:LiteSubscription default {{project}}/{{zone}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/liteSubscription:LiteSubscription default {{zone}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/liteSubscription:LiteSubscription default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:pubsub/liteSubscription:LiteSubscription")
public class LiteSubscription extends io.pulumi.resources.CustomResource {
    /**
     * The settings for this subscription's message delivery.
     * Structure is documented below.
     * 
     */
    @Export(name="deliveryConfig", type=LiteSubscriptionDeliveryConfig.class, parameters={})
    private Output</* @Nullable */ LiteSubscriptionDeliveryConfig> deliveryConfig;

    /**
     * @return The settings for this subscription's message delivery.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ LiteSubscriptionDeliveryConfig> deliveryConfig() {
        return this.deliveryConfig;
    }
    /**
     * Name of the subscription.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the subscription.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The region of the pubsub lite topic.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    /**
     * @return The region of the pubsub lite topic.
     * 
     */
    public Output</* @Nullable */ String> region() {
        return this.region;
    }
    /**
     * A reference to a Topic resource.
     * 
     */
    @Export(name="topic", type=String.class, parameters={})
    private Output<String> topic;

    /**
     * @return A reference to a Topic resource.
     * 
     */
    public Output<String> topic() {
        return this.topic;
    }
    /**
     * The zone of the pubsub lite topic.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output</* @Nullable */ String> zone;

    /**
     * @return The zone of the pubsub lite topic.
     * 
     */
    public Output</* @Nullable */ String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LiteSubscription(String name) {
        this(name, LiteSubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LiteSubscription(String name, LiteSubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LiteSubscription(String name, LiteSubscriptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/liteSubscription:LiteSubscription", name, args == null ? LiteSubscriptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LiteSubscription(String name, Output<String> id, @Nullable LiteSubscriptionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/liteSubscription:LiteSubscription", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LiteSubscription get(String name, Output<String> id, @Nullable LiteSubscriptionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LiteSubscription(name, id, state, options);
    }
}
