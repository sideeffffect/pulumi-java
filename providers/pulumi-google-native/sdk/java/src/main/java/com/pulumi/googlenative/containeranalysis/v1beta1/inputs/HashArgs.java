// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1beta1.enums.HashType;
import java.lang.String;
import java.util.Objects;


/**
 * Container message for hash values.
 * 
 */
public final class HashArgs extends com.pulumi.resources.ResourceArgs {

    public static final HashArgs Empty = new HashArgs();

    /**
     * The type of hash that was performed.
     * 
     */
    @Import(name="type", required=true)
    private Output<HashType> type;

    /**
     * @return The type of hash that was performed.
     * 
     */
    public Output<HashType> type() {
        return this.type;
    }

    /**
     * The hash value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The hash value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private HashArgs() {}

    private HashArgs(HashArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HashArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HashArgs $;

        public Builder() {
            $ = new HashArgs();
        }

        public Builder(HashArgs defaults) {
            $ = new HashArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of hash that was performed.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<HashType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of hash that was performed.
         * 
         * @return builder
         * 
         */
        public Builder type(HashType type) {
            return type(Output.of(type));
        }

        /**
         * @param value The hash value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The hash value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public HashArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
