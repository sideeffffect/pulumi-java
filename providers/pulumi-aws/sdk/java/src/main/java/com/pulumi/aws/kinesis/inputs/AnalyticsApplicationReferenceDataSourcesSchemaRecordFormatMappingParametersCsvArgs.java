// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs Empty = new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs();

    /**
     * The Column Delimiter.
     * 
     */
    @Import(name="recordColumnDelimiter", required=true)
    private Output<String> recordColumnDelimiter;

    public Output<String> recordColumnDelimiter() {
        return this.recordColumnDelimiter;
    }

    /**
     * The Row Delimiter.
     * 
     */
    @Import(name="recordRowDelimiter", required=true)
    private Output<String> recordRowDelimiter;

    public Output<String> recordRowDelimiter() {
        return this.recordRowDelimiter;
    }

    private AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs() {}

    private AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs $) {
        this.recordColumnDelimiter = $.recordColumnDelimiter;
        this.recordRowDelimiter = $.recordRowDelimiter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs $;

        public Builder() {
            $ = new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs();
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs defaults) {
            $ = new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs(Objects.requireNonNull(defaults));
        }

        public Builder recordColumnDelimiter(Output<String> recordColumnDelimiter) {
            $.recordColumnDelimiter = recordColumnDelimiter;
            return this;
        }

        public Builder recordColumnDelimiter(String recordColumnDelimiter) {
            return recordColumnDelimiter(Output.of(recordColumnDelimiter));
        }

        public Builder recordRowDelimiter(Output<String> recordRowDelimiter) {
            $.recordRowDelimiter = recordRowDelimiter;
            return this;
        }

        public Builder recordRowDelimiter(String recordRowDelimiter) {
            return recordRowDelimiter(Output.of(recordRowDelimiter));
        }

        public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs build() {
            $.recordColumnDelimiter = Objects.requireNonNull($.recordColumnDelimiter, "expected parameter 'recordColumnDelimiter' to be non-null");
            $.recordRowDelimiter = Objects.requireNonNull($.recordRowDelimiter, "expected parameter 'recordRowDelimiter' to be non-null");
            return $;
        }
    }

}
