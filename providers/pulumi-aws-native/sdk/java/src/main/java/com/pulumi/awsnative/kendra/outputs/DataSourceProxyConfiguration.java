// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceProxyConfiguration {
    private final @Nullable String credentials;
    private final String host;
    private final Integer port;

    @CustomType.Constructor
    private DataSourceProxyConfiguration(
        @CustomType.Parameter("credentials") @Nullable String credentials,
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("port") Integer port) {
        this.credentials = credentials;
        this.host = host;
        this.port = port;
    }

    public Optional<String> credentials() {
        return Optional.ofNullable(this.credentials);
    }
    public String host() {
        return this.host;
    }
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceProxyConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String credentials;
        private String host;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceProxyConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder credentials(@Nullable String credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }        public DataSourceProxyConfiguration build() {
            return new DataSourceProxyConfiguration(credentials, host, port);
        }
    }
}
