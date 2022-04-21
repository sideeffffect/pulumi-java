// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RecordLatencyRoutingPolicyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RecordLatencyRoutingPolicyGetArgs Empty = new RecordLatencyRoutingPolicyGetArgs();

    /**
     * An AWS region from which to measure latency. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-latency
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    private RecordLatencyRoutingPolicyGetArgs() {}

    private RecordLatencyRoutingPolicyGetArgs(RecordLatencyRoutingPolicyGetArgs $) {
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecordLatencyRoutingPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecordLatencyRoutingPolicyGetArgs $;

        public Builder() {
            $ = new RecordLatencyRoutingPolicyGetArgs();
        }

        public Builder(RecordLatencyRoutingPolicyGetArgs defaults) {
            $ = new RecordLatencyRoutingPolicyGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public RecordLatencyRoutingPolicyGetArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
