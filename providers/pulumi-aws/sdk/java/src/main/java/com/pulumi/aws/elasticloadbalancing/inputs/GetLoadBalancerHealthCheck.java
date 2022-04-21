// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancing.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetLoadBalancerHealthCheck extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerHealthCheck Empty = new GetLoadBalancerHealthCheck();

    @Import(name="healthyThreshold", required=true)
    private Integer healthyThreshold;

    public Integer healthyThreshold() {
        return this.healthyThreshold;
    }

    @Import(name="interval", required=true)
    private Integer interval;

    public Integer interval() {
        return this.interval;
    }

    @Import(name="target", required=true)
    private String target;

    public String target() {
        return this.target;
    }

    @Import(name="timeout", required=true)
    private Integer timeout;

    public Integer timeout() {
        return this.timeout;
    }

    @Import(name="unhealthyThreshold", required=true)
    private Integer unhealthyThreshold;

    public Integer unhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    private GetLoadBalancerHealthCheck() {}

    private GetLoadBalancerHealthCheck(GetLoadBalancerHealthCheck $) {
        this.healthyThreshold = $.healthyThreshold;
        this.interval = $.interval;
        this.target = $.target;
        this.timeout = $.timeout;
        this.unhealthyThreshold = $.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadBalancerHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancerHealthCheck $;

        public Builder() {
            $ = new GetLoadBalancerHealthCheck();
        }

        public Builder(GetLoadBalancerHealthCheck defaults) {
            $ = new GetLoadBalancerHealthCheck(Objects.requireNonNull(defaults));
        }

        public Builder healthyThreshold(Integer healthyThreshold) {
            $.healthyThreshold = healthyThreshold;
            return this;
        }

        public Builder interval(Integer interval) {
            $.interval = interval;
            return this;
        }

        public Builder target(String target) {
            $.target = target;
            return this;
        }

        public Builder timeout(Integer timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            $.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public GetLoadBalancerHealthCheck build() {
            $.healthyThreshold = Objects.requireNonNull($.healthyThreshold, "expected parameter 'healthyThreshold' to be non-null");
            $.interval = Objects.requireNonNull($.interval, "expected parameter 'interval' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            $.timeout = Objects.requireNonNull($.timeout, "expected parameter 'timeout' to be non-null");
            $.unhealthyThreshold = Objects.requireNonNull($.unhealthyThreshold, "expected parameter 'unhealthyThreshold' to be non-null");
            return $;
        }
    }

}
