// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.lightsail.LoadBalancerArgs;
import com.pulumi.awsnative.lightsail.outputs.LoadBalancerTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Lightsail::LoadBalancer
 * 
 */
@ResourceType(type="aws-native:lightsail:LoadBalancer")
public class LoadBalancer extends com.pulumi.resources.CustomResource {
    /**
     * The names of the instances attached to the load balancer.
     * 
     */
    @Export(name="attachedInstances", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> attachedInstances;

    /**
     * @return The names of the instances attached to the load balancer.
     * 
     */
    public Output<Optional<List<String>>> attachedInstances() {
        return Codegen.optional(this.attachedInstances);
    }
    /**
     * The path you provided to perform the load balancer health check. If you didn&#39;t specify a health check path, Lightsail uses the root path of your website (e.g., &#34;/&#34;).
     * 
     */
    @Export(name="healthCheckPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthCheckPath;

    /**
     * @return The path you provided to perform the load balancer health check. If you didn&#39;t specify a health check path, Lightsail uses the root path of your website (e.g., &#34;/&#34;).
     * 
     */
    public Output<Optional<String>> healthCheckPath() {
        return Codegen.optional(this.healthCheckPath);
    }
    /**
     * The instance port where you&#39;re creating your load balancer.
     * 
     */
    @Export(name="instancePort", type=Integer.class, parameters={})
    private Output<Integer> instancePort;

    /**
     * @return The instance port where you&#39;re creating your load balancer.
     * 
     */
    public Output<Integer> instancePort() {
        return this.instancePort;
    }
    /**
     * The IP address type for the load balancer. The possible values are ipv4 for IPv4 only, and dualstack for IPv4 and IPv6. The default value is dualstack.
     * 
     */
    @Export(name="ipAddressType", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipAddressType;

    /**
     * @return The IP address type for the load balancer. The possible values are ipv4 for IPv4 only, and dualstack for IPv4 and IPv6. The default value is dualstack.
     * 
     */
    public Output<Optional<String>> ipAddressType() {
        return Codegen.optional(this.ipAddressType);
    }
    @Export(name="loadBalancerArn", type=String.class, parameters={})
    private Output<String> loadBalancerArn;

    public Output<String> loadBalancerArn() {
        return this.loadBalancerArn;
    }
    /**
     * The name of your load balancer.
     * 
     */
    @Export(name="loadBalancerName", type=String.class, parameters={})
    private Output<String> loadBalancerName;

    /**
     * @return The name of your load balancer.
     * 
     */
    public Output<String> loadBalancerName() {
        return this.loadBalancerName;
    }
    /**
     * Configuration option to enable session stickiness.
     * 
     */
    @Export(name="sessionStickinessEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sessionStickinessEnabled;

    /**
     * @return Configuration option to enable session stickiness.
     * 
     */
    public Output<Optional<Boolean>> sessionStickinessEnabled() {
        return Codegen.optional(this.sessionStickinessEnabled);
    }
    /**
     * Configuration option to adjust session stickiness cookie duration parameter.
     * 
     */
    @Export(name="sessionStickinessLBCookieDurationSeconds", type=String.class, parameters={})
    private Output</* @Nullable */ String> sessionStickinessLBCookieDurationSeconds;

    /**
     * @return Configuration option to adjust session stickiness cookie duration parameter.
     * 
     */
    public Output<Optional<String>> sessionStickinessLBCookieDurationSeconds() {
        return Codegen.optional(this.sessionStickinessLBCookieDurationSeconds);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={LoadBalancerTag.class})
    private Output</* @Nullable */ List<LoadBalancerTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output<Optional<List<LoadBalancerTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancer(String name) {
        this(name, LoadBalancerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancer(String name, LoadBalancerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancer(String name, LoadBalancerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lightsail:LoadBalancer", name, args == null ? LoadBalancerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadBalancer(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lightsail:LoadBalancer", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LoadBalancer get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancer(name, id, options);
    }
}
