// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.datasync.LocationNFSArgs;
import com.pulumi.awsnative.datasync.outputs.LocationNFSMountOptions;
import com.pulumi.awsnative.datasync.outputs.LocationNFSOnPremConfig;
import com.pulumi.awsnative.datasync.outputs.LocationNFSTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::DataSync::LocationNFS
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:datasync:LocationNFS")
public class LocationNFS extends CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the NFS location.
     * 
     */
    @Export(name="locationArn", type=String.class, parameters={})
    private Output<String> locationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the NFS location.
     * 
     */
    public Output<String> locationArn() {
        return this.locationArn;
    }
    /**
     * The URL of the NFS location that was described.
     * 
     */
    @Export(name="locationUri", type=String.class, parameters={})
    private Output<String> locationUri;

    /**
     * @return The URL of the NFS location that was described.
     * 
     */
    public Output<String> locationUri() {
        return this.locationUri;
    }
    @Export(name="mountOptions", type=LocationNFSMountOptions.class, parameters={})
    private Output</* @Nullable */ LocationNFSMountOptions> mountOptions;

    public Output<Optional<LocationNFSMountOptions>> mountOptions() {
        return Codegen.optional(this.mountOptions);
    }
    @Export(name="onPremConfig", type=LocationNFSOnPremConfig.class, parameters={})
    private Output<LocationNFSOnPremConfig> onPremConfig;

    public Output<LocationNFSOnPremConfig> onPremConfig() {
        return this.onPremConfig;
    }
    /**
     * The name of the NFS server. This value is the IP address or DNS name of the NFS server.
     * 
     */
    @Export(name="serverHostname", type=String.class, parameters={})
    private Output<String> serverHostname;

    /**
     * @return The name of the NFS server. This value is the IP address or DNS name of the NFS server.
     * 
     */
    public Output<String> serverHostname() {
        return this.serverHostname;
    }
    /**
     * The subdirectory in the NFS file system that is used to read data from the NFS source location or write data to the NFS destination.
     * 
     */
    @Export(name="subdirectory", type=String.class, parameters={})
    private Output<String> subdirectory;

    /**
     * @return The subdirectory in the NFS file system that is used to read data from the NFS source location or write data to the NFS destination.
     * 
     */
    public Output<String> subdirectory() {
        return this.subdirectory;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={LocationNFSTag.class})
    private Output</* @Nullable */ List<LocationNFSTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output<Optional<List<LocationNFSTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LocationNFS(String name) {
        this(name, LocationNFSArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocationNFS(String name, LocationNFSArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocationNFS(String name, LocationNFSArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:datasync:LocationNFS", name, args == null ? LocationNFSArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LocationNFS(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:datasync:LocationNFS", name, null, makeResourceOptions(options, id));
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
    public static LocationNFS get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new LocationNFS(name, id, options);
    }
}
