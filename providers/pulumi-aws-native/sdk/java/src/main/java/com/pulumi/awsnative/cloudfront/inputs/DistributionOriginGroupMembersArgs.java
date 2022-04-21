// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.awsnative.cloudfront.inputs.DistributionOriginGroupMemberArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class DistributionOriginGroupMembersArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionOriginGroupMembersArgs Empty = new DistributionOriginGroupMembersArgs();

    @Import(name="items", required=true)
    private Output<List<DistributionOriginGroupMemberArgs>> items;

    public Output<List<DistributionOriginGroupMemberArgs>> items() {
        return this.items;
    }

    @Import(name="quantity", required=true)
    private Output<Integer> quantity;

    public Output<Integer> quantity() {
        return this.quantity;
    }

    private DistributionOriginGroupMembersArgs() {}

    private DistributionOriginGroupMembersArgs(DistributionOriginGroupMembersArgs $) {
        this.items = $.items;
        this.quantity = $.quantity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionOriginGroupMembersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOriginGroupMembersArgs $;

        public Builder() {
            $ = new DistributionOriginGroupMembersArgs();
        }

        public Builder(DistributionOriginGroupMembersArgs defaults) {
            $ = new DistributionOriginGroupMembersArgs(Objects.requireNonNull(defaults));
        }

        public Builder items(Output<List<DistributionOriginGroupMemberArgs>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<DistributionOriginGroupMemberArgs> items) {
            return items(Output.of(items));
        }

        public Builder items(DistributionOriginGroupMemberArgs... items) {
            return items(List.of(items));
        }

        public Builder quantity(Output<Integer> quantity) {
            $.quantity = quantity;
            return this;
        }

        public Builder quantity(Integer quantity) {
            return quantity(Output.of(quantity));
        }

        public DistributionOriginGroupMembersArgs build() {
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            $.quantity = Objects.requireNonNull($.quantity, "expected parameter 'quantity' to be non-null");
            return $;
        }
    }

}
