// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.ProjectProvisioningParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Input ServiceCatalog Provisioning Details
 * 
 */
public final class ServiceCatalogProvisioningDetailsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceCatalogProvisioningDetailsPropertiesArgs Empty = new ServiceCatalogProvisioningDetailsPropertiesArgs();

    @InputImport(name="pathId")
      private final @Nullable Input<String> pathId;

    public Input<String> getPathId() {
        return this.pathId == null ? Input.empty() : this.pathId;
    }

    @InputImport(name="productId", required=true)
      private final Input<String> productId;

    public Input<String> getProductId() {
        return this.productId;
    }

    @InputImport(name="provisioningArtifactId")
      private final @Nullable Input<String> provisioningArtifactId;

    public Input<String> getProvisioningArtifactId() {
        return this.provisioningArtifactId == null ? Input.empty() : this.provisioningArtifactId;
    }

    /**
     * Parameters specified by the administrator that are required for provisioning the product.
     * 
     */
    @InputImport(name="provisioningParameters")
      private final @Nullable Input<List<ProjectProvisioningParameterArgs>> provisioningParameters;

    public Input<List<ProjectProvisioningParameterArgs>> getProvisioningParameters() {
        return this.provisioningParameters == null ? Input.empty() : this.provisioningParameters;
    }

    public ServiceCatalogProvisioningDetailsPropertiesArgs(
        @Nullable Input<String> pathId,
        Input<String> productId,
        @Nullable Input<String> provisioningArtifactId,
        @Nullable Input<List<ProjectProvisioningParameterArgs>> provisioningParameters) {
        this.pathId = pathId;
        this.productId = Objects.requireNonNull(productId, "expected parameter 'productId' to be non-null");
        this.provisioningArtifactId = provisioningArtifactId;
        this.provisioningParameters = provisioningParameters;
    }

    private ServiceCatalogProvisioningDetailsPropertiesArgs() {
        this.pathId = Input.empty();
        this.productId = Input.empty();
        this.provisioningArtifactId = Input.empty();
        this.provisioningParameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCatalogProvisioningDetailsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> pathId;
        private Input<String> productId;
        private @Nullable Input<String> provisioningArtifactId;
        private @Nullable Input<List<ProjectProvisioningParameterArgs>> provisioningParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCatalogProvisioningDetailsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pathId = defaults.pathId;
    	      this.productId = defaults.productId;
    	      this.provisioningArtifactId = defaults.provisioningArtifactId;
    	      this.provisioningParameters = defaults.provisioningParameters;
        }

        public Builder pathId(@Nullable Input<String> pathId) {
            this.pathId = pathId;
            return this;
        }

        public Builder pathId(@Nullable String pathId) {
            this.pathId = Input.ofNullable(pathId);
            return this;
        }

        public Builder productId(Input<String> productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }

        public Builder productId(String productId) {
            this.productId = Input.of(Objects.requireNonNull(productId));
            return this;
        }

        public Builder provisioningArtifactId(@Nullable Input<String> provisioningArtifactId) {
            this.provisioningArtifactId = provisioningArtifactId;
            return this;
        }

        public Builder provisioningArtifactId(@Nullable String provisioningArtifactId) {
            this.provisioningArtifactId = Input.ofNullable(provisioningArtifactId);
            return this;
        }

        public Builder provisioningParameters(@Nullable Input<List<ProjectProvisioningParameterArgs>> provisioningParameters) {
            this.provisioningParameters = provisioningParameters;
            return this;
        }

        public Builder provisioningParameters(@Nullable List<ProjectProvisioningParameterArgs> provisioningParameters) {
            this.provisioningParameters = Input.ofNullable(provisioningParameters);
            return this;
        }
        public ServiceCatalogProvisioningDetailsPropertiesArgs build() {
            return new ServiceCatalogProvisioningDetailsPropertiesArgs(pathId, productId, provisioningArtifactId, provisioningParameters);
        }
    }
}
