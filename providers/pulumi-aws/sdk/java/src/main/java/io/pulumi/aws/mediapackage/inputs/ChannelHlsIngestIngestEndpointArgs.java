// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mediapackage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ChannelHlsIngestIngestEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChannelHlsIngestIngestEndpointArgs Empty = new ChannelHlsIngestIngestEndpointArgs();

    /**
     * The password
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The URL
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> url() {
        return this.url == null ? Codegen.empty() : this.url;
    }

    /**
     * The username
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> username() {
        return this.username == null ? Codegen.empty() : this.username;
    }

    public ChannelHlsIngestIngestEndpointArgs(
        @Nullable Output<String> password,
        @Nullable Output<String> url,
        @Nullable Output<String> username) {
        this.password = password;
        this.url = url;
        this.username = username;
    }

    private ChannelHlsIngestIngestEndpointArgs() {
        this.password = Codegen.empty();
        this.url = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelHlsIngestIngestEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> password;
        private @Nullable Output<String> url;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelHlsIngestIngestEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.url = defaults.url;
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
        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Codegen.ofNullable(url);
            return this;
        }
        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = Codegen.ofNullable(username);
            return this;
        }        public ChannelHlsIngestIngestEndpointArgs build() {
            return new ChannelHlsIngestIngestEndpointArgs(password, url, username);
        }
    }
}
