// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.azurenative.resources.outputs.DebugSettingResponse;
import io.pulumi.azurenative.resources.outputs.DependencyResponse;
import io.pulumi.azurenative.resources.outputs.ErrorResponseResponse;
import io.pulumi.azurenative.resources.outputs.OnErrorDeploymentExtendedResponse;
import io.pulumi.azurenative.resources.outputs.ParametersLinkResponse;
import io.pulumi.azurenative.resources.outputs.ProviderResponse;
import io.pulumi.azurenative.resources.outputs.ResourceReferenceResponse;
import io.pulumi.azurenative.resources.outputs.TemplateLinkResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DeploymentPropertiesExtendedResponse {
    /**
     * The correlation ID of the deployment.
     * 
     */
    private final String correlationId;
    /**
     * The debug setting of the deployment.
     * 
     */
    private final DebugSettingResponse debugSetting;
    /**
     * The list of deployment dependencies.
     * 
     */
    private final List<DependencyResponse> dependencies;
    /**
     * The duration of the template deployment.
     * 
     */
    private final String duration;
    /**
     * The deployment error.
     * 
     */
    private final ErrorResponseResponse error;
    /**
     * The deployment mode. Possible values are Incremental and Complete.
     * 
     */
    private final String mode;
    /**
     * The deployment on error behavior.
     * 
     */
    private final OnErrorDeploymentExtendedResponse onErrorDeployment;
    /**
     * Array of provisioned resources.
     * 
     */
    private final List<ResourceReferenceResponse> outputResources;
    /**
     * Key/value pairs that represent deployment output.
     * 
     */
    private final Object outputs;
    /**
     * Deployment parameters.
     * 
     */
    private final Object parameters;
    /**
     * The URI referencing the parameters.
     * 
     */
    private final ParametersLinkResponse parametersLink;
    /**
     * The list of resource providers needed for the deployment.
     * 
     */
    private final List<ProviderResponse> providers;
    /**
     * Denotes the state of provisioning.
     * 
     */
    private final String provisioningState;
    /**
     * The hash produced for the template.
     * 
     */
    private final String templateHash;
    /**
     * The URI referencing the template.
     * 
     */
    private final TemplateLinkResponse templateLink;
    /**
     * The timestamp of the template deployment.
     * 
     */
    private final String timestamp;
    /**
     * Array of validated resources.
     * 
     */
    private final List<ResourceReferenceResponse> validatedResources;

    @OutputCustomType.Constructor({"correlationId","debugSetting","dependencies","duration","error","mode","onErrorDeployment","outputResources","outputs","parameters","parametersLink","providers","provisioningState","templateHash","templateLink","timestamp","validatedResources"})
    private DeploymentPropertiesExtendedResponse(
        String correlationId,
        DebugSettingResponse debugSetting,
        List<DependencyResponse> dependencies,
        String duration,
        ErrorResponseResponse error,
        String mode,
        OnErrorDeploymentExtendedResponse onErrorDeployment,
        List<ResourceReferenceResponse> outputResources,
        Object outputs,
        Object parameters,
        ParametersLinkResponse parametersLink,
        List<ProviderResponse> providers,
        String provisioningState,
        String templateHash,
        TemplateLinkResponse templateLink,
        String timestamp,
        List<ResourceReferenceResponse> validatedResources) {
        this.correlationId = correlationId;
        this.debugSetting = debugSetting;
        this.dependencies = dependencies;
        this.duration = duration;
        this.error = error;
        this.mode = mode;
        this.onErrorDeployment = onErrorDeployment;
        this.outputResources = outputResources;
        this.outputs = outputs;
        this.parameters = parameters;
        this.parametersLink = parametersLink;
        this.providers = providers;
        this.provisioningState = provisioningState;
        this.templateHash = templateHash;
        this.templateLink = templateLink;
        this.timestamp = timestamp;
        this.validatedResources = validatedResources;
    }

    /**
     * The correlation ID of the deployment.
     * 
    */
    public String getCorrelationId() {
        return this.correlationId;
    }
    /**
     * The debug setting of the deployment.
     * 
    */
    public DebugSettingResponse getDebugSetting() {
        return this.debugSetting;
    }
    /**
     * The list of deployment dependencies.
     * 
    */
    public List<DependencyResponse> getDependencies() {
        return this.dependencies;
    }
    /**
     * The duration of the template deployment.
     * 
    */
    public String getDuration() {
        return this.duration;
    }
    /**
     * The deployment error.
     * 
    */
    public ErrorResponseResponse getError() {
        return this.error;
    }
    /**
     * The deployment mode. Possible values are Incremental and Complete.
     * 
    */
    public String getMode() {
        return this.mode;
    }
    /**
     * The deployment on error behavior.
     * 
    */
    public OnErrorDeploymentExtendedResponse getOnErrorDeployment() {
        return this.onErrorDeployment;
    }
    /**
     * Array of provisioned resources.
     * 
    */
    public List<ResourceReferenceResponse> getOutputResources() {
        return this.outputResources;
    }
    /**
     * Key/value pairs that represent deployment output.
     * 
    */
    public Object getOutputs() {
        return this.outputs;
    }
    /**
     * Deployment parameters.
     * 
    */
    public Object getParameters() {
        return this.parameters;
    }
    /**
     * The URI referencing the parameters.
     * 
    */
    public ParametersLinkResponse getParametersLink() {
        return this.parametersLink;
    }
    /**
     * The list of resource providers needed for the deployment.
     * 
    */
    public List<ProviderResponse> getProviders() {
        return this.providers;
    }
    /**
     * Denotes the state of provisioning.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The hash produced for the template.
     * 
    */
    public String getTemplateHash() {
        return this.templateHash;
    }
    /**
     * The URI referencing the template.
     * 
    */
    public TemplateLinkResponse getTemplateLink() {
        return this.templateLink;
    }
    /**
     * The timestamp of the template deployment.
     * 
    */
    public String getTimestamp() {
        return this.timestamp;
    }
    /**
     * Array of validated resources.
     * 
    */
    public List<ResourceReferenceResponse> getValidatedResources() {
        return this.validatedResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentPropertiesExtendedResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String correlationId;
        private DebugSettingResponse debugSetting;
        private List<DependencyResponse> dependencies;
        private String duration;
        private ErrorResponseResponse error;
        private String mode;
        private OnErrorDeploymentExtendedResponse onErrorDeployment;
        private List<ResourceReferenceResponse> outputResources;
        private Object outputs;
        private Object parameters;
        private ParametersLinkResponse parametersLink;
        private List<ProviderResponse> providers;
        private String provisioningState;
        private String templateHash;
        private TemplateLinkResponse templateLink;
        private String timestamp;
        private List<ResourceReferenceResponse> validatedResources;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentPropertiesExtendedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.correlationId = defaults.correlationId;
    	      this.debugSetting = defaults.debugSetting;
    	      this.dependencies = defaults.dependencies;
    	      this.duration = defaults.duration;
    	      this.error = defaults.error;
    	      this.mode = defaults.mode;
    	      this.onErrorDeployment = defaults.onErrorDeployment;
    	      this.outputResources = defaults.outputResources;
    	      this.outputs = defaults.outputs;
    	      this.parameters = defaults.parameters;
    	      this.parametersLink = defaults.parametersLink;
    	      this.providers = defaults.providers;
    	      this.provisioningState = defaults.provisioningState;
    	      this.templateHash = defaults.templateHash;
    	      this.templateLink = defaults.templateLink;
    	      this.timestamp = defaults.timestamp;
    	      this.validatedResources = defaults.validatedResources;
        }

        public Builder setCorrelationId(String correlationId) {
            this.correlationId = Objects.requireNonNull(correlationId);
            return this;
        }

        public Builder setDebugSetting(DebugSettingResponse debugSetting) {
            this.debugSetting = Objects.requireNonNull(debugSetting);
            return this;
        }

        public Builder setDependencies(List<DependencyResponse> dependencies) {
            this.dependencies = Objects.requireNonNull(dependencies);
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setError(ErrorResponseResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setOnErrorDeployment(OnErrorDeploymentExtendedResponse onErrorDeployment) {
            this.onErrorDeployment = Objects.requireNonNull(onErrorDeployment);
            return this;
        }

        public Builder setOutputResources(List<ResourceReferenceResponse> outputResources) {
            this.outputResources = Objects.requireNonNull(outputResources);
            return this;
        }

        public Builder setOutputs(Object outputs) {
            this.outputs = Objects.requireNonNull(outputs);
            return this;
        }

        public Builder setParameters(Object parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setParametersLink(ParametersLinkResponse parametersLink) {
            this.parametersLink = Objects.requireNonNull(parametersLink);
            return this;
        }

        public Builder setProviders(List<ProviderResponse> providers) {
            this.providers = Objects.requireNonNull(providers);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTemplateHash(String templateHash) {
            this.templateHash = Objects.requireNonNull(templateHash);
            return this;
        }

        public Builder setTemplateLink(TemplateLinkResponse templateLink) {
            this.templateLink = Objects.requireNonNull(templateLink);
            return this;
        }

        public Builder setTimestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }

        public Builder setValidatedResources(List<ResourceReferenceResponse> validatedResources) {
            this.validatedResources = Objects.requireNonNull(validatedResources);
            return this;
        }
        public DeploymentPropertiesExtendedResponse build() {
            return new DeploymentPropertiesExtendedResponse(correlationId, debugSetting, dependencies, duration, error, mode, onErrorDeployment, outputResources, outputs, parameters, parametersLink, providers, provisioningState, templateHash, templateLink, timestamp, validatedResources);
        }
    }
}
