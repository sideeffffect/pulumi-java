// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FulfillmentGenericWebServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final FulfillmentGenericWebServiceArgs Empty = new FulfillmentGenericWebServiceArgs();

    /**
     * The password for HTTP Basic authentication.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The HTTP request headers to send together with fulfillment requests.
     * 
     */
    @Import(name="requestHeaders")
    private @Nullable Output<Map<String,String>> requestHeaders;

    public Optional<Output<Map<String,String>>> requestHeaders() {
        return Optional.ofNullable(this.requestHeaders);
    }

    /**
     * The fulfillment URI for receiving POST requests. It must use https protocol.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    public Output<String> uri() {
        return this.uri;
    }

    /**
     * The user name for HTTP Basic authentication.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private FulfillmentGenericWebServiceArgs() {}

    private FulfillmentGenericWebServiceArgs(FulfillmentGenericWebServiceArgs $) {
        this.password = $.password;
        this.requestHeaders = $.requestHeaders;
        this.uri = $.uri;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FulfillmentGenericWebServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FulfillmentGenericWebServiceArgs $;

        public Builder() {
            $ = new FulfillmentGenericWebServiceArgs();
        }

        public Builder(FulfillmentGenericWebServiceArgs defaults) {
            $ = new FulfillmentGenericWebServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder requestHeaders(@Nullable Output<Map<String,String>> requestHeaders) {
            $.requestHeaders = requestHeaders;
            return this;
        }

        public Builder requestHeaders(Map<String,String> requestHeaders) {
            return requestHeaders(Output.of(requestHeaders));
        }

        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public FulfillmentGenericWebServiceArgs build() {
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
