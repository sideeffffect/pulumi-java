// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDnsResolverPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDnsResolverPlainArgs Empty = new GetDnsResolverPlainArgs();

    /**
     * The name of the DNS resolver.
     * 
     */
    @Import(name="dnsResolverName", required=true)
    private String dnsResolverName;

    /**
     * @return The name of the DNS resolver.
     * 
     */
    public String dnsResolverName() {
        return this.dnsResolverName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDnsResolverPlainArgs() {}

    private GetDnsResolverPlainArgs(GetDnsResolverPlainArgs $) {
        this.dnsResolverName = $.dnsResolverName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDnsResolverPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDnsResolverPlainArgs $;

        public Builder() {
            $ = new GetDnsResolverPlainArgs();
        }

        public Builder(GetDnsResolverPlainArgs defaults) {
            $ = new GetDnsResolverPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsResolverName The name of the DNS resolver.
         * 
         * @return builder
         * 
         */
        public Builder dnsResolverName(String dnsResolverName) {
            $.dnsResolverName = dnsResolverName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetDnsResolverPlainArgs build() {
            $.dnsResolverName = Objects.requireNonNull($.dnsResolverName, "expected parameter 'dnsResolverName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
