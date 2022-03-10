// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.BackendPoolResponse;
import io.pulumi.azurenative.network.outputs.BackendPoolsSettingsResponse;
import io.pulumi.azurenative.network.outputs.FrontendEndpointResponse;
import io.pulumi.azurenative.network.outputs.HealthProbeSettingsModelResponse;
import io.pulumi.azurenative.network.outputs.LoadBalancingSettingsModelResponse;
import io.pulumi.azurenative.network.outputs.RoutingRuleResponse;
import io.pulumi.azurenative.network.outputs.RulesEngineResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFrontDoorResult {
    /**
     * Backend pools available to routing rules.
     * 
     */
    private final @Nullable List<BackendPoolResponse> backendPools;
    /**
     * Settings for all backendPools
     * 
     */
    private final @Nullable BackendPoolsSettingsResponse backendPoolsSettings;
    /**
     * The host that each frontendEndpoint must CNAME to.
     * 
     */
    private final String cname;
    /**
     * Operational status of the Front Door load balancer. Permitted values are 'Enabled' or 'Disabled'
     * 
     */
    private final @Nullable String enabledState;
    /**
     * A friendly name for the frontDoor
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * The Id of the frontdoor.
     * 
     */
    private final String frontdoorId;
    /**
     * Frontend endpoints available to routing rules.
     * 
     */
    private final @Nullable List<FrontendEndpointResponse> frontendEndpoints;
    /**
     * Health probe settings associated with this Front Door instance.
     * 
     */
    private final @Nullable List<HealthProbeSettingsModelResponse> healthProbeSettings;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Load balancing settings associated with this Front Door instance.
     * 
     */
    private final @Nullable List<LoadBalancingSettingsModelResponse> loadBalancingSettings;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Provisioning state of the Front Door.
     * 
     */
    private final String provisioningState;
    /**
     * Resource status of the Front Door.
     * 
     */
    private final String resourceState;
    /**
     * Routing rules associated with this Front Door.
     * 
     */
    private final @Nullable List<RoutingRuleResponse> routingRules;
    /**
     * Rules Engine Configurations available to routing rules.
     * 
     */
    private final List<RulesEngineResponse> rulesEngines;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetFrontDoorResult(
        @OutputCustomType.Parameter("backendPools") @Nullable List<BackendPoolResponse> backendPools,
        @OutputCustomType.Parameter("backendPoolsSettings") @Nullable BackendPoolsSettingsResponse backendPoolsSettings,
        @OutputCustomType.Parameter("cname") String cname,
        @OutputCustomType.Parameter("enabledState") @Nullable String enabledState,
        @OutputCustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @OutputCustomType.Parameter("frontdoorId") String frontdoorId,
        @OutputCustomType.Parameter("frontendEndpoints") @Nullable List<FrontendEndpointResponse> frontendEndpoints,
        @OutputCustomType.Parameter("healthProbeSettings") @Nullable List<HealthProbeSettingsModelResponse> healthProbeSettings,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("loadBalancingSettings") @Nullable List<LoadBalancingSettingsModelResponse> loadBalancingSettings,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("resourceState") String resourceState,
        @OutputCustomType.Parameter("routingRules") @Nullable List<RoutingRuleResponse> routingRules,
        @OutputCustomType.Parameter("rulesEngines") List<RulesEngineResponse> rulesEngines,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type) {
        this.backendPools = backendPools;
        this.backendPoolsSettings = backendPoolsSettings;
        this.cname = cname;
        this.enabledState = enabledState;
        this.friendlyName = friendlyName;
        this.frontdoorId = frontdoorId;
        this.frontendEndpoints = frontendEndpoints;
        this.healthProbeSettings = healthProbeSettings;
        this.id = id;
        this.loadBalancingSettings = loadBalancingSettings;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.resourceState = resourceState;
        this.routingRules = routingRules;
        this.rulesEngines = rulesEngines;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Backend pools available to routing rules.
     * 
    */
    public List<BackendPoolResponse> getBackendPools() {
        return this.backendPools == null ? List.of() : this.backendPools;
    }
    /**
     * Settings for all backendPools
     * 
    */
    public Optional<BackendPoolsSettingsResponse> getBackendPoolsSettings() {
        return Optional.ofNullable(this.backendPoolsSettings);
    }
    /**
     * The host that each frontendEndpoint must CNAME to.
     * 
    */
    public String getCname() {
        return this.cname;
    }
    /**
     * Operational status of the Front Door load balancer. Permitted values are 'Enabled' or 'Disabled'
     * 
    */
    public Optional<String> getEnabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    /**
     * A friendly name for the frontDoor
     * 
    */
    public Optional<String> getFriendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * The Id of the frontdoor.
     * 
    */
    public String getFrontdoorId() {
        return this.frontdoorId;
    }
    /**
     * Frontend endpoints available to routing rules.
     * 
    */
    public List<FrontendEndpointResponse> getFrontendEndpoints() {
        return this.frontendEndpoints == null ? List.of() : this.frontendEndpoints;
    }
    /**
     * Health probe settings associated with this Front Door instance.
     * 
    */
    public List<HealthProbeSettingsModelResponse> getHealthProbeSettings() {
        return this.healthProbeSettings == null ? List.of() : this.healthProbeSettings;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Load balancing settings associated with this Front Door instance.
     * 
    */
    public List<LoadBalancingSettingsModelResponse> getLoadBalancingSettings() {
        return this.loadBalancingSettings == null ? List.of() : this.loadBalancingSettings;
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the Front Door.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource status of the Front Door.
     * 
    */
    public String getResourceState() {
        return this.resourceState;
    }
    /**
     * Routing rules associated with this Front Door.
     * 
    */
    public List<RoutingRuleResponse> getRoutingRules() {
        return this.routingRules == null ? List.of() : this.routingRules;
    }
    /**
     * Rules Engine Configurations available to routing rules.
     * 
    */
    public List<RulesEngineResponse> getRulesEngines() {
        return this.rulesEngines;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFrontDoorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BackendPoolResponse> backendPools;
        private @Nullable BackendPoolsSettingsResponse backendPoolsSettings;
        private String cname;
        private @Nullable String enabledState;
        private @Nullable String friendlyName;
        private String frontdoorId;
        private @Nullable List<FrontendEndpointResponse> frontendEndpoints;
        private @Nullable List<HealthProbeSettingsModelResponse> healthProbeSettings;
        private String id;
        private @Nullable List<LoadBalancingSettingsModelResponse> loadBalancingSettings;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private String resourceState;
        private @Nullable List<RoutingRuleResponse> routingRules;
        private List<RulesEngineResponse> rulesEngines;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFrontDoorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPools = defaults.backendPools;
    	      this.backendPoolsSettings = defaults.backendPoolsSettings;
    	      this.cname = defaults.cname;
    	      this.enabledState = defaults.enabledState;
    	      this.friendlyName = defaults.friendlyName;
    	      this.frontdoorId = defaults.frontdoorId;
    	      this.frontendEndpoints = defaults.frontendEndpoints;
    	      this.healthProbeSettings = defaults.healthProbeSettings;
    	      this.id = defaults.id;
    	      this.loadBalancingSettings = defaults.loadBalancingSettings;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceState = defaults.resourceState;
    	      this.routingRules = defaults.routingRules;
    	      this.rulesEngines = defaults.rulesEngines;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder backendPools(@Nullable List<BackendPoolResponse> backendPools) {
            this.backendPools = backendPools;
            return this;
        }

        public Builder backendPoolsSettings(@Nullable BackendPoolsSettingsResponse backendPoolsSettings) {
            this.backendPoolsSettings = backendPoolsSettings;
            return this;
        }

        public Builder cname(String cname) {
            this.cname = Objects.requireNonNull(cname);
            return this;
        }

        public Builder enabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder frontdoorId(String frontdoorId) {
            this.frontdoorId = Objects.requireNonNull(frontdoorId);
            return this;
        }

        public Builder frontendEndpoints(@Nullable List<FrontendEndpointResponse> frontendEndpoints) {
            this.frontendEndpoints = frontendEndpoints;
            return this;
        }

        public Builder healthProbeSettings(@Nullable List<HealthProbeSettingsModelResponse> healthProbeSettings) {
            this.healthProbeSettings = healthProbeSettings;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder loadBalancingSettings(@Nullable List<LoadBalancingSettingsModelResponse> loadBalancingSettings) {
            this.loadBalancingSettings = loadBalancingSettings;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
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

        public Builder resourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder routingRules(@Nullable List<RoutingRuleResponse> routingRules) {
            this.routingRules = routingRules;
            return this;
        }

        public Builder rulesEngines(List<RulesEngineResponse> rulesEngines) {
            this.rulesEngines = Objects.requireNonNull(rulesEngines);
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
        public GetFrontDoorResult build() {
            return new GetFrontDoorResult(backendPools, backendPoolsSettings, cname, enabledState, friendlyName, frontdoorId, frontendEndpoints, healthProbeSettings, id, loadBalancingSettings, location, name, provisioningState, resourceState, routingRules, rulesEngines, tags, type);
        }
    }
}
