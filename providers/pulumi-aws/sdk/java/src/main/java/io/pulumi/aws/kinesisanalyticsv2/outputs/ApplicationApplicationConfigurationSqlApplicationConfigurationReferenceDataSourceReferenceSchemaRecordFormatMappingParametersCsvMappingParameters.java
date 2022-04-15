// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters {
    /**
     * The column delimiter. For example, in a CSV format, a comma (`,`) is the typical column delimiter.
     * 
     */
    private final String recordColumnDelimiter;
    /**
     * The row delimiter. For example, in a CSV format, `\n` is the typical row delimiter.
     * 
     */
    private final String recordRowDelimiter;

    @CustomType.Constructor
    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters(
        @CustomType.Parameter("recordColumnDelimiter") String recordColumnDelimiter,
        @CustomType.Parameter("recordRowDelimiter") String recordRowDelimiter) {
        this.recordColumnDelimiter = recordColumnDelimiter;
        this.recordRowDelimiter = recordRowDelimiter;
    }

    /**
     * The column delimiter. For example, in a CSV format, a comma (`,`) is the typical column delimiter.
     * 
    */
    public String recordColumnDelimiter() {
        return this.recordColumnDelimiter;
    }
    /**
     * The row delimiter. For example, in a CSV format, `\n` is the typical row delimiter.
     * 
    */
    public String recordRowDelimiter() {
        return this.recordRowDelimiter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recordColumnDelimiter;
        private String recordRowDelimiter;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordColumnDelimiter = defaults.recordColumnDelimiter;
    	      this.recordRowDelimiter = defaults.recordRowDelimiter;
        }

        public Builder recordColumnDelimiter(String recordColumnDelimiter) {
            this.recordColumnDelimiter = Objects.requireNonNull(recordColumnDelimiter);
            return this;
        }
        public Builder recordRowDelimiter(String recordRowDelimiter) {
            this.recordRowDelimiter = Objects.requireNonNull(recordRowDelimiter);
            return this;
        }        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters(recordColumnDelimiter, recordRowDelimiter);
        }
    }
}
