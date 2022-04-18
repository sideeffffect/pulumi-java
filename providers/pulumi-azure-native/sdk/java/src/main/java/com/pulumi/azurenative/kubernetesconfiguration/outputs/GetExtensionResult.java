// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration.outputs;

import com.pulumi.azurenative.kubernetesconfiguration.outputs.ConfigurationIdentityResponse;
import com.pulumi.azurenative.kubernetesconfiguration.outputs.ErrorDefinitionResponse;
import com.pulumi.azurenative.kubernetesconfiguration.outputs.ExtensionStatusResponse;
import com.pulumi.azurenative.kubernetesconfiguration.outputs.ScopeResponse;
import com.pulumi.azurenative.kubernetesconfiguration.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetExtensionResult {
    /**
     * Flag to note if this instance participates in auto upgrade of minor version, or not.
     * 
     */
    private final @Nullable Boolean autoUpgradeMinorVersion;
    /**
     * Configuration settings that are sensitive, as name-value pairs for configuring this instance of the extension.
     * 
     */
    private final @Nullable Map<String,String> configurationProtectedSettings;
    /**
     * Configuration settings, as name-value pairs for configuring this instance of the extension.
     * 
     */
    private final @Nullable Map<String,String> configurationSettings;
    /**
     * DateLiteral (per ISO8601) noting the time the resource was created by the client (user).
     * 
     */
    private final String creationTime;
    /**
     * Error information from the Agent - e.g. errors during installation.
     * 
     */
    private final ErrorDefinitionResponse errorInfo;
    /**
     * Type of the Extension, of which this resource is an instance of.  It must be one of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
     * 
     */
    private final @Nullable String extensionType;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * The identity of the configuration.
     * 
     */
    private final @Nullable ConfigurationIdentityResponse identity;
    /**
     * Status of installation of this instance of the extension.
     * 
     */
    private final String installState;
    /**
     * DateLiteral (per ISO8601) noting the time the resource was modified by the client (user).
     * 
     */
    private final String lastModifiedTime;
    /**
     * DateLiteral (per ISO8601) noting the time of last status from the agent.
     * 
     */
    private final String lastStatusTime;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * ReleaseTrain this extension instance participates in for auto-upgrade (e.g. Stable, Preview, etc.) - only if autoUpgradeMinorVersion is 'true'.
     * 
     */
    private final @Nullable String releaseTrain;
    /**
     * Scope at which the extension instance is installed.
     * 
     */
    private final @Nullable ScopeResponse scope;
    /**
     * Status from this instance of the extension.
     * 
     */
    private final @Nullable List<ExtensionStatusResponse> statuses;
    /**
     * Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    private final @Nullable SystemDataResponse systemData;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * Version of the extension for this extension instance, if it is 'pinned' to a specific version. autoUpgradeMinorVersion must be 'false'.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private GetExtensionResult(
        @CustomType.Parameter("autoUpgradeMinorVersion") @Nullable Boolean autoUpgradeMinorVersion,
        @CustomType.Parameter("configurationProtectedSettings") @Nullable Map<String,String> configurationProtectedSettings,
        @CustomType.Parameter("configurationSettings") @Nullable Map<String,String> configurationSettings,
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("errorInfo") ErrorDefinitionResponse errorInfo,
        @CustomType.Parameter("extensionType") @Nullable String extensionType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable ConfigurationIdentityResponse identity,
        @CustomType.Parameter("installState") String installState,
        @CustomType.Parameter("lastModifiedTime") String lastModifiedTime,
        @CustomType.Parameter("lastStatusTime") String lastStatusTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("releaseTrain") @Nullable String releaseTrain,
        @CustomType.Parameter("scope") @Nullable ScopeResponse scope,
        @CustomType.Parameter("statuses") @Nullable List<ExtensionStatusResponse> statuses,
        @CustomType.Parameter("systemData") @Nullable SystemDataResponse systemData,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") @Nullable String version) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.configurationProtectedSettings = configurationProtectedSettings;
        this.configurationSettings = configurationSettings;
        this.creationTime = creationTime;
        this.errorInfo = errorInfo;
        this.extensionType = extensionType;
        this.id = id;
        this.identity = identity;
        this.installState = installState;
        this.lastModifiedTime = lastModifiedTime;
        this.lastStatusTime = lastStatusTime;
        this.name = name;
        this.releaseTrain = releaseTrain;
        this.scope = scope;
        this.statuses = statuses;
        this.systemData = systemData;
        this.type = type;
        this.version = version;
    }

    /**
     * Flag to note if this instance participates in auto upgrade of minor version, or not.
     * 
    */
    public Optional<Boolean> autoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }
    /**
     * Configuration settings that are sensitive, as name-value pairs for configuring this instance of the extension.
     * 
    */
    public Map<String,String> configurationProtectedSettings() {
        return this.configurationProtectedSettings == null ? Map.of() : this.configurationProtectedSettings;
    }
    /**
     * Configuration settings, as name-value pairs for configuring this instance of the extension.
     * 
    */
    public Map<String,String> configurationSettings() {
        return this.configurationSettings == null ? Map.of() : this.configurationSettings;
    }
    /**
     * DateLiteral (per ISO8601) noting the time the resource was created by the client (user).
     * 
    */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * Error information from the Agent - e.g. errors during installation.
     * 
    */
    public ErrorDefinitionResponse errorInfo() {
        return this.errorInfo;
    }
    /**
     * Type of the Extension, of which this resource is an instance of.  It must be one of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
     * 
    */
    public Optional<String> extensionType() {
        return Optional.ofNullable(this.extensionType);
    }
    /**
     * Resource Id
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The identity of the configuration.
     * 
    */
    public Optional<ConfigurationIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Status of installation of this instance of the extension.
     * 
    */
    public String installState() {
        return this.installState;
    }
    /**
     * DateLiteral (per ISO8601) noting the time the resource was modified by the client (user).
     * 
    */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * DateLiteral (per ISO8601) noting the time of last status from the agent.
     * 
    */
    public String lastStatusTime() {
        return this.lastStatusTime;
    }
    /**
     * Resource name
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * ReleaseTrain this extension instance participates in for auto-upgrade (e.g. Stable, Preview, etc.) - only if autoUpgradeMinorVersion is 'true'.
     * 
    */
    public Optional<String> releaseTrain() {
        return Optional.ofNullable(this.releaseTrain);
    }
    /**
     * Scope at which the extension instance is installed.
     * 
    */
    public Optional<ScopeResponse> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * Status from this instance of the extension.
     * 
    */
    public List<ExtensionStatusResponse> statuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }
    /**
     * Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
    */
    public Optional<SystemDataResponse> systemData() {
        return Optional.ofNullable(this.systemData);
    }
    /**
     * Resource type
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Version of the extension for this extension instance, if it is 'pinned' to a specific version. autoUpgradeMinorVersion must be 'false'.
     * 
    */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExtensionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoUpgradeMinorVersion;
        private @Nullable Map<String,String> configurationProtectedSettings;
        private @Nullable Map<String,String> configurationSettings;
        private String creationTime;
        private ErrorDefinitionResponse errorInfo;
        private @Nullable String extensionType;
        private String id;
        private @Nullable ConfigurationIdentityResponse identity;
        private String installState;
        private String lastModifiedTime;
        private String lastStatusTime;
        private String name;
        private @Nullable String releaseTrain;
        private @Nullable ScopeResponse scope;
        private @Nullable List<ExtensionStatusResponse> statuses;
        private @Nullable SystemDataResponse systemData;
        private String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExtensionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.configurationProtectedSettings = defaults.configurationProtectedSettings;
    	      this.configurationSettings = defaults.configurationSettings;
    	      this.creationTime = defaults.creationTime;
    	      this.errorInfo = defaults.errorInfo;
    	      this.extensionType = defaults.extensionType;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.installState = defaults.installState;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.lastStatusTime = defaults.lastStatusTime;
    	      this.name = defaults.name;
    	      this.releaseTrain = defaults.releaseTrain;
    	      this.scope = defaults.scope;
    	      this.statuses = defaults.statuses;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder autoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }
        public Builder configurationProtectedSettings(@Nullable Map<String,String> configurationProtectedSettings) {
            this.configurationProtectedSettings = configurationProtectedSettings;
            return this;
        }
        public Builder configurationSettings(@Nullable Map<String,String> configurationSettings) {
            this.configurationSettings = configurationSettings;
            return this;
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder errorInfo(ErrorDefinitionResponse errorInfo) {
            this.errorInfo = Objects.requireNonNull(errorInfo);
            return this;
        }
        public Builder extensionType(@Nullable String extensionType) {
            this.extensionType = extensionType;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable ConfigurationIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder installState(String installState) {
            this.installState = Objects.requireNonNull(installState);
            return this;
        }
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }
        public Builder lastStatusTime(String lastStatusTime) {
            this.lastStatusTime = Objects.requireNonNull(lastStatusTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder releaseTrain(@Nullable String releaseTrain) {
            this.releaseTrain = releaseTrain;
            return this;
        }
        public Builder scope(@Nullable ScopeResponse scope) {
            this.scope = scope;
            return this;
        }
        public Builder statuses(@Nullable List<ExtensionStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }
        public Builder statuses(ExtensionStatusResponse... statuses) {
            return statuses(List.of(statuses));
        }
        public Builder systemData(@Nullable SystemDataResponse systemData) {
            this.systemData = systemData;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public GetExtensionResult build() {
            return new GetExtensionResult(autoUpgradeMinorVersion, configurationProtectedSettings, configurationSettings, creationTime, errorInfo, extensionType, id, identity, installState, lastModifiedTime, lastStatusTime, name, releaseTrain, scope, statuses, systemData, type, version);
        }
    }
}
