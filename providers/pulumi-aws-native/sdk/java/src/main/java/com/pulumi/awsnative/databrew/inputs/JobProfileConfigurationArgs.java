// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.awsnative.databrew.inputs.JobColumnSelectorArgs;
import com.pulumi.awsnative.databrew.inputs.JobColumnStatisticsConfigurationArgs;
import com.pulumi.awsnative.databrew.inputs.JobEntityDetectorConfigurationArgs;
import com.pulumi.awsnative.databrew.inputs.JobStatisticsConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobProfileConfigurationArgs extends ResourceArgs {

    public static final JobProfileConfigurationArgs Empty = new JobProfileConfigurationArgs();

    @Import(name="columnStatisticsConfigurations")
    private @Nullable Output<List<JobColumnStatisticsConfigurationArgs>> columnStatisticsConfigurations;

    public Optional<Output<List<JobColumnStatisticsConfigurationArgs>>> columnStatisticsConfigurations() {
        return Optional.ofNullable(this.columnStatisticsConfigurations);
    }

    @Import(name="datasetStatisticsConfiguration")
    private @Nullable Output<JobStatisticsConfigurationArgs> datasetStatisticsConfiguration;

    public Optional<Output<JobStatisticsConfigurationArgs>> datasetStatisticsConfiguration() {
        return Optional.ofNullable(this.datasetStatisticsConfiguration);
    }

    @Import(name="entityDetectorConfiguration")
    private @Nullable Output<JobEntityDetectorConfigurationArgs> entityDetectorConfiguration;

    public Optional<Output<JobEntityDetectorConfigurationArgs>> entityDetectorConfiguration() {
        return Optional.ofNullable(this.entityDetectorConfiguration);
    }

    @Import(name="profileColumns")
    private @Nullable Output<List<JobColumnSelectorArgs>> profileColumns;

    public Optional<Output<List<JobColumnSelectorArgs>>> profileColumns() {
        return Optional.ofNullable(this.profileColumns);
    }

    private JobProfileConfigurationArgs() {}

    private JobProfileConfigurationArgs(JobProfileConfigurationArgs $) {
        this.columnStatisticsConfigurations = $.columnStatisticsConfigurations;
        this.datasetStatisticsConfiguration = $.datasetStatisticsConfiguration;
        this.entityDetectorConfiguration = $.entityDetectorConfiguration;
        this.profileColumns = $.profileColumns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobProfileConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobProfileConfigurationArgs $;

        public Builder() {
            $ = new JobProfileConfigurationArgs();
        }

        public Builder(JobProfileConfigurationArgs defaults) {
            $ = new JobProfileConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder columnStatisticsConfigurations(@Nullable Output<List<JobColumnStatisticsConfigurationArgs>> columnStatisticsConfigurations) {
            $.columnStatisticsConfigurations = columnStatisticsConfigurations;
            return this;
        }

        public Builder columnStatisticsConfigurations(List<JobColumnStatisticsConfigurationArgs> columnStatisticsConfigurations) {
            return columnStatisticsConfigurations(Output.of(columnStatisticsConfigurations));
        }

        public Builder columnStatisticsConfigurations(JobColumnStatisticsConfigurationArgs... columnStatisticsConfigurations) {
            return columnStatisticsConfigurations(List.of(columnStatisticsConfigurations));
        }

        public Builder datasetStatisticsConfiguration(@Nullable Output<JobStatisticsConfigurationArgs> datasetStatisticsConfiguration) {
            $.datasetStatisticsConfiguration = datasetStatisticsConfiguration;
            return this;
        }

        public Builder datasetStatisticsConfiguration(JobStatisticsConfigurationArgs datasetStatisticsConfiguration) {
            return datasetStatisticsConfiguration(Output.of(datasetStatisticsConfiguration));
        }

        public Builder entityDetectorConfiguration(@Nullable Output<JobEntityDetectorConfigurationArgs> entityDetectorConfiguration) {
            $.entityDetectorConfiguration = entityDetectorConfiguration;
            return this;
        }

        public Builder entityDetectorConfiguration(JobEntityDetectorConfigurationArgs entityDetectorConfiguration) {
            return entityDetectorConfiguration(Output.of(entityDetectorConfiguration));
        }

        public Builder profileColumns(@Nullable Output<List<JobColumnSelectorArgs>> profileColumns) {
            $.profileColumns = profileColumns;
            return this;
        }

        public Builder profileColumns(List<JobColumnSelectorArgs> profileColumns) {
            return profileColumns(Output.of(profileColumns));
        }

        public Builder profileColumns(JobColumnSelectorArgs... profileColumns) {
            return profileColumns(List.of(profileColumns));
        }

        public JobProfileConfigurationArgs build() {
            return $;
        }
    }

}
