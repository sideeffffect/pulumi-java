// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.inputs;

import io.pulumi.awsnative.timestream.inputs.ScheduledQueryDimensionMappingArgs;
import io.pulumi.awsnative.timestream.inputs.ScheduledQueryMixedMeasureMappingArgs;
import io.pulumi.awsnative.timestream.inputs.ScheduledQueryMultiMeasureMappingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration needed to write data into the Timestream database and table.
 * 
 */
public final class ScheduledQueryTimestreamConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledQueryTimestreamConfigurationArgs Empty = new ScheduledQueryTimestreamConfigurationArgs();

    @InputImport(name="databaseName", required=true)
      private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    @InputImport(name="dimensionMappings", required=true)
      private final Input<List<ScheduledQueryDimensionMappingArgs>> dimensionMappings;

    public Input<List<ScheduledQueryDimensionMappingArgs>> getDimensionMappings() {
        return this.dimensionMappings;
    }

    @InputImport(name="measureNameColumn")
      private final @Nullable Input<String> measureNameColumn;

    public Input<String> getMeasureNameColumn() {
        return this.measureNameColumn == null ? Input.empty() : this.measureNameColumn;
    }

    @InputImport(name="mixedMeasureMappings")
      private final @Nullable Input<List<ScheduledQueryMixedMeasureMappingArgs>> mixedMeasureMappings;

    public Input<List<ScheduledQueryMixedMeasureMappingArgs>> getMixedMeasureMappings() {
        return this.mixedMeasureMappings == null ? Input.empty() : this.mixedMeasureMappings;
    }

    @InputImport(name="multiMeasureMappings")
      private final @Nullable Input<ScheduledQueryMultiMeasureMappingsArgs> multiMeasureMappings;

    public Input<ScheduledQueryMultiMeasureMappingsArgs> getMultiMeasureMappings() {
        return this.multiMeasureMappings == null ? Input.empty() : this.multiMeasureMappings;
    }

    @InputImport(name="tableName", required=true)
      private final Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName;
    }

    @InputImport(name="timeColumn", required=true)
      private final Input<String> timeColumn;

    public Input<String> getTimeColumn() {
        return this.timeColumn;
    }

    public ScheduledQueryTimestreamConfigurationArgs(
        Input<String> databaseName,
        Input<List<ScheduledQueryDimensionMappingArgs>> dimensionMappings,
        @Nullable Input<String> measureNameColumn,
        @Nullable Input<List<ScheduledQueryMixedMeasureMappingArgs>> mixedMeasureMappings,
        @Nullable Input<ScheduledQueryMultiMeasureMappingsArgs> multiMeasureMappings,
        Input<String> tableName,
        Input<String> timeColumn) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.dimensionMappings = Objects.requireNonNull(dimensionMappings, "expected parameter 'dimensionMappings' to be non-null");
        this.measureNameColumn = measureNameColumn;
        this.mixedMeasureMappings = mixedMeasureMappings;
        this.multiMeasureMappings = multiMeasureMappings;
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
        this.timeColumn = Objects.requireNonNull(timeColumn, "expected parameter 'timeColumn' to be non-null");
    }

    private ScheduledQueryTimestreamConfigurationArgs() {
        this.databaseName = Input.empty();
        this.dimensionMappings = Input.empty();
        this.measureNameColumn = Input.empty();
        this.mixedMeasureMappings = Input.empty();
        this.multiMeasureMappings = Input.empty();
        this.tableName = Input.empty();
        this.timeColumn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryTimestreamConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> databaseName;
        private Input<List<ScheduledQueryDimensionMappingArgs>> dimensionMappings;
        private @Nullable Input<String> measureNameColumn;
        private @Nullable Input<List<ScheduledQueryMixedMeasureMappingArgs>> mixedMeasureMappings;
        private @Nullable Input<ScheduledQueryMultiMeasureMappingsArgs> multiMeasureMappings;
        private Input<String> tableName;
        private Input<String> timeColumn;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryTimestreamConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.dimensionMappings = defaults.dimensionMappings;
    	      this.measureNameColumn = defaults.measureNameColumn;
    	      this.mixedMeasureMappings = defaults.mixedMeasureMappings;
    	      this.multiMeasureMappings = defaults.multiMeasureMappings;
    	      this.tableName = defaults.tableName;
    	      this.timeColumn = defaults.timeColumn;
        }

        public Builder databaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder databaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder dimensionMappings(Input<List<ScheduledQueryDimensionMappingArgs>> dimensionMappings) {
            this.dimensionMappings = Objects.requireNonNull(dimensionMappings);
            return this;
        }

        public Builder dimensionMappings(List<ScheduledQueryDimensionMappingArgs> dimensionMappings) {
            this.dimensionMappings = Input.of(Objects.requireNonNull(dimensionMappings));
            return this;
        }

        public Builder measureNameColumn(@Nullable Input<String> measureNameColumn) {
            this.measureNameColumn = measureNameColumn;
            return this;
        }

        public Builder measureNameColumn(@Nullable String measureNameColumn) {
            this.measureNameColumn = Input.ofNullable(measureNameColumn);
            return this;
        }

        public Builder mixedMeasureMappings(@Nullable Input<List<ScheduledQueryMixedMeasureMappingArgs>> mixedMeasureMappings) {
            this.mixedMeasureMappings = mixedMeasureMappings;
            return this;
        }

        public Builder mixedMeasureMappings(@Nullable List<ScheduledQueryMixedMeasureMappingArgs> mixedMeasureMappings) {
            this.mixedMeasureMappings = Input.ofNullable(mixedMeasureMappings);
            return this;
        }

        public Builder multiMeasureMappings(@Nullable Input<ScheduledQueryMultiMeasureMappingsArgs> multiMeasureMappings) {
            this.multiMeasureMappings = multiMeasureMappings;
            return this;
        }

        public Builder multiMeasureMappings(@Nullable ScheduledQueryMultiMeasureMappingsArgs multiMeasureMappings) {
            this.multiMeasureMappings = Input.ofNullable(multiMeasureMappings);
            return this;
        }

        public Builder tableName(Input<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder tableName(String tableName) {
            this.tableName = Input.of(Objects.requireNonNull(tableName));
            return this;
        }

        public Builder timeColumn(Input<String> timeColumn) {
            this.timeColumn = Objects.requireNonNull(timeColumn);
            return this;
        }

        public Builder timeColumn(String timeColumn) {
            this.timeColumn = Input.of(Objects.requireNonNull(timeColumn));
            return this;
        }
        public ScheduledQueryTimestreamConfigurationArgs build() {
            return new ScheduledQueryTimestreamConfigurationArgs(databaseName, dimensionMappings, measureNameColumn, mixedMeasureMappings, multiMeasureMappings, tableName, timeColumn);
        }
    }
}
