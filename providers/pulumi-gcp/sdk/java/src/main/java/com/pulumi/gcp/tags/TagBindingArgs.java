// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tags;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TagBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagBindingArgs Empty = new TagBindingArgs();

    /**
     * The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
     * 
     */
    @Import(name="parent", required=true)
    private Output<String> parent;

    public Output<String> parent() {
        return this.parent;
    }

    /**
     * The TagValue of the TagBinding. Must be of the form tagValues/456.
     * 
     */
    @Import(name="tagValue", required=true)
    private Output<String> tagValue;

    public Output<String> tagValue() {
        return this.tagValue;
    }

    private TagBindingArgs() {}

    private TagBindingArgs(TagBindingArgs $) {
        this.parent = $.parent;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagBindingArgs $;

        public Builder() {
            $ = new TagBindingArgs();
        }

        public Builder(TagBindingArgs defaults) {
            $ = new TagBindingArgs(Objects.requireNonNull(defaults));
        }

        public Builder parent(Output<String> parent) {
            $.parent = parent;
            return this;
        }

        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        public Builder tagValue(Output<String> tagValue) {
            $.tagValue = tagValue;
            return this;
        }

        public Builder tagValue(String tagValue) {
            return tagValue(Output.of(tagValue));
        }

        public TagBindingArgs build() {
            $.parent = Objects.requireNonNull($.parent, "expected parameter 'parent' to be non-null");
            $.tagValue = Objects.requireNonNull($.tagValue, "expected parameter 'tagValue' to be non-null");
            return $;
        }
    }

}
