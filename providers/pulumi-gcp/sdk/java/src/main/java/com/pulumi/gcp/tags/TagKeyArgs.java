// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tags;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagKeyArgs Empty = new TagKeyArgs();

    /**
     * User-assigned description of the TagKey. Must not exceed 256 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Input only. The resource name of the new TagKey&#39;s parent. Must be of the form organizations/{org_id}.
     * 
     */
    @Import(name="parent", required=true)
    private Output<String> parent;

    public Output<String> parent() {
        return this.parent;
    }

    /**
     * Input only. The user friendly name for a TagKey. The short name should be unique for TagKeys within the same tag namespace.
     * The short name must be 1-63 characters, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @Import(name="shortName", required=true)
    private Output<String> shortName;

    public Output<String> shortName() {
        return this.shortName;
    }

    private TagKeyArgs() {}

    private TagKeyArgs(TagKeyArgs $) {
        this.description = $.description;
        this.parent = $.parent;
        this.shortName = $.shortName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagKeyArgs $;

        public Builder() {
            $ = new TagKeyArgs();
        }

        public Builder(TagKeyArgs defaults) {
            $ = new TagKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder parent(Output<String> parent) {
            $.parent = parent;
            return this;
        }

        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        public Builder shortName(Output<String> shortName) {
            $.shortName = shortName;
            return this;
        }

        public Builder shortName(String shortName) {
            return shortName(Output.of(shortName));
        }

        public TagKeyArgs build() {
            $.parent = Objects.requireNonNull($.parent, "expected parameter 'parent' to be non-null");
            $.shortName = Objects.requireNonNull($.shortName, "expected parameter 'shortName' to be non-null");
            return $;
        }
    }

}
