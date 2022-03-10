// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.AKSServiceResponseResponseAutoScaler;
import io.pulumi.azurenative.machinelearningservices.outputs.AKSServiceResponseResponseDataCollection;
import io.pulumi.azurenative.machinelearningservices.outputs.AKSServiceResponseResponseDeploymentStatus;
import io.pulumi.azurenative.machinelearningservices.outputs.AKSServiceResponseResponseEnvironmentImageRequest;
import io.pulumi.azurenative.machinelearningservices.outputs.AKSServiceResponseResponseLivenessProbeRequirements;
import io.pulumi.azurenative.machinelearningservices.outputs.ContainerResourceRequirementsResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ModelResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ServiceResponseBaseResponseError;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AKSServiceResponseResponse {
    /**
     * Whether or not AAD authentication is enabled.
     * 
     */
    private final @Nullable Boolean aadAuthEnabled;
    /**
     * Whether or not Application Insights is enabled.
     * 
     */
    private final @Nullable Boolean appInsightsEnabled;
    /**
     * Whether or not authentication is enabled.
     * 
     */
    private final @Nullable Boolean authEnabled;
    /**
     * The auto scaler properties.
     * 
     */
    private final @Nullable AKSServiceResponseResponseAutoScaler autoScaler;
    /**
     * The name of the compute resource.
     * 
     */
    private final @Nullable String computeName;
    /**
     * The compute environment type for the service.
     * Expected value is 'AKS'.
     * 
     */
    private final String computeType;
    /**
     * The container resource requirements.
     * 
     */
    private final @Nullable ContainerResourceRequirementsResponse containerResourceRequirements;
    /**
     * Details of the data collection options specified.
     * 
     */
    private final @Nullable AKSServiceResponseResponseDataCollection dataCollection;
    /**
     * The deployment status.
     * 
     */
    private final AKSServiceResponseResponseDeploymentStatus deploymentStatus;
    /**
     * The deployment type for the service.
     * 
     */
    private final @Nullable String deploymentType;
    /**
     * The service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The Environment, models and assets used for inferencing.
     * 
     */
    private final @Nullable AKSServiceResponseResponseEnvironmentImageRequest environmentImageRequest;
    /**
     * The error details.
     * 
     */
    private final ServiceResponseBaseResponseError error;
    /**
     * Is this the default variant.
     * 
     */
    private final @Nullable Boolean isDefault;
    /**
     * The service tag dictionary. Tags are mutable.
     * 
     */
    private final @Nullable Map<String,String> kvTags;
    /**
     * The liveness probe requirements.
     * 
     */
    private final @Nullable AKSServiceResponseResponseLivenessProbeRequirements livenessProbeRequirements;
    /**
     * The maximum number of concurrent requests per container.
     * 
     */
    private final @Nullable Integer maxConcurrentRequestsPerContainer;
    /**
     * Maximum time a request will wait in the queue (in milliseconds). After this time, the service will return 503 (Service Unavailable)
     * 
     */
    private final @Nullable Integer maxQueueWaitMs;
    /**
     * Details on the models and configurations.
     * 
     */
    private final Map<String,Object> modelConfigMap;
    /**
     * The list of models.
     * 
     */
    private final @Nullable List<ModelResponse> models;
    /**
     * The Kubernetes namespace of the deployment.
     * 
     */
    private final @Nullable String namespace;
    /**
     * The number of replicas on the cluster.
     * 
     */
    private final @Nullable Integer numReplicas;
    /**
     * The service property dictionary. Properties are immutable.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * The scoring timeout in milliseconds.
     * 
     */
    private final @Nullable Integer scoringTimeoutMs;
    /**
     * The Uri for sending scoring requests.
     * 
     */
    private final String scoringUri;
    /**
     * The current state of the service.
     * 
     */
    private final String state;
    /**
     * The Uri for sending swagger requests.
     * 
     */
    private final String swaggerUri;
    /**
     * The amount of traffic variant receives.
     * 
     */
    private final @Nullable Double trafficPercentile;
    /**
     * The type of the variant.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private AKSServiceResponseResponse(
        @OutputCustomType.Parameter("aadAuthEnabled") @Nullable Boolean aadAuthEnabled,
        @OutputCustomType.Parameter("appInsightsEnabled") @Nullable Boolean appInsightsEnabled,
        @OutputCustomType.Parameter("authEnabled") @Nullable Boolean authEnabled,
        @OutputCustomType.Parameter("autoScaler") @Nullable AKSServiceResponseResponseAutoScaler autoScaler,
        @OutputCustomType.Parameter("computeName") @Nullable String computeName,
        @OutputCustomType.Parameter("computeType") String computeType,
        @OutputCustomType.Parameter("containerResourceRequirements") @Nullable ContainerResourceRequirementsResponse containerResourceRequirements,
        @OutputCustomType.Parameter("dataCollection") @Nullable AKSServiceResponseResponseDataCollection dataCollection,
        @OutputCustomType.Parameter("deploymentStatus") AKSServiceResponseResponseDeploymentStatus deploymentStatus,
        @OutputCustomType.Parameter("deploymentType") @Nullable String deploymentType,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("environmentImageRequest") @Nullable AKSServiceResponseResponseEnvironmentImageRequest environmentImageRequest,
        @OutputCustomType.Parameter("error") ServiceResponseBaseResponseError error,
        @OutputCustomType.Parameter("isDefault") @Nullable Boolean isDefault,
        @OutputCustomType.Parameter("kvTags") @Nullable Map<String,String> kvTags,
        @OutputCustomType.Parameter("livenessProbeRequirements") @Nullable AKSServiceResponseResponseLivenessProbeRequirements livenessProbeRequirements,
        @OutputCustomType.Parameter("maxConcurrentRequestsPerContainer") @Nullable Integer maxConcurrentRequestsPerContainer,
        @OutputCustomType.Parameter("maxQueueWaitMs") @Nullable Integer maxQueueWaitMs,
        @OutputCustomType.Parameter("modelConfigMap") Map<String,Object> modelConfigMap,
        @OutputCustomType.Parameter("models") @Nullable List<ModelResponse> models,
        @OutputCustomType.Parameter("namespace") @Nullable String namespace,
        @OutputCustomType.Parameter("numReplicas") @Nullable Integer numReplicas,
        @OutputCustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @OutputCustomType.Parameter("scoringTimeoutMs") @Nullable Integer scoringTimeoutMs,
        @OutputCustomType.Parameter("scoringUri") String scoringUri,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("swaggerUri") String swaggerUri,
        @OutputCustomType.Parameter("trafficPercentile") @Nullable Double trafficPercentile,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.aadAuthEnabled = aadAuthEnabled;
        this.appInsightsEnabled = appInsightsEnabled;
        this.authEnabled = authEnabled;
        this.autoScaler = autoScaler;
        this.computeName = computeName;
        this.computeType = computeType;
        this.containerResourceRequirements = containerResourceRequirements;
        this.dataCollection = dataCollection;
        this.deploymentStatus = deploymentStatus;
        this.deploymentType = deploymentType;
        this.description = description;
        this.environmentImageRequest = environmentImageRequest;
        this.error = error;
        this.isDefault = isDefault;
        this.kvTags = kvTags;
        this.livenessProbeRequirements = livenessProbeRequirements;
        this.maxConcurrentRequestsPerContainer = maxConcurrentRequestsPerContainer;
        this.maxQueueWaitMs = maxQueueWaitMs;
        this.modelConfigMap = modelConfigMap;
        this.models = models;
        this.namespace = namespace;
        this.numReplicas = numReplicas;
        this.properties = properties;
        this.scoringTimeoutMs = scoringTimeoutMs;
        this.scoringUri = scoringUri;
        this.state = state;
        this.swaggerUri = swaggerUri;
        this.trafficPercentile = trafficPercentile;
        this.type = type;
    }

    /**
     * Whether or not AAD authentication is enabled.
     * 
    */
    public Optional<Boolean> getAadAuthEnabled() {
        return Optional.ofNullable(this.aadAuthEnabled);
    }
    /**
     * Whether or not Application Insights is enabled.
     * 
    */
    public Optional<Boolean> getAppInsightsEnabled() {
        return Optional.ofNullable(this.appInsightsEnabled);
    }
    /**
     * Whether or not authentication is enabled.
     * 
    */
    public Optional<Boolean> getAuthEnabled() {
        return Optional.ofNullable(this.authEnabled);
    }
    /**
     * The auto scaler properties.
     * 
    */
    public Optional<AKSServiceResponseResponseAutoScaler> getAutoScaler() {
        return Optional.ofNullable(this.autoScaler);
    }
    /**
     * The name of the compute resource.
     * 
    */
    public Optional<String> getComputeName() {
        return Optional.ofNullable(this.computeName);
    }
    /**
     * The compute environment type for the service.
     * Expected value is 'AKS'.
     * 
    */
    public String getComputeType() {
        return this.computeType;
    }
    /**
     * The container resource requirements.
     * 
    */
    public Optional<ContainerResourceRequirementsResponse> getContainerResourceRequirements() {
        return Optional.ofNullable(this.containerResourceRequirements);
    }
    /**
     * Details of the data collection options specified.
     * 
    */
    public Optional<AKSServiceResponseResponseDataCollection> getDataCollection() {
        return Optional.ofNullable(this.dataCollection);
    }
    /**
     * The deployment status.
     * 
    */
    public AKSServiceResponseResponseDeploymentStatus getDeploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * The deployment type for the service.
     * 
    */
    public Optional<String> getDeploymentType() {
        return Optional.ofNullable(this.deploymentType);
    }
    /**
     * The service description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The Environment, models and assets used for inferencing.
     * 
    */
    public Optional<AKSServiceResponseResponseEnvironmentImageRequest> getEnvironmentImageRequest() {
        return Optional.ofNullable(this.environmentImageRequest);
    }
    /**
     * The error details.
     * 
    */
    public ServiceResponseBaseResponseError getError() {
        return this.error;
    }
    /**
     * Is this the default variant.
     * 
    */
    public Optional<Boolean> getIsDefault() {
        return Optional.ofNullable(this.isDefault);
    }
    /**
     * The service tag dictionary. Tags are mutable.
     * 
    */
    public Map<String,String> getKvTags() {
        return this.kvTags == null ? Map.of() : this.kvTags;
    }
    /**
     * The liveness probe requirements.
     * 
    */
    public Optional<AKSServiceResponseResponseLivenessProbeRequirements> getLivenessProbeRequirements() {
        return Optional.ofNullable(this.livenessProbeRequirements);
    }
    /**
     * The maximum number of concurrent requests per container.
     * 
    */
    public Optional<Integer> getMaxConcurrentRequestsPerContainer() {
        return Optional.ofNullable(this.maxConcurrentRequestsPerContainer);
    }
    /**
     * Maximum time a request will wait in the queue (in milliseconds). After this time, the service will return 503 (Service Unavailable)
     * 
    */
    public Optional<Integer> getMaxQueueWaitMs() {
        return Optional.ofNullable(this.maxQueueWaitMs);
    }
    /**
     * Details on the models and configurations.
     * 
    */
    public Map<String,Object> getModelConfigMap() {
        return this.modelConfigMap;
    }
    /**
     * The list of models.
     * 
    */
    public List<ModelResponse> getModels() {
        return this.models == null ? List.of() : this.models;
    }
    /**
     * The Kubernetes namespace of the deployment.
     * 
    */
    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * The number of replicas on the cluster.
     * 
    */
    public Optional<Integer> getNumReplicas() {
        return Optional.ofNullable(this.numReplicas);
    }
    /**
     * The service property dictionary. Properties are immutable.
     * 
    */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * The scoring timeout in milliseconds.
     * 
    */
    public Optional<Integer> getScoringTimeoutMs() {
        return Optional.ofNullable(this.scoringTimeoutMs);
    }
    /**
     * The Uri for sending scoring requests.
     * 
    */
    public String getScoringUri() {
        return this.scoringUri;
    }
    /**
     * The current state of the service.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The Uri for sending swagger requests.
     * 
    */
    public String getSwaggerUri() {
        return this.swaggerUri;
    }
    /**
     * The amount of traffic variant receives.
     * 
    */
    public Optional<Double> getTrafficPercentile() {
        return Optional.ofNullable(this.trafficPercentile);
    }
    /**
     * The type of the variant.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AKSServiceResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean aadAuthEnabled;
        private @Nullable Boolean appInsightsEnabled;
        private @Nullable Boolean authEnabled;
        private @Nullable AKSServiceResponseResponseAutoScaler autoScaler;
        private @Nullable String computeName;
        private String computeType;
        private @Nullable ContainerResourceRequirementsResponse containerResourceRequirements;
        private @Nullable AKSServiceResponseResponseDataCollection dataCollection;
        private AKSServiceResponseResponseDeploymentStatus deploymentStatus;
        private @Nullable String deploymentType;
        private @Nullable String description;
        private @Nullable AKSServiceResponseResponseEnvironmentImageRequest environmentImageRequest;
        private ServiceResponseBaseResponseError error;
        private @Nullable Boolean isDefault;
        private @Nullable Map<String,String> kvTags;
        private @Nullable AKSServiceResponseResponseLivenessProbeRequirements livenessProbeRequirements;
        private @Nullable Integer maxConcurrentRequestsPerContainer;
        private @Nullable Integer maxQueueWaitMs;
        private Map<String,Object> modelConfigMap;
        private @Nullable List<ModelResponse> models;
        private @Nullable String namespace;
        private @Nullable Integer numReplicas;
        private @Nullable Map<String,String> properties;
        private @Nullable Integer scoringTimeoutMs;
        private String scoringUri;
        private String state;
        private String swaggerUri;
        private @Nullable Double trafficPercentile;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AKSServiceResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadAuthEnabled = defaults.aadAuthEnabled;
    	      this.appInsightsEnabled = defaults.appInsightsEnabled;
    	      this.authEnabled = defaults.authEnabled;
    	      this.autoScaler = defaults.autoScaler;
    	      this.computeName = defaults.computeName;
    	      this.computeType = defaults.computeType;
    	      this.containerResourceRequirements = defaults.containerResourceRequirements;
    	      this.dataCollection = defaults.dataCollection;
    	      this.deploymentStatus = defaults.deploymentStatus;
    	      this.deploymentType = defaults.deploymentType;
    	      this.description = defaults.description;
    	      this.environmentImageRequest = defaults.environmentImageRequest;
    	      this.error = defaults.error;
    	      this.isDefault = defaults.isDefault;
    	      this.kvTags = defaults.kvTags;
    	      this.livenessProbeRequirements = defaults.livenessProbeRequirements;
    	      this.maxConcurrentRequestsPerContainer = defaults.maxConcurrentRequestsPerContainer;
    	      this.maxQueueWaitMs = defaults.maxQueueWaitMs;
    	      this.modelConfigMap = defaults.modelConfigMap;
    	      this.models = defaults.models;
    	      this.namespace = defaults.namespace;
    	      this.numReplicas = defaults.numReplicas;
    	      this.properties = defaults.properties;
    	      this.scoringTimeoutMs = defaults.scoringTimeoutMs;
    	      this.scoringUri = defaults.scoringUri;
    	      this.state = defaults.state;
    	      this.swaggerUri = defaults.swaggerUri;
    	      this.trafficPercentile = defaults.trafficPercentile;
    	      this.type = defaults.type;
        }

        public Builder aadAuthEnabled(@Nullable Boolean aadAuthEnabled) {
            this.aadAuthEnabled = aadAuthEnabled;
            return this;
        }

        public Builder appInsightsEnabled(@Nullable Boolean appInsightsEnabled) {
            this.appInsightsEnabled = appInsightsEnabled;
            return this;
        }

        public Builder authEnabled(@Nullable Boolean authEnabled) {
            this.authEnabled = authEnabled;
            return this;
        }

        public Builder autoScaler(@Nullable AKSServiceResponseResponseAutoScaler autoScaler) {
            this.autoScaler = autoScaler;
            return this;
        }

        public Builder computeName(@Nullable String computeName) {
            this.computeName = computeName;
            return this;
        }

        public Builder computeType(String computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }

        public Builder containerResourceRequirements(@Nullable ContainerResourceRequirementsResponse containerResourceRequirements) {
            this.containerResourceRequirements = containerResourceRequirements;
            return this;
        }

        public Builder dataCollection(@Nullable AKSServiceResponseResponseDataCollection dataCollection) {
            this.dataCollection = dataCollection;
            return this;
        }

        public Builder deploymentStatus(AKSServiceResponseResponseDeploymentStatus deploymentStatus) {
            this.deploymentStatus = Objects.requireNonNull(deploymentStatus);
            return this;
        }

        public Builder deploymentType(@Nullable String deploymentType) {
            this.deploymentType = deploymentType;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder environmentImageRequest(@Nullable AKSServiceResponseResponseEnvironmentImageRequest environmentImageRequest) {
            this.environmentImageRequest = environmentImageRequest;
            return this;
        }

        public Builder error(ServiceResponseBaseResponseError error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder isDefault(@Nullable Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public Builder kvTags(@Nullable Map<String,String> kvTags) {
            this.kvTags = kvTags;
            return this;
        }

        public Builder livenessProbeRequirements(@Nullable AKSServiceResponseResponseLivenessProbeRequirements livenessProbeRequirements) {
            this.livenessProbeRequirements = livenessProbeRequirements;
            return this;
        }

        public Builder maxConcurrentRequestsPerContainer(@Nullable Integer maxConcurrentRequestsPerContainer) {
            this.maxConcurrentRequestsPerContainer = maxConcurrentRequestsPerContainer;
            return this;
        }

        public Builder maxQueueWaitMs(@Nullable Integer maxQueueWaitMs) {
            this.maxQueueWaitMs = maxQueueWaitMs;
            return this;
        }

        public Builder modelConfigMap(Map<String,Object> modelConfigMap) {
            this.modelConfigMap = Objects.requireNonNull(modelConfigMap);
            return this;
        }

        public Builder models(@Nullable List<ModelResponse> models) {
            this.models = models;
            return this;
        }

        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder numReplicas(@Nullable Integer numReplicas) {
            this.numReplicas = numReplicas;
            return this;
        }

        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder scoringTimeoutMs(@Nullable Integer scoringTimeoutMs) {
            this.scoringTimeoutMs = scoringTimeoutMs;
            return this;
        }

        public Builder scoringUri(String scoringUri) {
            this.scoringUri = Objects.requireNonNull(scoringUri);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder swaggerUri(String swaggerUri) {
            this.swaggerUri = Objects.requireNonNull(swaggerUri);
            return this;
        }

        public Builder trafficPercentile(@Nullable Double trafficPercentile) {
            this.trafficPercentile = trafficPercentile;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public AKSServiceResponseResponse build() {
            return new AKSServiceResponseResponse(aadAuthEnabled, appInsightsEnabled, authEnabled, autoScaler, computeName, computeType, containerResourceRequirements, dataCollection, deploymentStatus, deploymentType, description, environmentImageRequest, error, isDefault, kvTags, livenessProbeRequirements, maxConcurrentRequestsPerContainer, maxQueueWaitMs, modelConfigMap, models, namespace, numReplicas, properties, scoringTimeoutMs, scoringUri, state, swaggerUri, trafficPercentile, type);
        }
    }
}
