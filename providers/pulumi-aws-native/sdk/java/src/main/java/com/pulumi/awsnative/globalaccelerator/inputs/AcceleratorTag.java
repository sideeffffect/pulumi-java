// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.globalaccelerator.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Tag is a key-value pair associated with accelerator.
 * 
 */
public final class AcceleratorTag extends com.pulumi.resources.InvokeArgs {

    public static final AcceleratorTag Empty = new AcceleratorTag();

    /**
     * Key of the tag. Value can be 1 to 127 characters.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    /**
     * Value for the tag. Value can be 1 to 255 characters.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private AcceleratorTag() {}

    private AcceleratorTag(AcceleratorTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AcceleratorTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AcceleratorTag $;

        public Builder() {
            $ = new AcceleratorTag();
        }

        public Builder(AcceleratorTag defaults) {
            $ = new AcceleratorTag(Objects.requireNonNull(defaults));
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public AcceleratorTag build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
