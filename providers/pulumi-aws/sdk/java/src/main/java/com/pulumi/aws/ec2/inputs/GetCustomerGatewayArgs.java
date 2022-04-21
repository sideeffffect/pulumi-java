// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetCustomerGatewayFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCustomerGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomerGatewayArgs Empty = new GetCustomerGatewayArgs();

    /**
     * One or more [name-value pairs][dcg-filters] to filter by.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetCustomerGatewayFilter> filters;

    public Optional<List<GetCustomerGatewayFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The ID of the gateway.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Map of key-value pairs assigned to the gateway.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetCustomerGatewayArgs() {}

    private GetCustomerGatewayArgs(GetCustomerGatewayArgs $) {
        this.filters = $.filters;
        this.id = $.id;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomerGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomerGatewayArgs $;

        public Builder() {
            $ = new GetCustomerGatewayArgs();
        }

        public Builder(GetCustomerGatewayArgs defaults) {
            $ = new GetCustomerGatewayArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetCustomerGatewayFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetCustomerGatewayFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetCustomerGatewayArgs build() {
            return $;
        }
    }

}
