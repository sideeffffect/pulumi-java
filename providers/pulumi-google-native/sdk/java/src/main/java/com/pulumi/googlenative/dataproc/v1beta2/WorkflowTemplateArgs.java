// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc.v1beta2.inputs.OrderedJobArgs;
import com.pulumi.googlenative.dataproc.v1beta2.inputs.TemplateParameterArgs;
import com.pulumi.googlenative.dataproc.v1beta2.inputs.WorkflowTemplatePlacementArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateArgs Empty = new WorkflowTemplateArgs();

    /**
     * Optional. Timeout duration for the DAG of jobs, expressed in seconds (see JSON representation of duration (https://developers.google.com/protocol-buffers/docs/proto3#json)). The timeout duration must be from 10 minutes (&#34;600s&#34;) to 24 hours (&#34;86400s&#34;). The timer begins when the first job is submitted. If the workflow is running at the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running on a managed cluster, the cluster is deleted.
     * 
     */
    @Import(name="dagTimeout")
    private @Nullable Output<String> dagTimeout;

    /**
     * @return Optional. Timeout duration for the DAG of jobs, expressed in seconds (see JSON representation of duration (https://developers.google.com/protocol-buffers/docs/proto3#json)). The timeout duration must be from 10 minutes (&#34;600s&#34;) to 24 hours (&#34;86400s&#34;). The timer begins when the first job is submitted. If the workflow is running at the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running on a managed cluster, the cluster is deleted.
     * 
     */
    public Optional<Output<String>> dagTimeout() {
        return Optional.ofNullable(this.dagTimeout);
    }

    /**
     * The template id.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters..
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The template id.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters..
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The Directed Acyclic Graph of Jobs to submit.
     * 
     */
    @Import(name="jobs", required=true)
    private Output<List<OrderedJobArgs>> jobs;

    /**
     * @return The Directed Acyclic Graph of Jobs to submit.
     * 
     */
    public Output<List<OrderedJobArgs>> jobs() {
        return this.jobs;
    }

    /**
     * Optional. The labels to associate with this template. These labels will be propagated to all jobs and clusters created by the workflow instance.Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).No more than 32 labels can be associated with a template.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. The labels to associate with this template. These labels will be propagated to all jobs and clusters created by the workflow instance.Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).No more than 32 labels can be associated with a template.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<TemplateParameterArgs>> parameters;

    /**
     * @return Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
     * 
     */
    public Optional<Output<List<TemplateParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * WorkflowTemplate scheduling information.
     * 
     */
    @Import(name="placement", required=true)
    private Output<WorkflowTemplatePlacementArgs> placement;

    /**
     * @return WorkflowTemplate scheduling information.
     * 
     */
    public Output<WorkflowTemplatePlacementArgs> placement() {
        return this.placement;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Optional. Used to perform a consistent read-modify-write.This field should be left blank for a CreateWorkflowTemplate request. It is required for an UpdateWorkflowTemplate request, and must match the current server version. A typical update template flow would fetch the current template with a GetWorkflowTemplate request, which will return the current template with the version field filled in with the current server version. The user updates other fields in the template, then returns it as part of the UpdateWorkflowTemplate request.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return Optional. Used to perform a consistent read-modify-write.This field should be left blank for a CreateWorkflowTemplate request. It is required for an UpdateWorkflowTemplate request, and must match the current server version. A typical update template flow would fetch the current template with a GetWorkflowTemplate request, which will return the current template with the version field filled in with the current server version. The user updates other fields in the template, then returns it as part of the UpdateWorkflowTemplate request.
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private WorkflowTemplateArgs() {}

    private WorkflowTemplateArgs(WorkflowTemplateArgs $) {
        this.dagTimeout = $.dagTimeout;
        this.id = $.id;
        this.jobs = $.jobs;
        this.labels = $.labels;
        this.location = $.location;
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
         * @param dagTimeout Optional. Timeout duration for the DAG of jobs, expressed in seconds (see JSON representation of duration (https://developers.google.com/protocol-buffers/docs/proto3#json)). The timeout duration must be from 10 minutes (&#34;600s&#34;) to 24 hours (&#34;86400s&#34;). The timer begins when the first job is submitted. If the workflow is running at the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running on a managed cluster, the cluster is deleted.
         * 
         * @return builder
         * 
         */
        public Builder dagTimeout(@Nullable Output<String> dagTimeout) {
            $.dagTimeout = dagTimeout;
            return this;
        }

        /**
         * @param dagTimeout Optional. Timeout duration for the DAG of jobs, expressed in seconds (see JSON representation of duration (https://developers.google.com/protocol-buffers/docs/proto3#json)). The timeout duration must be from 10 minutes (&#34;600s&#34;) to 24 hours (&#34;86400s&#34;). The timer begins when the first job is submitted. If the workflow is running at the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running on a managed cluster, the cluster is deleted.
         * 
         * @return builder
         * 
         */
        public Builder dagTimeout(String dagTimeout) {
            return dagTimeout(Output.of(dagTimeout));
        }

        /**
         * @param id The template id.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters..
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The template id.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters..
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param jobs The Directed Acyclic Graph of Jobs to submit.
         * 
         * @return builder
         * 
         */
        public Builder jobs(Output<List<OrderedJobArgs>> jobs) {
            $.jobs = jobs;
            return this;
        }

        /**
         * @param jobs The Directed Acyclic Graph of Jobs to submit.
         * 
         * @return builder
         * 
         */
        public Builder jobs(List<OrderedJobArgs> jobs) {
            return jobs(Output.of(jobs));
        }

        /**
         * @param jobs The Directed Acyclic Graph of Jobs to submit.
         * 
         * @return builder
         * 
         */
        public Builder jobs(OrderedJobArgs... jobs) {
            return jobs(List.of(jobs));
        }

        /**
         * @param labels Optional. The labels to associate with this template. These labels will be propagated to all jobs and clusters created by the workflow instance.Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).No more than 32 labels can be associated with a template.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. The labels to associate with this template. These labels will be propagated to all jobs and clusters created by the workflow instance.Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).No more than 32 labels can be associated with a template.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param parameters Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<TemplateParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<TemplateParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
         * 
         * @return builder
         * 
         */
        public Builder parameters(TemplateParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param placement WorkflowTemplate scheduling information.
         * 
         * @return builder
         * 
         */
        public Builder placement(Output<WorkflowTemplatePlacementArgs> placement) {
            $.placement = placement;
            return this;
        }

        /**
         * @param placement WorkflowTemplate scheduling information.
         * 
         * @return builder
         * 
         */
        public Builder placement(WorkflowTemplatePlacementArgs placement) {
            return placement(Output.of(placement));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param version Optional. Used to perform a consistent read-modify-write.This field should be left blank for a CreateWorkflowTemplate request. It is required for an UpdateWorkflowTemplate request, and must match the current server version. A typical update template flow would fetch the current template with a GetWorkflowTemplate request, which will return the current template with the version field filled in with the current server version. The user updates other fields in the template, then returns it as part of the UpdateWorkflowTemplate request.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Optional. Used to perform a consistent read-modify-write.This field should be left blank for a CreateWorkflowTemplate request. It is required for an UpdateWorkflowTemplate request, and must match the current server version. A typical update template flow would fetch the current template with a GetWorkflowTemplate request, which will return the current template with the version field filled in with the current server version. The user updates other fields in the template, then returns it as part of the UpdateWorkflowTemplate request.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public WorkflowTemplateArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.jobs = Objects.requireNonNull($.jobs, "expected parameter 'jobs' to be non-null");
            $.placement = Objects.requireNonNull($.placement, "expected parameter 'placement' to be non-null");
            return $;
        }
    }

}
