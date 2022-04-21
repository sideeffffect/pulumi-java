// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerDefaultActionRedirectGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionRedirectGetArgs Empty = new ListenerDefaultActionRedirectGetArgs();

    /**
     * Hostname. This component is not percent-encoded. The hostname can contain `#{host}`. Defaults to `#{host}`.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * Absolute path, starting with the leading &#34;/&#34;. This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}. Defaults to `/#{path}`.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
     * 
     */
    @Import(name="port")
    private @Nullable Output<String> port;

    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading &#34;?&#34;. Defaults to `#{query}`.
     * 
     */
    @Import(name="query")
    private @Nullable Output<String> query;

    public Optional<Output<String>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * HTTP redirect code. The redirect is either permanent (`HTTP_301`) or temporary (`HTTP_302`).
     * 
     */
    @Import(name="statusCode", required=true)
    private Output<String> statusCode;

    public Output<String> statusCode() {
        return this.statusCode;
    }

    private ListenerDefaultActionRedirectGetArgs() {}

    private ListenerDefaultActionRedirectGetArgs(ListenerDefaultActionRedirectGetArgs $) {
        this.host = $.host;
        this.path = $.path;
        this.port = $.port;
        this.protocol = $.protocol;
        this.query = $.query;
        this.statusCode = $.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerDefaultActionRedirectGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerDefaultActionRedirectGetArgs $;

        public Builder() {
            $ = new ListenerDefaultActionRedirectGetArgs();
        }

        public Builder(ListenerDefaultActionRedirectGetArgs defaults) {
            $ = new ListenerDefaultActionRedirectGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        public Builder port(String port) {
            return port(Output.of(port));
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder query(@Nullable Output<String> query) {
            $.query = query;
            return this;
        }

        public Builder query(String query) {
            return query(Output.of(query));
        }

        public Builder statusCode(Output<String> statusCode) {
            $.statusCode = statusCode;
            return this;
        }

        public Builder statusCode(String statusCode) {
            return statusCode(Output.of(statusCode));
        }

        public ListenerDefaultActionRedirectGetArgs build() {
            $.statusCode = Objects.requireNonNull($.statusCode, "expected parameter 'statusCode' to be non-null");
            return $;
        }
    }

}
