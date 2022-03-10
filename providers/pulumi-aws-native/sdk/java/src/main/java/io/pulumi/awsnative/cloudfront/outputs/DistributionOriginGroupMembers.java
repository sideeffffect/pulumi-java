// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.awsnative.cloudfront.outputs.DistributionOriginGroupMember;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DistributionOriginGroupMembers {
    private final List<DistributionOriginGroupMember> items;
    private final Integer quantity;

    @OutputCustomType.Constructor
    private DistributionOriginGroupMembers(
        @OutputCustomType.Parameter("items") List<DistributionOriginGroupMember> items,
        @OutputCustomType.Parameter("quantity") Integer quantity) {
        this.items = items;
        this.quantity = quantity;
    }

    public List<DistributionOriginGroupMember> getItems() {
        return this.items;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroupMembers defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DistributionOriginGroupMember> items;
        private Integer quantity;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroupMembers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.quantity = defaults.quantity;
        }

        public Builder items(List<DistributionOriginGroupMember> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder quantity(Integer quantity) {
            this.quantity = Objects.requireNonNull(quantity);
            return this;
        }
        public DistributionOriginGroupMembers build() {
            return new DistributionOriginGroupMembers(items, quantity);
        }
    }
}
