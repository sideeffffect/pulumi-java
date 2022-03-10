// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway.inputs;

import io.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentFilter;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDirectConnectGatewayAttachmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDirectConnectGatewayAttachmentArgs Empty = new GetDirectConnectGatewayAttachmentArgs();

    /**
     * Identifier of the Direct Connect Gateway.
     * 
     */
    @InputImport(name="dxGatewayId")
      private final @Nullable String dxGatewayId;

    public Optional<String> getDxGatewayId() {
        return this.dxGatewayId == null ? Optional.empty() : Optional.ofNullable(this.dxGatewayId);
    }

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @InputImport(name="filters")
      private final @Nullable List<GetDirectConnectGatewayAttachmentFilter> filters;

    public List<GetDirectConnectGatewayAttachmentFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * A map of tags, each pair of which must exactly match a pair on the desired Transit Gateway Direct Connect Gateway Attachment.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * Identifier of the EC2 Transit Gateway.
     * 
     */
    @InputImport(name="transitGatewayId")
      private final @Nullable String transitGatewayId;

    public Optional<String> getTransitGatewayId() {
        return this.transitGatewayId == null ? Optional.empty() : Optional.ofNullable(this.transitGatewayId);
    }

    public GetDirectConnectGatewayAttachmentArgs(
        @Nullable String dxGatewayId,
        @Nullable List<GetDirectConnectGatewayAttachmentFilter> filters,
        @Nullable Map<String,String> tags,
        @Nullable String transitGatewayId) {
        this.dxGatewayId = dxGatewayId;
        this.filters = filters;
        this.tags = tags;
        this.transitGatewayId = transitGatewayId;
    }

    private GetDirectConnectGatewayAttachmentArgs() {
        this.dxGatewayId = null;
        this.filters = List.of();
        this.tags = Map.of();
        this.transitGatewayId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDirectConnectGatewayAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dxGatewayId;
        private @Nullable List<GetDirectConnectGatewayAttachmentFilter> filters;
        private @Nullable Map<String,String> tags;
        private @Nullable String transitGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDirectConnectGatewayAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dxGatewayId = defaults.dxGatewayId;
    	      this.filters = defaults.filters;
    	      this.tags = defaults.tags;
    	      this.transitGatewayId = defaults.transitGatewayId;
        }

        public Builder dxGatewayId(@Nullable String dxGatewayId) {
            this.dxGatewayId = dxGatewayId;
            return this;
        }

        public Builder filters(@Nullable List<GetDirectConnectGatewayAttachmentFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder transitGatewayId(@Nullable String transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }
        public GetDirectConnectGatewayAttachmentArgs build() {
            return new GetDirectConnectGatewayAttachmentArgs(dxGatewayId, filters, tags, transitGatewayId);
        }
    }
}
