// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog;

import io.pulumi.aws.servicecatalog.inputs.ProvisionedProductProvisioningParameterArgs;
import io.pulumi.aws.servicecatalog.inputs.ProvisionedProductStackSetProvisioningPreferencesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProvisionedProductArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProvisionedProductArgs Empty = new ProvisionedProductArgs();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @InputImport(name="acceptLanguage")
      private final @Nullable Input<String> acceptLanguage;

    public Input<String> getAcceptLanguage() {
        return this.acceptLanguage == null ? Input.empty() : this.acceptLanguage;
    }

    /**
     * _Only applies to deleting._ If set to `true`, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources. The default value is `false`.
     * 
     */
    @InputImport(name="ignoreErrors")
      private final @Nullable Input<Boolean> ignoreErrors;

    public Input<Boolean> getIgnoreErrors() {
        return this.ignoreErrors == null ? Input.empty() : this.ignoreErrors;
    }

    /**
     * User-friendly name of the provisioned product.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * 
     */
    @InputImport(name="notificationArns")
      private final @Nullable Input<List<String>> notificationArns;

    public Input<List<String>> getNotificationArns() {
        return this.notificationArns == null ? Input.empty() : this.notificationArns;
    }

    /**
     * Path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use `aws.servicecatalog.getLaunchPaths`. When required, you must provide `path_id` or `path_name`, but not both.
     * 
     */
    @InputImport(name="pathId")
      private final @Nullable Input<String> pathId;

    public Input<String> getPathId() {
        return this.pathId == null ? Input.empty() : this.pathId;
    }

    /**
     * Name of the path. You must provide `path_id` or `path_name`, but not both.
     * 
     */
    @InputImport(name="pathName")
      private final @Nullable Input<String> pathName;

    public Input<String> getPathName() {
        return this.pathName == null ? Input.empty() : this.pathName;
    }

    /**
     * Product identifier. For example, `prod-abcdzk7xy33qa`. You must provide `product_id` or `product_name`, but not both.
     * 
     */
    @InputImport(name="productId")
      private final @Nullable Input<String> productId;

    public Input<String> getProductId() {
        return this.productId == null ? Input.empty() : this.productId;
    }

    /**
     * Name of the product. You must provide `product_id` or `product_name`, but not both.
     * 
     */
    @InputImport(name="productName")
      private final @Nullable Input<String> productName;

    public Input<String> getProductName() {
        return this.productName == null ? Input.empty() : this.productName;
    }

    /**
     * Identifier of the provisioning artifact. For example, `pa-4abcdjnxjj6ne`. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
     * 
     */
    @InputImport(name="provisioningArtifactId")
      private final @Nullable Input<String> provisioningArtifactId;

    public Input<String> getProvisioningArtifactId() {
        return this.provisioningArtifactId == null ? Input.empty() : this.provisioningArtifactId;
    }

    /**
     * Name of the provisioning artifact. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
     * 
     */
    @InputImport(name="provisioningArtifactName")
      private final @Nullable Input<String> provisioningArtifactName;

    public Input<String> getProvisioningArtifactName() {
        return this.provisioningArtifactName == null ? Input.empty() : this.provisioningArtifactName;
    }

    /**
     * Configuration block with parameters specified by the administrator that are required for provisioning the product. See details below.
     * 
     */
    @InputImport(name="provisioningParameters")
      private final @Nullable Input<List<ProvisionedProductProvisioningParameterArgs>> provisioningParameters;

    public Input<List<ProvisionedProductProvisioningParameterArgs>> getProvisioningParameters() {
        return this.provisioningParameters == null ? Input.empty() : this.provisioningParameters;
    }

    /**
     * _Only applies to deleting._ Whether to delete the Service Catalog provisioned product but leave the CloudFormation stack, stack set, or the underlying resources of the deleted provisioned product. The default value is `false`.
     * 
     */
    @InputImport(name="retainPhysicalResources")
      private final @Nullable Input<Boolean> retainPhysicalResources;

    public Input<Boolean> getRetainPhysicalResources() {
        return this.retainPhysicalResources == null ? Input.empty() : this.retainPhysicalResources;
    }

    /**
     * Configuration block with information about the provisioning preferences for a stack set. See details below.
     * 
     */
    @InputImport(name="stackSetProvisioningPreferences")
      private final @Nullable Input<ProvisionedProductStackSetProvisioningPreferencesArgs> stackSetProvisioningPreferences;

    public Input<ProvisionedProductStackSetProvisioningPreferencesArgs> getStackSetProvisioningPreferences() {
        return this.stackSetProvisioningPreferences == null ? Input.empty() : this.stackSetProvisioningPreferences;
    }

    /**
     * Tags to apply to the provisioned product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ProvisionedProductArgs(
        @Nullable Input<String> acceptLanguage,
        @Nullable Input<Boolean> ignoreErrors,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> notificationArns,
        @Nullable Input<String> pathId,
        @Nullable Input<String> pathName,
        @Nullable Input<String> productId,
        @Nullable Input<String> productName,
        @Nullable Input<String> provisioningArtifactId,
        @Nullable Input<String> provisioningArtifactName,
        @Nullable Input<List<ProvisionedProductProvisioningParameterArgs>> provisioningParameters,
        @Nullable Input<Boolean> retainPhysicalResources,
        @Nullable Input<ProvisionedProductStackSetProvisioningPreferencesArgs> stackSetProvisioningPreferences,
        @Nullable Input<Map<String,String>> tags) {
        this.acceptLanguage = acceptLanguage;
        this.ignoreErrors = ignoreErrors;
        this.name = name;
        this.notificationArns = notificationArns;
        this.pathId = pathId;
        this.pathName = pathName;
        this.productId = productId;
        this.productName = productName;
        this.provisioningArtifactId = provisioningArtifactId;
        this.provisioningArtifactName = provisioningArtifactName;
        this.provisioningParameters = provisioningParameters;
        this.retainPhysicalResources = retainPhysicalResources;
        this.stackSetProvisioningPreferences = stackSetProvisioningPreferences;
        this.tags = tags;
    }

    private ProvisionedProductArgs() {
        this.acceptLanguage = Input.empty();
        this.ignoreErrors = Input.empty();
        this.name = Input.empty();
        this.notificationArns = Input.empty();
        this.pathId = Input.empty();
        this.pathName = Input.empty();
        this.productId = Input.empty();
        this.productName = Input.empty();
        this.provisioningArtifactId = Input.empty();
        this.provisioningArtifactName = Input.empty();
        this.provisioningParameters = Input.empty();
        this.retainPhysicalResources = Input.empty();
        this.stackSetProvisioningPreferences = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisionedProductArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> acceptLanguage;
        private @Nullable Input<Boolean> ignoreErrors;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> notificationArns;
        private @Nullable Input<String> pathId;
        private @Nullable Input<String> pathName;
        private @Nullable Input<String> productId;
        private @Nullable Input<String> productName;
        private @Nullable Input<String> provisioningArtifactId;
        private @Nullable Input<String> provisioningArtifactName;
        private @Nullable Input<List<ProvisionedProductProvisioningParameterArgs>> provisioningParameters;
        private @Nullable Input<Boolean> retainPhysicalResources;
        private @Nullable Input<ProvisionedProductStackSetProvisioningPreferencesArgs> stackSetProvisioningPreferences;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ProvisionedProductArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.ignoreErrors = defaults.ignoreErrors;
    	      this.name = defaults.name;
    	      this.notificationArns = defaults.notificationArns;
    	      this.pathId = defaults.pathId;
    	      this.pathName = defaults.pathName;
    	      this.productId = defaults.productId;
    	      this.productName = defaults.productName;
    	      this.provisioningArtifactId = defaults.provisioningArtifactId;
    	      this.provisioningArtifactName = defaults.provisioningArtifactName;
    	      this.provisioningParameters = defaults.provisioningParameters;
    	      this.retainPhysicalResources = defaults.retainPhysicalResources;
    	      this.stackSetProvisioningPreferences = defaults.stackSetProvisioningPreferences;
    	      this.tags = defaults.tags;
        }

        public Builder acceptLanguage(@Nullable Input<String> acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = Input.ofNullable(acceptLanguage);
            return this;
        }

        public Builder ignoreErrors(@Nullable Input<Boolean> ignoreErrors) {
            this.ignoreErrors = ignoreErrors;
            return this;
        }

        public Builder ignoreErrors(@Nullable Boolean ignoreErrors) {
            this.ignoreErrors = Input.ofNullable(ignoreErrors);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder notificationArns(@Nullable Input<List<String>> notificationArns) {
            this.notificationArns = notificationArns;
            return this;
        }

        public Builder notificationArns(@Nullable List<String> notificationArns) {
            this.notificationArns = Input.ofNullable(notificationArns);
            return this;
        }

        public Builder pathId(@Nullable Input<String> pathId) {
            this.pathId = pathId;
            return this;
        }

        public Builder pathId(@Nullable String pathId) {
            this.pathId = Input.ofNullable(pathId);
            return this;
        }

        public Builder pathName(@Nullable Input<String> pathName) {
            this.pathName = pathName;
            return this;
        }

        public Builder pathName(@Nullable String pathName) {
            this.pathName = Input.ofNullable(pathName);
            return this;
        }

        public Builder productId(@Nullable Input<String> productId) {
            this.productId = productId;
            return this;
        }

        public Builder productId(@Nullable String productId) {
            this.productId = Input.ofNullable(productId);
            return this;
        }

        public Builder productName(@Nullable Input<String> productName) {
            this.productName = productName;
            return this;
        }

        public Builder productName(@Nullable String productName) {
            this.productName = Input.ofNullable(productName);
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

        public Builder provisioningArtifactName(@Nullable Input<String> provisioningArtifactName) {
            this.provisioningArtifactName = provisioningArtifactName;
            return this;
        }

        public Builder provisioningArtifactName(@Nullable String provisioningArtifactName) {
            this.provisioningArtifactName = Input.ofNullable(provisioningArtifactName);
            return this;
        }

        public Builder provisioningParameters(@Nullable Input<List<ProvisionedProductProvisioningParameterArgs>> provisioningParameters) {
            this.provisioningParameters = provisioningParameters;
            return this;
        }

        public Builder provisioningParameters(@Nullable List<ProvisionedProductProvisioningParameterArgs> provisioningParameters) {
            this.provisioningParameters = Input.ofNullable(provisioningParameters);
            return this;
        }

        public Builder retainPhysicalResources(@Nullable Input<Boolean> retainPhysicalResources) {
            this.retainPhysicalResources = retainPhysicalResources;
            return this;
        }

        public Builder retainPhysicalResources(@Nullable Boolean retainPhysicalResources) {
            this.retainPhysicalResources = Input.ofNullable(retainPhysicalResources);
            return this;
        }

        public Builder stackSetProvisioningPreferences(@Nullable Input<ProvisionedProductStackSetProvisioningPreferencesArgs> stackSetProvisioningPreferences) {
            this.stackSetProvisioningPreferences = stackSetProvisioningPreferences;
            return this;
        }

        public Builder stackSetProvisioningPreferences(@Nullable ProvisionedProductStackSetProvisioningPreferencesArgs stackSetProvisioningPreferences) {
            this.stackSetProvisioningPreferences = Input.ofNullable(stackSetProvisioningPreferences);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ProvisionedProductArgs build() {
            return new ProvisionedProductArgs(acceptLanguage, ignoreErrors, name, notificationArns, pathId, pathName, productId, productName, provisioningArtifactId, provisioningArtifactName, provisioningParameters, retainPhysicalResources, stackSetProvisioningPreferences, tags);
        }
    }
}
