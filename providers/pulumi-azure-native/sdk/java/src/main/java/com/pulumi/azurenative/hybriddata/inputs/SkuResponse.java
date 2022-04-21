// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybriddata.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The sku type.
 * 
 */
public final class SkuResponse extends com.pulumi.resources.InvokeArgs {

    public static final SkuResponse Empty = new SkuResponse();

    /**
     * The sku name. Required for data manager creation, optional for update.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The sku tier. This is based on the SKU name.
     * 
     */
    @Import(name="tier")
    private @Nullable String tier;

    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    private SkuResponse() {}

    private SkuResponse(SkuResponse $) {
        this.name = $.name;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SkuResponse $;

        public Builder() {
            $ = new SkuResponse();
        }

        public Builder(SkuResponse defaults) {
            $ = new SkuResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder tier(@Nullable String tier) {
            $.tier = tier;
            return this;
        }

        public SkuResponse build() {
            return $;
        }
    }

}
