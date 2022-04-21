// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes authentication configuration that uses a Google account.
 * 
 */
public final class GoogleAccountResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleAccountResponse Empty = new GoogleAccountResponse();

    /**
     * Input only. The password of the Google account. The credential is stored encrypted and not returned in any response nor included in audit logs.
     * 
     */
    @Import(name="password", required=true)
    private String password;

    public String password() {
        return this.password;
    }

    /**
     * The user name of the Google account.
     * 
     */
    @Import(name="username", required=true)
    private String username;

    public String username() {
        return this.username;
    }

    private GoogleAccountResponse() {}

    private GoogleAccountResponse(GoogleAccountResponse $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleAccountResponse $;

        public Builder() {
            $ = new GoogleAccountResponse();
        }

        public Builder(GoogleAccountResponse defaults) {
            $ = new GoogleAccountResponse(Objects.requireNonNull(defaults));
        }

        public Builder password(String password) {
            $.password = password;
            return this;
        }

        public Builder username(String username) {
            $.username = username;
            return this;
        }

        public GoogleAccountResponse build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
