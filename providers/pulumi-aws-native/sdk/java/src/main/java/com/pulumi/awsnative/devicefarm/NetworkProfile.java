// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devicefarm;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.devicefarm.NetworkProfileArgs;
import com.pulumi.awsnative.devicefarm.outputs.NetworkProfileTag;
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
 * AWS::DeviceFarm::NetworkProfile creates a new DF Network Profile
 * 
 */
@ResourceType(type="aws-native:devicefarm:NetworkProfile")
public class NetworkProfile extends CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="downlinkBandwidthBits", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> downlinkBandwidthBits;

    public Output<Optional<Integer>> downlinkBandwidthBits() {
        return Codegen.optional(this.downlinkBandwidthBits);
    }
    @Export(name="downlinkDelayMs", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> downlinkDelayMs;

    public Output<Optional<Integer>> downlinkDelayMs() {
        return Codegen.optional(this.downlinkDelayMs);
    }
    @Export(name="downlinkJitterMs", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> downlinkJitterMs;

    public Output<Optional<Integer>> downlinkJitterMs() {
        return Codegen.optional(this.downlinkJitterMs);
    }
    @Export(name="downlinkLossPercent", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> downlinkLossPercent;

    public Output<Optional<Integer>> downlinkLossPercent() {
        return Codegen.optional(this.downlinkLossPercent);
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="projectArn", type=String.class, parameters={})
    private Output<String> projectArn;

    public Output<String> projectArn() {
        return this.projectArn;
    }
    @Export(name="tags", type=List.class, parameters={NetworkProfileTag.class})
    private Output</* @Nullable */ List<NetworkProfileTag>> tags;

    public Output<Optional<List<NetworkProfileTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="uplinkBandwidthBits", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> uplinkBandwidthBits;

    public Output<Optional<Integer>> uplinkBandwidthBits() {
        return Codegen.optional(this.uplinkBandwidthBits);
    }
    @Export(name="uplinkDelayMs", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> uplinkDelayMs;

    public Output<Optional<Integer>> uplinkDelayMs() {
        return Codegen.optional(this.uplinkDelayMs);
    }
    @Export(name="uplinkJitterMs", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> uplinkJitterMs;

    public Output<Optional<Integer>> uplinkJitterMs() {
        return Codegen.optional(this.uplinkJitterMs);
    }
    @Export(name="uplinkLossPercent", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> uplinkLossPercent;

    public Output<Optional<Integer>> uplinkLossPercent() {
        return Codegen.optional(this.uplinkLossPercent);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkProfile(String name) {
        this(name, NetworkProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkProfile(String name, NetworkProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkProfile(String name, NetworkProfileArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:devicefarm:NetworkProfile", name, args == null ? NetworkProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkProfile(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:devicefarm:NetworkProfile", name, null, makeResourceOptions(options, id));
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
    public static NetworkProfile get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new NetworkProfile(name, id, options);
    }
}
