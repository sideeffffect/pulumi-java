// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;


public final class ResponseHeadersPolicyContentTypeOptionsArgs extends ResourceArgs {

    public static final ResponseHeadersPolicyContentTypeOptionsArgs Empty = new ResponseHeadersPolicyContentTypeOptionsArgs();

    @Import(name="override", required=true)
    private Output<Boolean> override;

    public Output<Boolean> override() {
        return this.override;
    }

    private ResponseHeadersPolicyContentTypeOptionsArgs() {}

    private ResponseHeadersPolicyContentTypeOptionsArgs(ResponseHeadersPolicyContentTypeOptionsArgs $) {
        this.override = $.override;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponseHeadersPolicyContentTypeOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponseHeadersPolicyContentTypeOptionsArgs $;

        public Builder() {
            $ = new ResponseHeadersPolicyContentTypeOptionsArgs();
        }

        public Builder(ResponseHeadersPolicyContentTypeOptionsArgs defaults) {
            $ = new ResponseHeadersPolicyContentTypeOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder override(Output<Boolean> override) {
            $.override = override;
            return this;
        }

        public Builder override(Boolean override) {
            return override(Output.of(override));
        }

        public ResponseHeadersPolicyContentTypeOptionsArgs build() {
            $.override = Objects.requireNonNull($.override, "expected parameter 'override' to be non-null");
            return $;
        }
    }

}
