// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.transfer;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.transfer.WorkflowArgs;
import com.pulumi.awsnative.transfer.outputs.WorkflowStep;
import com.pulumi.awsnative.transfer.outputs.WorkflowTag;
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
 * Resource Type definition for AWS::Transfer::Workflow
 * 
 */
@ResourceType(type="aws-native:transfer:Workflow")
public class Workflow extends CustomResource {
    /**
     * Specifies the unique Amazon Resource Name (ARN) for the workflow.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Specifies the unique Amazon Resource Name (ARN) for the workflow.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A textual description for the workflow.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A textual description for the workflow.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies the steps (actions) to take if any errors are encountered during execution of the workflow.
     * 
     */
    @Export(name="onExceptionSteps", type=List.class, parameters={WorkflowStep.class})
    private Output</* @Nullable */ List<WorkflowStep>> onExceptionSteps;

    /**
     * @return Specifies the steps (actions) to take if any errors are encountered during execution of the workflow.
     * 
     */
    public Output<Optional<List<WorkflowStep>>> onExceptionSteps() {
        return Codegen.optional(this.onExceptionSteps);
    }
    /**
     * Specifies the details for the steps that are in the specified workflow.
     * 
     */
    @Export(name="steps", type=List.class, parameters={WorkflowStep.class})
    private Output<List<WorkflowStep>> steps;

    /**
     * @return Specifies the details for the steps that are in the specified workflow.
     * 
     */
    public Output<List<WorkflowStep>> steps() {
        return this.steps;
    }
    /**
     * Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to workflows for any purpose.
     * 
     */
    @Export(name="tags", type=List.class, parameters={WorkflowTag.class})
    private Output</* @Nullable */ List<WorkflowTag>> tags;

    /**
     * @return Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to workflows for any purpose.
     * 
     */
    public Output<Optional<List<WorkflowTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A unique identifier for the workflow.
     * 
     */
    @Export(name="workflowId", type=String.class, parameters={})
    private Output<String> workflowId;

    /**
     * @return A unique identifier for the workflow.
     * 
     */
    public Output<String> workflowId() {
        return this.workflowId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Workflow(String name) {
        this(name, WorkflowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workflow(String name, WorkflowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workflow(String name, WorkflowArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:transfer:Workflow", name, args == null ? WorkflowArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Workflow(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:transfer:Workflow", name, null, makeResourceOptions(options, id));
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
    public static Workflow get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Workflow(name, id, options);
    }
}
