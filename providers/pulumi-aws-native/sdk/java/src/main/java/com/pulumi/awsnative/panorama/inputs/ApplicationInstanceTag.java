// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.panorama.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationInstanceTag extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationInstanceTag Empty = new ApplicationInstanceTag();

    /**
     * A string used to identify this tag
     * 
     */
    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    /**
     * A string containing the value for the tag
     * 
     */
    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private ApplicationInstanceTag() {}

    private ApplicationInstanceTag(ApplicationInstanceTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationInstanceTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationInstanceTag $;

        public Builder() {
            $ = new ApplicationInstanceTag();
        }

        public Builder(ApplicationInstanceTag defaults) {
            $ = new ApplicationInstanceTag(Objects.requireNonNull(defaults));
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public ApplicationInstanceTag build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
