// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FulfillmentGenericWebServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FulfillmentGenericWebServiceArgs Empty = new FulfillmentGenericWebServiceArgs();

    /**
     * The password for HTTP Basic authentication.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The HTTP request headers to send together with fulfillment requests.
     * 
     */
    @Import(name="requestHeaders")
      private final @Nullable Output<Map<String,String>> requestHeaders;

    public Output<Map<String,String>> requestHeaders() {
        return this.requestHeaders == null ? Codegen.empty() : this.requestHeaders;
    }

    /**
     * The fulfillment URI for receiving POST requests. It must use https protocol.
     * 
     */
    @Import(name="uri", required=true)
      private final Output<String> uri;

    public Output<String> uri() {
        return this.uri;
    }

    /**
     * The user name for HTTP Basic authentication.
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> username() {
        return this.username == null ? Codegen.empty() : this.username;
    }

    public FulfillmentGenericWebServiceArgs(
        @Nullable Output<String> password,
        @Nullable Output<Map<String,String>> requestHeaders,
        Output<String> uri,
        @Nullable Output<String> username) {
        this.password = password;
        this.requestHeaders = requestHeaders;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
        this.username = username;
    }

    private FulfillmentGenericWebServiceArgs() {
        this.password = Codegen.empty();
        this.requestHeaders = Codegen.empty();
        this.uri = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FulfillmentGenericWebServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> password;
        private @Nullable Output<Map<String,String>> requestHeaders;
        private Output<String> uri;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(FulfillmentGenericWebServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.uri = defaults.uri;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder requestHeaders(@Nullable Output<Map<String,String>> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public Builder requestHeaders(@Nullable Map<String,String> requestHeaders) {
            this.requestHeaders = Codegen.ofNullable(requestHeaders);
            return this;
        }
        public Builder uri(Output<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Output.of(Objects.requireNonNull(uri));
            return this;
        }
        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = Codegen.ofNullable(username);
            return this;
        }        public FulfillmentGenericWebServiceArgs build() {
            return new FulfillmentGenericWebServiceArgs(password, requestHeaders, uri, username);
        }
    }
}
