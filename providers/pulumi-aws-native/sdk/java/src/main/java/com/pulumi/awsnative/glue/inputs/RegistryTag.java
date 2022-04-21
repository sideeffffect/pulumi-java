// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.glue.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RegistryTag extends com.pulumi.resources.InvokeArgs {

    public static final RegistryTag Empty = new RegistryTag();

    /**
     * A key to identify the tag.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    /**
     * Corresponding tag value for the key.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private RegistryTag() {}

    private RegistryTag(RegistryTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryTag $;

        public Builder() {
            $ = new RegistryTag();
        }

        public Builder(RegistryTag defaults) {
            $ = new RegistryTag(Objects.requireNonNull(defaults));
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public RegistryTag build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
