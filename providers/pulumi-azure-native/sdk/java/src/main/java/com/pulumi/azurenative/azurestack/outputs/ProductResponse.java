// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestack.outputs;

import com.pulumi.azurenative.azurestack.outputs.CompatibilityResponse;
import com.pulumi.azurenative.azurestack.outputs.IconUrisResponse;
import com.pulumi.azurenative.azurestack.outputs.ProductLinkResponse;
import com.pulumi.azurenative.azurestack.outputs.ProductPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProductResponse {
    /**
     * The part number used for billing purposes.
     * 
     */
    private final @Nullable String billingPartNumber;
    /**
     * Product compatibility with current device.
     * 
     */
    private final @Nullable CompatibilityResponse compatibility;
    /**
     * The description of the product.
     * 
     */
    private final @Nullable String description;
    /**
     * The display name of the product.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The entity tag used for optimistic concurrency when modifying the resource.
     * 
     */
    private final @Nullable String etag;
    /**
     * The identifier of the gallery item corresponding to the product.
     * 
     */
    private final @Nullable String galleryItemIdentity;
    /**
     * Additional links available for this product.
     * 
     */
    private final @Nullable IconUrisResponse iconUris;
    /**
     * ID of the resource.
     * 
     */
    private final String id;
    /**
     * The legal terms.
     * 
     */
    private final @Nullable String legalTerms;
    /**
     * Additional links available for this product.
     * 
     */
    private final @Nullable List<ProductLinkResponse> links;
    /**
     * Name of the resource.
     * 
     */
    private final String name;
    /**
     * The offer representing the product.
     * 
     */
    private final @Nullable String offer;
    /**
     * The version of the product offer.
     * 
     */
    private final @Nullable String offerVersion;
    /**
     * The length of product content.
     * 
     */
    private final @Nullable Double payloadLength;
    /**
     * The privacy policy.
     * 
     */
    private final @Nullable String privacyPolicy;
    /**
     * The kind of the product (virtualMachine or virtualMachineExtension)
     * 
     */
    private final @Nullable String productKind;
    /**
     * Additional properties for the product.
     * 
     */
    private final @Nullable ProductPropertiesResponse productProperties;
    /**
     * The user-friendly name of the product publisher.
     * 
     */
    private final @Nullable String publisherDisplayName;
    /**
     * Publisher identifier.
     * 
     */
    private final @Nullable String publisherIdentifier;
    /**
     * The product SKU.
     * 
     */
    private final @Nullable String sku;
    /**
     * Type of Resource.
     * 
     */
    private final String type;
    /**
     * The type of the Virtual Machine Extension.
     * 
     */
    private final @Nullable String vmExtensionType;

    @CustomType.Constructor
    private ProductResponse(
        @CustomType.Parameter("billingPartNumber") @Nullable String billingPartNumber,
        @CustomType.Parameter("compatibility") @Nullable CompatibilityResponse compatibility,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("galleryItemIdentity") @Nullable String galleryItemIdentity,
        @CustomType.Parameter("iconUris") @Nullable IconUrisResponse iconUris,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("legalTerms") @Nullable String legalTerms,
        @CustomType.Parameter("links") @Nullable List<ProductLinkResponse> links,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("offer") @Nullable String offer,
        @CustomType.Parameter("offerVersion") @Nullable String offerVersion,
        @CustomType.Parameter("payloadLength") @Nullable Double payloadLength,
        @CustomType.Parameter("privacyPolicy") @Nullable String privacyPolicy,
        @CustomType.Parameter("productKind") @Nullable String productKind,
        @CustomType.Parameter("productProperties") @Nullable ProductPropertiesResponse productProperties,
        @CustomType.Parameter("publisherDisplayName") @Nullable String publisherDisplayName,
        @CustomType.Parameter("publisherIdentifier") @Nullable String publisherIdentifier,
        @CustomType.Parameter("sku") @Nullable String sku,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("vmExtensionType") @Nullable String vmExtensionType) {
        this.billingPartNumber = billingPartNumber;
        this.compatibility = compatibility;
        this.description = description;
        this.displayName = displayName;
        this.etag = etag;
        this.galleryItemIdentity = galleryItemIdentity;
        this.iconUris = iconUris;
        this.id = id;
        this.legalTerms = legalTerms;
        this.links = links;
        this.name = name;
        this.offer = offer;
        this.offerVersion = offerVersion;
        this.payloadLength = payloadLength;
        this.privacyPolicy = privacyPolicy;
        this.productKind = productKind;
        this.productProperties = productProperties;
        this.publisherDisplayName = publisherDisplayName;
        this.publisherIdentifier = publisherIdentifier;
        this.sku = sku;
        this.type = type;
        this.vmExtensionType = vmExtensionType;
    }

    /**
     * The part number used for billing purposes.
     * 
    */
    public Optional<String> billingPartNumber() {
        return Optional.ofNullable(this.billingPartNumber);
    }
    /**
     * Product compatibility with current device.
     * 
    */
    public Optional<CompatibilityResponse> compatibility() {
        return Optional.ofNullable(this.compatibility);
    }
    /**
     * The description of the product.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The display name of the product.
     * 
    */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The entity tag used for optimistic concurrency when modifying the resource.
     * 
    */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * The identifier of the gallery item corresponding to the product.
     * 
    */
    public Optional<String> galleryItemIdentity() {
        return Optional.ofNullable(this.galleryItemIdentity);
    }
    /**
     * Additional links available for this product.
     * 
    */
    public Optional<IconUrisResponse> iconUris() {
        return Optional.ofNullable(this.iconUris);
    }
    /**
     * ID of the resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The legal terms.
     * 
    */
    public Optional<String> legalTerms() {
        return Optional.ofNullable(this.legalTerms);
    }
    /**
     * Additional links available for this product.
     * 
    */
    public List<ProductLinkResponse> links() {
        return this.links == null ? List.of() : this.links;
    }
    /**
     * Name of the resource.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The offer representing the product.
     * 
    */
    public Optional<String> offer() {
        return Optional.ofNullable(this.offer);
    }
    /**
     * The version of the product offer.
     * 
    */
    public Optional<String> offerVersion() {
        return Optional.ofNullable(this.offerVersion);
    }
    /**
     * The length of product content.
     * 
    */
    public Optional<Double> payloadLength() {
        return Optional.ofNullable(this.payloadLength);
    }
    /**
     * The privacy policy.
     * 
    */
    public Optional<String> privacyPolicy() {
        return Optional.ofNullable(this.privacyPolicy);
    }
    /**
     * The kind of the product (virtualMachine or virtualMachineExtension)
     * 
    */
    public Optional<String> productKind() {
        return Optional.ofNullable(this.productKind);
    }
    /**
     * Additional properties for the product.
     * 
    */
    public Optional<ProductPropertiesResponse> productProperties() {
        return Optional.ofNullable(this.productProperties);
    }
    /**
     * The user-friendly name of the product publisher.
     * 
    */
    public Optional<String> publisherDisplayName() {
        return Optional.ofNullable(this.publisherDisplayName);
    }
    /**
     * Publisher identifier.
     * 
    */
    public Optional<String> publisherIdentifier() {
        return Optional.ofNullable(this.publisherIdentifier);
    }
    /**
     * The product SKU.
     * 
    */
    public Optional<String> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Type of Resource.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The type of the Virtual Machine Extension.
     * 
    */
    public Optional<String> vmExtensionType() {
        return Optional.ofNullable(this.vmExtensionType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String billingPartNumber;
        private @Nullable CompatibilityResponse compatibility;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String etag;
        private @Nullable String galleryItemIdentity;
        private @Nullable IconUrisResponse iconUris;
        private String id;
        private @Nullable String legalTerms;
        private @Nullable List<ProductLinkResponse> links;
        private String name;
        private @Nullable String offer;
        private @Nullable String offerVersion;
        private @Nullable Double payloadLength;
        private @Nullable String privacyPolicy;
        private @Nullable String productKind;
        private @Nullable ProductPropertiesResponse productProperties;
        private @Nullable String publisherDisplayName;
        private @Nullable String publisherIdentifier;
        private @Nullable String sku;
        private String type;
        private @Nullable String vmExtensionType;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingPartNumber = defaults.billingPartNumber;
    	      this.compatibility = defaults.compatibility;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.galleryItemIdentity = defaults.galleryItemIdentity;
    	      this.iconUris = defaults.iconUris;
    	      this.id = defaults.id;
    	      this.legalTerms = defaults.legalTerms;
    	      this.links = defaults.links;
    	      this.name = defaults.name;
    	      this.offer = defaults.offer;
    	      this.offerVersion = defaults.offerVersion;
    	      this.payloadLength = defaults.payloadLength;
    	      this.privacyPolicy = defaults.privacyPolicy;
    	      this.productKind = defaults.productKind;
    	      this.productProperties = defaults.productProperties;
    	      this.publisherDisplayName = defaults.publisherDisplayName;
    	      this.publisherIdentifier = defaults.publisherIdentifier;
    	      this.sku = defaults.sku;
    	      this.type = defaults.type;
    	      this.vmExtensionType = defaults.vmExtensionType;
        }

        public Builder billingPartNumber(@Nullable String billingPartNumber) {
            this.billingPartNumber = billingPartNumber;
            return this;
        }
        public Builder compatibility(@Nullable CompatibilityResponse compatibility) {
            this.compatibility = compatibility;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder galleryItemIdentity(@Nullable String galleryItemIdentity) {
            this.galleryItemIdentity = galleryItemIdentity;
            return this;
        }
        public Builder iconUris(@Nullable IconUrisResponse iconUris) {
            this.iconUris = iconUris;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder legalTerms(@Nullable String legalTerms) {
            this.legalTerms = legalTerms;
            return this;
        }
        public Builder links(@Nullable List<ProductLinkResponse> links) {
            this.links = links;
            return this;
        }
        public Builder links(ProductLinkResponse... links) {
            return links(List.of(links));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder offer(@Nullable String offer) {
            this.offer = offer;
            return this;
        }
        public Builder offerVersion(@Nullable String offerVersion) {
            this.offerVersion = offerVersion;
            return this;
        }
        public Builder payloadLength(@Nullable Double payloadLength) {
            this.payloadLength = payloadLength;
            return this;
        }
        public Builder privacyPolicy(@Nullable String privacyPolicy) {
            this.privacyPolicy = privacyPolicy;
            return this;
        }
        public Builder productKind(@Nullable String productKind) {
            this.productKind = productKind;
            return this;
        }
        public Builder productProperties(@Nullable ProductPropertiesResponse productProperties) {
            this.productProperties = productProperties;
            return this;
        }
        public Builder publisherDisplayName(@Nullable String publisherDisplayName) {
            this.publisherDisplayName = publisherDisplayName;
            return this;
        }
        public Builder publisherIdentifier(@Nullable String publisherIdentifier) {
            this.publisherIdentifier = publisherIdentifier;
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
        public Builder vmExtensionType(@Nullable String vmExtensionType) {
            this.vmExtensionType = vmExtensionType;
            return this;
        }        public ProductResponse build() {
            return new ProductResponse(billingPartNumber, compatibility, description, displayName, etag, galleryItemIdentity, iconUris, id, legalTerms, links, name, offer, offerVersion, payloadLength, privacyPolicy, productKind, productProperties, publisherDisplayName, publisherIdentifier, sku, type, vmExtensionType);
        }
    }
}
