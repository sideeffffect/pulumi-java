// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs Empty = new FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs();

    /**
     * Parameter name. Valid Values: `LambdaArn`, `NumberOfRetries`, `RoleArn`, `BufferSizeInMBs`, `BufferIntervalInSeconds`
     * 
     */
    @Import(name="parameterName", required=true)
    private Output<String> parameterName;

    public Output<String> parameterName() {
        return this.parameterName;
    }

    /**
     * Parameter value. Must be between 1 and 512 length (inclusive). When providing a Lambda ARN, you should specify the resource version as well.
     * 
     */
    @Import(name="parameterValue", required=true)
    private Output<String> parameterValue;

    public Output<String> parameterValue() {
        return this.parameterValue;
    }

    private FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs() {}

    private FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs $) {
        this.parameterName = $.parameterName;
        this.parameterValue = $.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs $;

        public Builder() {
            $ = new FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs();
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs defaults) {
            $ = new FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs(Objects.requireNonNull(defaults));
        }

        public Builder parameterName(Output<String> parameterName) {
            $.parameterName = parameterName;
            return this;
        }

        public Builder parameterName(String parameterName) {
            return parameterName(Output.of(parameterName));
        }

        public Builder parameterValue(Output<String> parameterValue) {
            $.parameterValue = parameterValue;
            return this;
        }

        public Builder parameterValue(String parameterValue) {
            return parameterValue(Output.of(parameterValue));
        }

        public FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs build() {
            $.parameterName = Objects.requireNonNull($.parameterName, "expected parameter 'parameterName' to be non-null");
            $.parameterValue = Objects.requireNonNull($.parameterValue, "expected parameter 'parameterValue' to be non-null");
            return $;
        }
    }

}
