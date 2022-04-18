// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dialogflow_v2.VersionArgs;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an agent version. The new version points to the agent instance in the "default" environment.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dialogflow/v2:Version")
public class Version extends com.pulumi.resources.CustomResource {
    /**
     * The creation time of this version. This field is read-only, i.e., it cannot be set by create and update methods.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation time of this version. This field is read-only, i.e., it cannot be set by create and update methods.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optional. The developer-provided description of this version.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. The developer-provided description of this version.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The unique identifier of this agent version. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of this agent version. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The status of this version. This field is read-only and cannot be set by create and update methods.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of this version. This field is read-only and cannot be set by create and update methods.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The sequential number of this version. This field is read-only which means it cannot be set by create and update methods.
     * 
     */
    @Export(name="versionNumber", type=Integer.class, parameters={})
    private Output<Integer> versionNumber;

    /**
     * @return The sequential number of this version. This field is read-only which means it cannot be set by create and update methods.
     * 
     */
    public Output<Integer> versionNumber() {
        return this.versionNumber;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Version(String name) {
        this(name, VersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Version(String name, @Nullable VersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Version(String name, @Nullable VersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2:Version", name, args == null ? VersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Version(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2:Version", name, null, makeResourceOptions(options, id));
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
    public static Version get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Version(name, id, options);
    }
}
