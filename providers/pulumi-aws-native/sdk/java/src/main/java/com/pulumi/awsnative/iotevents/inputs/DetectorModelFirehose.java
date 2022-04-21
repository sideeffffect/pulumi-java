// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.inputs;

import com.pulumi.awsnative.iotevents.inputs.DetectorModelPayload;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sends information about the detector model instance and the event that triggered the action to an Amazon Kinesis Data Firehose delivery stream.
 * 
 */
public final class DetectorModelFirehose extends com.pulumi.resources.InvokeArgs {

    public static final DetectorModelFirehose Empty = new DetectorModelFirehose();

    /**
     * The name of the Kinesis Data Firehose delivery stream where the data is written.
     * 
     */
    @Import(name="deliveryStreamName", required=true)
    private String deliveryStreamName;

    public String deliveryStreamName() {
        return this.deliveryStreamName;
    }

    @Import(name="payload")
    private @Nullable DetectorModelPayload payload;

    public Optional<DetectorModelPayload> payload() {
        return Optional.ofNullable(this.payload);
    }

    /**
     * A character separator that is used to separate records written to the Kinesis Data Firehose delivery stream. Valid values are: &#39;\n&#39; (newline), &#39;\t&#39; (tab), &#39;\r\n&#39; (Windows newline), &#39;,&#39; (comma).
     * 
     */
    @Import(name="separator")
    private @Nullable String separator;

    public Optional<String> separator() {
        return Optional.ofNullable(this.separator);
    }

    private DetectorModelFirehose() {}

    private DetectorModelFirehose(DetectorModelFirehose $) {
        this.deliveryStreamName = $.deliveryStreamName;
        this.payload = $.payload;
        this.separator = $.separator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorModelFirehose defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorModelFirehose $;

        public Builder() {
            $ = new DetectorModelFirehose();
        }

        public Builder(DetectorModelFirehose defaults) {
            $ = new DetectorModelFirehose(Objects.requireNonNull(defaults));
        }

        public Builder deliveryStreamName(String deliveryStreamName) {
            $.deliveryStreamName = deliveryStreamName;
            return this;
        }

        public Builder payload(@Nullable DetectorModelPayload payload) {
            $.payload = payload;
            return this;
        }

        public Builder separator(@Nullable String separator) {
            $.separator = separator;
            return this;
        }

        public DetectorModelFirehose build() {
            $.deliveryStreamName = Objects.requireNonNull($.deliveryStreamName, "expected parameter 'deliveryStreamName' to be non-null");
            return $;
        }
    }

}
