// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetVpnGatewayFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpnGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpnGatewayArgs Empty = new GetVpnGatewayArgs();

    /**
     * The Autonomous System Number (ASN) for the Amazon side of the specific VPN Gateway to retrieve.
     * 
     */
    @Import(name="amazonSideAsn")
      private final @Nullable String amazonSideAsn;

    public Optional<String> amazonSideAsn() {
        return this.amazonSideAsn == null ? Optional.empty() : Optional.ofNullable(this.amazonSideAsn);
    }

    /**
     * The ID of a VPC attached to the specific VPN Gateway to retrieve.
     * 
     */
    @Import(name="attachedVpcId")
      private final @Nullable String attachedVpcId;

    public Optional<String> attachedVpcId() {
        return this.attachedVpcId == null ? Optional.empty() : Optional.ofNullable(this.attachedVpcId);
    }

    /**
     * The Availability Zone of the specific VPN Gateway to retrieve.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable String availabilityZone;

    public Optional<String> availabilityZone() {
        return this.availabilityZone == null ? Optional.empty() : Optional.ofNullable(this.availabilityZone);
    }

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetVpnGatewayFilter> filters;

    public List<GetVpnGatewayFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * The ID of the specific VPN Gateway to retrieve.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The state of the specific VPN Gateway to retrieve.
     * 
     */
    @Import(name="state")
      private final @Nullable String state;

    public Optional<String> state() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired VPN Gateway.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetVpnGatewayArgs(
        @Nullable String amazonSideAsn,
        @Nullable String attachedVpcId,
        @Nullable String availabilityZone,
        @Nullable List<GetVpnGatewayFilter> filters,
        @Nullable String id,
        @Nullable String state,
        @Nullable Map<String,String> tags) {
        this.amazonSideAsn = amazonSideAsn;
        this.attachedVpcId = attachedVpcId;
        this.availabilityZone = availabilityZone;
        this.filters = filters;
        this.id = id;
        this.state = state;
        this.tags = tags;
    }

    private GetVpnGatewayArgs() {
        this.amazonSideAsn = null;
        this.attachedVpcId = null;
        this.availabilityZone = null;
        this.filters = List.of();
        this.id = null;
        this.state = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String amazonSideAsn;
        private @Nullable String attachedVpcId;
        private @Nullable String availabilityZone;
        private @Nullable List<GetVpnGatewayFilter> filters;
        private @Nullable String id;
        private @Nullable String state;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpnGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonSideAsn = defaults.amazonSideAsn;
    	      this.attachedVpcId = defaults.attachedVpcId;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        public Builder amazonSideAsn(@Nullable String amazonSideAsn) {
            this.amazonSideAsn = amazonSideAsn;
            return this;
        }
        public Builder attachedVpcId(@Nullable String attachedVpcId) {
            this.attachedVpcId = attachedVpcId;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder filters(@Nullable List<GetVpnGatewayFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetVpnGatewayFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetVpnGatewayArgs build() {
            return new GetVpnGatewayArgs(amazonSideAsn, attachedVpcId, availabilityZone, filters, id, state, tags);
        }
    }
}
