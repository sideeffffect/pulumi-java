// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ResponseHeadersPolicyFrameOptionsArgs extends ResourceArgs {

    public static final ResponseHeadersPolicyFrameOptionsArgs Empty = new ResponseHeadersPolicyFrameOptionsArgs();

    @Import(name="frameOption", required=true)
    private Output<String> frameOption;

    public Output<String> frameOption() {
        return this.frameOption;
    }

    @Import(name="override", required=true)
    private Output<Boolean> override;

    public Output<Boolean> override() {
        return this.override;
    }

    private ResponseHeadersPolicyFrameOptionsArgs() {}

    private ResponseHeadersPolicyFrameOptionsArgs(ResponseHeadersPolicyFrameOptionsArgs $) {
        this.frameOption = $.frameOption;
        this.override = $.override;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponseHeadersPolicyFrameOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponseHeadersPolicyFrameOptionsArgs $;

        public Builder() {
            $ = new ResponseHeadersPolicyFrameOptionsArgs();
        }

        public Builder(ResponseHeadersPolicyFrameOptionsArgs defaults) {
            $ = new ResponseHeadersPolicyFrameOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder frameOption(Output<String> frameOption) {
            $.frameOption = frameOption;
            return this;
        }

        public Builder frameOption(String frameOption) {
            return frameOption(Output.of(frameOption));
        }

        public Builder override(Output<Boolean> override) {
            $.override = override;
            return this;
        }

        public Builder override(Boolean override) {
            return override(Output.of(override));
        }

        public ResponseHeadersPolicyFrameOptionsArgs build() {
            $.frameOption = Objects.requireNonNull($.frameOption, "expected parameter 'frameOption' to be non-null");
            $.override = Objects.requireNonNull($.override, "expected parameter 'override' to be non-null");
            return $;
        }
    }

}
