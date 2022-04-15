// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.dataproc.WorkflowTemplateArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateState;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateJob;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateParameter;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacement;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A Workflow Template is a reusable workflow configuration. It defines a graph of jobs with information on where to run those jobs.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * WorkflowTemplate can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/workflowTemplate:WorkflowTemplate default projects/{{project}}/locations/{{location}}/workflowTemplates/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/workflowTemplate:WorkflowTemplate default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/workflowTemplate:WorkflowTemplate default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:dataproc/workflowTemplate:WorkflowTemplate")
public class WorkflowTemplate extends io.pulumi.resources.CustomResource {
    /**
     * Output only. The time template was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Output only. The time template was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * (Beta only) Optional. Timeout duration for the DAG of jobs. You can use "s", "m", "h", and "d" suffixes for second, minute, hour, and day duration values, respectively. The timeout duration must be from 10 minutes ("10m") to 24 hours ("24h" or "1d"). The timer begins when the first job is submitted. If the workflow is running at the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running on a (/dataproc/docs/concepts/workflows/using-workflows#configuring_or_selecting_a_cluster), the cluster is deleted.
     * 
     */
    @Export(name="dagTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> dagTimeout;

    /**
     * @return (Beta only) Optional. Timeout duration for the DAG of jobs. You can use "s", "m", "h", and "d" suffixes for second, minute, hour, and day duration values, respectively. The timeout duration must be from 10 minutes ("10m") to 24 hours ("24h" or "1d"). The timer begins when the first job is submitted. If the workflow is running at the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running on a (/dataproc/docs/concepts/workflows/using-workflows#configuring_or_selecting_a_cluster), the cluster is deleted.
     * 
     */
    public Output</* @Nullable */ String> dagTimeout() {
        return this.dagTimeout;
    }
    /**
     * Required. The Directed Acyclic Graph of Jobs to submit.
     * 
     */
    @Export(name="jobs", type=List.class, parameters={WorkflowTemplateJob.class})
    private Output<List<WorkflowTemplateJob>> jobs;

    /**
     * @return Required. The Directed Acyclic Graph of Jobs to submit.
     * 
     */
    public Output<List<WorkflowTemplateJob>> jobs() {
        return this.jobs;
    }
    /**
     * Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The location for the resource
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Required. Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Required. Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
     * 
     */
    @Export(name="parameters", type=List.class, parameters={WorkflowTemplateParameter.class})
    private Output</* @Nullable */ List<WorkflowTemplateParameter>> parameters;

    /**
     * @return Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
     * 
     */
    public Output</* @Nullable */ List<WorkflowTemplateParameter>> parameters() {
        return this.parameters;
    }
    /**
     * Required. WorkflowTemplate scheduling information.
     * 
     */
    @Export(name="placement", type=WorkflowTemplatePlacement.class, parameters={})
    private Output<WorkflowTemplatePlacement> placement;

    /**
     * @return Required. WorkflowTemplate scheduling information.
     * 
     */
    public Output<WorkflowTemplatePlacement> placement() {
        return this.placement;
    }
    /**
     * The project for the resource
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Output only. The time template was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Output only. The time template was last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * Optional. Used to perform a consistent read-modify-write. This field should be left blank for a `CreateWorkflowTemplate` request. It is required for an `UpdateWorkflowTemplate` request, and must match the current server version. A typical update template flow would fetch the current template with a `GetWorkflowTemplate` request, which will return the current template with the `version` field filled in with the current server version. The user updates other fields in the template, then returns it as part of the `UpdateWorkflowTemplate` request.
     * 
     * @Deprecated
     * version is not useful as a configurable field, and will be removed in the future.
     * 
     */
    @Deprecated /* version is not useful as a configurable field, and will be removed in the future. */
    @Export(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    /**
     * @return Optional. Used to perform a consistent read-modify-write. This field should be left blank for a `CreateWorkflowTemplate` request. It is required for an `UpdateWorkflowTemplate` request, and must match the current server version. A typical update template flow would fetch the current template with a `GetWorkflowTemplate` request, which will return the current template with the `version` field filled in with the current server version. The user updates other fields in the template, then returns it as part of the `UpdateWorkflowTemplate` request.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkflowTemplate(String name) {
        this(name, WorkflowTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkflowTemplate(String name, WorkflowTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkflowTemplate(String name, WorkflowTemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/workflowTemplate:WorkflowTemplate", name, args == null ? WorkflowTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkflowTemplate(String name, Output<String> id, @Nullable WorkflowTemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/workflowTemplate:WorkflowTemplate", name, state, makeResourceOptions(options, id));
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
    public static WorkflowTemplate get(String name, Output<String> id, @Nullable WorkflowTemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkflowTemplate(name, id, state, options);
    }
}
