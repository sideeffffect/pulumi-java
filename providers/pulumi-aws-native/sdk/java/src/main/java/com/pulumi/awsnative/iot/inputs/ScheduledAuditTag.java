// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A key-value pair to associate with a resource.
 * 
 */
public final class ScheduledAuditTag extends com.pulumi.resources.InvokeArgs {

    public static final ScheduledAuditTag Empty = new ScheduledAuditTag();

    /**
     * The tag&#39;s key.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    /**
     * The tag&#39;s value.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private ScheduledAuditTag() {}

    private ScheduledAuditTag(ScheduledAuditTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledAuditTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledAuditTag $;

        public Builder() {
            $ = new ScheduledAuditTag();
        }

        public Builder(ScheduledAuditTag defaults) {
            $ = new ScheduledAuditTag(Objects.requireNonNull(defaults));
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public ScheduledAuditTag build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
