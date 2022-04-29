// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datafusion;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.datafusion.InstanceArgs;
import com.pulumi.gcp.datafusion.inputs.InstanceState;
import com.pulumi.gcp.datafusion.outputs.InstanceNetworkConfig;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a Data Fusion instance.
 * 
 * To get more information about Instance, see:
 * 
 * * [API documentation](https://cloud.google.com/data-fusion/docs/reference/rest/v1beta1/projects.locations.instances)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/data-fusion/docs/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Instance can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:datafusion/instance:Instance default projects/{{project}}/locations/{{region}}/instances/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:datafusion/instance:Instance default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:datafusion/instance:Instance default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:datafusion/instance:Instance default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:datafusion/instance:Instance")
public class Instance extends CustomResource {
    /**
     * The time the instance was created in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the instance was created in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * User-managed service account to set on Dataproc when Cloud Data Fusion creates Dataproc to run data processing pipelines.
     * 
     */
    @Export(name="dataprocServiceAccount", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataprocServiceAccount;

    /**
     * @return User-managed service account to set on Dataproc when Cloud Data Fusion creates Dataproc to run data processing pipelines.
     * 
     */
    public Output<Optional<String>> dataprocServiceAccount() {
        return Codegen.optional(this.dataprocServiceAccount);
    }
    /**
     * An optional description of the instance.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of the instance.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Option to enable Stackdriver Logging.
     * 
     */
    @Export(name="enableStackdriverLogging", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableStackdriverLogging;

    /**
     * @return Option to enable Stackdriver Logging.
     * 
     */
    public Output<Optional<Boolean>> enableStackdriverLogging() {
        return Codegen.optional(this.enableStackdriverLogging);
    }
    /**
     * Option to enable Stackdriver Monitoring.
     * 
     */
    @Export(name="enableStackdriverMonitoring", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableStackdriverMonitoring;

    /**
     * @return Option to enable Stackdriver Monitoring.
     * 
     */
    public Output<Optional<Boolean>> enableStackdriverMonitoring() {
        return Codegen.optional(this.enableStackdriverMonitoring);
    }
    /**
     * The resource labels for instance to use to annotate any related underlying resources,
     * such as Compute Engine VMs.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return The resource labels for instance to use to annotate any related underlying resources,
     * such as Compute Engine VMs.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The ID of the instance or a fully qualified identifier for the instance.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The ID of the instance or a fully qualified identifier for the instance.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Network configuration options. These are required when a private Data Fusion instance is to be created.
     * Structure is documented below.
     * 
     */
    @Export(name="networkConfig", type=InstanceNetworkConfig.class, parameters={})
    private Output</* @Nullable */ InstanceNetworkConfig> networkConfig;

    /**
     * @return Network configuration options. These are required when a private Data Fusion instance is to be created.
     * Structure is documented below.
     * 
     */
    public Output<Optional<InstanceNetworkConfig>> networkConfig() {
        return Codegen.optional(this.networkConfig);
    }
    /**
     * Map of additional options used to configure the behavior of Data Fusion instance.
     * 
     */
    @Export(name="options", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> options;

    /**
     * @return Map of additional options used to configure the behavior of Data Fusion instance.
     * 
     */
    public Output<Optional<Map<String,String>>> options() {
        return Codegen.optional(this.options);
    }
    /**
     * Specifies whether the Data Fusion instance should be private. If set to
     * true, all Data Fusion nodes will have private IP addresses and will not be
     * able to access the public internet.
     * 
     */
    @Export(name="privateInstance", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> privateInstance;

    /**
     * @return Specifies whether the Data Fusion instance should be private. If set to
     * true, all Data Fusion nodes will have private IP addresses and will not be
     * able to access the public internet.
     * 
     */
    public Output<Optional<Boolean>> privateInstance() {
        return Codegen.optional(this.privateInstance);
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
     * The region of the Data Fusion instance.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region of the Data Fusion instance.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Service account which will be used to access resources in the customer project.
     * 
     */
    @Export(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    /**
     * @return Service account which will be used to access resources in the customer project.
     * 
     */
    public Output<String> serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * Endpoint on which the Data Fusion UI and REST APIs are accessible.
     * 
     */
    @Export(name="serviceEndpoint", type=String.class, parameters={})
    private Output<String> serviceEndpoint;

    /**
     * @return Endpoint on which the Data Fusion UI and REST APIs are accessible.
     * 
     */
    public Output<String> serviceEndpoint() {
        return this.serviceEndpoint;
    }
    /**
     * The current state of this Data Fusion instance. - CREATING: Instance is being created - RUNNING: Instance is running and
     * ready for requests - FAILED: Instance creation failed - DELETING: Instance is being deleted - UPGRADING: Instance is
     * being upgraded - RESTARTING: Instance is being restarted
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of this Data Fusion instance. - CREATING: Instance is being created - RUNNING: Instance is running and
     * ready for requests - FAILED: Instance creation failed - DELETING: Instance is being deleted - UPGRADING: Instance is
     * being upgraded - RESTARTING: Instance is being restarted
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Additional information about the current state of this Data Fusion instance if available.
     * 
     */
    @Export(name="stateMessage", type=String.class, parameters={})
    private Output<String> stateMessage;

    /**
     * @return Additional information about the current state of this Data Fusion instance if available.
     * 
     */
    public Output<String> stateMessage() {
        return this.stateMessage;
    }
    /**
     * Represents the type of Data Fusion instance. Each type is configured with
     * the default settings for processing and memory.
     * - BASIC: Basic Data Fusion instance. In Basic type, the user will be able to create data pipelines
     *   using point and click UI. However, there are certain limitations, such as fewer number
     *   of concurrent pipelines, no support for streaming pipelines, etc.
     * - ENTERPRISE: Enterprise Data Fusion instance. In Enterprise type, the user will have more features
     *   available, such as support for streaming pipelines, higher number of concurrent pipelines, etc.
     * - DEVELOPER: Developer Data Fusion instance. In Developer type, the user will have all features available but
     *   with restrictive capabilities. This is to help enterprises design and develop their data ingestion and integration
     *   pipelines at low cost.
     *   Possible values are `BASIC`, `ENTERPRISE`, and `DEVELOPER`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Represents the type of Data Fusion instance. Each type is configured with
     * the default settings for processing and memory.
     * - BASIC: Basic Data Fusion instance. In Basic type, the user will be able to create data pipelines
     *   using point and click UI. However, there are certain limitations, such as fewer number
     *   of concurrent pipelines, no support for streaming pipelines, etc.
     * - ENTERPRISE: Enterprise Data Fusion instance. In Enterprise type, the user will have more features
     *   available, such as support for streaming pipelines, higher number of concurrent pipelines, etc.
     * - DEVELOPER: Developer Data Fusion instance. In Developer type, the user will have all features available but
     *   with restrictive capabilities. This is to help enterprises design and develop their data ingestion and integration
     *   pipelines at low cost.
     *   Possible values are `BASIC`, `ENTERPRISE`, and `DEVELOPER`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The time the instance was last updated in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time the instance was last updated in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * Current version of the Data Fusion.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Current version of the Data Fusion.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:datafusion/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable CustomResourceOptions options) {
        super("gcp:datafusion/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
