// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The API resource policies.
 * 
 */
public final class ApiResourcePoliciesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiResourcePoliciesResponse Empty = new ApiResourcePoliciesResponse();

    /**
     * The API level only policies XML as embedded content.
     * 
     */
    @InputImport(name="content")
      private final @Nullable String content;

    public Optional<String> getContent() {
        return this.content == null ? Optional.empty() : Optional.ofNullable(this.content);
    }

    /**
     * The content link to the policies.
     * 
     */
    @InputImport(name="contentLink")
      private final @Nullable String contentLink;

    public Optional<String> getContentLink() {
        return this.contentLink == null ? Optional.empty() : Optional.ofNullable(this.contentLink);
    }

    public ApiResourcePoliciesResponse(
        @Nullable String content,
        @Nullable String contentLink) {
        this.content = content;
        this.contentLink = contentLink;
    }

    private ApiResourcePoliciesResponse() {
        this.content = null;
        this.contentLink = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiResourcePoliciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;
        private @Nullable String contentLink;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiResourcePoliciesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentLink = defaults.contentLink;
        }

        public Builder content(@Nullable String content) {
            this.content = content;
            return this;
        }

        public Builder contentLink(@Nullable String contentLink) {
            this.contentLink = contentLink;
            return this;
        }
        public ApiResourcePoliciesResponse build() {
            return new ApiResourcePoliciesResponse(content, contentLink);
        }
    }
}
