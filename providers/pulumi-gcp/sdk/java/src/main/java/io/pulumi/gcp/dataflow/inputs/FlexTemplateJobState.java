// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexTemplateJobState extends io.pulumi.resources.ResourceArgs {

    public static final FlexTemplateJobState Empty = new FlexTemplateJobState();

    /**
     * The GCS path to the Dataflow job Flex
     * Template.
     * 
     */
    @Import(name="containerSpecGcsPath")
      private final @Nullable Output<String> containerSpecGcsPath;

    public Output<String> containerSpecGcsPath() {
        return this.containerSpecGcsPath == null ? Codegen.empty() : this.containerSpecGcsPath;
    }

    /**
     * The unique ID of this job.
     * 
     */
    @Import(name="jobId")
      private final @Nullable Output<String> jobId;

    public Output<String> jobId() {
        return this.jobId == null ? Codegen.empty() : this.jobId;
    }

    /**
     * User labels to be specified for the job. Keys and values
     * should follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
     * page. **Note**: This field is marked as deprecated as the API does not currently
     * support adding labels.
     * **NOTE**: Google-provided Dataflow templates often provide default labels
     * that begin with `goog-dataflow-provided`. Unless explicitly set in config, these
     * labels will be ignored to prevent diffs on re-apply.
     * 
     * @Deprecated
     * Deprecated until the API supports this field
     * 
     */
    @Deprecated /* Deprecated until the API supports this field */
    @Import(name="labels")
      private final @Nullable Output<Map<String,Object>> labels;

    @Deprecated /* Deprecated until the API supports this field */
    public Output<Map<String,Object>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * A unique name for the resource, required by Dataflow.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * One of "drain" or "cancel". Specifies behavior of
     * deletion during `pulumi destroy`.  See above note.
     * 
     */
    @Import(name="onDelete")
      private final @Nullable Output<String> onDelete;

    public Output<String> onDelete() {
        return this.onDelete == null ? Codegen.empty() : this.onDelete;
    }

    /**
     * Key/Value pairs to be passed to the Dataflow job (as
     * used in the template). Additional [pipeline options](https://cloud.google.com/dataflow/docs/guides/specifying-exec-params#setting-other-cloud-dataflow-pipeline-options)
     * such as `serviceAccount`, `workerMachineType`, etc can be specified here.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,Object>> parameters;

    public Output<Map<String,Object>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * The project in which the resource belongs. If it is not
     * provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The region in which the created job should run.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * The current state of the resource, selected from the [JobState enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobState)
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    public FlexTemplateJobState(
        @Nullable Output<String> containerSpecGcsPath,
        @Nullable Output<String> jobId,
        @Nullable Output<Map<String,Object>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> onDelete,
        @Nullable Output<Map<String,Object>> parameters,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> state) {
        this.containerSpecGcsPath = containerSpecGcsPath;
        this.jobId = jobId;
        this.labels = labels;
        this.name = name;
        this.onDelete = onDelete;
        this.parameters = parameters;
        this.project = project;
        this.region = region;
        this.state = state;
    }

    private FlexTemplateJobState() {
        this.containerSpecGcsPath = Codegen.empty();
        this.jobId = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.onDelete = Codegen.empty();
        this.parameters = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.state = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexTemplateJobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> containerSpecGcsPath;
        private @Nullable Output<String> jobId;
        private @Nullable Output<Map<String,Object>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> onDelete;
        private @Nullable Output<Map<String,Object>> parameters;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexTemplateJobState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerSpecGcsPath = defaults.containerSpecGcsPath;
    	      this.jobId = defaults.jobId;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.onDelete = defaults.onDelete;
    	      this.parameters = defaults.parameters;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.state = defaults.state;
        }

        public Builder containerSpecGcsPath(@Nullable Output<String> containerSpecGcsPath) {
            this.containerSpecGcsPath = containerSpecGcsPath;
            return this;
        }
        public Builder containerSpecGcsPath(@Nullable String containerSpecGcsPath) {
            this.containerSpecGcsPath = Codegen.ofNullable(containerSpecGcsPath);
            return this;
        }
        public Builder jobId(@Nullable Output<String> jobId) {
            this.jobId = jobId;
            return this;
        }
        public Builder jobId(@Nullable String jobId) {
            this.jobId = Codegen.ofNullable(jobId);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,Object> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder onDelete(@Nullable Output<String> onDelete) {
            this.onDelete = onDelete;
            return this;
        }
        public Builder onDelete(@Nullable String onDelete) {
            this.onDelete = Codegen.ofNullable(onDelete);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,Object>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,Object> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }        public FlexTemplateJobState build() {
            return new FlexTemplateJobState(containerSpecGcsPath, jobId, labels, name, onDelete, parameters, project, region, state);
        }
    }
}
