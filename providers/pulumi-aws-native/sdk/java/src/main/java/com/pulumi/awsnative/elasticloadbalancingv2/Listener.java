// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.elasticloadbalancingv2.ListenerArgs;
import com.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerAction;
import com.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerCertificate;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::ElasticLoadBalancingV2::Listener
 * 
 */
@ResourceType(type="aws-native:elasticloadbalancingv2:Listener")
public class Listener extends CustomResource {
    @Export(name="alpnPolicy", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> alpnPolicy;

    public Output<Optional<List<String>>> alpnPolicy() {
        return Codegen.optional(this.alpnPolicy);
    }
    @Export(name="certificates", type=List.class, parameters={ListenerCertificate.class})
    private Output</* @Nullable */ List<ListenerCertificate>> certificates;

    public Output<Optional<List<ListenerCertificate>>> certificates() {
        return Codegen.optional(this.certificates);
    }
    @Export(name="defaultActions", type=List.class, parameters={ListenerAction.class})
    private Output<List<ListenerAction>> defaultActions;

    public Output<List<ListenerAction>> defaultActions() {
        return this.defaultActions;
    }
    @Export(name="listenerArn", type=String.class, parameters={})
    private Output<String> listenerArn;

    public Output<String> listenerArn() {
        return this.listenerArn;
    }
    @Export(name="loadBalancerArn", type=String.class, parameters={})
    private Output<String> loadBalancerArn;

    public Output<String> loadBalancerArn() {
        return this.loadBalancerArn;
    }
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    @Export(name="protocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> protocol;

    public Output<Optional<String>> protocol() {
        return Codegen.optional(this.protocol);
    }
    @Export(name="sslPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> sslPolicy;

    public Output<Optional<String>> sslPolicy() {
        return Codegen.optional(this.sslPolicy);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Listener(String name) {
        this(name, ListenerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Listener(String name, ListenerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Listener(String name, ListenerArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:elasticloadbalancingv2:Listener", name, args == null ? ListenerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Listener(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:elasticloadbalancingv2:Listener", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Listener get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Listener(name, id, options);
    }
}
