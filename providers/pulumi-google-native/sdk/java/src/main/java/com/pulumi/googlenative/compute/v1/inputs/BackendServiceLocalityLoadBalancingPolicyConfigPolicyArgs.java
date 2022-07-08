// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.v1.enums.BackendServiceLocalityLoadBalancingPolicyConfigPolicyName;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration for a built-in load balancing policy.
 * 
 */
public final class BackendServiceLocalityLoadBalancingPolicyConfigPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceLocalityLoadBalancingPolicyConfigPolicyArgs Empty = new BackendServiceLocalityLoadBalancingPolicyConfigPolicyArgs();

    /**
     * The name of a locality load balancer policy to be used. The value should be one of the predefined ones as supported by localityLbPolicy, although at the moment only ROUND_ROBIN is supported. This field should only be populated when the customPolicy field is not used. Note that specifying the same policy more than once for a backend is not a valid configuration and will be rejected.
     * 
     */
    @Import(name="name")
    private @Nullable Output<BackendServiceLocalityLoadBalancingPolicyConfigPolicyName> name;

    /**
     * @return The name of a locality load balancer policy to be used. The value should be one of the predefined ones as supported by localityLbPolicy, although at the moment only ROUND_ROBIN is supported. This field should only be populated when the customPolicy field is not used. Note that specifying the same policy more than once for a backend is not a valid configuration and will be rejected.
     * 
     */
    public Optional<Output<BackendServiceLocalityLoadBalancingPolicyConfigPolicyName>> name() {
        return Optional.ofNullable(this.name);
    }

    private BackendServiceLocalityLoadBalancingPolicyConfigPolicyArgs() {}

    private BackendServiceLocalityLoadBalancingPolicyConfigPolicyArgs(BackendServiceLocalityLoadBalancingPolicyConfigPolicyArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceLocalityLoadBalancingPolicyConfigPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceLocalityLoadBalancingPolicyConfigPolicyArgs $;

        public Builder() {
            $ = new BackendServiceLocalityLoadBalancingPolicyConfigPolicyArgs();
        }

        public Builder(BackendServiceLocalityLoadBalancingPolicyConfigPolicyArgs defaults) {
            $ = new BackendServiceLocalityLoadBalancingPolicyConfigPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of a locality load balancer policy to be used. The value should be one of the predefined ones as supported by localityLbPolicy, although at the moment only ROUND_ROBIN is supported. This field should only be populated when the customPolicy field is not used. Note that specifying the same policy more than once for a backend is not a valid configuration and will be rejected.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<BackendServiceLocalityLoadBalancingPolicyConfigPolicyName> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of a locality load balancer policy to be used. The value should be one of the predefined ones as supported by localityLbPolicy, although at the moment only ROUND_ROBIN is supported. This field should only be populated when the customPolicy field is not used. Note that specifying the same policy more than once for a backend is not a valid configuration and will be rejected.
         * 
         * @return builder
         * 
         */
        public Builder name(BackendServiceLocalityLoadBalancingPolicyConfigPolicyName name) {
            return name(Output.of(name));
        }

        public BackendServiceLocalityLoadBalancingPolicyConfigPolicyArgs build() {
            return $;
        }
    }

}
