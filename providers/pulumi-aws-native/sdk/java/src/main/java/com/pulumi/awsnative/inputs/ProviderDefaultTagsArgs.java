// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration with resource tag settings to apply across all resources handled by this provider. This is designed to replace redundant per-resource `tags` configurations. Provider tags can be overridden with new values, but not excluded from specific resources. To override provider tag values, use the `tags` argument within a resource to configure new tag values for matching keys.
 * 
 */
public final class ProviderDefaultTagsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderDefaultTagsArgs Empty = new ProviderDefaultTagsArgs();

    /**
     * A group of tags to set across all resources.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ProviderDefaultTagsArgs(@Nullable Output<Map<String,String>> tags) {
        this.tags = tags;
    }

    private ProviderDefaultTagsArgs() {
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderDefaultTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderDefaultTagsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ProviderDefaultTagsArgs build() {
            return new ProviderDefaultTagsArgs(tags);
        }
    }
}
