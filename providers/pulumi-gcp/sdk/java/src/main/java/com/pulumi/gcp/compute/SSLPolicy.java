// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.SSLPolicyArgs;
import com.pulumi.gcp.compute.inputs.SSLPolicyState;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a SSL policy. SSL policies give you the ability to control the
 * features of SSL that your SSL proxy or HTTPS load balancer negotiates.
 * 
 * To get more information about SslPolicy, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/sslPolicies)
 * * How-to Guides
 *     * [Using SSL Policies](https://cloud.google.com/compute/docs/load-balancing/ssl-policies)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SslPolicy can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/sSLPolicy:SSLPolicy default projects/{{project}}/global/sslPolicies/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/sSLPolicy:SSLPolicy default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/sSLPolicy:SSLPolicy default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/sSLPolicy:SSLPolicy")
public class SSLPolicy extends CustomResource {
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
     * Profile specifies the set of SSL features that can be used by the
     * load balancer when negotiating SSL with clients. This can be one of
     * `COMPATIBLE`, `MODERN`, `RESTRICTED`, or `CUSTOM`. If using `CUSTOM`,
     * the set of SSL features to enable must be specified in the
     * `customFeatures` field.
     * See the [official documentation](https://cloud.google.com/compute/docs/load-balancing/ssl-policies#profilefeaturesupport)
     * for which ciphers are available to use. **Note**: this argument
     * *must* be present when using the `CUSTOM` profile. This argument
     * *must not* be present when using any other profile.
     * 
     */
    @Export(name="customFeatures", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customFeatures;

    /**
     * @return Profile specifies the set of SSL features that can be used by the
     * load balancer when negotiating SSL with clients. This can be one of
     * `COMPATIBLE`, `MODERN`, `RESTRICTED`, or `CUSTOM`. If using `CUSTOM`,
     * the set of SSL features to enable must be specified in the
     * `customFeatures` field.
     * See the [official documentation](https://cloud.google.com/compute/docs/load-balancing/ssl-policies#profilefeaturesupport)
     * for which ciphers are available to use. **Note**: this argument
     * *must* be present when using the `CUSTOM` profile. This argument
     * *must not* be present when using any other profile.
     * 
     */
    public Output<Optional<List<String>>> customFeatures() {
        return Codegen.optional(this.customFeatures);
    }
    /**
     * An optional description of this resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The list of features enabled in the SSL policy.
     * 
     */
    @Export(name="enabledFeatures", type=List.class, parameters={String.class})
    private Output<List<String>> enabledFeatures;

    /**
     * @return The list of features enabled in the SSL policy.
     * 
     */
    public Output<List<String>> enabledFeatures() {
        return this.enabledFeatures;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking.
     * 
     */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * The minimum version of SSL protocol that can be used by the clients
     * to establish a connection with the load balancer.
     * Default value is `TLS_1_0`.
     * Possible values are `TLS_1_0`, `TLS_1_1`, and `TLS_1_2`.
     * 
     */
    @Export(name="minTlsVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> minTlsVersion;

    /**
     * @return The minimum version of SSL protocol that can be used by the clients
     * to establish a connection with the load balancer.
     * Default value is `TLS_1_0`.
     * Possible values are `TLS_1_0`, `TLS_1_1`, and `TLS_1_2`.
     * 
     */
    public Output<Optional<String>> minTlsVersion() {
        return Codegen.optional(this.minTlsVersion);
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Profile specifies the set of SSL features that can be used by the
     * load balancer when negotiating SSL with clients. If using `CUSTOM`,
     * the set of SSL features to enable must be specified in the
     * `customFeatures` field.
     * See the [official documentation](https://cloud.google.com/compute/docs/load-balancing/ssl-policies#profilefeaturesupport)
     * for information on what cipher suites each profile provides. If
     * `CUSTOM` is used, the `custom_features` attribute **must be set**.
     * Default value is `COMPATIBLE`.
     * Possible values are `COMPATIBLE`, `MODERN`, `RESTRICTED`, and `CUSTOM`.
     * 
     */
    @Export(name="profile", type=String.class, parameters={})
    private Output</* @Nullable */ String> profile;

    /**
     * @return Profile specifies the set of SSL features that can be used by the
     * load balancer when negotiating SSL with clients. If using `CUSTOM`,
     * the set of SSL features to enable must be specified in the
     * `customFeatures` field.
     * See the [official documentation](https://cloud.google.com/compute/docs/load-balancing/ssl-policies#profilefeaturesupport)
     * for information on what cipher suites each profile provides. If
     * `CUSTOM` is used, the `custom_features` attribute **must be set**.
     * Default value is `COMPATIBLE`.
     * Possible values are `COMPATIBLE`, `MODERN`, `RESTRICTED`, and `CUSTOM`.
     * 
     */
    public Output<Optional<String>> profile() {
        return Codegen.optional(this.profile);
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
    public SSLPolicy(String name) {
        this(name, SSLPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SSLPolicy(String name, @Nullable SSLPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SSLPolicy(String name, @Nullable SSLPolicyArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:compute/sSLPolicy:SSLPolicy", name, args == null ? SSLPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SSLPolicy(String name, Output<String> id, @Nullable SSLPolicyState state, @Nullable CustomResourceOptions options) {
        super("gcp:compute/sSLPolicy:SSLPolicy", name, state, makeResourceOptions(options, id));
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
    public static SSLPolicy get(String name, Output<String> id, @Nullable SSLPolicyState state, @Nullable CustomResourceOptions options) {
        return new SSLPolicy(name, id, state, options);
    }
}
