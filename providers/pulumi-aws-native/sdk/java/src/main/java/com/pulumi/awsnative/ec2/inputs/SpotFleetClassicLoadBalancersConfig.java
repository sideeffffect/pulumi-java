// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.awsnative.ec2.inputs.SpotFleetClassicLoadBalancer;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class SpotFleetClassicLoadBalancersConfig extends com.pulumi.resources.InvokeArgs {

    public static final SpotFleetClassicLoadBalancersConfig Empty = new SpotFleetClassicLoadBalancersConfig();

    @Import(name="classicLoadBalancers", required=true)
    private List<SpotFleetClassicLoadBalancer> classicLoadBalancers;

    public List<SpotFleetClassicLoadBalancer> classicLoadBalancers() {
        return this.classicLoadBalancers;
    }

    private SpotFleetClassicLoadBalancersConfig() {}

    private SpotFleetClassicLoadBalancersConfig(SpotFleetClassicLoadBalancersConfig $) {
        this.classicLoadBalancers = $.classicLoadBalancers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotFleetClassicLoadBalancersConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotFleetClassicLoadBalancersConfig $;

        public Builder() {
            $ = new SpotFleetClassicLoadBalancersConfig();
        }

        public Builder(SpotFleetClassicLoadBalancersConfig defaults) {
            $ = new SpotFleetClassicLoadBalancersConfig(Objects.requireNonNull(defaults));
        }

        public Builder classicLoadBalancers(List<SpotFleetClassicLoadBalancer> classicLoadBalancers) {
            $.classicLoadBalancers = classicLoadBalancers;
            return this;
        }

        public Builder classicLoadBalancers(SpotFleetClassicLoadBalancer... classicLoadBalancers) {
            return classicLoadBalancers(List.of(classicLoadBalancers));
        }

        public SpotFleetClassicLoadBalancersConfig build() {
            $.classicLoadBalancers = Objects.requireNonNull($.classicLoadBalancers, "expected parameter 'classicLoadBalancers' to be non-null");
            return $;
        }
    }

}
