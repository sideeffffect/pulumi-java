// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.DatasetDataCatalogInputDefinitionArgs;
import io.pulumi.awsnative.databrew.inputs.DatasetDatabaseInputDefinitionArgs;
import io.pulumi.awsnative.databrew.inputs.DatasetMetadataArgs;
import io.pulumi.awsnative.databrew.inputs.DatasetS3LocationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Input
 * 
 */
public final class DatasetInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetInputArgs Empty = new DatasetInputArgs();

    @InputImport(name="dataCatalogInputDefinition")
      private final @Nullable Input<DatasetDataCatalogInputDefinitionArgs> dataCatalogInputDefinition;

    public Input<DatasetDataCatalogInputDefinitionArgs> getDataCatalogInputDefinition() {
        return this.dataCatalogInputDefinition == null ? Input.empty() : this.dataCatalogInputDefinition;
    }

    @InputImport(name="databaseInputDefinition")
      private final @Nullable Input<DatasetDatabaseInputDefinitionArgs> databaseInputDefinition;

    public Input<DatasetDatabaseInputDefinitionArgs> getDatabaseInputDefinition() {
        return this.databaseInputDefinition == null ? Input.empty() : this.databaseInputDefinition;
    }

    @InputImport(name="metadata")
      private final @Nullable Input<DatasetMetadataArgs> metadata;

    public Input<DatasetMetadataArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="s3InputDefinition")
      private final @Nullable Input<DatasetS3LocationArgs> s3InputDefinition;

    public Input<DatasetS3LocationArgs> getS3InputDefinition() {
        return this.s3InputDefinition == null ? Input.empty() : this.s3InputDefinition;
    }

    public DatasetInputArgs(
        @Nullable Input<DatasetDataCatalogInputDefinitionArgs> dataCatalogInputDefinition,
        @Nullable Input<DatasetDatabaseInputDefinitionArgs> databaseInputDefinition,
        @Nullable Input<DatasetMetadataArgs> metadata,
        @Nullable Input<DatasetS3LocationArgs> s3InputDefinition) {
        this.dataCatalogInputDefinition = dataCatalogInputDefinition;
        this.databaseInputDefinition = databaseInputDefinition;
        this.metadata = metadata;
        this.s3InputDefinition = s3InputDefinition;
    }

    private DatasetInputArgs() {
        this.dataCatalogInputDefinition = Input.empty();
        this.databaseInputDefinition = Input.empty();
        this.metadata = Input.empty();
        this.s3InputDefinition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DatasetDataCatalogInputDefinitionArgs> dataCatalogInputDefinition;
        private @Nullable Input<DatasetDatabaseInputDefinitionArgs> databaseInputDefinition;
        private @Nullable Input<DatasetMetadataArgs> metadata;
        private @Nullable Input<DatasetS3LocationArgs> s3InputDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCatalogInputDefinition = defaults.dataCatalogInputDefinition;
    	      this.databaseInputDefinition = defaults.databaseInputDefinition;
    	      this.metadata = defaults.metadata;
    	      this.s3InputDefinition = defaults.s3InputDefinition;
        }

        public Builder dataCatalogInputDefinition(@Nullable Input<DatasetDataCatalogInputDefinitionArgs> dataCatalogInputDefinition) {
            this.dataCatalogInputDefinition = dataCatalogInputDefinition;
            return this;
        }

        public Builder dataCatalogInputDefinition(@Nullable DatasetDataCatalogInputDefinitionArgs dataCatalogInputDefinition) {
            this.dataCatalogInputDefinition = Input.ofNullable(dataCatalogInputDefinition);
            return this;
        }

        public Builder databaseInputDefinition(@Nullable Input<DatasetDatabaseInputDefinitionArgs> databaseInputDefinition) {
            this.databaseInputDefinition = databaseInputDefinition;
            return this;
        }

        public Builder databaseInputDefinition(@Nullable DatasetDatabaseInputDefinitionArgs databaseInputDefinition) {
            this.databaseInputDefinition = Input.ofNullable(databaseInputDefinition);
            return this;
        }

        public Builder metadata(@Nullable Input<DatasetMetadataArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable DatasetMetadataArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder s3InputDefinition(@Nullable Input<DatasetS3LocationArgs> s3InputDefinition) {
            this.s3InputDefinition = s3InputDefinition;
            return this;
        }

        public Builder s3InputDefinition(@Nullable DatasetS3LocationArgs s3InputDefinition) {
            this.s3InputDefinition = Input.ofNullable(s3InputDefinition);
            return this;
        }
        public DatasetInputArgs build() {
            return new DatasetInputArgs(dataCatalogInputDefinition, databaseInputDefinition, metadata, s3InputDefinition);
        }
    }
}
