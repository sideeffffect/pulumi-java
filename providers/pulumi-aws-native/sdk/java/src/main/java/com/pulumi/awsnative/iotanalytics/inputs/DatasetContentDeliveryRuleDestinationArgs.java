// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.awsnative.iotanalytics.inputs.DatasetIotEventsDestinationConfigurationArgs;
import com.pulumi.awsnative.iotanalytics.inputs.DatasetS3DestinationConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetContentDeliveryRuleDestinationArgs extends ResourceArgs {

    public static final DatasetContentDeliveryRuleDestinationArgs Empty = new DatasetContentDeliveryRuleDestinationArgs();

    @Import(name="iotEventsDestinationConfiguration")
    private @Nullable Output<DatasetIotEventsDestinationConfigurationArgs> iotEventsDestinationConfiguration;

    public Optional<Output<DatasetIotEventsDestinationConfigurationArgs>> iotEventsDestinationConfiguration() {
        return Optional.ofNullable(this.iotEventsDestinationConfiguration);
    }

    @Import(name="s3DestinationConfiguration")
    private @Nullable Output<DatasetS3DestinationConfigurationArgs> s3DestinationConfiguration;

    public Optional<Output<DatasetS3DestinationConfigurationArgs>> s3DestinationConfiguration() {
        return Optional.ofNullable(this.s3DestinationConfiguration);
    }

    private DatasetContentDeliveryRuleDestinationArgs() {}

    private DatasetContentDeliveryRuleDestinationArgs(DatasetContentDeliveryRuleDestinationArgs $) {
        this.iotEventsDestinationConfiguration = $.iotEventsDestinationConfiguration;
        this.s3DestinationConfiguration = $.s3DestinationConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetContentDeliveryRuleDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetContentDeliveryRuleDestinationArgs $;

        public Builder() {
            $ = new DatasetContentDeliveryRuleDestinationArgs();
        }

        public Builder(DatasetContentDeliveryRuleDestinationArgs defaults) {
            $ = new DatasetContentDeliveryRuleDestinationArgs(Objects.requireNonNull(defaults));
        }

        public Builder iotEventsDestinationConfiguration(@Nullable Output<DatasetIotEventsDestinationConfigurationArgs> iotEventsDestinationConfiguration) {
            $.iotEventsDestinationConfiguration = iotEventsDestinationConfiguration;
            return this;
        }

        public Builder iotEventsDestinationConfiguration(DatasetIotEventsDestinationConfigurationArgs iotEventsDestinationConfiguration) {
            return iotEventsDestinationConfiguration(Output.of(iotEventsDestinationConfiguration));
        }

        public Builder s3DestinationConfiguration(@Nullable Output<DatasetS3DestinationConfigurationArgs> s3DestinationConfiguration) {
            $.s3DestinationConfiguration = s3DestinationConfiguration;
            return this;
        }

        public Builder s3DestinationConfiguration(DatasetS3DestinationConfigurationArgs s3DestinationConfiguration) {
            return s3DestinationConfiguration(Output.of(s3DestinationConfiguration));
        }

        public DatasetContentDeliveryRuleDestinationArgs build() {
            return $;
        }
    }

}
