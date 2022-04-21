// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InsightFiltersResourceAwsEc2InstanceIpv6AddressGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InsightFiltersResourceAwsEc2InstanceIpv6AddressGetArgs Empty = new InsightFiltersResourceAwsEc2InstanceIpv6AddressGetArgs();

    /**
     * A finding&#39;s CIDR value.
     * 
     */
    @Import(name="cidr", required=true)
    private Output<String> cidr;

    public Output<String> cidr() {
        return this.cidr;
    }

    private InsightFiltersResourceAwsEc2InstanceIpv6AddressGetArgs() {}

    private InsightFiltersResourceAwsEc2InstanceIpv6AddressGetArgs(InsightFiltersResourceAwsEc2InstanceIpv6AddressGetArgs $) {
        this.cidr = $.cidr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InsightFiltersResourceAwsEc2InstanceIpv6AddressGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InsightFiltersResourceAwsEc2InstanceIpv6AddressGetArgs $;

        public Builder() {
            $ = new InsightFiltersResourceAwsEc2InstanceIpv6AddressGetArgs();
        }

        public Builder(InsightFiltersResourceAwsEc2InstanceIpv6AddressGetArgs defaults) {
            $ = new InsightFiltersResourceAwsEc2InstanceIpv6AddressGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder cidr(Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        public InsightFiltersResourceAwsEc2InstanceIpv6AddressGetArgs build() {
            $.cidr = Objects.requireNonNull($.cidr, "expected parameter 'cidr' to be non-null");
            return $;
        }
    }

}
