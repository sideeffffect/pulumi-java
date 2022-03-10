// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParameters;
import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParameters;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters {
    /**
     * Provides additional mapping information when the record format uses delimiters (for example, CSV).
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParameters csvMappingParameters;
    /**
     * Provides additional mapping information when JSON is the record format on the streaming source.
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParameters jsonMappingParameters;

    @OutputCustomType.Constructor
    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters(
        @OutputCustomType.Parameter("csvMappingParameters") @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParameters csvMappingParameters,
        @OutputCustomType.Parameter("jsonMappingParameters") @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParameters jsonMappingParameters) {
        this.csvMappingParameters = csvMappingParameters;
        this.jsonMappingParameters = jsonMappingParameters;
    }

    /**
     * Provides additional mapping information when the record format uses delimiters (for example, CSV).
     * 
    */
    public Optional<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParameters> getCsvMappingParameters() {
        return Optional.ofNullable(this.csvMappingParameters);
    }
    /**
     * Provides additional mapping information when JSON is the record format on the streaming source.
     * 
    */
    public Optional<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParameters> getJsonMappingParameters() {
        return Optional.ofNullable(this.jsonMappingParameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParameters csvMappingParameters;
        private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParameters jsonMappingParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csvMappingParameters = defaults.csvMappingParameters;
    	      this.jsonMappingParameters = defaults.jsonMappingParameters;
        }

        public Builder csvMappingParameters(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParameters csvMappingParameters) {
            this.csvMappingParameters = csvMappingParameters;
            return this;
        }

        public Builder jsonMappingParameters(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParameters jsonMappingParameters) {
            this.jsonMappingParameters = jsonMappingParameters;
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters(csvMappingParameters, jsonMappingParameters);
        }
    }
}
