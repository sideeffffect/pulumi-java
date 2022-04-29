// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InstanceGroupManagerAutoHealingPoliciesArgs extends ResourceArgs {

    public static final InstanceGroupManagerAutoHealingPoliciesArgs Empty = new InstanceGroupManagerAutoHealingPoliciesArgs();

    /**
     * The health check resource that signals autohealing.
     * 
     */
    @Import(name="healthCheck", required=true)
    private Output<String> healthCheck;

    /**
     * @return The health check resource that signals autohealing.
     * 
     */
    public Output<String> healthCheck() {
        return this.healthCheck;
    }

    /**
     * The number of seconds that the managed instance group waits before
     * it applies autohealing policies to new instances or recently recreated instances. Between 0 and 3600.
     * 
     */
    @Import(name="initialDelaySec", required=true)
    private Output<Integer> initialDelaySec;

    /**
     * @return The number of seconds that the managed instance group waits before
     * it applies autohealing policies to new instances or recently recreated instances. Between 0 and 3600.
     * 
     */
    public Output<Integer> initialDelaySec() {
        return this.initialDelaySec;
    }

    private InstanceGroupManagerAutoHealingPoliciesArgs() {}

    private InstanceGroupManagerAutoHealingPoliciesArgs(InstanceGroupManagerAutoHealingPoliciesArgs $) {
        this.healthCheck = $.healthCheck;
        this.initialDelaySec = $.initialDelaySec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerAutoHealingPoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerAutoHealingPoliciesArgs $;

        public Builder() {
            $ = new InstanceGroupManagerAutoHealingPoliciesArgs();
        }

        public Builder(InstanceGroupManagerAutoHealingPoliciesArgs defaults) {
            $ = new InstanceGroupManagerAutoHealingPoliciesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param healthCheck The health check resource that signals autohealing.
         * 
         * @return builder
         * 
         */
        public Builder healthCheck(Output<String> healthCheck) {
            $.healthCheck = healthCheck;
            return this;
        }

        /**
         * @param healthCheck The health check resource that signals autohealing.
         * 
         * @return builder
         * 
         */
        public Builder healthCheck(String healthCheck) {
            return healthCheck(Output.of(healthCheck));
        }

        /**
         * @param initialDelaySec The number of seconds that the managed instance group waits before
         * it applies autohealing policies to new instances or recently recreated instances. Between 0 and 3600.
         * 
         * @return builder
         * 
         */
        public Builder initialDelaySec(Output<Integer> initialDelaySec) {
            $.initialDelaySec = initialDelaySec;
            return this;
        }

        /**
         * @param initialDelaySec The number of seconds that the managed instance group waits before
         * it applies autohealing policies to new instances or recently recreated instances. Between 0 and 3600.
         * 
         * @return builder
         * 
         */
        public Builder initialDelaySec(Integer initialDelaySec) {
            return initialDelaySec(Output.of(initialDelaySec));
        }

        public InstanceGroupManagerAutoHealingPoliciesArgs build() {
            $.healthCheck = Objects.requireNonNull($.healthCheck, "expected parameter 'healthCheck' to be non-null");
            $.initialDelaySec = Objects.requireNonNull($.initialDelaySec, "expected parameter 'initialDelaySec' to be non-null");
            return $;
        }
    }

}
