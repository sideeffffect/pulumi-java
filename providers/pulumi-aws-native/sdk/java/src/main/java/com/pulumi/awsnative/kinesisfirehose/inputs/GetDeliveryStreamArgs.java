// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetDeliveryStreamArgs extends InvokeArgs {

    public static final GetDeliveryStreamArgs Empty = new GetDeliveryStreamArgs();

    @Import(name="deliveryStreamName", required=true)
    private String deliveryStreamName;

    public String deliveryStreamName() {
        return this.deliveryStreamName;
    }

    private GetDeliveryStreamArgs() {}

    private GetDeliveryStreamArgs(GetDeliveryStreamArgs $) {
        this.deliveryStreamName = $.deliveryStreamName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeliveryStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeliveryStreamArgs $;

        public Builder() {
            $ = new GetDeliveryStreamArgs();
        }

        public Builder(GetDeliveryStreamArgs defaults) {
            $ = new GetDeliveryStreamArgs(Objects.requireNonNull(defaults));
        }

        public Builder deliveryStreamName(String deliveryStreamName) {
            $.deliveryStreamName = deliveryStreamName;
            return this;
        }

        public GetDeliveryStreamArgs build() {
            $.deliveryStreamName = Objects.requireNonNull($.deliveryStreamName, "expected parameter 'deliveryStreamName' to be non-null");
            return $;
        }
    }

}
