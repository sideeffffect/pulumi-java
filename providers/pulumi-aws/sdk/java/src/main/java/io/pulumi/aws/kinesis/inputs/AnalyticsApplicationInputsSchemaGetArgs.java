// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordColumnGetArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationInputsSchemaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationInputsSchemaGetArgs Empty = new AnalyticsApplicationInputsSchemaGetArgs();

    /**
     * The Record Column mapping for the streaming source data element.
     * See Record Columns below for more details.
     * 
     */
    @Import(name="recordColumns", required=true)
      private final Output<List<AnalyticsApplicationInputsSchemaRecordColumnGetArgs>> recordColumns;

    public Output<List<AnalyticsApplicationInputsSchemaRecordColumnGetArgs>> recordColumns() {
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
      private final Output<AnalyticsApplicationInputsSchemaRecordFormatGetArgs> recordFormat;

    public Output<AnalyticsApplicationInputsSchemaRecordFormatGetArgs> recordFormat() {
        return this.recordFormat;
    }

    public AnalyticsApplicationInputsSchemaGetArgs(
        Output<List<AnalyticsApplicationInputsSchemaRecordColumnGetArgs>> recordColumns,
        @Nullable Output<String> recordEncoding,
        Output<AnalyticsApplicationInputsSchemaRecordFormatGetArgs> recordFormat) {
        this.recordColumns = Objects.requireNonNull(recordColumns, "expected parameter 'recordColumns' to be non-null");
        this.recordEncoding = recordEncoding;
        this.recordFormat = Objects.requireNonNull(recordFormat, "expected parameter 'recordFormat' to be non-null");
    }

    private AnalyticsApplicationInputsSchemaGetArgs() {
        this.recordColumns = Codegen.empty();
        this.recordEncoding = Codegen.empty();
        this.recordFormat = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsSchemaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<AnalyticsApplicationInputsSchemaRecordColumnGetArgs>> recordColumns;
        private @Nullable Output<String> recordEncoding;
        private Output<AnalyticsApplicationInputsSchemaRecordFormatGetArgs> recordFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsSchemaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordColumns = defaults.recordColumns;
    	      this.recordEncoding = defaults.recordEncoding;
    	      this.recordFormat = defaults.recordFormat;
        }

        public Builder recordColumns(Output<List<AnalyticsApplicationInputsSchemaRecordColumnGetArgs>> recordColumns) {
            this.recordColumns = Objects.requireNonNull(recordColumns);
            return this;
        }
        public Builder recordColumns(List<AnalyticsApplicationInputsSchemaRecordColumnGetArgs> recordColumns) {
            this.recordColumns = Output.of(Objects.requireNonNull(recordColumns));
            return this;
        }
        public Builder recordColumns(AnalyticsApplicationInputsSchemaRecordColumnGetArgs... recordColumns) {
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
        public Builder recordFormat(Output<AnalyticsApplicationInputsSchemaRecordFormatGetArgs> recordFormat) {
            this.recordFormat = Objects.requireNonNull(recordFormat);
            return this;
        }
        public Builder recordFormat(AnalyticsApplicationInputsSchemaRecordFormatGetArgs recordFormat) {
            this.recordFormat = Output.of(Objects.requireNonNull(recordFormat));
            return this;
        }        public AnalyticsApplicationInputsSchemaGetArgs build() {
            return new AnalyticsApplicationInputsSchemaGetArgs(recordColumns, recordEncoding, recordFormat);
        }
    }
}
