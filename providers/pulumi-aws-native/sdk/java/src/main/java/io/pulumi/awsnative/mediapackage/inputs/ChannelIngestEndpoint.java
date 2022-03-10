// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An endpoint for ingesting source content for a Channel.
 * 
 */
public final class ChannelIngestEndpoint extends io.pulumi.resources.InvokeArgs {

    public static final ChannelIngestEndpoint Empty = new ChannelIngestEndpoint();

    /**
     * The system generated unique identifier for the IngestEndpoint
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The system generated password for ingest authentication.
     * 
     */
    @InputImport(name="password")
      private final @Nullable String password;

    public Optional<String> getPassword() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    /**
     * The ingest URL to which the source stream should be sent.
     * 
     */
    @InputImport(name="url")
      private final @Nullable String url;

    public Optional<String> getUrl() {
        return this.url == null ? Optional.empty() : Optional.ofNullable(this.url);
    }

    /**
     * The system generated username for ingest authentication.
     * 
     */
    @InputImport(name="username")
      private final @Nullable String username;

    public Optional<String> getUsername() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public ChannelIngestEndpoint(
        @Nullable String id,
        @Nullable String password,
        @Nullable String url,
        @Nullable String username) {
        this.id = id;
        this.password = password;
        this.url = url;
        this.username = username;
    }

    private ChannelIngestEndpoint() {
        this.id = null;
        this.password = null;
        this.url = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelIngestEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String password;
        private @Nullable String url;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelIngestEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.password = defaults.password;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        public ChannelIngestEndpoint build() {
            return new ChannelIngestEndpoint(id, password, url, username);
        }
    }
}
