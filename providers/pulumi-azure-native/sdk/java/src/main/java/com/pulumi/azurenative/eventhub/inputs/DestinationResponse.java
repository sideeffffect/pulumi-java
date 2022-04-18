// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Capture storage details for capture description
 * 
 */
public final class DestinationResponse extends com.pulumi.resources.InvokeArgs {

    public static final DestinationResponse Empty = new DestinationResponse();

    /**
     * Blob naming convention for archive, e.g. {Namespace}/{EventHub}/{PartitionId}/{Year}/{Month}/{Day}/{Hour}/{Minute}/{Second}. Here all the parameters (Namespace,EventHub .. etc) are mandatory irrespective of order
     * 
     */
    @Import(name="archiveNameFormat")
      private final @Nullable String archiveNameFormat;

    public Optional<String> archiveNameFormat() {
        return this.archiveNameFormat == null ? Optional.empty() : Optional.ofNullable(this.archiveNameFormat);
    }

    /**
     * Blob container Name
     * 
     */
    @Import(name="blobContainer")
      private final @Nullable String blobContainer;

    public Optional<String> blobContainer() {
        return this.blobContainer == null ? Optional.empty() : Optional.ofNullable(this.blobContainer);
    }

    /**
     * Name for capture destination
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Resource id of the storage account to be used to create the blobs
     * 
     */
    @Import(name="storageAccountResourceId")
      private final @Nullable String storageAccountResourceId;

    public Optional<String> storageAccountResourceId() {
        return this.storageAccountResourceId == null ? Optional.empty() : Optional.ofNullable(this.storageAccountResourceId);
    }

    public DestinationResponse(
        @Nullable String archiveNameFormat,
        @Nullable String blobContainer,
        @Nullable String name,
        @Nullable String storageAccountResourceId) {
        this.archiveNameFormat = archiveNameFormat;
        this.blobContainer = blobContainer;
        this.name = name;
        this.storageAccountResourceId = storageAccountResourceId;
    }

    private DestinationResponse() {
        this.archiveNameFormat = null;
        this.blobContainer = null;
        this.name = null;
        this.storageAccountResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String archiveNameFormat;
        private @Nullable String blobContainer;
        private @Nullable String name;
        private @Nullable String storageAccountResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveNameFormat = defaults.archiveNameFormat;
    	      this.blobContainer = defaults.blobContainer;
    	      this.name = defaults.name;
    	      this.storageAccountResourceId = defaults.storageAccountResourceId;
        }

        public Builder archiveNameFormat(@Nullable String archiveNameFormat) {
            this.archiveNameFormat = archiveNameFormat;
            return this;
        }
        public Builder blobContainer(@Nullable String blobContainer) {
            this.blobContainer = blobContainer;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder storageAccountResourceId(@Nullable String storageAccountResourceId) {
            this.storageAccountResourceId = storageAccountResourceId;
            return this;
        }        public DestinationResponse build() {
            return new DestinationResponse(archiveNameFormat, blobContainer, name, storageAccountResourceId);
        }
    }
}
