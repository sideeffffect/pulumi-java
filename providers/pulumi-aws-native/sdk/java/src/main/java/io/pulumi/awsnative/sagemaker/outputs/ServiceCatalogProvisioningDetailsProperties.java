// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.ProjectProvisioningParameter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceCatalogProvisioningDetailsProperties {
    private final @Nullable String pathId;
    private final String productId;
    private final @Nullable String provisioningArtifactId;
    /**
     * Parameters specified by the administrator that are required for provisioning the product.
     * 
     */
    private final @Nullable List<ProjectProvisioningParameter> provisioningParameters;

    @OutputCustomType.Constructor({"pathId","productId","provisioningArtifactId","provisioningParameters"})
    private ServiceCatalogProvisioningDetailsProperties(
        @Nullable String pathId,
        String productId,
        @Nullable String provisioningArtifactId,
        @Nullable List<ProjectProvisioningParameter> provisioningParameters) {
        this.pathId = pathId;
        this.productId = productId;
        this.provisioningArtifactId = provisioningArtifactId;
        this.provisioningParameters = provisioningParameters;
    }

    public Optional<String> getPathId() {
        return Optional.ofNullable(this.pathId);
    }
    public String getProductId() {
        return this.productId;
    }
    public Optional<String> getProvisioningArtifactId() {
        return Optional.ofNullable(this.provisioningArtifactId);
    }
    /**
     * Parameters specified by the administrator that are required for provisioning the product.
     * 
    */
    public List<ProjectProvisioningParameter> getProvisioningParameters() {
        return this.provisioningParameters == null ? List.of() : this.provisioningParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCatalogProvisioningDetailsProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String pathId;
        private String productId;
        private @Nullable String provisioningArtifactId;
        private @Nullable List<ProjectProvisioningParameter> provisioningParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCatalogProvisioningDetailsProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pathId = defaults.pathId;
    	      this.productId = defaults.productId;
    	      this.provisioningArtifactId = defaults.provisioningArtifactId;
    	      this.provisioningParameters = defaults.provisioningParameters;
        }

        public Builder setPathId(@Nullable String pathId) {
            this.pathId = pathId;
            return this;
        }

        public Builder setProductId(String productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }

        public Builder setProvisioningArtifactId(@Nullable String provisioningArtifactId) {
            this.provisioningArtifactId = provisioningArtifactId;
            return this;
        }

        public Builder setProvisioningParameters(@Nullable List<ProjectProvisioningParameter> provisioningParameters) {
            this.provisioningParameters = provisioningParameters;
            return this;
        }
        public ServiceCatalogProvisioningDetailsProperties build() {
            return new ServiceCatalogProvisioningDetailsProperties(pathId, productId, provisioningArtifactId, provisioningParameters);
        }
    }
}
