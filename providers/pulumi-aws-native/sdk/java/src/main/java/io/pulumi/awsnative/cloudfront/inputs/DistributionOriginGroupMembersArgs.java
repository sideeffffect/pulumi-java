// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.DistributionOriginGroupMemberArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class DistributionOriginGroupMembersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginGroupMembersArgs Empty = new DistributionOriginGroupMembersArgs();

    @InputImport(name="items", required=true)
      private final Input<List<DistributionOriginGroupMemberArgs>> items;

    public Input<List<DistributionOriginGroupMemberArgs>> getItems() {
        return this.items;
    }

    @InputImport(name="quantity", required=true)
      private final Input<Integer> quantity;

    public Input<Integer> getQuantity() {
        return this.quantity;
    }

    public DistributionOriginGroupMembersArgs(
        Input<List<DistributionOriginGroupMemberArgs>> items,
        Input<Integer> quantity) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.quantity = Objects.requireNonNull(quantity, "expected parameter 'quantity' to be non-null");
    }

    private DistributionOriginGroupMembersArgs() {
        this.items = Input.empty();
        this.quantity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroupMembersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<DistributionOriginGroupMemberArgs>> items;
        private Input<Integer> quantity;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroupMembersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.quantity = defaults.quantity;
        }

        public Builder items(Input<List<DistributionOriginGroupMemberArgs>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder items(List<DistributionOriginGroupMemberArgs> items) {
            this.items = Input.of(Objects.requireNonNull(items));
            return this;
        }

        public Builder quantity(Input<Integer> quantity) {
            this.quantity = Objects.requireNonNull(quantity);
            return this;
        }

        public Builder quantity(Integer quantity) {
            this.quantity = Input.of(Objects.requireNonNull(quantity));
            return this;
        }
        public DistributionOriginGroupMembersArgs build() {
            return new DistributionOriginGroupMembersArgs(items, quantity);
        }
    }
}
