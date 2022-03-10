// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.outputs;

import io.pulumi.azurenative.virtualmachineimages.outputs.PlatformImagePurchasePlanResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageTemplatePlatformImageSourceResponse {
    /**
     * Image offer from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    private final @Nullable String offer;
    /**
     * Optional configuration of purchase plan for platform image.
     * 
     */
    private final @Nullable PlatformImagePurchasePlanResponse planInfo;
    /**
     * Image Publisher in [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    private final @Nullable String publisher;
    /**
     * Image sku from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    private final @Nullable String sku;
    /**
     * Specifies the type of source image you want to start with.
     * Expected value is 'PlatformImage'.
     * 
     */
    private final String type;
    /**
     * Image version from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages). If 'latest' is specified here, the version is evaluated when the image build takes place, not when the template is submitted. Specifying 'latest' could cause ROUNDTRIP_INCONSISTENT_PROPERTY issue which will be fixed.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor
    private ImageTemplatePlatformImageSourceResponse(
        @OutputCustomType.Parameter("offer") @Nullable String offer,
        @OutputCustomType.Parameter("planInfo") @Nullable PlatformImagePurchasePlanResponse planInfo,
        @OutputCustomType.Parameter("publisher") @Nullable String publisher,
        @OutputCustomType.Parameter("sku") @Nullable String sku,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("version") @Nullable String version) {
        this.offer = offer;
        this.planInfo = planInfo;
        this.publisher = publisher;
        this.sku = sku;
        this.type = type;
        this.version = version;
    }

    /**
     * Image offer from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
    */
    public Optional<String> getOffer() {
        return Optional.ofNullable(this.offer);
    }
    /**
     * Optional configuration of purchase plan for platform image.
     * 
    */
    public Optional<PlatformImagePurchasePlanResponse> getPlanInfo() {
        return Optional.ofNullable(this.planInfo);
    }
    /**
     * Image Publisher in [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
    */
    public Optional<String> getPublisher() {
        return Optional.ofNullable(this.publisher);
    }
    /**
     * Image sku from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
    */
    public Optional<String> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Specifies the type of source image you want to start with.
     * Expected value is 'PlatformImage'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Image version from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages). If 'latest' is specified here, the version is evaluated when the image build takes place, not when the template is submitted. Specifying 'latest' could cause ROUNDTRIP_INCONSISTENT_PROPERTY issue which will be fixed.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplatePlatformImageSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String offer;
        private @Nullable PlatformImagePurchasePlanResponse planInfo;
        private @Nullable String publisher;
        private @Nullable String sku;
        private String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplatePlatformImageSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offer = defaults.offer;
    	      this.planInfo = defaults.planInfo;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder offer(@Nullable String offer) {
            this.offer = offer;
            return this;
        }

        public Builder planInfo(@Nullable PlatformImagePurchasePlanResponse planInfo) {
            this.planInfo = planInfo;
            return this;
        }

        public Builder publisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder sku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public ImageTemplatePlatformImageSourceResponse build() {
            return new ImageTemplatePlatformImageSourceResponse(offer, planInfo, publisher, sku, type, version);
        }
    }
}
