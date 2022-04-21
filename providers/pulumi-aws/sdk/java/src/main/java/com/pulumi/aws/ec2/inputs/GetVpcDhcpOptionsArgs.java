// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcDhcpOptionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcDhcpOptionsArgs Empty = new GetVpcDhcpOptionsArgs();

    /**
     * The EC2 DHCP Options ID.
     * 
     */
    @Import(name="dhcpOptionsId")
    private @Nullable String dhcpOptionsId;

    public Optional<String> dhcpOptionsId() {
        return Optional.ofNullable(this.dhcpOptionsId);
    }

    /**
     * List of custom filters as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetVpcDhcpOptionsFilter> filters;

    public Optional<List<GetVpcDhcpOptionsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A map of tags assigned to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetVpcDhcpOptionsArgs() {}

    private GetVpcDhcpOptionsArgs(GetVpcDhcpOptionsArgs $) {
        this.dhcpOptionsId = $.dhcpOptionsId;
        this.filters = $.filters;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcDhcpOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcDhcpOptionsArgs $;

        public Builder() {
            $ = new GetVpcDhcpOptionsArgs();
        }

        public Builder(GetVpcDhcpOptionsArgs defaults) {
            $ = new GetVpcDhcpOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder dhcpOptionsId(@Nullable String dhcpOptionsId) {
            $.dhcpOptionsId = dhcpOptionsId;
            return this;
        }

        public Builder filters(@Nullable List<GetVpcDhcpOptionsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetVpcDhcpOptionsFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetVpcDhcpOptionsArgs build() {
            return $;
        }
    }

}
