// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebhookFilterGroupFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebhookFilterGroupFilterArgs Empty = new WebhookFilterGroupFilterArgs();

    /**
     * If set to `true`, the specified filter does *not* trigger a build. Defaults to `false`.
     * 
     */
    @Import(name="excludeMatchedPattern")
    private @Nullable Output<Boolean> excludeMatchedPattern;

    public Optional<Output<Boolean>> excludeMatchedPattern() {
        return Optional.ofNullable(this.excludeMatchedPattern);
    }

    /**
     * For a filter that uses `EVENT` type, a comma-separated string that specifies one event: `PUSH`, `PULL_REQUEST_CREATED`, `PULL_REQUEST_UPDATED`, `PULL_REQUEST_REOPENED`. `PULL_REQUEST_MERGED` works with GitHub &amp; GitHub Enterprise only. For a filter that uses any of the other filter types, a regular expression.
     * 
     */
    @Import(name="pattern", required=true)
    private Output<String> pattern;

    public Output<String> pattern() {
        return this.pattern;
    }

    /**
     * The webhook filter group&#39;s type. Valid values for this parameter are: `EVENT`, `BASE_REF`, `HEAD_REF`, `ACTOR_ACCOUNT_ID`, `FILE_PATH`, `COMMIT_MESSAGE`. At least one filter group must specify `EVENT` as its type.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private WebhookFilterGroupFilterArgs() {}

    private WebhookFilterGroupFilterArgs(WebhookFilterGroupFilterArgs $) {
        this.excludeMatchedPattern = $.excludeMatchedPattern;
        this.pattern = $.pattern;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebhookFilterGroupFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhookFilterGroupFilterArgs $;

        public Builder() {
            $ = new WebhookFilterGroupFilterArgs();
        }

        public Builder(WebhookFilterGroupFilterArgs defaults) {
            $ = new WebhookFilterGroupFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder excludeMatchedPattern(@Nullable Output<Boolean> excludeMatchedPattern) {
            $.excludeMatchedPattern = excludeMatchedPattern;
            return this;
        }

        public Builder excludeMatchedPattern(Boolean excludeMatchedPattern) {
            return excludeMatchedPattern(Output.of(excludeMatchedPattern));
        }

        public Builder pattern(Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public WebhookFilterGroupFilterArgs build() {
            $.pattern = Objects.requireNonNull($.pattern, "expected parameter 'pattern' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
