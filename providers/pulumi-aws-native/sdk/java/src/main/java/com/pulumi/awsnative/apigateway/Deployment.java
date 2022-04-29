// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.apigateway.DeploymentArgs;
import com.pulumi.awsnative.apigateway.outputs.DeploymentCanarySettings;
import com.pulumi.awsnative.apigateway.outputs.DeploymentStageDescription;
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
 * Resource Type definition for AWS::ApiGateway::Deployment
 * 
 */
@ResourceType(type="aws-native:apigateway:Deployment")
public class Deployment extends CustomResource {
    /**
     * Specifies settings for the canary deployment.
     * 
     */
    @Export(name="deploymentCanarySettings", type=DeploymentCanarySettings.class, parameters={})
    private Output</* @Nullable */ DeploymentCanarySettings> deploymentCanarySettings;

    /**
     * @return Specifies settings for the canary deployment.
     * 
     */
    public Output<Optional<DeploymentCanarySettings>> deploymentCanarySettings() {
        return Codegen.optional(this.deploymentCanarySettings);
    }
    /**
     * Primary Id for this resource
     * 
     */
    @Export(name="deploymentId", type=String.class, parameters={})
    private Output<String> deploymentId;

    /**
     * @return Primary Id for this resource
     * 
     */
    public Output<String> deploymentId() {
        return this.deploymentId;
    }
    /**
     * A description of the purpose of the API Gateway deployment.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the purpose of the API Gateway deployment.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ID of the RestApi resource to deploy.
     * 
     */
    @Export(name="restApiId", type=String.class, parameters={})
    private Output<String> restApiId;

    /**
     * @return The ID of the RestApi resource to deploy.
     * 
     */
    public Output<String> restApiId() {
        return this.restApiId;
    }
    /**
     * Configures the stage that API Gateway creates with this deployment.
     * 
     */
    @Export(name="stageDescription", type=DeploymentStageDescription.class, parameters={})
    private Output</* @Nullable */ DeploymentStageDescription> stageDescription;

    /**
     * @return Configures the stage that API Gateway creates with this deployment.
     * 
     */
    public Output<Optional<DeploymentStageDescription>> stageDescription() {
        return Codegen.optional(this.stageDescription);
    }
    /**
     * A name for the stage that API Gateway creates with this deployment. Use only alphanumeric characters.
     * 
     */
    @Export(name="stageName", type=String.class, parameters={})
    private Output</* @Nullable */ String> stageName;

    /**
     * @return A name for the stage that API Gateway creates with this deployment. Use only alphanumeric characters.
     * 
     */
    public Output<Optional<String>> stageName() {
        return Codegen.optional(this.stageName);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Deployment(String name) {
        this(name, DeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Deployment(String name, DeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Deployment(String name, DeploymentArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:apigateway:Deployment", name, args == null ? DeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Deployment(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:apigateway:Deployment", name, null, makeResourceOptions(options, id));
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
    public static Deployment get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Deployment(name, id, options);
    }
}
