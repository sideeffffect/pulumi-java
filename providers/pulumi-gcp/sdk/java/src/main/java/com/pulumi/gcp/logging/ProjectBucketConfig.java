// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.logging.ProjectBucketConfigArgs;
import com.pulumi.gcp.logging.inputs.ProjectBucketConfigState;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a project-level logging bucket config. For more information see
 * [the official logging documentation](https://cloud.google.com/logging/docs/) and
 * [Storing Logs](https://cloud.google.com/logging/docs/storage).
 * 
 * &gt; **Note:** Logging buckets are automatically created for a given folder, project, organization, billingAccount and cannot be deleted. Creating a resource of this type will acquire and update the resource that already exists at the desired location. These buckets cannot be removed so deleting this resource will remove the bucket config from your state but will leave the logging bucket unchanged. The buckets that are currently automatically created are &#34;_Default&#34; and &#34;_Required&#34;.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * This resource can be imported using the following format
 * 
 * ```sh
 *  $ pulumi import gcp:logging/projectBucketConfig:ProjectBucketConfig default projects/{{project}}/locations/{{location}}/buckets/{{bucket_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:logging/projectBucketConfig:ProjectBucketConfig")
public class ProjectBucketConfig extends CustomResource {
    /**
     * The name of the logging bucket. Logging automatically creates two log buckets: `_Required` and `_Default`.
     * 
     */
    @Export(name="bucketId", type=String.class, parameters={})
    private Output<String> bucketId;

    /**
     * @return The name of the logging bucket. Logging automatically creates two log buckets: `_Required` and `_Default`.
     * 
     */
    public Output<String> bucketId() {
        return this.bucketId;
    }
    /**
     * Describes this bucket.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Describes this bucket.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The bucket&#39;s lifecycle such as active or deleted. See [LifecycleState](https://cloud.google.com/logging/docs/reference/v2/rest/v2/billingAccounts.buckets#LogBucket.LifecycleState).
     * 
     */
    @Export(name="lifecycleState", type=String.class, parameters={})
    private Output<String> lifecycleState;

    /**
     * @return The bucket&#39;s lifecycle such as active or deleted. See [LifecycleState](https://cloud.google.com/logging/docs/reference/v2/rest/v2/billingAccounts.buckets#LogBucket.LifecycleState).
     * 
     */
    public Output<String> lifecycleState() {
        return this.lifecycleState;
    }
    /**
     * The location of the bucket.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the bucket.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name of the bucket. For example: &#34;projects/my-project-id/locations/my-location/buckets/my-bucket-id&#34;
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the bucket. For example: &#34;projects/my-project-id/locations/my-location/buckets/my-bucket-id&#34;
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The parent resource that contains the logging bucket.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The parent resource that contains the logging bucket.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at bucket creation time, the default time of 30 days will be used.
     * 
     */
    @Export(name="retentionDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retentionDays;

    /**
     * @return Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at bucket creation time, the default time of 30 days will be used.
     * 
     */
    public Output<Optional<Integer>> retentionDays() {
        return Codegen.optional(this.retentionDays);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProjectBucketConfig(String name) {
        this(name, ProjectBucketConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProjectBucketConfig(String name, ProjectBucketConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectBucketConfig(String name, ProjectBucketConfigArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:logging/projectBucketConfig:ProjectBucketConfig", name, args == null ? ProjectBucketConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProjectBucketConfig(String name, Output<String> id, @Nullable ProjectBucketConfigState state, @Nullable CustomResourceOptions options) {
        super("gcp:logging/projectBucketConfig:ProjectBucketConfig", name, state, makeResourceOptions(options, id));
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
    public static ProjectBucketConfig get(String name, Output<String> id, @Nullable ProjectBucketConfigState state, @Nullable CustomResourceOptions options) {
        return new ProjectBucketConfig(name, id, state, options);
    }
}
