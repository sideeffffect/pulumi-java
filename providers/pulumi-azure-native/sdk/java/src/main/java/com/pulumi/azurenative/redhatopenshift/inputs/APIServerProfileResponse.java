// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.redhatopenshift.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * APIServerProfile represents an API server profile.
 * 
 */
public final class APIServerProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final APIServerProfileResponse Empty = new APIServerProfileResponse();

    /**
     * The IP of the cluster API server (immutable).
     * 
     */
    @Import(name="ip")
      private final @Nullable String ip;

    public Optional<String> ip() {
        return this.ip == null ? Optional.empty() : Optional.ofNullable(this.ip);
    }

    /**
     * The URL to access the cluster API server (immutable).
     * 
     */
    @Import(name="url")
      private final @Nullable String url;

    public Optional<String> url() {
        return this.url == null ? Optional.empty() : Optional.ofNullable(this.url);
    }

    /**
     * API server visibility (immutable).
     * 
     */
    @Import(name="visibility")
      private final @Nullable String visibility;

    public Optional<String> visibility() {
        return this.visibility == null ? Optional.empty() : Optional.ofNullable(this.visibility);
    }

    public APIServerProfileResponse(
        @Nullable String ip,
        @Nullable String url,
        @Nullable String visibility) {
        this.ip = ip;
        this.url = url;
        this.visibility = visibility;
    }

    private APIServerProfileResponse() {
        this.ip = null;
        this.url = null;
        this.visibility = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(APIServerProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ip;
        private @Nullable String url;
        private @Nullable String visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(APIServerProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.url = defaults.url;
    	      this.visibility = defaults.visibility;
        }

        public Builder ip(@Nullable String ip) {
            this.ip = ip;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        public Builder visibility(@Nullable String visibility) {
            this.visibility = visibility;
            return this;
        }        public APIServerProfileResponse build() {
            return new APIServerProfileResponse(ip, url, visibility);
        }
    }
}
