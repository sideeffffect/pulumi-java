// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStreamStreamModeDetail extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamStreamModeDetail Empty = new GetStreamStreamModeDetail();

    /**
     * The capacity mode of the stream. Either `ON_DEMAND` or `PROVISIONED`.
     * 
     */
    @Import(name="streamMode", required=true)
    private String streamMode;

    public String streamMode() {
        return this.streamMode;
    }

    private GetStreamStreamModeDetail() {}

    private GetStreamStreamModeDetail(GetStreamStreamModeDetail $) {
        this.streamMode = $.streamMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamStreamModeDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamStreamModeDetail $;

        public Builder() {
            $ = new GetStreamStreamModeDetail();
        }

        public Builder(GetStreamStreamModeDetail defaults) {
            $ = new GetStreamStreamModeDetail(Objects.requireNonNull(defaults));
        }

        public Builder streamMode(String streamMode) {
            $.streamMode = streamMode;
            return this;
        }

        public GetStreamStreamModeDetail build() {
            $.streamMode = Objects.requireNonNull($.streamMode, "expected parameter 'streamMode' to be non-null");
            return $;
        }
    }

}
