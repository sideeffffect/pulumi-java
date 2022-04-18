// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.outputs;

import com.pulumi.awsnative.iotanalytics.outputs.DatastoreJsonConfiguration;
import com.pulumi.awsnative.iotanalytics.outputs.DatastoreParquetConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatastoreFileFormatConfiguration {
    private final @Nullable DatastoreJsonConfiguration jsonConfiguration;
    private final @Nullable DatastoreParquetConfiguration parquetConfiguration;

    @CustomType.Constructor
    private DatastoreFileFormatConfiguration(
        @CustomType.Parameter("jsonConfiguration") @Nullable DatastoreJsonConfiguration jsonConfiguration,
        @CustomType.Parameter("parquetConfiguration") @Nullable DatastoreParquetConfiguration parquetConfiguration) {
        this.jsonConfiguration = jsonConfiguration;
        this.parquetConfiguration = parquetConfiguration;
    }

    public Optional<DatastoreJsonConfiguration> jsonConfiguration() {
        return Optional.ofNullable(this.jsonConfiguration);
    }
    public Optional<DatastoreParquetConfiguration> parquetConfiguration() {
        return Optional.ofNullable(this.parquetConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastoreFileFormatConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatastoreJsonConfiguration jsonConfiguration;
        private @Nullable DatastoreParquetConfiguration parquetConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastoreFileFormatConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonConfiguration = defaults.jsonConfiguration;
    	      this.parquetConfiguration = defaults.parquetConfiguration;
        }

        public Builder jsonConfiguration(@Nullable DatastoreJsonConfiguration jsonConfiguration) {
            this.jsonConfiguration = jsonConfiguration;
            return this;
        }
        public Builder parquetConfiguration(@Nullable DatastoreParquetConfiguration parquetConfiguration) {
            this.parquetConfiguration = parquetConfiguration;
            return this;
        }        public DatastoreFileFormatConfiguration build() {
            return new DatastoreFileFormatConfiguration(jsonConfiguration, parquetConfiguration);
        }
    }
}
