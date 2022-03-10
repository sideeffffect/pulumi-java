// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationArgs Empty = new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationArgs();

    /**
     * Nested argument that specifies which deserializer to use. You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. More details below.
     * 
     */
    @InputImport(name="deserializer", required=true)
      private final Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerArgs> deserializer;

    public Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerArgs> getDeserializer() {
        return this.deserializer;
    }

    public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationArgs(Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerArgs> deserializer) {
        this.deserializer = Objects.requireNonNull(deserializer, "expected parameter 'deserializer' to be non-null");
    }

    private FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationArgs() {
        this.deserializer = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerArgs> deserializer;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deserializer = defaults.deserializer;
        }

        public Builder deserializer(Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerArgs> deserializer) {
            this.deserializer = Objects.requireNonNull(deserializer);
            return this;
        }

        public Builder deserializer(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerArgs deserializer) {
            this.deserializer = Input.of(Objects.requireNonNull(deserializer));
            return this;
        }
        public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationArgs build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationArgs(deserializer);
        }
    }
}
