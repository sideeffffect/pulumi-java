// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.enums.ExportType;
import io.pulumi.azurenative.costmanagement.enums.TimeframeType;
import io.pulumi.azurenative.costmanagement.inputs.ExportDatasetArgs;
import io.pulumi.azurenative.costmanagement.inputs.ExportTimePeriodArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The definition of an export.
 * 
 */
public final class ExportDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExportDefinitionArgs Empty = new ExportDefinitionArgs();

    /**
     * The definition for data in the export.
     * 
     */
    @InputImport(name="dataSet")
      private final @Nullable Input<ExportDatasetArgs> dataSet;

    public Input<ExportDatasetArgs> getDataSet() {
        return this.dataSet == null ? Input.empty() : this.dataSet;
    }

    /**
     * Has time period for pulling data for the export.
     * 
     */
    @InputImport(name="timePeriod")
      private final @Nullable Input<ExportTimePeriodArgs> timePeriod;

    public Input<ExportTimePeriodArgs> getTimePeriod() {
        return this.timePeriod == null ? Input.empty() : this.timePeriod;
    }

    /**
     * The time frame for pulling data for the export. If custom, then a specific time period must be provided.
     * 
     */
    @InputImport(name="timeframe", required=true)
      private final Input<Either<String,TimeframeType>> timeframe;

    public Input<Either<String,TimeframeType>> getTimeframe() {
        return this.timeframe;
    }

    /**
     * The type of the export. Note that 'Usage' is equivalent to 'ActualCost' and is applicable to exports that do not yet provide data for charges or amortization for service reservations.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<Either<String,ExportType>> type;

    public Input<Either<String,ExportType>> getType() {
        return this.type;
    }

    public ExportDefinitionArgs(
        @Nullable Input<ExportDatasetArgs> dataSet,
        @Nullable Input<ExportTimePeriodArgs> timePeriod,
        Input<Either<String,TimeframeType>> timeframe,
        Input<Either<String,ExportType>> type) {
        this.dataSet = dataSet;
        this.timePeriod = timePeriod;
        this.timeframe = Objects.requireNonNull(timeframe, "expected parameter 'timeframe' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ExportDefinitionArgs() {
        this.dataSet = Input.empty();
        this.timePeriod = Input.empty();
        this.timeframe = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ExportDatasetArgs> dataSet;
        private @Nullable Input<ExportTimePeriodArgs> timePeriod;
        private Input<Either<String,TimeframeType>> timeframe;
        private Input<Either<String,ExportType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSet = defaults.dataSet;
    	      this.timePeriod = defaults.timePeriod;
    	      this.timeframe = defaults.timeframe;
    	      this.type = defaults.type;
        }

        public Builder dataSet(@Nullable Input<ExportDatasetArgs> dataSet) {
            this.dataSet = dataSet;
            return this;
        }

        public Builder dataSet(@Nullable ExportDatasetArgs dataSet) {
            this.dataSet = Input.ofNullable(dataSet);
            return this;
        }

        public Builder timePeriod(@Nullable Input<ExportTimePeriodArgs> timePeriod) {
            this.timePeriod = timePeriod;
            return this;
        }

        public Builder timePeriod(@Nullable ExportTimePeriodArgs timePeriod) {
            this.timePeriod = Input.ofNullable(timePeriod);
            return this;
        }

        public Builder timeframe(Input<Either<String,TimeframeType>> timeframe) {
            this.timeframe = Objects.requireNonNull(timeframe);
            return this;
        }

        public Builder timeframe(Either<String,TimeframeType> timeframe) {
            this.timeframe = Input.of(Objects.requireNonNull(timeframe));
            return this;
        }

        public Builder type(Input<Either<String,ExportType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(Either<String,ExportType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ExportDefinitionArgs build() {
            return new ExportDefinitionArgs(dataSet, timePeriod, timeframe, type);
        }
    }
}
