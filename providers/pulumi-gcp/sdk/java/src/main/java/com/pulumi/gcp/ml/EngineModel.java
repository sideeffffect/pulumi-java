// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.ml;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.ml.EngineModelArgs;
import com.pulumi.gcp.ml.inputs.EngineModelState;
import com.pulumi.gcp.ml.outputs.EngineModelDefaultVersion;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a machine learning solution.
 * 
 * A model can have multiple versions, each of which is a deployed, trained model
 * ready to receive prediction requests. The model itself is just a container.
 * 
 * To get more information about Model, see:
 * 
 * * [API documentation](https://cloud.google.com/ai-platform/prediction/docs/reference/rest/v1/projects.models)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/ai-platform/prediction/docs/deploying-models)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Model can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:ml/engineModel:EngineModel default projects/{{project}}/models/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:ml/engineModel:EngineModel default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:ml/engineModel:EngineModel default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:ml/engineModel:EngineModel")
public class EngineModel extends CustomResource {
    /**
     * The default version of the model. This version will be used to handle
     * prediction requests that do not specify a version.
     * Structure is documented below.
     * 
     */
    @Export(name="defaultVersion", type=EngineModelDefaultVersion.class, parameters={})
    private Output</* @Nullable */ EngineModelDefaultVersion> defaultVersion;

    /**
     * @return The default version of the model. This version will be used to handle
     * prediction requests that do not specify a version.
     * Structure is documented below.
     * 
     */
    public Output<Optional<EngineModelDefaultVersion>> defaultVersion() {
        return Codegen.optional(this.defaultVersion);
    }
    /**
     * The description specified for the model when it was created.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description specified for the model when it was created.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * One or more labels that you can add, to organize your models.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return One or more labels that you can add, to organize your models.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The name specified for the version when it was created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name specified for the version when it was created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * If true, online prediction nodes send stderr and stdout streams to Stackdriver Logging
     * 
     */
    @Export(name="onlinePredictionConsoleLogging", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> onlinePredictionConsoleLogging;

    /**
     * @return If true, online prediction nodes send stderr and stdout streams to Stackdriver Logging
     * 
     */
    public Output<Optional<Boolean>> onlinePredictionConsoleLogging() {
        return Codegen.optional(this.onlinePredictionConsoleLogging);
    }
    /**
     * If true, online prediction access logs are sent to StackDriver Logging.
     * 
     */
    @Export(name="onlinePredictionLogging", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> onlinePredictionLogging;

    /**
     * @return If true, online prediction access logs are sent to StackDriver Logging.
     * 
     */
    public Output<Optional<Boolean>> onlinePredictionLogging() {
        return Codegen.optional(this.onlinePredictionLogging);
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
     * The list of regions where the model is going to be deployed.
     * Currently only one region per model is supported
     * 
     */
    @Export(name="regions", type=String.class, parameters={})
    private Output</* @Nullable */ String> regions;

    /**
     * @return The list of regions where the model is going to be deployed.
     * Currently only one region per model is supported
     * 
     */
    public Output<Optional<String>> regions() {
        return Codegen.optional(this.regions);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EngineModel(String name) {
        this(name, EngineModelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EngineModel(String name, @Nullable EngineModelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EngineModel(String name, @Nullable EngineModelArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:ml/engineModel:EngineModel", name, args == null ? EngineModelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EngineModel(String name, Output<String> id, @Nullable EngineModelState state, @Nullable CustomResourceOptions options) {
        super("gcp:ml/engineModel:EngineModel", name, state, makeResourceOptions(options, id));
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
    public static EngineModel get(String name, Output<String> id, @Nullable EngineModelState state, @Nullable CustomResourceOptions options) {
        return new EngineModel(name, id, state, options);
    }
}
