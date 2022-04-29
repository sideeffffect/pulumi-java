// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetRealtimeLogConfigArgs extends InvokeArgs {

    public static final GetRealtimeLogConfigArgs Empty = new GetRealtimeLogConfigArgs();

    @Import(name="arn", required=true)
    private String arn;

    public String arn() {
        return this.arn;
    }

    private GetRealtimeLogConfigArgs() {}

    private GetRealtimeLogConfigArgs(GetRealtimeLogConfigArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRealtimeLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRealtimeLogConfigArgs $;

        public Builder() {
            $ = new GetRealtimeLogConfigArgs();
        }

        public Builder(GetRealtimeLogConfigArgs defaults) {
            $ = new GetRealtimeLogConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetRealtimeLogConfigArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
