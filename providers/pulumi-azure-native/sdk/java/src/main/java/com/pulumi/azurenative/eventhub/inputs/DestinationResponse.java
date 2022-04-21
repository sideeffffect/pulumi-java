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
    private @Nullable String archiveNameFormat;

    public Optional<String> archiveNameFormat() {
        return Optional.ofNullable(this.archiveNameFormat);
    }

    /**
     * Blob container Name
     * 
     */
    @Import(name="blobContainer")
    private @Nullable String blobContainer;

    public Optional<String> blobContainer() {
        return Optional.ofNullable(this.blobContainer);
    }

    /**
     * Name for capture destination
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Resource id of the storage account to be used to create the blobs
     * 
     */
    @Import(name="storageAccountResourceId")
    private @Nullable String storageAccountResourceId;

    public Optional<String> storageAccountResourceId() {
        return Optional.ofNullable(this.storageAccountResourceId);
    }

    private DestinationResponse() {}

    private DestinationResponse(DestinationResponse $) {
        this.archiveNameFormat = $.archiveNameFormat;
        this.blobContainer = $.blobContainer;
        this.name = $.name;
        this.storageAccountResourceId = $.storageAccountResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DestinationResponse $;

        public Builder() {
            $ = new DestinationResponse();
        }

        public Builder(DestinationResponse defaults) {
            $ = new DestinationResponse(Objects.requireNonNull(defaults));
        }

        public Builder archiveNameFormat(@Nullable String archiveNameFormat) {
            $.archiveNameFormat = archiveNameFormat;
            return this;
        }

        public Builder blobContainer(@Nullable String blobContainer) {
            $.blobContainer = blobContainer;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder storageAccountResourceId(@Nullable String storageAccountResourceId) {
            $.storageAccountResourceId = storageAccountResourceId;
            return this;
        }

        public DestinationResponse build() {
            return $;
        }
    }

}
