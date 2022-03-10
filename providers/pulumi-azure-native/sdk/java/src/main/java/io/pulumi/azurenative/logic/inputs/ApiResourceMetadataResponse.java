// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.ApiDeploymentParameterMetadataSetResponse;
import io.pulumi.azurenative.logic.inputs.WsdlServiceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The api resource metadata.
 * 
 */
public final class ApiResourceMetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiResourceMetadataResponse Empty = new ApiResourceMetadataResponse();

    /**
     * The api type.
     * 
     */
    @InputImport(name="apiType")
      private final @Nullable String apiType;

    public Optional<String> getApiType() {
        return this.apiType == null ? Optional.empty() : Optional.ofNullable(this.apiType);
    }

    /**
     * The brand color.
     * 
     */
    @InputImport(name="brandColor")
      private final @Nullable String brandColor;

    public Optional<String> getBrandColor() {
        return this.brandColor == null ? Optional.empty() : Optional.ofNullable(this.brandColor);
    }

    /**
     * The connection type.
     * 
     */
    @InputImport(name="connectionType")
      private final @Nullable String connectionType;

    public Optional<String> getConnectionType() {
        return this.connectionType == null ? Optional.empty() : Optional.ofNullable(this.connectionType);
    }

    /**
     * The connector deployment parameters metadata.
     * 
     */
    @InputImport(name="deploymentParameters")
      private final @Nullable ApiDeploymentParameterMetadataSetResponse deploymentParameters;

    public Optional<ApiDeploymentParameterMetadataSetResponse> getDeploymentParameters() {
        return this.deploymentParameters == null ? Optional.empty() : Optional.ofNullable(this.deploymentParameters);
    }

    /**
     * The hide key.
     * 
     */
    @InputImport(name="hideKey")
      private final @Nullable String hideKey;

    public Optional<String> getHideKey() {
        return this.hideKey == null ? Optional.empty() : Optional.ofNullable(this.hideKey);
    }

    /**
     * The provisioning state.
     * 
     */
    @InputImport(name="provisioningState")
      private final @Nullable String provisioningState;

    public Optional<String> getProvisioningState() {
        return this.provisioningState == null ? Optional.empty() : Optional.ofNullable(this.provisioningState);
    }

    /**
     * The source.
     * 
     */
    @InputImport(name="source")
      private final @Nullable String source;

    public Optional<String> getSource() {
        return this.source == null ? Optional.empty() : Optional.ofNullable(this.source);
    }

    /**
     * The tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * The WSDL import method.
     * 
     */
    @InputImport(name="wsdlImportMethod")
      private final @Nullable String wsdlImportMethod;

    public Optional<String> getWsdlImportMethod() {
        return this.wsdlImportMethod == null ? Optional.empty() : Optional.ofNullable(this.wsdlImportMethod);
    }

    /**
     * The WSDL service.
     * 
     */
    @InputImport(name="wsdlService")
      private final @Nullable WsdlServiceResponse wsdlService;

    public Optional<WsdlServiceResponse> getWsdlService() {
        return this.wsdlService == null ? Optional.empty() : Optional.ofNullable(this.wsdlService);
    }

    public ApiResourceMetadataResponse(
        @Nullable String apiType,
        @Nullable String brandColor,
        @Nullable String connectionType,
        @Nullable ApiDeploymentParameterMetadataSetResponse deploymentParameters,
        @Nullable String hideKey,
        @Nullable String provisioningState,
        @Nullable String source,
        @Nullable Map<String,String> tags,
        @Nullable String wsdlImportMethod,
        @Nullable WsdlServiceResponse wsdlService) {
        this.apiType = apiType;
        this.brandColor = brandColor;
        this.connectionType = connectionType;
        this.deploymentParameters = deploymentParameters;
        this.hideKey = hideKey;
        this.provisioningState = provisioningState;
        this.source = source;
        this.tags = tags;
        this.wsdlImportMethod = wsdlImportMethod;
        this.wsdlService = wsdlService;
    }

    private ApiResourceMetadataResponse() {
        this.apiType = null;
        this.brandColor = null;
        this.connectionType = null;
        this.deploymentParameters = null;
        this.hideKey = null;
        this.provisioningState = null;
        this.source = null;
        this.tags = Map.of();
        this.wsdlImportMethod = null;
        this.wsdlService = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiResourceMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiType;
        private @Nullable String brandColor;
        private @Nullable String connectionType;
        private @Nullable ApiDeploymentParameterMetadataSetResponse deploymentParameters;
        private @Nullable String hideKey;
        private @Nullable String provisioningState;
        private @Nullable String source;
        private @Nullable Map<String,String> tags;
        private @Nullable String wsdlImportMethod;
        private @Nullable WsdlServiceResponse wsdlService;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiResourceMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiType = defaults.apiType;
    	      this.brandColor = defaults.brandColor;
    	      this.connectionType = defaults.connectionType;
    	      this.deploymentParameters = defaults.deploymentParameters;
    	      this.hideKey = defaults.hideKey;
    	      this.provisioningState = defaults.provisioningState;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
    	      this.wsdlImportMethod = defaults.wsdlImportMethod;
    	      this.wsdlService = defaults.wsdlService;
        }

        public Builder apiType(@Nullable String apiType) {
            this.apiType = apiType;
            return this;
        }

        public Builder brandColor(@Nullable String brandColor) {
            this.brandColor = brandColor;
            return this;
        }

        public Builder connectionType(@Nullable String connectionType) {
            this.connectionType = connectionType;
            return this;
        }

        public Builder deploymentParameters(@Nullable ApiDeploymentParameterMetadataSetResponse deploymentParameters) {
            this.deploymentParameters = deploymentParameters;
            return this;
        }

        public Builder hideKey(@Nullable String hideKey) {
            this.hideKey = hideKey;
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder wsdlImportMethod(@Nullable String wsdlImportMethod) {
            this.wsdlImportMethod = wsdlImportMethod;
            return this;
        }

        public Builder wsdlService(@Nullable WsdlServiceResponse wsdlService) {
            this.wsdlService = wsdlService;
            return this;
        }
        public ApiResourceMetadataResponse build() {
            return new ApiResourceMetadataResponse(apiType, brandColor, connectionType, deploymentParameters, hideKey, provisioningState, source, tags, wsdlImportMethod, wsdlService);
        }
    }
}
