// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lookoutmetrics.inputs;

import com.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorAppFlowConfigArgs;
import com.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorCloudwatchConfigArgs;
import com.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorRDSSourceConfigArgs;
import com.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorRedshiftSourceConfigArgs;
import com.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorS3SourceConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnomalyDetectorMetricSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorMetricSourceArgs Empty = new AnomalyDetectorMetricSourceArgs();

    @Import(name="appFlowConfig")
    private @Nullable Output<AnomalyDetectorAppFlowConfigArgs> appFlowConfig;

    public Optional<Output<AnomalyDetectorAppFlowConfigArgs>> appFlowConfig() {
        return Optional.ofNullable(this.appFlowConfig);
    }

    @Import(name="cloudwatchConfig")
    private @Nullable Output<AnomalyDetectorCloudwatchConfigArgs> cloudwatchConfig;

    public Optional<Output<AnomalyDetectorCloudwatchConfigArgs>> cloudwatchConfig() {
        return Optional.ofNullable(this.cloudwatchConfig);
    }

    @Import(name="rDSSourceConfig")
    private @Nullable Output<AnomalyDetectorRDSSourceConfigArgs> rDSSourceConfig;

    public Optional<Output<AnomalyDetectorRDSSourceConfigArgs>> rDSSourceConfig() {
        return Optional.ofNullable(this.rDSSourceConfig);
    }

    @Import(name="redshiftSourceConfig")
    private @Nullable Output<AnomalyDetectorRedshiftSourceConfigArgs> redshiftSourceConfig;

    public Optional<Output<AnomalyDetectorRedshiftSourceConfigArgs>> redshiftSourceConfig() {
        return Optional.ofNullable(this.redshiftSourceConfig);
    }

    @Import(name="s3SourceConfig")
    private @Nullable Output<AnomalyDetectorS3SourceConfigArgs> s3SourceConfig;

    public Optional<Output<AnomalyDetectorS3SourceConfigArgs>> s3SourceConfig() {
        return Optional.ofNullable(this.s3SourceConfig);
    }

    private AnomalyDetectorMetricSourceArgs() {}

    private AnomalyDetectorMetricSourceArgs(AnomalyDetectorMetricSourceArgs $) {
        this.appFlowConfig = $.appFlowConfig;
        this.cloudwatchConfig = $.cloudwatchConfig;
        this.rDSSourceConfig = $.rDSSourceConfig;
        this.redshiftSourceConfig = $.redshiftSourceConfig;
        this.s3SourceConfig = $.s3SourceConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnomalyDetectorMetricSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnomalyDetectorMetricSourceArgs $;

        public Builder() {
            $ = new AnomalyDetectorMetricSourceArgs();
        }

        public Builder(AnomalyDetectorMetricSourceArgs defaults) {
            $ = new AnomalyDetectorMetricSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder appFlowConfig(@Nullable Output<AnomalyDetectorAppFlowConfigArgs> appFlowConfig) {
            $.appFlowConfig = appFlowConfig;
            return this;
        }

        public Builder appFlowConfig(AnomalyDetectorAppFlowConfigArgs appFlowConfig) {
            return appFlowConfig(Output.of(appFlowConfig));
        }

        public Builder cloudwatchConfig(@Nullable Output<AnomalyDetectorCloudwatchConfigArgs> cloudwatchConfig) {
            $.cloudwatchConfig = cloudwatchConfig;
            return this;
        }

        public Builder cloudwatchConfig(AnomalyDetectorCloudwatchConfigArgs cloudwatchConfig) {
            return cloudwatchConfig(Output.of(cloudwatchConfig));
        }

        public Builder rDSSourceConfig(@Nullable Output<AnomalyDetectorRDSSourceConfigArgs> rDSSourceConfig) {
            $.rDSSourceConfig = rDSSourceConfig;
            return this;
        }

        public Builder rDSSourceConfig(AnomalyDetectorRDSSourceConfigArgs rDSSourceConfig) {
            return rDSSourceConfig(Output.of(rDSSourceConfig));
        }

        public Builder redshiftSourceConfig(@Nullable Output<AnomalyDetectorRedshiftSourceConfigArgs> redshiftSourceConfig) {
            $.redshiftSourceConfig = redshiftSourceConfig;
            return this;
        }

        public Builder redshiftSourceConfig(AnomalyDetectorRedshiftSourceConfigArgs redshiftSourceConfig) {
            return redshiftSourceConfig(Output.of(redshiftSourceConfig));
        }

        public Builder s3SourceConfig(@Nullable Output<AnomalyDetectorS3SourceConfigArgs> s3SourceConfig) {
            $.s3SourceConfig = s3SourceConfig;
            return this;
        }

        public Builder s3SourceConfig(AnomalyDetectorS3SourceConfigArgs s3SourceConfig) {
            return s3SourceConfig(Output.of(s3SourceConfig));
        }

        public AnomalyDetectorMetricSourceArgs build() {
            return $;
        }
    }

}
