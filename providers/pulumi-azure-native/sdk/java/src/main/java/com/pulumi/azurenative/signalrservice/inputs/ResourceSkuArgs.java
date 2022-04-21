// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.signalrservice.inputs;

import com.pulumi.azurenative.signalrservice.enums.SignalRSkuTier;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The billing information of the SignalR resource.
 * 
 */
public final class ResourceSkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceSkuArgs Empty = new ResourceSkuArgs();

    /**
     * Optional, integer. The unit count of SignalR resource. 1 by default.
     * 
     * If present, following values are allowed:
     *     Free: 1
     *     Standard: 1,2,5,10,20,50,100
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * The name of the SKU. Required.
     * 
     * Allowed values: Standard_S1, Free_F1
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Optional tier of this particular SKU. &#39;Standard&#39; or &#39;Free&#39;.
     * 
     * `Basic` is deprecated, use `Standard` instead.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<Either<String,SignalRSkuTier>> tier;

    public Optional<Output<Either<String,SignalRSkuTier>>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private ResourceSkuArgs() {}

    private ResourceSkuArgs(ResourceSkuArgs $) {
        this.capacity = $.capacity;
        this.name = $.name;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceSkuArgs $;

        public Builder() {
            $ = new ResourceSkuArgs();
        }

        public Builder(ResourceSkuArgs defaults) {
            $ = new ResourceSkuArgs(Objects.requireNonNull(defaults));
        }

        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder tier(@Nullable Output<Either<String,SignalRSkuTier>> tier) {
            $.tier = tier;
            return this;
        }

        public Builder tier(Either<String,SignalRSkuTier> tier) {
            return tier(Output.of(tier));
        }

        public ResourceSkuArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
