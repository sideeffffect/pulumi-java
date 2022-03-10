// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataflow_v1b3.enums.JobCurrentState;
import io.pulumi.googlenative.dataflow_v1b3.enums.JobRequestedState;
import io.pulumi.googlenative.dataflow_v1b3.enums.JobType;
import io.pulumi.googlenative.dataflow_v1b3.inputs.EnvironmentArgs;
import io.pulumi.googlenative.dataflow_v1b3.inputs.ExecutionStageStateArgs;
import io.pulumi.googlenative.dataflow_v1b3.inputs.JobMetadataArgs;
import io.pulumi.googlenative.dataflow_v1b3.inputs.PipelineDescriptionArgs;
import io.pulumi.googlenative.dataflow_v1b3.inputs.StepArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * The client's unique identifier of the job, re-used across retried attempts. If this field is set, the service will ensure its uniqueness. The request to create a job will fail if the service has knowledge of a previously submitted job with the same client's ID and job name. The caller may use this field to ensure idempotence of job creation across retried attempts to create a job. By default, the field is empty and, in that case, the service ignores it.
     * 
     */
    @InputImport(name="clientRequestId")
      private final @Nullable Input<String> clientRequestId;

    public Input<String> getClientRequestId() {
        return this.clientRequestId == null ? Input.empty() : this.clientRequestId;
    }

    /**
     * The timestamp when the job was initially created. Immutable and set by the Cloud Dataflow service.
     * 
     */
    @InputImport(name="createTime")
      private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * If this is specified, the job's initial state is populated from the given snapshot.
     * 
     */
    @InputImport(name="createdFromSnapshotId")
      private final @Nullable Input<String> createdFromSnapshotId;

    public Input<String> getCreatedFromSnapshotId() {
        return this.createdFromSnapshotId == null ? Input.empty() : this.createdFromSnapshotId;
    }

    /**
     * The current state of the job. Jobs are created in the `JOB_STATE_STOPPED` state unless otherwise specified. A job in the `JOB_STATE_RUNNING` state may asynchronously enter a terminal state. After a job has reached a terminal state, no further state updates may be made. This field may be mutated by the Cloud Dataflow service; callers cannot mutate it.
     * 
     */
    @InputImport(name="currentState")
      private final @Nullable Input<JobCurrentState> currentState;

    public Input<JobCurrentState> getCurrentState() {
        return this.currentState == null ? Input.empty() : this.currentState;
    }

    /**
     * The timestamp associated with the current state.
     * 
     */
    @InputImport(name="currentStateTime")
      private final @Nullable Input<String> currentStateTime;

    public Input<String> getCurrentStateTime() {
        return this.currentStateTime == null ? Input.empty() : this.currentStateTime;
    }

    /**
     * The environment for the job.
     * 
     */
    @InputImport(name="environment")
      private final @Nullable Input<EnvironmentArgs> environment;

    public Input<EnvironmentArgs> getEnvironment() {
        return this.environment == null ? Input.empty() : this.environment;
    }

    /**
     * The unique ID of this job. This field is set by the Cloud Dataflow service when the Job is created, and is immutable for the life of the job.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * This field is populated by the Dataflow service to support filtering jobs by the metadata values provided here. Populated for ListJobs and all GetJob views SUMMARY and higher.
     * 
     */
    @InputImport(name="jobMetadata")
      private final @Nullable Input<JobMetadataArgs> jobMetadata;

    public Input<JobMetadataArgs> getJobMetadata() {
        return this.jobMetadata == null ? Input.empty() : this.jobMetadata;
    }

    /**
     * User-defined labels for this job. The labels map can contain no more than 64 entries. Entries of the labels map are UTF8 strings that comply with the following restrictions: * Keys must conform to regexp: \p{Ll}\p{Lo}{0,62} * Values must conform to regexp: [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally constrained to be <= 128 bytes in size.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The user-specified Cloud Dataflow job name. Only one Job with a given name may exist in a project at any given time. If a caller attempts to create a Job with the same name as an already-existing Job, the attempt returns the existing Job. The name must match the regular expression `[a-z]([-a-z0-9]{0,38}[a-z0-9])?`
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Preliminary field: The format of this data may change at any time. A description of the user pipeline and stages through which it is executed. Created by Cloud Dataflow service. Only retrieved with JOB_VIEW_DESCRIPTION or JOB_VIEW_ALL.
     * 
     */
    @InputImport(name="pipelineDescription")
      private final @Nullable Input<PipelineDescriptionArgs> pipelineDescription;

    public Input<PipelineDescriptionArgs> getPipelineDescription() {
        return this.pipelineDescription == null ? Input.empty() : this.pipelineDescription;
    }

    /**
     * The ID of the Cloud Platform project that the job belongs to.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * If this job is an update of an existing job, this field is the job ID of the job it replaced. When sending a `CreateJobRequest`, you can update a job by specifying it here. The job named here is stopped, and its intermediate state is transferred to this job.
     * 
     */
    @InputImport(name="replaceJobId")
      private final @Nullable Input<String> replaceJobId;

    public Input<String> getReplaceJobId() {
        return this.replaceJobId == null ? Input.empty() : this.replaceJobId;
    }

    /**
     * If another job is an update of this job (and thus, this job is in `JOB_STATE_UPDATED`), this field contains the ID of that job.
     * 
     */
    @InputImport(name="replacedByJobId")
      private final @Nullable Input<String> replacedByJobId;

    public Input<String> getReplacedByJobId() {
        return this.replacedByJobId == null ? Input.empty() : this.replacedByJobId;
    }

    /**
     * The job's requested state. `UpdateJob` may be used to switch between the `JOB_STATE_STOPPED` and `JOB_STATE_RUNNING` states, by setting requested_state. `UpdateJob` may also be used to directly set a job's requested state to `JOB_STATE_CANCELLED` or `JOB_STATE_DONE`, irrevocably terminating the job if it has not already reached a terminal state.
     * 
     */
    @InputImport(name="requestedState")
      private final @Nullable Input<JobRequestedState> requestedState;

    public Input<JobRequestedState> getRequestedState() {
        return this.requestedState == null ? Input.empty() : this.requestedState;
    }

    /**
     * Reserved for future use. This field is set only in responses from the server; it is ignored if it is set in any requests.
     * 
     */
    @InputImport(name="satisfiesPzs")
      private final @Nullable Input<Boolean> satisfiesPzs;

    public Input<Boolean> getSatisfiesPzs() {
        return this.satisfiesPzs == null ? Input.empty() : this.satisfiesPzs;
    }

    /**
     * This field may be mutated by the Cloud Dataflow service; callers cannot mutate it.
     * 
     */
    @InputImport(name="stageStates")
      private final @Nullable Input<List<ExecutionStageStateArgs>> stageStates;

    public Input<List<ExecutionStageStateArgs>> getStageStates() {
        return this.stageStates == null ? Input.empty() : this.stageStates;
    }

    /**
     * The timestamp when the job was started (transitioned to JOB_STATE_PENDING). Flexible resource scheduling jobs are started with some delay after job creation, so start_time is unset before start and is updated when the job is started by the Cloud Dataflow service. For other jobs, start_time always equals to create_time and is immutable and set by the Cloud Dataflow service.
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * Exactly one of step or steps_location should be specified. The top-level steps that constitute the entire job. Only retrieved with JOB_VIEW_ALL.
     * 
     */
    @InputImport(name="steps")
      private final @Nullable Input<List<StepArgs>> steps;

    public Input<List<StepArgs>> getSteps() {
        return this.steps == null ? Input.empty() : this.steps;
    }

    /**
     * The Cloud Storage location where the steps are stored.
     * 
     */
    @InputImport(name="stepsLocation")
      private final @Nullable Input<String> stepsLocation;

    public Input<String> getStepsLocation() {
        return this.stepsLocation == null ? Input.empty() : this.stepsLocation;
    }

    /**
     * A set of files the system should be aware of that are used for temporary storage. These temporary files will be removed on job completion. No duplicates are allowed. No file patterns are supported. The supported files are: Google Cloud Storage: storage.googleapis.com/{bucket}/{object} bucket.storage.googleapis.com/{object}
     * 
     */
    @InputImport(name="tempFiles")
      private final @Nullable Input<List<String>> tempFiles;

    public Input<List<String>> getTempFiles() {
        return this.tempFiles == null ? Input.empty() : this.tempFiles;
    }

    /**
     * The map of transform name prefixes of the job to be replaced to the corresponding name prefixes of the new job.
     * 
     */
    @InputImport(name="transformNameMapping")
      private final @Nullable Input<Map<String,String>> transformNameMapping;

    public Input<Map<String,String>> getTransformNameMapping() {
        return this.transformNameMapping == null ? Input.empty() : this.transformNameMapping;
    }

    /**
     * The type of Cloud Dataflow job.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<JobType> type;

    public Input<JobType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="view")
      private final @Nullable Input<String> view;

    public Input<String> getView() {
        return this.view == null ? Input.empty() : this.view;
    }

    public JobArgs(
        @Nullable Input<String> clientRequestId,
        @Nullable Input<String> createTime,
        @Nullable Input<String> createdFromSnapshotId,
        @Nullable Input<JobCurrentState> currentState,
        @Nullable Input<String> currentStateTime,
        @Nullable Input<EnvironmentArgs> environment,
        @Nullable Input<String> id,
        @Nullable Input<JobMetadataArgs> jobMetadata,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<PipelineDescriptionArgs> pipelineDescription,
        @Nullable Input<String> project,
        @Nullable Input<String> replaceJobId,
        @Nullable Input<String> replacedByJobId,
        @Nullable Input<JobRequestedState> requestedState,
        @Nullable Input<Boolean> satisfiesPzs,
        @Nullable Input<List<ExecutionStageStateArgs>> stageStates,
        @Nullable Input<String> startTime,
        @Nullable Input<List<StepArgs>> steps,
        @Nullable Input<String> stepsLocation,
        @Nullable Input<List<String>> tempFiles,
        @Nullable Input<Map<String,String>> transformNameMapping,
        @Nullable Input<JobType> type,
        @Nullable Input<String> view) {
        this.clientRequestId = clientRequestId;
        this.createTime = createTime;
        this.createdFromSnapshotId = createdFromSnapshotId;
        this.currentState = currentState;
        this.currentStateTime = currentStateTime;
        this.environment = environment;
        this.id = id;
        this.jobMetadata = jobMetadata;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.pipelineDescription = pipelineDescription;
        this.project = project;
        this.replaceJobId = replaceJobId;
        this.replacedByJobId = replacedByJobId;
        this.requestedState = requestedState;
        this.satisfiesPzs = satisfiesPzs;
        this.stageStates = stageStates;
        this.startTime = startTime;
        this.steps = steps;
        this.stepsLocation = stepsLocation;
        this.tempFiles = tempFiles;
        this.transformNameMapping = transformNameMapping;
        this.type = type;
        this.view = view;
    }

    private JobArgs() {
        this.clientRequestId = Input.empty();
        this.createTime = Input.empty();
        this.createdFromSnapshotId = Input.empty();
        this.currentState = Input.empty();
        this.currentStateTime = Input.empty();
        this.environment = Input.empty();
        this.id = Input.empty();
        this.jobMetadata = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.pipelineDescription = Input.empty();
        this.project = Input.empty();
        this.replaceJobId = Input.empty();
        this.replacedByJobId = Input.empty();
        this.requestedState = Input.empty();
        this.satisfiesPzs = Input.empty();
        this.stageStates = Input.empty();
        this.startTime = Input.empty();
        this.steps = Input.empty();
        this.stepsLocation = Input.empty();
        this.tempFiles = Input.empty();
        this.transformNameMapping = Input.empty();
        this.type = Input.empty();
        this.view = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientRequestId;
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> createdFromSnapshotId;
        private @Nullable Input<JobCurrentState> currentState;
        private @Nullable Input<String> currentStateTime;
        private @Nullable Input<EnvironmentArgs> environment;
        private @Nullable Input<String> id;
        private @Nullable Input<JobMetadataArgs> jobMetadata;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<PipelineDescriptionArgs> pipelineDescription;
        private @Nullable Input<String> project;
        private @Nullable Input<String> replaceJobId;
        private @Nullable Input<String> replacedByJobId;
        private @Nullable Input<JobRequestedState> requestedState;
        private @Nullable Input<Boolean> satisfiesPzs;
        private @Nullable Input<List<ExecutionStageStateArgs>> stageStates;
        private @Nullable Input<String> startTime;
        private @Nullable Input<List<StepArgs>> steps;
        private @Nullable Input<String> stepsLocation;
        private @Nullable Input<List<String>> tempFiles;
        private @Nullable Input<Map<String,String>> transformNameMapping;
        private @Nullable Input<JobType> type;
        private @Nullable Input<String> view;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientRequestId = defaults.clientRequestId;
    	      this.createTime = defaults.createTime;
    	      this.createdFromSnapshotId = defaults.createdFromSnapshotId;
    	      this.currentState = defaults.currentState;
    	      this.currentStateTime = defaults.currentStateTime;
    	      this.environment = defaults.environment;
    	      this.id = defaults.id;
    	      this.jobMetadata = defaults.jobMetadata;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.pipelineDescription = defaults.pipelineDescription;
    	      this.project = defaults.project;
    	      this.replaceJobId = defaults.replaceJobId;
    	      this.replacedByJobId = defaults.replacedByJobId;
    	      this.requestedState = defaults.requestedState;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.stageStates = defaults.stageStates;
    	      this.startTime = defaults.startTime;
    	      this.steps = defaults.steps;
    	      this.stepsLocation = defaults.stepsLocation;
    	      this.tempFiles = defaults.tempFiles;
    	      this.transformNameMapping = defaults.transformNameMapping;
    	      this.type = defaults.type;
    	      this.view = defaults.view;
        }

        public Builder clientRequestId(@Nullable Input<String> clientRequestId) {
            this.clientRequestId = clientRequestId;
            return this;
        }

        public Builder clientRequestId(@Nullable String clientRequestId) {
            this.clientRequestId = Input.ofNullable(clientRequestId);
            return this;
        }

        public Builder createTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder createTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder createdFromSnapshotId(@Nullable Input<String> createdFromSnapshotId) {
            this.createdFromSnapshotId = createdFromSnapshotId;
            return this;
        }

        public Builder createdFromSnapshotId(@Nullable String createdFromSnapshotId) {
            this.createdFromSnapshotId = Input.ofNullable(createdFromSnapshotId);
            return this;
        }

        public Builder currentState(@Nullable Input<JobCurrentState> currentState) {
            this.currentState = currentState;
            return this;
        }

        public Builder currentState(@Nullable JobCurrentState currentState) {
            this.currentState = Input.ofNullable(currentState);
            return this;
        }

        public Builder currentStateTime(@Nullable Input<String> currentStateTime) {
            this.currentStateTime = currentStateTime;
            return this;
        }

        public Builder currentStateTime(@Nullable String currentStateTime) {
            this.currentStateTime = Input.ofNullable(currentStateTime);
            return this;
        }

        public Builder environment(@Nullable Input<EnvironmentArgs> environment) {
            this.environment = environment;
            return this;
        }

        public Builder environment(@Nullable EnvironmentArgs environment) {
            this.environment = Input.ofNullable(environment);
            return this;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder jobMetadata(@Nullable Input<JobMetadataArgs> jobMetadata) {
            this.jobMetadata = jobMetadata;
            return this;
        }

        public Builder jobMetadata(@Nullable JobMetadataArgs jobMetadata) {
            this.jobMetadata = Input.ofNullable(jobMetadata);
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder pipelineDescription(@Nullable Input<PipelineDescriptionArgs> pipelineDescription) {
            this.pipelineDescription = pipelineDescription;
            return this;
        }

        public Builder pipelineDescription(@Nullable PipelineDescriptionArgs pipelineDescription) {
            this.pipelineDescription = Input.ofNullable(pipelineDescription);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder replaceJobId(@Nullable Input<String> replaceJobId) {
            this.replaceJobId = replaceJobId;
            return this;
        }

        public Builder replaceJobId(@Nullable String replaceJobId) {
            this.replaceJobId = Input.ofNullable(replaceJobId);
            return this;
        }

        public Builder replacedByJobId(@Nullable Input<String> replacedByJobId) {
            this.replacedByJobId = replacedByJobId;
            return this;
        }

        public Builder replacedByJobId(@Nullable String replacedByJobId) {
            this.replacedByJobId = Input.ofNullable(replacedByJobId);
            return this;
        }

        public Builder requestedState(@Nullable Input<JobRequestedState> requestedState) {
            this.requestedState = requestedState;
            return this;
        }

        public Builder requestedState(@Nullable JobRequestedState requestedState) {
            this.requestedState = Input.ofNullable(requestedState);
            return this;
        }

        public Builder satisfiesPzs(@Nullable Input<Boolean> satisfiesPzs) {
            this.satisfiesPzs = satisfiesPzs;
            return this;
        }

        public Builder satisfiesPzs(@Nullable Boolean satisfiesPzs) {
            this.satisfiesPzs = Input.ofNullable(satisfiesPzs);
            return this;
        }

        public Builder stageStates(@Nullable Input<List<ExecutionStageStateArgs>> stageStates) {
            this.stageStates = stageStates;
            return this;
        }

        public Builder stageStates(@Nullable List<ExecutionStageStateArgs> stageStates) {
            this.stageStates = Input.ofNullable(stageStates);
            return this;
        }

        public Builder startTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder steps(@Nullable Input<List<StepArgs>> steps) {
            this.steps = steps;
            return this;
        }

        public Builder steps(@Nullable List<StepArgs> steps) {
            this.steps = Input.ofNullable(steps);
            return this;
        }

        public Builder stepsLocation(@Nullable Input<String> stepsLocation) {
            this.stepsLocation = stepsLocation;
            return this;
        }

        public Builder stepsLocation(@Nullable String stepsLocation) {
            this.stepsLocation = Input.ofNullable(stepsLocation);
            return this;
        }

        public Builder tempFiles(@Nullable Input<List<String>> tempFiles) {
            this.tempFiles = tempFiles;
            return this;
        }

        public Builder tempFiles(@Nullable List<String> tempFiles) {
            this.tempFiles = Input.ofNullable(tempFiles);
            return this;
        }

        public Builder transformNameMapping(@Nullable Input<Map<String,String>> transformNameMapping) {
            this.transformNameMapping = transformNameMapping;
            return this;
        }

        public Builder transformNameMapping(@Nullable Map<String,String> transformNameMapping) {
            this.transformNameMapping = Input.ofNullable(transformNameMapping);
            return this;
        }

        public Builder type(@Nullable Input<JobType> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable JobType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder view(@Nullable Input<String> view) {
            this.view = view;
            return this;
        }

        public Builder view(@Nullable String view) {
            this.view = Input.ofNullable(view);
            return this;
        }
        public JobArgs build() {
            return new JobArgs(clientRequestId, createTime, createdFromSnapshotId, currentState, currentStateTime, environment, id, jobMetadata, labels, location, name, pipelineDescription, project, replaceJobId, replacedByJobId, requestedState, satisfiesPzs, stageStates, startTime, steps, stepsLocation, tempFiles, transformNameMapping, type, view);
        }
    }
}
