// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewayRequestRoutingRuleResponse {
    /**
     * Backend address pool resource of the application gateway.
     * 
     */
    private final @Nullable SubResourceResponse backendAddressPool;
    /**
     * Backend http settings resource of the application gateway.
     * 
     */
    private final @Nullable SubResourceResponse backendHttpSettings;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Http listener resource of the application gateway.
     * 
     */
    private final @Nullable SubResourceResponse httpListener;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Name of the request routing rule that is unique within an Application Gateway.
     * 
     */
    private final @Nullable String name;
    /**
     * Priority of the request routing rule.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * The provisioning state of the request routing rule resource.
     * 
     */
    private final String provisioningState;
    /**
     * Redirect configuration resource of the application gateway.
     * 
     */
    private final @Nullable SubResourceResponse redirectConfiguration;
    /**
     * Rewrite Rule Set resource in Basic rule of the application gateway.
     * 
     */
    private final @Nullable SubResourceResponse rewriteRuleSet;
    /**
     * Rule type.
     * 
     */
    private final @Nullable String ruleType;
    /**
     * Type of the resource.
     * 
     */
    private final String type;
    /**
     * URL path map resource of the application gateway.
     * 
     */
    private final @Nullable SubResourceResponse urlPathMap;

    @OutputCustomType.Constructor({"backendAddressPool","backendHttpSettings","etag","httpListener","id","name","priority","provisioningState","redirectConfiguration","rewriteRuleSet","ruleType","type","urlPathMap"})
    private ApplicationGatewayRequestRoutingRuleResponse(
        @Nullable SubResourceResponse backendAddressPool,
        @Nullable SubResourceResponse backendHttpSettings,
        String etag,
        @Nullable SubResourceResponse httpListener,
        @Nullable String id,
        @Nullable String name,
        @Nullable Integer priority,
        String provisioningState,
        @Nullable SubResourceResponse redirectConfiguration,
        @Nullable SubResourceResponse rewriteRuleSet,
        @Nullable String ruleType,
        String type,
        @Nullable SubResourceResponse urlPathMap) {
        this.backendAddressPool = backendAddressPool;
        this.backendHttpSettings = backendHttpSettings;
        this.etag = etag;
        this.httpListener = httpListener;
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.provisioningState = provisioningState;
        this.redirectConfiguration = redirectConfiguration;
        this.rewriteRuleSet = rewriteRuleSet;
        this.ruleType = ruleType;
        this.type = type;
        this.urlPathMap = urlPathMap;
    }

    /**
     * Backend address pool resource of the application gateway.
     * 
    */
    public Optional<SubResourceResponse> getBackendAddressPool() {
        return Optional.ofNullable(this.backendAddressPool);
    }
    /**
     * Backend http settings resource of the application gateway.
     * 
    */
    public Optional<SubResourceResponse> getBackendHttpSettings() {
        return Optional.ofNullable(this.backendHttpSettings);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Http listener resource of the application gateway.
     * 
    */
    public Optional<SubResourceResponse> getHttpListener() {
        return Optional.ofNullable(this.httpListener);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Name of the request routing rule that is unique within an Application Gateway.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Priority of the request routing rule.
     * 
    */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * The provisioning state of the request routing rule resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Redirect configuration resource of the application gateway.
     * 
    */
    public Optional<SubResourceResponse> getRedirectConfiguration() {
        return Optional.ofNullable(this.redirectConfiguration);
    }
    /**
     * Rewrite Rule Set resource in Basic rule of the application gateway.
     * 
    */
    public Optional<SubResourceResponse> getRewriteRuleSet() {
        return Optional.ofNullable(this.rewriteRuleSet);
    }
    /**
     * Rule type.
     * 
    */
    public Optional<String> getRuleType() {
        return Optional.ofNullable(this.ruleType);
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * URL path map resource of the application gateway.
     * 
    */
    public Optional<SubResourceResponse> getUrlPathMap() {
        return Optional.ofNullable(this.urlPathMap);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRequestRoutingRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse backendAddressPool;
        private @Nullable SubResourceResponse backendHttpSettings;
        private String etag;
        private @Nullable SubResourceResponse httpListener;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Integer priority;
        private String provisioningState;
        private @Nullable SubResourceResponse redirectConfiguration;
        private @Nullable SubResourceResponse rewriteRuleSet;
        private @Nullable String ruleType;
        private String type;
        private @Nullable SubResourceResponse urlPathMap;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRequestRoutingRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPool = defaults.backendAddressPool;
    	      this.backendHttpSettings = defaults.backendHttpSettings;
    	      this.etag = defaults.etag;
    	      this.httpListener = defaults.httpListener;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.provisioningState = defaults.provisioningState;
    	      this.redirectConfiguration = defaults.redirectConfiguration;
    	      this.rewriteRuleSet = defaults.rewriteRuleSet;
    	      this.ruleType = defaults.ruleType;
    	      this.type = defaults.type;
    	      this.urlPathMap = defaults.urlPathMap;
        }

        public Builder setBackendAddressPool(@Nullable SubResourceResponse backendAddressPool) {
            this.backendAddressPool = backendAddressPool;
            return this;
        }

        public Builder setBackendHttpSettings(@Nullable SubResourceResponse backendHttpSettings) {
            this.backendHttpSettings = backendHttpSettings;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setHttpListener(@Nullable SubResourceResponse httpListener) {
            this.httpListener = httpListener;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRedirectConfiguration(@Nullable SubResourceResponse redirectConfiguration) {
            this.redirectConfiguration = redirectConfiguration;
            return this;
        }

        public Builder setRewriteRuleSet(@Nullable SubResourceResponse rewriteRuleSet) {
            this.rewriteRuleSet = rewriteRuleSet;
            return this;
        }

        public Builder setRuleType(@Nullable String ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUrlPathMap(@Nullable SubResourceResponse urlPathMap) {
            this.urlPathMap = urlPathMap;
            return this;
        }
        public ApplicationGatewayRequestRoutingRuleResponse build() {
            return new ApplicationGatewayRequestRoutingRuleResponse(backendAddressPool, backendHttpSettings, etag, httpListener, id, name, priority, provisioningState, redirectConfiguration, rewriteRuleSet, ruleType, type, urlPathMap);
        }
    }
}
