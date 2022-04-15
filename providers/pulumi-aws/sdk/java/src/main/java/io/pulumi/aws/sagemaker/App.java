// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sagemaker.AppArgs;
import io.pulumi.aws.sagemaker.inputs.AppState;
import io.pulumi.aws.sagemaker.outputs.AppResourceSpec;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Sagemaker App resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Sagemaker Code Apps can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/app:App example arn:aws:sagemaker:us-west-2:012345678912:app/domain-id/user-profile-name/app-type/app-name
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/app:App")
public class App extends io.pulumi.resources.CustomResource {
    /**
     * The name of the app.
     * 
     */
    @Export(name="appName", type=String.class, parameters={})
    private Output<String> appName;

    /**
     * @return The name of the app.
     * 
     */
    public Output<String> appName() {
        return this.appName;
    }
    /**
     * The type of app. Valid values are `JupyterServer`, `KernelGateway` and `TensorBoard`.
     * 
     */
    @Export(name="appType", type=String.class, parameters={})
    private Output<String> appType;

    /**
     * @return The type of app. Valid values are `JupyterServer`, `KernelGateway` and `TensorBoard`.
     * 
     */
    public Output<String> appType() {
        return this.appType;
    }
    /**
     * The Amazon Resource Name (ARN) of the app.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the app.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The domain ID.
     * 
     */
    @Export(name="domainId", type=String.class, parameters={})
    private Output<String> domainId;

    /**
     * @return The domain ID.
     * 
     */
    public Output<String> domainId() {
        return this.domainId;
    }
    /**
     * The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
     * 
     */
    @Export(name="resourceSpec", type=AppResourceSpec.class, parameters={})
    private Output<AppResourceSpec> resourceSpec;

    /**
     * @return The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
     * 
     */
    public Output<AppResourceSpec> resourceSpec() {
        return this.resourceSpec;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The user profile name.
     * 
     */
    @Export(name="userProfileName", type=String.class, parameters={})
    private Output<String> userProfileName;

    /**
     * @return The user profile name.
     * 
     */
    public Output<String> userProfileName() {
        return this.userProfileName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public App(String name) {
        this(name, AppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public App(String name, AppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public App(String name, AppArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/app:App", name, args == null ? AppArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private App(String name, Output<String> id, @Nullable AppState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/app:App", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static App get(String name, Output<String> id, @Nullable AppState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new App(name, id, state, options);
    }
}
