// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs Empty = new FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs();

    /**
     * Describes the metadata sent to the HTTP endpoint destination. More details are given below
     * 
     */
    @InputImport(name="commonAttributes")
      private final @Nullable Input<List<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs>> commonAttributes;

    public Input<List<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs>> getCommonAttributes() {
        return this.commonAttributes == null ? Input.empty() : this.commonAttributes;
    }

    /**
     * Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the request to the destination. Valid values are `NONE` and `GZIP`.  Default value is `NONE`.
     * 
     */
    @InputImport(name="contentEncoding")
      private final @Nullable Input<String> contentEncoding;

    public Input<String> getContentEncoding() {
        return this.contentEncoding == null ? Input.empty() : this.contentEncoding;
    }

    public FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs(
        @Nullable Input<List<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs>> commonAttributes,
        @Nullable Input<String> contentEncoding) {
        this.commonAttributes = commonAttributes;
        this.contentEncoding = contentEncoding;
    }

    private FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs() {
        this.commonAttributes = Input.empty();
        this.contentEncoding = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs>> commonAttributes;
        private @Nullable Input<String> contentEncoding;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonAttributes = defaults.commonAttributes;
    	      this.contentEncoding = defaults.contentEncoding;
        }

        public Builder commonAttributes(@Nullable Input<List<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs>> commonAttributes) {
            this.commonAttributes = commonAttributes;
            return this;
        }

        public Builder commonAttributes(@Nullable List<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs> commonAttributes) {
            this.commonAttributes = Input.ofNullable(commonAttributes);
            return this;
        }

        public Builder contentEncoding(@Nullable Input<String> contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }

        public Builder contentEncoding(@Nullable String contentEncoding) {
            this.contentEncoding = Input.ofNullable(contentEncoding);
            return this;
        }
        public FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs build() {
            return new FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs(commonAttributes, contentEncoding);
        }
    }
}
