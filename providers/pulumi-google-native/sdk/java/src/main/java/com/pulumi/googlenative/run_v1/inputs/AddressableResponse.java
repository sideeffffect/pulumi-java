// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information for connecting over HTTP(s).
 * 
 */
public final class AddressableResponse extends com.pulumi.resources.InvokeArgs {

    public static final AddressableResponse Empty = new AddressableResponse();

    @Import(name="url", required=true)
    private String url;

    public String url() {
        return this.url;
    }

    private AddressableResponse() {}

    private AddressableResponse(AddressableResponse $) {
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AddressableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddressableResponse $;

        public Builder() {
            $ = new AddressableResponse();
        }

        public Builder(AddressableResponse defaults) {
            $ = new AddressableResponse(Objects.requireNonNull(defaults));
        }

        public Builder url(String url) {
            $.url = url;
            return this;
        }

        public AddressableResponse build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
