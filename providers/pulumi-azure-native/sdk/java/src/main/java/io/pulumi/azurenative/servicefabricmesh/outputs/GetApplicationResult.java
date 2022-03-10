// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.azurenative.servicefabricmesh.outputs.DiagnosticsDescriptionResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.ServiceResourceDescriptionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetApplicationResult {
    /**
     * Internal - used by Visual Studio to setup the debugging session on the local development environment.
     * 
     */
    private final @Nullable String debugParams;
    /**
     * User readable description of the application.
     * 
     */
    private final @Nullable String description;
    /**
     * Describes the diagnostics definition and usage for an application resource.
     * 
     */
    private final @Nullable DiagnosticsDescriptionResponse diagnostics;
    /**
     * Describes the health state of an application resource.
     * 
     */
    private final String healthState;
    /**
     * Fully qualified identifier for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * State of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Names of the services in the application.
     * 
     */
    private final List<String> serviceNames;
    /**
     * Describes the services in the application. This property is used to create or modify services of the application. On get only the name of the service is returned. The service description can be obtained by querying for the service resource.
     * 
     */
    private final @Nullable List<ServiceResourceDescriptionResponse> services;
    /**
     * Status of the application.
     * 
     */
    private final String status;
    /**
     * Gives additional information about the current status of the application.
     * 
     */
    private final String statusDetails;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    private final String type;
    /**
     * When the application's health state is not 'Ok', this additional details from service fabric Health Manager for the user to know why the application is marked unhealthy.
     * 
     */
    private final String unhealthyEvaluation;

    @OutputCustomType.Constructor
    private GetApplicationResult(
        @OutputCustomType.Parameter("debugParams") @Nullable String debugParams,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("diagnostics") @Nullable DiagnosticsDescriptionResponse diagnostics,
        @OutputCustomType.Parameter("healthState") String healthState,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("serviceNames") List<String> serviceNames,
        @OutputCustomType.Parameter("services") @Nullable List<ServiceResourceDescriptionResponse> services,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("statusDetails") String statusDetails,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("unhealthyEvaluation") String unhealthyEvaluation) {
        this.debugParams = debugParams;
        this.description = description;
        this.diagnostics = diagnostics;
        this.healthState = healthState;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.serviceNames = serviceNames;
        this.services = services;
        this.status = status;
        this.statusDetails = statusDetails;
        this.tags = tags;
        this.type = type;
        this.unhealthyEvaluation = unhealthyEvaluation;
    }

    /**
     * Internal - used by Visual Studio to setup the debugging session on the local development environment.
     * 
    */
    public Optional<String> getDebugParams() {
        return Optional.ofNullable(this.debugParams);
    }
    /**
     * User readable description of the application.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Describes the diagnostics definition and usage for an application resource.
     * 
    */
    public Optional<DiagnosticsDescriptionResponse> getDiagnostics() {
        return Optional.ofNullable(this.diagnostics);
    }
    /**
     * Describes the health state of an application resource.
     * 
    */
    public String getHealthState() {
        return this.healthState;
    }
    /**
     * Fully qualified identifier for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * State of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Names of the services in the application.
     * 
    */
    public List<String> getServiceNames() {
        return this.serviceNames;
    }
    /**
     * Describes the services in the application. This property is used to create or modify services of the application. On get only the name of the service is returned. The service description can be obtained by querying for the service resource.
     * 
    */
    public List<ServiceResourceDescriptionResponse> getServices() {
        return this.services == null ? List.of() : this.services;
    }
    /**
     * Status of the application.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Gives additional information about the current status of the application.
     * 
    */
    public String getStatusDetails() {
        return this.statusDetails;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * When the application's health state is not 'Ok', this additional details from service fabric Health Manager for the user to know why the application is marked unhealthy.
     * 
    */
    public String getUnhealthyEvaluation() {
        return this.unhealthyEvaluation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String debugParams;
        private @Nullable String description;
        private @Nullable DiagnosticsDescriptionResponse diagnostics;
        private String healthState;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private List<String> serviceNames;
        private @Nullable List<ServiceResourceDescriptionResponse> services;
        private String status;
        private String statusDetails;
        private @Nullable Map<String,String> tags;
        private String type;
        private String unhealthyEvaluation;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.debugParams = defaults.debugParams;
    	      this.description = defaults.description;
    	      this.diagnostics = defaults.diagnostics;
    	      this.healthState = defaults.healthState;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.serviceNames = defaults.serviceNames;
    	      this.services = defaults.services;
    	      this.status = defaults.status;
    	      this.statusDetails = defaults.statusDetails;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.unhealthyEvaluation = defaults.unhealthyEvaluation;
        }

        public Builder debugParams(@Nullable String debugParams) {
            this.debugParams = debugParams;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder diagnostics(@Nullable DiagnosticsDescriptionResponse diagnostics) {
            this.diagnostics = diagnostics;
            return this;
        }

        public Builder healthState(String healthState) {
            this.healthState = Objects.requireNonNull(healthState);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder serviceNames(List<String> serviceNames) {
            this.serviceNames = Objects.requireNonNull(serviceNames);
            return this;
        }

        public Builder services(@Nullable List<ServiceResourceDescriptionResponse> services) {
            this.services = services;
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder statusDetails(String statusDetails) {
            this.statusDetails = Objects.requireNonNull(statusDetails);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder unhealthyEvaluation(String unhealthyEvaluation) {
            this.unhealthyEvaluation = Objects.requireNonNull(unhealthyEvaluation);
            return this;
        }
        public GetApplicationResult build() {
            return new GetApplicationResult(debugParams, description, diagnostics, healthState, id, location, name, provisioningState, serviceNames, services, status, statusDetails, tags, type, unhealthyEvaluation);
        }
    }
}
