// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs();

    /**
     * Provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
     * 
     */
    @Import(name="mappingParameters", required=true)
    private Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersGetArgs> mappingParameters;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersGetArgs> mappingParameters() {
        return this.mappingParameters;
    }

    /**
     * The type of record format. Valid values: `CSV`, `JSON`.
     * 
     */
    @Import(name="recordFormatType", required=true)
    private Output<String> recordFormatType;

    public Output<String> recordFormatType() {
        return this.recordFormatType;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs() {}

    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs $) {
        this.mappingParameters = $.mappingParameters;
        this.recordFormatType = $.recordFormatType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs();
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs defaults) {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder mappingParameters(Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersGetArgs> mappingParameters) {
            $.mappingParameters = mappingParameters;
            return this;
        }

        public Builder mappingParameters(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersGetArgs mappingParameters) {
            return mappingParameters(Output.of(mappingParameters));
        }

        public Builder recordFormatType(Output<String> recordFormatType) {
            $.recordFormatType = recordFormatType;
            return this;
        }

        public Builder recordFormatType(String recordFormatType) {
            return recordFormatType(Output.of(recordFormatType));
        }

        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs build() {
            $.mappingParameters = Objects.requireNonNull($.mappingParameters, "expected parameter 'mappingParameters' to be non-null");
            $.recordFormatType = Objects.requireNonNull($.recordFormatType, "expected parameter 'recordFormatType' to be non-null");
            return $;
        }
    }

}
