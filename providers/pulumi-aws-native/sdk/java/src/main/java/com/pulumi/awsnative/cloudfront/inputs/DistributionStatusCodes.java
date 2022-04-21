// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class DistributionStatusCodes extends com.pulumi.resources.InvokeArgs {

    public static final DistributionStatusCodes Empty = new DistributionStatusCodes();

    @Import(name="items", required=true)
    private List<Integer> items;

    public List<Integer> items() {
        return this.items;
    }

    @Import(name="quantity", required=true)
    private Integer quantity;

    public Integer quantity() {
        return this.quantity;
    }

    private DistributionStatusCodes() {}

    private DistributionStatusCodes(DistributionStatusCodes $) {
        this.items = $.items;
        this.quantity = $.quantity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionStatusCodes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionStatusCodes $;

        public Builder() {
            $ = new DistributionStatusCodes();
        }

        public Builder(DistributionStatusCodes defaults) {
            $ = new DistributionStatusCodes(Objects.requireNonNull(defaults));
        }

        public Builder items(List<Integer> items) {
            $.items = items;
            return this;
        }

        public Builder items(Integer... items) {
            return items(List.of(items));
        }

        public Builder quantity(Integer quantity) {
            $.quantity = quantity;
            return this;
        }

        public DistributionStatusCodes build() {
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            $.quantity = Objects.requireNonNull($.quantity, "expected parameter 'quantity' to be non-null");
            return $;
        }
    }

}
