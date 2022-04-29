// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceProxyConfigurationArgs extends ResourceArgs {

    public static final DataSourceProxyConfigurationArgs Empty = new DataSourceProxyConfigurationArgs();

    @Import(name="credentials")
    private @Nullable Output<String> credentials;

    public Optional<Output<String>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    @Import(name="host", required=true)
    private Output<String> host;

    public Output<String> host() {
        return this.host;
    }

    @Import(name="port", required=true)
    private Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    private DataSourceProxyConfigurationArgs() {}

    private DataSourceProxyConfigurationArgs(DataSourceProxyConfigurationArgs $) {
        this.credentials = $.credentials;
        this.host = $.host;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceProxyConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceProxyConfigurationArgs $;

        public Builder() {
            $ = new DataSourceProxyConfigurationArgs();
        }

        public Builder(DataSourceProxyConfigurationArgs defaults) {
            $ = new DataSourceProxyConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder credentials(@Nullable Output<String> credentials) {
            $.credentials = credentials;
            return this;
        }

        public Builder credentials(String credentials) {
            return credentials(Output.of(credentials));
        }

        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public DataSourceProxyConfigurationArgs build() {
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
