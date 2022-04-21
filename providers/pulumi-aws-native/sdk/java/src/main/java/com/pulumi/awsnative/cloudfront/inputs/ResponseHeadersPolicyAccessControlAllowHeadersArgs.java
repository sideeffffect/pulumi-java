// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ResponseHeadersPolicyAccessControlAllowHeadersArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyAccessControlAllowHeadersArgs Empty = new ResponseHeadersPolicyAccessControlAllowHeadersArgs();

    @Import(name="items", required=true)
    private Output<List<String>> items;

    public Output<List<String>> items() {
        return this.items;
    }

    private ResponseHeadersPolicyAccessControlAllowHeadersArgs() {}

    private ResponseHeadersPolicyAccessControlAllowHeadersArgs(ResponseHeadersPolicyAccessControlAllowHeadersArgs $) {
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponseHeadersPolicyAccessControlAllowHeadersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponseHeadersPolicyAccessControlAllowHeadersArgs $;

        public Builder() {
            $ = new ResponseHeadersPolicyAccessControlAllowHeadersArgs();
        }

        public Builder(ResponseHeadersPolicyAccessControlAllowHeadersArgs defaults) {
            $ = new ResponseHeadersPolicyAccessControlAllowHeadersArgs(Objects.requireNonNull(defaults));
        }

        public Builder items(Output<List<String>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<String> items) {
            return items(Output.of(items));
        }

        public Builder items(String... items) {
            return items(List.of(items));
        }

        public ResponseHeadersPolicyAccessControlAllowHeadersArgs build() {
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            return $;
        }
    }

}
