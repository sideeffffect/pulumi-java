// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.inputs.EncryptionServiceResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A list of services that support encryption.
 * 
 */
public final class EncryptionServicesResponse extends com.pulumi.resources.InvokeArgs {

    public static final EncryptionServicesResponse Empty = new EncryptionServicesResponse();

    /**
     * The encryption function of the blob storage service.
     * 
     */
    @Import(name="blob")
    private @Nullable EncryptionServiceResponse blob;

    public Optional<EncryptionServiceResponse> blob() {
        return Optional.ofNullable(this.blob);
    }

    /**
     * The encryption function of the file storage service.
     * 
     */
    @Import(name="file")
    private @Nullable EncryptionServiceResponse file;

    public Optional<EncryptionServiceResponse> file() {
        return Optional.ofNullable(this.file);
    }

    /**
     * The encryption function of the queue storage service.
     * 
     */
    @Import(name="queue")
    private @Nullable EncryptionServiceResponse queue;

    public Optional<EncryptionServiceResponse> queue() {
        return Optional.ofNullable(this.queue);
    }

    /**
     * The encryption function of the table storage service.
     * 
     */
    @Import(name="table")
    private @Nullable EncryptionServiceResponse table;

    public Optional<EncryptionServiceResponse> table() {
        return Optional.ofNullable(this.table);
    }

    private EncryptionServicesResponse() {}

    private EncryptionServicesResponse(EncryptionServicesResponse $) {
        this.blob = $.blob;
        this.file = $.file;
        this.queue = $.queue;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionServicesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionServicesResponse $;

        public Builder() {
            $ = new EncryptionServicesResponse();
        }

        public Builder(EncryptionServicesResponse defaults) {
            $ = new EncryptionServicesResponse(Objects.requireNonNull(defaults));
        }

        public Builder blob(@Nullable EncryptionServiceResponse blob) {
            $.blob = blob;
            return this;
        }

        public Builder file(@Nullable EncryptionServiceResponse file) {
            $.file = file;
            return this;
        }

        public Builder queue(@Nullable EncryptionServiceResponse queue) {
            $.queue = queue;
            return this;
        }

        public Builder table(@Nullable EncryptionServiceResponse table) {
            $.table = table;
            return this;
        }

        public EncryptionServicesResponse build() {
            return $;
        }
    }

}
