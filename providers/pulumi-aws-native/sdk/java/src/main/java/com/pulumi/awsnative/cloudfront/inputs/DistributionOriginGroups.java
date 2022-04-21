// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.awsnative.cloudfront.inputs.DistributionOriginGroup;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionOriginGroups extends com.pulumi.resources.InvokeArgs {

    public static final DistributionOriginGroups Empty = new DistributionOriginGroups();

    @Import(name="items")
    private @Nullable List<DistributionOriginGroup> items;

    public Optional<List<DistributionOriginGroup>> items() {
        return Optional.ofNullable(this.items);
    }

    @Import(name="quantity", required=true)
    private Integer quantity;

    public Integer quantity() {
        return this.quantity;
    }

    private DistributionOriginGroups() {}

    private DistributionOriginGroups(DistributionOriginGroups $) {
        this.items = $.items;
        this.quantity = $.quantity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionOriginGroups defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOriginGroups $;

        public Builder() {
            $ = new DistributionOriginGroups();
        }

        public Builder(DistributionOriginGroups defaults) {
            $ = new DistributionOriginGroups(Objects.requireNonNull(defaults));
        }

        public Builder items(@Nullable List<DistributionOriginGroup> items) {
            $.items = items;
            return this;
        }

        public Builder items(DistributionOriginGroup... items) {
            return items(List.of(items));
        }

        public Builder quantity(Integer quantity) {
            $.quantity = quantity;
            return this;
        }

        public DistributionOriginGroups build() {
            $.quantity = Objects.requireNonNull($.quantity, "expected parameter 'quantity' to be non-null");
            return $;
        }
    }

}
