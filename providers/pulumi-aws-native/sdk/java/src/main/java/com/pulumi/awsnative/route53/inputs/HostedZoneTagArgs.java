// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * A complex type that contains information about a tag that you want to add or edit for the specified health check or hosted zone.
 * 
 */
public final class HostedZoneTagArgs extends ResourceArgs {

    public static final HostedZoneTagArgs Empty = new HostedZoneTagArgs();

    /**
     * The key name of the tag.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The key name of the tag.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The value for the tag.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value for the tag.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private HostedZoneTagArgs() {}

    private HostedZoneTagArgs(HostedZoneTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostedZoneTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostedZoneTagArgs $;

        public Builder() {
            $ = new HostedZoneTagArgs();
        }

        public Builder(HostedZoneTagArgs defaults) {
            $ = new HostedZoneTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key name of the tag.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key name of the tag.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The value for the tag.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value for the tag.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public HostedZoneTagArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
