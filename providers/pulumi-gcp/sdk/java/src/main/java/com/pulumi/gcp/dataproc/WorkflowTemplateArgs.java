// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterArgs;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplateArgs extends ResourceArgs {

    public static final WorkflowTemplateArgs Empty = new WorkflowTemplateArgs();

    /**
     * (Beta only) Optional. Timeout duration for the DAG of jobs. You can use &#34;s&#34;, &#34;m&#34;, &#34;h&#34;, and &#34;d&#34; suffixes for second, minute, hour, and day duration values, respectively. The timeout duration must be from 10 minutes (&#34;10m&#34;) to 24 hours (&#34;24h&#34; or &#34;1d&#34;). The timer begins when the first job is submitted. If the workflow is running at the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running on a (/dataproc/docs/concepts/workflows/using-workflows#configuring_or_selecting_a_cluster), the cluster is deleted.
     * 
     */
    @Import(name="dagTimeout")
    private @Nullable Output<String> dagTimeout;

    /**
     * @return (Beta only) Optional. Timeout duration for the DAG of jobs. You can use &#34;s&#34;, &#34;m&#34;, &#34;h&#34;, and &#34;d&#34; suffixes for second, minute, hour, and day duration values, respectively. The timeout duration must be from 10 minutes (&#34;10m&#34;) to 24 hours (&#34;24h&#34; or &#34;1d&#34;). The timer begins when the first job is submitted. If the workflow is running at the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running on a (/dataproc/docs/concepts/workflows/using-workflows#configuring_or_selecting_a_cluster), the cluster is deleted.
     * 
     */
    public Optional<Output<String>> dagTimeout() {
        return Optional.ofNullable(this.dagTimeout);
    }

    /**
     * Required. The Directed Acyclic Graph of Jobs to submit.
     * 
     */
    @Import(name="jobs", required=true)
    private Output<List<WorkflowTemplateJobArgs>> jobs;

    /**
     * @return Required. The Directed Acyclic Graph of Jobs to submit.
     * 
     */
    public Output<List<WorkflowTemplateJobArgs>> jobs() {
        return this.jobs;
    }

    /**
     * Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location", required=true)
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
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Required. Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<WorkflowTemplateParameterArgs>> parameters;

    /**
     * @return Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
     * 
     */
    public Optional<Output<List<WorkflowTemplateParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Required. WorkflowTemplate scheduling information.
     * 
     */
    @Import(name="placement", required=true)
    private Output<WorkflowTemplatePlacementArgs> placement;

    /**
     * @return Required. WorkflowTemplate scheduling information.
     * 
     */
    public Output<WorkflowTemplatePlacementArgs> placement() {
        return this.placement;
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Optional. Used to perform a consistent read-modify-write. This field should be left blank for a `CreateWorkflowTemplate` request. It is required for an `UpdateWorkflowTemplate` request, and must match the current server version. A typical update template flow would fetch the current template with a `GetWorkflowTemplate` request, which will return the current template with the `version` field filled in with the current server version. The user updates other fields in the template, then returns it as part of the `UpdateWorkflowTemplate` request.
     * 
     * @deprecated
     * version is not useful as a configurable field, and will be removed in the future.
     * 
     */
    @Deprecated /* version is not useful as a configurable field, and will be removed in the future. */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return Optional. Used to perform a consistent read-modify-write. This field should be left blank for a `CreateWorkflowTemplate` request. It is required for an `UpdateWorkflowTemplate` request, and must match the current server version. A typical update template flow would fetch the current template with a `GetWorkflowTemplate` request, which will return the current template with the `version` field filled in with the current server version. The user updates other fields in the template, then returns it as part of the `UpdateWorkflowTemplate` request.
     * 
     * @deprecated
     * version is not useful as a configurable field, and will be removed in the future.
     * 
     */
    @Deprecated /* version is not useful as a configurable field, and will be removed in the future. */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private WorkflowTemplateArgs() {}

    private WorkflowTemplateArgs(WorkflowTemplateArgs $) {
        this.dagTimeout = $.dagTimeout;
        this.jobs = $.jobs;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.parameters = $.parameters;
        this.placement = $.placement;
        this.project = $.project;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplateArgs $;

        public Builder() {
            $ = new WorkflowTemplateArgs();
        }

        public Builder(WorkflowTemplateArgs defaults) {
            $ = new WorkflowTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dagTimeout (Beta only) Optional. Timeout duration for the DAG of jobs. You can use &#34;s&#34;, &#34;m&#34;, &#34;h&#34;, and &#34;d&#34; suffixes for second, minute, hour, and day duration values, respectively. The timeout duration must be from 10 minutes (&#34;10m&#34;) to 24 hours (&#34;24h&#34; or &#34;1d&#34;). The timer begins when the first job is submitted. If the workflow is running at the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running on a (/dataproc/docs/concepts/workflows/using-workflows#configuring_or_selecting_a_cluster), the cluster is deleted.
         * 
         * @return builder
         * 
         */
        public Builder dagTimeout(@Nullable Output<String> dagTimeout) {
            $.dagTimeout = dagTimeout;
            return this;
        }

        /**
         * @param dagTimeout (Beta only) Optional. Timeout duration for the DAG of jobs. You can use &#34;s&#34;, &#34;m&#34;, &#34;h&#34;, and &#34;d&#34; suffixes for second, minute, hour, and day duration values, respectively. The timeout duration must be from 10 minutes (&#34;10m&#34;) to 24 hours (&#34;24h&#34; or &#34;1d&#34;). The timer begins when the first job is submitted. If the workflow is running at the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running on a (/dataproc/docs/concepts/workflows/using-workflows#configuring_or_selecting_a_cluster), the cluster is deleted.
         * 
         * @return builder
         * 
         */
        public Builder dagTimeout(String dagTimeout) {
            return dagTimeout(Output.of(dagTimeout));
        }

        /**
         * @param jobs Required. The Directed Acyclic Graph of Jobs to submit.
         * 
         * @return builder
         * 
         */
        public Builder jobs(Output<List<WorkflowTemplateJobArgs>> jobs) {
            $.jobs = jobs;
            return this;
        }

        /**
         * @param jobs Required. The Directed Acyclic Graph of Jobs to submit.
         * 
         * @return builder
         * 
         */
        public Builder jobs(List<WorkflowTemplateJobArgs> jobs) {
            return jobs(Output.of(jobs));
        }

        /**
         * @param jobs Required. The Directed Acyclic Graph of Jobs to submit.
         * 
         * @return builder
         * 
         */
        public Builder jobs(WorkflowTemplateJobArgs... jobs) {
            return jobs(List.of(jobs));
        }

        /**
         * @param labels Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Required. Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Required. Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<WorkflowTemplateParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<WorkflowTemplateParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
         * 
         * @return builder
         * 
         */
        public Builder parameters(WorkflowTemplateParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param placement Required. WorkflowTemplate scheduling information.
         * 
         * @return builder
         * 
         */
        public Builder placement(Output<WorkflowTemplatePlacementArgs> placement) {
            $.placement = placement;
            return this;
        }

        /**
         * @param placement Required. WorkflowTemplate scheduling information.
         * 
         * @return builder
         * 
         */
        public Builder placement(WorkflowTemplatePlacementArgs placement) {
            return placement(Output.of(placement));
        }

        /**
         * @param project The project for the resource
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project for the resource
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param version Optional. Used to perform a consistent read-modify-write. This field should be left blank for a `CreateWorkflowTemplate` request. It is required for an `UpdateWorkflowTemplate` request, and must match the current server version. A typical update template flow would fetch the current template with a `GetWorkflowTemplate` request, which will return the current template with the `version` field filled in with the current server version. The user updates other fields in the template, then returns it as part of the `UpdateWorkflowTemplate` request.
         * 
         * @return builder
         * 
         * @deprecated
         * version is not useful as a configurable field, and will be removed in the future.
         * 
         */
        @Deprecated /* version is not useful as a configurable field, and will be removed in the future. */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Optional. Used to perform a consistent read-modify-write. This field should be left blank for a `CreateWorkflowTemplate` request. It is required for an `UpdateWorkflowTemplate` request, and must match the current server version. A typical update template flow would fetch the current template with a `GetWorkflowTemplate` request, which will return the current template with the `version` field filled in with the current server version. The user updates other fields in the template, then returns it as part of the `UpdateWorkflowTemplate` request.
         * 
         * @return builder
         * 
         * @deprecated
         * version is not useful as a configurable field, and will be removed in the future.
         * 
         */
        @Deprecated /* version is not useful as a configurable field, and will be removed in the future. */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public WorkflowTemplateArgs build() {
            $.jobs = Objects.requireNonNull($.jobs, "expected parameter 'jobs' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.placement = Objects.requireNonNull($.placement, "expected parameter 'placement' to be non-null");
            return $;
        }
    }

}
