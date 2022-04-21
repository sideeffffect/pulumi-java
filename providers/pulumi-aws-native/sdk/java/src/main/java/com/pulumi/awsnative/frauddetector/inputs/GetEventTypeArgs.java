// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEventTypeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventTypeArgs Empty = new GetEventTypeArgs();

    /**
     * The ARN of the event type.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    public String arn() {
        return this.arn;
    }

    private GetEventTypeArgs() {}

    private GetEventTypeArgs(GetEventTypeArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventTypeArgs $;

        public Builder() {
            $ = new GetEventTypeArgs();
        }

        public Builder(GetEventTypeArgs defaults) {
            $ = new GetEventTypeArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetEventTypeArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
