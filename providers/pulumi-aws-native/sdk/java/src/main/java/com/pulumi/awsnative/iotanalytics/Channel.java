// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.iotanalytics.ChannelArgs;
import com.pulumi.awsnative.iotanalytics.outputs.ChannelRetentionPeriod;
import com.pulumi.awsnative.iotanalytics.outputs.ChannelStorage;
import com.pulumi.awsnative.iotanalytics.outputs.ChannelTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::IoTAnalytics::Channel
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:iotanalytics:Channel")
public class Channel extends com.pulumi.resources.CustomResource {
    @Export(name="channelName", type=String.class, parameters={})
    private Output</* @Nullable */ String> channelName;

    public Output</* @Nullable */ String> channelName() {
        return this.channelName;
    }
    @Export(name="channelStorage", type=ChannelStorage.class, parameters={})
    private Output</* @Nullable */ ChannelStorage> channelStorage;

    public Output</* @Nullable */ ChannelStorage> channelStorage() {
        return this.channelStorage;
    }
    @Export(name="retentionPeriod", type=ChannelRetentionPeriod.class, parameters={})
    private Output</* @Nullable */ ChannelRetentionPeriod> retentionPeriod;

    public Output</* @Nullable */ ChannelRetentionPeriod> retentionPeriod() {
        return this.retentionPeriod;
    }
    @Export(name="tags", type=List.class, parameters={ChannelTag.class})
    private Output</* @Nullable */ List<ChannelTag>> tags;

    public Output</* @Nullable */ List<ChannelTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Channel(String name) {
        this(name, ChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Channel(String name, @Nullable ChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Channel(String name, @Nullable ChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotanalytics:Channel", name, args == null ? ChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Channel(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotanalytics:Channel", name, null, makeResourceOptions(options, id));
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
    public static Channel get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Channel(name, id, options);
    }
}
