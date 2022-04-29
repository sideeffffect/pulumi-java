// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.firebase.WebAppArgs;
import com.pulumi.gcp.firebase.inputs.WebAppState;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A Google Cloud Firebase web application instance
 * 
 * To get more information about WebApp, see:
 * 
 * * [API documentation](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps)
 * * How-to Guides
 *     * [Official Documentation](https://firebase.google.com/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * WebApp can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:firebase/webApp:WebApp default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:firebase/webApp:WebApp default {{project}} {{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:firebase/webApp:WebApp default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:firebase/webApp:WebApp")
public class WebApp extends CustomResource {
    /**
     * Immutable. The globally unique, Firebase-assigned identifier of the App. This identifier should be treated as an opaque
     * token, as the data format is not specified.
     * 
     */
    @Export(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    /**
     * @return Immutable. The globally unique, Firebase-assigned identifier of the App. This identifier should be treated as an opaque
     * token, as the data format is not specified.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * The user-assigned display name of the App.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The user-assigned display name of the App.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The fully qualified resource name of the App, for example: projects/projectId/webApps/appId
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The fully qualified resource name of the App, for example: projects/projectId/webApps/appId
     * 
     */
    public Output<String> name() {
        return this.name;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebApp(String name) {
        this(name, WebAppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebApp(String name, WebAppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebApp(String name, WebAppArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:firebase/webApp:WebApp", name, args == null ? WebAppArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebApp(String name, Output<String> id, @Nullable WebAppState state, @Nullable CustomResourceOptions options) {
        super("gcp:firebase/webApp:WebApp", name, state, makeResourceOptions(options, id));
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
    public static WebApp get(String name, Output<String> id, @Nullable WebAppState state, @Nullable CustomResourceOptions options) {
        return new WebApp(name, id, state, options);
    }
}
