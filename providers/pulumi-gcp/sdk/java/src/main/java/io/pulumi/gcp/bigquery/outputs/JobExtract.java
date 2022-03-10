// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.bigquery.outputs.JobExtractSourceModel;
import io.pulumi.gcp.bigquery.outputs.JobExtractSourceTable;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobExtract {
    /**
     * The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE.
     * The default value is NONE. DEFLATE and SNAPPY are only supported for Avro.
     * 
     */
    private final @Nullable String compression;
    /**
     * The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON and AVRO for tables and SAVED_MODEL for models.
     * The default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV.
     * The default value for models is SAVED_MODEL.
     * 
     */
    private final @Nullable String destinationFormat;
    /**
     * A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.
     * 
     */
    private final List<String> destinationUris;
    /**
     * When extracting data in CSV format, this defines the delimiter to use between fields in the exported data.
     * Default is ','
     * 
     */
    private final @Nullable String fieldDelimiter;
    /**
     * Whether to print out a header row in the results. Default is true.
     * 
     */
    private final @Nullable Boolean printHeader;
    /**
     * A reference to the model being exported.
     * Structure is documented below.
     * 
     */
    private final @Nullable JobExtractSourceModel sourceModel;
    /**
     * A reference to the table being exported.
     * Structure is documented below.
     * 
     */
    private final @Nullable JobExtractSourceTable sourceTable;
    /**
     * Whether to use logical types when extracting to AVRO format.
     * 
     */
    private final @Nullable Boolean useAvroLogicalTypes;

    @OutputCustomType.Constructor
    private JobExtract(
        @OutputCustomType.Parameter("compression") @Nullable String compression,
        @OutputCustomType.Parameter("destinationFormat") @Nullable String destinationFormat,
        @OutputCustomType.Parameter("destinationUris") List<String> destinationUris,
        @OutputCustomType.Parameter("fieldDelimiter") @Nullable String fieldDelimiter,
        @OutputCustomType.Parameter("printHeader") @Nullable Boolean printHeader,
        @OutputCustomType.Parameter("sourceModel") @Nullable JobExtractSourceModel sourceModel,
        @OutputCustomType.Parameter("sourceTable") @Nullable JobExtractSourceTable sourceTable,
        @OutputCustomType.Parameter("useAvroLogicalTypes") @Nullable Boolean useAvroLogicalTypes) {
        this.compression = compression;
        this.destinationFormat = destinationFormat;
        this.destinationUris = destinationUris;
        this.fieldDelimiter = fieldDelimiter;
        this.printHeader = printHeader;
        this.sourceModel = sourceModel;
        this.sourceTable = sourceTable;
        this.useAvroLogicalTypes = useAvroLogicalTypes;
    }

    /**
     * The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE.
     * The default value is NONE. DEFLATE and SNAPPY are only supported for Avro.
     * 
    */
    public Optional<String> getCompression() {
        return Optional.ofNullable(this.compression);
    }
    /**
     * The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON and AVRO for tables and SAVED_MODEL for models.
     * The default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV.
     * The default value for models is SAVED_MODEL.
     * 
    */
    public Optional<String> getDestinationFormat() {
        return Optional.ofNullable(this.destinationFormat);
    }
    /**
     * A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.
     * 
    */
    public List<String> getDestinationUris() {
        return this.destinationUris;
    }
    /**
     * When extracting data in CSV format, this defines the delimiter to use between fields in the exported data.
     * Default is ','
     * 
    */
    public Optional<String> getFieldDelimiter() {
        return Optional.ofNullable(this.fieldDelimiter);
    }
    /**
     * Whether to print out a header row in the results. Default is true.
     * 
    */
    public Optional<Boolean> getPrintHeader() {
        return Optional.ofNullable(this.printHeader);
    }
    /**
     * A reference to the model being exported.
     * Structure is documented below.
     * 
    */
    public Optional<JobExtractSourceModel> getSourceModel() {
        return Optional.ofNullable(this.sourceModel);
    }
    /**
     * A reference to the table being exported.
     * Structure is documented below.
     * 
    */
    public Optional<JobExtractSourceTable> getSourceTable() {
        return Optional.ofNullable(this.sourceTable);
    }
    /**
     * Whether to use logical types when extracting to AVRO format.
     * 
    */
    public Optional<Boolean> getUseAvroLogicalTypes() {
        return Optional.ofNullable(this.useAvroLogicalTypes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobExtract defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String compression;
        private @Nullable String destinationFormat;
        private List<String> destinationUris;
        private @Nullable String fieldDelimiter;
        private @Nullable Boolean printHeader;
        private @Nullable JobExtractSourceModel sourceModel;
        private @Nullable JobExtractSourceTable sourceTable;
        private @Nullable Boolean useAvroLogicalTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(JobExtract defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compression = defaults.compression;
    	      this.destinationFormat = defaults.destinationFormat;
    	      this.destinationUris = defaults.destinationUris;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.printHeader = defaults.printHeader;
    	      this.sourceModel = defaults.sourceModel;
    	      this.sourceTable = defaults.sourceTable;
    	      this.useAvroLogicalTypes = defaults.useAvroLogicalTypes;
        }

        public Builder compression(@Nullable String compression) {
            this.compression = compression;
            return this;
        }

        public Builder destinationFormat(@Nullable String destinationFormat) {
            this.destinationFormat = destinationFormat;
            return this;
        }

        public Builder destinationUris(List<String> destinationUris) {
            this.destinationUris = Objects.requireNonNull(destinationUris);
            return this;
        }

        public Builder fieldDelimiter(@Nullable String fieldDelimiter) {
            this.fieldDelimiter = fieldDelimiter;
            return this;
        }

        public Builder printHeader(@Nullable Boolean printHeader) {
            this.printHeader = printHeader;
            return this;
        }

        public Builder sourceModel(@Nullable JobExtractSourceModel sourceModel) {
            this.sourceModel = sourceModel;
            return this;
        }

        public Builder sourceTable(@Nullable JobExtractSourceTable sourceTable) {
            this.sourceTable = sourceTable;
            return this;
        }

        public Builder useAvroLogicalTypes(@Nullable Boolean useAvroLogicalTypes) {
            this.useAvroLogicalTypes = useAvroLogicalTypes;
            return this;
        }
        public JobExtract build() {
            return new JobExtract(compression, destinationFormat, destinationUris, fieldDelimiter, printHeader, sourceModel, sourceTable, useAvroLogicalTypes);
        }
    }
}
