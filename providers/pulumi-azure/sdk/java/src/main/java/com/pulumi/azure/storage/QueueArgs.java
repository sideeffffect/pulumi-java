// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QueueArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueueArgs Empty = new QueueArgs();

    /**
     * A mapping of MetaData which should be assigned to this Storage Queue.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return A mapping of MetaData which should be assigned to this Storage Queue.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The name of the Queue which should be created within the Storage Account. Must be unique within the storage account the queue is located.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Queue which should be created within the Storage Account. Must be unique within the storage account the queue is located.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the Storage Account in which the Storage Queue should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageAccountName", required=true)
    private Output<String> storageAccountName;

    /**
     * @return Specifies the Storage Account in which the Storage Queue should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> storageAccountName() {
        return this.storageAccountName;
    }

    private QueueArgs() {}

    private QueueArgs(QueueArgs $) {
        this.metadata = $.metadata;
        this.name = $.name;
        this.storageAccountName = $.storageAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueueArgs $;

        public Builder() {
            $ = new QueueArgs();
        }

        public Builder(QueueArgs defaults) {
            $ = new QueueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metadata A mapping of MetaData which should be assigned to this Storage Queue.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata A mapping of MetaData which should be assigned to this Storage Queue.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name The name of the Queue which should be created within the Storage Account. Must be unique within the storage account the queue is located.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Queue which should be created within the Storage Account. Must be unique within the storage account the queue is located.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param storageAccountName Specifies the Storage Account in which the Storage Queue should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        /**
         * @param storageAccountName Specifies the Storage Account in which the Storage Queue should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        public QueueArgs build() {
            $.storageAccountName = Objects.requireNonNull($.storageAccountName, "expected parameter 'storageAccountName' to be non-null");
            return $;
        }
    }

}
