// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.BackendBucketArgs;
import io.pulumi.gcp.compute.inputs.BackendBucketState;
import io.pulumi.gcp.compute.outputs.BackendBucketCdnPolicy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Backend buckets allow you to use Google Cloud Storage buckets with HTTP(S)
 * load balancing.
 * 
 * An HTTP(S) load balancer can direct traffic to specified URLs to a
 * backend bucket rather than a backend service. It can send requests for
 * static content to a Cloud Storage bucket and requests for dynamic content
 * to a virtual machine instance.
 * 
 * To get more information about BackendBucket, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/v1/backendBuckets)
 * * How-to Guides
 *     * [Using a Cloud Storage bucket as a load balancer backend](https://cloud.google.com/compute/docs/load-balancing/http/backend-bucket)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * BackendBucket can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/backendBucket:BackendBucket default projects/{{project}}/global/backendBuckets/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/backendBucket:BackendBucket default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/backendBucket:BackendBucket default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/backendBucket:BackendBucket")
public class BackendBucket extends io.pulumi.resources.CustomResource {
    /**
     * Cloud Storage bucket name.
     * 
     */
    @Export(name="bucketName", type=String.class, parameters={})
    private Output<String> bucketName;

    /**
     * @return Cloud Storage bucket name.
     * 
     */
    public Output<String> bucketName() {
        return this.bucketName;
    }
    /**
     * Cloud CDN configuration for this Backend Bucket.
     * Structure is documented below.
     * 
     */
    @Export(name="cdnPolicy", type=BackendBucketCdnPolicy.class, parameters={})
    private Output<BackendBucketCdnPolicy> cdnPolicy;

    /**
     * @return Cloud CDN configuration for this Backend Bucket.
     * Structure is documented below.
     * 
     */
    public Output<BackendBucketCdnPolicy> cdnPolicy() {
        return this.cdnPolicy;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * Headers that the HTTP/S load balancer should add to proxied responses.
     * 
     */
    @Export(name="customResponseHeaders", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customResponseHeaders;

    /**
     * @return Headers that the HTTP/S load balancer should add to proxied responses.
     * 
     */
    public Output</* @Nullable */ List<String>> customResponseHeaders() {
        return this.customResponseHeaders;
    }
    /**
     * An optional textual description of the resource; provided by the
     * client when the resource is created.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional textual description of the resource; provided by the
     * client when the resource is created.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * If true, enable Cloud CDN for this BackendBucket.
     * 
     */
    @Export(name="enableCdn", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableCdn;

    /**
     * @return If true, enable Cloud CDN for this BackendBucket.
     * 
     */
    public Output</* @Nullable */ Boolean> enableCdn() {
        return this.enableCdn;
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
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
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackendBucket(String name) {
        this(name, BackendBucketArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackendBucket(String name, BackendBucketArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackendBucket(String name, BackendBucketArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/backendBucket:BackendBucket", name, args == null ? BackendBucketArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BackendBucket(String name, Output<String> id, @Nullable BackendBucketState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/backendBucket:BackendBucket", name, state, makeResourceOptions(options, id));
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
    public static BackendBucket get(String name, Output<String> id, @Nullable BackendBucketState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BackendBucket(name, id, state, options);
    }
}
