// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageReferenceResponse Empty = new ImageReferenceResponse();

    /**
     * This property is mutually exclusive with other properties. The Shared Image Gallery image must have replicas in the same region as the Azure Batch account. For information about the firewall settings for the Batch node agent to communicate with the Batch service see https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * For example, UbuntuServer or WindowsServer.
     * 
     */
    @InputImport(name="offer")
      private final @Nullable String offer;

    public Optional<String> getOffer() {
        return this.offer == null ? Optional.empty() : Optional.ofNullable(this.offer);
    }

    /**
     * For example, Canonical or MicrosoftWindowsServer.
     * 
     */
    @InputImport(name="publisher")
      private final @Nullable String publisher;

    public Optional<String> getPublisher() {
        return this.publisher == null ? Optional.empty() : Optional.ofNullable(this.publisher);
    }

    /**
     * For example, 18.04-LTS or 2019-Datacenter.
     * 
     */
    @InputImport(name="sku")
      private final @Nullable String sku;

    public Optional<String> getSku() {
        return this.sku == null ? Optional.empty() : Optional.ofNullable(this.sku);
    }

    /**
     * A value of 'latest' can be specified to select the latest version of an image. If omitted, the default is 'latest'.
     * 
     */
    @InputImport(name="version")
      private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public ImageReferenceResponse(
        @Nullable String id,
        @Nullable String offer,
        @Nullable String publisher,
        @Nullable String sku,
        @Nullable String version) {
        this.id = id;
        this.offer = offer;
        this.publisher = publisher;
        this.sku = sku;
        this.version = version;
    }

    private ImageReferenceResponse() {
        this.id = null;
        this.offer = null;
        this.publisher = null;
        this.sku = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String offer;
        private @Nullable String publisher;
        private @Nullable String sku;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
    	      this.version = defaults.version;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder offer(@Nullable String offer) {
            this.offer = offer;
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

        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public ImageReferenceResponse build() {
            return new ImageReferenceResponse(id, offer, publisher, sku, version);
        }
    }
}
