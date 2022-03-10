// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.OrderedJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.TemplateParameterResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.WorkflowTemplatePlacementResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetWorkflowTemplateResult {
    /**
     * The time template was created.
     * 
     */
    private final String createTime;
    /**
     * Optional. Timeout duration for the DAG of jobs, expressed in seconds (see JSON representation of duration (https://developers.google.com/protocol-buffers/docs/proto3#json)). The timeout duration must be from 10 minutes ("600s") to 24 hours ("86400s"). The timer begins when the first job is submitted. If the workflow is running at the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running on a managed cluster, the cluster is deleted.
     * 
     */
    private final String dagTimeout;
    /**
     * The Directed Acyclic Graph of Jobs to submit.
     * 
     */
    private final List<OrderedJobResponse> jobs;
    /**
     * Optional. The labels to associate with this template. These labels will be propagated to all jobs and clusters created by the workflow instance.Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).No more than 32 labels can be associated with a template.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource name of the workflow template, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates, the resource name of the template has the following format: projects/{project_id}/regions/{region}/workflowTemplates/{template_id} For projects.locations.workflowTemplates, the resource name of the template has the following format: projects/{project_id}/locations/{location}/workflowTemplates/{template_id}
     * 
     */
    private final String name;
    /**
     * Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
     * 
     */
    private final List<TemplateParameterResponse> parameters;
    /**
     * WorkflowTemplate scheduling information.
     * 
     */
    private final WorkflowTemplatePlacementResponse placement;
    /**
     * The time template was last updated.
     * 
     */
    private final String updateTime;
    /**
     * Optional. Used to perform a consistent read-modify-write.This field should be left blank for a CreateWorkflowTemplate request. It is required for an UpdateWorkflowTemplate request, and must match the current server version. A typical update template flow would fetch the current template with a GetWorkflowTemplate request, which will return the current template with the version field filled in with the current server version. The user updates other fields in the template, then returns it as part of the UpdateWorkflowTemplate request.
     * 
     */
    private final Integer version;

    @OutputCustomType.Constructor
    private GetWorkflowTemplateResult(
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("dagTimeout") String dagTimeout,
        @OutputCustomType.Parameter("jobs") List<OrderedJobResponse> jobs,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("parameters") List<TemplateParameterResponse> parameters,
        @OutputCustomType.Parameter("placement") WorkflowTemplatePlacementResponse placement,
        @OutputCustomType.Parameter("updateTime") String updateTime,
        @OutputCustomType.Parameter("version") Integer version) {
        this.createTime = createTime;
        this.dagTimeout = dagTimeout;
        this.jobs = jobs;
        this.labels = labels;
        this.name = name;
        this.parameters = parameters;
        this.placement = placement;
        this.updateTime = updateTime;
        this.version = version;
    }

    /**
     * The time template was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. Timeout duration for the DAG of jobs, expressed in seconds (see JSON representation of duration (https://developers.google.com/protocol-buffers/docs/proto3#json)). The timeout duration must be from 10 minutes ("600s") to 24 hours ("86400s"). The timer begins when the first job is submitted. If the workflow is running at the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running on a managed cluster, the cluster is deleted.
     * 
    */
    public String getDagTimeout() {
        return this.dagTimeout;
    }
    /**
     * The Directed Acyclic Graph of Jobs to submit.
     * 
    */
    public List<OrderedJobResponse> getJobs() {
        return this.jobs;
    }
    /**
     * Optional. The labels to associate with this template. These labels will be propagated to all jobs and clusters created by the workflow instance.Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).No more than 32 labels can be associated with a template.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The resource name of the workflow template, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates, the resource name of the template has the following format: projects/{project_id}/regions/{region}/workflowTemplates/{template_id} For projects.locations.workflowTemplates, the resource name of the template has the following format: projects/{project_id}/locations/{location}/workflowTemplates/{template_id}
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
     * 
    */
    public List<TemplateParameterResponse> getParameters() {
        return this.parameters;
    }
    /**
     * WorkflowTemplate scheduling information.
     * 
    */
    public WorkflowTemplatePlacementResponse getPlacement() {
        return this.placement;
    }
    /**
     * The time template was last updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Optional. Used to perform a consistent read-modify-write.This field should be left blank for a CreateWorkflowTemplate request. It is required for an UpdateWorkflowTemplate request, and must match the current server version. A typical update template flow would fetch the current template with a GetWorkflowTemplate request, which will return the current template with the version field filled in with the current server version. The user updates other fields in the template, then returns it as part of the UpdateWorkflowTemplate request.
     * 
    */
    public Integer getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkflowTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String dagTimeout;
        private List<OrderedJobResponse> jobs;
        private Map<String,String> labels;
        private String name;
        private List<TemplateParameterResponse> parameters;
        private WorkflowTemplatePlacementResponse placement;
        private String updateTime;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkflowTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.dagTimeout = defaults.dagTimeout;
    	      this.jobs = defaults.jobs;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.placement = defaults.placement;
    	      this.updateTime = defaults.updateTime;
    	      this.version = defaults.version;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder dagTimeout(String dagTimeout) {
            this.dagTimeout = Objects.requireNonNull(dagTimeout);
            return this;
        }

        public Builder jobs(List<OrderedJobResponse> jobs) {
            this.jobs = Objects.requireNonNull(jobs);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder parameters(List<TemplateParameterResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder placement(WorkflowTemplatePlacementResponse placement) {
            this.placement = Objects.requireNonNull(placement);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetWorkflowTemplateResult build() {
            return new GetWorkflowTemplateResult(createTime, dagTimeout, jobs, labels, name, parameters, placement, updateTime, version);
        }
    }
}
