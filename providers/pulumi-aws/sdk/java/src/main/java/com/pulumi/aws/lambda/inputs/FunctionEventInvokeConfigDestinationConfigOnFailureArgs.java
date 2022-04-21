// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FunctionEventInvokeConfigDestinationConfigOnFailureArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionEventInvokeConfigDestinationConfigOnFailureArgs Empty = new FunctionEventInvokeConfigDestinationConfigOnFailureArgs();

    /**
     * Amazon Resource Name (ARN) of the destination resource. See the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations) for acceptable resource types and associated IAM permissions.
     * 
     */
    @Import(name="destination", required=true)
    private Output<String> destination;

    public Output<String> destination() {
        return this.destination;
    }

    private FunctionEventInvokeConfigDestinationConfigOnFailureArgs() {}

    private FunctionEventInvokeConfigDestinationConfigOnFailureArgs(FunctionEventInvokeConfigDestinationConfigOnFailureArgs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionEventInvokeConfigDestinationConfigOnFailureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionEventInvokeConfigDestinationConfigOnFailureArgs $;

        public Builder() {
            $ = new FunctionEventInvokeConfigDestinationConfigOnFailureArgs();
        }

        public Builder(FunctionEventInvokeConfigDestinationConfigOnFailureArgs defaults) {
            $ = new FunctionEventInvokeConfigDestinationConfigOnFailureArgs(Objects.requireNonNull(defaults));
        }

        public Builder destination(Output<String> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        public FunctionEventInvokeConfigDestinationConfigOnFailureArgs build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            return $;
        }
    }

}
