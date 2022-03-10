// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v3.enums.ContentMatcherMatcher;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Optional. Used to perform content matching. This allows matching based on substrings and regular expressions, together with their negations. Only the first 4 MB of an HTTP or HTTPS check's response (and the first 1 MB of a TCP check's response) are examined for purposes of content matching.
 * 
 */
public final class ContentMatcherArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentMatcherArgs Empty = new ContentMatcherArgs();

    /**
     * String or regex content to match. Maximum 1024 bytes. An empty content string indicates no content matching is to be performed.
     * 
     */
    @InputImport(name="content")
      private final @Nullable Input<String> content;

    public Input<String> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    /**
     * The type of content matcher that will be applied to the server output, compared to the content string when the check is run.
     * 
     */
    @InputImport(name="matcher")
      private final @Nullable Input<ContentMatcherMatcher> matcher;

    public Input<ContentMatcherMatcher> getMatcher() {
        return this.matcher == null ? Input.empty() : this.matcher;
    }

    public ContentMatcherArgs(
        @Nullable Input<String> content,
        @Nullable Input<ContentMatcherMatcher> matcher) {
        this.content = content;
        this.matcher = matcher;
    }

    private ContentMatcherArgs() {
        this.content = Input.empty();
        this.matcher = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> content;
        private @Nullable Input<ContentMatcherMatcher> matcher;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentMatcherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.matcher = defaults.matcher;
        }

        public Builder content(@Nullable Input<String> content) {
            this.content = content;
            return this;
        }

        public Builder content(@Nullable String content) {
            this.content = Input.ofNullable(content);
            return this;
        }

        public Builder matcher(@Nullable Input<ContentMatcherMatcher> matcher) {
            this.matcher = matcher;
            return this;
        }

        public Builder matcher(@Nullable ContentMatcherMatcher matcher) {
            this.matcher = Input.ofNullable(matcher);
            return this;
        }
        public ContentMatcherArgs build() {
            return new ContentMatcherArgs(content, matcher);
        }
    }
}
