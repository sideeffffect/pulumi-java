// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.enums.StorageAccountType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The storage account details.
 * 
 */
public final class StorageAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageAccountArgs Empty = new StorageAccountArgs();

    /**
     * The ID of the storage account resource. Media Services relies on tables and queues as well as blobs, so the primary storage account must be a Standard Storage account (either Microsoft.ClassicStorage or Microsoft.Storage). Blob only storage accounts can be added as secondary storage accounts.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The type of the storage account.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,StorageAccountType>> type;

    public Output<Either<String,StorageAccountType>> type() {
        return this.type;
    }

    private StorageAccountArgs() {}

    private StorageAccountArgs(StorageAccountArgs $) {
        this.id = $.id;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageAccountArgs $;

        public Builder() {
            $ = new StorageAccountArgs();
        }

        public Builder(StorageAccountArgs defaults) {
            $ = new StorageAccountArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder type(Output<Either<String,StorageAccountType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,StorageAccountType> type) {
            return type(Output.of(type));
        }

        public StorageAccountArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
