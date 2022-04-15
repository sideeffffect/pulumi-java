// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportDestinationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsConfigurationStorageClassAnalysisDataExportArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsConfigurationStorageClassAnalysisDataExportArgs Empty = new AnalyticsConfigurationStorageClassAnalysisDataExportArgs();

    /**
     * Specifies the destination for the exported analytics data (documented below).
     * 
     */
    @Import(name="destination", required=true)
      private final Output<AnalyticsConfigurationStorageClassAnalysisDataExportDestinationArgs> destination;

    public Output<AnalyticsConfigurationStorageClassAnalysisDataExportDestinationArgs> destination() {
        return this.destination;
    }

    /**
     * The schema version of exported analytics data. Allowed values: `V_1`. Default value: `V_1`.
     * 
     */
    @Import(name="outputSchemaVersion")
      private final @Nullable Output<String> outputSchemaVersion;

    public Output<String> outputSchemaVersion() {
        return this.outputSchemaVersion == null ? Codegen.empty() : this.outputSchemaVersion;
    }

    public AnalyticsConfigurationStorageClassAnalysisDataExportArgs(
        Output<AnalyticsConfigurationStorageClassAnalysisDataExportDestinationArgs> destination,
        @Nullable Output<String> outputSchemaVersion) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.outputSchemaVersion = outputSchemaVersion;
    }

    private AnalyticsConfigurationStorageClassAnalysisDataExportArgs() {
        this.destination = Codegen.empty();
        this.outputSchemaVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsConfigurationStorageClassAnalysisDataExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AnalyticsConfigurationStorageClassAnalysisDataExportDestinationArgs> destination;
        private @Nullable Output<String> outputSchemaVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsConfigurationStorageClassAnalysisDataExportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.outputSchemaVersion = defaults.outputSchemaVersion;
        }

        public Builder destination(Output<AnalyticsConfigurationStorageClassAnalysisDataExportDestinationArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder destination(AnalyticsConfigurationStorageClassAnalysisDataExportDestinationArgs destination) {
            this.destination = Output.of(Objects.requireNonNull(destination));
            return this;
        }
        public Builder outputSchemaVersion(@Nullable Output<String> outputSchemaVersion) {
            this.outputSchemaVersion = outputSchemaVersion;
            return this;
        }
        public Builder outputSchemaVersion(@Nullable String outputSchemaVersion) {
            this.outputSchemaVersion = Codegen.ofNullable(outputSchemaVersion);
            return this;
        }        public AnalyticsConfigurationStorageClassAnalysisDataExportArgs build() {
            return new AnalyticsConfigurationStorageClassAnalysisDataExportArgs(destination, outputSchemaVersion);
        }
    }
}
