// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.enums.GranularityType;
import io.pulumi.azurenative.costmanagement.inputs.ExportDatasetConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The definition for data in the export.
 * 
 */
public final class ExportDatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExportDatasetArgs Empty = new ExportDatasetArgs();

    /**
     * The export dataset configuration.
     * 
     */
    @InputImport(name="configuration")
      private final @Nullable Input<ExportDatasetConfigurationArgs> configuration;

    public Input<ExportDatasetConfigurationArgs> getConfiguration() {
        return this.configuration == null ? Input.empty() : this.configuration;
    }

    /**
     * The granularity of rows in the export. Currently only 'Daily' is supported.
     * 
     */
    @InputImport(name="granularity")
      private final @Nullable Input<Either<String,GranularityType>> granularity;

    public Input<Either<String,GranularityType>> getGranularity() {
        return this.granularity == null ? Input.empty() : this.granularity;
    }

    public ExportDatasetArgs(
        @Nullable Input<ExportDatasetConfigurationArgs> configuration,
        @Nullable Input<Either<String,GranularityType>> granularity) {
        this.configuration = configuration;
        this.granularity = granularity;
    }

    private ExportDatasetArgs() {
        this.configuration = Input.empty();
        this.granularity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ExportDatasetConfigurationArgs> configuration;
        private @Nullable Input<Either<String,GranularityType>> granularity;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.granularity = defaults.granularity;
        }

        public Builder configuration(@Nullable Input<ExportDatasetConfigurationArgs> configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder configuration(@Nullable ExportDatasetConfigurationArgs configuration) {
            this.configuration = Input.ofNullable(configuration);
            return this;
        }

        public Builder granularity(@Nullable Input<Either<String,GranularityType>> granularity) {
            this.granularity = granularity;
            return this;
        }

        public Builder granularity(@Nullable Either<String,GranularityType> granularity) {
            this.granularity = Input.ofNullable(granularity);
            return this;
        }
        public ExportDatasetArgs build() {
            return new ExportDatasetArgs(configuration, granularity);
        }
    }
}
