// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elb.inputs;

import com.pulumi.aws.elb.inputs.LoadBalancerPolicyPolicyAttributeGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerPolicyState Empty = new LoadBalancerPolicyState();

    /**
     * The load balancer on which the policy is defined.
     * 
     */
    @Import(name="loadBalancerName")
    private @Nullable Output<String> loadBalancerName;

    public Optional<Output<String>> loadBalancerName() {
        return Optional.ofNullable(this.loadBalancerName);
    }

    /**
     * Policy attribute to apply to the policy.
     * 
     */
    @Import(name="policyAttributes")
    private @Nullable Output<List<LoadBalancerPolicyPolicyAttributeGetArgs>> policyAttributes;

    public Optional<Output<List<LoadBalancerPolicyPolicyAttributeGetArgs>>> policyAttributes() {
        return Optional.ofNullable(this.policyAttributes);
    }

    /**
     * The name of the load balancer policy.
     * 
     */
    @Import(name="policyName")
    private @Nullable Output<String> policyName;

    public Optional<Output<String>> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    /**
     * The policy type.
     * 
     */
    @Import(name="policyTypeName")
    private @Nullable Output<String> policyTypeName;

    public Optional<Output<String>> policyTypeName() {
        return Optional.ofNullable(this.policyTypeName);
    }

    private LoadBalancerPolicyState() {}

    private LoadBalancerPolicyState(LoadBalancerPolicyState $) {
        this.loadBalancerName = $.loadBalancerName;
        this.policyAttributes = $.policyAttributes;
        this.policyName = $.policyName;
        this.policyTypeName = $.policyTypeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerPolicyState $;

        public Builder() {
            $ = new LoadBalancerPolicyState();
        }

        public Builder(LoadBalancerPolicyState defaults) {
            $ = new LoadBalancerPolicyState(Objects.requireNonNull(defaults));
        }

        public Builder loadBalancerName(@Nullable Output<String> loadBalancerName) {
            $.loadBalancerName = loadBalancerName;
            return this;
        }

        public Builder loadBalancerName(String loadBalancerName) {
            return loadBalancerName(Output.of(loadBalancerName));
        }

        public Builder policyAttributes(@Nullable Output<List<LoadBalancerPolicyPolicyAttributeGetArgs>> policyAttributes) {
            $.policyAttributes = policyAttributes;
            return this;
        }

        public Builder policyAttributes(List<LoadBalancerPolicyPolicyAttributeGetArgs> policyAttributes) {
            return policyAttributes(Output.of(policyAttributes));
        }

        public Builder policyAttributes(LoadBalancerPolicyPolicyAttributeGetArgs... policyAttributes) {
            return policyAttributes(List.of(policyAttributes));
        }

        public Builder policyName(@Nullable Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        public Builder policyTypeName(@Nullable Output<String> policyTypeName) {
            $.policyTypeName = policyTypeName;
            return this;
        }

        public Builder policyTypeName(String policyTypeName) {
            return policyTypeName(Output.of(policyTypeName));
        }

        public LoadBalancerPolicyState build() {
            return $;
        }
    }

}
