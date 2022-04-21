// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LifecyclePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyArgs Empty = new LifecyclePolicyArgs();

    /**
     * The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs.
     * 
     */
    @Import(name="policy", required=true)
    private Output<String> policy;

    public Output<String> policy() {
        return this.policy;
    }

    /**
     * Name of the repository to apply the policy.
     * 
     */
    @Import(name="repository", required=true)
    private Output<String> repository;

    public Output<String> repository() {
        return this.repository;
    }

    private LifecyclePolicyArgs() {}

    private LifecyclePolicyArgs(LifecyclePolicyArgs $) {
        this.policy = $.policy;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LifecyclePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LifecyclePolicyArgs $;

        public Builder() {
            $ = new LifecyclePolicyArgs();
        }

        public Builder(LifecyclePolicyArgs defaults) {
            $ = new LifecyclePolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder policy(Output<String> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public Builder repository(Output<String> repository) {
            $.repository = repository;
            return this;
        }

        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public LifecyclePolicyArgs build() {
            $.policy = Objects.requireNonNull($.policy, "expected parameter 'policy' to be non-null");
            $.repository = Objects.requireNonNull($.repository, "expected parameter 'repository' to be non-null");
            return $;
        }
    }

}
