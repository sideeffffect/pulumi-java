// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SKU for the resource.
 * 
 */
public final class SkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The SKU name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The SKU name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The SKU tier.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    /**
     * @return The SKU tier.
     * 
     */
    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private SkuArgs() {}

    private SkuArgs(SkuArgs $) {
        this.name = $.name;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SkuArgs $;

        public Builder() {
            $ = new SkuArgs();
        }

        public Builder(SkuArgs defaults) {
            $ = new SkuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The SKU name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The SKU name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tier The SKU tier.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The SKU tier.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        public SkuArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
