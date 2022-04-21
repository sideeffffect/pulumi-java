// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.schemas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiscovererArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiscovererArgs Empty = new DiscovererArgs();

    /**
     * The description of the discoverer. Maximum of 256 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ARN of the event bus to discover event schemas on.
     * 
     */
    @Import(name="sourceArn", required=true)
    private Output<String> sourceArn;

    public Output<String> sourceArn() {
        return this.sourceArn;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DiscovererArgs() {}

    private DiscovererArgs(DiscovererArgs $) {
        this.description = $.description;
        this.sourceArn = $.sourceArn;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiscovererArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiscovererArgs $;

        public Builder() {
            $ = new DiscovererArgs();
        }

        public Builder(DiscovererArgs defaults) {
            $ = new DiscovererArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder sourceArn(Output<String> sourceArn) {
            $.sourceArn = sourceArn;
            return this;
        }

        public Builder sourceArn(String sourceArn) {
            return sourceArn(Output.of(sourceArn));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DiscovererArgs build() {
            $.sourceArn = Objects.requireNonNull($.sourceArn, "expected parameter 'sourceArn' to be non-null");
            return $;
        }
    }

}
