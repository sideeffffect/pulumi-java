// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetNetworkInterfacesFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkInterfacesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkInterfacesArgs Empty = new GetNetworkInterfacesArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetNetworkInterfacesFilter> filters;

    public Optional<List<GetNetworkInterfacesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired network interfaces.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetNetworkInterfacesArgs() {}

    private GetNetworkInterfacesArgs(GetNetworkInterfacesArgs $) {
        this.filters = $.filters;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkInterfacesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkInterfacesArgs $;

        public Builder() {
            $ = new GetNetworkInterfacesArgs();
        }

        public Builder(GetNetworkInterfacesArgs defaults) {
            $ = new GetNetworkInterfacesArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetNetworkInterfacesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetNetworkInterfacesFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetNetworkInterfacesArgs build() {
            return $;
        }
    }

}
