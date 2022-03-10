// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ApplicationGatewayPathRuleResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewayUrlPathMapResponse {
    /**
     * Default backend address pool resource of URL path map.
     * 
     */
    private final @Nullable SubResourceResponse defaultBackendAddressPool;
    /**
     * Default backend http settings resource of URL path map.
     * 
     */
    private final @Nullable SubResourceResponse defaultBackendHttpSettings;
    /**
     * Default redirect configuration resource of URL path map.
     * 
     */
    private final @Nullable SubResourceResponse defaultRedirectConfiguration;
    /**
     * Default Rewrite rule set resource of URL path map.
     * 
     */
    private final @Nullable SubResourceResponse defaultRewriteRuleSet;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Name of the URL path map that is unique within an Application Gateway.
     * 
     */
    private final @Nullable String name;
    /**
     * Path rule of URL path map resource.
     * 
     */
    private final @Nullable List<ApplicationGatewayPathRuleResponse> pathRules;
    /**
     * The provisioning state of the URL path map resource.
     * 
     */
    private final String provisioningState;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ApplicationGatewayUrlPathMapResponse(
        @OutputCustomType.Parameter("defaultBackendAddressPool") @Nullable SubResourceResponse defaultBackendAddressPool,
        @OutputCustomType.Parameter("defaultBackendHttpSettings") @Nullable SubResourceResponse defaultBackendHttpSettings,
        @OutputCustomType.Parameter("defaultRedirectConfiguration") @Nullable SubResourceResponse defaultRedirectConfiguration,
        @OutputCustomType.Parameter("defaultRewriteRuleSet") @Nullable SubResourceResponse defaultRewriteRuleSet,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("pathRules") @Nullable List<ApplicationGatewayPathRuleResponse> pathRules,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("type") String type) {
        this.defaultBackendAddressPool = defaultBackendAddressPool;
        this.defaultBackendHttpSettings = defaultBackendHttpSettings;
        this.defaultRedirectConfiguration = defaultRedirectConfiguration;
        this.defaultRewriteRuleSet = defaultRewriteRuleSet;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.pathRules = pathRules;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * Default backend address pool resource of URL path map.
     * 
    */
    public Optional<SubResourceResponse> getDefaultBackendAddressPool() {
        return Optional.ofNullable(this.defaultBackendAddressPool);
    }
    /**
     * Default backend http settings resource of URL path map.
     * 
    */
    public Optional<SubResourceResponse> getDefaultBackendHttpSettings() {
        return Optional.ofNullable(this.defaultBackendHttpSettings);
    }
    /**
     * Default redirect configuration resource of URL path map.
     * 
    */
    public Optional<SubResourceResponse> getDefaultRedirectConfiguration() {
        return Optional.ofNullable(this.defaultRedirectConfiguration);
    }
    /**
     * Default Rewrite rule set resource of URL path map.
     * 
    */
    public Optional<SubResourceResponse> getDefaultRewriteRuleSet() {
        return Optional.ofNullable(this.defaultRewriteRuleSet);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Name of the URL path map that is unique within an Application Gateway.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Path rule of URL path map resource.
     * 
    */
    public List<ApplicationGatewayPathRuleResponse> getPathRules() {
        return this.pathRules == null ? List.of() : this.pathRules;
    }
    /**
     * The provisioning state of the URL path map resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayUrlPathMapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse defaultBackendAddressPool;
        private @Nullable SubResourceResponse defaultBackendHttpSettings;
        private @Nullable SubResourceResponse defaultRedirectConfiguration;
        private @Nullable SubResourceResponse defaultRewriteRuleSet;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable List<ApplicationGatewayPathRuleResponse> pathRules;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayUrlPathMapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultBackendAddressPool = defaults.defaultBackendAddressPool;
    	      this.defaultBackendHttpSettings = defaults.defaultBackendHttpSettings;
    	      this.defaultRedirectConfiguration = defaults.defaultRedirectConfiguration;
    	      this.defaultRewriteRuleSet = defaults.defaultRewriteRuleSet;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.pathRules = defaults.pathRules;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder defaultBackendAddressPool(@Nullable SubResourceResponse defaultBackendAddressPool) {
            this.defaultBackendAddressPool = defaultBackendAddressPool;
            return this;
        }

        public Builder defaultBackendHttpSettings(@Nullable SubResourceResponse defaultBackendHttpSettings) {
            this.defaultBackendHttpSettings = defaultBackendHttpSettings;
            return this;
        }

        public Builder defaultRedirectConfiguration(@Nullable SubResourceResponse defaultRedirectConfiguration) {
            this.defaultRedirectConfiguration = defaultRedirectConfiguration;
            return this;
        }

        public Builder defaultRewriteRuleSet(@Nullable SubResourceResponse defaultRewriteRuleSet) {
            this.defaultRewriteRuleSet = defaultRewriteRuleSet;
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder pathRules(@Nullable List<ApplicationGatewayPathRuleResponse> pathRules) {
            this.pathRules = pathRules;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ApplicationGatewayUrlPathMapResponse build() {
            return new ApplicationGatewayUrlPathMapResponse(defaultBackendAddressPool, defaultBackendHttpSettings, defaultRedirectConfiguration, defaultRewriteRuleSet, etag, id, name, pathRules, provisioningState, type);
        }
    }
}
