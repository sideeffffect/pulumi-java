// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.azurenative.automation.inputs.ContentHashResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of the content link.
 * 
 */
public final class ContentLinkResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContentLinkResponse Empty = new ContentLinkResponse();

    /**
     * Gets or sets the hash.
     * 
     */
    @Import(name="contentHash")
      private final @Nullable ContentHashResponse contentHash;

    public Optional<ContentHashResponse> contentHash() {
        return this.contentHash == null ? Optional.empty() : Optional.ofNullable(this.contentHash);
    }

    /**
     * Gets or sets the uri of the runbook content.
     * 
     */
    @Import(name="uri")
      private final @Nullable String uri;

    public Optional<String> uri() {
        return this.uri == null ? Optional.empty() : Optional.ofNullable(this.uri);
    }

    /**
     * Gets or sets the version of the content.
     * 
     */
    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> version() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public ContentLinkResponse(
        @Nullable ContentHashResponse contentHash,
        @Nullable String uri,
        @Nullable String version) {
        this.contentHash = contentHash;
        this.uri = uri;
        this.version = version;
    }

    private ContentLinkResponse() {
        this.contentHash = null;
        this.uri = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContentHashResponse contentHash;
        private @Nullable String uri;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentHash = defaults.contentHash;
    	      this.uri = defaults.uri;
    	      this.version = defaults.version;
        }

        public Builder contentHash(@Nullable ContentHashResponse contentHash) {
            this.contentHash = contentHash;
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public ContentLinkResponse build() {
            return new ContentLinkResponse(contentHash, uri, version);
        }
    }
}
