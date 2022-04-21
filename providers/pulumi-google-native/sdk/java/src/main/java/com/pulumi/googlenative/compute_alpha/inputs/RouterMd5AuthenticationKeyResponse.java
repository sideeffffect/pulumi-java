// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RouterMd5AuthenticationKeyResponse extends com.pulumi.resources.InvokeArgs {

    public static final RouterMd5AuthenticationKeyResponse Empty = new RouterMd5AuthenticationKeyResponse();

    /**
     * [Input only] Value of the key. For patch and update calls, it can be skipped to copy the value from the previous configuration. This is allowed if the key with the same name existed before the operation. Maximum length is 80 characters. Can only contain printable ASCII characters.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    /**
     * Name used to identify the key. Must be unique within a router. Must be referenced by at least one bgpPeer. Must comply with RFC1035.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private RouterMd5AuthenticationKeyResponse() {}

    private RouterMd5AuthenticationKeyResponse(RouterMd5AuthenticationKeyResponse $) {
        this.key = $.key;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouterMd5AuthenticationKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouterMd5AuthenticationKeyResponse $;

        public Builder() {
            $ = new RouterMd5AuthenticationKeyResponse();
        }

        public Builder(RouterMd5AuthenticationKeyResponse defaults) {
            $ = new RouterMd5AuthenticationKeyResponse(Objects.requireNonNull(defaults));
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public RouterMd5AuthenticationKeyResponse build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
