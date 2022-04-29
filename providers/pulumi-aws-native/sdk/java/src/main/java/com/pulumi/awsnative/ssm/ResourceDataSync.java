// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssm;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ssm.ResourceDataSyncArgs;
import com.pulumi.awsnative.ssm.outputs.ResourceDataSyncS3Destination;
import com.pulumi.awsnative.ssm.outputs.ResourceDataSyncSyncSource;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SSM::ResourceDataSync
 * 
 */
@ResourceType(type="aws-native:ssm:ResourceDataSync")
public class ResourceDataSync extends CustomResource {
    @Export(name="bucketName", type=String.class, parameters={})
    private Output</* @Nullable */ String> bucketName;

    public Output<Optional<String>> bucketName() {
        return Codegen.optional(this.bucketName);
    }
    @Export(name="bucketPrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> bucketPrefix;

    public Output<Optional<String>> bucketPrefix() {
        return Codegen.optional(this.bucketPrefix);
    }
    @Export(name="bucketRegion", type=String.class, parameters={})
    private Output</* @Nullable */ String> bucketRegion;

    public Output<Optional<String>> bucketRegion() {
        return Codegen.optional(this.bucketRegion);
    }
    @Export(name="kMSKeyArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> kMSKeyArn;

    public Output<Optional<String>> kMSKeyArn() {
        return Codegen.optional(this.kMSKeyArn);
    }
    @Export(name="s3Destination", type=ResourceDataSyncS3Destination.class, parameters={})
    private Output</* @Nullable */ ResourceDataSyncS3Destination> s3Destination;

    public Output<Optional<ResourceDataSyncS3Destination>> s3Destination() {
        return Codegen.optional(this.s3Destination);
    }
    @Export(name="syncFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> syncFormat;

    public Output<Optional<String>> syncFormat() {
        return Codegen.optional(this.syncFormat);
    }
    @Export(name="syncName", type=String.class, parameters={})
    private Output<String> syncName;

    public Output<String> syncName() {
        return this.syncName;
    }
    @Export(name="syncSource", type=ResourceDataSyncSyncSource.class, parameters={})
    private Output</* @Nullable */ ResourceDataSyncSyncSource> syncSource;

    public Output<Optional<ResourceDataSyncSyncSource>> syncSource() {
        return Codegen.optional(this.syncSource);
    }
    @Export(name="syncType", type=String.class, parameters={})
    private Output</* @Nullable */ String> syncType;

    public Output<Optional<String>> syncType() {
        return Codegen.optional(this.syncType);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceDataSync(String name) {
        this(name, ResourceDataSyncArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceDataSync(String name, @Nullable ResourceDataSyncArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceDataSync(String name, @Nullable ResourceDataSyncArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:ssm:ResourceDataSync", name, args == null ? ResourceDataSyncArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceDataSync(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:ssm:ResourceDataSync", name, null, makeResourceOptions(options, id));
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
    public static ResourceDataSync get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ResourceDataSync(name, id, options);
    }
}
