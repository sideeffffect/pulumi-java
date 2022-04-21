// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v1alpha1.inputs.HTTPHeaderArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Not supported by Cloud Run HTTPGetAction describes an action based on HTTP Get requests.
 * 
 */
public final class HTTPGetActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final HTTPGetActionArgs Empty = new HTTPGetActionArgs();

    /**
     * (Optional) Host name to connect to, defaults to the pod IP. You probably want to set &#34;Host&#34; in httpHeaders instead.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * (Optional) Custom headers to set in the request. HTTP allows repeated headers.
     * 
     */
    @Import(name="httpHeaders")
    private @Nullable Output<List<HTTPHeaderArgs>> httpHeaders;

    public Optional<Output<List<HTTPHeaderArgs>>> httpHeaders() {
        return Optional.ofNullable(this.httpHeaders);
    }

    /**
     * (Optional) Path to access on the HTTP server.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * (Optional) Scheme to use for connecting to the host. Defaults to HTTP.
     * 
     */
    @Import(name="scheme")
    private @Nullable Output<String> scheme;

    public Optional<Output<String>> scheme() {
        return Optional.ofNullable(this.scheme);
    }

    private HTTPGetActionArgs() {}

    private HTTPGetActionArgs(HTTPGetActionArgs $) {
        this.host = $.host;
        this.httpHeaders = $.httpHeaders;
        this.path = $.path;
        this.scheme = $.scheme;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HTTPGetActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HTTPGetActionArgs $;

        public Builder() {
            $ = new HTTPGetActionArgs();
        }

        public Builder(HTTPGetActionArgs defaults) {
            $ = new HTTPGetActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder httpHeaders(@Nullable Output<List<HTTPHeaderArgs>> httpHeaders) {
            $.httpHeaders = httpHeaders;
            return this;
        }

        public Builder httpHeaders(List<HTTPHeaderArgs> httpHeaders) {
            return httpHeaders(Output.of(httpHeaders));
        }

        public Builder httpHeaders(HTTPHeaderArgs... httpHeaders) {
            return httpHeaders(List.of(httpHeaders));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder scheme(@Nullable Output<String> scheme) {
            $.scheme = scheme;
            return this;
        }

        public Builder scheme(String scheme) {
            return scheme(Output.of(scheme));
        }

        public HTTPGetActionArgs build() {
            return $;
        }
    }

}
