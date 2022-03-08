// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datapipelines_v1.outputs.GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse {
    /**
     * Cloud Storage path to a file with a JSON-serialized ContainerSpec as content.
     * 
     */
    private final String containerSpecGcsPath;
    /**
     * The runtime environment for the Flex Template job.
     * 
     */
    private final GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse environment;
    /**
     * The job name to use for the created job. For an update job request, the job name should be the same as the existing running job.
     * 
     */
    private final String jobName;
    /**
     * Launch options for this Flex Template job. This is a common set of options across languages and templates. This should not be used to pass job parameters.
     * 
     */
    private final Map<String,String> launchOptions;
    /**
     * The parameters for the Flex Template. Example: `{"num_workers":"5"}`
     * 
     */
    private final Map<String,String> parameters;
    /**
     * Use this to pass transform name mappings for streaming update jobs. Example: `{"oldTransformName":"newTransformName",...}`
     * 
     */
    private final Map<String,String> transformNameMappings;
    /**
     * Set this to true if you are sending a request to update a running streaming job. When set, the job name should be the same as the running job.
     * 
     */
    private final Boolean update;

    @OutputCustomType.Constructor({"containerSpecGcsPath","environment","jobName","launchOptions","parameters","transformNameMappings","update"})
    private GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse(
        String containerSpecGcsPath,
        GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse environment,
        String jobName,
        Map<String,String> launchOptions,
        Map<String,String> parameters,
        Map<String,String> transformNameMappings,
        Boolean update) {
        this.containerSpecGcsPath = containerSpecGcsPath;
        this.environment = environment;
        this.jobName = jobName;
        this.launchOptions = launchOptions;
        this.parameters = parameters;
        this.transformNameMappings = transformNameMappings;
        this.update = update;
    }

    /**
     * Cloud Storage path to a file with a JSON-serialized ContainerSpec as content.
     * 
    */
    public String getContainerSpecGcsPath() {
        return this.containerSpecGcsPath;
    }
    /**
     * The runtime environment for the Flex Template job.
     * 
    */
    public GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse getEnvironment() {
        return this.environment;
    }
    /**
     * The job name to use for the created job. For an update job request, the job name should be the same as the existing running job.
     * 
    */
    public String getJobName() {
        return this.jobName;
    }
    /**
     * Launch options for this Flex Template job. This is a common set of options across languages and templates. This should not be used to pass job parameters.
     * 
    */
    public Map<String,String> getLaunchOptions() {
        return this.launchOptions;
    }
    /**
     * The parameters for the Flex Template. Example: `{"num_workers":"5"}`
     * 
    */
    public Map<String,String> getParameters() {
        return this.parameters;
    }
    /**
     * Use this to pass transform name mappings for streaming update jobs. Example: `{"oldTransformName":"newTransformName",...}`
     * 
    */
    public Map<String,String> getTransformNameMappings() {
        return this.transformNameMappings;
    }
    /**
     * Set this to true if you are sending a request to update a running streaming job. When set, the job name should be the same as the running job.
     * 
    */
    public Boolean getUpdate() {
        return this.update;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerSpecGcsPath;
        private GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse environment;
        private String jobName;
        private Map<String,String> launchOptions;
        private Map<String,String> parameters;
        private Map<String,String> transformNameMappings;
        private Boolean update;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerSpecGcsPath = defaults.containerSpecGcsPath;
    	      this.environment = defaults.environment;
    	      this.jobName = defaults.jobName;
    	      this.launchOptions = defaults.launchOptions;
    	      this.parameters = defaults.parameters;
    	      this.transformNameMappings = defaults.transformNameMappings;
    	      this.update = defaults.update;
        }

        public Builder setContainerSpecGcsPath(String containerSpecGcsPath) {
            this.containerSpecGcsPath = Objects.requireNonNull(containerSpecGcsPath);
            return this;
        }

        public Builder setEnvironment(GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }

        public Builder setJobName(String jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }

        public Builder setLaunchOptions(Map<String,String> launchOptions) {
            this.launchOptions = Objects.requireNonNull(launchOptions);
            return this;
        }

        public Builder setParameters(Map<String,String> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setTransformNameMappings(Map<String,String> transformNameMappings) {
            this.transformNameMappings = Objects.requireNonNull(transformNameMappings);
            return this;
        }

        public Builder setUpdate(Boolean update) {
            this.update = Objects.requireNonNull(update);
            return this;
        }
        public GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse build() {
            return new GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse(containerSpecGcsPath, environment, jobName, launchOptions, parameters, transformNameMappings, update);
        }
    }
}
