// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.securitycenter.NotificationConfigArgs;
import com.pulumi.gcp.securitycenter.inputs.NotificationConfigState;
import com.pulumi.gcp.securitycenter.outputs.NotificationConfigStreamingConfig;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Cloud Security Command Center (Cloud SCC) notification configs. A
 * notification config is a Cloud SCC resource that contains the
 * configuration to send notifications for create/update events of
 * findings, assets and etc.
 * &gt; **Note:** In order to use Cloud SCC resources, your organization must be enrolled
 * in [SCC Standard/Premium](https://cloud.google.com/security-command-center/docs/quickstart-security-command-center).
 * Without doing so, you may run into errors during resource creation.
 * 
 * To get more information about NotificationConfig, see:
 * 
 * * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.notificationConfigs)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/security-command-center/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * NotificationConfig can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:securitycenter/notificationConfig:NotificationConfig default organizations/{{organization}}/notificationConfigs/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:securitycenter/notificationConfig:NotificationConfig default {{organization}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:securitycenter/notificationConfig:NotificationConfig")
public class NotificationConfig extends CustomResource {
    /**
     * This must be unique within the organization.
     * 
     */
    @Export(name="configId", type=String.class, parameters={})
    private Output<String> configId;

    /**
     * @return This must be unique within the organization.
     * 
     */
    public Output<String> configId() {
        return this.configId;
    }
    /**
     * The description of the notification config (max of 1024 characters).
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the notification config (max of 1024 characters).
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The resource name of this notification config, in the format
     * &#39;organizations/{{organization}}/notificationConfigs/{{config_id}}&#39;.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of this notification config, in the format
     * &#39;organizations/{{organization}}/notificationConfigs/{{config_id}}&#39;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The organization whose Cloud Security Command Center the Notification
     * Config lives in.
     * 
     */
    @Export(name="organization", type=String.class, parameters={})
    private Output<String> organization;

    /**
     * @return The organization whose Cloud Security Command Center the Notification
     * Config lives in.
     * 
     */
    public Output<String> organization() {
        return this.organization;
    }
    /**
     * The Pub/Sub topic to send notifications to. Its format is
     * &#34;projects/[project_id]/topics/[topic]&#34;.
     * 
     */
    @Export(name="pubsubTopic", type=String.class, parameters={})
    private Output<String> pubsubTopic;

    /**
     * @return The Pub/Sub topic to send notifications to. Its format is
     * &#34;projects/[project_id]/topics/[topic]&#34;.
     * 
     */
    public Output<String> pubsubTopic() {
        return this.pubsubTopic;
    }
    /**
     * The service account that needs &#34;pubsub.topics.publish&#34; permission to publish to the Pub/Sub topic.
     * 
     */
    @Export(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    /**
     * @return The service account that needs &#34;pubsub.topics.publish&#34; permission to publish to the Pub/Sub topic.
     * 
     */
    public Output<String> serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * The config for triggering streaming-based notifications.
     * Structure is documented below.
     * 
     */
    @Export(name="streamingConfig", type=NotificationConfigStreamingConfig.class, parameters={})
    private Output<NotificationConfigStreamingConfig> streamingConfig;

    /**
     * @return The config for triggering streaming-based notifications.
     * Structure is documented below.
     * 
     */
    public Output<NotificationConfigStreamingConfig> streamingConfig() {
        return this.streamingConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationConfig(String name) {
        this(name, NotificationConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationConfig(String name, NotificationConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationConfig(String name, NotificationConfigArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:securitycenter/notificationConfig:NotificationConfig", name, args == null ? NotificationConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NotificationConfig(String name, Output<String> id, @Nullable NotificationConfigState state, @Nullable CustomResourceOptions options) {
        super("gcp:securitycenter/notificationConfig:NotificationConfig", name, state, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static NotificationConfig get(String name, Output<String> id, @Nullable NotificationConfigState state, @Nullable CustomResourceOptions options) {
        return new NotificationConfig(name, id, state, options);
    }
}
