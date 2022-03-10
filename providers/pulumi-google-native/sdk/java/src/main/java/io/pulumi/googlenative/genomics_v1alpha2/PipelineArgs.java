// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.genomics_v1alpha2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.genomics_v1alpha2.inputs.DockerExecutorArgs;
import io.pulumi.googlenative.genomics_v1alpha2.inputs.PipelineParameterArgs;
import io.pulumi.googlenative.genomics_v1alpha2.inputs.PipelineResourcesArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineArgs Empty = new PipelineArgs();

    /**
     * User-specified description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Specifies the docker run information.
     * 
     */
    @InputImport(name="docker")
      private final @Nullable Input<DockerExecutorArgs> docker;

    public Input<DockerExecutorArgs> getDocker() {
        return this.docker == null ? Input.empty() : this.docker;
    }

    /**
     * Input parameters of the pipeline.
     * 
     */
    @InputImport(name="inputParameters")
      private final @Nullable Input<List<PipelineParameterArgs>> inputParameters;

    public Input<List<PipelineParameterArgs>> getInputParameters() {
        return this.inputParameters == null ? Input.empty() : this.inputParameters;
    }

    /**
     * A user specified pipeline name that does not have to be unique. This name can be used for filtering Pipelines in ListPipelines.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Output parameters of the pipeline.
     * 
     */
    @InputImport(name="outputParameters")
      private final @Nullable Input<List<PipelineParameterArgs>> outputParameters;

    public Input<List<PipelineParameterArgs>> getOutputParameters() {
        return this.outputParameters == null ? Input.empty() : this.outputParameters;
    }

    /**
     * Unique pipeline id that is generated by the service when CreatePipeline is called. Cannot be specified in the Pipeline used in the CreatePipelineRequest, and will be populated in the response to CreatePipeline and all subsequent Get and List calls. Indicates that the service has registered this pipeline.
     * 
     */
    @InputImport(name="pipelineId")
      private final @Nullable Input<String> pipelineId;

    public Input<String> getPipelineId() {
        return this.pipelineId == null ? Input.empty() : this.pipelineId;
    }

    /**
     * The project in which to create the pipeline. The caller must have WRITE access.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Specifies resource requirements for the pipeline run. Required fields: * minimumCpuCores * minimumRamGb
     * 
     */
    @InputImport(name="resources", required=true)
      private final Input<PipelineResourcesArgs> resources;

    public Input<PipelineResourcesArgs> getResources() {
        return this.resources;
    }

    public PipelineArgs(
        @Nullable Input<String> description,
        @Nullable Input<DockerExecutorArgs> docker,
        @Nullable Input<List<PipelineParameterArgs>> inputParameters,
        @Nullable Input<String> name,
        @Nullable Input<List<PipelineParameterArgs>> outputParameters,
        @Nullable Input<String> pipelineId,
        @Nullable Input<String> project,
        Input<PipelineResourcesArgs> resources) {
        this.description = description;
        this.docker = docker;
        this.inputParameters = inputParameters;
        this.name = name;
        this.outputParameters = outputParameters;
        this.pipelineId = pipelineId;
        this.project = project;
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
    }

    private PipelineArgs() {
        this.description = Input.empty();
        this.docker = Input.empty();
        this.inputParameters = Input.empty();
        this.name = Input.empty();
        this.outputParameters = Input.empty();
        this.pipelineId = Input.empty();
        this.project = Input.empty();
        this.resources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<DockerExecutorArgs> docker;
        private @Nullable Input<List<PipelineParameterArgs>> inputParameters;
        private @Nullable Input<String> name;
        private @Nullable Input<List<PipelineParameterArgs>> outputParameters;
        private @Nullable Input<String> pipelineId;
        private @Nullable Input<String> project;
        private Input<PipelineResourcesArgs> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.docker = defaults.docker;
    	      this.inputParameters = defaults.inputParameters;
    	      this.name = defaults.name;
    	      this.outputParameters = defaults.outputParameters;
    	      this.pipelineId = defaults.pipelineId;
    	      this.project = defaults.project;
    	      this.resources = defaults.resources;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder docker(@Nullable Input<DockerExecutorArgs> docker) {
            this.docker = docker;
            return this;
        }

        public Builder docker(@Nullable DockerExecutorArgs docker) {
            this.docker = Input.ofNullable(docker);
            return this;
        }

        public Builder inputParameters(@Nullable Input<List<PipelineParameterArgs>> inputParameters) {
            this.inputParameters = inputParameters;
            return this;
        }

        public Builder inputParameters(@Nullable List<PipelineParameterArgs> inputParameters) {
            this.inputParameters = Input.ofNullable(inputParameters);
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

        public Builder outputParameters(@Nullable Input<List<PipelineParameterArgs>> outputParameters) {
            this.outputParameters = outputParameters;
            return this;
        }

        public Builder outputParameters(@Nullable List<PipelineParameterArgs> outputParameters) {
            this.outputParameters = Input.ofNullable(outputParameters);
            return this;
        }

        public Builder pipelineId(@Nullable Input<String> pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        public Builder pipelineId(@Nullable String pipelineId) {
            this.pipelineId = Input.ofNullable(pipelineId);
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

        public Builder resources(Input<PipelineResourcesArgs> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder resources(PipelineResourcesArgs resources) {
            this.resources = Input.of(Objects.requireNonNull(resources));
            return this;
        }
        public PipelineArgs build() {
            return new PipelineArgs(description, docker, inputParameters, name, outputParameters, pipelineId, project, resources);
        }
    }
}
