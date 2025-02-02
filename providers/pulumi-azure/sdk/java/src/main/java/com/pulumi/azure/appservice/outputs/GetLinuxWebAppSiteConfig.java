// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetLinuxWebAppSiteConfigApplicationStack;
import com.pulumi.azure.appservice.outputs.GetLinuxWebAppSiteConfigAutoHealSetting;
import com.pulumi.azure.appservice.outputs.GetLinuxWebAppSiteConfigCor;
import com.pulumi.azure.appservice.outputs.GetLinuxWebAppSiteConfigIpRestriction;
import com.pulumi.azure.appservice.outputs.GetLinuxWebAppSiteConfigScmIpRestriction;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLinuxWebAppSiteConfig {
    /**
     * @return Is this Linux Web App is Always On enabled.
     * 
     */
    private final Boolean alwaysOn;
    /**
     * @return The ID of the APIM configuration for this Linux Web App.
     * 
     */
    private final String apiDefinitionUrl;
    /**
     * @return The ID of the API Management API for this Linux Web App.
     * 
     */
    private final String apiManagementApiId;
    /**
     * @return The command line used to launch this app.
     * 
     */
    private final String appCommandLine;
    /**
     * @return A `application_stack` block as defined above.
     * 
     */
    private final List<GetLinuxWebAppSiteConfigApplicationStack> applicationStacks;
    /**
     * @return Are Auto heal rules be enabled.
     * 
     */
    private final Boolean autoHealEnabled;
    /**
     * @return A `auto_heal_setting` block as defined above.
     * 
     */
    private final List<GetLinuxWebAppSiteConfigAutoHealSetting> autoHealSettings;
    /**
     * @return The Client ID of the Managed Service Identity used for connections to the Azure Container Registry.
     * 
     */
    private final String containerRegistryManagedIdentityClientId;
    /**
     * @return Do connections for Azure Container Registry use Managed Identity.
     * 
     */
    private final Boolean containerRegistryUseManagedIdentity;
    /**
     * @return A `cors` block as defined above.
     * 
     */
    private final List<GetLinuxWebAppSiteConfigCor> cors;
    /**
     * @return The list of Default Documents for the Linux Web App.
     * 
     */
    private final List<String> defaultDocuments;
    /**
     * @return Is Detailed Error Logging enabled.
     * 
     */
    private final Boolean detailedErrorLoggingEnabled;
    /**
     * @return The State of FTP / FTPS service.
     * 
     */
    private final String ftpsState;
    /**
     * @return (Optional) The amount of time in minutes that a node can be unhealthy before being removed from the load balancer. Possible values are between `2` and `10`. Only valid in conjunction with `health_check_path`.
     * 
     */
    private final Integer healthCheckEvictionTimeInMin;
    /**
     * @return The path to the Health Check endpoint.
     * 
     */
    private final String healthCheckPath;
    /**
     * @return Is HTTP2.0 enabled.
     * 
     */
    private final Boolean http2Enabled;
    /**
     * @return A `ip_restriction` block as defined above.
     * 
     */
    private final List<GetLinuxWebAppSiteConfigIpRestriction> ipRestrictions;
    /**
     * @return The `LinuxFXVersion` string.
     * 
     */
    private final String linuxFxVersion;
    /**
     * @return The site Load Balancing Mode.
     * 
     */
    private final String loadBalancingMode;
    /**
     * @return Is the Local MySQL enabled.
     * 
     */
    private final Boolean localMysqlEnabled;
    /**
     * @return The Managed Pipeline Mode.
     * 
     */
    private final String managedPipelineMode;
    /**
     * @return The Minimum version of TLS for requests.
     * 
     */
    private final String minimumTlsVersion;
    private final Boolean remoteDebuggingEnabled;
    /**
     * @return The Remote Debugging Version.
     * 
     */
    private final String remoteDebuggingVersion;
    /**
     * @return A `scm_ip_restriction` block as defined above.
     * 
     */
    private final List<GetLinuxWebAppSiteConfigScmIpRestriction> scmIpRestrictions;
    /**
     * @return The Minimum version of TLS for requests to SCM.
     * 
     */
    private final String scmMinimumTlsVersion;
    /**
     * @return The Source Control Management Type in use.
     * 
     */
    private final String scmType;
    /**
     * @return Is the Linux Web App `ip_restriction` configuration used for the SCM also.
     * 
     */
    private final Boolean scmUseMainIpRestriction;
    /**
     * @return Does the Linux Web App use a 32-bit worker.
     * 
     */
    private final Boolean use32BitWorker;
    private final Boolean vnetRouteAllEnabled;
    /**
     * @return Are Web Sockets enabled?
     * 
     */
    private final Boolean websocketsEnabled;
    /**
     * @return The number of Workers for this Linux App Service.
     * 
     */
    private final Integer workerCount;

    @CustomType.Constructor
    private GetLinuxWebAppSiteConfig(
        @CustomType.Parameter("alwaysOn") Boolean alwaysOn,
        @CustomType.Parameter("apiDefinitionUrl") String apiDefinitionUrl,
        @CustomType.Parameter("apiManagementApiId") String apiManagementApiId,
        @CustomType.Parameter("appCommandLine") String appCommandLine,
        @CustomType.Parameter("applicationStacks") List<GetLinuxWebAppSiteConfigApplicationStack> applicationStacks,
        @CustomType.Parameter("autoHealEnabled") Boolean autoHealEnabled,
        @CustomType.Parameter("autoHealSettings") List<GetLinuxWebAppSiteConfigAutoHealSetting> autoHealSettings,
        @CustomType.Parameter("containerRegistryManagedIdentityClientId") String containerRegistryManagedIdentityClientId,
        @CustomType.Parameter("containerRegistryUseManagedIdentity") Boolean containerRegistryUseManagedIdentity,
        @CustomType.Parameter("cors") List<GetLinuxWebAppSiteConfigCor> cors,
        @CustomType.Parameter("defaultDocuments") List<String> defaultDocuments,
        @CustomType.Parameter("detailedErrorLoggingEnabled") Boolean detailedErrorLoggingEnabled,
        @CustomType.Parameter("ftpsState") String ftpsState,
        @CustomType.Parameter("healthCheckEvictionTimeInMin") Integer healthCheckEvictionTimeInMin,
        @CustomType.Parameter("healthCheckPath") String healthCheckPath,
        @CustomType.Parameter("http2Enabled") Boolean http2Enabled,
        @CustomType.Parameter("ipRestrictions") List<GetLinuxWebAppSiteConfigIpRestriction> ipRestrictions,
        @CustomType.Parameter("linuxFxVersion") String linuxFxVersion,
        @CustomType.Parameter("loadBalancingMode") String loadBalancingMode,
        @CustomType.Parameter("localMysqlEnabled") Boolean localMysqlEnabled,
        @CustomType.Parameter("managedPipelineMode") String managedPipelineMode,
        @CustomType.Parameter("minimumTlsVersion") String minimumTlsVersion,
        @CustomType.Parameter("remoteDebuggingEnabled") Boolean remoteDebuggingEnabled,
        @CustomType.Parameter("remoteDebuggingVersion") String remoteDebuggingVersion,
        @CustomType.Parameter("scmIpRestrictions") List<GetLinuxWebAppSiteConfigScmIpRestriction> scmIpRestrictions,
        @CustomType.Parameter("scmMinimumTlsVersion") String scmMinimumTlsVersion,
        @CustomType.Parameter("scmType") String scmType,
        @CustomType.Parameter("scmUseMainIpRestriction") Boolean scmUseMainIpRestriction,
        @CustomType.Parameter("use32BitWorker") Boolean use32BitWorker,
        @CustomType.Parameter("vnetRouteAllEnabled") Boolean vnetRouteAllEnabled,
        @CustomType.Parameter("websocketsEnabled") Boolean websocketsEnabled,
        @CustomType.Parameter("workerCount") Integer workerCount) {
        this.alwaysOn = alwaysOn;
        this.apiDefinitionUrl = apiDefinitionUrl;
        this.apiManagementApiId = apiManagementApiId;
        this.appCommandLine = appCommandLine;
        this.applicationStacks = applicationStacks;
        this.autoHealEnabled = autoHealEnabled;
        this.autoHealSettings = autoHealSettings;
        this.containerRegistryManagedIdentityClientId = containerRegistryManagedIdentityClientId;
        this.containerRegistryUseManagedIdentity = containerRegistryUseManagedIdentity;
        this.cors = cors;
        this.defaultDocuments = defaultDocuments;
        this.detailedErrorLoggingEnabled = detailedErrorLoggingEnabled;
        this.ftpsState = ftpsState;
        this.healthCheckEvictionTimeInMin = healthCheckEvictionTimeInMin;
        this.healthCheckPath = healthCheckPath;
        this.http2Enabled = http2Enabled;
        this.ipRestrictions = ipRestrictions;
        this.linuxFxVersion = linuxFxVersion;
        this.loadBalancingMode = loadBalancingMode;
        this.localMysqlEnabled = localMysqlEnabled;
        this.managedPipelineMode = managedPipelineMode;
        this.minimumTlsVersion = minimumTlsVersion;
        this.remoteDebuggingEnabled = remoteDebuggingEnabled;
        this.remoteDebuggingVersion = remoteDebuggingVersion;
        this.scmIpRestrictions = scmIpRestrictions;
        this.scmMinimumTlsVersion = scmMinimumTlsVersion;
        this.scmType = scmType;
        this.scmUseMainIpRestriction = scmUseMainIpRestriction;
        this.use32BitWorker = use32BitWorker;
        this.vnetRouteAllEnabled = vnetRouteAllEnabled;
        this.websocketsEnabled = websocketsEnabled;
        this.workerCount = workerCount;
    }

    /**
     * @return Is this Linux Web App is Always On enabled.
     * 
     */
    public Boolean alwaysOn() {
        return this.alwaysOn;
    }
    /**
     * @return The ID of the APIM configuration for this Linux Web App.
     * 
     */
    public String apiDefinitionUrl() {
        return this.apiDefinitionUrl;
    }
    /**
     * @return The ID of the API Management API for this Linux Web App.
     * 
     */
    public String apiManagementApiId() {
        return this.apiManagementApiId;
    }
    /**
     * @return The command line used to launch this app.
     * 
     */
    public String appCommandLine() {
        return this.appCommandLine;
    }
    /**
     * @return A `application_stack` block as defined above.
     * 
     */
    public List<GetLinuxWebAppSiteConfigApplicationStack> applicationStacks() {
        return this.applicationStacks;
    }
    /**
     * @return Are Auto heal rules be enabled.
     * 
     */
    public Boolean autoHealEnabled() {
        return this.autoHealEnabled;
    }
    /**
     * @return A `auto_heal_setting` block as defined above.
     * 
     */
    public List<GetLinuxWebAppSiteConfigAutoHealSetting> autoHealSettings() {
        return this.autoHealSettings;
    }
    /**
     * @return The Client ID of the Managed Service Identity used for connections to the Azure Container Registry.
     * 
     */
    public String containerRegistryManagedIdentityClientId() {
        return this.containerRegistryManagedIdentityClientId;
    }
    /**
     * @return Do connections for Azure Container Registry use Managed Identity.
     * 
     */
    public Boolean containerRegistryUseManagedIdentity() {
        return this.containerRegistryUseManagedIdentity;
    }
    /**
     * @return A `cors` block as defined above.
     * 
     */
    public List<GetLinuxWebAppSiteConfigCor> cors() {
        return this.cors;
    }
    /**
     * @return The list of Default Documents for the Linux Web App.
     * 
     */
    public List<String> defaultDocuments() {
        return this.defaultDocuments;
    }
    /**
     * @return Is Detailed Error Logging enabled.
     * 
     */
    public Boolean detailedErrorLoggingEnabled() {
        return this.detailedErrorLoggingEnabled;
    }
    /**
     * @return The State of FTP / FTPS service.
     * 
     */
    public String ftpsState() {
        return this.ftpsState;
    }
    /**
     * @return (Optional) The amount of time in minutes that a node can be unhealthy before being removed from the load balancer. Possible values are between `2` and `10`. Only valid in conjunction with `health_check_path`.
     * 
     */
    public Integer healthCheckEvictionTimeInMin() {
        return this.healthCheckEvictionTimeInMin;
    }
    /**
     * @return The path to the Health Check endpoint.
     * 
     */
    public String healthCheckPath() {
        return this.healthCheckPath;
    }
    /**
     * @return Is HTTP2.0 enabled.
     * 
     */
    public Boolean http2Enabled() {
        return this.http2Enabled;
    }
    /**
     * @return A `ip_restriction` block as defined above.
     * 
     */
    public List<GetLinuxWebAppSiteConfigIpRestriction> ipRestrictions() {
        return this.ipRestrictions;
    }
    /**
     * @return The `LinuxFXVersion` string.
     * 
     */
    public String linuxFxVersion() {
        return this.linuxFxVersion;
    }
    /**
     * @return The site Load Balancing Mode.
     * 
     */
    public String loadBalancingMode() {
        return this.loadBalancingMode;
    }
    /**
     * @return Is the Local MySQL enabled.
     * 
     */
    public Boolean localMysqlEnabled() {
        return this.localMysqlEnabled;
    }
    /**
     * @return The Managed Pipeline Mode.
     * 
     */
    public String managedPipelineMode() {
        return this.managedPipelineMode;
    }
    /**
     * @return The Minimum version of TLS for requests.
     * 
     */
    public String minimumTlsVersion() {
        return this.minimumTlsVersion;
    }
    public Boolean remoteDebuggingEnabled() {
        return this.remoteDebuggingEnabled;
    }
    /**
     * @return The Remote Debugging Version.
     * 
     */
    public String remoteDebuggingVersion() {
        return this.remoteDebuggingVersion;
    }
    /**
     * @return A `scm_ip_restriction` block as defined above.
     * 
     */
    public List<GetLinuxWebAppSiteConfigScmIpRestriction> scmIpRestrictions() {
        return this.scmIpRestrictions;
    }
    /**
     * @return The Minimum version of TLS for requests to SCM.
     * 
     */
    public String scmMinimumTlsVersion() {
        return this.scmMinimumTlsVersion;
    }
    /**
     * @return The Source Control Management Type in use.
     * 
     */
    public String scmType() {
        return this.scmType;
    }
    /**
     * @return Is the Linux Web App `ip_restriction` configuration used for the SCM also.
     * 
     */
    public Boolean scmUseMainIpRestriction() {
        return this.scmUseMainIpRestriction;
    }
    /**
     * @return Does the Linux Web App use a 32-bit worker.
     * 
     */
    public Boolean use32BitWorker() {
        return this.use32BitWorker;
    }
    public Boolean vnetRouteAllEnabled() {
        return this.vnetRouteAllEnabled;
    }
    /**
     * @return Are Web Sockets enabled?
     * 
     */
    public Boolean websocketsEnabled() {
        return this.websocketsEnabled;
    }
    /**
     * @return The number of Workers for this Linux App Service.
     * 
     */
    public Integer workerCount() {
        return this.workerCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxWebAppSiteConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean alwaysOn;
        private String apiDefinitionUrl;
        private String apiManagementApiId;
        private String appCommandLine;
        private List<GetLinuxWebAppSiteConfigApplicationStack> applicationStacks;
        private Boolean autoHealEnabled;
        private List<GetLinuxWebAppSiteConfigAutoHealSetting> autoHealSettings;
        private String containerRegistryManagedIdentityClientId;
        private Boolean containerRegistryUseManagedIdentity;
        private List<GetLinuxWebAppSiteConfigCor> cors;
        private List<String> defaultDocuments;
        private Boolean detailedErrorLoggingEnabled;
        private String ftpsState;
        private Integer healthCheckEvictionTimeInMin;
        private String healthCheckPath;
        private Boolean http2Enabled;
        private List<GetLinuxWebAppSiteConfigIpRestriction> ipRestrictions;
        private String linuxFxVersion;
        private String loadBalancingMode;
        private Boolean localMysqlEnabled;
        private String managedPipelineMode;
        private String minimumTlsVersion;
        private Boolean remoteDebuggingEnabled;
        private String remoteDebuggingVersion;
        private List<GetLinuxWebAppSiteConfigScmIpRestriction> scmIpRestrictions;
        private String scmMinimumTlsVersion;
        private String scmType;
        private Boolean scmUseMainIpRestriction;
        private Boolean use32BitWorker;
        private Boolean vnetRouteAllEnabled;
        private Boolean websocketsEnabled;
        private Integer workerCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinuxWebAppSiteConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysOn = defaults.alwaysOn;
    	      this.apiDefinitionUrl = defaults.apiDefinitionUrl;
    	      this.apiManagementApiId = defaults.apiManagementApiId;
    	      this.appCommandLine = defaults.appCommandLine;
    	      this.applicationStacks = defaults.applicationStacks;
    	      this.autoHealEnabled = defaults.autoHealEnabled;
    	      this.autoHealSettings = defaults.autoHealSettings;
    	      this.containerRegistryManagedIdentityClientId = defaults.containerRegistryManagedIdentityClientId;
    	      this.containerRegistryUseManagedIdentity = defaults.containerRegistryUseManagedIdentity;
    	      this.cors = defaults.cors;
    	      this.defaultDocuments = defaults.defaultDocuments;
    	      this.detailedErrorLoggingEnabled = defaults.detailedErrorLoggingEnabled;
    	      this.ftpsState = defaults.ftpsState;
    	      this.healthCheckEvictionTimeInMin = defaults.healthCheckEvictionTimeInMin;
    	      this.healthCheckPath = defaults.healthCheckPath;
    	      this.http2Enabled = defaults.http2Enabled;
    	      this.ipRestrictions = defaults.ipRestrictions;
    	      this.linuxFxVersion = defaults.linuxFxVersion;
    	      this.loadBalancingMode = defaults.loadBalancingMode;
    	      this.localMysqlEnabled = defaults.localMysqlEnabled;
    	      this.managedPipelineMode = defaults.managedPipelineMode;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.remoteDebuggingEnabled = defaults.remoteDebuggingEnabled;
    	      this.remoteDebuggingVersion = defaults.remoteDebuggingVersion;
    	      this.scmIpRestrictions = defaults.scmIpRestrictions;
    	      this.scmMinimumTlsVersion = defaults.scmMinimumTlsVersion;
    	      this.scmType = defaults.scmType;
    	      this.scmUseMainIpRestriction = defaults.scmUseMainIpRestriction;
    	      this.use32BitWorker = defaults.use32BitWorker;
    	      this.vnetRouteAllEnabled = defaults.vnetRouteAllEnabled;
    	      this.websocketsEnabled = defaults.websocketsEnabled;
    	      this.workerCount = defaults.workerCount;
        }

        public Builder alwaysOn(Boolean alwaysOn) {
            this.alwaysOn = Objects.requireNonNull(alwaysOn);
            return this;
        }
        public Builder apiDefinitionUrl(String apiDefinitionUrl) {
            this.apiDefinitionUrl = Objects.requireNonNull(apiDefinitionUrl);
            return this;
        }
        public Builder apiManagementApiId(String apiManagementApiId) {
            this.apiManagementApiId = Objects.requireNonNull(apiManagementApiId);
            return this;
        }
        public Builder appCommandLine(String appCommandLine) {
            this.appCommandLine = Objects.requireNonNull(appCommandLine);
            return this;
        }
        public Builder applicationStacks(List<GetLinuxWebAppSiteConfigApplicationStack> applicationStacks) {
            this.applicationStacks = Objects.requireNonNull(applicationStacks);
            return this;
        }
        public Builder applicationStacks(GetLinuxWebAppSiteConfigApplicationStack... applicationStacks) {
            return applicationStacks(List.of(applicationStacks));
        }
        public Builder autoHealEnabled(Boolean autoHealEnabled) {
            this.autoHealEnabled = Objects.requireNonNull(autoHealEnabled);
            return this;
        }
        public Builder autoHealSettings(List<GetLinuxWebAppSiteConfigAutoHealSetting> autoHealSettings) {
            this.autoHealSettings = Objects.requireNonNull(autoHealSettings);
            return this;
        }
        public Builder autoHealSettings(GetLinuxWebAppSiteConfigAutoHealSetting... autoHealSettings) {
            return autoHealSettings(List.of(autoHealSettings));
        }
        public Builder containerRegistryManagedIdentityClientId(String containerRegistryManagedIdentityClientId) {
            this.containerRegistryManagedIdentityClientId = Objects.requireNonNull(containerRegistryManagedIdentityClientId);
            return this;
        }
        public Builder containerRegistryUseManagedIdentity(Boolean containerRegistryUseManagedIdentity) {
            this.containerRegistryUseManagedIdentity = Objects.requireNonNull(containerRegistryUseManagedIdentity);
            return this;
        }
        public Builder cors(List<GetLinuxWebAppSiteConfigCor> cors) {
            this.cors = Objects.requireNonNull(cors);
            return this;
        }
        public Builder cors(GetLinuxWebAppSiteConfigCor... cors) {
            return cors(List.of(cors));
        }
        public Builder defaultDocuments(List<String> defaultDocuments) {
            this.defaultDocuments = Objects.requireNonNull(defaultDocuments);
            return this;
        }
        public Builder defaultDocuments(String... defaultDocuments) {
            return defaultDocuments(List.of(defaultDocuments));
        }
        public Builder detailedErrorLoggingEnabled(Boolean detailedErrorLoggingEnabled) {
            this.detailedErrorLoggingEnabled = Objects.requireNonNull(detailedErrorLoggingEnabled);
            return this;
        }
        public Builder ftpsState(String ftpsState) {
            this.ftpsState = Objects.requireNonNull(ftpsState);
            return this;
        }
        public Builder healthCheckEvictionTimeInMin(Integer healthCheckEvictionTimeInMin) {
            this.healthCheckEvictionTimeInMin = Objects.requireNonNull(healthCheckEvictionTimeInMin);
            return this;
        }
        public Builder healthCheckPath(String healthCheckPath) {
            this.healthCheckPath = Objects.requireNonNull(healthCheckPath);
            return this;
        }
        public Builder http2Enabled(Boolean http2Enabled) {
            this.http2Enabled = Objects.requireNonNull(http2Enabled);
            return this;
        }
        public Builder ipRestrictions(List<GetLinuxWebAppSiteConfigIpRestriction> ipRestrictions) {
            this.ipRestrictions = Objects.requireNonNull(ipRestrictions);
            return this;
        }
        public Builder ipRestrictions(GetLinuxWebAppSiteConfigIpRestriction... ipRestrictions) {
            return ipRestrictions(List.of(ipRestrictions));
        }
        public Builder linuxFxVersion(String linuxFxVersion) {
            this.linuxFxVersion = Objects.requireNonNull(linuxFxVersion);
            return this;
        }
        public Builder loadBalancingMode(String loadBalancingMode) {
            this.loadBalancingMode = Objects.requireNonNull(loadBalancingMode);
            return this;
        }
        public Builder localMysqlEnabled(Boolean localMysqlEnabled) {
            this.localMysqlEnabled = Objects.requireNonNull(localMysqlEnabled);
            return this;
        }
        public Builder managedPipelineMode(String managedPipelineMode) {
            this.managedPipelineMode = Objects.requireNonNull(managedPipelineMode);
            return this;
        }
        public Builder minimumTlsVersion(String minimumTlsVersion) {
            this.minimumTlsVersion = Objects.requireNonNull(minimumTlsVersion);
            return this;
        }
        public Builder remoteDebuggingEnabled(Boolean remoteDebuggingEnabled) {
            this.remoteDebuggingEnabled = Objects.requireNonNull(remoteDebuggingEnabled);
            return this;
        }
        public Builder remoteDebuggingVersion(String remoteDebuggingVersion) {
            this.remoteDebuggingVersion = Objects.requireNonNull(remoteDebuggingVersion);
            return this;
        }
        public Builder scmIpRestrictions(List<GetLinuxWebAppSiteConfigScmIpRestriction> scmIpRestrictions) {
            this.scmIpRestrictions = Objects.requireNonNull(scmIpRestrictions);
            return this;
        }
        public Builder scmIpRestrictions(GetLinuxWebAppSiteConfigScmIpRestriction... scmIpRestrictions) {
            return scmIpRestrictions(List.of(scmIpRestrictions));
        }
        public Builder scmMinimumTlsVersion(String scmMinimumTlsVersion) {
            this.scmMinimumTlsVersion = Objects.requireNonNull(scmMinimumTlsVersion);
            return this;
        }
        public Builder scmType(String scmType) {
            this.scmType = Objects.requireNonNull(scmType);
            return this;
        }
        public Builder scmUseMainIpRestriction(Boolean scmUseMainIpRestriction) {
            this.scmUseMainIpRestriction = Objects.requireNonNull(scmUseMainIpRestriction);
            return this;
        }
        public Builder use32BitWorker(Boolean use32BitWorker) {
            this.use32BitWorker = Objects.requireNonNull(use32BitWorker);
            return this;
        }
        public Builder vnetRouteAllEnabled(Boolean vnetRouteAllEnabled) {
            this.vnetRouteAllEnabled = Objects.requireNonNull(vnetRouteAllEnabled);
            return this;
        }
        public Builder websocketsEnabled(Boolean websocketsEnabled) {
            this.websocketsEnabled = Objects.requireNonNull(websocketsEnabled);
            return this;
        }
        public Builder workerCount(Integer workerCount) {
            this.workerCount = Objects.requireNonNull(workerCount);
            return this;
        }        public GetLinuxWebAppSiteConfig build() {
            return new GetLinuxWebAppSiteConfig(alwaysOn, apiDefinitionUrl, apiManagementApiId, appCommandLine, applicationStacks, autoHealEnabled, autoHealSettings, containerRegistryManagedIdentityClientId, containerRegistryUseManagedIdentity, cors, defaultDocuments, detailedErrorLoggingEnabled, ftpsState, healthCheckEvictionTimeInMin, healthCheckPath, http2Enabled, ipRestrictions, linuxFxVersion, loadBalancingMode, localMysqlEnabled, managedPipelineMode, minimumTlsVersion, remoteDebuggingEnabled, remoteDebuggingVersion, scmIpRestrictions, scmMinimumTlsVersion, scmType, scmUseMainIpRestriction, use32BitWorker, vnetRouteAllEnabled, websocketsEnabled, workerCount);
        }
    }
}
