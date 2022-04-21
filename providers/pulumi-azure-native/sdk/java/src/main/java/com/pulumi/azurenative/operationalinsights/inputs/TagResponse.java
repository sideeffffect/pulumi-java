// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A tag of a saved search.
 * 
 */
public final class TagResponse extends com.pulumi.resources.InvokeArgs {

    public static final TagResponse Empty = new TagResponse();

    /**
     * The tag name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The tag value.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private TagResponse() {}

    private TagResponse(TagResponse $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagResponse $;

        public Builder() {
            $ = new TagResponse();
        }

        public Builder(TagResponse defaults) {
            $ = new TagResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public TagResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
