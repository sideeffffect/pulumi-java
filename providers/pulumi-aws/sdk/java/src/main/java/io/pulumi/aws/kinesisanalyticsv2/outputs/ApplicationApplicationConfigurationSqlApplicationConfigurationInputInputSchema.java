// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn;
import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema {
    /**
     * Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
     * 
     */
    private final List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn> recordColumns;
    /**
     * Specifies the encoding of the records in the streaming source. For example, `UTF-8`.
     * 
     */
    private final @Nullable String recordEncoding;
    /**
     * Specifies the format of the records on the streaming source.
     * 
     */
    private final ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat recordFormat;

    @OutputCustomType.Constructor({"recordColumns","recordEncoding","recordFormat"})
    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema(
        List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn> recordColumns,
        @Nullable String recordEncoding,
        ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat recordFormat) {
        this.recordColumns = recordColumns;
        this.recordEncoding = recordEncoding;
        this.recordFormat = recordFormat;
    }

    /**
     * Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
     * 
    */
    public List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn> getRecordColumns() {
        return this.recordColumns;
    }
    /**
     * Specifies the encoding of the records in the streaming source. For example, `UTF-8`.
     * 
    */
    public Optional<String> getRecordEncoding() {
        return Optional.ofNullable(this.recordEncoding);
    }
    /**
     * Specifies the format of the records on the streaming source.
     * 
    */
    public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat getRecordFormat() {
        return this.recordFormat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn> recordColumns;
        private @Nullable String recordEncoding;
        private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat recordFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordColumns = defaults.recordColumns;
    	      this.recordEncoding = defaults.recordEncoding;
    	      this.recordFormat = defaults.recordFormat;
        }

        public Builder setRecordColumns(List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn> recordColumns) {
            this.recordColumns = Objects.requireNonNull(recordColumns);
            return this;
        }

        public Builder setRecordEncoding(@Nullable String recordEncoding) {
            this.recordEncoding = recordEncoding;
            return this;
        }

        public Builder setRecordFormat(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat recordFormat) {
            this.recordFormat = Objects.requireNonNull(recordFormat);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema(recordColumns, recordEncoding, recordFormat);
        }
    }
}
