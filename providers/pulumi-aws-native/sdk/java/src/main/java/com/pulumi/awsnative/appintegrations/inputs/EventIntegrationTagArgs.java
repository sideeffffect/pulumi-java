// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appintegrations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class EventIntegrationTagArgs extends ResourceArgs {

    public static final EventIntegrationTagArgs Empty = new EventIntegrationTagArgs();

    /**
     * A key to identify the tag.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return A key to identify the tag.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Corresponding tag value for the key.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Corresponding tag value for the key.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private EventIntegrationTagArgs() {}

    private EventIntegrationTagArgs(EventIntegrationTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventIntegrationTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventIntegrationTagArgs $;

        public Builder() {
            $ = new EventIntegrationTagArgs();
        }

        public Builder(EventIntegrationTagArgs defaults) {
            $ = new EventIntegrationTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key A key to identify the tag.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key A key to identify the tag.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Corresponding tag value for the key.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Corresponding tag value for the key.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public EventIntegrationTagArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
