// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationReferenceDataSourcesSchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationReferenceDataSourcesSchemaArgs Empty = new AnalyticsApplicationReferenceDataSourcesSchemaArgs();

    /**
     * The Record Column mapping for the streaming source data element.
     * See Record Columns below for more details.
     * 
     */
    @Import(name="recordColumns", required=true)
      private final Output<List<AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs>> recordColumns;

    public Output<List<AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs>> recordColumns() {
        return this.recordColumns;
    }

    /**
     * The Encoding of the record in the streaming source.
     * 
     */
    @Import(name="recordEncoding")
      private final @Nullable Output<String> recordEncoding;

    public Output<String> recordEncoding() {
        return this.recordEncoding == null ? Codegen.empty() : this.recordEncoding;
    }

    /**
     * The Record Format and mapping information to schematize a record.
     * See Record Format below for more details.
     * 
     */
    @Import(name="recordFormat", required=true)
      private final Output<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs> recordFormat;

    public Output<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs> recordFormat() {
        return this.recordFormat;
    }

    public AnalyticsApplicationReferenceDataSourcesSchemaArgs(
        Output<List<AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs>> recordColumns,
        @Nullable Output<String> recordEncoding,
        Output<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs> recordFormat) {
        this.recordColumns = Objects.requireNonNull(recordColumns, "expected parameter 'recordColumns' to be non-null");
        this.recordEncoding = recordEncoding;
        this.recordFormat = Objects.requireNonNull(recordFormat, "expected parameter 'recordFormat' to be non-null");
    }

    private AnalyticsApplicationReferenceDataSourcesSchemaArgs() {
        this.recordColumns = Codegen.empty();
        this.recordEncoding = Codegen.empty();
        this.recordFormat = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs>> recordColumns;
        private @Nullable Output<String> recordEncoding;
        private Output<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs> recordFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordColumns = defaults.recordColumns;
    	      this.recordEncoding = defaults.recordEncoding;
    	      this.recordFormat = defaults.recordFormat;
        }

        public Builder recordColumns(Output<List<AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs>> recordColumns) {
            this.recordColumns = Objects.requireNonNull(recordColumns);
            return this;
        }
        public Builder recordColumns(List<AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs> recordColumns) {
            this.recordColumns = Output.of(Objects.requireNonNull(recordColumns));
            return this;
        }
        public Builder recordColumns(AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs... recordColumns) {
            return recordColumns(List.of(recordColumns));
        }
        public Builder recordEncoding(@Nullable Output<String> recordEncoding) {
            this.recordEncoding = recordEncoding;
            return this;
        }
        public Builder recordEncoding(@Nullable String recordEncoding) {
            this.recordEncoding = Codegen.ofNullable(recordEncoding);
            return this;
        }
        public Builder recordFormat(Output<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs> recordFormat) {
            this.recordFormat = Objects.requireNonNull(recordFormat);
            return this;
        }
        public Builder recordFormat(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs recordFormat) {
            this.recordFormat = Output.of(Objects.requireNonNull(recordFormat));
            return this;
        }        public AnalyticsApplicationReferenceDataSourcesSchemaArgs build() {
            return new AnalyticsApplicationReferenceDataSourcesSchemaArgs(recordColumns, recordEncoding, recordFormat);
        }
    }
}
