// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.notebooks_v1.enums.ExecutionTemplateJobType;
import io.pulumi.googlenative.notebooks_v1.inputs.DataprocParametersArgs;
import io.pulumi.googlenative.notebooks_v1.inputs.SchedulerAcceleratorConfigArgs;
import io.pulumi.googlenative.notebooks_v1.inputs.VertexAIParametersArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The description a notebook execution workload.
 * 
 */
public final class ExecutionTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExecutionTemplateArgs Empty = new ExecutionTemplateArgs();

    /**
     * Configuration (count and accelerator type) for hardware running notebook execution.
     * 
     */
    @InputImport(name="acceleratorConfig")
      private final @Nullable Input<SchedulerAcceleratorConfigArgs> acceleratorConfig;

    public Input<SchedulerAcceleratorConfigArgs> getAcceleratorConfig() {
        return this.acceleratorConfig == null ? Input.empty() : this.acceleratorConfig;
    }

    /**
     * Container Image URI to a DLVM Example: 'gcr.io/deeplearning-platform-release/base-cu100' More examples can be found at: https://cloud.google.com/ai-platform/deep-learning-containers/docs/choosing-container
     * 
     */
    @InputImport(name="containerImageUri")
      private final @Nullable Input<String> containerImageUri;

    public Input<String> getContainerImageUri() {
        return this.containerImageUri == null ? Input.empty() : this.containerImageUri;
    }

    /**
     * Parameters used in Dataproc JobType executions.
     * 
     */
    @InputImport(name="dataprocParameters")
      private final @Nullable Input<DataprocParametersArgs> dataprocParameters;

    public Input<DataprocParametersArgs> getDataprocParameters() {
        return this.dataprocParameters == null ? Input.empty() : this.dataprocParameters;
    }

    /**
     * Path to the notebook file to execute. Must be in a Google Cloud Storage bucket. Format: `gs://{bucket_name}/{folder}/{notebook_file_name}` Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook.ipynb`
     * 
     */
    @InputImport(name="inputNotebookFile")
      private final @Nullable Input<String> inputNotebookFile;

    public Input<String> getInputNotebookFile() {
        return this.inputNotebookFile == null ? Input.empty() : this.inputNotebookFile;
    }

    /**
     * The type of Job to be used on this execution.
     * 
     */
    @InputImport(name="jobType")
      private final @Nullable Input<ExecutionTemplateJobType> jobType;

    public Input<ExecutionTemplateJobType> getJobType() {
        return this.jobType == null ? Input.empty() : this.jobType;
    }

    /**
     * Name of the kernel spec to use. This must be specified if the kernel spec name on the execution target does not match the name in the input notebook file.
     * 
     */
    @InputImport(name="kernelSpec")
      private final @Nullable Input<String> kernelSpec;

    public Input<String> getKernelSpec() {
        return this.kernelSpec == null ? Input.empty() : this.kernelSpec;
    }

    /**
     * Labels for execution. If execution is scheduled, a field included will be 'nbs-scheduled'. Otherwise, it is an immediate execution, and an included field will be 'nbs-immediate'. Use fields to efficiently index between various types of executions.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Specifies the type of virtual machine to use for your training job's master worker. You must specify this field when `scaleTier` is set to `CUSTOM`. You can use certain Compute Engine machine types directly in this field. The following types are supported: - `n1-standard-4` - `n1-standard-8` - `n1-standard-16` - `n1-standard-32` - `n1-standard-64` - `n1-standard-96` - `n1-highmem-2` - `n1-highmem-4` - `n1-highmem-8` - `n1-highmem-16` - `n1-highmem-32` - `n1-highmem-64` - `n1-highmem-96` - `n1-highcpu-16` - `n1-highcpu-32` - `n1-highcpu-64` - `n1-highcpu-96` Alternatively, you can use the following legacy machine types: - `standard` - `large_model` - `complex_model_s` - `complex_model_m` - `complex_model_l` - `standard_gpu` - `complex_model_m_gpu` - `complex_model_l_gpu` - `standard_p100` - `complex_model_m_p100` - `standard_v100` - `large_model_v100` - `complex_model_m_v100` - `complex_model_l_v100` Finally, if you want to use a TPU for training, specify `cloud_tpu` in this field. Learn more about the [special configuration options for training with TPU](https://cloud.google.com/ai-platform/training/docs/using-tpus#configuring_a_custom_tpu_machine).
     * 
     */
    @InputImport(name="masterType")
      private final @Nullable Input<String> masterType;

    public Input<String> getMasterType() {
        return this.masterType == null ? Input.empty() : this.masterType;
    }

    /**
     * Path to the notebook folder to write to. Must be in a Google Cloud Storage bucket path. Format: `gs://{bucket_name}/{folder}` Ex: `gs://notebook_user/scheduled_notebooks`
     * 
     */
    @InputImport(name="outputNotebookFolder")
      private final @Nullable Input<String> outputNotebookFolder;

    public Input<String> getOutputNotebookFolder() {
        return this.outputNotebookFolder == null ? Input.empty() : this.outputNotebookFolder;
    }

    /**
     * Parameters used within the 'input_notebook_file' notebook.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<String> parameters;

    public Input<String> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Parameters to be overridden in the notebook during execution. Ref https://papermill.readthedocs.io/en/latest/usage-parameterize.html on how to specifying parameters in the input notebook and pass them here in an YAML file. Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook_params.yaml`
     * 
     */
    @InputImport(name="paramsYamlFile")
      private final @Nullable Input<String> paramsYamlFile;

    public Input<String> getParamsYamlFile() {
        return this.paramsYamlFile == null ? Input.empty() : this.paramsYamlFile;
    }

    /**
     * The email address of a service account to use when running the execution. You must have the `iam.serviceAccounts.actAs` permission for the specified service account.
     * 
     */
    @InputImport(name="serviceAccount")
      private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * Parameters used in Vertex AI JobType executions.
     * 
     */
    @InputImport(name="vertexAiParameters")
      private final @Nullable Input<VertexAIParametersArgs> vertexAiParameters;

    public Input<VertexAIParametersArgs> getVertexAiParameters() {
        return this.vertexAiParameters == null ? Input.empty() : this.vertexAiParameters;
    }

    public ExecutionTemplateArgs(
        @Nullable Input<SchedulerAcceleratorConfigArgs> acceleratorConfig,
        @Nullable Input<String> containerImageUri,
        @Nullable Input<DataprocParametersArgs> dataprocParameters,
        @Nullable Input<String> inputNotebookFile,
        @Nullable Input<ExecutionTemplateJobType> jobType,
        @Nullable Input<String> kernelSpec,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> masterType,
        @Nullable Input<String> outputNotebookFolder,
        @Nullable Input<String> parameters,
        @Nullable Input<String> paramsYamlFile,
        @Nullable Input<String> serviceAccount,
        @Nullable Input<VertexAIParametersArgs> vertexAiParameters) {
        this.acceleratorConfig = acceleratorConfig;
        this.containerImageUri = containerImageUri;
        this.dataprocParameters = dataprocParameters;
        this.inputNotebookFile = inputNotebookFile;
        this.jobType = jobType;
        this.kernelSpec = kernelSpec;
        this.labels = labels;
        this.masterType = masterType;
        this.outputNotebookFolder = outputNotebookFolder;
        this.parameters = parameters;
        this.paramsYamlFile = paramsYamlFile;
        this.serviceAccount = serviceAccount;
        this.vertexAiParameters = vertexAiParameters;
    }

    private ExecutionTemplateArgs() {
        this.acceleratorConfig = Input.empty();
        this.containerImageUri = Input.empty();
        this.dataprocParameters = Input.empty();
        this.inputNotebookFile = Input.empty();
        this.jobType = Input.empty();
        this.kernelSpec = Input.empty();
        this.labels = Input.empty();
        this.masterType = Input.empty();
        this.outputNotebookFolder = Input.empty();
        this.parameters = Input.empty();
        this.paramsYamlFile = Input.empty();
        this.serviceAccount = Input.empty();
        this.vertexAiParameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SchedulerAcceleratorConfigArgs> acceleratorConfig;
        private @Nullable Input<String> containerImageUri;
        private @Nullable Input<DataprocParametersArgs> dataprocParameters;
        private @Nullable Input<String> inputNotebookFile;
        private @Nullable Input<ExecutionTemplateJobType> jobType;
        private @Nullable Input<String> kernelSpec;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> masterType;
        private @Nullable Input<String> outputNotebookFolder;
        private @Nullable Input<String> parameters;
        private @Nullable Input<String> paramsYamlFile;
        private @Nullable Input<String> serviceAccount;
        private @Nullable Input<VertexAIParametersArgs> vertexAiParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.containerImageUri = defaults.containerImageUri;
    	      this.dataprocParameters = defaults.dataprocParameters;
    	      this.inputNotebookFile = defaults.inputNotebookFile;
    	      this.jobType = defaults.jobType;
    	      this.kernelSpec = defaults.kernelSpec;
    	      this.labels = defaults.labels;
    	      this.masterType = defaults.masterType;
    	      this.outputNotebookFolder = defaults.outputNotebookFolder;
    	      this.parameters = defaults.parameters;
    	      this.paramsYamlFile = defaults.paramsYamlFile;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.vertexAiParameters = defaults.vertexAiParameters;
        }

        public Builder acceleratorConfig(@Nullable Input<SchedulerAcceleratorConfigArgs> acceleratorConfig) {
            this.acceleratorConfig = acceleratorConfig;
            return this;
        }

        public Builder acceleratorConfig(@Nullable SchedulerAcceleratorConfigArgs acceleratorConfig) {
            this.acceleratorConfig = Input.ofNullable(acceleratorConfig);
            return this;
        }

        public Builder containerImageUri(@Nullable Input<String> containerImageUri) {
            this.containerImageUri = containerImageUri;
            return this;
        }

        public Builder containerImageUri(@Nullable String containerImageUri) {
            this.containerImageUri = Input.ofNullable(containerImageUri);
            return this;
        }

        public Builder dataprocParameters(@Nullable Input<DataprocParametersArgs> dataprocParameters) {
            this.dataprocParameters = dataprocParameters;
            return this;
        }

        public Builder dataprocParameters(@Nullable DataprocParametersArgs dataprocParameters) {
            this.dataprocParameters = Input.ofNullable(dataprocParameters);
            return this;
        }

        public Builder inputNotebookFile(@Nullable Input<String> inputNotebookFile) {
            this.inputNotebookFile = inputNotebookFile;
            return this;
        }

        public Builder inputNotebookFile(@Nullable String inputNotebookFile) {
            this.inputNotebookFile = Input.ofNullable(inputNotebookFile);
            return this;
        }

        public Builder jobType(@Nullable Input<ExecutionTemplateJobType> jobType) {
            this.jobType = jobType;
            return this;
        }

        public Builder jobType(@Nullable ExecutionTemplateJobType jobType) {
            this.jobType = Input.ofNullable(jobType);
            return this;
        }

        public Builder kernelSpec(@Nullable Input<String> kernelSpec) {
            this.kernelSpec = kernelSpec;
            return this;
        }

        public Builder kernelSpec(@Nullable String kernelSpec) {
            this.kernelSpec = Input.ofNullable(kernelSpec);
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

        public Builder masterType(@Nullable Input<String> masterType) {
            this.masterType = masterType;
            return this;
        }

        public Builder masterType(@Nullable String masterType) {
            this.masterType = Input.ofNullable(masterType);
            return this;
        }

        public Builder outputNotebookFolder(@Nullable Input<String> outputNotebookFolder) {
            this.outputNotebookFolder = outputNotebookFolder;
            return this;
        }

        public Builder outputNotebookFolder(@Nullable String outputNotebookFolder) {
            this.outputNotebookFolder = Input.ofNullable(outputNotebookFolder);
            return this;
        }

        public Builder parameters(@Nullable Input<String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable String parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder paramsYamlFile(@Nullable Input<String> paramsYamlFile) {
            this.paramsYamlFile = paramsYamlFile;
            return this;
        }

        public Builder paramsYamlFile(@Nullable String paramsYamlFile) {
            this.paramsYamlFile = Input.ofNullable(paramsYamlFile);
            return this;
        }

        public Builder serviceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder vertexAiParameters(@Nullable Input<VertexAIParametersArgs> vertexAiParameters) {
            this.vertexAiParameters = vertexAiParameters;
            return this;
        }

        public Builder vertexAiParameters(@Nullable VertexAIParametersArgs vertexAiParameters) {
            this.vertexAiParameters = Input.ofNullable(vertexAiParameters);
            return this;
        }
        public ExecutionTemplateArgs build() {
            return new ExecutionTemplateArgs(acceleratorConfig, containerImageUri, dataprocParameters, inputNotebookFile, jobType, kernelSpec, labels, masterType, outputNotebookFolder, parameters, paramsYamlFile, serviceAccount, vertexAiParameters);
        }
    }
}
