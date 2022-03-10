// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The location of azure blob dataset.
 * 
 */
public final class AzureBlobStorageLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureBlobStorageLocationArgs Empty = new AzureBlobStorageLocationArgs();

    /**
     * Specify the container of azure blob. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="container")
      private final @Nullable Input<Object> container;

    public Input<Object> getContainer() {
        return this.container == null ? Input.empty() : this.container;
    }

    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="fileName")
      private final @Nullable Input<Object> fileName;

    public Input<Object> getFileName() {
        return this.fileName == null ? Input.empty() : this.fileName;
    }

    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    @InputImport(name="folderPath")
      private final @Nullable Input<Object> folderPath;

    public Input<Object> getFolderPath() {
        return this.folderPath == null ? Input.empty() : this.folderPath;
    }

    /**
     * Type of dataset storage location.
     * Expected value is 'AzureBlobStorageLocation'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public AzureBlobStorageLocationArgs(
        @Nullable Input<Object> container,
        @Nullable Input<Object> fileName,
        @Nullable Input<Object> folderPath,
        Input<String> type) {
        this.container = container;
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureBlobStorageLocationArgs() {
        this.container = Input.empty();
        this.fileName = Input.empty();
        this.folderPath = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobStorageLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> container;
        private @Nullable Input<Object> fileName;
        private @Nullable Input<Object> folderPath;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobStorageLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.fileName = defaults.fileName;
    	      this.folderPath = defaults.folderPath;
    	      this.type = defaults.type;
        }

        public Builder container(@Nullable Input<Object> container) {
            this.container = container;
            return this;
        }

        public Builder container(@Nullable Object container) {
            this.container = Input.ofNullable(container);
            return this;
        }

        public Builder fileName(@Nullable Input<Object> fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder fileName(@Nullable Object fileName) {
            this.fileName = Input.ofNullable(fileName);
            return this;
        }

        public Builder folderPath(@Nullable Input<Object> folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder folderPath(@Nullable Object folderPath) {
            this.folderPath = Input.ofNullable(folderPath);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public AzureBlobStorageLocationArgs build() {
            return new AzureBlobStorageLocationArgs(container, fileName, folderPath, type);
        }
    }
}
