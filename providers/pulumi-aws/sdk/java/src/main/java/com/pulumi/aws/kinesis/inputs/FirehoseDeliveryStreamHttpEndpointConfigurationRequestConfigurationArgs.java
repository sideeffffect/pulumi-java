// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs Empty = new FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs();

    /**
     * Describes the metadata sent to the HTTP endpoint destination. More details are given below
     * 
     */
    @Import(name="commonAttributes")
    private @Nullable Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs>> commonAttributes;

    public Optional<Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs>>> commonAttributes() {
        return Optional.ofNullable(this.commonAttributes);
    }

    /**
     * Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the request to the destination. Valid values are `NONE` and `GZIP`.  Default value is `NONE`.
     * 
     */
    @Import(name="contentEncoding")
    private @Nullable Output<String> contentEncoding;

    public Optional<Output<String>> contentEncoding() {
        return Optional.ofNullable(this.contentEncoding);
    }

    private FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs() {}

    private FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs(FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs $) {
        this.commonAttributes = $.commonAttributes;
        this.contentEncoding = $.contentEncoding;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs $;

        public Builder() {
            $ = new FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs();
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs defaults) {
            $ = new FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder commonAttributes(@Nullable Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs>> commonAttributes) {
            $.commonAttributes = commonAttributes;
            return this;
        }

        public Builder commonAttributes(List<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs> commonAttributes) {
            return commonAttributes(Output.of(commonAttributes));
        }

        public Builder commonAttributes(FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs... commonAttributes) {
            return commonAttributes(List.of(commonAttributes));
        }

        public Builder contentEncoding(@Nullable Output<String> contentEncoding) {
            $.contentEncoding = contentEncoding;
            return this;
        }

        public Builder contentEncoding(String contentEncoding) {
            return contentEncoding(Output.of(contentEncoding));
        }

        public FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs build() {
            return $;
        }
    }

}
