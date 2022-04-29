// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devicefarm.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetDevicePoolArgs extends InvokeArgs {

    public static final GetDevicePoolArgs Empty = new GetDevicePoolArgs();

    @Import(name="arn", required=true)
    private String arn;

    public String arn() {
        return this.arn;
    }

    private GetDevicePoolArgs() {}

    private GetDevicePoolArgs(GetDevicePoolArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDevicePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDevicePoolArgs $;

        public Builder() {
            $ = new GetDevicePoolArgs();
        }

        public Builder(GetDevicePoolArgs defaults) {
            $ = new GetDevicePoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetDevicePoolArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
