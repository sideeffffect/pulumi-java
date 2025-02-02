// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.sagemaker.DeviceFleetArgs;
import com.pulumi.awsnative.sagemaker.outputs.DeviceFleetEdgeOutputConfig;
import com.pulumi.awsnative.sagemaker.outputs.DeviceFleetTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::SageMaker::DeviceFleet
 * 
 */
@ResourceType(type="aws-native:sagemaker:DeviceFleet")
public class DeviceFleet extends com.pulumi.resources.CustomResource {
    /**
     * Description for the edge device fleet
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description for the edge device fleet
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the edge device fleet
     * 
     */
    @Export(name="deviceFleetName", type=String.class, parameters={})
    private Output<String> deviceFleetName;

    /**
     * @return The name of the edge device fleet
     * 
     */
    public Output<String> deviceFleetName() {
        return this.deviceFleetName;
    }
    /**
     * S3 bucket and an ecryption key id (if available) to store outputs for the fleet
     * 
     */
    @Export(name="outputConfig", type=DeviceFleetEdgeOutputConfig.class, parameters={})
    private Output<DeviceFleetEdgeOutputConfig> outputConfig;

    /**
     * @return S3 bucket and an ecryption key id (if available) to store outputs for the fleet
     * 
     */
    public Output<DeviceFleetEdgeOutputConfig> outputConfig() {
        return this.outputConfig;
    }
    /**
     * Role associated with the device fleet
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return Role associated with the device fleet
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * Associate tags with the resource
     * 
     */
    @Export(name="tags", type=List.class, parameters={DeviceFleetTag.class})
    private Output</* @Nullable */ List<DeviceFleetTag>> tags;

    /**
     * @return Associate tags with the resource
     * 
     */
    public Output<Optional<List<DeviceFleetTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeviceFleet(String name) {
        this(name, DeviceFleetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeviceFleet(String name, DeviceFleetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeviceFleet(String name, DeviceFleetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:DeviceFleet", name, args == null ? DeviceFleetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeviceFleet(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:DeviceFleet", name, null, makeResourceOptions(options, id));
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
    public static DeviceFleet get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeviceFleet(name, id, options);
    }
}
