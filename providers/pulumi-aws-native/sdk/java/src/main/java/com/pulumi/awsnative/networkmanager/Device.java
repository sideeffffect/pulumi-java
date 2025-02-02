// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkmanager;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.networkmanager.DeviceArgs;
import com.pulumi.awsnative.networkmanager.outputs.DeviceLocation;
import com.pulumi.awsnative.networkmanager.outputs.DeviceTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The AWS::NetworkManager::Device type describes a device.
 * 
 */
@ResourceType(type="aws-native:networkmanager:Device")
public class Device extends com.pulumi.resources.CustomResource {
    /**
     * The description of the device.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the device.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The Amazon Resource Name (ARN) of the device.
     * 
     */
    @Export(name="deviceArn", type=String.class, parameters={})
    private Output<String> deviceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the device.
     * 
     */
    public Output<String> deviceArn() {
        return this.deviceArn;
    }
    /**
     * The ID of the device.
     * 
     */
    @Export(name="deviceId", type=String.class, parameters={})
    private Output<String> deviceId;

    /**
     * @return The ID of the device.
     * 
     */
    public Output<String> deviceId() {
        return this.deviceId;
    }
    /**
     * The ID of the global network.
     * 
     */
    @Export(name="globalNetworkId", type=String.class, parameters={})
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the global network.
     * 
     */
    public Output<String> globalNetworkId() {
        return this.globalNetworkId;
    }
    /**
     * The site location.
     * 
     */
    @Export(name="location", type=DeviceLocation.class, parameters={})
    private Output</* @Nullable */ DeviceLocation> location;

    /**
     * @return The site location.
     * 
     */
    public Output<Optional<DeviceLocation>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The device model
     * 
     */
    @Export(name="model", type=String.class, parameters={})
    private Output</* @Nullable */ String> model;

    /**
     * @return The device model
     * 
     */
    public Output<Optional<String>> model() {
        return Codegen.optional(this.model);
    }
    /**
     * The device serial number.
     * 
     */
    @Export(name="serialNumber", type=String.class, parameters={})
    private Output</* @Nullable */ String> serialNumber;

    /**
     * @return The device serial number.
     * 
     */
    public Output<Optional<String>> serialNumber() {
        return Codegen.optional(this.serialNumber);
    }
    /**
     * The site ID.
     * 
     */
    @Export(name="siteId", type=String.class, parameters={})
    private Output</* @Nullable */ String> siteId;

    /**
     * @return The site ID.
     * 
     */
    public Output<Optional<String>> siteId() {
        return Codegen.optional(this.siteId);
    }
    /**
     * The tags for the device.
     * 
     */
    @Export(name="tags", type=List.class, parameters={DeviceTag.class})
    private Output</* @Nullable */ List<DeviceTag>> tags;

    /**
     * @return The tags for the device.
     * 
     */
    public Output<Optional<List<DeviceTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The device type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The device type.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * The device vendor.
     * 
     */
    @Export(name="vendor", type=String.class, parameters={})
    private Output</* @Nullable */ String> vendor;

    /**
     * @return The device vendor.
     * 
     */
    public Output<Optional<String>> vendor() {
        return Codegen.optional(this.vendor);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Device(String name) {
        this(name, DeviceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Device(String name, DeviceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Device(String name, DeviceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:Device", name, args == null ? DeviceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Device(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:Device", name, null, makeResourceOptions(options, id));
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
    public static Device get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Device(name, id, options);
    }
}
